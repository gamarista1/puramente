package com.facebook.react.fabric.mounting;

import M7.b;
import U5.a;
import android.os.SystemClock;
import com.facebook.react.bridge.ReactIgnorableMountingException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import z8.C4236a;

public class MountItemDispatcher {
    private static final long FRAME_TIME_NS = 16666666;
    private static final String TAG = "MountItemDispatcher";
    private long mBatchedExecutionTime = 0;
    private boolean mInDispatch = false;
    private boolean mIsPremountScheduled = false;
    private final ItemDispatchListener mItemDispatchListener;
    private long mLastFrameTimeNanos = 0;
    private final ConcurrentLinkedQueue<MountItem> mMountItems = new ConcurrentLinkedQueue<>();
    private final MountingManager mMountingManager;
    private final ConcurrentLinkedQueue<MountItem> mPreMountItems = new ConcurrentLinkedQueue<>();
    private final Runnable mPremountRunnable = new a(this);
    private long mRunStartTime = 0;
    private final ConcurrentLinkedQueue<DispatchCommandMountItem> mViewCommandMountItems = new ConcurrentLinkedQueue<>();

    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<MountItem> list);

        void willMountItems(List<MountItem> list);
    }

    public MountItemDispatcher(MountingManager mountingManager, ItemDispatchListener itemDispatchListener) {
        this.mMountingManager = mountingManager;
        this.mItemDispatchListener = itemDispatchListener;
    }

    /* JADX INFO: finally extract failed */
    private void dispatchPreMountItemsImpl(long j10) {
        C4236a.c(0, "MountItemDispatcher::premountViews");
        this.mInDispatch = true;
        while (true) {
            try {
                if (System.nanoTime() > j10) {
                    break;
                }
                MountItem poll = this.mPreMountItems.poll();
                if (poll == null) {
                    break;
                }
                if (b.h()) {
                    printMountItem(poll, "dispatchPreMountItems");
                }
                executeOrEnqueue(poll);
            } catch (Throwable th2) {
                this.mInDispatch = false;
                throw th2;
            }
        }
        this.mInDispatch = false;
        C4236a.i(0);
    }

    private static <E> List<E> drainConcurrentItemQueue(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            E poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void executeOrEnqueue(MountItem mountItem) {
        if (this.mMountingManager.isWaitingForViewAttach(mountItem.getSurfaceId())) {
            if (b.h()) {
                a.o(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.getSurfaceId()));
            }
            this.mMountingManager.getSurfaceManager(mountItem.getSurfaceId()).scheduleMountItemOnViewAttach(mountItem);
            return;
        }
        mountItem.execute(this.mMountingManager);
    }

    private List<MountItem> getAndResetMountItems() {
        return drainConcurrentItemQueue(this.mMountItems);
    }

    private List<MountItem> getAndResetPreMountItems() {
        return drainConcurrentItemQueue(this.mPreMountItems);
    }

    private List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return drainConcurrentItemQueue(this.mViewCommandMountItems);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mIsPremountScheduled = false;
        if (!this.mPreMountItems.isEmpty()) {
            dispatchPreMountItemsImpl(this.mLastFrameTimeNanos + 8333333);
        }
    }

    private static void printMountItem(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            a.m(TAG, str + ": " + str2);
        }
    }

    public void addMountItem(MountItem mountItem) {
        this.mMountItems.add(mountItem);
    }

    public void addPreAllocateMountItem(MountItem mountItem) {
        if (!this.mMountingManager.surfaceIsStopped(mountItem.getSurfaceId())) {
            this.mPreMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            a.o(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.getSurfaceId()), mountItem.toString());
        }
    }

    public void addViewCommandMountItem(DispatchCommandMountItem dispatchCommandMountItem) {
        this.mViewCommandMountItems.add(dispatchCommandMountItem);
    }

    public void dispatchMountItems(Queue<MountItem> queue) {
        while (!queue.isEmpty()) {
            MountItem poll = queue.poll();
            try {
                poll.execute(this.mMountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (poll instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) poll;
                    if (dispatchCommandMountItem.getRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    printMountItem(poll, "dispatchExternalMountItems: mounting failed with " + e10.getMessage());
                }
            }
        }
    }

    public void dispatchPreMountItems(long j10) {
        this.mLastFrameTimeNanos = j10;
        if (!this.mPreMountItems.isEmpty()) {
            if (!b.l()) {
                dispatchPreMountItemsImpl(this.mLastFrameTimeNanos + 8333333);
            } else if (!this.mIsPremountScheduled) {
                this.mIsPremountScheduled = true;
                UiThreadUtil.getUiThreadHandler().post(this.mPremountRunnable);
            }
        }
    }

    public long getBatchedExecutionTime() {
        return this.mBatchedExecutionTime;
    }

    public long getRunStartTime() {
        return this.mRunStartTime;
    }

    /* JADX INFO: finally extract failed */
    public void tryDispatchMountItems() {
        if (!this.mInDispatch) {
            this.mInDispatch = true;
            try {
                dispatchMountItems();
                this.mInDispatch = false;
                this.mItemDispatchListener.didDispatchMountItems();
            } catch (Throwable th2) {
                this.mInDispatch = false;
                throw th2;
            }
        }
    }

    private void dispatchMountItems() {
        SurfaceMountingManager surfaceManager;
        this.mBatchedExecutionTime = 0;
        this.mRunStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems != null || andResetViewCommandMountItems != null) {
            this.mItemDispatchListener.willMountItems(andResetMountItems);
            if (andResetViewCommandMountItems != null) {
                C4236a.c(0, "MountItemDispatcher::mountViews viewCommandMountItems");
                for (DispatchCommandMountItem next : andResetViewCommandMountItems) {
                    if (b.h()) {
                        printMountItem(next, "dispatchMountItems: Executing viewCommandMountItem");
                    }
                    try {
                        executeOrEnqueue(next);
                    } catch (RetryableMountingLayerException e10) {
                        if (next.getRetries() == 0) {
                            next.incrementRetries();
                            addViewCommandMountItem(next);
                        } else {
                            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + next.toString(), e10));
                        }
                    } catch (Throwable th2) {
                        ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + next.toString(), th2));
                    }
                }
                C4236a.i(0);
            }
            List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
            if (andResetPreMountItems != null) {
                C4236a.c(0, "MountItemDispatcher::mountViews preMountItems");
                for (MountItem next2 : andResetPreMountItems) {
                    if (b.h()) {
                        printMountItem(next2, "dispatchMountItems: Executing preMountItem");
                    }
                    executeOrEnqueue(next2);
                }
                C4236a.i(0);
            }
            if (andResetMountItems != null) {
                C4236a.c(0, "MountItemDispatcher::mountViews mountItems to execute");
                long uptimeMillis = SystemClock.uptimeMillis();
                for (MountItem next3 : andResetMountItems) {
                    if (b.h()) {
                        printMountItem(next3, "dispatchMountItems: Executing mountItem");
                    }
                    try {
                        executeOrEnqueue(next3);
                    } catch (Throwable th3) {
                        a.n(TAG, "dispatchMountItems: caught exception, displaying mount state", th3);
                        for (MountItem next4 : andResetMountItems) {
                            if (next4 == next3) {
                                a.m(TAG, "dispatchMountItems: mountItem: next mountItem triggered exception!");
                            }
                            printMountItem(next4, "dispatchMountItems: mountItem");
                        }
                        if (!(next3.getSurfaceId() == -1 || (surfaceManager = this.mMountingManager.getSurfaceManager(next3.getSurfaceId())) == null)) {
                            surfaceManager.printSurfaceState();
                        }
                        if (ReactIgnorableMountingException.isIgnorable(th3)) {
                            ReactSoftExceptionLogger.logSoftException(TAG, th3);
                        } else {
                            throw th3;
                        }
                    }
                }
                this.mBatchedExecutionTime += SystemClock.uptimeMillis() - uptimeMillis;
                C4236a.i(0);
            }
            this.mItemDispatchListener.didMountItems(andResetMountItems);
        }
    }
}

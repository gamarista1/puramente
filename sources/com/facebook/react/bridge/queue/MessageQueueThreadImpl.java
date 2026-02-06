package com.facebook.react.bridge.queue;

import B7.a;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@a
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;
    private final MessageQueueThreadPerfStats mPerfStats;

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType[] r0 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType = r0
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType r1 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.MAIN_UI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType r1 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.queue.MessageQueueThreadImpl.AnonymousClass1.<clinit>():void");
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) null);
    }

    private static void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j10, long j11) {
        if (messageQueueThreadPerfStats != null) {
            messageQueueThreadPerfStats.wallTime = j10;
            messageQueueThreadPerfStats.cpuTime = j11;
        }
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType[messageQueueThreadSpec.getThreadType().ordinal()];
        if (i10 == 1) {
            return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
        }
        if (i10 == 2) {
            return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
        }
        throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$callOnQueue$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.c(callable.call());
        } catch (Exception e10) {
            simpleSettableFuture.d(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetPerfStats$1() {
        assignToPerfStats(this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$startNewBackgroundThread$2(SimpleSettableFuture simpleSettableFuture) {
        Process.setThreadPriority(-4);
        Looper.prepare();
        MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
        assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
        simpleSettableFuture.c(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
        Looper.loop();
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j10, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        b bVar = new b(simpleSettableFuture);
        new Thread((ThreadGroup) null, bVar, "mqt_" + str, j10).start();
        Pair pair = (Pair) simpleSettableFuture.b();
        return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
    }

    @a
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @a
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new a(simpleSettableFuture, callable));
        return simpleSettableFuture;
    }

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @a
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @a
    public boolean isIdle() {
        return this.mLooper.getQueue().isIdle();
    }

    @a
    public boolean isOnThread() {
        if (this.mLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @a
    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    @a
    public void resetPerfStats() {
        assignToPerfStats(this.mPerfStats, -1, -1);
        runOnQueue(new c(this));
    }

    @a
    public boolean runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            U5.a.I("ReactNative", "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
            return false;
        }
        this.mHandler.post(runnable);
        return true;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        this.mAssertionErrorMessage = "Expected to be called from the '" + getName() + "' thread!";
    }

    @a
    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        SoftAssertions.assertCondition(isOnThread, this.mAssertionErrorMessage + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
    }
}

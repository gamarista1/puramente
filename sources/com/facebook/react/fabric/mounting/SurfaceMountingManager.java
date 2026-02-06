package com.facebook.react.fabric.mounting;

import E7.a;
import M7.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.Z;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3423p;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.r;
import d8.C3480a;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import n7.C3863a;
import z8.C4236a;

public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES = false;
    public static final String TAG = "SurfaceMountingManager";
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private volatile boolean mIsStopped = false;
    private C3480a mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private volatile boolean mRootViewAttached = false;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private Z mTagSetForStoppedSurface;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private C3415h0 mThemedReactContext;
    private B0 mViewManagerRegistry;
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();

    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i10, boolean z10) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i10;
            this.mCanCoalesceEvent = z10;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    static {
        a aVar = a.f30668a;
    }

    public SurfaceMountingManager(int i10, C3480a aVar, B0 b02, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, C3415h0 h0Var) {
        this.mSurfaceId = i10;
        this.mJSResponderHandler = aVar;
        this.mViewManagerRegistry = b02;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = h0Var;
    }

    private void addRootView(View view) {
        if (!isStopped()) {
            this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
            b bVar = new b(this, view);
            if (UiThreadUtil.isOnUiThread()) {
                bVar.run();
            } else {
                UiThreadUtil.runOnUiThread(bVar);
            }
        }
    }

    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private ViewState getNullableViewState(int i10) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i10));
    }

    private static C3423p getViewGroupManager(ViewState viewState) {
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            return (C3423p) viewManager;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i10) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10 + ". Surface stopped: " + isStopped());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addRootView$0(View view) {
        if (!isStopped()) {
            if (view.getId() == this.mSurfaceId) {
                String str = TAG;
                ReactSoftExceptionLogger.logSoftException(str, new r("Race condition in addRootView detected. Trying to set an id of [" + this.mSurfaceId + "] on the RootView, but that id has already been set. "));
            } else if (view.getId() != -1) {
                String str2 = TAG;
                U5.a.o(str2, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
                ReactSoftExceptionLogger.logSoftException(str2, new r("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
            }
            view.setId(this.mSurfaceId);
            if (view instanceof S) {
                ((S) view).setRootViewTag(this.mSurfaceId);
            }
            executeMountItemsOnViewAttach();
            this.mRootViewAttached = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$1() {
        if (b.m()) {
            this.mViewManagerRegistry.i(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new Z();
        for (Map.Entry next : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.k(((Integer) next.getKey()).intValue(), this);
            onViewStateDeleted((ViewState) next.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        String str = TAG;
        U5.a.m(str, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z10) {
        ViewGroup viewGroup2;
        int i10;
        int id2 = viewGroup.getId();
        String str = TAG;
        U5.a.m(str, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            String str2 = TAG;
            U5.a.m(str2, "     <View idx=" + i11 + " tag=" + viewGroup.getChildAt(i11).getId() + " class=" + viewGroup.getChildAt(i11).getClass().toString() + ">");
        }
        String str3 = TAG;
        U5.a.m(str3, "  </ViewGroup tag=" + id2 + ">");
        if (z10) {
            U5.a.m(str3, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 == null) {
                    i10 = -1;
                } else {
                    i10 = viewGroup2.getId();
                }
                String str4 = TAG;
                U5.a.m(str4, "<ViewParent tag=" + i10 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        C3413g0 g0Var = viewState.mStateWrapper;
        if (g0Var != null) {
            g0Var.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (!viewState.mIsRoot && viewManager != null) {
            viewManager.onDropViewInstance(viewState.mView);
        }
    }

    public void addViewAt(int i10, int i11, int i12) {
        int i13;
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            View view = viewState.mView;
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                ViewState viewState2 = getViewState(i11);
                View view2 = viewState2.mView;
                if (view2 != null) {
                    boolean z10 = SHOW_CHANGED_VIEW_HIERARCHIES;
                    if (z10) {
                        U5.a.m(TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " BEFORE");
                        logViewHierarchy(viewGroup, false);
                    }
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        boolean z11 = parent instanceof ViewGroup;
                        if (z11) {
                            i13 = ((ViewGroup) parent).getId();
                        } else {
                            i13 = -1;
                        }
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + i13 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
                        if (z11) {
                            ((ViewGroup) parent).removeView(view2);
                        }
                        this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i11));
                    }
                    try {
                        getViewGroupManager(viewState).addView(viewGroup, view2, i12);
                        if (z10) {
                            final int i14 = i11;
                            final int i15 = i10;
                            final int i16 = i12;
                            UiThreadUtil.runOnUiThread(new Runnable() {
                                public void run() {
                                    String str = SurfaceMountingManager.TAG;
                                    U5.a.m(str, "addViewAt: [" + i14 + "] -> [" + i15 + "] idx: " + i16 + " AFTER");
                                    SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                                }
                            });
                        }
                    } catch (IllegalStateException | IndexOutOfBoundsException e10) {
                        throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
                    }
                } else {
                    throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i11);
                }
            } else {
                String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
                U5.a.m(TAG, str);
                throw new IllegalStateException(str);
            }
        }
    }

    public void attachRootView(View view, C3415h0 h0Var) {
        this.mThemedReactContext = h0Var;
        addRootView(view);
    }

    public void createView(String str, int i10, ReadableMap readableMap, C3413g0 g0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i10);
            if (nullableViewState == null || nullableViewState.mView == null) {
                createViewUnsafe(str, i10, readableMap, g0Var, eventEmitterWrapper, z10);
            }
        }
    }

    public void createViewUnsafe(String str, int i10, ReadableMap readableMap, C3413g0 g0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        C4236a.c(0, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            W w10 = new W(readableMap);
            ViewState viewState = new ViewState(i10);
            viewState.mCurrentProps = w10;
            viewState.mStateWrapper = g0Var;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
            if (z10) {
                ViewManager c10 = this.mViewManagerRegistry.c(str);
                viewState.mView = c10.createView(i10, this.mThemedReactContext, w10, g0Var, this.mJSResponderHandler);
                viewState.mViewManager = c10;
            }
        } finally {
            C4236a.i(0);
        }
    }

    public void deleteView(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i10);
            if (nullableViewState == null) {
                String str = MountingManager.TAG;
                ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            } else if (!b.g() || !this.mViewsWithActiveTouches.contains(Integer.valueOf(i10))) {
                this.mTagToViewState.remove(Integer.valueOf(i10));
                onViewStateDeleted(nullableViewState);
            } else {
                this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i10));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r0.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enqueuePendingEvent(int r2, java.lang.String r3, boolean r4, com.facebook.react.bridge.WritableMap r5, int r6) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.facebook.react.fabric.mounting.SurfaceMountingManager$ViewState> r0 = r1.mTagToViewState
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.facebook.react.fabric.mounting.SurfaceMountingManager$ViewState r2 = (com.facebook.react.fabric.mounting.SurfaceMountingManager.ViewState) r2
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            com.facebook.react.fabric.mounting.SurfaceMountingManager$PendingViewEvent r0 = new com.facebook.react.fabric.mounting.SurfaceMountingManager$PendingViewEvent
            r0.<init>(r3, r5, r6, r4)
            com.facebook.react.fabric.mounting.SurfaceMountingManager$3 r3 = new com.facebook.react.fabric.mounting.SurfaceMountingManager$3
            r3.<init>(r2, r0)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.mounting.SurfaceMountingManager.enqueuePendingEvent(int, java.lang.String, boolean, com.facebook.react.bridge.WritableMap, int):void");
    }

    public C3415h0 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i10) {
        View view;
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            view = null;
        } else {
            view = nullableViewState.mView;
        }
        if (view != null) {
            return view;
        }
        throw new r("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean getViewExists(int i10) {
        Z z10 = this.mTagSetForStoppedSurface;
        if (z10 != null && z10.e(i10)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i10));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i10) {
        if (b.g()) {
            this.mViewsWithActiveTouches.add(Integer.valueOf(i10));
        }
    }

    public void preallocateView(String str, int i10, ReadableMap readableMap, C3413g0 g0Var, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i10) == null) {
            createViewUnsafe(str, i10, readableMap, g0Var, (EventEmitterWrapper) null, z10);
        }
    }

    public void printSurfaceState() {
        String str;
        View view;
        U5.a.o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState next : this.mTagToViewState.values()) {
            ViewManager viewManager = next.mViewManager;
            Integer num = null;
            if (viewManager != null) {
                str = viewManager.getName();
            } else {
                str = null;
            }
            View view2 = next.mView;
            if (view2 != null) {
                view = (View) view2.getParent();
            } else {
                view = null;
            }
            if (view != null) {
                num = Integer.valueOf(view.getId());
            }
            U5.a.o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", str, Integer.valueOf(next.mReactTag), num, Boolean.valueOf(next.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i10, int i11, ReadableArray readableArray) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i10);
            if (nullableViewState != null) {
                ViewManager viewManager = nullableViewState.mViewManager;
                if (viewManager != null) {
                    View view = nullableViewState.mView;
                    if (view != null) {
                        viewManager.receiveCommand(view, i11, readableArray);
                        return;
                    }
                    throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
                }
                throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
        }
    }

    public void removeViewAt(int i10, int i11, int i12) {
        int i13;
        final int i14;
        if (!isStopped()) {
            if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i10))) {
                ReactSoftExceptionLogger.logSoftException(TAG, new r("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i10 + "]"));
                return;
            }
            UiThreadUtil.assertOnUiThread();
            ViewState nullableViewState = getNullableViewState(i11);
            if (nullableViewState == null) {
                ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
                return;
            }
            View view = nullableViewState.mView;
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    int i15 = 0;
                    if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                        U5.a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i12 + " BEFORE");
                        logViewHierarchy(viewGroup, false);
                    }
                    C3423p viewGroupManager = getViewGroupManager(nullableViewState);
                    View childAt = viewGroupManager.getChildAt(viewGroup, i12);
                    if (childAt != null) {
                        i13 = childAt.getId();
                    } else {
                        i13 = -1;
                    }
                    if (i13 != i10) {
                        int childCount = viewGroup.getChildCount();
                        while (true) {
                            if (i15 >= childCount) {
                                i15 = -1;
                                break;
                            } else if (viewGroup.getChildAt(i15).getId() == i10) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i15 == -1) {
                            U5.a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                            return;
                        }
                        logViewHierarchy(viewGroup, true);
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + i13 + " - actual index of view: " + i15));
                        i14 = i15;
                    } else {
                        i14 = i12;
                    }
                    try {
                        viewGroupManager.removeViewAt(viewGroup, i14);
                        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                            final int i16 = i10;
                            final int i17 = i11;
                            UiThreadUtil.runOnUiThread(new Runnable() {
                                public void run() {
                                    String str = SurfaceMountingManager.TAG;
                                    U5.a.m(str, "removeViewAt: [" + i16 + "] -> [" + i17 + "] idx: " + i14 + " AFTER");
                                    SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                                }
                            });
                        }
                    } catch (RuntimeException e10) {
                        int childCount2 = viewGroupManager.getChildCount(viewGroup);
                        logViewHierarchy(viewGroup, true);
                        throw new IllegalStateException("Cannot remove child at index " + i14 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
                    }
                } else {
                    throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
                }
            } else {
                String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
                U5.a.m(TAG, str);
                throw new IllegalStateException(str);
            }
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            if (viewState.mViewManager != null) {
                View view = viewState.mView;
                if (view != null) {
                    view.sendAccessibilityEvent(i11);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
    }

    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            if (!z10) {
                this.mJSResponderHandler.d(i11, (ViewParent) null);
                return;
            }
            ViewState viewState = getViewState(i10);
            View view = viewState.mView;
            if (i11 != i10 && (view instanceof ViewParent)) {
                this.mJSResponderHandler.d(i11, (ViewParent) view);
            } else if (view == null) {
                SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
            } else {
                if (viewState.mIsRoot) {
                    SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
                }
                this.mJSResponderHandler.d(i11, view.getParent());
            }
        }
    }

    public void stopSurface() {
        String str = TAG;
        U5.a.m(str, "Stopping surface [" + this.mSurfaceId + "]");
        if (!isStopped()) {
            this.mIsStopped = true;
            for (ViewState next : this.mTagToViewState.values()) {
                C3413g0 g0Var = next.mStateWrapper;
                if (g0Var != null) {
                    g0Var.destroyState();
                    next.mStateWrapper = null;
                }
                EventEmitterWrapper eventEmitterWrapper = next.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    eventEmitterWrapper.destroy();
                    next.mEventEmitter = null;
                }
            }
            c cVar = new c(this);
            if (UiThreadUtil.isOnUiThread()) {
                cVar.run();
            } else {
                UiThreadUtil.runOnUiThread(cVar);
            }
        }
    }

    public void sweepActiveTouchForTag(int i10) {
        if (b.g()) {
            this.mViewsWithActiveTouches.remove(Integer.valueOf(i10));
            if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i10))) {
                this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i10));
                deleteView(i10);
            }
        }
    }

    public void updateEventEmitter(int i10, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
            if (viewState == null) {
                viewState = new ViewState(i10);
                this.mTagToViewState.put(Integer.valueOf(i10), viewState);
            }
            EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
            viewState.mEventEmitter = eventEmitterWrapper;
            if (!(eventEmitterWrapper2 == eventEmitterWrapper || eventEmitterWrapper2 == null)) {
                eventEmitterWrapper2.destroy();
            }
            Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
            if (queue != null) {
                for (PendingViewEvent dispatch : queue) {
                    dispatch.dispatch(eventEmitterWrapper);
                }
                viewState.mPendingEventQueue = null;
            }
        }
    }

    public void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C3423p pVar;
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view != null) {
                    int i18 = 0;
                    int i19 = 1;
                    if (i17 == 1) {
                        i19 = 0;
                    } else if (i17 != 2) {
                        i19 = 2;
                    }
                    view.setLayoutDirection(i19);
                    view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                    ViewParent parent = view.getParent();
                    if (parent instanceof C3405c0) {
                        parent.requestLayout();
                    }
                    ViewManager viewManager = getViewState(i11).mViewManager;
                    if (viewManager != null) {
                        pVar = (C3423p) viewManager;
                    } else {
                        pVar = null;
                    }
                    if (pVar == null || !pVar.needsCustomLayoutForChildren()) {
                        view.layout(i12, i13, i14 + i12, i15 + i13);
                    }
                    if (i16 == 0) {
                        i18 = 4;
                    }
                    if (view.getVisibility() != i18) {
                        view.setVisibility(i18);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Unable to find View for tag: " + i10);
            }
        }
    }

    public void updateOverflowInset(int i10, int i11, int i12, int i13, int i14) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view == null) {
                    throw new IllegalStateException("Unable to find View for tag: " + i10);
                } else if (view instanceof P) {
                    ((P) view).setOverflowInset(i11, i12, i13, i14);
                }
            }
        }
    }

    public void updatePadding(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view != null) {
                    ViewManager viewManager = viewState.mViewManager;
                    if (viewManager != null) {
                        viewManager.setPadding(view, i11, i12, i13, i14);
                        return;
                    }
                    throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
                }
                throw new IllegalStateException("Unable to find View for tag: " + i10);
            }
        }
    }

    public void updateProps(int i10, ReadableMap readableMap) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            viewState.mCurrentProps = new W(readableMap);
            View view = viewState.mView;
            if (view != null) {
                ((ViewManager) C3863a.c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
                return;
            }
            throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
        }
    }

    public void updateState(int i10, C3413g0 g0Var) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i10);
            C3413g0 g0Var2 = viewState.mStateWrapper;
            viewState.mStateWrapper = g0Var;
            ViewManager viewManager = viewState.mViewManager;
            if (viewManager != null) {
                Object updateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, g0Var);
                if (updateState != null) {
                    viewManager.updateExtraData(viewState.mView, updateState);
                }
                if (g0Var2 != null) {
                    g0Var2.destroyState();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
        }
    }

    private static class ViewState {
        ReadableMap mCurrentLocalData;
        W mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        C3413g0 mStateWrapper;
        View mView;
        ViewManager mViewManager;

        public String toString() {
            boolean z10;
            if (this.mViewManager == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + z10;
        }

        private ViewState(int i10) {
            this(i10, (View) null, (ViewManager) null, false);
        }

        private ViewState(int i10, View view, ViewManager viewManager, boolean z10) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i10;
            this.mView = view;
            this.mIsRoot = z10;
            this.mViewManager = viewManager;
        }
    }

    public void receiveCommand(int i10, String str, ReadableArray readableArray) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i10);
            if (nullableViewState != null) {
                ViewManager viewManager = nullableViewState.mViewManager;
                if (viewManager != null) {
                    View view = nullableViewState.mView;
                    if (view != null) {
                        viewManager.receiveCommand(view, str, readableArray);
                        return;
                    }
                    throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
                }
                throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
        }
    }
}

package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import i8.e;
import i8.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class ReaLayoutAnimator extends e {
    private AnimationsManager mAnimationsManager = null;
    private final ReactApplicationContext mContext;
    private volatile boolean mInitialized = false;
    private final WeakReference<C> mWeakNativeViewHierarchyManager;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, C c10) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(c10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteView$0(d dVar) {
        if (dVar.getEventName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    public void applyLayoutUpdate(View view, int i10, int i11, int i12, int i13) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i10, i11, i12 + i10, i13 + i11);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
        } else if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    public void deleteView(View view, f fVar) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, fVar);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        C c10 = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (c10.resolveViewManager(view.getId()).getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (c10.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, fVar);
                        EventDispatcher c11 = n0.c((ReactContext) view.getContext(), view.getId());
                        if (c11 != null) {
                            c11.g(new a(this));
                            return;
                        }
                        return;
                    }
                } catch (r e10) {
                    e10.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, fVar);
                    return;
                }
            }
            maybeInit();
            Objects.requireNonNull(fVar);
            this.mAnimationsManager.onViewRemoval(view, (ViewGroup) view.getParent(), new b(fVar));
        } catch (r e11) {
            e11.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, fVar);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (!this.mInitialized) {
            this.mInitialized = true;
            AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
            this.mAnimationsManager = animationsManager;
            animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
        }
    }

    public void reset() {
        super.reset();
        Iterator<View> it = this.viewsToSnapshot.iterator();
        while (it.hasNext()) {
            View next = it.next();
            this.mAnimationsManager.onViewCreate(next, (ViewGroup) next.getParent(), new Snapshot(next, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    public boolean shouldAnimateLayout(View view) {
        if (!isLayoutAnimationEnabled()) {
            return super.shouldAnimateLayout(view);
        }
        if (view == null || view.getParent() == null) {
            return false;
        }
        return true;
    }
}

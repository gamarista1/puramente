package com.swmansion.reanimated.layoutReanimation;

import android.view.ViewParent;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionManager f59641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewParent f59642b;

    public /* synthetic */ e(SharedTransitionManager sharedTransitionManager, ViewParent viewParent) {
        this.f59641a = sharedTransitionManager;
        this.f59642b = viewParent;
    }

    public final void run() {
        this.f59641a.lambda$finishSharedAnimation$1(this.f59642b);
    }
}

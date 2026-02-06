package com.facebook.react.fabric.mounting;

import android.view.View;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SurfaceMountingManager f40892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f40893b;

    public /* synthetic */ b(SurfaceMountingManager surfaceMountingManager, View view) {
        this.f40892a = surfaceMountingManager;
        this.f40893b = view;
    }

    public final void run() {
        this.f40892a.lambda$addRootView$0(this.f40893b);
    }
}

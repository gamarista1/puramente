package com.swmansion.rnscreens;

import android.view.Window;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Window f59722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f59723b;

    public /* synthetic */ N(Window window, int i10) {
        this.f59722a = window;
        this.f59723b = i10;
    }

    public final void run() {
        O.p(this.f59722a, this.f59723b);
    }
}

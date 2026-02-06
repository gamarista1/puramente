package com.swmansion.rnscreens;

import android.app.Activity;

public final /* synthetic */ class M implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f59720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f59721b;

    public /* synthetic */ M(Activity activity, String str) {
        this.f59720a = activity;
        this.f59721b = str;
    }

    public final void run() {
        O.u(this.f59720a, this.f59721b);
    }
}

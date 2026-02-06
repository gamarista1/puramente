package com.google.firebase.perf.config;

import android.content.Context;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f57666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f57667b;

    public /* synthetic */ w(x xVar, Context context) {
        this.f57666a = xVar;
        this.f57667b = context;
    }

    public final void run() {
        this.f57666a.i(this.f57667b);
    }
}

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class L4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ComponentName f54761a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ J4 f54762b;

    L4(J4 j42, ComponentName componentName) {
        this.f54761a = componentName;
        this.f54762b = j42;
    }

    public final void run() {
        C4644k4.I(this.f54762b.f54737c, this.f54761a);
    }
}

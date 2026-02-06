package com.google.android.gms.measurement.internal;

final class Z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f54940a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4731z f54941b;

    Z(C4731z zVar, long j10) {
        this.f54940a = j10;
        this.f54941b = zVar;
    }

    public final void run() {
        this.f54941b.w(this.f54940a);
    }
}

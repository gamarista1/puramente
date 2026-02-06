package com.google.android.gms.measurement.internal;

final class A0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54431a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f54432b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4731z f54433c;

    A0(C4731z zVar, String str, long j10) {
        this.f54431a = str;
        this.f54432b = j10;
        this.f54433c = zVar;
    }

    public final void run() {
        C4731z.x(this.f54433c, this.f54431a, this.f54432b);
    }
}

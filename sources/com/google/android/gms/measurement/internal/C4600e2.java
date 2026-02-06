package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e2  reason: case insensitive filesystem */
final class C4600e2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f55050a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4607f2 f55051b;

    C4600e2(C4607f2 f2Var, boolean z10) {
        this.f55050a = z10;
        this.f55051b = f2Var;
    }

    public final void run() {
        this.f55051b.f55071a.E(this.f55050a);
    }
}

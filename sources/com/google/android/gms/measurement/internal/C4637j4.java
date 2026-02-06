package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j4  reason: case insensitive filesystem */
final class C4637j4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f55164a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4609f4 f55165b;

    C4637j4(C4609f4 f4Var, long j10) {
        this.f55164a = j10;
        this.f55165b = f4Var;
    }

    public final void run() {
        this.f55165b.j().q(this.f55164a);
        this.f55165b.f55077e = null;
    }
}

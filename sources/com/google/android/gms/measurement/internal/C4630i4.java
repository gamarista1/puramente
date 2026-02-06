package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i4  reason: case insensitive filesystem */
final class C4630i4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55145a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f55146b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4609f4 f55147c;

    C4630i4(C4609f4 f4Var, C4595d4 d4Var, long j10) {
        this.f55145a = d4Var;
        this.f55146b = j10;
        this.f55147c = f4Var;
    }

    public final void run() {
        this.f55147c.F(this.f55145a, false, this.f55146b);
        C4609f4 f4Var = this.f55147c;
        f4Var.f55077e = null;
        f4Var.o().G((C4595d4) null);
    }
}

package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a3  reason: case insensitive filesystem */
final class C4573a3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ A5 f55004a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f55005b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f55006c;

    C4573a3(I2 i22, A5 a52, E5 e52) {
        this.f55004a = a52;
        this.f55005b = e52;
        this.f55006c = i22;
    }

    public final void run() {
        this.f55006c.f54718a.p0();
        if (this.f55004a.o0() == null) {
            this.f55006c.f54718a.B(this.f55004a.f54441b, this.f55005b);
        } else {
            this.f55006c.f54718a.u(this.f55004a, this.f55005b);
        }
    }
}

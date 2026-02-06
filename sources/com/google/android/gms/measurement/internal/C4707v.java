package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v  reason: case insensitive filesystem */
final class C4707v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4615g3 f55370a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4689s f55371b;

    C4707v(C4689s sVar, C4615g3 g3Var) {
        this.f55370a = g3Var;
        this.f55371b = sVar;
    }

    public final void run() {
        this.f55370a.zzd();
        if (C4583c.a()) {
            this.f55370a.zzl().y(this);
            return;
        }
        boolean e10 = this.f55371b.e();
        this.f55371b.f55340c = 0;
        if (e10) {
            this.f55371b.d();
        }
    }
}

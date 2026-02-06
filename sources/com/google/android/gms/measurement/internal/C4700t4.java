package com.google.android.gms.measurement.internal;

import Pa.e;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.t4  reason: case insensitive filesystem */
final class C4700t4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55351a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f55352b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ A5 f55353c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55354d;

    C4700t4(C4644k4 k4Var, E5 e52, boolean z10, A5 a52) {
        this.f55351a = e52;
        this.f55352b = z10;
        this.f55353c = a52;
        this.f55354d = k4Var;
    }

    public final void run() {
        A5 a52;
        e w10 = this.f55354d.f55206d;
        if (w10 == null) {
            this.f55354d.zzj().B().a("Discarding data. Failed to set user property");
            return;
        }
        C4536s.l(this.f55351a);
        C4644k4 k4Var = this.f55354d;
        if (this.f55352b) {
            a52 = null;
        } else {
            a52 = this.f55353c;
        }
        k4Var.y(w10, a52, this.f55351a);
        this.f55354d.g0();
    }
}

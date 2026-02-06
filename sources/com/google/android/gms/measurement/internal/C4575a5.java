package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a5  reason: case insensitive filesystem */
final class C4575a5 {

    /* renamed from: a  reason: collision with root package name */
    private long f55007a;

    /* renamed from: b  reason: collision with root package name */
    protected long f55008b;

    /* renamed from: c  reason: collision with root package name */
    private final C4689s f55009c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ V4 f55010d;

    public C4575a5(V4 v42) {
        this.f55010d = v42;
        this.f55009c = new C4596d5(this, v42.f55074a);
        long a10 = v42.zzb().a();
        this.f55007a = a10;
        this.f55008b = a10;
    }

    static /* synthetic */ void c(C4575a5 a5Var) {
        a5Var.f55010d.i();
        a5Var.d(false, false, a5Var.f55010d.zzb().a());
        a5Var.f55010d.j().q(a5Var.f55010d.zzb().a());
    }

    /* access modifiers changed from: package-private */
    public final long a(long j10) {
        long j11 = j10 - this.f55008b;
        this.f55008b = j10;
        return j11;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f55009c.a();
        if (this.f55010d.a().o(F.f54634Z0)) {
            this.f55007a = this.f55010d.zzb().a();
        } else {
            this.f55007a = 0;
        }
        this.f55008b = this.f55007a;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f55010d.i();
        this.f55010d.q();
        if (this.f55010d.f55074a.k()) {
            this.f55010d.e().f55104r.b(this.f55010d.zzb().currentTimeMillis());
        }
        long j11 = j10 - this.f55007a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = a(j10);
            }
            this.f55010d.zzj().F().b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            B5.S(this.f55010d.n().x(!this.f55010d.a().O()), bundle, true);
            if (!z11) {
                this.f55010d.m().T0("auto", "_e", bundle);
            }
            this.f55007a = j10;
            this.f55009c.a();
            this.f55009c.b(((Long) F.f54638b0.a((Object) null)).longValue());
            return true;
        }
        this.f55010d.zzj().F().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e(long j10) {
        this.f55009c.a();
    }

    /* access modifiers changed from: package-private */
    public final void f(long j10) {
        this.f55010d.i();
        this.f55009c.a();
        this.f55007a = j10;
        this.f55008b = j10;
    }
}

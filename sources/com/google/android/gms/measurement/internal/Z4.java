package com.google.android.gms.measurement.internal;

final class Z4 {

    /* renamed from: a  reason: collision with root package name */
    private Y4 f54995a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ V4 f54996b;

    Z4(V4 v42) {
        this.f54996b = v42;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f54996b.i();
        if (this.f54995a != null) {
            this.f54996b.f54910c.removeCallbacks(this.f54995a);
        }
        this.f54996b.e().f55107u.a(false);
        this.f54996b.y(false);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f54995a = new Y4(this, this.f54996b.zzb().currentTimeMillis(), j10);
        this.f54996b.f54910c.postDelayed(this.f54995a, 2000);
    }
}

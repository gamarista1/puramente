package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b5  reason: case insensitive filesystem */
public final /* synthetic */ class C4582b5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Y4 f55023a;

    public /* synthetic */ C4582b5(Y4 y42) {
        this.f55023a = y42;
    }

    public final void run() {
        Y4 y42 = this.f55023a;
        Z4 z42 = y42.f54939c;
        long j10 = y42.f54937a;
        long j11 = y42.f54938b;
        z42.f54996b.i();
        z42.f54996b.zzj().A().a("Application going to the background");
        z42.f54996b.e().f55107u.a(true);
        z42.f54996b.y(true);
        if (!z42.f54996b.a().O()) {
            if (z42.f54996b.a().o(F.f54600I0)) {
                z42.f54996b.z(false, false, j11);
                z42.f54996b.f54913f.e(j11);
            } else {
                z42.f54996b.f54913f.e(j11);
                z42.f54996b.z(false, false, j11);
            }
        }
        z42.f54996b.zzj().E().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
    }
}

package com.google.firebase.auth;

import Db.C4273v;
import com.google.android.gms.common.api.Status;

final class P0 implements C4273v {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ A f56963a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56964b;

    P0(FirebaseAuth firebaseAuth, A a10) {
        this.f56963a = a10;
        this.f56964b = firebaseAuth;
    }

    public final void zza() {
        if (this.f56964b.f56882f != null && this.f56964b.f56882f.a().equalsIgnoreCase(this.f56963a.a())) {
            this.f56964b.F0();
        }
    }

    public final void zza(Status status) {
        if (status.p0() == 17011 || status.p0() == 17021 || status.p0() == 17005) {
            this.f56964b.E();
        }
    }
}

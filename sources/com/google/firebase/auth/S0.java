package com.google.firebase.auth;

import Db.C4272u;
import Db.k0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;

final class S0 implements C4272u, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56971a;

    S0(FirebaseAuth firebaseAuth) {
        this.f56971a = firebaseAuth;
    }

    public final void a(zzafm zzafm, A a10) {
        this.f56971a.g0(a10, zzafm, true, true);
    }

    public final void zza(Status status) {
        int p02 = status.p0();
        if (p02 == 17011 || p02 == 17021 || p02 == 17005) {
            this.f56971a.E();
        }
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4536s;

final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f54064a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f54065b;

    q0(ConnectionResult connectionResult, int i10) {
        C4536s.l(connectionResult);
        this.f54065b = connectionResult;
        this.f54064a = i10;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f54064a;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult b() {
        return this.f54065b;
    }
}

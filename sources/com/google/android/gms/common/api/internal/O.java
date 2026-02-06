package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4529k;

final class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConnectionResult f53975a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ P f53976b;

    O(P p10, ConnectionResult connectionResult) {
        this.f53976b = p10;
        this.f53975a = connectionResult;
    }

    public final void run() {
        P p10 = this.f53976b;
        L l10 = (L) p10.f53982f.f54035j.get(p10.f53978b);
        if (l10 != null) {
            if (this.f53975a.s0()) {
                this.f53976b.f53981e = true;
                if (this.f53976b.f53977a.requiresSignIn()) {
                    this.f53976b.i();
                    return;
                }
                try {
                    P p11 = this.f53976b;
                    p11.f53977a.getRemoteService((C4529k) null, p11.f53977a.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f53976b.f53977a.disconnect("Failed to get service from broker.");
                    l10.H(new ConnectionResult(10), (Exception) null);
                }
            } else {
                l10.H(this.f53975a, (Exception) null);
            }
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4529k;
import java.util.Set;

final class P implements C4518c.C0821c, e0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f53977a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4490b f53978b;

    /* renamed from: c  reason: collision with root package name */
    private C4529k f53979c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f53980d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f53981e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C4495g f53982f;

    public P(C4495g gVar, a.f fVar, C4490b bVar) {
        this.f53982f = gVar;
        this.f53977a = fVar;
        this.f53978b = bVar;
    }

    /* access modifiers changed from: private */
    public final void i() {
        C4529k kVar;
        if (this.f53981e && (kVar = this.f53979c) != null) {
            this.f53977a.getRemoteService(kVar, this.f53980d);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.f53982f.f54039n.post(new O(this, connectionResult));
    }

    public final void b(C4529k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
            return;
        }
        this.f53979c = kVar;
        this.f53980d = set;
        i();
    }

    public final void c(ConnectionResult connectionResult) {
        L l10 = (L) this.f53982f.f54035j.get(this.f53978b);
        if (l10 != null) {
            l10.I(connectionResult);
        }
    }

    public final void d(int i10) {
        L l10 = (L) this.f53982f.f54035j.get(this.f53978b);
        if (l10 == null) {
            return;
        }
        if (l10.f53968i) {
            l10.I(new ConnectionResult(17));
        } else {
            l10.b(i10);
        }
    }
}

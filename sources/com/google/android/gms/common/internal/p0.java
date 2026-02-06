package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class p0 extends C4515a0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ C4518c f54219g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(C4518c cVar, int i10, Bundle bundle) {
        super(cVar, i10, (Bundle) null);
        this.f54219g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(ConnectionResult connectionResult) {
        if (!this.f54219g.enableLocalFallback() || !C4518c.zzo(this.f54219g)) {
            this.f54219g.zzc.a(connectionResult);
            this.f54219g.onConnectionFailed(connectionResult);
            return;
        }
        C4518c.zzk(this.f54219g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f54219g.zzc.a(ConnectionResult.f53893e);
        return true;
    }
}

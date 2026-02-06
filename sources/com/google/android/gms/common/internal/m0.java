package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class m0 extends C4519c0 {

    /* renamed from: a  reason: collision with root package name */
    private C4518c f54201a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54202b;

    public m0(C4518c cVar, int i10) {
        this.f54201a = cVar;
        this.f54202b = i10;
    }

    public final void B(int i10, IBinder iBinder, Bundle bundle) {
        C4536s.m(this.f54201a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f54201a.onPostInitHandler(i10, iBinder, bundle, this.f54202b);
        this.f54201a = null;
    }

    public final void G0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void k1(int i10, IBinder iBinder, q0 q0Var) {
        C4518c cVar = this.f54201a;
        C4536s.m(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C4536s.l(q0Var);
        C4518c.zzj(cVar, q0Var);
        B(i10, iBinder, q0Var.f54222a);
    }
}

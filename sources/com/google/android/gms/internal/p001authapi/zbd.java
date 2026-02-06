package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import pa.C5129f;
import pa.C5130g;

/* renamed from: com.google.android.gms.internal.auth-api.zbd  reason: invalid package */
public final class zbd extends C4526h {
    private final C5130g zba;

    public zbd(Context context, Looper looper, C4522e eVar, C5130g gVar, f.b bVar, f.c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        C5129f fVar = new C5129f(gVar == null ? C5130g.f61232d : gVar);
        fVar.a(zbas.zba());
        this.zba = new C5130g(fVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbe) {
            return (zbe) queryLocalInterface;
        }
        return new zbe(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

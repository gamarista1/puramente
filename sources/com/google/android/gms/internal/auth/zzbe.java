package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import pa.C5125b;
import pa.C5126c;

public final class zzbe extends C4526h {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C4522e eVar, C5126c cVar, C4494f fVar, C4502n nVar) {
        super(context, looper, 16, eVar, fVar, nVar);
        Bundle bundle;
        if (cVar == null) {
            bundle = new Bundle();
        } else {
            bundle = cVar.a();
        }
        this.zze = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return (zzbh) queryLocalInterface;
        }
        return new zzbh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        C4522e clientSettings = getClientSettings();
        if (TextUtils.isEmpty(clientSettings.c()) || clientSettings.f(C5125b.f61224a).isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

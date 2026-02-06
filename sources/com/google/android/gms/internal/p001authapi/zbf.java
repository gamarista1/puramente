package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import ra.n;
import ya.C5286c;

/* renamed from: com.google.android.gms.internal.auth-api.zbf  reason: invalid package */
public final class zbf extends C4526h {
    private final Bundle zba;

    public zbf(Context context, Looper looper, n nVar, C4522e eVar, C4494f fVar, C4502n nVar2) {
        super(context, looper, 219, eVar, fVar, nVar2);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", (String) null);
        this.zba = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        if (queryLocalInterface instanceof zbj) {
            return (zbj) queryLocalInterface;
        }
        return new zbj(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return zbar.zbk;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

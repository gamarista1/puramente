package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import oa.k;
import ya.C5286c;

final class zzi extends C4526h {
    zzi(Context context, Looper looper, C4522e eVar, C4494f fVar, C4502n nVar) {
        super(context, looper, 224, eVar, fVar, nVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (queryLocalInterface instanceof zzp) {
            return (zzp) queryLocalInterface;
        }
        return new zzp(iBinder);
    }

    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    public final C5286c[] getApiFeatures() {
        return new C5286c[]{k.f61171l, k.f61170k, k.f61160a};
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    /* access modifiers changed from: protected */
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

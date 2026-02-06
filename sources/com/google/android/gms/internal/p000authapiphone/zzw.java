package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C4494f;
import com.google.android.gms.common.api.internal.C4502n;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import ya.C5286c;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
public final class zzw extends C4526h {
    public zzw(Context context, Looper looper, C4522e eVar, C4494f fVar, C4502n nVar) {
        super(context, looper, 126, eVar, fVar, nVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new zzh(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return zzac.zze;
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

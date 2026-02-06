package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import qa.d;

public final class zzap extends C4526h {
    private final Bundle zze = new Bundle();

    public zzap(Context context, Looper looper, C4522e eVar, d dVar, f.b bVar, f.c cVar) {
        super(context, looper, 128, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if (queryLocalInterface instanceof zzau) {
            return (zzau) queryLocalInterface;
        }
        return new zzau(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return com.google.android.gms.common.d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

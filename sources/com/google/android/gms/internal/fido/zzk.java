package com.google.android.gms.internal.fido;

import Ja.C4316b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import ya.C5286c;

public final class zzk extends C4526h {
    public zzk(Context context, Looper looper, C4522e eVar, f.b bVar, f.c cVar) {
        super(context, looper, 149, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        if (queryLocalInterface instanceof zzn) {
            return (zzn) queryLocalInterface;
        }
        return new zzn(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return new C5286c[]{C4316b.f51195h, C4316b.f51196i, C4316b.f51207t};
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

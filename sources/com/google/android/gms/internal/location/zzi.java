package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import com.google.android.gms.location.a0;
import ya.C5286c;

public class zzi extends C4526h {
    protected final zzbg<zzam> zze = new zzh(this);
    private final String zzf;

    public zzi(Context context, Looper looper, f.b bVar, f.c cVar, String str, C4522e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzal(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return a0.f54382f;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}

package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4526h;
import oa.k;
import ya.C5286c;

public final class zzam extends C4526h {
    public zzam(Context context, Looper looper, C4522e eVar, f.b bVar, f.c cVar) {
        super(context, looper, 120, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return com.google.android.gms.auth.account.f.a(iBinder);
    }

    public final C5286c[] getApiFeatures() {
        return new C5286c[]{k.f61173n};
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

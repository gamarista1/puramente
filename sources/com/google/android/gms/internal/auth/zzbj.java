package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.k;
import pa.C5125b;

abstract class zzbj extends C4492d {
    public zzbj(f fVar) {
        super(C5125b.f61224a, fVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ k createFailedResult(Status status) {
        return new zzbv(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzbe zzbe = (zzbe) bVar;
        zza(zzbe.getContext(), (zzbh) zzbe.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((k) obj);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzbh zzbh);
}

package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import ta.C5204b;

public final /* synthetic */ class zzbl implements r {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ C5204b zzb;

    public /* synthetic */ zzbl(zzbo zzbo, C5204b bVar) {
        this.zza = zzbo;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzbo zzbo = this.zza;
        C5204b bVar = this.zzb;
        ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzbo, (TaskCompletionSource) obj2), bVar);
    }
}

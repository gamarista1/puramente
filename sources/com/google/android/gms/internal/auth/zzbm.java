package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;
import ta.C5205c;

final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    zzbm(zzbo zzbo, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(C5205c cVar) {
        C4511x.b(new Status(cVar.f61653a), cVar, this.zza);
    }
}

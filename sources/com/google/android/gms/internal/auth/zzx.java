package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4496h;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzx extends C4496h.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzx(zzab zzab, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        zzab.zzf(status, (Object) null, this.zza);
    }
}

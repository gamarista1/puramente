package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbn extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    zzbn(zzbo zzbo, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzc(String str) {
        Status status;
        if (str != null) {
            status = Status.f53907f;
        } else {
            status = new Status(3006);
        }
        C4511x.b(status, str, this.zza);
    }
}

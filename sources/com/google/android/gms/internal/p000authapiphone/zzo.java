package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4496h;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.common.internal.C4516b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
final class zzo extends C4496h.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzo(zzr zzr, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        if (status.p0() == 6) {
            this.zza.trySetException(C4516b.a(status));
        } else {
            C4511x.a(status, this.zza);
        }
    }
}

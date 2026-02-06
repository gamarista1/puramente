package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbae  reason: invalid package */
final class zbae extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    zbae(zbaf zbaf, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, j jVar) {
        C4511x.b(status, jVar, this.zba);
    }
}

package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4516b;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5183a;

/* renamed from: com.google.android.gms.internal.auth-api.zby  reason: invalid package */
final class zby extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    zby(zbz zbz, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C5183a aVar) {
        if (status.s0()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(C4516b.a(status));
        }
    }
}

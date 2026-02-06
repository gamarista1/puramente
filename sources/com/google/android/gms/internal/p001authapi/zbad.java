package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4516b;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.h;

/* renamed from: com.google.android.gms.internal.auth-api.zbad  reason: invalid package */
final class zbad extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    zbad(zbaf zbaf, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, h hVar) {
        if (status.s0()) {
            this.zba.setResult(hVar);
        } else {
            this.zba.setException(C4516b.a(status));
        }
    }
}

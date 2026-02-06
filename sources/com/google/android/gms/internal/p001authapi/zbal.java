package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5185c;

/* renamed from: com.google.android.gms.internal.auth-api.zbal  reason: invalid package */
final class zbal extends zbk {
    final /* synthetic */ TaskCompletionSource zba;

    zbal(zbap zbap, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C5185c cVar) {
        C4511x.b(status, cVar, this.zba);
    }
}

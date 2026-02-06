package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbao  reason: invalid package */
final class zbao extends zbn {
    final /* synthetic */ TaskCompletionSource zba;

    zbao(zbap zbap, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        C4511x.b(status, pendingIntent, this.zba);
    }
}

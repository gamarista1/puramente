package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4496h;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
final class zbam extends C4496h.a {
    final /* synthetic */ TaskCompletionSource zba;

    zbam(zbap zbap, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void onResult(Status status) {
        C4511x.a(status, this.zba);
    }
}

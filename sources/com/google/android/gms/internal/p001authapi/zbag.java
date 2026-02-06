package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5187e;

/* renamed from: com.google.android.gms.internal.auth-api.zbag  reason: invalid package */
public final /* synthetic */ class zbag implements r {
    public final /* synthetic */ zbap zba;
    public final /* synthetic */ C5187e zbb;

    public /* synthetic */ zbag(zbap zbap, C5187e eVar) {
        this.zba = zbap;
        this.zbb = eVar;
    }

    public final void accept(Object obj, Object obj2) {
        this.zba.zba(this.zbb, (zbaq) obj, (TaskCompletionSource) obj2);
    }
}

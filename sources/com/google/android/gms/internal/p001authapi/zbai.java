package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5184b;

/* renamed from: com.google.android.gms.internal.auth-api.zbai  reason: invalid package */
public final /* synthetic */ class zbai implements r {
    public final /* synthetic */ zbap zba;
    public final /* synthetic */ C5184b zbb;

    public /* synthetic */ zbai(zbap zbap, C5184b bVar) {
        this.zba = zbap;
        this.zbb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zbv) ((zbaq) obj).getService()).zbc(new zbal(this.zba, (TaskCompletionSource) obj2), (C5184b) C4536s.l(this.zbb));
    }
}

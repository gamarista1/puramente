package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5188f;

/* renamed from: com.google.android.gms.internal.auth-api.zbaj  reason: invalid package */
public final /* synthetic */ class zbaj implements r {
    public final /* synthetic */ zbap zba;
    public final /* synthetic */ C5188f zbb;

    public /* synthetic */ zbaj(zbap zbap, C5188f fVar) {
        this.zba = zbap;
        this.zbb = fVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zbv) ((zbaq) obj).getService()).zbe(new zban(this.zba, (TaskCompletionSource) obj2), (C5188f) C4536s.l(this.zbb));
    }
}

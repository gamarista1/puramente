package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbab  reason: invalid package */
public final /* synthetic */ class zbab implements r {
    public final /* synthetic */ zbaf zba;
    public final /* synthetic */ i zbb;

    public /* synthetic */ zbab(zbaf zbaf, i iVar) {
        this.zba = zbaf;
        this.zbb = iVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zbm) ((zbg) obj).getService()).zbd(new zbae(this.zba, (TaskCompletionSource) obj2), (i) C4536s.l(this.zbb));
    }
}

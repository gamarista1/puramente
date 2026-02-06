package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbaa  reason: invalid package */
public final /* synthetic */ class zbaa implements r {
    public final /* synthetic */ zbaf zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbaa(zbaf zbaf, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbaf;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ((zbm) ((zbg) obj).getService()).zbc(new zbad(this.zba, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) C4536s.l(this.zbb));
    }
}

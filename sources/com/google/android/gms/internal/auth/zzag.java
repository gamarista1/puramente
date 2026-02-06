package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.k;

final class zzag extends C4492d {
    final /* synthetic */ Account zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzag(zzal zzal, a aVar, f fVar, Account account) {
        super(aVar, fVar);
        this.zza = account;
    }

    /* access modifiers changed from: protected */
    public final k createFailedResult(Status status) {
        return new zzak(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).h1(new zzaf(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((k) obj);
    }
}

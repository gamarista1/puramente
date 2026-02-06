package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.k;

final class zzae extends C4492d {
    final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzae(zzal zzal, a aVar, f fVar, String str) {
        super(aVar, fVar);
        this.zza = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ k createFailedResult(Status status) {
        return new zzai(status, (Account) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).g1(new zzad(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((k) obj);
    }
}

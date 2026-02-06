package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.k;

final class zzac extends C4492d {
    final /* synthetic */ boolean zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzac(zzal zzal, a aVar, f fVar, boolean z10) {
        super(aVar, fVar);
        this.zza = z10;
    }

    /* access modifiers changed from: protected */
    public final k createFailedResult(Status status) {
        return new zzaj(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).d0(this.zza);
        setResult(new zzaj(Status.f53907f));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((k) obj);
    }
}

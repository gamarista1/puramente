package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.location.C4555l;
import com.google.android.gms.location.C4556m;
import com.google.android.gms.location.C4557n;
import com.google.android.gms.location.H;

final class zzbh extends H {
    final /* synthetic */ C4555l zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbh(zzbi zzbi, f fVar, C4555l lVar, String str) {
        super(fVar);
        this.zza = lVar;
    }

    public final /* bridge */ /* synthetic */ k createFailedResult(Status status) {
        return new C4556m(status, (C4557n) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzL(this.zza, this, (String) null);
    }
}

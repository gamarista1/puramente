package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

final class zzp extends zzx {
    final /* synthetic */ Location zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzp(zzz zzz, f fVar, Location location) {
        super(fVar);
        this.zza = location;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzJ(this.zza);
        setResult(Status.f53907f);
    }
}

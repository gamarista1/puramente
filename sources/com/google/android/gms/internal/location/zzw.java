package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

final class zzw extends zzx {
    final /* synthetic */ PendingIntent zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzw(zzz zzz, f fVar, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzG(this.zza, new zzy(this));
    }
}

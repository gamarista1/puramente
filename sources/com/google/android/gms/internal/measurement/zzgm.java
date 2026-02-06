package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzgm extends ContentObserver {
    private final /* synthetic */ zzgk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgm(zzgk zzgk, Handler handler) {
        super((Handler) null);
        this.zza = zzgk;
    }

    public final void onChange(boolean z10) {
        this.zza.zzd();
    }
}

package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import ta.C5205c;

final class zzbu implements k {
    private final Status zza;
    private C5205c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final C5205c getResponse() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(C5205c cVar) {
        this.zzb = cVar;
        this.zza = Status.f53907f;
    }
}

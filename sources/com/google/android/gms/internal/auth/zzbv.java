package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.C4536s;

public final class zzbv implements k {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) C4536s.l(status);
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) C4536s.l(str);
        this.zza = Status.f53907f;
    }
}

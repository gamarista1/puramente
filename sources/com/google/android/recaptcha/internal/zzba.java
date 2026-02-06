package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.C6496s;

public final class zzba {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzba(String str, long j10, int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzba = (zzba) obj;
        if (C6496s.c(zzba.zza, this.zza) && zzba.zzb == this.zzb && zzba.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}

package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class zzbb {
    private final zzne zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzbb(zzne zzne, String str, String str2, String str3, String str4) {
        this.zza = zzne;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbb)) {
            return false;
        }
        zzbb zzbb = (zzbb) obj;
        if (zzbb.zza != this.zza || !C6496s.c(zzbb.zzb, this.zzb) || !C6496s.c(zzbb.zzc, this.zzc) || !C6496s.c(zzbb.zzd, this.zzd) || !C6496s.c((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzne zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}

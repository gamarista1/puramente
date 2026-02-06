package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrt  reason: invalid package */
public final class zzrt {
    private final zzbw zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrt)) {
            return false;
        }
        zzrt zzrt = (zzrt) obj;
        if (this.zza != zzrt.zza || this.zzb != zzrt.zzb || !this.zzc.equals(zzrt.zzc) || !this.zzd.equals(zzrt.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zzb;
    }

    private zzrt(zzbw zzbw, int i10, String str, String str2) {
        this.zza = zzbw;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }
}

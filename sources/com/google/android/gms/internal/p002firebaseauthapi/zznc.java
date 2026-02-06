package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznc  reason: invalid package */
public final class zznc extends zzci {
    private final zzot zza;

    public zznc(zzot zzot) {
        this.zza = zzot;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznc)) {
            return false;
        }
        zzot zzot = ((zznc) obj).zza;
        if (!this.zza.zza().zzd().equals(zzot.zza().zzd()) || !this.zza.zza().zzf().equals(zzot.zza().zzf()) || !this.zza.zza().zze().equals(zzot.zza().zze())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza.zza(), this.zza.zzb()});
    }

    public final String toString() {
        String str;
        String zzf = this.zza.zza().zzf();
        int i10 = zznb.zza[this.zza.zza().zzd().ordinal()];
        if (i10 == 1) {
            str = "TINK";
        } else if (i10 == 2) {
            str = "LEGACY";
        } else if (i10 == 3) {
            str = "RAW";
        } else if (i10 != 4) {
            str = "UNKNOWN";
        } else {
            str = "CRUNCHY";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{zzf, str});
    }

    public final boolean zza() {
        if (this.zza.zza().zzd() != zzvs.RAW) {
            return true;
        }
        return false;
    }

    public final zzot zzb() {
        return this.zza;
    }
}

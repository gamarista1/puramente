package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrr  reason: invalid package */
public final class zzrr {
    private final zzrk zza;
    private final List<zzrt> zzb;
    private final Integer zzc;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrr)) {
            return false;
        }
        zzrr zzrr = (zzrr) obj;
        if (!this.zza.equals(zzrr.zza) || !this.zzb.equals(zzrr.zzb) || !Objects.equals(this.zzc, zzrr.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }

    private zzrr(zzrk zzrk, List<zzrt> list, Integer num) {
        this.zza = zzrk;
        this.zzb = list;
        this.zzc = num;
    }
}

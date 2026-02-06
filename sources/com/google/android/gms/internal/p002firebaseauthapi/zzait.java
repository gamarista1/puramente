package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzait  reason: invalid package */
final class zzait {
    private final Object zza;
    private final int zzb;

    zzait(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzait)) {
            return false;
        }
        zzait zzait = (zzait) obj;
        if (this.zza == zzait.zza && this.zzb == zzait.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}

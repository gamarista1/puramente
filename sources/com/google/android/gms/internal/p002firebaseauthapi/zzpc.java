package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpc  reason: invalid package */
final class zzpc {
    private final Class<? extends zzox> zza;
    private final zzxv zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpc = (zzpc) obj;
        if (!zzpc.zza.equals(this.zza) || !zzpc.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(this.zzb);
        return simpleName + ", object identifier: " + valueOf;
    }

    private zzpc(Class<? extends zzox> cls, zzxv zzxv) {
        this.zza = cls;
        this.zzb = zzxv;
    }
}

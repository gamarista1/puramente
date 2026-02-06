package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoj  reason: invalid package */
final class zzoj {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzoj = (zzoj) obj;
        if (!zzoj.zza.equals(this.zza) || !zzoj.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with primitive type: " + simpleName2;
    }

    private zzoj(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}

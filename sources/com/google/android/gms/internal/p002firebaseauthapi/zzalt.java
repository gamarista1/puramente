package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b.f;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalt  reason: invalid package */
final class zzalt implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzali zzc;

    zzalt(zzali zzali, Map.Entry entry) {
        this(zzali, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzalt) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!zza(this.zza, entry.getKey()) || !zza(this.zzb, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        int i10;
        Comparable comparable = this.zza;
        int i11 = 0;
        if (comparable == null) {
            i10 = 0;
        } else {
            i10 = comparable.hashCode();
        }
        Object obj = this.zzb;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i10 ^ i11;
    }

    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return valueOf + f.f37530b + valueOf2;
    }

    zzalt(zzali zzali, Comparable comparable, Object obj) {
        this.zzc = zzali;
        this.zza = comparable;
        this.zzb = obj;
    }
}

package com.google.android.recaptcha.internal;

import com.amazon.a.a.o.b.f;
import java.util.Map;

final class zzky implements Map.Entry, Comparable {
    final /* synthetic */ zzle zza;
    private final Comparable zzb;
    private Object zzc;

    zzky(zzle zzle, Comparable comparable, Object obj) {
        this.zza = zzle;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzky) obj).zzb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!zzb(this.zzb, entry.getKey()) || !zzb(this.zzc, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        int i10;
        Comparable comparable = this.zzb;
        int i11 = 0;
        if (comparable == null) {
            i10 = 0;
        } else {
            i10 = comparable.hashCode();
        }
        Object obj = this.zzc;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i10 ^ i11;
    }

    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return valueOf + f.f37530b + valueOf2;
    }

    public final Comparable zza() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
public final class zzat<K, V> {
    zzaw zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public zzat() {
        this(4);
    }

    public final zzat<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry entry : iterable) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            zza(this.zzc + 1);
            zzaj.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }

    zzat(int i10) {
        this.zzb = new Object[(i10 * 2)];
        this.zzc = 0;
        this.zzd = false;
    }

    public final zzau<K, V> zza() {
        zzaw zzaw = this.zza;
        if (zzaw == null) {
            int i10 = this.zzc;
            Object[] objArr = this.zzb;
            this.zzd = true;
            zzax zza2 = zzax.zza(i10, objArr, this);
            zzaw zzaw2 = this.zza;
            if (zzaw2 == null) {
                return zza2;
            }
            throw zzaw2.zza();
        }
        throw zzaw.zza();
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzan.zza(objArr.length, i11));
            this.zzd = false;
        }
    }
}

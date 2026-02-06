package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzau  reason: invalid package */
public abstract class zzau<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzav<Map.Entry<K, V>> zzb;
    private transient zzav<K> zzc;
    private transient zzal<V> zzd;

    zzau() {
    }

    public static <K, V> zzau<K, V> zza(Map<? extends K, ? extends V> map) {
        if (!(map instanceof zzau) || (map instanceof SortedMap)) {
            Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
            zzat zzat = new zzat(entrySet instanceof Collection ? entrySet.size() : 4);
            zzat.zza(entrySet);
            return zzat.zza();
        }
        zzau<K, V> zzau = (zzau) map;
        zzau.zzd();
        return zzau;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return ((zzal) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        zzav<Map.Entry<K, V>> zzav = this.zzb;
        if (zzav != null) {
            return zzav;
        }
        zzav<Map.Entry<K, V>> zzb2 = zzb();
        this.zzb = zzb2;
        return zzb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            return v11;
        }
        return v10;
    }

    public int hashCode() {
        return zzbe.zza((zzav) entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Set keySet() {
        zzav<K> zzav = this.zzc;
        if (zzav != null) {
            return zzav;
        }
        zzav<K> zzc2 = zzc();
        this.zzc = zzc2;
        return zzc2;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzaj.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ Collection values() {
        zzal<V> zzal = this.zzd;
        if (zzal != null) {
            return zzal;
        }
        zzal<V> zza2 = zza();
        this.zzd = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzal<V> zza();

    /* access modifiers changed from: package-private */
    public abstract zzav<Map.Entry<K, V>> zzb();

    /* access modifiers changed from: package-private */
    public abstract zzav<K> zzc();

    /* access modifiers changed from: package-private */
    public abstract boolean zzd();
}

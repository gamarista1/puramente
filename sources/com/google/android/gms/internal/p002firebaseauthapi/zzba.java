package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba  reason: invalid package */
final class zzba<K, V> extends zzav<Map.Entry<K, V>> {
    private final transient zzau<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    private final transient int zzc = 0;
    /* access modifiers changed from: private */
    public final transient int zzd;

    zzba(zzau<K, V> zzau, Object[] objArr, int i10, int i11) {
        this.zza = zzau;
        this.zzb = objArr;
        this.zzd = i11;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zzd;
    }

    public final zzbd<Map.Entry<K, V>> zzd() {
        return (zzbd) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final zzaq<Map.Entry<K, V>> zzg() {
        return new zzaz(this);
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }
}

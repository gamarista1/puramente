package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class zzcr implements Map, Serializable {
    private transient zzcv zza;
    private transient zzcv zzb;
    private transient zzcj zzc;

    zzcr() {
    }

    public static zzcr zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzbw.zzb("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzbw.zzb("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzbw.zzb("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzdp.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, (zzcq) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return zzds.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcv zzcv = this.zzb;
        if (zzcv != null) {
            return zzcv;
        }
        zzcv zze = zze();
        this.zzb = zze;
        return zze;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzbw.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
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

    /* access modifiers changed from: package-private */
    public abstract zzcj zza();

    /* renamed from: zzb */
    public final zzcj values() {
        zzcj zzcj = this.zzc;
        if (zzcj != null) {
            return zzcj;
        }
        zzcj zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzcv zzd();

    /* access modifiers changed from: package-private */
    public abstract zzcv zze();

    /* renamed from: zzf */
    public final zzcv entrySet() {
        zzcv zzcv = this.zza;
        if (zzcv != null) {
            return zzcv;
        }
        zzcv zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}

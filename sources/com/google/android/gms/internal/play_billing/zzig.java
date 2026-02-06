package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzig extends LinkedHashMap {
    private static final zzig zza;
    private boolean zzb = true;

    static {
        zzig zzig = new zzig();
        zza = zzig;
        zzig.zzb = false;
    }

    private zzig() {
    }

    public static zzig zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzhp.zzb;
            int length = bArr.length;
            int zzb2 = zzhp.zzb(length, bArr, 0, length);
            if (zzb2 == 0) {
                return 1;
            }
            return zzb2;
        } else if (!(obj instanceof zzkn)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zzhp.zzb;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            byte[] bArr = zzhp.zzb;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzig zzb() {
        if (isEmpty()) {
            return new zzig();
        }
        return new zzig(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzig zzig) {
        zzg();
        if (!zzig.isEmpty()) {
            putAll(zzig);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzig(Map map) {
        super(map);
    }
}

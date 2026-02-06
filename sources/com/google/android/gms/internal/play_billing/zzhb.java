package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhb {
    private static final zzhb zzb = new zzhb(true);
    final zzjf zza = new zzja();
    private boolean zzc;
    private boolean zzd;

    private zzhb() {
    }

    static int zza(zzju zzju, int i10, Object obj) {
        zzgr.zzz(i10 << 3);
        if (zzju.GROUP == null) {
            byte[] bArr = zzhp.zzb;
            if (((zzim) obj) instanceof zzfw) {
                throw null;
            }
        }
        zzjv zzjv = zzjv.INT;
        throw null;
    }

    public static int zzb(zzha zzha, Object obj) {
        zzju zzb2 = zzha.zzb();
        int zza2 = zzha.zza();
        if (!zzha.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zzha.zzd()) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += zza(zzb2, zza2, list.get(i11));
            }
            return i10;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            if (size <= 0) {
                return zzgr.zzz(zza2 << 3) + zzgr.zzz(0);
            }
            list.get(0);
            zzju zzju = zzju.DOUBLE;
            zzjv zzjv = zzjv.INT;
            throw null;
        }
    }

    public static zzhb zzd() {
        return zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzha zzha = (zzha) entry.getKey();
        if (zzha.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!zzha.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzj(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzin) {
            return ((zzin) obj).zzl();
        }
        if (obj instanceof zzhw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i10;
        int zzz;
        int zzz2;
        int zzk;
        int zzz3;
        zzha zzha = (zzha) entry.getKey();
        Object value = entry.getValue();
        if (zzha.zzc() != zzjv.MESSAGE || zzha.zze() || zzha.zzd()) {
            return zzb(zzha, value);
        }
        if (value instanceof zzhw) {
            int zza2 = ((zzha) entry.getKey()).zza();
            int zzz4 = zzgr.zzz(8);
            i10 = zzz4 + zzz4;
            zzz = zzgr.zzz(16) + zzgr.zzz(zza2);
            zzz2 = zzgr.zzz(24);
            zzk = ((zzhw) value).zza();
            zzz3 = zzgr.zzz(zzk);
        } else {
            int zza3 = ((zzha) entry.getKey()).zza();
            int zzz5 = zzgr.zzz(8);
            i10 = zzz5 + zzz5;
            zzz = zzgr.zzz(16) + zzgr.zzz(zza3);
            zzz2 = zzgr.zzz(24);
            zzk = ((zzim) value).zzk();
            zzz3 = zzgr.zzz(zzk);
        }
        return i10 + zzz + zzz2 + zzz3 + zzk;
    }

    private static final void zzl(zzha zzha, Object obj) {
        boolean z10;
        zzju zzb2 = zzha.zzb();
        byte[] bArr = zzhp.zzb;
        obj.getClass();
        zzju zzju = zzju.DOUBLE;
        zzjv zzjv = zzjv.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzim) || (obj instanceof zzhw)) {
                    return;
                }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzha.zza()), zzha.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzhb zzhb = new zzhb();
        int zzc2 = this.zza.zzc();
        for (int i10 = 0; i10 < zzc2; i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzhb.zzg((zzha) ((zzjb) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhb.zzg((zzha) entry.getKey(), entry.getValue());
        }
        zzhb.zzd = this.zzd;
        return zzhb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhb)) {
            return false;
        }
        return this.zza.equals(((zzhb) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int zzc2 = this.zza.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc2; i11++) {
            i10 += zzk(this.zza.zzg(i11));
        }
        for (Map.Entry zzk : this.zza.zzd()) {
            i10 += zzk(zzk);
        }
        return i10;
    }

    public final Iterator zze() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzhu(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (!this.zzc) {
            int zzc2 = this.zza.zzc();
            for (int i10 = 0; i10 < zzc2; i10++) {
                Object value = this.zza.zzg(i10).getValue();
                if (value instanceof zzhk) {
                    ((zzhk) value).zzv();
                }
            }
            for (Map.Entry value2 : this.zza.zzd()) {
                Object value3 = value2.getValue();
                if (value3 instanceof zzhk) {
                    ((zzhk) value3).zzv();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzg(zzha zzha, Object obj) {
        if (!zzha.zze()) {
            zzl(zzha, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzl(zzha, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzhw) {
            this.zzd = true;
        }
        this.zza.put(zzha, obj);
    }

    public final boolean zzh() {
        int zzc2 = this.zza.zzc();
        for (int i10 = 0; i10 < zzc2; i10++) {
            if (!zzi(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry zzi : this.zza.zzd()) {
            if (!zzi(zzi)) {
                return false;
            }
        }
        return true;
    }

    private zzhb(boolean z10) {
        zzf();
        zzf();
    }
}

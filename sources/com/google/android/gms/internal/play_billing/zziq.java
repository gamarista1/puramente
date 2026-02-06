package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class zziq implements zzix {
    private final zzim zza;
    private final zzjj zzb;
    private final boolean zzc;
    private final zzgx zzd;

    private zziq(zzjj zzjj, zzgx zzgx, zzim zzim) {
        this.zzb = zzjj;
        this.zzc = zzim instanceof zzhh;
        this.zzd = zzgx;
        this.zza = zzim;
    }

    static zziq zzc(zzjj zzjj, zzgx zzgx, zzim zzim) {
        return new zziq(zzjj, zzgx, zzim);
    }

    public final int zza(Object obj) {
        int zzb2 = ((zzhk) obj).zzc.zzb();
        if (this.zzc) {
            return zzb2 + ((zzhh) obj).zzb.zzc();
        }
        return zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zzhk) obj).zzc.hashCode();
        if (this.zzc) {
            return (hashCode * 53) + ((zzhh) obj).zzb.zza.hashCode();
        }
        return hashCode;
    }

    public final Object zze() {
        zzim zzim = this.zza;
        if (zzim instanceof zzhk) {
            return ((zzhk) zzim).zzp();
        }
        return zzim.zzI().zzh();
    }

    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zziz.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zziz.zzo(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzfz zzfz) {
        zzhk zzhk = (zzhk) obj;
        if (zzhk.zzc == zzjk.zzc()) {
            zzhk.zzc = zzjk.zzf();
        }
        zzhh zzhh = (zzhh) obj;
        throw null;
    }

    public final void zzi(Object obj, zzjw zzjw) {
        Iterator zze = ((zzhh) obj).zzb.zze();
        while (zze.hasNext()) {
            Map.Entry entry = (Map.Entry) zze.next();
            zzha zzha = (zzha) entry.getKey();
            if (zzha.zzc() != zzjv.MESSAGE || zzha.zze() || zzha.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzht) {
                zzjw.zzw(zzha.zza(), ((zzht) entry).zza().zzb());
            } else {
                zzjw.zzw(zzha.zza(), entry.getValue());
            }
        }
        ((zzhk) obj).zzc.zzk(zzjw);
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    public final boolean zzk(Object obj) {
        return ((zzhh) obj).zzb.zzh();
    }
}

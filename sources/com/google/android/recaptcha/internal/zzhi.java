package com.google.android.recaptcha.internal;

import java.util.List;

final class zzhi implements zzmd {
    private final zzhh zza;

    private zzhi(zzhh zzhh) {
        byte[] bArr = zzjc.zzd;
        this.zza = zzhh;
        zzhh.zza = this;
    }

    public static zzhi zza(zzhh zzhh) {
        zzhi zzhi = zzhh.zza;
        if (zzhi != null) {
            return zzhi;
        }
        return new zzhi(zzhh);
    }

    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzhh.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzhh zzhh = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzhh.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzhh zzhh2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzhh2.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzD(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzhh.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzhh zzhh = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzhh.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzhh zzhh2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzhh2.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzjm) {
            zzjm zzjm = (zzjm) list;
            while (i11 < list.size()) {
                Object zzf = zzjm.zzf(i11);
                if (zzf instanceof String) {
                    this.zza.zzm(i10, (String) zzf);
                } else {
                    this.zza.zze(i10, (zzgw) zzf);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzy(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzK(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void zzd(int i10, zzgw zzgw) {
        this.zza.zze(i10, zzgw);
    }

    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzgw) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void zzq(int i10, Object obj, zzkr zzkr) {
        zzhh zzhh = this.zza;
        zzhh.zzo(i10, 3);
        zzkr.zzj((zzke) obj, zzhh.zza);
        zzhh.zzo(i10, 4);
    }

    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzhh.zzz(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzv(int i10, Object obj, zzkr zzkr) {
        zzke zzke = (zzke) obj;
        zzhe zzhe = (zzhe) this.zza;
        zzhe.zzq((i10 << 3) | 2);
        zzhe.zzq(((zzgf) zzke).zza(zzkr));
        zzkr.zzj(zzke, zzhe.zza);
    }

    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzgw) {
            zzhe zzhe = (zzhe) this.zza;
            zzhe.zzq(11);
            zzhe.zzp(2, i10);
            zzhe.zze(3, (zzgw) obj);
            zzhe.zzq(12);
            return;
        }
        zzhh zzhh = this.zza;
        zzke zzke = (zzke) obj;
        zzhe zzhe2 = (zzhe) zzhh;
        zzhe2.zzq(11);
        zzhe2.zzp(2, i10);
        zzhe2.zzq(26);
        zzhe2.zzq(zzke.zzn());
        zzke.zze(zzhh);
        zzhe2.zzq(12);
    }

    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}

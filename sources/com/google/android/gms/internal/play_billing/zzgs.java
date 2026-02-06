package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zzgs implements zzjw {
    private final zzgr zza;

    private zzgs(zzgr zzgr) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgr;
        zzgr.zza = this;
    }

    public static zzgs zza(zzgr zzgr) {
        zzgs zzgs = zzgr.zza;
        if (zzgs != null) {
            return zzgs;
        }
        return new zzgs(zzgr);
    }

    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzib.size(); i13++) {
                    zzib.zze(i13);
                    i12 += 8;
                }
                this.zza.zzt(i12);
                while (i11 < zzib.size()) {
                    this.zza.zzi(zzib.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzib.size()) {
                this.zza.zzh(i10, zzib.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzB(int i10, int i11) {
        this.zza.zzs(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    int zze = zzhl.zze(i13);
                    i12 += zzgr.zzz((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    zzgr zzgr = this.zza;
                    int zze2 = zzhl.zze(i11);
                    zzgr.zzt((zze2 >> 31) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                zzgr zzgr2 = this.zza;
                int zze3 = zzhl.zze(i11);
                zzgr2.zzs(i10, (zze3 >> 31) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                int intValue = ((Integer) list.get(i15)).intValue();
                i14 += zzgr.zzz((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                zzgr zzgr3 = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzgr3.zzt((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzgr zzgr4 = this.zza;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzgr4.zzs(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public final void zzD(int i10, long j10) {
        this.zza.zzu(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzib.size(); i13++) {
                    long zze = zzib.zze(i13);
                    i12 += zzgr.zzA((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzt(i12);
                while (i11 < zzib.size()) {
                    zzgr zzgr = this.zza;
                    long zze2 = zzib.zze(i11);
                    zzgr.zzv((zze2 >> 63) ^ (zze2 + zze2));
                    i11++;
                }
                return;
            }
            while (i11 < zzib.size()) {
                zzgr zzgr2 = this.zza;
                long zze3 = zzib.zze(i11);
                zzgr2.zzu(i10, (zze3 >> 63) ^ (zze3 + zze3));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                long longValue = ((Long) list.get(i15)).longValue();
                i14 += zzgr.zzA((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                zzgr zzgr3 = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzgr3.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                zzgr zzgr4 = this.zza;
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzgr4.zzu(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzr(i10, 3);
    }

    public final void zzG(int i10, String str) {
        this.zza.zzp(i10, str);
    }

    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            while (i11 < list.size()) {
                Object zzc = zzhy.zzc();
                if (zzc instanceof String) {
                    this.zza.zzp(i10, (String) zzc);
                } else {
                    this.zza.zze(i10, (zzgk) zzc);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzI(int i10, int i11) {
        this.zza.zzs(i10, i11);
    }

    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    i12 += zzgr.zzz(zzhl.zze(i13));
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    this.zza.zzt(zzhl.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                this.zza.zzs(i10, zzhl.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgr.zzz(((Integer) list.get(i15)).intValue());
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzs(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzK(int i10, long j10) {
        this.zza.zzu(i10, j10);
    }

    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzib.size(); i13++) {
                    i12 += zzgr.zzA(zzib.zze(i13));
                }
                this.zza.zzt(i12);
                while (i11 < zzib.size()) {
                    this.zza.zzv(zzib.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzib.size()) {
                this.zza.zzu(i10, zzib.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgr.zzA(((Long) list.get(i15)).longValue());
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgb) {
            zzgb zzgb = (zzgb) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgb.size(); i13++) {
                    zzgb.zzf(i13);
                    i12++;
                }
                this.zza.zzt(i12);
                while (i11 < zzgb.size()) {
                    this.zza.zzb(zzgb.zzf(i11) ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            while (i11 < zzgb.size()) {
                this.zza.zzd(i10, zzgb.zzf(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Boolean) list.get(i15)).booleanValue();
                i14++;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public final void zzd(int i10, zzgk zzgk) {
        this.zza.zze(i10, zzgk);
    }

    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzgk) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzgt.size(); i13++) {
                    zzgt.zze(i13);
                    i12 += 8;
                }
                this.zza.zzt(i12);
                while (i11 < zzgt.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzgt.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzgt.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzgt.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).doubleValue();
                i14 += 8;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzr(i10, 4);
    }

    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    i12 += zzgr.zzA((long) zzhl.zze(i13));
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    this.zza.zzk(zzhl.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                this.zza.zzj(i10, zzhl.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgr.zzA((long) ((Integer) list.get(i15)).intValue());
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    zzhl.zze(i13);
                    i12 += 4;
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    this.zza.zzg(zzhl.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                this.zza.zzf(i10, zzhl.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzib.size(); i13++) {
                    zzib.zze(i13);
                    i12 += 8;
                }
                this.zza.zzt(i12);
                while (i11 < zzib.size()) {
                    this.zza.zzi(zzib.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzib.size()) {
                this.zza.zzh(i10, zzib.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).longValue();
                i14 += 8;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhd) {
            zzhd zzhd = (zzhd) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhd.size(); i13++) {
                    zzhd.zze(i13);
                    i12 += 4;
                }
                this.zza.zzt(i12);
                while (i11 < zzhd.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzhd.zze(i11)));
                    i11++;
                }
                return;
            }
            while (i11 < zzhd.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzhd.zze(i11)));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Float) list.get(i15)).floatValue();
                i14 += 4;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    public final void zzq(int i10, Object obj, zzix zzix) {
        zzgr zzgr = this.zza;
        zzgr.zzr(i10, 3);
        zzix.zzi((zzim) obj, zzgr.zza);
        zzgr.zzr(i10, 4);
    }

    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    i12 += zzgr.zzA((long) zzhl.zze(i13));
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    this.zza.zzk(zzhl.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                this.zza.zzj(i10, zzhl.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgr.zzA((long) ((Integer) list.get(i15)).intValue());
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzt(int i10, long j10) {
        this.zza.zzu(i10, j10);
    }

    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzib.size(); i13++) {
                    i12 += zzgr.zzA(zzib.zze(i13));
                }
                this.zza.zzt(i12);
                while (i11 < zzib.size()) {
                    this.zza.zzv(zzib.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzib.size()) {
                this.zza.zzu(i10, zzib.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzgr.zzA(((Long) list.get(i15)).longValue());
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public final void zzv(int i10, Object obj, zzix zzix) {
        this.zza.zzm(i10, (zzim) obj, zzix);
    }

    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzgk) {
            this.zza.zzo(i10, (zzgk) obj);
        } else {
            this.zza.zzn(i10, (zzim) obj);
        }
    }

    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z10) {
                this.zza.zzr(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhl.size(); i13++) {
                    zzhl.zze(i13);
                    i12 += 4;
                }
                this.zza.zzt(i12);
                while (i11 < zzhl.size()) {
                    this.zza.zzg(zzhl.zze(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhl.size()) {
                this.zza.zzf(i10, zzhl.zze(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzr(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Integer) list.get(i15)).intValue();
                i14 += 4;
            }
            this.zza.zzt(i14);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}

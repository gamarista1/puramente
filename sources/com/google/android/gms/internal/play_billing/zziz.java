package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zziz {
    public static final /* synthetic */ int zza = 0;
    private static final zzjj zzb = new zzjl();

    static {
        int i10 = zziu.zza;
    }

    public static void zzA(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzC(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzE(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzJ(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzL(i10, list, z10);
        }
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgr.zzA((long) zzhl.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgr.zzA((long) ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgr.zzz(i10 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgr.zzz(i10 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgr.zzA((long) zzhl.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgr.zzA((long) ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgr.zzA(zzib.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgr.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzh(int i10, Object obj, zzix zzix) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzhx)) {
            return zzgr.zzz(i11) + zzgr.zzx((zzim) obj, zzix);
        }
        int zzz = zzgr.zzz(i11);
        int zza2 = ((zzhx) obj).zza();
        return zzz + zzgr.zzz(zza2) + zza2;
    }

    static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzhl.zze(i11);
                i10 += zzgr.zzz((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzgr.zzz((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzib.zze(i11);
                i10 += zzgr.zzA((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzgr.zzA((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgr.zzz(zzhl.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgr.zzz(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgr.zzA(zzib.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgr.zzA(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzjj zzm() {
        return zzb;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.play_billing.zzjj r6) {
        /*
            if (r5 != 0) goto L_0x0012
            com.google.android.gms.internal.play_billing.zzhk r2 = (com.google.android.gms.internal.play_billing.zzhk) r2
            com.google.android.gms.internal.play_billing.zzjk r5 = r2.zzc
            com.google.android.gms.internal.play_billing.zzjk r6 = com.google.android.gms.internal.play_billing.zzjk.zzc()
            if (r5 != r6) goto L_0x0012
            com.google.android.gms.internal.play_billing.zzjk r5 = com.google.android.gms.internal.play_billing.zzjk.zzf()
            r2.zzc = r5
        L_0x0012:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.play_billing.zzjk r3 = (com.google.android.gms.internal.play_billing.zzjk) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zziz.zzn(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.play_billing.zzjj):java.lang.Object");
    }

    static void zzo(zzgx zzgx, Object obj, Object obj2) {
        if (!((zzhh) obj2).zzb.zza.isEmpty()) {
            zzhh zzhh = (zzhh) obj;
            throw null;
        }
    }

    static void zzp(zzjj zzjj, Object obj, Object obj2) {
        zzhk zzhk = (zzhk) obj;
        zzjk zzjk = zzhk.zzc;
        zzjk zzjk2 = ((zzhk) obj2).zzc;
        if (!zzjk.zzc().equals(zzjk2)) {
            if (zzjk.zzc().equals(zzjk)) {
                zzjk = zzjk.zze(zzjk, zzjk2);
            } else {
                zzjk.zzd(zzjk2);
            }
        }
        zzhk.zzc = zzjk;
    }

    public static void zzq(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzc(i10, list, z10);
        }
    }

    public static void zzr(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzg(i10, list, z10);
        }
    }

    public static void zzs(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzj(i10, list, z10);
        }
    }

    public static void zzt(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzl(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzn(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzp(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzs(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzu(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzy(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzjw zzjw, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzA(i10, list, z10);
        }
    }
}

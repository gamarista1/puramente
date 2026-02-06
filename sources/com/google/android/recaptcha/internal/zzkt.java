package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzll zzc;
    private static final zzll zzd = new zzln();

    static {
        Class<?> cls;
        Class<?> cls2;
        zzll zzll = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzll = (zzll) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzll;
    }

    public static void zzA(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzy(i10, list, z10);
        }
    }

    public static void zzC(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzA(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzC(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzE(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzJ(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzL(i10, list, z10);
        }
    }

    static boolean zzH(Object obj, Object obj2) {
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
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(zziu.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzhh.zzu(((Integer) list.get(i11)).intValue());
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
        return size * (zzhh.zzy(i10 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhh.zzy(i10 << 3) + 8);
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
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(zziu.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzhh.zzu(((Integer) list.get(i11)).intValue());
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
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(zzjt.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzhh.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzh(int i10, Object obj, zzkr zzkr) {
        int i11 = i10 << 3;
        if (obj instanceof zzjk) {
            int i12 = zzhh.zzb;
            int zza2 = ((zzjk) obj).zza();
            return zzhh.zzy(i11) + zzhh.zzy(zza2) + zza2;
        }
        return zzhh.zzy(i11) + zzhh.zzw((zzke) obj, zzkr);
    }

    static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zziu.zze(i11);
                i10 += zzhh.zzy((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzhh.zzy((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzjt.zze(i11);
                i10 += zzhh.zzz((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzhh.zzz((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zziu) {
            zziu zziu = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzy(zziu.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzhh.zzy(((Integer) list.get(i11)).intValue());
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
        if (list instanceof zzjt) {
            zzjt zzjt = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(zzjt.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzhh.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzll zzm() {
        return zzc;
    }

    public static zzll zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i10, List list, zzix zzix, Object obj2, zzll zzll) {
        if (zzix == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int intValue = num.intValue();
                if (zzix.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zzll);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzix.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zzll);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i10, int i11, Object obj2, zzll zzll) {
        if (obj2 == null) {
            obj2 = zzll.zzc(obj);
        }
        zzll.zzl(obj2, i10, (long) i11);
        return obj2;
    }

    static void zzq(zzif zzif, Object obj, Object obj2) {
        zzij zzb2 = zzif.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzif.zzc(obj).zzh(zzb2);
        }
    }

    static void zzr(zzll zzll, Object obj, Object obj2) {
        zzll.zzo(obj, zzll.zze(zzll.zzd(obj), zzll.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzit.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzc(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzg(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzj(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzl(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzn(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzp(i10, list, z10);
        }
    }

    public static void zzz(int i10, List list, zzmd zzmd, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzmd.zzs(i10, list, z10);
        }
    }
}

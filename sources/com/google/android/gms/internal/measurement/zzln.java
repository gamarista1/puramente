package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzln {
    private static final zzmf<?, ?> zza = new zzmh();

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzb(i10, true);
    }

    static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzit.zzi(i10));
    }

    static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzf(i10, 0);
    }

    static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzc(i10, 0);
    }

    static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzit.zzi(i10));
    }

    static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzit.zzi(i10));
    }

    static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzit.zzi(i10));
    }

    static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzit.zzi(i10));
    }

    static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzit.zzi(i10));
    }

    static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzit.zzi(i10));
    }

    public static void zzk(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzn(i10, list, z10);
        }
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i10, List<zzia> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzit.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzit.zzb(list.get(i11));
        }
        return zzi;
    }

    static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzd(zzjn.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzd(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzc(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzc(i10, list, z10);
        }
    }

    public static void zzd(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzd(i10, list, z10);
        }
    }

    static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzf(zzjn.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzd(zzke.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzh(zzjn.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzf(zzke.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzj(zzjn.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzit.zzg(zzke.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzit.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zza(int i10, List<zzkt> list, zzll zzll) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzit.zzb(i10, list.get(i12), zzll);
        }
        return i11;
    }

    static int zzb(int i10, List<?> list, zzll zzll) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzkb) {
                zza2 = zzit.zza((zzkb) obj);
            } else {
                zza2 = zzit.zza((zzkt) obj, zzll);
            }
            zzi += zza2;
        }
        return zzi;
    }

    public static void zze(int i10, List<Long> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zze(i10, list, z10);
        }
    }

    public static void zzf(int i10, List<Float> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzf(i10, list, z10);
        }
    }

    public static void zzg(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzg(i10, list, z10);
        }
    }

    public static void zzh(int i10, List<Long> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzh(i10, list, z10);
        }
    }

    public static void zzi(int i10, List<Integer> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzi(i10, list, z10);
        }
    }

    public static void zzj(int i10, List<Long> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzj(i10, list, z10);
        }
    }

    static int zza(int i10, Object obj, zzll zzll) {
        if (obj instanceof zzkb) {
            return zzit.zzb(i10, (zzkb) obj);
        }
        return zzit.zzc(i10, (zzkt) obj, zzll);
    }

    public static zzmf<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzjo zzjo, UB ub2, zzmf<UT, UB> zzmf) {
        if (zzjo == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (zzjo.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = zza(obj, i10, intValue, ub2, zzmf);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjo.zza(intValue2)) {
                    ub2 = zza(obj, i10, intValue2, ub2, zzmf);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    static int zzb(int i10, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i10) * size;
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            while (i11 < size) {
                Object zza2 = zzka.zza(i11);
                if (zza2 instanceof zzia) {
                    zzb2 = zzit.zzb((zzia) zza2);
                } else {
                    zzb2 = zzit.zzb((String) zza2);
                }
                zzi += zzb2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzia) {
                    zzb = zzit.zzb((zzia) obj);
                } else {
                    zzb = zzit.zzb((String) obj);
                }
                zzi += zzb;
                i11++;
            }
        }
        return zzi;
    }

    static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzmf<UT, UB> zzmf) {
        if (ub2 == null) {
            ub2 = zzmf.zzc(obj);
        }
        zzmf.zzb(ub2, i10, (long) i11);
        return ub2;
    }

    public static void zzb(int i10, List<Double> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zzb(i10, list, z10);
        }
    }

    static <T, FT extends zzjf<FT>> void zza(zziz<FT> zziz, T t10, T t11) {
        zzjd<FT> zza2 = zziz.zza((Object) t11);
        if (!zza2.zza.isEmpty()) {
            zziz.zzb(t10).zza(zza2);
        }
    }

    public static void zzb(int i10, List<?> list, zzna zzna, zzll zzll) {
        if (list != null && !list.isEmpty()) {
            zzna.zzb(i10, list, zzll);
        }
    }

    public static void zzb(int i10, List<String> list, zzna zzna) {
        if (list != null && !list.isEmpty()) {
            zzna.zzb(i10, list);
        }
    }

    static <T> void zza(zzkm zzkm, T t10, T t11, long j10) {
        zzmg.zza((Object) t10, j10, zzkm.zza(zzmg.zze(t10, j10), zzmg.zze(t11, j10)));
    }

    static <T, UT, UB> void zza(zzmf<UT, UB> zzmf, T t10, T t11) {
        zzmf.zzc(t10, zzmf.zza(zzmf.zzd(t10), zzmf.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        zzjk.class.isAssignableFrom(cls);
    }

    public static void zza(int i10, List<Boolean> list, zzna zzna, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzna.zza(i10, list, z10);
        }
    }

    public static void zza(int i10, List<zzia> list, zzna zzna) {
        if (list != null && !list.isEmpty()) {
            zzna.zza(i10, list);
        }
    }

    public static void zza(int i10, List<?> list, zzna zzna, zzll zzll) {
        if (list != null && !list.isEmpty()) {
            zzna.zza(i10, list, zzll);
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

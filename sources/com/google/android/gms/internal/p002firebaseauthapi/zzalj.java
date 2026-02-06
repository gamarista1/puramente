package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalj  reason: invalid package */
final class zzalj {
    private static final Class<?> zza = zzd();
    private static final zzamg<?, ?> zzb = zzc();
    private static final zzamg<?, ?> zzc = new zzami();

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaim.zza(i10, true);
    }

    static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaim.zzi(i10));
    }

    static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaim.zzc(i10, 0);
    }

    static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaim.zza(i10, 0);
    }

    static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaim.zzi(i10));
    }

    static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaim.zzi(i10));
    }

    static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaim.zzi(i10));
    }

    static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaim.zzi(i10));
    }

    static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaim.zzi(i10));
    }

    static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaim.zzi(i10));
    }

    public static void zzk(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzn(i10, list, z10);
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

    static int zza(int i10, List<zzaho> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzaim.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzaim.zza(list.get(i11));
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
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzc(zzajf.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static zzamg<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzamg) zze.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zze(zzajf.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zze(list.get(i11).intValue());
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
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzd(zzaka.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzd(list.get(i11).longValue());
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
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzh(zzajf.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzh(list.get(i11).intValue());
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
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzf(zzaka.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzf(list.get(i11).longValue());
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
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzj(zzajf.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzj(list.get(i11).intValue());
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
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaim.zzg(zzaka.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaim.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzd(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzd(i10, list, z10);
        }
    }

    public static void zzc(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzc(i10, list, z10);
        }
    }

    static int zza(int i10, List<zzakp> list, zzalh zzalh) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzaim.zza(i10, list.get(i12), zzalh);
        }
        return i11;
    }

    static int zzb(int i10, List<?> list, zzalh zzalh) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzaim.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzajt) {
                zza2 = zzaim.zza((zzajt) obj);
            } else {
                zza2 = zzaim.zza((zzakp) obj, zzalh);
            }
            zzi += zza2;
        }
        return zzi;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i10, List<Float> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzf(i10, list, z10);
        }
    }

    public static void zzg(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzg(i10, list, z10);
        }
    }

    public static void zzh(int i10, List<Long> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzh(i10, list, z10);
        }
    }

    public static void zzi(int i10, List<Integer> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzi(i10, list, z10);
        }
    }

    public static void zzj(int i10, List<Long> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzj(i10, list, z10);
        }
    }

    static int zza(int i10, Object obj, zzalh zzalh) {
        if (obj instanceof zzajt) {
            return zzaim.zzb(i10, (zzajt) obj);
        }
        return zzaim.zzb(i10, (zzakp) obj, zzalh);
    }

    public static void zze(int i10, List<Long> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zze(i10, list, z10);
        }
    }

    public static zzamg<?, ?> zza() {
        return zzb;
    }

    static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzaji zzaji, UB ub2, zzamg<UT, UB> zzamg) {
        if (zzaji == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (zzaji.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = zza(obj, i10, intValue, ub2, zzamg);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzaji.zza(intValue2)) {
                    ub2 = zza(obj, i10, intValue2, ub2, zzamg);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    static int zzb(int i10, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzaim.zzi(i10) * size;
        if (list instanceof zzajv) {
            zzajv zzajv = (zzajv) list;
            while (i11 < size) {
                Object zzb2 = zzajv.zzb(i11);
                if (zzb2 instanceof zzaho) {
                    zza3 = zzaim.zza((zzaho) zzb2);
                } else {
                    zza3 = zzaim.zza((String) zzb2);
                }
                zzi += zza3;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzaho) {
                    zza2 = zzaim.zza((zzaho) obj);
                } else {
                    zza2 = zzaim.zza((String) obj);
                }
                zzi += zza2;
                i11++;
            }
        }
        return zzi;
    }

    static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzamg<UT, UB> zzamg) {
        if (ub2 == null) {
            ub2 = zzamg.zzc(obj);
        }
        zzamg.zzb(ub2, i10, (long) i11);
        return ub2;
    }

    public static zzamg<?, ?> zzb() {
        return zzc;
    }

    static <T, FT extends zzaiz<FT>> void zza(zzais<FT> zzais, T t10, T t11) {
        zzaix<FT> zza2 = zzais.zza((Object) t11);
        if (!zza2.zza.isEmpty()) {
            zzais.zzb(t10).zza(zza2);
        }
    }

    public static void zzb(int i10, List<Double> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzb(i10, list, z10);
        }
    }

    public static void zzb(int i10, List<?> list, zzanc zzanc, zzalh zzalh) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzb(i10, list, zzalh);
        }
    }

    static <T> void zza(zzaki zzaki, T t10, T t11, long j10) {
        zzamm.zza((Object) t10, j10, zzaki.zza(zzamm.zze(t10, j10), zzamm.zze(t11, j10)));
    }

    public static void zzb(int i10, List<String> list, zzanc zzanc) {
        if (list != null && !list.isEmpty()) {
            zzanc.zzb(i10, list);
        }
    }

    static <T, UT, UB> void zza(zzamg<UT, UB> zzamg, T t10, T t11) {
        zzamg.zzc(t10, zzamg.zza(zzamg.zzd(t10), zzamg.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzaje.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzanc zzanc, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzanc.zza(i10, list, z10);
        }
    }

    public static void zza(int i10, List<zzaho> list, zzanc zzanc) {
        if (list != null && !list.isEmpty()) {
            zzanc.zza(i10, list);
        }
    }

    public static void zza(int i10, List<?> list, zzanc zzanc, zzalh zzalh) {
        if (list != null && !list.isEmpty()) {
            zzanc.zza(i10, list, zzalh);
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

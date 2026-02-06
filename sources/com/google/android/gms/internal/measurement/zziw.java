package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class zziw implements zzna {
    private final zzit zza;

    private zziw(zzit zzit) {
        zzit zzit2 = (zzit) zzjm.zza(zzit, "output");
        this.zza = zzit2;
        zzit2.zza = this;
    }

    public final int zza() {
        return 1;
    }

    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zziv) {
            zziv zziv = (zziv) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zziv.size(); i13++) {
                    i12 += zzit.zza(zziv.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zziv.size()) {
                    this.zza.zzb(zziv.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zziv.size()) {
                this.zza.zzb(i10, zziv.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zza(list.get(i15).doubleValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
        }
    }

    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zzd(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zzb(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zzb(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzd(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zze(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zza(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zza(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zze(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzke.size(); i13++) {
                    i12 += zzit.zzc(zzke.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzke.size()) {
                    this.zza.zza(zzke.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzke.size()) {
                this.zza.zza(i10, zzke.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzc(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjj) {
            zzjj zzjj = (zzjj) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjj.size(); i13++) {
                    i12 += zzit.zza(zzjj.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjj.size()) {
                    this.zza.zzb(zzjj.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjj.size()) {
                this.zza.zzb(i10, zzjj.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zza(list.get(i15).floatValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
        }
    }

    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zzf(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zzb(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zzb(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzf(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzke.size(); i13++) {
                    i12 += zzit.zzd(zzke.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzke.size()) {
                    this.zza.zzb(zzke.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzke.size()) {
                this.zza.zzb(i10, zzke.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzd(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zzg(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zza(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zza(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzg(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzke.size(); i13++) {
                    i12 += zzit.zze(zzke.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzke.size()) {
                    this.zza.zza(zzke.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzke.size()) {
                this.zza.zza(i10, zzke.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zze(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zzh(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zzk(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zzk(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzh(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzk(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzke.size(); i13++) {
                    i12 += zzit.zzf(zzke.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzke.size()) {
                    this.zza.zzh(zzke.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzke.size()) {
                this.zza.zzh(i10, zzke.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzf(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjn.size(); i13++) {
                    i12 += zzit.zzj(zzjn.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjn.size()) {
                    this.zza.zzc(zzjn.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjn.size()) {
                this.zza.zzd(i10, zzjn.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzj(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzc(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzd(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzke.size(); i13++) {
                    i12 += zzit.zzg(zzke.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzke.size()) {
                    this.zza.zzb(zzke.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzke.size()) {
                this.zza.zzb(i10, zzke.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zzg(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public static zziw zza(zzit zzit) {
        zziw zziw = zzit.zza;
        if (zziw != null) {
            return zziw;
        }
        return new zziw(zzit);
    }

    public final void zza(int i10, boolean z10) {
        this.zza.zza(i10, z10);
    }

    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzhy.size(); i13++) {
                    i12 += zzit.zza(zzhy.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzhy.size()) {
                    this.zza.zzb(zzhy.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzhy.size()) {
                this.zza.zza(i10, zzhy.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzit.zza(list.get(i15).booleanValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    public final void zzb(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    public final void zzd(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    public final void zze(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    public final void zzf(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    public final void zzb(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    public final void zze(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    public final void zzd(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzb(int i10, Object obj, zzll zzll) {
        this.zza.zza(i10, (zzkt) obj, zzll);
    }

    public final void zza(int i10, zzia zzia) {
        this.zza.zza(i10, zzia);
    }

    public final void zzb(int i10, List<?> list, zzll zzll) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, (Object) list.get(i11), zzll);
        }
    }

    public final void zzc(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    public final void zza(int i10, List<zzia> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    public final void zzc(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzc(i10, 3);
    }

    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            while (i11 < list.size()) {
                Object zza2 = zzka.zza(i11);
                if (zza2 instanceof String) {
                    this.zza.zza(i10, (String) zza2);
                } else {
                    this.zza.zza(i10, (zzia) zza2);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11));
            i11++;
        }
    }

    @Deprecated
    public final void zza(int i10) {
        this.zza.zzc(i10, 4);
    }

    public final void zza(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    public final void zza(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    public final void zza(int i10, Object obj, zzll zzll) {
        zzit zzit = this.zza;
        zzit.zzc(i10, 3);
        zzll.zza((zzkt) obj, (zzna) zzit.zza);
        zzit.zzc(i10, 4);
    }

    public final void zza(int i10, List<?> list, zzll zzll) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, (Object) list.get(i11), zzll);
        }
    }

    public final <K, V> void zza(int i10, zzkk<K, V> zzkk, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzkl.zza(zzkk, next.getKey(), next.getValue()));
            zzkl.zza(this.zza, zzkk, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i10, Object obj) {
        if (obj instanceof zzia) {
            this.zza.zzb(i10, (zzia) obj);
        } else {
            this.zza.zza(i10, (zzkt) obj);
        }
    }

    public final void zza(int i10, String str) {
        this.zza.zza(i10, str);
    }
}

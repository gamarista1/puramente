package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaip  reason: invalid package */
final class zzaip implements zzanc {
    private final zzaim zza;

    private zzaip(zzaim zzaim) {
        zzaim zzaim2 = (zzaim) zzajh.zza(zzaim, "output");
        this.zza = zzaim2;
        zzaim2.zze = this;
    }

    public static zzaip zza(zzaim zzaim) {
        zzaip zzaip = zzaim.zze;
        if (zzaip != null) {
            return zzaip;
        }
        return new zzaip(zzaim);
    }

    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaio) {
            zzaio zzaio = (zzaio) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaio.size(); i13++) {
                    i12 += zzaim.zza(zzaio.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaio.size()) {
                    this.zza.zzb(zzaio.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaio.size()) {
                this.zza.zzb(i10, zzaio.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zza(list.get(i15).doubleValue());
            }
            this.zza.zzn(i14);
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
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaim.zzc(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzi(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajf.size(); i13++) {
                    i12 += zzaim.zzd(zzajf.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajf.size()) {
                    this.zza.zzk(zzajf.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajf.size()) {
                this.zza.zzh(i10, zzajf.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzd(list.get(i15).intValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaka.size(); i13++) {
                    i12 += zzaim.zzc(zzaka.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaka.size()) {
                    this.zza.zzh(zzaka.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaka.size()) {
                this.zza.zzf(i10, zzaka.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzc(list.get(i15).longValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajd.size(); i13++) {
                    i12 += zzaim.zza(zzajd.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajd.size()) {
                    this.zza.zzb(zzajd.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajd.size()) {
                this.zza.zzb(i10, zzajd.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zza(list.get(i15).floatValue());
            }
            this.zza.zzn(i14);
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
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajf.size(); i13++) {
                    i12 += zzaim.zze(zzajf.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajf.size()) {
                    this.zza.zzl(zzajf.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajf.size()) {
                this.zza.zzi(i10, zzajf.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zze(list.get(i15).intValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzi(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaka.size(); i13++) {
                    i12 += zzaim.zzd(zzaka.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaka.size()) {
                    this.zza.zzj(zzaka.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaka.size()) {
                this.zza.zzh(i10, zzaka.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzd(list.get(i15).longValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajf.size(); i13++) {
                    i12 += zzaim.zzg(zzajf.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajf.size()) {
                    this.zza.zzk(zzajf.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajf.size()) {
                this.zza.zzh(i10, zzajf.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzg(list.get(i15).intValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaka.size(); i13++) {
                    i12 += zzaim.zze(zzaka.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaka.size()) {
                    this.zza.zzh(zzaka.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaka.size()) {
                this.zza.zzf(i10, zzaka.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zze(list.get(i15).longValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajf.size(); i13++) {
                    i12 += zzaim.zzh(zzajf.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajf.size()) {
                    this.zza.zzm(zzajf.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajf.size()) {
                this.zza.zzj(i10, zzajf.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzh(list.get(i15).intValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzj(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaka.size(); i13++) {
                    i12 += zzaim.zzf(zzaka.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaka.size()) {
                    this.zza.zzi(zzaka.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaka.size()) {
                this.zza.zzg(i10, zzaka.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzf(list.get(i15).longValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzg(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzajf.size(); i13++) {
                    i12 += zzaim.zzj(zzajf.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzajf.size()) {
                    this.zza.zzn(zzajf.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzajf.size()) {
                this.zza.zzl(i10, zzajf.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzj(list.get(i15).intValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzl(i10, list.get(i11).intValue());
                i11++;
            }
        }
    }

    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzaka.size(); i13++) {
                    i12 += zzaim.zzg(zzaka.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzaka.size()) {
                    this.zza.zzj(zzaka.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzaka.size()) {
                this.zza.zzh(i10, zzaka.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zzg(list.get(i15).longValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
        }
    }

    public final int zza() {
        return zzanf.zza;
    }

    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (list instanceof zzahm) {
            zzahm zzahm = (zzahm) list;
            if (z10) {
                this.zza.zzk(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzahm.size(); i13++) {
                    i12 += zzaim.zza(zzahm.zzb(i13));
                }
                this.zza.zzn(i12);
                while (i11 < zzahm.size()) {
                    this.zza.zzb(zzahm.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzahm.size()) {
                this.zza.zzb(i10, zzahm.zzb(i11));
                i11++;
            }
        } else if (z10) {
            this.zza.zzk(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzaim.zza(list.get(i15).booleanValue());
            }
            this.zza.zzn(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).booleanValue());
                i11++;
            }
        }
    }

    public final void zzc(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    public final void zzb(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zzd(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    public final void zze(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzf(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    public final void zzb(int i10, Object obj, zzalh zzalh) {
        this.zza.zzc(i10, (zzakp) obj, zzalh);
    }

    public final void zza(int i10, zzaho zzaho) {
        this.zza.zzc(i10, zzaho);
    }

    public final void zzb(int i10, List<?> list, zzalh zzalh) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, (Object) list.get(i11), zzalh);
        }
    }

    public final void zza(int i10, List<zzaho> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzk(i10, 3);
    }

    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof zzajv) {
            zzajv zzajv = (zzajv) list;
            while (i11 < list.size()) {
                Object zzb = zzajv.zzb(i11);
                if (zzb instanceof String) {
                    this.zza.zzb(i10, (String) zzb);
                } else {
                    this.zza.zzc(i10, (zzaho) zzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11));
            i11++;
        }
    }

    @Deprecated
    public final void zza(int i10) {
        this.zza.zzk(i10, 4);
    }

    public final void zza(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    public final void zza(int i10, Object obj, zzalh zzalh) {
        zzaim zzaim = this.zza;
        zzaim.zzk(i10, 3);
        zzalh.zza((zzakp) obj, (zzanc) zzaim.zze);
        zzaim.zzk(i10, 4);
    }

    public final void zza(int i10, List<?> list, zzalh zzalh) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, (Object) list.get(i11), zzalh);
        }
    }

    public final <K, V> void zza(int i10, zzakg<K, V> zzakg, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzk(i10, 2);
            this.zza.zzn(zzakh.zza(zzakg, next.getKey(), next.getValue()));
            zzakh.zza(this.zza, zzakg, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i10, Object obj) {
        if (obj instanceof zzaho) {
            this.zza.zzd(i10, (zzaho) obj);
        } else {
            this.zza.zzb(i10, (zzakp) obj);
        }
    }

    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }
}

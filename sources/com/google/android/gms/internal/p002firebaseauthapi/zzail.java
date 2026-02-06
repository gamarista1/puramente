package com.google.android.gms.internal.p002firebaseauthapi;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzail  reason: invalid package */
final class zzail implements zzale {
    private final zzaic zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzail(zzaic zzaic) {
        zzaic zzaic2 = (zzaic) zzajh.zza(zzaic, MetricTracker.Object.INPUT);
        this.zza = zzaic2;
        zzaic2.zzd = this;
    }

    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? a.e.API_PRIORITY_OTHER : i11 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    public final zzaho zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i10);
    }

    private final <T> void zzd(T t10, zzalh<T> zzalh, zzaiq zzaiq) {
        int zzj = this.zza.zzj();
        zzaic zzaic = this.zza;
        if (zzaic.zza < zzaic.zzb) {
            int zzb2 = zzaic.zzb(zzj);
            this.zza.zza++;
            zzalh.zza(t10, this, zzaiq);
            this.zza.zzc(0);
            zzaic zzaic2 = this.zza;
            zzaic2.zza--;
            zzaic2.zzd(zzb2);
            return;
        }
        throw new zzajk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzail zza(zzaic zzaic) {
        zzail zzail = zzaic.zzd;
        if (zzail != null) {
            return zzail;
        }
        return new zzail(zzaic);
    }

    private final <T> T zzb(zzalh<T> zzalh, zzaiq zzaiq) {
        T zza2 = zzalh.zza();
        zzd(zza2, zzalh, zzaiq);
        zzalh.zzc(zza2);
        return zza2;
    }

    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajf.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajf.zzc(this.zza.zze());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaka.zza(this.zza.zzk());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzaka.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajd.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajd.zza(this.zza.zzb());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajf.zzc(this.zza.zzf());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajf.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaka.zza(this.zza.zzl());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaka.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajf.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajf.zzc(this.zza.zzg());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaka.zza(this.zza.zzn());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzaka.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajf.zzc(this.zza.zzh());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajf.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaka.zza(this.zza.zzo());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaka.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzn(List<String> list) {
        zza(list, false);
    }

    public final void zzo(List<String> list) {
        zza(list, true);
    }

    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajf.zzc(this.zza.zzj());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajf.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaka) {
            zzaka zzaka = (zzaka) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaka.zza(this.zza.zzp());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaka.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    private final Object zza(zzamt zzamt, Class<?> cls, zzaiq zzaiq) {
        switch (zzaik.zza[zzamt.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzald.zza().zza(cls), zzaiq);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case StdKeyDeserializer.TYPE_URL:
                return Long.valueOf(zzn());
            case StdKeyDeserializer.TYPE_CLASS:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t10, zzalh<T> zzalh, zzaiq zzaiq) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalh.zza(t10, this, zzaiq);
            if (this.zzb != this.zzc) {
                throw zzajk.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    public final <T> void zzb(T t10, zzalh<T> zzalh, zzaiq zzaiq) {
        zzb(2);
        zzd(t10, zzalh, zzaiq);
    }

    public final void zzb(List<zzaho> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzajk.zza();
    }

    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajf) {
            zzajf zzajf = (zzajf) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajf.zzc(this.zza.zzd());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajf.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    public final <T> void zzb(List<T> list, zzalh<T> zzalh, zzaiq zzaiq) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzalh, zzaiq));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzajk.zza();
    }

    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaio) {
            zzaio zzaio = (zzaio) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaio.zza(this.zza.zza());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzaio.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzajk.zza();
        }
    }

    private final <T> T zza(zzalh<T> zzalh, zzaiq zzaiq) {
        T zza2 = zzalh.zza();
        zzc(zza2, zzalh, zzaiq);
        zzalh.zzc(zza2);
        return zza2;
    }

    public final <T> void zza(T t10, zzalh<T> zzalh, zzaiq zzaiq) {
        zzb(3);
        zzc(t10, zzalh, zzaiq);
    }

    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzahm) {
            zzahm zzahm = (zzahm) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzahm.zza(this.zza.zzu());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzahm.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzajk.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzajk.zza();
            }
        }
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzajk.zzg();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzajk.zzg();
        }
    }

    @Deprecated
    public final <T> void zza(List<T> list, zzalh<T> zzalh, zzaiq zzaiq) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzalh, zzaiq));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzajk.zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (zzt() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        throw new com.google.android.gms.internal.p002firebaseauthapi.zzajk(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p002firebaseauthapi.zzakg<K, V> r9, com.google.android.gms.internal.p002firebaseauthapi.zzaiq r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb((int) r0)
            com.google.android.gms.internal.firebase-auth-api.zzaic r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaic r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L_0x0014:
            int r4 = r7.zzc()     // Catch:{ all -> 0x0039 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005d
            com.google.android.gms.internal.firebase-auth-api.zzaic r5 = r7.zza     // Catch:{ all -> 0x0039 }
            boolean r5 = r5.zzt()     // Catch:{ all -> 0x0039 }
            if (r5 != 0) goto L_0x005d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0048
            if (r4 == r0) goto L_0x003b
            boolean r4 = r7.zzt()     // Catch:{ zzajn -> 0x0050 }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.firebase-auth-api.zzajk r4 = new com.google.android.gms.internal.firebase-auth-api.zzajk     // Catch:{ zzajn -> 0x0050 }
            r4.<init>((java.lang.String) r6)     // Catch:{ zzajn -> 0x0050 }
            throw r4     // Catch:{ zzajn -> 0x0050 }
        L_0x0039:
            r8 = move-exception
            goto L_0x0066
        L_0x003b:
            com.google.android.gms.internal.firebase-auth-api.zzamt r4 = r9.zzc     // Catch:{ zzajn -> 0x0050 }
            V r5 = r9.zzd     // Catch:{ zzajn -> 0x0050 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzajn -> 0x0050 }
            java.lang.Object r3 = r7.zza((com.google.android.gms.internal.p002firebaseauthapi.zzamt) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.p002firebaseauthapi.zzaiq) r10)     // Catch:{ zzajn -> 0x0050 }
            goto L_0x0014
        L_0x0048:
            com.google.android.gms.internal.firebase-auth-api.zzamt r4 = r9.zza     // Catch:{ zzajn -> 0x0050 }
            r5 = 0
            java.lang.Object r2 = r7.zza((com.google.android.gms.internal.p002firebaseauthapi.zzamt) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.p002firebaseauthapi.zzaiq) r5)     // Catch:{ zzajn -> 0x0050 }
            goto L_0x0014
        L_0x0050:
            boolean r4 = r7.zzt()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0057
            goto L_0x0014
        L_0x0057:
            com.google.android.gms.internal.firebase-auth-api.zzajk r8 = new com.google.android.gms.internal.firebase-auth-api.zzajk     // Catch:{ all -> 0x0039 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0039 }
            throw r8     // Catch:{ all -> 0x0039 }
        L_0x005d:
            r8.put(r2, r3)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.firebase-auth-api.zzaic r8 = r7.zza
            r8.zzd(r1)
            return
        L_0x0066:
            com.google.android.gms.internal.firebase-auth-api.zzaic r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzakg, com.google.android.gms.internal.firebase-auth-api.zzaiq):void");
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzajk.zza();
        } else if (!(list instanceof zzajv) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
        } else {
            zzajv zzajv = (zzajv) list;
            do {
                zzajv.zza(zzp());
                if (!this.zza.zzt()) {
                    zzi2 = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
        }
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzajk.zzi();
        }
    }
}

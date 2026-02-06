package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;

final class zzis implements zzli {
    private final zzio zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzis(zzio zzio) {
        zzio zzio2 = (zzio) zzjm.zza(zzio, MetricTracker.Object.INPUT);
        this.zza = zzio2;
        zzio2.zzc = this;
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

    public final zzia zzp() {
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
        return this.zza.zzd(i10);
    }

    private final <T> void zzd(T t10, zzll<T> zzll, zzix zzix) {
        int zzj = this.zza.zzj();
        zzio zzio = this.zza;
        if (zzio.zza < zzio.zzb) {
            int zza2 = zzio.zza(zzj);
            this.zza.zza++;
            zzll.zza(t10, this, zzix);
            this.zza.zzb(0);
            zzio zzio2 = this.zza;
            zzio2.zza--;
            zzio2.zzc(zza2);
            return;
        }
        throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzis zza(zzio zzio) {
        zzis zzis = zzio.zzc;
        if (zzis != null) {
            return zzis;
        }
        return new zzis(zzio);
    }

    private final <T> T zzb(zzll<T> zzll, zzix zzix) {
        T zza2 = zzll.zza();
        zzd(zza2, zzll, zzix);
        zzll.zzc(zza2);
        return zza2;
    }

    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzjn.zzd(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzjn.zzd(this.zza.zze());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzke.zza(this.zza.zzk());
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
                    zzke.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjj) {
            zzjj zzjj = (zzjj) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzjj.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzjj.zza(this.zza.zzb());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzjn.zzd(this.zza.zzf());
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
                    zzjn.zzd(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzke.zza(this.zza.zzl());
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
                    zzke.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzjn.zzd(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzjn.zzd(this.zza.zzg());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzke.zza(this.zza.zzn());
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
                    zzke.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzjn.zzd(this.zza.zzh());
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
                    zzjn.zzd(this.zza.zzh());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzke.zza(this.zza.zzo());
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
                    zzke.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
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
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzjn.zzd(this.zza.zzj());
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
                    zzjn.zzd(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzke.zza(this.zza.zzp());
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
                    zzke.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    private final Object zza(zzmn zzmn, Class<?> cls, zzix zzix) {
        switch (zzir.zza[zzmn.ordinal()]) {
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
                return zzb(zzlh.zza().zza(cls), zzix);
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

    private final <T> void zzc(T t10, zzll<T> zzll, zzix zzix) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzll.zza(t10, this, zzix);
            if (this.zzb != this.zzc) {
                throw zzjs.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    public final <T> void zzb(T t10, zzll<T> zzll, zzix zzix) {
        zzb(2);
        zzd(t10, zzll, zzix);
    }

    public final void zzb(List<zzia> list) {
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
        throw zzjs.zza();
    }

    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjn = (zzjn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzjn.zzd(this.zza.zzd());
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
                    zzjn.zzd(this.zza.zzd());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    public final <T> void zzb(List<T> list, zzll<T> zzll, zzix zzix) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzll, zzix));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzjs.zza();
    }

    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zziv) {
            zziv zziv = (zziv) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zziv.zza(this.zza.zza());
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
                    zziv.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzjs.zza();
        }
    }

    private final <T> T zza(zzll<T> zzll, zzix zzix) {
        T zza2 = zzll.zza();
        zzc(zza2, zzll, zzix);
        zzll.zzc(zza2);
        return zza2;
    }

    public final <T> void zza(T t10, zzll<T> zzll, zzix zzix) {
        zzb(3);
        zzc(t10, zzll, zzix);
    }

    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzhy.zza(this.zza.zzu());
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
                    zzhy.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzjs.zza();
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
                throw zzjs.zza();
            }
        }
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzjs.zzg();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzjs.zzg();
        }
    }

    @Deprecated
    public final <T> void zza(List<T> list, zzll<T> zzll, zzix zzix) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzll, zzix));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzjs.zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (zzt() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        throw new com.google.android.gms.internal.measurement.zzjs(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzkk<K, V> r9, com.google.android.gms.internal.measurement.zzix r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb((int) r0)
            com.google.android.gms.internal.measurement.zzio r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.measurement.zzio r2 = r7.zza
            int r1 = r2.zza((int) r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L_0x0014:
            int r4 = r7.zzc()     // Catch:{ all -> 0x0039 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005d
            com.google.android.gms.internal.measurement.zzio r5 = r7.zza     // Catch:{ all -> 0x0039 }
            boolean r5 = r5.zzt()     // Catch:{ all -> 0x0039 }
            if (r5 != 0) goto L_0x005d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0048
            if (r4 == r0) goto L_0x003b
            boolean r4 = r7.zzt()     // Catch:{ zzjv -> 0x0050 }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.measurement.zzjs r4 = new com.google.android.gms.internal.measurement.zzjs     // Catch:{ zzjv -> 0x0050 }
            r4.<init>(r6)     // Catch:{ zzjv -> 0x0050 }
            throw r4     // Catch:{ zzjv -> 0x0050 }
        L_0x0039:
            r8 = move-exception
            goto L_0x0066
        L_0x003b:
            com.google.android.gms.internal.measurement.zzmn r4 = r9.zzc     // Catch:{ zzjv -> 0x0050 }
            V r5 = r9.zzd     // Catch:{ zzjv -> 0x0050 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzjv -> 0x0050 }
            java.lang.Object r3 = r7.zza((com.google.android.gms.internal.measurement.zzmn) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzix) r10)     // Catch:{ zzjv -> 0x0050 }
            goto L_0x0014
        L_0x0048:
            com.google.android.gms.internal.measurement.zzmn r4 = r9.zza     // Catch:{ zzjv -> 0x0050 }
            r5 = 0
            java.lang.Object r2 = r7.zza((com.google.android.gms.internal.measurement.zzmn) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.measurement.zzix) r5)     // Catch:{ zzjv -> 0x0050 }
            goto L_0x0014
        L_0x0050:
            boolean r4 = r7.zzt()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0057
            goto L_0x0014
        L_0x0057:
            com.google.android.gms.internal.measurement.zzjs r8 = new com.google.android.gms.internal.measurement.zzjs     // Catch:{ all -> 0x0039 }
            r8.<init>(r6)     // Catch:{ all -> 0x0039 }
            throw r8     // Catch:{ all -> 0x0039 }
        L_0x005d:
            r8.put(r2, r3)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.measurement.zzio r8 = r7.zza
            r8.zzc(r1)
            return
        L_0x0066:
            com.google.android.gms.internal.measurement.zzio r9 = r7.zza
            r9.zzc(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzis.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkk, com.google.android.gms.internal.measurement.zzix):void");
    }

    private final void zza(List<String> list, boolean z10) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzjs.zza();
        } else if (!(list instanceof zzka) || z10) {
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
            zzka zzka = (zzka) list;
            do {
                zzka.zza(zzp());
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
            throw zzjs.zzh();
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzkz<T> implements zzll<T> {
    private final zzkt zza;
    private final zzmf<?, ?> zzb;
    private final boolean zzc;
    private final zziz<?> zzd;

    private zzkz(zzmf<?, ?> zzmf, zziz<?> zziz, zzkt zzkt) {
        this.zzb = zzmf;
        this.zzc = zziz.zza(zzkt);
        this.zzd = zziz;
        this.zza = zzkt;
    }

    public final int zza(T t10) {
        zzmf<?, ?> zzmf = this.zzb;
        int zzb2 = zzmf.zzb(zzmf.zzd(t10));
        return this.zzc ? zzb2 + this.zzd.zza((Object) t10).zza() : zzb2;
    }

    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t10).hashCode() : hashCode;
    }

    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    public final boolean zzd(T t10) {
        return this.zzd.zza((Object) t10).zzg();
    }

    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t10).equals(this.zzd.zza((Object) t11));
        }
        return true;
    }

    static <T> zzkz<T> zza(zzmf<?, ?> zzmf, zziz<?> zziz, zzkt zzkt) {
        return new zzkz<>(zzmf, zziz, zzkt);
    }

    public final T zza() {
        zzkt zzkt = this.zza;
        if (zzkt instanceof zzjk) {
            return ((zzjk) zzkt).zzcd();
        }
        return zzkt.zzch().zzaj();
    }

    public final void zza(T t10, T t11) {
        zzln.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzln.zza(this.zzd, t10, t11);
        }
    }

    public final void zza(T t10, zzli zzli, zzix zzix) {
        boolean z10;
        zzmf<?, ?> zzmf = this.zzb;
        zziz<?> zziz = this.zzd;
        Object zzc2 = zzmf.zzc(t10);
        zzjd<?> zzb2 = zziz.zzb(t10);
        do {
            try {
                if (zzli.zzc() == Integer.MAX_VALUE) {
                    zzmf.zzb((Object) t10, zzc2);
                    return;
                }
                int zzd2 = zzli.zzd();
                if (zzd2 == 11) {
                    Object obj = null;
                    int i10 = 0;
                    zzia zzia = null;
                    while (zzli.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzli.zzd();
                        if (zzd3 == 16) {
                            i10 = zzli.zzj();
                            obj = zziz.zza(zzix, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zziz.zza(zzli, obj, zzix, zzb2);
                            } else {
                                zzia = zzli.zzp();
                            }
                        } else if (!zzli.zzt()) {
                            break;
                        }
                    }
                    if (zzli.zzd() != 12) {
                        throw zzjs.zzb();
                    } else if (zzia != null) {
                        if (obj != null) {
                            zziz.zza(zzia, obj, zzix, zzb2);
                        } else {
                            zzmf.zza(zzc2, i10, zzia);
                        }
                    }
                } else if ((zzd2 & 7) == 2) {
                    Object zza2 = zziz.zza(zzix, this.zza, zzd2 >>> 3);
                    if (zza2 != null) {
                        zziz.zza(zzli, zza2, zzix, zzb2);
                    } else {
                        z10 = zzmf.zza(zzc2, zzli);
                        continue;
                    }
                } else {
                    z10 = zzli.zzt();
                    continue;
                }
                z10 = true;
                continue;
            } catch (Throwable th2) {
                zzmf.zzb((Object) t10, zzc2);
                throw th2;
            }
        } while (z10);
        zzmf.zzb((Object) t10, zzc2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.zzjk$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzhv r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzjk r0 = (com.google.android.gms.internal.measurement.zzjk) r0
            com.google.android.gms.internal.measurement.zzme r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzme r2 = com.google.android.gms.internal.measurement.zzme.zzc()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.zzme r1 = com.google.android.gms.internal.measurement.zzme.zzd()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.zzjk$zzd r10 = (com.google.android.gms.internal.measurement.zzjk.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.zzhw.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.zziz<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzix r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzkt r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzjk$zzf r0 = (com.google.android.gms.internal.measurement.zzjk.zzf) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzhw.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.measurement.zzme) r6, (com.google.android.gms.internal.measurement.zzhv) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.zzlh.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.zzhw.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzhv) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzhw.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzhw.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzia r2 = (com.google.android.gms.internal.measurement.zzia) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.zzlh.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.zzhw.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zziz<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzix r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzkt r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzjk$zzf r0 = (com.google.android.gms.internal.measurement.zzjk.zzf) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.zzhw.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.measurement.zzhv) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzjs r10 = com.google.android.gms.internal.measurement.zzjs.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkz.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzhv):void");
    }

    public final void zza(T t10, zzna zzna) {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t10).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            zzjf zzjf = (zzjf) next.getKey();
            if (zzjf.zzc() != zzmx.MESSAGE || zzjf.zze() || zzjf.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzjw) {
                zzna.zza(zzjf.zza(), (Object) ((zzjw) next).zza().zzb());
            } else {
                zzna.zza(zzjf.zza(), next.getValue());
            }
        }
        zzmf<?, ?> zzmf = this.zzb;
        zzmf.zza(zzmf.zzd(t10), zzna);
    }
}

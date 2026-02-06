package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class zzme {
    private static final zzme zza = new zzme(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzme() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzme zzc() {
        return zza;
    }

    static zzme zzd() {
        return new zzme();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzme)) {
            return false;
        }
        zzme zzme = (zzme) obj;
        int i10 = this.zzb;
        if (i10 == zzme.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzme.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzme.zzd;
                    int i12 = this.zzb;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzg;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                zzg = zzit.zzg(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zzg = zzit.zzc(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zzg = zzit.zzc(i14, (zzia) this.zzd[i12]);
            } else if (i15 == 3) {
                zzg = (zzit.zzi(i14) << 1) + ((zzme) this.zzd[i12]).zza();
            } else if (i15 == 5) {
                zzg = zzit.zzf(i14, ((Integer) this.zzd[i12]).intValue());
            } else {
                throw new IllegalStateException(zzjs.zza());
            }
            i11 += zzg;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzit.zzd(this.zzc[i12] >>> 3, (zzia) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzme(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzna zzna) {
        if (this.zzb != 0) {
            if (zzna.zza() == 1) {
                for (int i10 = 0; i10 < this.zzb; i10++) {
                    zza(this.zzc[i10], this.zzd[i10], zzna);
                }
                return;
            }
            for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
                zza(this.zzc[i11], this.zzd[i11], zzna);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzme zza(zzme zzme) {
        if (zzme.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzme.zzb;
        zza(i10);
        System.arraycopy(zzme.zzc, 0, this.zzc, this.zzb, zzme.zzb);
        System.arraycopy(zzme.zzd, 0, this.zzd, this.zzb, zzme.zzb);
        this.zzb = i10;
        return this;
    }

    static zzme zza(zzme zzme, zzme zzme2) {
        int i10 = zzme.zzb + zzme2.zzb;
        int[] copyOf = Arrays.copyOf(zzme.zzc, i10);
        System.arraycopy(zzme2.zzc, 0, copyOf, zzme.zzb, zzme2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzme.zzd, i10);
        System.arraycopy(zzme2.zzd, 0, copyOf2, zzme.zzb, zzme2.zzb);
        return new zzme(i10, copyOf, copyOf2, true);
    }

    private final void zza(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzku.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzna zzna) {
        if (zzna.zza() == 2) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzna.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzna.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzna zzna) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzna.zzb(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            zzna.zza(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            zzna.zza(i11, (zzia) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                zzna.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzjs.zza());
        } else if (zzna.zza() == 1) {
            zzna.zzb(i11);
            ((zzme) obj).zzb(zzna);
            zzna.zza(i11);
        } else {
            zzna.zza(i11);
            ((zzme) obj).zzb(zzna);
            zzna.zzb(i11);
        }
    }
}

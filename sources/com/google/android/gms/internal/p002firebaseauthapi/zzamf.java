package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamf  reason: invalid package */
public final class zzamf {
    private static final zzamf zza = new zzamf(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamf() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamf zzc() {
        return zza;
    }

    static zzamf zzd() {
        return new zzamf();
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
        if (obj == null || !(obj instanceof zzamf)) {
            return false;
        }
        zzamf zzamf = (zzamf) obj;
        int i10 = this.zzb;
        if (i10 == zzamf.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamf.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamf.zzd;
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
        int zze2;
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
                zze2 = zzaim.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zze2 = zzaim.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zze2 = zzaim.zza(i14, (zzaho) this.zzd[i12]);
            } else if (i15 == 3) {
                zze2 = (zzaim.zzi(i14) << 1) + ((zzamf) this.zzd[i12]).zza();
            } else if (i15 == 5) {
                zze2 = zzaim.zzc(i14, ((Integer) this.zzd[i12]).intValue());
            } else {
                throw new IllegalStateException(zzajk.zza());
            }
            i11 += zze2;
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
            i11 += zzaim.zzb(this.zzc[i12] >>> 3, (zzaho) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamf(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzanc zzanc) {
        if (this.zzb != 0) {
            if (zzanc.zza() == zzanf.zza) {
                for (int i10 = 0; i10 < this.zzb; i10++) {
                    zza(this.zzc[i10], this.zzd[i10], zzanc);
                }
                return;
            }
            for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
                zza(this.zzc[i11], this.zzd[i11], zzanc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzamf zza(zzamf zzamf) {
        if (zzamf.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzamf.zzb;
        zza(i10);
        System.arraycopy(zzamf.zzc, 0, this.zzc, this.zzb, zzamf.zzb);
        System.arraycopy(zzamf.zzd, 0, this.zzd, this.zzb, zzamf.zzb);
        this.zzb = i10;
        return this;
    }

    static zzamf zza(zzamf zzamf, zzamf zzamf2) {
        int i10 = zzamf.zzb + zzamf2.zzb;
        int[] copyOf = Arrays.copyOf(zzamf.zzc, i10);
        System.arraycopy(zzamf2.zzc, 0, copyOf, zzamf.zzb, zzamf2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamf.zzd, i10);
        System.arraycopy(zzamf2.zzd, 0, copyOf2, zzamf.zzb, zzamf2.zzb);
        return new zzamf(i10, copyOf, copyOf2, true);
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
            zzakq.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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
    public final void zza(zzanc zzanc) {
        if (zzanc.zza() == zzanf.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanc.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanc.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzanc zzanc) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanc.zzb(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            zzanc.zza(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            zzanc.zza(i11, (zzaho) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                zzanc.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzajk.zza());
        } else if (zzanc.zza() == zzanf.zza) {
            zzanc.zzb(i11);
            ((zzamf) obj).zzb(zzanc);
            zzanc.zza(i11);
        } else {
            zzanc.zza(i11);
            ((zzamf) obj).zzb(zzanc);
            zzanc.zzb(i11);
        }
    }
}

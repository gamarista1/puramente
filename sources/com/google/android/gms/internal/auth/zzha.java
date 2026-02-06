package com.google.android.gms.internal.auth;

import java.util.Arrays;

public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z10;
    }

    public static zzha zza() {
        return zza;
    }

    static zzha zzc(zzha zzha, zzha zzha2) {
        int i10 = zzha.zzb + zzha2.zzb;
        int[] copyOf = Arrays.copyOf(zzha.zzc, i10);
        System.arraycopy(zzha2.zzc, 0, copyOf, zzha.zzb, zzha2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzha.zzd, i10);
        System.arraycopy(zzha2.zzd, 0, copyOf2, zzha.zzb, zzha2.zzb);
        return new zzha(i10, copyOf, copyOf2, true);
    }

    static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i10) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzha = (zzha) obj;
        int i10 = this.zzb;
        if (i10 == zzha.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzha.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzha.zzd;
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
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    /* access modifiers changed from: package-private */
    public final zzha zzb(zzha zzha) {
        if (zzha.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zzha.zzb;
        zzi(i10);
        System.arraycopy(zzha.zzc, 0, this.zzc, this.zzb, zzha.zzb);
        System.arraycopy(zzha.zzd, 0, this.zzd, this.zzb, zzha.zzb);
        this.zzb = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzfz.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(int i10, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}

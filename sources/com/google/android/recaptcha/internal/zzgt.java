package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

class zzgt extends zzgs {
    protected final byte[] zza;

    zzgt(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgw) || zzd() != ((zzgw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgt)) {
            return obj.equals(this);
        }
        zzgt zzgt = (zzgt) obj;
        int zzl = zzl();
        int zzl2 = zzgt.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzgt.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzgt.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgt.zza;
            zzgt.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzgt.zzd());
        }
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    /* access modifiers changed from: protected */
    public final int zzf(int i10, int i11, int i12) {
        return zzjc.zzb(i10, this.zza, 0, i12);
    }

    public final zzgw zzg(int i10, int i11) {
        int zzk = zzgw.zzk(0, i11, zzd());
        if (zzk == 0) {
            return zzgw.zzb;
        }
        return new zzgq(this.zza, 0, zzk);
    }

    /* access modifiers changed from: protected */
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzgm zzgm) {
        ((zzhe) zzgm).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzma.zzf(this.zza, 0, zzd());
    }
}

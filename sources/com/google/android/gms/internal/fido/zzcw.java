package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

class zzcw extends zzcv {
    protected final byte[] zza;

    zzcw(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcz) || zzd() != ((zzcz) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return obj.equals(this);
        }
        zzcw zzcw = (zzcw) obj;
        int zzk = zzk();
        int zzk2 = zzcw.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzcw.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zzcw.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzcw.zza;
            int zzc = zzc() + zzd;
            int zzc2 = zzc();
            int zzc3 = zzcw.zzc();
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        } else {
            int zzd3 = zzcw.zzd();
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd3);
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
        byte[] bArr = this.zza;
        int zzc = zzc();
        byte[] bArr2 = zzde.zzd;
        for (int i13 = zzc; i13 < zzc + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public final zzcz zzg(int i10, int i11) {
        int zzj = zzcz.zzj(i10, i11, zzd());
        if (zzj == 0) {
            return zzcz.zzb;
        }
        return new zzct(this.zza, zzc() + i10, zzj);
    }

    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}

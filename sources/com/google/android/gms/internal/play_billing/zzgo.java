package com.google.android.gms.internal.play_billing;

import java.util.Locale;

final class zzgo extends zzgr {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzgo(byte[] bArr, int i10, int i11) {
        super((zzgq) null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i11;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i11)}));
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b10) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zzd;
        try {
            int i11 = i10 + 1;
            try {
                this.zzb[i10] = b10;
                this.zzd = i11;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i10 = i11;
                throw new zzgp((long) i10, (long) this.zzc, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
            throw new zzgp((long) i10, (long) this.zzc, 1, indexOutOfBoundsException);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp((long) this.zzd, (long) this.zzc, i11, e10);
        }
    }

    public final void zzd(int i10, boolean z10) {
        zzt(i10 << 3);
        zzb(z10 ? (byte) 1 : 0);
    }

    public final void zze(int i10, zzgk zzgk) {
        zzt((i10 << 3) | 2);
        zzt(zzgk.zzd());
        zzgk.zzg(this);
    }

    public final void zzf(int i10, int i11) {
        zzt((i10 << 3) | 5);
        zzg(i11);
    }

    public final void zzg(int i10) {
        int i11 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.zzd = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp((long) i11, (long) this.zzc, 4, e10);
        }
    }

    public final void zzh(int i10, long j10) {
        zzt((i10 << 3) | 1);
        zzi(j10);
    }

    public final void zzi(long j10) {
        int i10 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.zzd = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp((long) i10, (long) this.zzc, 8, e10);
        }
    }

    public final void zzj(int i10, int i11) {
        zzt(i10 << 3);
        zzk(i11);
    }

    public final void zzk(int i10) {
        if (i10 >= 0) {
            zzt(i10);
        } else {
            zzv((long) i10);
        }
    }

    public final void zzl(byte[] bArr, int i10, int i11) {
        zzc(bArr, 0, i11);
    }

    /* access modifiers changed from: package-private */
    public final void zzm(int i10, zzim zzim, zzix zzix) {
        zzt((i10 << 3) | 2);
        zzt(((zzfv) zzim).zze(zzix));
        zzix.zzi(zzim, this.zza);
    }

    public final void zzn(int i10, zzim zzim) {
        zzt(11);
        zzs(2, i10);
        zzt(26);
        zzt(zzim.zzk());
        zzim.zzJ(this);
        zzt(12);
    }

    public final void zzo(int i10, zzgk zzgk) {
        zzt(11);
        zzs(2, i10);
        zze(3, zzgk);
        zzt(12);
    }

    public final void zzp(int i10, String str) {
        zzt((i10 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i10 = this.zzd;
        try {
            int zzz = zzgr.zzz(str.length() * 3);
            int zzz2 = zzgr.zzz(str.length());
            if (zzz2 == zzz) {
                int i11 = i10 + zzz2;
                this.zzd = i11;
                int zzb2 = zzjt.zzb(str, this.zzb, i11, this.zzc - i11);
                this.zzd = i10;
                zzt((zzb2 - i10) - zzz2);
                this.zzd = zzb2;
                return;
            }
            zzt(zzjt.zzc(str));
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            this.zzd = zzjt.zzb(str, bArr, i12, this.zzc - i12);
        } catch (zzjs e10) {
            this.zzd = i10;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgp(e11);
        }
    }

    public final void zzr(int i10, int i11) {
        zzt((i10 << 3) | i11);
    }

    public final void zzs(int i10, int i11) {
        zzt(i10 << 3);
        zzt(i11);
    }

    public final void zzt(int i10) {
        while ((i10 & -128) != 0) {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr[i11] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            IndexOutOfBoundsException indexOutOfBoundsException = e10;
            int i13 = this.zzd;
            throw new zzgp((long) i13, (long) this.zzc, 1, indexOutOfBoundsException);
        }
    }

    public final void zzu(int i10, long j10) {
        zzt(i10 << 3);
        zzv(j10);
    }

    public final void zzv(long j10) {
        if (!zzgr.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgp((long) this.zzd, (long) this.zzc, 1, e10);
            }
        } else {
            while (true) {
                int i12 = (int) j10;
                if ((j10 & -128) == 0) {
                    byte[] bArr3 = this.zzb;
                    int i13 = this.zzd;
                    this.zzd = i13 + 1;
                    zzjq.zzn(bArr3, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr4 = this.zzb;
                int i14 = this.zzd;
                this.zzd = i14 + 1;
                zzjq.zzn(bArr4, (long) i14, (byte) ((i12 | 128) & 255));
                j10 >>>= 7;
            }
        }
    }
}

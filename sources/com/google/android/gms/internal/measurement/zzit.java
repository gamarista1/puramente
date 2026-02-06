package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzit extends zzhx {
    private static final Logger zzb = Logger.getLogger(zzit.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzmg.zzc();
    zziw zza;

    private static class zza extends zzit {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i11) | i11) >= 0) {
                this.zzb = bArr;
                this.zzd = 0;
                this.zzc = i11;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
            }
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
                this.zzd += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)}), e10);
            }
        }

        public final int zza() {
            return this.zzc - this.zzd;
        }

        public final void zzb(byte[] bArr, int i10, int i11) {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        public final void zzd(int i10, int i11) {
            zzc(i10, 0);
            zzc(i11);
        }

        public final void zza(byte b10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        public final void zzb(int i10, int i11) {
            zzc(i10, 0);
            zzb(i11);
        }

        public final void zza(int i10, boolean z10) {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : 0);
        }

        public final void zzb(int i10) {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb((long) i10);
            }
        }

        public final void zzc(int i10, int i11) {
            zzc((i10 << 3) | i11);
        }

        public final void zzc(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        public final void zza(int i10, zzia zzia) {
            zzc(i10, 2);
            zza(zzia);
        }

        public final void zzb(int i10, zzia zzia) {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzia);
            zzc(1, 4);
        }

        public final void zza(zzia zzia) {
            zzc(zzia.zzb());
            zzia.zza((zzhx) this);
        }

        public final void zza(int i10, int i11) {
            zzc(i10, 5);
            zza(i11);
        }

        public final void zzb(int i10, long j10) {
            zzc(i10, 0);
            zzb(j10);
        }

        public final void zza(int i10) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                int i12 = i11 + 1;
                this.zzd = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.zzd = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.zzd = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.zzd = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        public final void zzb(long j10) {
            if (!zzit.zzc || zza() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zzd;
                    this.zzd = i12 + 1;
                    zzmg.zza(bArr3, (long) i12, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzmg.zza(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void zza(int i10, long j10) {
            zzc(i10, 1);
            zza(j10);
        }

        public final void zza(long j10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                int i11 = i10 + 1;
                this.zzd = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i10 + 2;
                this.zzd = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i10 + 3;
                this.zzd = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i10 + 4;
                this.zzd = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i10 + 5;
                this.zzd = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i10 + 6;
                this.zzd = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i10 + 7;
                this.zzd = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.zzd = i10 + 8;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i10, zzkt zzkt, zzll zzll) {
            zzc(i10, 2);
            zzc(((zzhq) zzkt).zza(zzll));
            zzll.zza(zzkt, (zzna) this.zza);
        }

        public final void zza(zzkt zzkt) {
            zzc(zzkt.zzca());
            zzkt.zza(this);
        }

        public final void zza(int i10, zzkt zzkt) {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzkt);
            zzc(1, 4);
        }

        public final void zza(int i10, String str) {
            zzc(i10, 2);
            zza(str);
        }

        public final void zza(String str) {
            int i10 = this.zzd;
            try {
                int zzj = zzit.zzj(str.length() * 3);
                int zzj2 = zzit.zzj(str.length());
                if (zzj2 == zzj) {
                    int i11 = i10 + zzj2;
                    this.zzd = i11;
                    int zza = zzmk.zza(str, this.zzb, i11, zza());
                    this.zzd = i10;
                    zzc((zza - i10) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmk.zza(str));
                this.zzd = zzmk.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmo e10) {
                this.zzd = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        zzb(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return zzg((long) i10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzj(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public abstract void zza(int i10);

    public abstract void zza(int i10, int i11);

    public abstract void zza(int i10, long j10);

    public abstract void zza(int i10, zzia zzia);

    public abstract void zza(int i10, zzkt zzkt);

    /* access modifiers changed from: package-private */
    public abstract void zza(int i10, zzkt zzkt, zzll zzll);

    public abstract void zza(int i10, String str);

    public abstract void zza(int i10, boolean z10);

    public abstract void zza(long j10);

    public abstract void zza(zzia zzia);

    public abstract void zza(zzkt zzkt);

    public abstract void zza(String str);

    public abstract void zzb(int i10);

    public abstract void zzb(int i10, int i11);

    public abstract void zzb(int i10, long j10);

    public abstract void zzb(int i10, zzia zzia);

    public abstract void zzb(long j10);

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc(int i10);

    public abstract void zzc(int i10, int i11);

    public abstract void zzd(int i10, int i11);

    public final void zzk(int i10, int i11) {
        zzd(i10, zzl(i11));
    }

    private zzit() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzb(zzia zzia) {
        int zzb2 = zzia.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10) {
        return zzg((long) i10);
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzg((long) i11);
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public static int zzi(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zzl(i11));
    }

    public final void zzk(int i10) {
        zzc(zzl(i10));
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zzc(int i10, zzia zzia) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzia.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + zzg((long) i11);
    }

    public static int zzf(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zzi(j10));
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzh(int i10, long j10) {
        zzb(i10, zzi(j10));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    static int zzb(int i10, zzkt zzkt, zzll zzll) {
        return (zzj(i10 << 3) << 1) + ((zzhq) zzkt).zza(zzll);
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public static int zzg(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public final void zzh(long j10) {
        zzb(zzi(j10));
    }

    public static int zzd(int i10, zzia zzia) {
        return (zzj(8) << 1) + zzj(2, i10) + zzc(3, zzia);
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzf(long j10) {
        return zzg(zzi(j10));
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzkt zzkt) {
        return zzkt.zzca();
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzb(int i10, zzkb zzkb) {
        int zzj = zzj(i10 << 3);
        int zza2 = zzkb.zza();
        return zzj + zzj(zza2) + zza2;
    }

    static int zzc(int i10, zzkt zzkt, zzll zzll) {
        return zzj(i10 << 3) + zza(zzkt, zzll);
    }

    public static int zza(int i10, zzkb zzkb) {
        return (zzj(8) << 1) + zzj(2, i10) + zzb(3, zzkb);
    }

    public static int zzc(zzkt zzkt) {
        int zzca = zzkt.zzca();
        return zzj(zzca) + zzca;
    }

    public static int zzb(int i10, zzkt zzkt) {
        return (zzj(8) << 1) + zzj(2, i10) + zzj(24) + zzc(zzkt);
    }

    public static int zza(zzkb zzkb) {
        int zza2 = zzkb.zza();
        return zzj(zza2) + zza2;
    }

    static int zza(zzkt zzkt, zzll zzll) {
        int zza2 = ((zzhq) zzkt).zza(zzll);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i10, String str) {
        return zzj(i10 << 3) + zzb(str);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzmo zzmo) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmo);
        byte[] bytes = str.getBytes(zzjm.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public static int zzb(String str) {
        int i10;
        try {
            i10 = zzmk.zza(str);
        } catch (zzmo unused) {
            i10 = str.getBytes(zzjm.zza).length;
        }
        return zzj(i10) + i10;
    }

    public static zzit zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : 0);
    }

    public final void zzb(int i10, double d10) {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) {
        zza(Float.floatToRawIntBits(f10));
    }
}

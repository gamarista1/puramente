package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim  reason: invalid package */
public abstract class zzaim extends zzahp {
    private static final Logger zza = Logger.getLogger(zzaim.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzamm.zzc();
    zzaip zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim$zza */
    private static abstract class zza extends zzaim {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        zza(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.zza = bArr;
                this.zzb = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* access modifiers changed from: package-private */
        public final void zzb(int i10) {
            if (zzaim.zzb) {
                long j10 = (long) this.zzc;
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    zzamm.zza(bArr, (long) i11, (byte) (i10 | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzamm.zza(bArr2, (long) i12, (byte) i10);
                this.zzd += (int) (((long) this.zzc) - j10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                bArr3[i13] = (byte) (i10 | 128);
                this.zzd++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.zzd++;
        }

        /* access modifiers changed from: package-private */
        public final void zza(byte b10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
            this.zzd++;
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i10) {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            this.zzc = i12;
            bArr[i11] = (byte) i10;
            int i13 = i11 + 2;
            this.zzc = i13;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i11 + 3;
            this.zzc = i14;
            bArr[i13] = (byte) (i10 >> 16);
            this.zzc = i11 + 4;
            bArr[i14] = (byte) (i10 >>> 24);
            this.zzd += 4;
        }

        /* access modifiers changed from: package-private */
        public final void zza(long j10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i10 + 2;
            this.zzc = i12;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i10 + 3;
            this.zzc = i13;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i10 + 4;
            this.zzc = i14;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i10 + 5;
            this.zzc = i15;
            bArr[i14] = (byte) ((int) (j10 >> 32));
            int i16 = i10 + 6;
            this.zzc = i16;
            bArr[i15] = (byte) ((int) (j10 >> 40));
            int i17 = i10 + 7;
            this.zzc = i17;
            bArr[i16] = (byte) ((int) (j10 >> 48));
            this.zzc = i10 + 8;
            bArr[i17] = (byte) ((int) (j10 >> 56));
            this.zzd += 8;
        }

        /* access modifiers changed from: package-private */
        public final void zzb(long j10) {
            if (zzaim.zzb) {
                long j11 = (long) this.zzc;
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzamm.zza(bArr, (long) i10, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzamm.zza(bArr2, (long) i11, (byte) ((int) j10));
                this.zzd += (int) (((long) this.zzc) - j11);
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr3[i12] = (byte) (((int) j10) | 128);
                this.zzd++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
            this.zzd++;
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i10, int i11) {
            zzb((i10 << 3) | i11);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim$zzb */
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim$zzc */
    private static class zzc extends zzaim {
        private final byte[] zza;
        private final int zzb;
        private final int zzc;
        private int zzd;

        zzc(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i11) | i11) >= 0) {
                this.zza = bArr;
                this.zzb = 0;
                this.zzd = 0;
                this.zzc = i11;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
            }
        }

        public final int zza() {
            return this.zzc - this.zzd;
        }

        public final void zzb(byte b10) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        public final void zzc() {
        }

        public final void zzd(int i10, zzaho zzaho) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzaho);
            zzk(1, 4);
        }

        public final void zzf(int i10, long j10) {
            zzk(i10, 1);
            zzh(j10);
        }

        public final void zzh(int i10, int i11) {
            zzk(i10, 5);
            zzk(i11);
        }

        public final void zzi(int i10, int i11) {
            zzk(i10, 0);
            zzl(i11);
        }

        public final void zzj(long j10) {
            if (!zzaim.zzb || zza() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.zza;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.zza;
                    int i12 = this.zzd;
                    this.zzd = i12 + 1;
                    zzamm.zza(bArr3, (long) i12, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.zza;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzamm.zza(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void zzk(int i10) {
            try {
                byte[] bArr = this.zza;
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

        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj((long) i10);
            }
        }

        public final void zzn(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zza;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e10);
            }
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zza, this.zzd, i11);
                this.zzd += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)}), e10);
            }
        }

        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        public final void zzh(long j10) {
            try {
                byte[] bArr = this.zza;
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

        public final void zzl(int i10, int i11) {
            zzk(i10, 0);
            zzn(i11);
        }

        public final void zzb(int i10, boolean z10) {
            zzk(i10, 0);
            zzb(z10 ? (byte) 1 : 0);
        }

        public final void zzb(byte[] bArr, int i10, int i11) {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        public final void zzc(int i10, zzaho zzaho) {
            zzk(i10, 2);
            zzb(zzaho);
        }

        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        public final void zzb(zzaho zzaho) {
            zzn(zzaho.zzb());
            zzaho.zza((zzahp) this);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(int i10, zzakp zzakp, zzalh zzalh) {
            zzk(i10, 2);
            zzn(((zzahf) zzakp).zza(zzalh));
            zzalh.zza(zzakp, (zzanc) this.zze);
        }

        /* access modifiers changed from: package-private */
        public final void zzb(zzakp zzakp, zzalh zzalh) {
            zzn(((zzahf) zzakp).zza(zzalh));
            zzalh.zza(zzakp, (zzanc) this.zze);
        }

        public final void zzc(zzakp zzakp) {
            zzn(zzakp.zzl());
            zzakp.zza(this);
        }

        public final void zzb(int i10, zzakp zzakp) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzakp);
            zzk(1, 4);
        }

        public final void zzh(int i10, long j10) {
            zzk(i10, 0);
            zzj(j10);
        }

        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        public final void zzb(String str) {
            int i10 = this.zzd;
            try {
                int zzj = zzaim.zzj(str.length() * 3);
                int zzj2 = zzaim.zzj(str.length());
                if (zzj2 == zzj) {
                    int i11 = i10 + zzj2;
                    this.zzd = i11;
                    int zza2 = zzamn.zza(str, this.zza, i11, zza());
                    this.zzd = i10;
                    zzn((zza2 - i10) - zzj2);
                    this.zzd = zza2;
                    return;
                }
                zzn(zzamn.zza(str));
                this.zzd = zzamn.zza(str, this.zza, this.zzd, zza());
            } catch (zzamq e10) {
                this.zzd = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10, int i11) {
        return zzj(i10 << 3) + zzg((long) i11);
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return 4;
    }

    public static int zze(long j10) {
        return 8;
    }

    static int zzf(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzh(int i10) {
        return zzj(zza(i10));
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzb(int i10, zzakp zzakp);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z10);

    public abstract void zzb(zzaho zzaho);

    /* access modifiers changed from: package-private */
    public abstract void zzb(zzakp zzakp, zzalh zzalh);

    public abstract void zzb(String str);

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc();

    public abstract void zzc(int i10, zzaho zzaho);

    /* access modifiers changed from: package-private */
    public abstract void zzc(int i10, zzakp zzakp, zzalh zzalh);

    public abstract void zzc(zzakp zzakp);

    public abstract void zzd(int i10, zzaho zzaho);

    public abstract void zzf(int i10, long j10);

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j10);

    public abstract void zzh(long j10);

    public abstract void zzi(int i10, int i11);

    public abstract void zzj(long j10);

    public abstract void zzk(int i10);

    public abstract void zzk(int i10, int i11);

    public abstract void zzl(int i10);

    public abstract void zzl(int i10, int i11);

    public final void zzm(int i10) {
        zzn(zza(i10));
    }

    public abstract void zzn(int i10);

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim$zzd */
    private static final class zzd extends zza {
        private final OutputStream zzf;

        zzd(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zze() {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i10) {
            if (this.zzb - this.zzc < i10) {
                zze();
            }
        }

        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        public final void zzb(byte b10) {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b10);
        }

        public final void zzc() {
            if (this.zzc > 0) {
                zze();
            }
        }

        public final void zzd(int i10, zzaho zzaho) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzaho);
            zzk(1, 4);
        }

        public final void zzf(int i10, long j10) {
            zzo(18);
            zza(i10, 1);
            zza(j10);
        }

        public final void zzh(int i10, int i11) {
            zzo(14);
            zza(i10, 5);
            zza(i11);
        }

        public final void zzi(int i10, int i11) {
            zzo(20);
            zza(i10, 0);
            if (i11 >= 0) {
                zzb(i11);
            } else {
                zzb((long) i11);
            }
        }

        public final void zzj(long j10) {
            zzo(10);
            zzb(j10);
        }

        public final void zzk(int i10) {
            zzo(4);
            zza(i10);
        }

        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj((long) i10);
            }
        }

        public final void zzn(int i10) {
            zzo(5);
            zzb(i10);
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            int i12 = this.zzb;
            int i13 = this.zzc;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zza, i13, i11);
                this.zzc += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zza, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzc = this.zzb;
                this.zzd += i14;
                zze();
                if (i11 <= this.zzb) {
                    System.arraycopy(bArr, i15, this.zza, 0, i11);
                    this.zzc = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zzd += i11;
        }

        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        public final void zzl(int i10, int i11) {
            zzo(20);
            zza(i10, 0);
            zzb(i11);
        }

        public final void zzb(int i10, boolean z10) {
            zzo(11);
            zza(i10, 0);
            zza(z10 ? (byte) 1 : 0);
        }

        public final void zzh(long j10) {
            zzo(8);
            zza(j10);
        }

        public final void zzh(int i10, long j10) {
            zzo(20);
            zza(i10, 0);
            zzb(j10);
        }

        public final void zzb(byte[] bArr, int i10, int i11) {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        public final void zzb(zzaho zzaho) {
            zzn(zzaho.zzb());
            zzaho.zza((zzahp) this);
        }

        /* access modifiers changed from: package-private */
        public final void zzb(zzakp zzakp, zzalh zzalh) {
            zzn(((zzahf) zzakp).zza(zzalh));
            zzalh.zza(zzakp, (zzanc) this.zze);
        }

        public final void zzb(int i10, zzakp zzakp) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzakp);
            zzk(1, 4);
        }

        public final void zzc(int i10, zzaho zzaho) {
            zzk(i10, 2);
            zzb(zzaho);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(int i10, zzakp zzakp, zzalh zzalh) {
            zzk(i10, 2);
            zzb(zzakp, zzalh);
        }

        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        public final void zzc(zzakp zzakp) {
            zzn(zzakp.zzl());
            zzakp.zza(this);
        }

        public final void zzb(String str) {
            int i10;
            int i11;
            try {
                int length = str.length() * 3;
                int zzj = zzaim.zzj(length);
                int i12 = zzj + length;
                int i13 = this.zzb;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int zza = zzamn.zza(str, bArr, 0, length);
                    zzn(zza);
                    zza(bArr, 0, zza);
                    return;
                }
                if (i12 > i13 - this.zzc) {
                    zze();
                }
                int zzj2 = zzaim.zzj(str.length());
                i10 = this.zzc;
                if (zzj2 == zzj) {
                    int i14 = i10 + zzj2;
                    this.zzc = i14;
                    int zza2 = zzamn.zza(str, this.zza, i14, this.zzb - i14);
                    this.zzc = i10;
                    i11 = (zza2 - i10) - zzj2;
                    zzb(i11);
                    this.zzc = zza2;
                } else {
                    i11 = zzamn.zza(str);
                    zzb(i11);
                    this.zzc = zzamn.zza(str, this.zza, this.zzc, i11);
                }
                this.zzd += i11;
            } catch (zzamq e10) {
                this.zzd -= this.zzc - i10;
                this.zzc = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzb(e11);
            } catch (zzamq e12) {
                zza(str, e12);
            }
        }
    }

    private zzaim() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzc(int i10) {
        return zzg((long) i10);
    }

    public static int zze(int i10) {
        return zzg((long) i10);
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zza(i11));
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    public final void zzi(long j10) {
        zzj(zza(j10));
    }

    public final void zzj(int i10, int i11) {
        zzl(i10, zza(i11));
    }

    private static int zza(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int zzb(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzc(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzd(int i10, int i11) {
        return zzj(i10 << 3) + zzg((long) i11);
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzf(long j10) {
        return zzg(zza(j10));
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    private static long zza(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzb(int i10, zzajt zzajt) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzajt.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public final void zzg(int i10, long j10) {
        zzh(i10, zza(j10));
    }

    public static int zza(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zza(j10));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    static int zzb(int i10, zzakp zzakp, zzalh zzalh) {
        return zzj(i10 << 3) + zza(zzakp, zzalh);
    }

    public static int zza(int i10, zzaho zzaho) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzaho.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzb(zzakp zzakp) {
        int zzl = zzakp.zzl();
        return zzj(zzl) + zzl;
    }

    public static int zza(zzaho zzaho) {
        int zzb2 = zzaho.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzb(int i10, zzaho zzaho) {
        return (zzj(8) << 1) + zzg(2, i10) + zza(3, zzaho);
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static zzaim zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    @Deprecated
    static int zza(int i10, zzakp zzakp, zzalh zzalh) {
        return (zzj(i10 << 3) << 1) + ((zzahf) zzakp).zza(zzalh);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzakp zzakp) {
        return zzakp.zzl();
    }

    public final void zzb(boolean z10) {
        zzb(z10 ? (byte) 1 : 0);
    }

    public static int zza(int i10, zzajt zzajt) {
        return (zzj(8) << 1) + zzg(2, i10) + zzb(3, zzajt);
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) {
        zzh(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zzh(i10, Float.floatToRawIntBits(f10));
    }

    public static int zza(zzajt zzajt) {
        int zzb2 = zzajt.zzb();
        return zzj(zzb2) + zzb2;
    }

    public final void zzb(float f10) {
        zzk(Float.floatToRawIntBits(f10));
    }

    public static int zza(int i10, zzakp zzakp) {
        return (zzj(8) << 1) + zzg(2, i10) + zzj(24) + zzb(zzakp);
    }

    static int zza(zzakp zzakp, zzalh zzalh) {
        int zza2 = ((zzahf) zzakp).zza(zzalh);
        return zzj(zza2) + zza2;
    }

    public static int zza(int i10, String str) {
        return zzj(i10 << 3) + zza(str);
    }

    public static int zza(String str) {
        int i10;
        try {
            i10 = zzamn.zza(str);
        } catch (zzamq unused) {
            i10 = str.getBytes(zzajh.zza).length;
        }
        return zzj(i10) + i10;
    }

    public static zzaim zza(OutputStream outputStream, int i10) {
        return new zzd(outputStream, i10);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzamq zzamq) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzamq);
        byte[] bytes = str.getBytes(zzajh.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }
}

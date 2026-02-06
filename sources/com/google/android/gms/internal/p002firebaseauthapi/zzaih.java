package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaih  reason: invalid package */
final class zzaih extends zzaic {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaig zzm;

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzh = i13;
            this.zzg = i10 - i13;
            return;
        }
        this.zzh = 0;
    }

    private final byte zzv() {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzg(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private final int zzx() {
        byte b10;
        byte b11;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b12 = bArr[i10];
            if (b12 >= 0) {
                this.zzi = i12;
                return b12;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                byte b13 = (bArr[i12] << 7) ^ b12;
                if (b13 < 0) {
                    b10 = b13 ^ Byte.MIN_VALUE;
                } else {
                    int i14 = i10 + 3;
                    byte b14 = (bArr[i13] << 14) ^ b13;
                    if (b14 >= 0) {
                        b11 = b14 ^ 16256;
                    } else {
                        int i15 = i10 + 4;
                        byte b15 = b14 ^ (bArr[i14] << 21);
                        if (b15 < 0) {
                            b10 = -2080896 ^ b15;
                        } else {
                            i14 = i10 + 5;
                            byte b16 = bArr[i15];
                            byte b17 = (b15 ^ (b16 << 28)) ^ 266354560;
                            if (b16 < 0) {
                                i15 = i10 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i10 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i10 + 9;
                                            if (bArr[i15] < 0) {
                                                int i16 = i10 + 10;
                                                if (bArr[i14] >= 0) {
                                                    byte b18 = b17;
                                                    i13 = i16;
                                                    b10 = b18;
                                                }
                                            }
                                        }
                                    }
                                }
                                b10 = b17;
                            }
                            b11 = b17;
                        }
                        i13 = i15;
                    }
                    i13 = i14;
                }
                this.zzi = i13;
                return b10;
            }
        }
        return (int) zzm();
    }

    private final long zzy() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzg(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    private final long zzz() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return (long) b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                byte b11 = (bArr[i12] << 7) ^ b10;
                if (b11 < 0) {
                    j10 = (long) (b11 ^ Byte.MIN_VALUE);
                } else {
                    int i14 = i10 + 3;
                    byte b12 = (bArr[i13] << 14) ^ b11;
                    if (b12 >= 0) {
                        j10 = (long) (b12 ^ 16256);
                        i13 = i14;
                    } else {
                        int i15 = i10 + 4;
                        byte b13 = b12 ^ (bArr[i14] << 21);
                        if (b13 < 0) {
                            i13 = i15;
                            j10 = (long) (-2080896 ^ b13);
                        } else {
                            long j13 = (long) b13;
                            int i16 = i10 + 5;
                            long j14 = j13 ^ (((long) bArr[i15]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i17 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                if (j15 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i16 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i17]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i16]) << 49);
                                        if (j15 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i10 + 10;
                                                if (((long) bArr[i13]) >= 0) {
                                                    i13 = i18;
                                                }
                                            }
                                            j10 = j16;
                                        }
                                    }
                                }
                                j10 = j15 ^ j11;
                                i13 = i17;
                            }
                            j10 = j14 ^ j12;
                        }
                    }
                }
                this.zzi = i13;
                return j10;
            }
        }
        return zzm();
    }

    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    public final int zzc() {
        return this.zzk + this.zzi;
    }

    public final int zzd() {
        return zzx();
    }

    public final int zze() {
        return zzw();
    }

    public final int zzf() {
        return zzx();
    }

    public final int zzg() {
        return zzw();
    }

    public final int zzh() {
        return zzaic.zza(zzx());
    }

    public final int zzi() {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzj = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzajk.zzc();
    }

    public final int zzj() {
        return zzx();
    }

    public final long zzk() {
        return zzy();
    }

    public final long zzl() {
        return zzz();
    }

    /* access modifiers changed from: package-private */
    public final long zzm() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zzv = zzv();
            j10 |= ((long) (zzv & Byte.MAX_VALUE)) << i10;
            if ((zzv & 128) == 0) {
                return j10;
            }
        }
        throw zzajk.zze();
    }

    public final long zzn() {
        return zzy();
    }

    public final long zzo() {
        return zzaic.zza(zzz());
    }

    public final long zzp() {
        return zzz();
    }

    public final zzaho zzq() {
        int zzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzx <= i10 - i11 && zzx > 0) {
            zzaho zza = zzaho.zza(this.zzf, i11, zzx);
            this.zzi += zzx;
            return zza;
        } else if (zzx == 0) {
            return zzaho.zza;
        } else {
            if (zzx >= 0) {
                byte[] zzj2 = zzj(zzx);
                if (zzj2 != null) {
                    return zzaho.zza(zzj2);
                }
                int i12 = this.zzi;
                int i13 = this.zzg;
                int i14 = i13 - i12;
                this.zzk += i13;
                this.zzi = 0;
                this.zzg = 0;
                List<byte[]> zzf2 = zzf(zzx - i14);
                byte[] bArr = new byte[zzx];
                System.arraycopy(this.zzf, i12, bArr, 0, i14);
                for (byte[] next : zzf2) {
                    System.arraycopy(next, 0, bArr, i14, next.length);
                    i14 += next.length;
                }
                return zzaho.zzb(bArr);
            }
            throw zzajk.zzf();
        }
    }

    public final String zzr() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String str = new String(this.zzf, i11, zzx, zzajh.zza);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzajk.zzf();
        } else if (zzx > this.zzg) {
            return new String(zza(zzx, false), zzajh.zza);
        } else {
            zzg(zzx);
            String str2 = new String(this.zzf, this.zzi, zzx, zzajh.zza);
            this.zzi += zzx;
            return str2;
        }
    }

    public final String zzs() {
        byte[] bArr;
        int zzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzx <= i11 - i10 && zzx > 0) {
            bArr = this.zzf;
            this.zzi = i10 + zzx;
        } else if (zzx == 0) {
            return "";
        } else {
            if (zzx >= 0) {
                i10 = 0;
                if (zzx <= i11) {
                    zzg(zzx);
                    bArr = this.zzf;
                    this.zzi = zzx;
                } else {
                    bArr = zza(zzx, false);
                }
            } else {
                throw zzajk.zzf();
            }
        }
        return zzamn.zzb(bArr, i10, zzx);
    }

    public final boolean zzt() {
        if (this.zzi != this.zzg || zzi(1)) {
            return false;
        }
        return true;
    }

    public final boolean zzu() {
        if (zzz() != 0) {
            return true;
        }
        return false;
    }

    private zzaih(InputStream inputStream, int i10) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zzm = null;
        zzajh.zza(inputStream, MetricTracker.Object.INPUT);
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzajk e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final List<byte[]> zzf(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw zzajk.zzi();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) {
        if (zzi(i10)) {
            return;
        }
        if (i10 > (this.zzc - this.zzk) - this.zzi) {
            throw zzajk.zzh();
        }
        throw zzajk.zzi();
    }

    private final void zzh(int i10) {
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzi = i12 + i10;
        } else if (i10 >= 0) {
            int i13 = this.zzk;
            int i14 = i13 + i12 + i10;
            int i15 = this.zzl;
            if (i14 <= i15) {
                this.zzk = i13 + i12;
                int i16 = i11 - i12;
                this.zzg = 0;
                this.zzi = 0;
                while (i16 < i10) {
                    try {
                        long j10 = (long) (i10 - i16);
                        long zza = zza(this.zze, j10);
                        int i17 = (zza > 0 ? 1 : (zza == 0 ? 0 : -1));
                        if (i17 >= 0 && zza <= j10) {
                            if (i17 == 0) {
                                break;
                            }
                            i16 += (int) zza;
                        } else {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                        }
                    } catch (Throwable th2) {
                        this.zzk += i16;
                        zzaa();
                        throw th2;
                    }
                }
                this.zzk += i16;
                zzaa();
                if (i16 < i10) {
                    int i18 = this.zzg;
                    int i19 = i18 - this.zzi;
                    this.zzi = i18;
                    zzg(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.zzg;
                        if (i20 > i21) {
                            i19 += i21;
                            this.zzi = i21;
                            zzg(1);
                        } else {
                            this.zzi = i20;
                            return;
                        }
                    }
                }
            } else {
                zzh((i15 - i13) - i12);
                throw zzajk.zzi();
            }
        } else {
            throw zzajk.zzf();
        }
    }

    private final byte[] zzj(int i10) {
        if (i10 == 0) {
            return zzajh.zzb;
        }
        if (i10 >= 0) {
            int i11 = this.zzk;
            int i12 = this.zzi;
            int i13 = i11 + i12 + i10;
            if (i13 - this.zzc <= 0) {
                int i14 = this.zzl;
                if (i13 <= i14) {
                    int i15 = this.zzg - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096 && i16 > zza(this.zze)) {
                        return null;
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i15 < i10) {
                        int zza = zza(this.zze, bArr, i15, i10 - i15);
                        if (zza != -1) {
                            this.zzk += zza;
                            i15 += zza;
                        } else {
                            throw zzajk.zzi();
                        }
                    }
                    return bArr;
                }
                zzh((i14 - i11) - i12);
                throw zzajk.zzi();
            }
            throw zzajk.zzh();
        }
        throw zzajk.zzf();
    }

    public final int zzb(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.zzk + this.zzi;
            int i12 = this.zzl;
            if (i11 <= i12) {
                this.zzl = i11;
                zzaa();
                return i12;
            }
            throw zzajk.zzi();
        }
        throw zzajk.zzf();
    }

    public final void zzc(int i10) {
        if (this.zzj != i10) {
            throw zzajk.zzb();
        }
    }

    public final void zzd(int i10) {
        this.zzl = i10;
        zzaa();
    }

    public final boolean zze(int i10) {
        int zzi2;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zzf;
                    int i13 = this.zzi;
                    this.zzi = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzajk.zze();
            }
            while (i12 < 10) {
                if (zzv() < 0) {
                    i12++;
                }
            }
            throw zzajk.zze();
            return true;
        } else if (i11 == 1) {
            zzh(8);
            return true;
        } else if (i11 == 2) {
            zzh(zzx());
            return true;
        } else if (i11 == 3) {
            do {
                zzi2 = zzi();
                if (zzi2 == 0 || !zze(zzi2)) {
                    zzc(((i10 >>> 3) << 3) | 4);
                }
                zzi2 = zzi();
                break;
            } while (!zze(zzi2));
            zzc(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzh(4);
                return true;
            }
            throw zzajk.zza();
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzajk e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final boolean zzi(int i10) {
        do {
            int i11 = this.zzi;
            int i12 = i11 + i10;
            int i13 = this.zzg;
            if (i12 > i13) {
                int i14 = this.zzc;
                int i15 = this.zzk;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzl) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.zzk += i11;
                    this.zzg -= i11;
                    this.zzi = 0;
                }
                InputStream inputStream = this.zze;
                byte[] bArr2 = this.zzf;
                int i16 = this.zzg;
                int zza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzc - this.zzk) - i16));
                if (zza == 0 || zza < -1 || zza > this.zzf.length) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                } else if (zza <= 0) {
                    return false;
                } else {
                    this.zzg += zza;
                    zzaa();
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        } while (this.zzg < i10);
        return true;
    }

    private static long zza(InputStream inputStream, long j10) {
        try {
            return inputStream.skip(j10);
        } catch (zzajk e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final byte[] zza(int i10, boolean z10) {
        byte[] zzj2 = zzj(i10);
        if (zzj2 != null) {
            return zzj2;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf2 = zzf(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] next : zzf2) {
            System.arraycopy(next, 0, bArr, i13, next.length);
            i13 += next.length;
        }
        return bArr;
    }
}

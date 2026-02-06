package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

final class zzgy extends zzhc {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj = a.e.API_PRIORITY_OTHER;

    /* synthetic */ zzgy(byte[] bArr, int i10, int i11, boolean z10, zzgx zzgx) {
        super((zzhb) null);
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzg = i12;
            this.zzf = i10 - i12;
            return;
        }
        this.zzg = 0;
    }

    public final void zzA(int i10) {
        this.zzj = i10;
        zzI();
    }

    public final void zzB(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    public final boolean zzC() {
        return this.zzh == this.zzf;
    }

    public final boolean zzD() {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzE(int i10) {
        int zzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zze;
                    int i13 = this.zzh;
                    this.zzh = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzje.zze();
            }
            while (i12 < 10) {
                if (zza() < 0) {
                    i12++;
                }
            }
            throw zzje.zze();
            return true;
        } else if (i11 == 1) {
            zzB(8);
            return true;
        } else if (i11 == 2) {
            zzB(zzj());
            return true;
        } else if (i11 == 3) {
            do {
                zzm = zzm();
                if (zzm == 0 || !zzE(zzm)) {
                    zzz(((i10 >>> 3) << 3) | 4);
                }
                zzm = zzm();
                break;
            } while (!zzE(zzm));
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzB(4);
                return true;
            }
            throw zzje.zza();
        }
    }

    public final byte zza() {
        int i10 = this.zzh;
        if (i10 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 1;
            return bArr[i10];
        }
        throw zzje.zzj();
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.zzh;
            if (i11 >= 0) {
                int i12 = this.zzj;
                if (i11 <= i12) {
                    this.zzj = i11;
                    zzI();
                    return i12;
                }
                throw zzje.zzj();
            }
            throw zzje.zzg();
        }
        throw zzje.zzf();
    }

    public final int zzf() {
        return zzj();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw zzje.zzj();
    }

    public final int zzj() {
        byte b10;
        byte b11;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b12 = bArr[i10];
            if (b12 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
                return b10;
            }
        }
        return (int) zzs();
    }

    public final int zzk() {
        return zzi();
    }

    public final int zzl() {
        return zzhc.zzF(zzj());
    }

    public final int zzm() {
        if (zzC()) {
            this.zzi = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzi = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw zzje.zzc();
    }

    public final int zzn() {
        return zzj();
    }

    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            long j10 = (long) bArr[i10 + 2];
            long j11 = (long) bArr[i10 + 3];
            long j12 = (long) bArr[i10 + 4];
            long j13 = (long) bArr[i10 + 5];
            long j14 = (long) bArr[i10 + 6];
            long j15 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
            return ((((long) bArr[i10 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
        }
        throw zzje.zzj();
    }

    public final long zzr() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
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
                    } else {
                        int i15 = i10 + 4;
                        byte b13 = b12 ^ (bArr[i14] << 21);
                        if (b13 < 0) {
                            i13 = i15;
                            j10 = (long) (-2080896 ^ b13);
                        } else {
                            i14 = i10 + 5;
                            long j13 = (((long) bArr[i15]) << 28) ^ ((long) b13);
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j14 = (((long) bArr[i14]) << 35) ^ j13;
                                if (j14 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i16 = i10 + 7;
                                    long j15 = j14 ^ (((long) bArr[i13]) << 42);
                                    if (j15 >= 0) {
                                        j11 = j15 ^ 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j14 = j15 ^ (((long) bArr[i16]) << 49);
                                        if (j14 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i10 + 9;
                                            long j16 = (j14 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i13 = i10 + 10;
                                                if (((long) bArr[i16]) >= 0) {
                                                    j10 = j16;
                                                }
                                            } else {
                                                j11 = j16;
                                            }
                                        }
                                    }
                                    i13 = i16;
                                }
                                j10 = j14 ^ j12;
                            }
                        }
                    }
                    i13 = i14;
                }
                this.zzh = i13;
                return j10;
            }
        }
        return zzs();
    }

    /* access modifiers changed from: package-private */
    public final long zzs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= ((long) (zza & Byte.MAX_VALUE)) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzje.zze();
    }

    public final long zzt() {
        return zzq();
    }

    public final long zzu() {
        return zzhc.zzG(zzr());
    }

    public final long zzv() {
        return zzr();
    }

    public final zzgw zzw() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                zzgw zzm = zzgw.zzm(this.zze, i11, zzj2);
                this.zzh += zzj2;
                return zzm;
            }
        }
        if (zzj2 == 0) {
            return zzgw.zzb;
        }
        if (zzj2 > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (zzj2 <= i12 - i13) {
                int i14 = zzj2 + i13;
                this.zzh = i14;
                return new zzgt(Arrays.copyOfRange(this.zze, i13, i14));
            }
        }
        if (zzj2 <= 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    public final String zzx() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                String str = new String(this.zze, i11, zzj2, zzjc.zzb);
                this.zzh += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 < 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    public final String zzy() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                String zzd = zzma.zzd(this.zze, i11, zzj2);
                this.zzh += zzj2;
                return zzd;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 <= 0) {
            throw zzje.zzf();
        }
        throw zzje.zzj();
    }

    public final void zzz(int i10) {
        if (this.zzi != i10) {
            throw zzje.zzb();
        }
    }
}

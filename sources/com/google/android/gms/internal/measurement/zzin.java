package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

final class zzin extends zzio {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i10 = this.zze + this.zzf;
        this.zze = i10;
        int i11 = i10 - this.zzh;
        int i12 = this.zzj;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzf = i13;
            this.zze = i10 - i13;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzv() {
        int i10 = this.zzg;
        if (i10 != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i10 + 1;
            return bArr[i10];
        }
        throw zzjs.zzh();
    }

    private final int zzw() {
        int i10 = this.zzg;
        if (this.zze - i10 >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw zzjs.zzh();
    }

    private final int zzx() {
        byte b10;
        byte b11;
        int i10 = this.zzg;
        int i11 = this.zze;
        if (i11 != i10) {
            byte[] bArr = this.zzd;
            int i12 = i10 + 1;
            byte b12 = bArr[i10];
            if (b12 >= 0) {
                this.zzg = i12;
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
                this.zzg = i13;
                return b10;
            }
        }
        return (int) zzm();
    }

    private final long zzy() {
        int i10 = this.zzg;
        if (this.zze - i10 >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
        throw zzjs.zzh();
    }

    private final long zzz() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzg;
        int i11 = this.zze;
        if (i11 != i10) {
            byte[] bArr = this.zzd;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzg = i12;
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
                this.zzg = i13;
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
        return this.zzg - this.zzh;
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
        return zzio.zze(zzx());
    }

    public final int zzi() {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzi = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzjs.zzc();
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
        throw zzjs.zze();
    }

    public final long zzn() {
        return zzy();
    }

    public final long zzo() {
        return zzio.zza(zzz());
    }

    public final long zzp() {
        return zzz();
    }

    public final zzia zzq() {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzx <= i10 - i11) {
                zzia zza = zzia.zza(this.zzd, i11, zzx);
                this.zzg += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzia.zza;
        }
        if (zzx > 0) {
            int i12 = this.zze;
            int i13 = this.zzg;
            if (zzx <= i12 - i13) {
                int i14 = zzx + i13;
                this.zzg = i14;
                bArr = Arrays.copyOfRange(this.zzd, i13, i14);
                return zzia.zzb(bArr);
            }
        }
        if (zzx > 0) {
            throw zzjs.zzh();
        } else if (zzx == 0) {
            bArr = zzjm.zzb;
            return zzia.zzb(bArr);
        } else {
            throw zzjs.zzf();
        }
    }

    public final String zzr() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzx <= i10 - i11) {
                String str = new String(this.zzd, i11, zzx, zzjm.zza);
                this.zzg += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    public final String zzs() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzx <= i10 - i11) {
                String zzb = zzmk.zzb(this.zzd, i11, zzx);
                this.zzg += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    public final boolean zzt() {
        if (this.zzg == this.zze) {
            return true;
        }
        return false;
    }

    public final boolean zzu() {
        if (zzz() != 0) {
            return true;
        }
        return false;
    }

    private zzin(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i11 + i10;
        this.zzg = i10;
        this.zzh = i10;
    }

    private final void zzf(int i10) {
        if (i10 >= 0) {
            int i11 = this.zze;
            int i12 = this.zzg;
            if (i10 <= i11 - i12) {
                this.zzg = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    public final int zza(int i10) {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            if (zzc >= 0) {
                int i11 = this.zzj;
                if (zzc <= i11) {
                    this.zzj = zzc;
                    zzaa();
                    return i11;
                }
                throw zzjs.zzh();
            }
            throw zzjs.zzg();
        }
        throw zzjs.zzf();
    }

    public final void zzb(int i10) {
        if (this.zzi != i10) {
            throw zzjs.zzb();
        }
    }

    public final void zzc(int i10) {
        this.zzj = i10;
        zzaa();
    }

    public final boolean zzd(int i10) {
        int zzi2;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zzd;
                    int i13 = this.zzg;
                    this.zzg = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzjs.zze();
            }
            while (i12 < 10) {
                if (zzv() < 0) {
                    i12++;
                }
            }
            throw zzjs.zze();
            return true;
        } else if (i11 == 1) {
            zzf(8);
            return true;
        } else if (i11 == 2) {
            zzf(zzx());
            return true;
        } else if (i11 == 3) {
            do {
                zzi2 = zzi();
                if (zzi2 == 0 || !zzd(zzi2)) {
                    zzb(((i10 >>> 3) << 3) | 4);
                }
                zzi2 = zzi();
                break;
            } while (!zzd(zzi2));
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzf(4);
                return true;
            }
            throw zzjs.zza();
        }
    }
}

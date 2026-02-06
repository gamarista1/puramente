package com.google.android.gms.internal.auth;

final class zzdu {
    static int zza(byte[] bArr, int i10, zzdt zzdt) {
        int zzh = zzh(bArr, i10, zzdt);
        int i11 = zzdt.zza;
        if (i11 < 0) {
            throw zzfb.zzc();
        } else if (i11 > bArr.length - zzh) {
            throw zzfb.zzf();
        } else if (i11 == 0) {
            zzdt.zzc = zzef.zzb;
            return zzh;
        } else {
            zzdt.zzc = zzef.zzk(bArr, zzh, i11);
            return zzh + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzgi zzgi, byte[] bArr, int i10, int i11, int i12, zzdt zzdt) {
        Object zzd = zzgi.zzd();
        int zzl = zzl(zzd, zzgi, bArr, i10, i11, i12, zzdt);
        zzgi.zze(zzd);
        zzdt.zzc = zzd;
        return zzl;
    }

    static int zzd(zzgi zzgi, byte[] bArr, int i10, int i11, zzdt zzdt) {
        Object zzd = zzgi.zzd();
        int zzm = zzm(zzd, zzgi, bArr, i10, i11, zzdt);
        zzgi.zze(zzd);
        zzdt.zzc = zzd;
        return zzm;
    }

    static int zze(zzgi zzgi, int i10, byte[] bArr, int i11, int i12, zzez zzez, zzdt zzdt) {
        int zzd = zzd(zzgi, bArr, i11, i12, zzdt);
        zzez.add(zzdt.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzdt);
            if (i10 != zzdt.zza) {
                break;
            }
            zzd = zzd(zzgi, bArr, zzh, i12, zzdt);
            zzez.add(zzdt.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzez zzez, zzdt zzdt) {
        zzew zzew = (zzew) zzez;
        int zzh = zzh(bArr, i10, zzdt);
        int i11 = zzdt.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzdt);
            zzew.zze(zzdt.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i10, byte[] bArr, int i11, int i12, zzha zzha, zzdt zzdt) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzk = zzk(bArr, i11, zzdt);
                zzha.zzh(i10, Long.valueOf(zzdt.zzb));
                return zzk;
            } else if (i13 == 1) {
                zzha.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzh = zzh(bArr, i11, zzdt);
                int i14 = zzdt.zza;
                if (i14 < 0) {
                    throw zzfb.zzc();
                } else if (i14 <= bArr.length - zzh) {
                    if (i14 == 0) {
                        zzha.zzh(i10, zzef.zzb);
                    } else {
                        zzha.zzh(i10, zzef.zzk(bArr, zzh, i14));
                    }
                    return zzh + i14;
                } else {
                    throw zzfb.zzf();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzha zzd = zzha.zzd();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i11, zzdt);
                    int i17 = zzdt.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzh2;
                        break;
                    }
                    int zzg = zzg(i16, bArr, zzh2, i12, zzd, zzdt);
                    i16 = i17;
                    i11 = zzg;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzfb.zzd();
                }
                zzha.zzh(i10, zzd);
                return i11;
            } else if (i13 == 5) {
                zzha.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzfb.zza();
            }
        } else {
            throw zzfb.zza();
        }
    }

    static int zzh(byte[] bArr, int i10, zzdt zzdt) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzdt);
        }
        zzdt.zza = b10;
        return i11;
    }

    static int zzi(int i10, byte[] bArr, int i11, zzdt zzdt) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzdt.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdt.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzdt.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzdt.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzdt.zza = i20;
                return i21;
            }
        }
    }

    static int zzj(int i10, byte[] bArr, int i11, int i12, zzez zzez, zzdt zzdt) {
        zzew zzew = (zzew) zzez;
        int zzh = zzh(bArr, i11, zzdt);
        zzew.zze(zzdt.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzdt);
            if (i10 != zzdt.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdt);
            zzew.zze(zzdt.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i10, zzdt zzdt) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzdt.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        zzdt.zzb = j11;
        return i12;
    }

    static int zzl(Object obj, zzgi zzgi, byte[] bArr, int i10, int i11, int i12, zzdt zzdt) {
        int zzb = ((zzga) zzgi).zzb(obj, bArr, i10, i11, i12, zzdt);
        zzdt.zzc = obj;
        return zzb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzm(java.lang.Object r6, com.google.android.gms.internal.auth.zzgi r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.auth.zzdt r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzg(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.auth.zzfb r6 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdu.zzm(java.lang.Object, com.google.android.gms.internal.auth.zzgi, byte[], int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}

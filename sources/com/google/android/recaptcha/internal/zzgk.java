package com.google.android.recaptcha.internal;

final class zzgk {
    static int zza(byte[] bArr, int i10, zzgj zzgj) {
        int zzi = zzi(bArr, i10, zzgj);
        int i11 = zzgj.zza;
        if (i11 < 0) {
            throw zzje.zzf();
        } else if (i11 > bArr.length - zzi) {
            throw zzje.zzj();
        } else if (i11 == 0) {
            zzgj.zzc = zzgw.zzb;
            return zzi;
        } else {
            zzgj.zzc = zzgw.zzm(bArr, zzi, i11);
            return zzi + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzkr zzkr, byte[] bArr, int i10, int i11, int i12, zzgj zzgj) {
        Object zze = zzkr.zze();
        int zzm = zzm(zze, zzkr, bArr, i10, i11, i12, zzgj);
        zzkr.zzf(zze);
        zzgj.zzc = zze;
        return zzm;
    }

    static int zzd(zzkr zzkr, byte[] bArr, int i10, int i11, zzgj zzgj) {
        Object zze = zzkr.zze();
        int zzn = zzn(zze, zzkr, bArr, i10, i11, zzgj);
        zzkr.zzf(zze);
        zzgj.zzc = zze;
        return zzn;
    }

    static int zze(zzkr zzkr, int i10, byte[] bArr, int i11, int i12, zzjb zzjb, zzgj zzgj) {
        int zzd = zzd(zzkr, bArr, i11, i12, zzgj);
        zzjb.add(zzgj.zzc);
        while (zzd < i12) {
            int zzi = zzi(bArr, zzd, zzgj);
            if (i10 != zzgj.zza) {
                break;
            }
            zzd = zzd(zzkr, bArr, zzi, i12, zzgj);
            zzjb.add(zzgj.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzjb zzjb, zzgj zzgj) {
        zziu zziu = (zziu) zzjb;
        int zzi = zzi(bArr, i10, zzgj);
        int i11 = zzgj.zza + zzi;
        while (zzi < i11) {
            zzi = zzi(bArr, zzi, zzgj);
            zziu.zzg(zzgj.zza);
        }
        if (zzi == i11) {
            return zzi;
        }
        throw zzje.zzj();
    }

    static int zzg(byte[] bArr, int i10, zzgj zzgj) {
        int zzi = zzi(bArr, i10, zzgj);
        int i11 = zzgj.zza;
        if (i11 < 0) {
            throw zzje.zzf();
        } else if (i11 == 0) {
            zzgj.zzc = "";
            return zzi;
        } else {
            zzgj.zzc = new String(bArr, zzi, i11, zzjc.zzb);
            return zzi + i11;
        }
    }

    static int zzh(int i10, byte[] bArr, int i11, int i12, zzlm zzlm, zzgj zzgj) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzl = zzl(bArr, i11, zzgj);
                zzlm.zzj(i10, Long.valueOf(zzgj.zzb));
                return zzl;
            } else if (i13 == 1) {
                zzlm.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzi = zzi(bArr, i11, zzgj);
                int i14 = zzgj.zza;
                if (i14 < 0) {
                    throw zzje.zzf();
                } else if (i14 <= bArr.length - zzi) {
                    if (i14 == 0) {
                        zzlm.zzj(i10, zzgw.zzb);
                    } else {
                        zzlm.zzj(i10, zzgw.zzm(bArr, zzi, i14));
                    }
                    return zzi + i14;
                } else {
                    throw zzje.zzj();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzlm zzf = zzlm.zzf();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzi2 = zzi(bArr, i11, zzgj);
                    int i17 = zzgj.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzi2;
                        break;
                    }
                    int zzh = zzh(i16, bArr, zzi2, i12, zzf, zzgj);
                    i16 = i17;
                    i11 = zzh;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzje.zzg();
                }
                zzlm.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zzlm.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzje.zzc();
            }
        } else {
            throw zzje.zzc();
        }
    }

    static int zzi(byte[] bArr, int i10, zzgj zzgj) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzgj);
        }
        zzgj.zza = b10;
        return i11;
    }

    static int zzj(int i10, byte[] bArr, int i11, zzgj zzgj) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzgj.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzgj.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzgj.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzgj.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzgj.zza = i20;
                return i21;
            }
        }
    }

    static int zzk(int i10, byte[] bArr, int i11, int i12, zzjb zzjb, zzgj zzgj) {
        zziu zziu = (zziu) zzjb;
        int zzi = zzi(bArr, i11, zzgj);
        zziu.zzg(zzgj.zza);
        while (zzi < i12) {
            int zzi2 = zzi(bArr, zzi, zzgj);
            if (i10 != zzgj.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzgj);
            zziu.zzg(zzgj.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i10, zzgj zzgj) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzgj.zzb = j10;
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
        zzgj.zzb = j11;
        return i12;
    }

    static int zzm(Object obj, zzkr zzkr, byte[] bArr, int i10, int i11, int i12, zzgj zzgj) {
        int zzc = ((zzkh) zzkr).zzc(obj, bArr, i10, i11, i12, zzgj);
        zzgj.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzn(java.lang.Object r6, com.google.android.recaptcha.internal.zzkr r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzgj r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzj(r9, r8, r0, r11)
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
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgk.zzn(java.lang.Object, com.google.android.recaptcha.internal.zzkr, byte[], int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzgj zzgj) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzl(bArr, i11, zzgj);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzi(bArr, i11, zzgj) + zzgj.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzi(bArr, i11, zzgj);
                    i15 = zzgj.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zzo(i15, bArr, i11, i12, zzgj);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzje.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzje.zzc();
            }
        } else {
            throw zzje.zzc();
        }
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}

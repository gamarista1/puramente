package com.google.android.gms.internal.play_billing;

final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zzfz zzfz) {
        int zzh = zzh(bArr, i10, zzfz);
        int i11 = zzfz.zza;
        if (i11 < 0) {
            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i11 > bArr.length - zzh) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else if (i11 == 0) {
            zzfz.zzc = zzgk.zzb;
            return zzh;
        } else {
            zzfz.zzc = zzgk.zzj(bArr, zzh, i11);
            return zzh + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzix zzix, byte[] bArr, int i10, int i11, int i12, zzfz zzfz) {
        Object zze = zzix.zze();
        int zzl = zzl(zze, zzix, bArr, i10, i11, i12, zzfz);
        zzix.zzf(zze);
        zzfz.zzc = zze;
        return zzl;
    }

    static int zzd(zzix zzix, byte[] bArr, int i10, int i11, zzfz zzfz) {
        Object zze = zzix.zze();
        int zzm = zzm(zze, zzix, bArr, i10, i11, zzfz);
        zzix.zzf(zze);
        zzfz.zzc = zze;
        return zzm;
    }

    static int zze(zzix zzix, int i10, byte[] bArr, int i11, int i12, zzho zzho, zzfz zzfz) {
        int zzd = zzd(zzix, bArr, i11, i12, zzfz);
        zzho.add(zzfz.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzfz);
            if (i10 != zzfz.zza) {
                break;
            }
            zzd = zzd(zzix, bArr, zzh, i12, zzfz);
            zzho.add(zzfz.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzho zzho, zzfz zzfz) {
        zzhl zzhl = (zzhl) zzho;
        int zzh = zzh(bArr, i10, zzfz);
        int i11 = zzfz.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzfz);
            zzhl.zzg(zzfz.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(int i10, byte[] bArr, int i11, int i12, zzjk zzjk, zzfz zzfz) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzk = zzk(bArr, i11, zzfz);
                zzjk.zzj(i10, Long.valueOf(zzfz.zzb));
                return zzk;
            } else if (i13 == 1) {
                zzjk.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzh = zzh(bArr, i11, zzfz);
                int i14 = zzfz.zza;
                if (i14 < 0) {
                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                } else if (i14 <= bArr.length - zzh) {
                    if (i14 == 0) {
                        zzjk.zzj(i10, zzgk.zzb);
                    } else {
                        zzjk.zzj(i10, zzgk.zzj(bArr, zzh, i14));
                    }
                    return zzh + i14;
                } else {
                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzjk zzf = zzjk.zzf();
                int i16 = zzfz.zze + 1;
                zzfz.zze = i16;
                zzo(i16);
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i11, zzfz);
                    i17 = zzfz.zza;
                    if (i17 == i15) {
                        i11 = zzh2;
                        break;
                    }
                    i11 = zzg(i17, bArr, zzh2, i12, zzf, zzfz);
                }
                zzfz.zze--;
                if (i11 > i12 || i17 != i15) {
                    throw new zzhr("Failed to parse the message.");
                }
                zzjk.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zzjk.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
    }

    static int zzh(byte[] bArr, int i10, zzfz zzfz) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzfz);
        }
        zzfz.zza = b10;
        return i11;
    }

    static int zzi(int i10, byte[] bArr, int i11, zzfz zzfz) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzfz.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzfz.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzfz.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzfz.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzfz.zza = i20;
                return i21;
            }
        }
    }

    static int zzj(int i10, byte[] bArr, int i11, int i12, zzho zzho, zzfz zzfz) {
        zzhl zzhl = (zzhl) zzho;
        int zzh = zzh(bArr, i11, zzfz);
        zzhl.zzg(zzfz.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzfz);
            if (i10 != zzfz.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzfz);
            zzhl.zzg(zzfz.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i10, zzfz zzfz) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzfz.zzb = j10;
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
        zzfz.zzb = j11;
        return i12;
    }

    static int zzl(Object obj, zzix zzix, byte[] bArr, int i10, int i11, int i12, zzfz zzfz) {
        int i13 = zzfz.zze + 1;
        zzfz.zze = i13;
        zzo(i13);
        int zzc = ((zzip) zzix).zzc(obj, bArr, i10, i11, i12, zzfz);
        zzfz.zze--;
        zzfz.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzm(java.lang.Object r6, com.google.android.gms.internal.play_billing.zzix r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.play_billing.zzfz r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.zze
            int r10 = r10 + 1
            r11.zze = r10
            zzo(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzh(r1, r2, r3, r4, r5)
            int r7 = r11.zze
            int r7 = r7 + -1
            r11.zze = r7
            r11.zzc = r6
            return r9
        L_0x002d:
            com.google.android.gms.internal.play_billing.zzhr r6 = new com.google.android.gms.internal.play_billing.zzhr
            java.lang.String r7 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzga.zzm(java.lang.Object, com.google.android.gms.internal.play_billing.zzix, byte[], int, int, com.google.android.gms.internal.play_billing.zzfz):int");
    }

    static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzo(int i10) {
        if (i10 >= zzb) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

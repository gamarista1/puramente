package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahk  reason: invalid package */
final class zzahk {
    static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i10, zzahn zzahn) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            zzahn.zzb = j10;
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
        zzahn.zzb = j11;
        return i12;
    }

    static int zza(byte[] bArr, int i10, zzahn zzahn) {
        int zzc = zzc(bArr, i10, zzahn);
        int i11 = zzahn.zza;
        if (i11 < 0) {
            throw zzajk.zzf();
        } else if (i11 > bArr.length - zzc) {
            throw zzajk.zzi();
        } else if (i11 == 0) {
            zzahn.zzc = zzaho.zza;
            return zzc;
        } else {
            zzahn.zzc = zzaho.zza(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    static int zzb(byte[] bArr, int i10, zzahn zzahn) {
        int zzc = zzc(bArr, i10, zzahn);
        int i11 = zzahn.zza;
        if (i11 < 0) {
            throw zzajk.zzf();
        } else if (i11 == 0) {
            zzahn.zzc = "";
            return zzc;
        } else {
            zzahn.zzc = zzamn.zzb(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    static int zzc(byte[] bArr, int i10, zzahn zzahn) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza((int) b10, bArr, i11, zzahn);
        }
        zzahn.zza = b10;
        return i11;
    }

    static long zzd(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int zza(zzalh zzalh, byte[] bArr, int i10, int i11, int i12, zzahn zzahn) {
        Object zza = zzalh.zza();
        int zza2 = zza(zza, zzalh, bArr, i10, i11, i12, zzahn);
        zzalh.zzc(zza);
        zzahn.zzc = zza;
        return zza2;
    }

    static int zza(zzalh zzalh, byte[] bArr, int i10, int i11, zzahn zzahn) {
        Object zza = zzalh.zza();
        int zza2 = zza(zza, zzalh, bArr, i10, i11, zzahn);
        zzalh.zzc(zza);
        zzahn.zzc = zza;
        return zza2;
    }

    static int zza(zzalh<?> zzalh, int i10, byte[] bArr, int i11, int i12, zzajl<?> zzajl, zzahn zzahn) {
        int zza = zza((zzalh) zzalh, bArr, i11, i12, zzahn);
        zzajl.add(zzahn.zzc);
        while (zza < i12) {
            int zzc = zzc(bArr, zza, zzahn);
            if (i10 != zzahn.zza) {
                break;
            }
            zza = zza((zzalh) zzalh, bArr, zzc, i12, zzahn);
            zzajl.add(zzahn.zzc);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i10, zzajl<?> zzajl, zzahn zzahn) {
        zzajf zzajf = (zzajf) zzajl;
        int zzc = zzc(bArr, i10, zzahn);
        int i11 = zzahn.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzahn);
            zzajf.zzc(zzahn.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzajk.zzi();
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzamf zzamf, zzahn zzahn) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzd = zzd(bArr, i11, zzahn);
                zzamf.zza(i10, (Object) Long.valueOf(zzahn.zzb));
                return zzd;
            } else if (i13 == 1) {
                zzamf.zza(i10, (Object) Long.valueOf(zzd(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzc = zzc(bArr, i11, zzahn);
                int i14 = zzahn.zza;
                if (i14 < 0) {
                    throw zzajk.zzf();
                } else if (i14 <= bArr.length - zzc) {
                    if (i14 == 0) {
                        zzamf.zza(i10, (Object) zzaho.zza);
                    } else {
                        zzamf.zza(i10, (Object) zzaho.zza(bArr, zzc, i14));
                    }
                    return zzc + i14;
                } else {
                    throw zzajk.zzi();
                }
            } else if (i13 == 3) {
                zzamf zzd2 = zzamf.zzd();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i11, zzahn);
                    int i17 = zzahn.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzc2;
                        break;
                    }
                    int zza = zza(i16, bArr, zzc2, i12, zzd2, zzahn);
                    i16 = i17;
                    i11 = zza;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzajk.zzg();
                }
                zzamf.zza(i10, (Object) zzd2);
                return i11;
            } else if (i13 == 5) {
                zzamf.zza(i10, (Object) Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzajk.zzc();
            }
        } else {
            throw zzajk.zzc();
        }
    }

    static int zza(int i10, byte[] bArr, int i11, zzahn zzahn) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzahn.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzahn.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzahn.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzahn.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzahn.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzajl<?> zzajl, zzahn zzahn) {
        zzajf zzajf = (zzajf) zzajl;
        int zzc = zzc(bArr, i11, zzahn);
        zzajf.zzc(zzahn.zza);
        while (zzc < i12) {
            int zzc2 = zzc(bArr, zzc, zzahn);
            if (i10 != zzahn.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzahn);
            zzajf.zzc(zzahn.zza);
        }
        return zzc;
    }

    static int zza(Object obj, zzalh zzalh, byte[] bArr, int i10, int i11, int i12, zzahn zzahn) {
        int zza = ((zzakt) zzalh).zza(obj, bArr, i10, i11, i12, zzahn);
        zzahn.zzc = obj;
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(java.lang.Object r6, com.google.android.gms.internal.p002firebaseauthapi.zzalh r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.p002firebaseauthapi.zzahn r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zza((int) r9, (byte[]) r8, (int) r0, (com.google.android.gms.internal.p002firebaseauthapi.zzahn) r11)
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
            r0.zza(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.firebase-auth-api.zzajk r6 = com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzi()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahk.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzalh, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzahn):int");
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzahn zzahn) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzd(bArr, i11, zzahn);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzc(bArr, i11, zzahn) + zzahn.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzc(bArr, i11, zzahn);
                    i15 = zzahn.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zza(i15, bArr, i11, i12, zzahn);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzajk.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzajk.zzc();
            }
        } else {
            throw zzajk.zzc();
        }
    }
}

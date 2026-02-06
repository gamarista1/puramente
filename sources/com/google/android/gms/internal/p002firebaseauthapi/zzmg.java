package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmg  reason: invalid package */
public final class zzmg {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) {
        long[] jArr2 = jArr;
        byte[] bArr3 = bArr2;
        int i10 = 32;
        if (bArr3.length == 32) {
            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
            copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                byte[][] bArr4 = zza;
                if (i12 >= bArr4.length) {
                    long[] zza2 = zzml.zza(copyOf);
                    long[] jArr3 = new long[19];
                    long[] jArr4 = new long[19];
                    jArr4[0] = 1;
                    long[] jArr5 = new long[19];
                    jArr5[0] = 1;
                    long[] jArr6 = new long[19];
                    long[] jArr7 = new long[19];
                    long[] jArr8 = new long[19];
                    jArr8[0] = 1;
                    long[] jArr9 = new long[19];
                    long[] jArr10 = new long[19];
                    jArr10[0] = 1;
                    int i13 = 10;
                    System.arraycopy(zza2, 0, jArr3, 0, 10);
                    int i14 = 0;
                    while (i14 < i10) {
                        byte b10 = bArr[31 - i14] & 255;
                        while (i11 < 8) {
                            int i15 = (b10 >> (7 - i11)) & 1;
                            zza(jArr5, jArr3, i15);
                            zza(jArr6, jArr4, i15);
                            long[] copyOf2 = Arrays.copyOf(jArr5, i13);
                            byte b11 = b10;
                            long[] jArr11 = new long[19];
                            int i16 = i14;
                            long[] jArr12 = new long[19];
                            int i17 = i11;
                            long[] jArr13 = new long[19];
                            int i18 = i15;
                            long[] jArr14 = new long[19];
                            long[] jArr15 = jArr10;
                            long[] jArr16 = new long[19];
                            long[] jArr17 = new long[19];
                            zzml.zzd(jArr5, jArr6);
                            zzml.zzc(jArr6, copyOf2);
                            long[] copyOf3 = Arrays.copyOf(jArr3, 10);
                            zzml.zzd(jArr3, jArr4);
                            zzml.zzc(jArr4, copyOf3);
                            zzml.zzb(jArr13, jArr3, jArr6);
                            zzml.zzb(jArr14, jArr5, jArr4);
                            zzml.zzb(jArr13);
                            zzml.zza(jArr13);
                            zzml.zzb(jArr14);
                            zzml.zza(jArr14);
                            long[] jArr18 = jArr3;
                            System.arraycopy(jArr13, 0, copyOf3, 0, 10);
                            zzml.zzd(jArr13, jArr14);
                            zzml.zzc(jArr14, copyOf3);
                            zzml.zzb(jArr17, jArr13);
                            zzml.zzb(jArr16, jArr14);
                            zzml.zzb(jArr14, jArr16, zza2);
                            zzml.zzb(jArr14);
                            zzml.zza(jArr14);
                            System.arraycopy(jArr17, 0, jArr7, 0, 10);
                            System.arraycopy(jArr14, 0, jArr8, 0, 10);
                            zzml.zzb(jArr11, jArr5);
                            zzml.zzb(jArr12, jArr6);
                            zzml.zzb(jArr9, jArr11, jArr12);
                            zzml.zzb(jArr9);
                            zzml.zza(jArr9);
                            zzml.zzc(jArr12, jArr11);
                            long[] jArr19 = new long[19];
                            Arrays.fill(jArr19, 10, 18, 0);
                            zzml.zza(jArr19, jArr12, 121665);
                            zzml.zza(jArr19);
                            zzml.zzd(jArr19, jArr11);
                            long[] jArr20 = jArr15;
                            zzml.zzb(jArr20, jArr12, jArr19);
                            zzml.zzb(jArr20);
                            zzml.zza(jArr20);
                            int i19 = i18;
                            zza(jArr9, jArr7, i19);
                            zza(jArr20, jArr8, i19);
                            i11 = i17 + 1;
                            long[] jArr21 = jArr;
                            byte[] bArr5 = bArr2;
                            jArr3 = jArr7;
                            b10 = b11;
                            i14 = i16;
                            jArr7 = jArr18;
                            i13 = 10;
                            long[] jArr22 = jArr8;
                            jArr8 = jArr4;
                            jArr4 = jArr22;
                            long[] jArr23 = jArr9;
                            jArr9 = jArr5;
                            jArr5 = jArr23;
                            long[] jArr24 = jArr20;
                            jArr10 = jArr6;
                            jArr6 = jArr24;
                        }
                        long[] jArr25 = jArr3;
                        i14++;
                        long[] jArr26 = jArr;
                        byte[] bArr6 = bArr2;
                        i10 = 32;
                        i11 = 0;
                        i13 = 10;
                    }
                    int i20 = i13;
                    long[] jArr27 = new long[i20];
                    zzml.zza(jArr27, jArr6);
                    long[] jArr28 = jArr;
                    zzml.zza(jArr28, jArr5, jArr27);
                    long[] jArr29 = new long[i20];
                    long[] jArr30 = new long[i20];
                    long[] jArr31 = new long[11];
                    long[] jArr32 = new long[11];
                    long[] jArr33 = new long[11];
                    zzml.zza(jArr29, zza2, jArr28);
                    zzml.zzd(jArr30, zza2, jArr28);
                    long[] jArr34 = new long[i20];
                    jArr34[0] = 486662;
                    zzml.zzd(jArr32, jArr30, jArr34);
                    zzml.zza(jArr32, jArr32, jArr4);
                    zzml.zzd(jArr32, jArr3);
                    zzml.zza(jArr32, jArr32, jArr29);
                    zzml.zza(jArr32, jArr32, jArr3);
                    zzml.zza(jArr31, jArr32, 4);
                    zzml.zza(jArr31);
                    zzml.zza(jArr32, jArr29, jArr4);
                    zzml.zzc(jArr32, jArr32, jArr4);
                    zzml.zza(jArr33, jArr30, jArr3);
                    zzml.zzd(jArr32, jArr32, jArr33);
                    zzml.zzb(jArr32, jArr32);
                    if (!MessageDigest.isEqual(zzml.zzc(jArr31), zzml.zzc(jArr32))) {
                        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzxl.zza(bArr2));
                    }
                    return;
                } else if (!MessageDigest.isEqual(bArr4[i12], copyOf)) {
                    i12++;
                } else {
                    throw new InvalidKeyException("Banned public key: " + zzxl.zza(bArr4[i12]));
                }
            }
        } else {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i10) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            long j10 = jArr[i12];
            int i13 = (((int) j10) ^ ((int) jArr2[i12])) & i11;
            jArr[i12] = (long) (((int) j10) ^ i13);
            jArr2[i12] = (long) (((int) jArr2[i12]) ^ i13);
        }
    }
}

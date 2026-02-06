package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class zzmh {
    protected static final Charset zza = StandardCharsets.UTF_16;

    protected static int zza(int i10, int i11) {
        if (i10 % 2 != 0) {
            return (i10 | i11) - (i10 & i11);
        }
        return ((~i10) & i11) | ((~i11) & i10);
    }

    public static String zzb(String str, byte[] bArr, zzmi zzmi) {
        byte[] bArr2 = bArr;
        int i10 = 0;
        byte[] decode = Base64.decode(str, 0);
        char c10 = 12;
        byte[] bArr3 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr4 = new byte[length];
        System.arraycopy(decode, 0, bArr3, 0, 12);
        System.arraycopy(decode, 12, bArr4, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArr2.length == 32) {
            int i11 = 16;
            int[] iArr2 = new int[16];
            for (int i12 = 0; i12 < 4; i12++) {
                iArr2[i12] = zza(iArr[i12], 2131181306);
            }
            for (int i13 = 4; i13 < 12; i13++) {
                iArr2[i13] = zze(bArr2, (i13 - 4) * 4);
            }
            iArr2[12] = 1;
            for (int i14 = 13; i14 < 16; i14++) {
                iArr2[i14] = zze(bArr3, (i14 - 13) * 4);
            }
            int[] iArr3 = new int[16];
            System.arraycopy(iArr2, 0, iArr3, 0, 16);
            byte[] bArr5 = new byte[length];
            int i15 = 1;
            int i16 = length;
            int i17 = 0;
            while (i16 > 0) {
                System.arraycopy(iArr3, i10, iArr2, i10, i11);
                iArr2[c10] = i15;
                int i18 = i10;
                while (i18 < 10) {
                    int i19 = i18;
                    int[] iArr4 = iArr;
                    int i20 = i16;
                    byte[] bArr6 = bArr;
                    byte[] bArr7 = bArr5;
                    byte[] bArr8 = bArr3;
                    int[] iArr5 = iArr3;
                    int i21 = i15;
                    int[] iArr6 = iArr2;
                    int i22 = i11;
                    int[] iArr7 = iArr5;
                    zzc(0, 4, 8, 12, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(1, 5, 9, 13, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(2, 6, 10, 14, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(3, 7, 11, 15, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(0, 5, 10, 15, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(1, 6, 11, 12, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(2, 7, 8, 13, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    zzc(3, 4, 9, 14, iArr4, bArr6, bArr8, i21, iArr2, iArr7);
                    i18 = i19 + 1;
                    i11 = i22;
                    i16 = i20;
                    bArr5 = bArr7;
                    iArr3 = iArr5;
                    byte[] bArr9 = bArr;
                }
                int i23 = i16;
                byte[] bArr10 = bArr5;
                int[] iArr8 = iArr3;
                int[] iArr9 = iArr2;
                int i24 = i11;
                byte[] bArr11 = new byte[64];
                for (int i25 = 0; i25 < i24; i25++) {
                    int i26 = iArr9[i25];
                    int i27 = i25 * 4;
                    bArr11[i27] = (byte) (i26 & 255);
                    bArr11[i27 + 1] = (byte) ((i26 >> 8) & 255);
                    bArr11[i27 + 2] = (byte) ((i26 >> 16) & 255);
                    bArr11[i27 + 3] = (byte) ((i26 >> 24) & 255);
                }
                for (int i28 = 0; i28 < Math.min(64, i23); i28++) {
                    int i29 = i17 + i28;
                    bArr10[i29] = (byte) zza(bArr11[i28], bArr4[i29]);
                }
                i15++;
                i16 = i23 - 64;
                i17 += 64;
                i11 = i24;
                bArr5 = bArr10;
                iArr3 = iArr8;
                iArr2 = iArr9;
                i10 = 0;
                c10 = 12;
                byte[] bArr12 = bArr;
            }
            return new String(bArr5, zza);
        }
        throw new IllegalArgumentException();
    }

    protected static final void zzc(int i10, int i11, int i12, int i13, int[] iArr, byte[] bArr, byte[] bArr2, int i14, int[] iArr2, int[] iArr3) {
        zzd(i10, i11, i13, 16, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i12, i13, i11, 12, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i10, i11, i13, 8, iArr, bArr, bArr2, i14, iArr2, iArr3);
        zzd(i12, i13, i11, 7, iArr, bArr, bArr2, i14, iArr2, iArr3);
    }

    protected static final void zzd(int i10, int i11, int i12, int i13, int[] iArr, byte[] bArr, byte[] bArr2, int i14, int[] iArr2, int[] iArr3) {
        int i15 = iArr2[i10] + iArr2[i11];
        iArr2[i10] = i15;
        int zza2 = zza(iArr2[i12], i15);
        iArr2[i12] = (zza2 << i13) | (zza2 >>> (32 - i13));
    }

    private static final int zze(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }
}

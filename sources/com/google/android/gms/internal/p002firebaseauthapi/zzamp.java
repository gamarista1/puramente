package com.google.android.gms.internal.p002firebaseauthapi;

import com.fasterxml.jackson.core.base.GeneratorBase;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamp  reason: invalid package */
final class zzamp {
    private static boolean zza(byte b10) {
        return b10 > -65;
    }

    static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (zza(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || zza(b12) || zza(b13)) {
            throw zzajk.zzd();
        }
        byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((b14 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((b14 & 1023) + GeneratorBase.SURR2_FIRST);
    }

    static /* synthetic */ void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    static /* synthetic */ void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (zza(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || zza(b12)))) {
            throw zzajk.zzd();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    static /* synthetic */ void zza(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zza(b11)) {
            throw zzajk.zzd();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }
}

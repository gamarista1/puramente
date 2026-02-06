package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzph  reason: invalid package */
public final class zzph {
    public static final Charset zza = Charset.forName(Constants.ENCODING);

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static final zzxv zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzpf("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxv.zza(bArr);
    }

    public static final zzxv zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxv.zza(bArr);
    }

    public static Integer zzb() {
        if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return null;
        }
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}

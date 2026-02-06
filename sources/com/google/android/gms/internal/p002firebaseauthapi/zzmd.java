package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd  reason: invalid package */
public final class zzmd {
    public static BigInteger zza(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] zza(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] zza(BigInteger bigInteger, int i10) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length == i10) {
                return byteArray;
            }
            int i11 = i10 + 1;
            if (byteArray.length > i11) {
                throw new GeneralSecurityException("integer too large");
            } else if (byteArray.length != i11) {
                byte[] bArr = new byte[i10];
                System.arraycopy(byteArray, 0, bArr, i10 - byteArray.length, byteArray.length);
                return bArr;
            } else if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        } else {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
    }
}

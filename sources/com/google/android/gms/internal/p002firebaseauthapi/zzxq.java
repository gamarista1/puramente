package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxq  reason: invalid package */
public final class zzxq {
    private static final Pattern zza = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);
    private static final Pattern zzb = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);

    public static String zza(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{str}));
    }

    public static void zza(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 << 3)}));
        }
    }
}

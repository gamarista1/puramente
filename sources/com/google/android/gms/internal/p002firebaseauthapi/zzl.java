package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzl  reason: invalid package */
final class zzl extends zzm {
    private final char zza;

    zzl(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char c10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }

    public final boolean zza(char c10) {
        if (c10 == this.zza) {
            return true;
        }
        return false;
    }
}

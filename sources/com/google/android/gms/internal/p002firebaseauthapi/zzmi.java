package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmi  reason: invalid package */
final class zzmi {
    static final zzmi zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmi(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzmi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}

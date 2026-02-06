package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzku  reason: invalid package */
final class zzku implements zzle {
    private final int zza;

    zzku(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return 12;
    }

    public final byte[] zzc() {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzln.zzi;
        }
        if (i10 == 32) {
            return zzln.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhk(bArr).zza(bArr2, bArr3, bArr4);
        }
        int length = bArr.length;
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}

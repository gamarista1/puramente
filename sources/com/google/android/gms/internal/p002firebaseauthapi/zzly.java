package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzly  reason: invalid package */
final class zzly implements zzlk {
    private final zzxv zza;
    private final zzxv zzb;

    private zzly(byte[] bArr, byte[] bArr2) {
        this.zza = zzxv.zza(bArr);
        this.zzb = zzxv.zza(bArr2);
    }

    static zzly zza(byte[] bArr) {
        return new zzly(bArr, zzxt.zza(bArr));
    }

    public final zzxv zzb() {
        return this.zzb;
    }

    public final zzxv zza() {
        return this.zza;
    }
}

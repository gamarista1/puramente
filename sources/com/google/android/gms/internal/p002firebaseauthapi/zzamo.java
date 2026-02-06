package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamo  reason: invalid package */
abstract class zzamo {
    zzamo() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract int zza(String str, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract String zza(byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public final boolean zzb(byte[] bArr, int i10, int i11) {
        if (zza(0, bArr, i10, i11) == 0) {
            return true;
        }
        return false;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahs  reason: invalid package */
final class zzahs extends zzaib {
    private final int zzc;
    private final int zzd;

    zzahs(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzaho.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + zzb);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    /* access modifiers changed from: protected */
    public final int zzg() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zzg(), bArr, 0, i12);
    }
}

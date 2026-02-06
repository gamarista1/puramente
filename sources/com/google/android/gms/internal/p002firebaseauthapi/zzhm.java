package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm  reason: invalid package */
public final class zzhm extends zzhp {
    public zzhm(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public final int zza() {
        return 12;
    }

    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.zza(byteBuffer, bArr, bArr2);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        return super.zza(bArr, byteBuffer);
    }

    public final int[] zza(int[] iArr, int i10) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            zzhl.zza(iArr2, this.zza);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhp  reason: invalid package */
abstract class zzhp {
    int[] zza;
    private final int zzb;

    public zzhp(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.zza = zzhl.zza(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* access modifiers changed from: package-private */
    public abstract int zza();

    /* access modifiers changed from: package-private */
    public final ByteBuffer zza(byte[] bArr, int i10) {
        int[] zza2 = zza(zzhl.zza(bArr), i10);
        int[] iArr = (int[]) zza2.clone();
        zzhl.zza(iArr);
        for (int i11 = 0; i11 < zza2.length; i11++) {
            zza2[i11] = zza2[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza2, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public abstract int[] zza(int[] iArr, int i10);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i10 = remaining / 64;
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                ByteBuffer zza2 = zza(bArr, this.zzb + i12);
                if (i12 == i10) {
                    zzwh.zza(byteBuffer, byteBuffer2, zza2, remaining % 64);
                } else {
                    zzwh.zza(byteBuffer, byteBuffer2, zza2, 64);
                }
            }
            return;
        }
        int zza3 = zza();
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza3);
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}

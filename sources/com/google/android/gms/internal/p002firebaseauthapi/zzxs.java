package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxs  reason: invalid package */
public final class zzxs implements zzbh {
    private final zzhs zza;
    private final byte[] zzb;

    private zzxs(byte[] bArr, byte[] bArr2) {
        this.zza = new zzhs(bArr);
        this.zzb = bArr2;
    }

    public static zzbh zza(zzfx zzfx) {
        return new zzxs(zzfx.zzd().zza(zzbr.zza()), zzfx.zzc().zzb());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.zza.zza(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] zza2 = zzow.zza(24);
        allocate.put(zza2);
        this.zza.zza(allocate, zza2, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return array;
        }
        return zzwh.zza(bArr3, array);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzph.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}

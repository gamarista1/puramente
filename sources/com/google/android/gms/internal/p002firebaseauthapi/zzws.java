package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
public final class zzws implements zzbh {
    private final zzxk zza;
    private final zzcf zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzws(zzxk zzxk, zzcf zzcf, int i10, byte[] bArr) {
        this.zza = zzxk;
        this.zzb = zzcf;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzbh zza(zzcz zzcz) {
        zzvz zzvz = new zzvz(zzcz.zze().zza(zzbr.zza()), zzcz.zzc().zzd());
        String valueOf = String.valueOf(zzcz.zzc().zzg());
        return new zzws(zzvz, new zzxo(new zzxm("HMAC" + valueOf, new SecretKeySpec(zzcz.zzf().zza(zzbr.zza()), "HMAC")), zzcz.zzc().zze()), zzcz.zzc().zze(), zzcz.zzd().zzb());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzb2 = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzwh.zza(this.zzd, zzb2, this.zzb.zza(zzwh.zza(bArr2, zzb2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        } else if (zzph.zza(bArr3, bArr)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.zzb.zza(copyOfRange2, zzwh.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
            return this.zza.zza(copyOfRange);
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}

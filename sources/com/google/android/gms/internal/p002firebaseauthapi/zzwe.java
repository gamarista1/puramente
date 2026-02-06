package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
public final class zzwe implements zzbq {
    private static final zzig.zza zza = zzig.zza.ALGORITHM_NOT_FIPS;
    private static final Collection<Integer> zzb = Arrays.asList(new Integer[]{64});
    private static final byte[] zzc = new byte[16];
    private static final byte[] zzd = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final zzxn zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzwe(byte[] bArr, zzxv zzxv) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = new zzxn(copyOfRange);
            this.zzg = zzxv.zzb();
        } else {
            int length = bArr.length;
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
    }

    public static zzbq zza(zzil zzil) {
        return new zzwe(zzil.zze().zza(zzbr.zza()), zzil.zzd());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        byte[] bArr4 = this.zzg;
        if (length < bArr4.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        } else if (zzph.zza(bArr4, bArr)) {
            Cipher zza2 = zzwv.zza.zza("AES/CTR/NoPadding");
            byte[] bArr5 = this.zzg;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr5.length, bArr5.length + 16);
            byte[] bArr6 = (byte[]) copyOfRange.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            zza2.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr6));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzg.length + 16, bArr.length);
            byte[] doFinal = zza2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && zzxr.zza()) {
                doFinal = new byte[0];
            }
            byte[][] bArr7 = {bArr2, doFinal};
            byte[] zza3 = this.zze.zza(zzc, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr8 = bArr7[i10];
                if (bArr8 == null) {
                    bArr8 = new byte[0];
                }
                zza3 = zzwh.zza(zzra.zzb(zza3), this.zze.zza(bArr8, 16));
            }
            byte[] bArr9 = bArr7[1];
            if (bArr9.length < 16) {
                bArr3 = zzwh.zza(zzra.zza(bArr9), zzra.zzb(zza3));
            } else if (bArr9.length >= zza3.length) {
                int length2 = bArr9.length - zza3.length;
                bArr3 = Arrays.copyOf(bArr9, bArr9.length);
                for (int i11 = 0; i11 < zza3.length; i11++) {
                    int i12 = length2 + i11;
                    bArr3[i12] = (byte) (bArr3[i12] ^ zza3[i11]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            if (MessageDigest.isEqual(copyOfRange, this.zze.zza(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }
}

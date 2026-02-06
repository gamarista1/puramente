package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjo;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwl  reason: invalid package */
public final class zzwl implements zzbs {
    static final zzmh<zzwq, zzjo.zzb> zza = zzmh.zza().zza(zzwq.NIST_P256, zzjo.zzb.zza).zza(zzwq.NIST_P384, zzjo.zzb.zzb).zza(zzwq.NIST_P521, zzjo.zzb.zzc).zza();
    static final zzmh<zzwt, zzjo.zzc> zzb = zzmh.zza().zza(zzwt.UNCOMPRESSED, zzjo.zzc.zzb).zza(zzwt.COMPRESSED, zzjo.zzc.zza).zza(zzwt.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjo.zzc.zzc).zza();
    private static final byte[] zzc = new byte[0];
    private final zzwo zzd;
    private final String zze;
    private final byte[] zzf;
    private final zzwt zzg;
    private final zzwj zzh;
    private final byte[] zzi;

    private zzwl(ECPublicKey eCPublicKey, byte[] bArr, String str, zzwt zzwt, zzwj zzwj, byte[] bArr2) {
        zzmf.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzd = new zzwo(eCPublicKey);
        this.zzf = bArr;
        this.zze = str;
        this.zzg = zzwt;
        this.zzh = zzwj;
        this.zzi = bArr2;
    }

    public static zzbs zza(zzjt zzjt) {
        byte[] byteArray = zzjt.zze().getAffineX().toByteArray();
        byte[] byteArray2 = zzjt.zze().getAffineY().toByteArray();
        ECParameterSpec zza2 = zzwr.zza(zza.zza(zzjt.zzb().zzd()));
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        zzmf.zza(eCPoint, zza2.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) zzwv.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza2));
        byte[] bArr = new byte[0];
        if (zzjt.zzb().zzh() != null) {
            bArr = zzjt.zzb().zzh().zzb();
        }
        return new zzwl(eCPublicKey, bArr, zza(zzjt.zzb().zze()), zzb.zza(zzjt.zzb().zzf()), zza(zzjt.zzb().zzb()), zzjt.zzc().zzb());
    }

    static zzwj zza(zzci zzci) {
        if (zzci instanceof zzdz) {
            return new zzwk((zzdz) zzci);
        }
        if (zzci instanceof zzdg) {
            return new zzwn((zzdg) zzci);
        }
        if (zzci instanceof zzis) {
            return new zzwm((zzis) zzci);
        }
        String valueOf = String.valueOf(zzci);
        throw new GeneralSecurityException("Unsupported parameters for Ecies: " + valueOf);
    }

    static final String zza(zzjo.zzd zzd2) {
        if (zzd2.equals(zzjo.zzd.zza)) {
            return "HmacSha1";
        }
        if (zzd2.equals(zzjo.zzd.zzb)) {
            return "HmacSha224";
        }
        if (zzd2.equals(zzjo.zzd.zzc)) {
            return "HmacSha256";
        }
        if (zzd2.equals(zzjo.zzd.zzd)) {
            return "HmacSha384";
        }
        if (zzd2.equals(zzjo.zzd.zze)) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzd2);
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: " + valueOf);
    }
}

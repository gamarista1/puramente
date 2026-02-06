package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjo;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjt  reason: invalid package */
public final class zzjt extends zzkr {
    private final zzjo zza;
    private final ECPoint zzb;
    private final zzxv zzc;
    private final zzxv zzd;
    private final Integer zze;

    private zzjt(zzjo zzjo, ECPoint eCPoint, zzxv zzxv, zzxv zzxv2, Integer num) {
        this.zza = zzjo;
        this.zzb = eCPoint;
        this.zzc = zzxv;
        this.zzd = zzxv2;
        this.zze = num;
    }

    public static zzjt zza(zzjo zzjo, zzxv zzxv, Integer num) {
        if (zzjo.zzd().equals(zzjo.zzb.zzd)) {
            zzb(zzjo.zzg(), num);
            if (zzxv.zza() == 32) {
                return new zzjt(zzjo, (ECPoint) null, zzxv, zza(zzjo.zzg(), num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public final zzjo zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzd;
    }

    public final zzxv zzd() {
        return this.zzc;
    }

    public final ECPoint zze() {
        return this.zzb;
    }

    private static void zzb(zzjo.zze zze2, Integer num) {
        zzjo.zze zze3 = zzjo.zze.zzc;
        if (!zze2.equals(zze3) && num == null) {
            String valueOf = String.valueOf(zze2);
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + valueOf + " variant.");
        } else if (zze2.equals(zze3) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static zzjt zza(zzjo zzjo, ECPoint eCPoint, Integer num) {
        EllipticCurve ellipticCurve;
        if (!zzjo.zzd().equals(zzjo.zzb.zzd)) {
            zzb(zzjo.zzg(), num);
            zzjo.zzb zzd2 = zzjo.zzd();
            if (zzd2 == zzjo.zzb.zza) {
                ellipticCurve = zzmf.zza.getCurve();
            } else if (zzd2 == zzjo.zzb.zzb) {
                ellipticCurve = zzmf.zzb.getCurve();
            } else if (zzd2 == zzjo.zzb.zzc) {
                ellipticCurve = zzmf.zzc.getCurve();
            } else {
                String valueOf = String.valueOf(zzd2);
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + valueOf);
            }
            zzmf.zza(eCPoint, ellipticCurve);
            return new zzjt(zzjo, eCPoint, (zzxv) null, zza(zzjo.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzxv zza(zzjo.zze zze2, Integer num) {
        if (zze2 == zzjo.zze.zzc) {
            return zznt.zza;
        }
        if (num == null) {
            String valueOf = String.valueOf(zze2);
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + valueOf);
        } else if (zze2 == zzjo.zze.zzb) {
            return zznt.zza(num.intValue());
        } else {
            if (zze2 == zzjo.zze.zza) {
                return zznt.zzb(num.intValue());
            }
            String valueOf2 = String.valueOf(zze2);
            throw new IllegalStateException("Unknown EciesParameters.Variant: " + valueOf2);
        }
    }

    public final Integer zza() {
        return this.zze;
    }
}

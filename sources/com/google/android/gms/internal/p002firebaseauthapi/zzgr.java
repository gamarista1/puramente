package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgr  reason: invalid package */
public final class zzgr {
    private static final zzxv zza;
    private static final zzoa<zzdz, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzds, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzgq(), zzdz.class, cls);
        zzc = zznw.zza(new zzgt(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzgs(), zzds.class, cls2);
        zze = zzmq.zza(new zzgv(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzds zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzss zza2 = zzss.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzds.zzb().zza(zzdz.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzou.zzc())).zza()).zza(zzxw.zza(zza2.zzd().zzf(), zzcn.zza(zzcn))).zza(zzou.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }

    private static zzdz.zzb zza(zzvs zzvs) {
        int i10 = zzgu.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzdz.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdz.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdz.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzdz zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsv zza2 = zzsv.zza(zzot.zza().zze(), zzaiq.zza());
                if (zza2.zzb() == 0) {
                    return zzdz.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzot.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzdz.zzb zzb2) {
        if (zzdz.zzb.zza.equals(zzb2)) {
            return zzvs.TINK;
        }
        if (zzdz.zzb.zzb.equals(zzb2)) {
            return zzvs.CRUNCHY;
        }
        if (zzdz.zzb.zzc.equals(zzb2)) {
            return zzvs.RAW;
        }
        String valueOf = String.valueOf(zzb2);
        throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
    }

    /* access modifiers changed from: private */
    public static void zzb(zzdz zzdz) {
        if (zzdz.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdz.zzd())}));
        } else if (zzdz.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[]{Integer.valueOf(zzdz.zzb())}));
        }
    }

    public static void zza() {
        zzns zza2 = zzns.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}

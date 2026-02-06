package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu  reason: invalid package */
public final class zzqu {
    private static final zzxv zza;
    private static final zzoa<zzpq, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzpj, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzqx(), zzpq.class, cls);
        zzc = zznw.zza(new zzqw(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzqz(), zzpj.class, cls2);
        zze = zzmq.zza(new zzqy(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzpj zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrx zza2 = zzrx.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzpj.zzb().zza(zzpq.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzou.zzc())).zza()).zza(zzxw.zza(zza2.zze().zzf(), zzcn.zza(zzcn))).zza(zzou.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }

    /* access modifiers changed from: private */
    public static zzpq zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzry zza2 = zzry.zza(zzot.zza().zze(), zzaiq.zza());
                return zzpq.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzot.zza().zzd())).zza();
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzpq.zzb zza(zzvs zzvs) {
        int i10 = zzrb.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzpq.zzb.zza;
        }
        if (i10 == 2) {
            return zzpq.zzb.zzb;
        }
        if (i10 == 3) {
            return zzpq.zzb.zzc;
        }
        if (i10 == 4) {
            return zzpq.zzb.zzd;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzsb zzb(zzpq zzpq) {
        return (zzsb) ((zzaje) zzsb.zzb().zza(zzpq.zzb()).zzf());
    }

    private static zzvs zza(zzpq.zzb zzb2) {
        if (zzpq.zzb.zza.equals(zzb2)) {
            return zzvs.TINK;
        }
        if (zzpq.zzb.zzb.equals(zzb2)) {
            return zzvs.CRUNCHY;
        }
        if (zzpq.zzb.zzd.equals(zzb2)) {
            return zzvs.RAW;
        }
        if (zzpq.zzb.zzc.equals(zzb2)) {
            return zzvs.LEGACY;
        }
        String valueOf = String.valueOf(zzb2);
        throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
    }

    public static void zza() {
        zzns zza2 = zzns.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}

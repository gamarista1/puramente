package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzez;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfb  reason: invalid package */
final class zzfb {
    private static final zzxv zza;
    private static final zzoa<zzez, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzfa, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzfd(), zzez.class, cls);
        zzc = zznw.zza(new zzfc(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzff(), zzfa.class, cls2);
        zze = zzmq.zza(new zzfe(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzfa zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzvk zza2 = zzvk.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzfa.zza(zzez.zza(zza2.zzd().zzd(), zza(zzou.zzc())), zzou.zze());
                }
                String valueOf = String.valueOf(zza2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
    }

    private static zzez.zza zza(zzvs zzvs) {
        int i10 = zzfh.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzez.zza.zza;
        }
        if (i10 == 2) {
            return zzez.zza.zzb;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzez zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzez.zza(zzvl.zza(zzot.zza().zze(), zzaiq.zza()).zzd(), zza(zzot.zza().zzd()));
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzez.zza zza2) {
        if (zzez.zza.zza.equals(zza2)) {
            return zzvs.TINK;
        }
        if (zzez.zza.zzb.equals(zza2)) {
            return zzvs.RAW;
        }
        String valueOf = String.valueOf(zza2);
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

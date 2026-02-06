package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgd;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz  reason: invalid package */
public final class zzhz {
    private static final zzxv zza;
    private static final zzoa<zzgd, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzfx, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzhy(), zzgd.class, cls);
        zzc = zznw.zza(new zzib(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzia(), zzfx.class, cls2);
        zze = zzmq.zza(new zzid(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzfx zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzvv zza2 = zzvv.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzfx.zza(zza(zzou.zzc()), zzxw.zza(zza2.zzd().zzf(), zzcn.zza(zzcn)), zzou.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    private static zzgd.zza zza(zzvs zzvs) {
        int i10 = zzic.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzgd.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzgd.zza.zzb;
        }
        if (i10 == 4) {
            return zzgd.zza.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzgd zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzvy.zza(zzot.zza().zze(), zzaiq.zza()).zza() == 0) {
                    return zzgd.zza(zza(zzot.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzgd.zza zza2) {
        if (zzgd.zza.zza.equals(zza2)) {
            return zzvs.TINK;
        }
        if (zzgd.zza.zzb.equals(zza2)) {
            return zzvs.CRUNCHY;
        }
        if (zzgd.zza.zzc.equals(zza2)) {
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

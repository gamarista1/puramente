package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzeq;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhf  reason: invalid package */
public final class zzhf {
    private static final zzxv zza;
    private static final zzoa<zzeq, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzem, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzhe(), zzeq.class, cls);
        zzc = zznw.zza(new zzhh(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzhg(), zzem.class, cls2);
        zze = zzmq.zza(new zzhj(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzem zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzte zza2 = zzte.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzem.zza(zza(zzou.zzc()), zzxw.zza(zza2.zzd().zzf(), zzcn.zza(zzcn)), zzou.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    private static zzeq.zza zza(zzvs zzvs) {
        int i10 = zzhi.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzeq.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzeq.zza.zzb;
        }
        if (i10 == 4) {
            return zzeq.zza.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzeq zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzth.zza(zzot.zza().zze(), zzaiq.zza());
                return zzeq.zza(zza(zzot.zza().zzd()));
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzeq.zza zza2) {
        if (zzeq.zza.zza.equals(zza2)) {
            return zzvs.TINK;
        }
        if (zzeq.zza.zzb.equals(zza2)) {
            return zzvs.CRUNCHY;
        }
        if (zzeq.zza.zzc.equals(zza2)) {
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

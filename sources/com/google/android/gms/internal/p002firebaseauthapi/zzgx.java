package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzek;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgx  reason: invalid package */
public final class zzgx {
    private static final zzxv zza;
    private static final zzoa<zzek, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzed, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzgw(), zzek.class, cls);
        zzc = zznw.zza(new zzgz(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzgy(), zzed.class, cls2);
        zze = zzmq.zza(new zzhb(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzed zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzsw zza2 = zzsw.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzed.zzb().zza(zzek.zzc().zza(zza2.zzd().zzb()).zza(zza(zzou.zzc())).zza()).zza(zzxw.zza(zza2.zzd().zzf(), zzcn.zza(zzcn))).zza(zzou.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }

    private static zzek.zzb zza(zzvs zzvs) {
        int i10 = zzha.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzek.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzek.zzb.zzb;
        }
        if (i10 == 4) {
            return zzek.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzek zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzsz zza2 = zzsz.zza(zzot.zza().zze(), zzaiq.zza());
                if (zza2.zzb() == 0) {
                    return zzek.zzc().zza(zza2.zza()).zza(zza(zzot.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzek.zzb zzb2) {
        if (zzek.zzb.zza.equals(zzb2)) {
            return zzvs.TINK;
        }
        if (zzek.zzb.zzb.equals(zzb2)) {
            return zzvs.CRUNCHY;
        }
        if (zzek.zzb.zzc.equals(zzb2)) {
            return zzvs.RAW;
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

package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl  reason: invalid package */
public final class zzgl {
    private static final zzxv zza;
    private static final zzoa<zzdq, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzdj, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzgk(), zzdq.class, cls);
        zzc = zznw.zza(new zzgn(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzgm(), zzdj.class, cls2);
        zze = zzmq.zza(new zzgp(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzdj zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsn zza2 = zzsn.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzdj.zzb().zza(zzdq.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzou.zzc())).zza()).zza(zzxw.zza(zza2.zze().zzf(), zzcn.zza(zzcn))).zza(zzou.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }

    private static zzdq.zzb zza(zzvs zzvs) {
        int i10 = zzgo.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzdq.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdq.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdq.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzdq zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzso zza2 = zzso.zza(zzot.zza().zze(), zzaiq.zza());
                return zzdq.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzot.zza().zzd())).zza();
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        } else {
            String zzf = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvs zza(zzdq.zzb zzb2) {
        if (zzdq.zzb.zza.equals(zzb2)) {
            return zzvs.TINK;
        }
        if (zzdq.zzb.zzb.equals(zzb2)) {
            return zzvs.CRUNCHY;
        }
        if (zzdq.zzb.zzc.equals(zzb2)) {
            return zzvs.RAW;
        }
        String valueOf = String.valueOf(zzb2);
        throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
    }

    private static zzsr zzb(zzdq zzdq) {
        if (zzdq.zzd() == 16) {
            return (zzsr) ((zzaje) zzsr.zzb().zza(zzdq.zzb()).zzf());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdq.zzd())}));
    }

    public static void zza() {
        zzns zza2 = zzns.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}

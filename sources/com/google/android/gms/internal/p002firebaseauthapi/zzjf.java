package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzis;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjf  reason: invalid package */
public final class zzjf {
    private static final zzxv zza;
    private static final zzoa<zzis, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzil, zzou> zzd;
    private static final zzmq<zzou> zze;
    private static final Map<zzis.zzb, zzvs> zzf;
    private static final Map<zzvs, zzis.zzb> zzg;

    static {
        zzxv zzb2 = zzph.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        Class<zzot> cls = zzot.class;
        zzb = zzoa.zza(new zzje(), zzis.class, cls);
        zzc = zznw.zza(new zzjh(), zzb2, cls);
        Class<zzou> cls2 = zzou.class;
        zzd = zzmu.zza(new zzjg(), zzil.class, cls2);
        zze = zzmq.zza(new zzjj(), zzb2, cls2);
        HashMap hashMap = new HashMap();
        zzis.zzb zzb3 = zzis.zzb.zzc;
        zzvs zzvs = zzvs.RAW;
        hashMap.put(zzb3, zzvs);
        zzis.zzb zzb4 = zzis.zzb.zza;
        zzvs zzvs2 = zzvs.TINK;
        hashMap.put(zzb4, zzvs2);
        zzis.zzb zzb5 = zzis.zzb.zzb;
        zzvs zzvs3 = zzvs.CRUNCHY;
        hashMap.put(zzb5, zzvs3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzvs.class);
        enumMap.put(zzvs, zzb3);
        enumMap.put(zzvs2, zzb4);
        enumMap.put(zzvs3, zzb5);
        enumMap.put(zzvs.LEGACY, zzb5);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    /* access modifiers changed from: private */
    public static zzil zzb(zzou zzou, zzcn zzcn) {
        if (zzou.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzta zza2 = zzta.zza(zzou.zzd(), zzaiq.zza());
                if (zza2.zza() == 0) {
                    return zzil.zzb().zza(zzis.zzc().zza(zza2.zzd().zzb()).zza(zza(zzou.zzc())).zza()).zza(zzxw.zza(zza2.zzd().zzf(), zzcn.zza(zzcn))).zza(zzou.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
    }

    private static zzis.zzb zza(zzvs zzvs) {
        Map<zzvs, zzis.zzb> map = zzg;
        if (map.containsKey(zzvs)) {
            return map.get(zzvs);
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzis zzb(zzot zzot) {
        if (zzot.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztd zza2 = zztd.zza(zzot.zza().zze(), zzaiq.zza());
                if (zza2.zzb() == 0) {
                    return zzis.zzc().zza(zza2.zza()).zza(zza(zzot.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
            }
        } else {
            String zzf2 = zzot.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzf2);
        }
    }

    private static zzvs zza(zzis.zzb zzb2) {
        Map<zzis.zzb, zzvs> map = zzf;
        if (map.containsKey(zzb2)) {
            return map.get(zzb2);
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

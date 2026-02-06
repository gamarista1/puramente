package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmn  reason: invalid package */
public final class zzmn {
    private static final Logger zza = Logger.getLogger(zzmn.class.getName());
    private static final zzmn zzb = new zzmn();
    private ConcurrentMap<String, zzbt<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbt<?> zzc(String str) {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final <P> zzbt<P> zza(String str, Class<P> cls) {
        zzbt<?> zzc2 = zzc(str);
        if (zzc2.zza().equals(cls)) {
            return zzc2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzc2.getClass());
        String valueOf2 = String.valueOf(zzc2.zza());
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", which only supports: " + valueOf2);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbt<?> zza(String str) {
        return zzc(str);
    }

    public static zzmn zza() {
        return zzb;
    }

    private final synchronized void zza(zzbt<?> zzbt, boolean z10, boolean z11) {
        try {
            String zzb2 = zzbt.zzb();
            if (z11 && this.zzd.containsKey(zzb2)) {
                if (!this.zzd.get(zzb2).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
                }
            }
            zzbt zzbt2 = this.zzc.get(zzb2);
            if (zzbt2 != null) {
                if (!zzbt2.getClass().equals(zzbt.getClass())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzb2, zzbt2.getClass().getName(), zzbt.getClass().getName()}));
                }
            }
            this.zzc.putIfAbsent(zzb2, zzbt);
            this.zzd.put(zzb2, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized <P> void zza(zzbt<P> zzbt, boolean z10) {
        zza(zzbt, zzig.zza.ALGORITHM_NOT_FIPS, z10);
    }

    public final synchronized <P> void zza(zzbt<P> zzbt, zzig.zza zza2, boolean z10) {
        if (zza2.zza()) {
            zza((zzbt<?>) zzbt, false, z10);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznp  reason: invalid package */
public final class zznp {
    private static zznp zza = new zznp();
    private final AtomicReference<zzoi> zzb = new AtomicReference<>(new zzoh().zza());

    zznp() {
    }

    public static zznp zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return this.zzb.get().zza(keyt, cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoo<InputPrimitiveT> zzoo, Class<WrapperPrimitiveT> cls) {
        return this.zzb.get().zza(zzoo, cls);
    }

    public final synchronized <KeyT extends zzbu, PrimitiveT> void zza(zzoe<KeyT, PrimitiveT> zzoe) {
        this.zzb.set(zzoi.zza(this.zzb.get()).zza(zzoe).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzch<InputPrimitiveT, WrapperPrimitiveT> zzch) {
        this.zzb.set(zzoi.zza(this.zzb.get()).zza(zzch).zza());
    }
}

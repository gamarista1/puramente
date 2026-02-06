package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns  reason: invalid package */
public final class zzns {
    private static final zzns zza = ((zzns) zzpf.zza(new zznr()));
    private final AtomicReference<zzpa> zzb = new AtomicReference<>(new zzoz().zza());

    public final <SerializationT extends zzox> zzbu zza(SerializationT serializationt, zzcn zzcn) {
        return this.zzb.get().zza(serializationt, zzcn);
    }

    public final <SerializationT extends zzox> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb(serializationt);
    }

    public final <SerializationT extends zzox> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc(serializationt);
    }

    public final <SerializationT extends zzox> zzci zza(SerializationT serializationt) {
        return this.zzb.get().zza(serializationt);
    }

    public static zzns zza() {
        return zza;
    }

    public final <KeyT extends zzbu, SerializationT extends zzox> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcn zzcn) {
        return this.zzb.get().zza(keyt, cls, zzcn);
    }

    public final <ParametersT extends zzci, SerializationT extends zzox> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return this.zzb.get().zza(parameterst, cls);
    }

    public final synchronized <SerializationT extends zzox> void zza(zzmq<SerializationT> zzmq) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzmq).zza());
    }

    public final synchronized <KeyT extends zzbu, SerializationT extends zzox> void zza(zzmu<KeyT, SerializationT> zzmu) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzmu).zza());
    }

    public final synchronized <SerializationT extends zzox> void zza(zznw<SerializationT> zznw) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zznw).zza());
    }

    public final synchronized <ParametersT extends zzci, SerializationT extends zzox> void zza(zzoa<ParametersT, SerializationT> zzoa) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzoa).zza());
    }
}

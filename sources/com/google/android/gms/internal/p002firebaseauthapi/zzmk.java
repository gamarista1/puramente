package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmk  reason: invalid package */
public final class zzmk<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmk<E, O> zza(E e10, O o10) {
        this.zza.put(e10, o10);
        this.zzb.put(o10, e10);
        return this;
    }

    private zzmk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmh<E, O> zza() {
        return new zzmh<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}

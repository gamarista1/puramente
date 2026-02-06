package com.google.android.gms.internal.play_billing;

import com.amazon.a.a.o.b.f;

final class zzcp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzcp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    /* access modifiers changed from: package-private */
    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + f.f37530b + valueOf2 + " and " + valueOf3 + f.f37530b + valueOf4);
    }
}

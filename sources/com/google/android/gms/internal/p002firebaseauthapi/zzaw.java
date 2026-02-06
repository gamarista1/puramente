package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaw  reason: invalid package */
final class zzaw {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzaw(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    /* access modifiers changed from: package-private */
    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + f.f37530b + valueOf2 + " and " + valueOf3 + f.f37530b + valueOf4);
    }
}

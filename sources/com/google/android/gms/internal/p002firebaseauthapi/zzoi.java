package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoi  reason: invalid package */
public final class zzoi {
    /* access modifiers changed from: private */
    public final Map<zzoj, zzoe<?, ?>> zza;
    /* access modifiers changed from: private */
    public final Map<Class<?>, zzch<?, ?>> zzb;

    public static zzoh zza(zzoi zzoi) {
        return new zzoh(zzoi);
    }

    private zzoi(zzoh zzoh) {
        this.zza = new HashMap(zzoh.zza);
        this.zzb = new HashMap(zzoh.zzb);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        String valueOf = String.valueOf(cls);
        throw new GeneralSecurityException("No input primitive class for " + valueOf + " available");
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzoj zzoj = new zzoj(keyt.getClass(), cls);
        if (this.zza.containsKey(zzoj)) {
            return this.zza.get(zzoj).zza(keyt);
        }
        String valueOf = String.valueOf(zzoj);
        throw new GeneralSecurityException("No PrimitiveConstructor for " + valueOf + " available");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.firebase-auth-api.zzoo<InputPrimitiveT>, com.google.android.gms.internal.firebase-auth-api.zzoo] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(com.google.android.gms.internal.p002firebaseauthapi.zzoo<InputPrimitiveT> r3, java.lang.Class<WrapperPrimitiveT> r4) {
        /*
            r2 = this;
            java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.firebase-auth-api.zzch<?, ?>> r0 = r2.zzb
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0039
            java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.firebase-auth-api.zzch<?, ?>> r0 = r2.zzb
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.firebase-auth-api.zzch r4 = (com.google.android.gms.internal.p002firebaseauthapi.zzch) r4
            java.lang.Class r0 = r3.zzc()
            java.lang.Class r1 = r4.zza()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Class r0 = r4.zza()
            java.lang.Class r1 = r3.zzc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Object r3 = r4.zza(r3)
            return r3
        L_0x0031:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r3.<init>(r4)
            throw r3
        L_0x0039:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No wrapper found for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzoi.zza(com.google.android.gms.internal.firebase-auth-api.zzoo, java.lang.Class):java.lang.Object");
    }
}

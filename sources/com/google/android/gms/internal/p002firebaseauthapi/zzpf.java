package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpf  reason: invalid package */
public final class zzpf extends RuntimeException {
    public zzpf(String str) {
        super(str);
    }

    public static <T> T zza(zzpi<T> zzpi) {
        try {
            return zzpi.zza();
        } catch (Exception e10) {
            throw new zzpf((Throwable) e10);
        }
    }

    private zzpf(Throwable th2) {
        super(th2);
    }
}

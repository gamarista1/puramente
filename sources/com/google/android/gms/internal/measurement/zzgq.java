package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzgq {
    public static <V> V zza(zzgp<V> zzgp) {
        long clearCallingIdentity;
        try {
            return zzgp.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = zzgp.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
    }
}

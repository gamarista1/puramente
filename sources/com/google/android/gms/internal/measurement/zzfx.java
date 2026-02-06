package com.google.android.gms.internal.measurement;

public final class zzfx {
    private static zzga zza;

    public static synchronized zzga zza() {
        zzga zzga;
        synchronized (zzfx.class) {
            try {
                if (zza == null) {
                    zza(new zzfz());
                }
                zzga = zza;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return zzga;
    }

    private static synchronized void zza(zzga zzga) {
        synchronized (zzfx.class) {
            if (zza == null) {
                zza = zzga;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}

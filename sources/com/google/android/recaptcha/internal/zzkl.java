package com.google.android.recaptcha.internal;

final class zzkl {
    private static final zzkk zza;
    private static final zzkk zzb = new zzkk();

    static {
        zzkk zzkk = null;
        try {
            zzkk = (zzkk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zza = zzkk;
    }

    static zzkk zza() {
        return zza;
    }

    static zzkk zzb() {
        return zzb;
    }
}

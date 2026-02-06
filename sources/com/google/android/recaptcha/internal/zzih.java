package com.google.android.recaptcha.internal;

final class zzih {
    private static final zzif zza = new zzig();
    private static final zzif zzb;

    static {
        zzif zzif = null;
        try {
            zzif = (zzif) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zzb = zzif;
    }

    static zzif zza() {
        zzif zzif = zzb;
        if (zzif != null) {
            return zzif;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzif zzb() {
        return zza;
    }
}

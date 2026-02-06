package com.google.android.recaptcha.internal;

final class zzka {
    private static final zzjz zza;
    private static final zzjz zzb = new zzjz();

    static {
        zzjz zzjz = null;
        try {
            zzjz = (zzjz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zza = zzjz;
    }

    static zzjz zza() {
        return zza;
    }

    static zzjz zzb() {
        return zzb;
    }
}

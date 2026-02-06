package com.google.android.gms.internal.play_billing;

final class zzhf implements zzik {
    private static final zzhf zza = new zzhf();

    private zzhf() {
    }

    public static zzhf zza() {
        return zza;
    }

    public final zzij zzb(Class cls) {
        Class<zzhk> cls2 = zzhk.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzij) zzhk.zzo(cls.asSubclass(cls2)).zzd(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzhk.class.isAssignableFrom(cls);
    }
}

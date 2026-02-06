package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zziu {
    public static final /* synthetic */ int zza = 0;
    private static final zziu zzb = new zziu();
    private final zziy zzc = new zzie();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    private zziu() {
    }

    public static zziu zza() {
        return zzb;
    }

    public final zzix zzb(Class cls) {
        zzhp.zzc(cls, "messageType");
        zzix zzix = (zzix) this.zzd.get(cls);
        if (zzix == null) {
            zzix = this.zzc.zza(cls);
            zzhp.zzc(cls, "messageType");
            zzix zzix2 = (zzix) this.zzd.putIfAbsent(cls, zzix);
            if (zzix2 == null) {
                return zzix;
            }
            return zzix2;
        }
        return zzix;
    }
}

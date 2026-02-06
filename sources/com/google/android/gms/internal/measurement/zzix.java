package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzix {
    static final zzix zza = new zzix(true);
    private static volatile boolean zzb = false;
    private static volatile zzix zzc;
    private final Map<zza, zzjk.zzf<?, ?>> zzd;

    private static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i10) {
            this.zza = obj;
            this.zzb = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj;
            if (this.zza == zza2.zza && this.zzb == zza2.zzb) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    zzix() {
        this.zzd = new HashMap();
    }

    public static zzix zza() {
        zzix zzix = zzc;
        if (zzix != null) {
            return zzix;
        }
        synchronized (zzix.class) {
            try {
                zzix zzix2 = zzc;
                if (zzix2 != null) {
                    return zzix2;
                }
                zzix zza2 = zzji.zza(zzix.class);
                zzc = zza2;
                return zza2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private zzix(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public final <ContainingType extends zzkt> zzjk.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return this.zzd.get(new zza(containingtype, i10));
    }
}

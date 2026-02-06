package com.google.android.recaptcha.internal;

import Sg.p;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class zzcb {
    public static final zzcb zza = new zzcb();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    private zzcb() {
    }

    public static final void zza(zznz zznz) {
        zzb = C6565s.j1(zznz.zzf().zzi());
        zzc = C6565s.j1(zznz.zzg().zzi());
    }

    public static final boolean zzb(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = Long.valueOf(System.currentTimeMillis());
            }
            zze++;
            return true;
        }
        C6496s.f(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = zzc;
        C6496s.f(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }

    private static final boolean zzc(String str, Set set) {
        String str2 = "";
        for (String valueOf : p.E0(str, new char[]{'.'}, false, 0, 6, (Object) null)) {
            String concat = str2.concat(String.valueOf(valueOf));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }
}

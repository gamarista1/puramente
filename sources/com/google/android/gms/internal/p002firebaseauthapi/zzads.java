package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.h;
import android.app.Activity;
import androidx.collection.C1587a;
import com.google.firebase.auth.Q;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzads  reason: invalid package */
public final class zzads {
    private static final Map<String, zzadu> zza = new C1587a();

    public static Q.b zza(String str, Q.b bVar, zzacz zzacz) {
        zza(str, zzacz);
        return new zzadv(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacz zzacz) {
        zza.put(str, new zzadu(zzacz, h.c().currentTimeMillis()));
    }

    public static boolean zza(String str, Q.b bVar, Activity activity, Executor executor) {
        Map<String, zzadu> map = zza;
        if (map.containsKey(str)) {
            zzadu zzadu = map.get(str);
            if (h.c().currentTimeMillis() - zzadu.zzb < 120000) {
                zzacz zzacz = zzadu.zza;
                if (zzacz == null) {
                    return true;
                }
                zzacz.zza(bVar, activity, executor, str);
                return true;
            }
            zza(str, (zzacz) null);
            return false;
        }
        zza(str, (zzacz) null);
        return false;
    }
}

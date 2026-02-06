package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.collection.C1587a;
import com.revenuecat.purchases.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ub.C5230g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaec  reason: invalid package */
public final class zzaec {
    private static final Map<String, zzaef> zza = new C1587a();
    private static final Map<String, List<WeakReference<zzaee>>> zzb = new C1587a();

    private static String zza(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i10 + "/";
    }

    public static String zzb(String str) {
        zzaef zzaef;
        String str2;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaef = map.get(str);
        }
        if (zzaef != null) {
            str2 = "" + zza(zzaef.zzb(), zzaef.zza(), zzaef.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "" + "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzaef zzaef;
        String str2;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaef = map.get(str);
        }
        if (zzaef != null) {
            str2 = "" + zza(zzaef.zzb(), zzaef.zza(), zzaef.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "" + "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzaef zzaef;
        String str2;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaef = map.get(str);
        }
        if (zzaef != null) {
            str2 = "" + zza(zzaef.zzb(), zzaef.zza(), zzaef.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
        } else {
            str2 = "" + "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    public static String zza(String str) {
        zzaef zzaef;
        Map<String, zzaef> map = zza;
        synchronized (map) {
            zzaef = map.get(str);
        }
        if (zzaef != null) {
            String zza2 = zza(zzaef.zzb(), zzaef.zza(), zzaef.zzb().contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
            return zza2 + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzaee zzaee) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference(zzaee));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzaee));
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zza(C5230g gVar, String str, int i10) {
        String b10 = gVar.r().b();
        Map<String, zzaef> map = zza;
        synchronized (map) {
            map.put(b10, new zzaef(str, i10));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(b10)) {
                    boolean z10 = false;
                    for (WeakReference weakReference : map2.get(b10)) {
                        zzaee zzaee = (zzaee) weakReference.get();
                        if (zzaee != null) {
                            zzaee.zza();
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        zza.remove(b10);
                    }
                }
            } finally {
            }
        }
    }

    public static boolean zza(C5230g gVar) {
        return zza.containsKey(gVar.r().b());
    }
}

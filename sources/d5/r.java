package D5;

import D5.u;
import F5.k;
import Sg.p;
import android.content.SharedPreferences;
import com.facebook.I;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C6496s;
import mf.O;
import org.json.JSONObject;
import t7.C4049a;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f30521a = new r();

    private r() {
    }

    public static final void c() {
        Class<r> cls = r.class;
        if (!C4049a.d(cls)) {
            try {
                SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences2 = I.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
                I.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void d(Map map, Map map2, boolean z10, String str, u.a aVar, boolean z11) {
        Class<r> cls = r.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(map, "purchaseDetailsMap");
                C6496s.h(map2, "skuDetailsMap");
                C6496s.h(str, "packageName");
                C6496s.h(aVar, "billingClientVersion");
                r rVar = f30521a;
                rVar.f(rVar.b(rVar.a(map, z10), map2, str), z10, aVar, z11);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final boolean e() {
        Class<r> cls = r.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            return !I.l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final void f(Map map, boolean z10, u.a aVar, boolean z11) {
        if (!C4049a.d(this)) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    k.j((String) entry.getKey(), (String) entry.getValue(), z10, aVar, z11);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void g() {
        Collection collection;
        Class<r> cls = r.class;
        if (!C4049a.d(cls)) {
            try {
                SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long max = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0)), 1736528400000L);
                CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                SharedPreferences sharedPreferences2 = I.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                    Set<String> stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                    if (stringSet == null) {
                        collection = new HashSet();
                    } else {
                        collection = stringSet;
                    }
                    copyOnWriteArraySet.addAll(collection);
                    for (String F02 : copyOnWriteArraySet) {
                        try {
                            long parseLong = Long.parseLong((String) p.F0(F02, new String[]{";"}, false, 2, 2, (Object) null).get(1)) * 1000;
                            if (((double) Math.abs(String.valueOf(parseLong).length() - 13)) < Math.log10(1000.0d)) {
                                max = Math.max(max, parseLong);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", max).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", max).apply();
                c();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void h() {
        Class<r> cls = r.class;
        if (!C4049a.d(cls)) {
            try {
                try {
                    I.l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void i() {
        Class<r> cls = r.class;
        if (!C4049a.d(cls)) {
            try {
                h();
                try {
                    SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", currentTimeMillis).apply();
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", currentTimeMillis).apply();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final Map a(Map map, boolean z10) {
        long j10;
        Map map2 = map;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(map2, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            if (z10) {
                j10 = sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L);
            } else {
                j10 = sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            }
            long j11 = 0;
            for (Map.Entry entry : O.y(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j12 = jSONObject.getLong("purchaseTime");
                        if (j12 <= j10) {
                            map2.remove(str);
                        }
                        j11 = Math.max(j11, j12);
                    }
                } catch (Exception unused) {
                }
            }
            if (j11 >= j10) {
                if (z10) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", j11).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", j11).apply();
                }
            }
            return new HashMap(map2);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final Map b(Map map, Map map2, String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(map, "purchaseDetailsMap");
            C6496s.h(map2, "skuDetailsMap");
            C6496s.h(str, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get((String) entry.getKey());
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String jSONObject3 = jSONObject.toString();
                        C6496s.g(jSONObject3, "purchaseDetail.toString()");
                        String jSONObject4 = jSONObject2.toString();
                        C6496s.g(jSONObject4, "skuDetail.toString()");
                        linkedHashMap.put(jSONObject3, jSONObject4);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }
}

package E5;

import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f30657a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30658b;

    /* renamed from: c  reason: collision with root package name */
    private static HashSet f30659c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static Map f30660d = new HashMap();

    private g() {
    }

    public static final void a() {
        Class<g> cls = g.class;
        if (!C4049a.d(cls)) {
            try {
                f30657a.b();
                if (!f30659c.isEmpty() || !f30660d.isEmpty()) {
                    f30658b = true;
                } else {
                    f30658b = false;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void b() {
        HashSet m10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    try {
                        f30659c = new HashSet();
                        f30660d = new HashMap();
                        JSONArray v10 = u10.v();
                        if (v10 != null && v10.length() != 0) {
                            int length = v10.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject = v10.getJSONObject(i10);
                                boolean has = jSONObject.has(SubscriberAttributeKt.JSON_NAME_KEY);
                                boolean has2 = jSONObject.has("value");
                                if (has && has2) {
                                    String string = jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY);
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (!(jSONArray == null || (m10 = W.m(jSONArray)) == null)) {
                                        if (string.equals("_MTSDK_Default_")) {
                                            f30659c = m10;
                                        } else {
                                            Map map = f30660d;
                                            C6496s.g(string, "sensitiveParamsScope");
                                            map.put(string, m10);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|(4:21|(2:23|32)(1:31)|30|19)|24|25|(2:27|33)(1:36)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(android.os.Bundle r6, java.lang.String r7) {
        /*
            java.lang.Class<E5.g> r0 = E5.g.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "eventName"
            kotlin.jvm.internal.C6496s.h(r7, r1)     // Catch:{ all -> 0x0026 }
            boolean r1 = f30658b     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0073
            if (r6 != 0) goto L_0x0015
            goto L_0x0073
        L_0x0015:
            java.util.HashSet r1 = f30659c     // Catch:{ all -> 0x0026 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0028
            java.util.Map r1 = f30660d     // Catch:{ all -> 0x0026 }
            boolean r1 = r1.containsKey(r7)     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0028
            return
        L_0x0026:
            r6 = move-exception
            goto L_0x0074
        L_0x0028:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
            java.util.Map r2 = f30660d     // Catch:{ Exception -> 0x0064 }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ Exception -> 0x0064 }
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ Exception -> 0x0064 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0064 }
            java.util.Set r3 = r6.keySet()     // Catch:{ Exception -> 0x0064 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x0064 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0064 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0064 }
        L_0x0044:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0064 }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0064 }
            E5.g r4 = f30657a     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = "key"
            kotlin.jvm.internal.C6496s.g(r3, r5)     // Catch:{ Exception -> 0x0064 }
            boolean r4 = r4.d(r3, r7)     // Catch:{ Exception -> 0x0064 }
            if (r4 == 0) goto L_0x0044
            r6.remove(r3)     // Catch:{ Exception -> 0x0064 }
            r1.put(r3)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0044
        L_0x0064:
            int r7 = r1.length()     // Catch:{ all -> 0x0026 }
            if (r7 <= 0) goto L_0x0073
            java.lang.String r7 = "_filteredKey"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0026 }
            r6.putString(r7, r1)     // Catch:{ all -> 0x0026 }
        L_0x0073:
            return
        L_0x0074:
            t7.C4049a.b(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.g.c(android.os.Bundle, java.lang.String):void");
    }

    private final boolean d(String str, HashSet hashSet) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (!f30659c.contains(str)) {
                if (hashSet == null) {
                    return false;
                }
                if (hashSet.isEmpty()) {
                    return false;
                }
                if (hashSet.contains(str)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}

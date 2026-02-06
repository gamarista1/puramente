package J5;

import android.content.SharedPreferences;
import com.facebook.I;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import mf.O;
import o7.W;
import t7.C4049a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f32172a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f32173b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f32174c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f32175d = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String str, String str2) {
        Class<b> cls = b.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "pathID");
                C6496s.h(str2, "predictedEvent");
                if (!f32175d.get()) {
                    f32172a.c();
                }
                Map map = f32173b;
                map.put(str, str2);
                SharedPreferences sharedPreferences = f32174c;
                if (sharedPreferences == null) {
                    C6496s.v("shardPreferences");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", W.n0(O.y(map))).apply();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|6|7|(1:9)|18|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "text"
            java.lang.Class<J5.b> r1 = J5.b.class
            boolean r2 = t7.C4049a.d(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = "view"
            kotlin.jvm.internal.C6496s.h(r4, r2)     // Catch:{ all -> 0x0033 }
            kotlin.jvm.internal.C6496s.h(r5, r0)     // Catch:{ all -> 0x0033 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r2.<init>()     // Catch:{ all -> 0x0033 }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x003a }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x003a }
            r5.<init>()     // Catch:{ JSONException -> 0x003a }
        L_0x0021:
            if (r4 == 0) goto L_0x0035
            java.lang.Class r0 = r4.getClass()     // Catch:{ JSONException -> 0x003a }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x003a }
            r5.put(r0)     // Catch:{ JSONException -> 0x003a }
            android.view.ViewGroup r4 = x5.C4170f.j(r4)     // Catch:{ JSONException -> 0x003a }
            goto L_0x0021
        L_0x0033:
            r4 = move-exception
            goto L_0x0043
        L_0x0035:
            java.lang.String r4 = "classname"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x003a }
        L_0x003a:
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = o7.W.J0(r4)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0043:
            t7.C4049a.b(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.b.b(android.view.View, java.lang.String):java.lang.String");
    }

    private final void c() {
        String str = "";
        if (!C4049a.d(this)) {
            try {
                AtomicBoolean atomicBoolean = f32175d;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    C6496s.g(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
                    f32174c = sharedPreferences;
                    Map map = f32173b;
                    if (sharedPreferences == null) {
                        C6496s.v("shardPreferences");
                        sharedPreferences = null;
                    }
                    String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", str);
                    if (string != null) {
                        str = string;
                    }
                    map.putAll(W.j0(str));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final String d(String str) {
        Class<b> cls = b.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "pathID");
            Map map = f32173b;
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}

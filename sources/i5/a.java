package I5;

import android.util.Log;
import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31766a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f31767b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f31768c = a.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    private static final List f31769d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static final Set f31770e = new CopyOnWriteArraySet();

    /* renamed from: I5.a$a  reason: collision with other inner class name */
    public static final class C0521a {

        /* renamed from: a  reason: collision with root package name */
        private String f31771a;

        /* renamed from: b  reason: collision with root package name */
        private Map f31772b;

        public C0521a(String str, Map map) {
            C6496s.h(str, "eventName");
            C6496s.h(map, "restrictiveParams");
            this.f31771a = str;
            this.f31772b = map;
        }

        public final String a() {
            return this.f31771a;
        }

        public final Map b() {
            return this.f31772b;
        }

        public final void c(Map map) {
            C6496s.h(map, "<set-?>");
            this.f31772b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                f31767b = true;
                f31766a.c();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final String b(String str, String str2) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            for (C0521a aVar : new ArrayList(f31769d)) {
                if (aVar != null) {
                    if (C6496s.c(str, aVar.a())) {
                        for (String str3 : aVar.b().keySet()) {
                            if (C6496s.c(str2, str3)) {
                                return (String) aVar.b().get(str3);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e10) {
            Log.w(f31768c, "getMatchedRuleType failed", e10);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
        return null;
    }

    private final void c() {
        String s10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null && (s10 = u10.s()) != null) {
                    if (s10.length() != 0) {
                        JSONObject jSONObject = new JSONObject(s10);
                        f31769d.clear();
                        f31770e.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                                C0521a aVar = new C0521a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.c(W.p(optJSONObject));
                                    f31769d.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f31770e.add(aVar.a());
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final boolean d(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return f31770e.contains(str);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final String e(String str) {
        Class<a> cls = a.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "eventName");
            if (!f31767b || !f31766a.d(str)) {
                return str;
            }
            return "_removed_";
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void f(Map map, String str) {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(map, "parameters");
                C6496s.h(str, "eventName");
                if (f31767b) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String b10 = f31766a.b(str, str2);
                        if (b10 != null) {
                            hashMap.put(str2, b10);
                            map.remove(str2);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}

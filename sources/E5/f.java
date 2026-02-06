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

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f30654a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30655b;

    /* renamed from: c  reason: collision with root package name */
    private static Map f30656c = new HashMap();

    private f() {
    }

    public static final void a() {
        Class<f> cls = f.class;
        if (!C4049a.d(cls)) {
            try {
                f30654a.c();
                if (!f30656c.isEmpty()) {
                    f30655b = true;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final String b(String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            for (String str2 : f30656c.keySet()) {
                HashSet hashSet = (HashSet) f30656c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final void c() {
        HashSet m10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    try {
                        f30656c = new HashMap();
                        JSONArray r10 = u10.r();
                        if (r10 != null && r10.length() != 0) {
                            int length = r10.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject = r10.getJSONObject(i10);
                                boolean has = jSONObject.has(SubscriberAttributeKt.JSON_NAME_KEY);
                                boolean has2 = jSONObject.has("value");
                                if (has && has2) {
                                    String string = jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY);
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (!(string == null || (m10 = W.m(jSONArray)) == null)) {
                                        f30656c.put(string, m10);
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

    public static final String d(String str) {
        String b10;
        Class<f> cls = f.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "eventName");
            if (!f30655b || (b10 = f30654a.b(str)) == null) {
                return str;
            }
            return b10;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}

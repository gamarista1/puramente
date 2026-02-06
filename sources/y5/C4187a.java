package y5;

import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.C4028e;
import t7.C4049a;

/* renamed from: y5.a  reason: case insensitive filesystem */
public final class C4187a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4187a f49537a = new C4187a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f49538b;

    /* renamed from: c  reason: collision with root package name */
    private static final List f49539c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final Set f49540d = new HashSet();

    /* renamed from: y5.a$a  reason: collision with other inner class name */
    public static final class C0753a {

        /* renamed from: a  reason: collision with root package name */
        private String f49541a;

        /* renamed from: b  reason: collision with root package name */
        private List f49542b;

        public C0753a(String str, List list) {
            C6496s.h(str, "eventName");
            C6496s.h(list, "deprecateParams");
            this.f49541a = str;
            this.f49542b = list;
        }

        public final List a() {
            return this.f49542b;
        }

        public final String b() {
            return this.f49541a;
        }

        public final void c(List list) {
            C6496s.h(list, "<set-?>");
            this.f49542b = list;
        }
    }

    private C4187a() {
    }

    public static final void a() {
        Class<C4187a> cls = C4187a.class;
        if (!C4049a.d(cls)) {
            try {
                f49538b = true;
                f49537a.b();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final synchronized void b() {
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    String s10 = u10.s();
                    if (s10 != null && s10.length() > 0) {
                        JSONObject jSONObject = new JSONObject(s10);
                        f49539c.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    Set set = f49540d;
                                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                                    set.add(next);
                                } else {
                                    JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                                    C0753a aVar = new C0753a(next, new ArrayList());
                                    if (optJSONArray != null) {
                                        aVar.c(W.n(optJSONArray));
                                    }
                                    f49539c.add(aVar);
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

    public static final void c(Map map, String str) {
        Class<C4187a> cls = C4187a.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(map, "parameters");
                C6496s.h(str, "eventName");
                if (f49538b) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (C0753a aVar : new ArrayList(f49539c)) {
                        if (C6496s.c(aVar.b(), str)) {
                            for (String str2 : arrayList) {
                                if (aVar.a().contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void d(List list) {
        Class<C4187a> cls = C4187a.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(list, "events");
                if (f49538b) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (f49540d.contains(((C4028e) it.next()).f())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}

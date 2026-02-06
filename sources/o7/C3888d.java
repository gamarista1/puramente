package o7;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o7.d  reason: case insensitive filesystem */
public final class C3888d {

    /* renamed from: a  reason: collision with root package name */
    public static final C3888d f47230a = new C3888d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f47231b;

    /* renamed from: o7.d$a */
    public static final class a implements h {
        a() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: o7.d$b */
    public static final class b implements h {
        b() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: o7.d$c */
    public static final class c implements h {
        c() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: o7.d$d  reason: collision with other inner class name */
    public static final class C0709d implements h {
        C0709d() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: o7.d$e */
    public static final class e implements h {
        e() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: o7.d$f */
    public static final class f implements h {
        f() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: o7.d$g */
    public static final class g implements h {
        g() {
        }

        public void a(Bundle bundle, String str, Object obj) {
            C6496s.h(bundle, "bundle");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                Object obj2 = jSONArray.get(i10);
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                    i10++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: o7.d$h */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f47231b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new C0709d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    private C3888d() {
    }

    public static final Bundle a(JSONObject jSONObject) {
        C6496s.h(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = (h) f47231b.get(obj.getClass());
                    if (hVar != null) {
                        C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                        C6496s.g(obj, "value");
                        hVar.a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}

package u8;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import org.json.JSONArray;
import org.json.JSONObject;
import v8.C4111a;

/* renamed from: u8.b  reason: case insensitive filesystem */
public final class C4100b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4100b f48625a = new C4100b();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f48626b = O.k(C6502A.a(String.class, new a()), C6502A.a(String[].class, new C0735b()), C6502A.a(JSONArray.class, new c()));

    /* renamed from: u8.b$a */
    public static final class a implements d {
        a() {
        }

        public void a(JSONObject jSONObject, String str, Object obj) {
            C6496s.h(jSONObject, "json");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: u8.b$b  reason: collision with other inner class name */
    public static final class C0735b implements d {
        C0735b() {
        }

        public void a(JSONObject jSONObject, String str, Object obj) {
            C6496s.h(jSONObject, "json");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            JSONArray jSONArray = new JSONArray();
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            for (String put : (String[]) obj) {
                jSONArray.put(put);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* renamed from: u8.b$c */
    public static final class c implements d {
        c() {
        }

        public void a(JSONObject jSONObject, String str, Object obj) {
            C6496s.h(jSONObject, "json");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* renamed from: u8.b$d */
    private interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    private C4100b() {
    }

    public static final JSONObject a(C4111a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : aVar.c()) {
            Object b10 = aVar.b(str);
            if (b10 != null) {
                d dVar = (d) f48626b.get(b10.getClass());
                if (dVar != null) {
                    dVar.a(jSONObject, str, b10);
                } else {
                    throw new IllegalArgumentException("Unsupported type: " + b10.getClass());
                }
            }
        }
        return jSONObject;
    }
}

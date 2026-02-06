package u5;

import Sg.p;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f48587d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Set f48588e = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    private final String f48589a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48590b;

    /* renamed from: c  reason: collision with root package name */
    private final List f48591c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C6496s.g(optString, "k");
                    if (optString.length() != 0) {
                        Set a10 = d.a();
                        C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                        List F02 = p.F0(optString, new String[]{f.f37529a}, false, 0, 6, (Object) null);
                        C6496s.g(optString2, "v");
                        a10.add(new d(next, F02, optString2, (DefaultConstructorMarker) null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            for (d c10 : d.a()) {
                hashSet.add(c10.c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(d.a());
        }

        public final void d(String str) {
            C6496s.h(str, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        Class<d> cls = d.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48588e;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public final List b() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f48591c);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f48589a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f48590b;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private d(String str, List list, String str2) {
        this.f48589a = str;
        this.f48590b = str2;
        this.f48591c = list;
    }
}

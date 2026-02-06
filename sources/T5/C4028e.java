package t5;

import E5.c;
import E5.f;
import Sg.m;
import android.os.Bundle;
import com.facebook.C3459v;
import com.facebook.V;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6514M;
import o7.J;
import org.json.JSONObject;
import y5.C4187a;

/* renamed from: t5.e  reason: case insensitive filesystem */
public final class C4028e implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f48221f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final HashSet f48222g = new HashSet();
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f48223a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f48224b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f48225c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48226d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48227e;

    /* renamed from: t5.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String str) {
            boolean contains;
            C6496s.h(str, "identifier");
            if (str.length() == 0 || str.length() > 40) {
                U u10 = U.f71764a;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                C6496s.g(format, "format(locale, format, *args)");
                throw new C3459v(format);
            }
            synchronized (C4028e.f48222g) {
                contains = C4028e.f48222g.contains(str);
                C6514M m10 = C6514M.f71813a;
            }
            if (contains) {
                return;
            }
            if (new m("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").d(str)) {
                synchronized (C4028e.f48222g) {
                    C4028e.f48222g.add(str);
                }
                return;
            }
            U u11 = U.f71764a;
            String format2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format2, "format(format, *args)");
            throw new C3459v(format2);
        }

        private a() {
        }
    }

    /* renamed from: t5.e$b */
    public static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public static final a f48228e = new a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a  reason: collision with root package name */
        private final String f48229a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48230b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f48231c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f48232d;

        /* renamed from: t5.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String str, String str2, boolean z10, boolean z11) {
            C6496s.h(str, "jsonString");
            C6496s.h(str2, "operationalJsonString");
            this.f48229a = str;
            this.f48230b = str2;
            this.f48231c = z10;
            this.f48232d = z11;
        }

        private final Object readResolve() {
            return new C4028e(this.f48229a, this.f48230b, this.f48231c, this.f48232d, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C4028e(String str, String str2, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, z11);
    }

    private final JSONObject d(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        f48221f.a(str2);
        JSONObject jSONObject = new JSONObject();
        String e10 = I5.a.e(str2);
        if (C6496s.c(e10, str2)) {
            e10 = f.d(str2);
        }
        jSONObject.put("_eventName", e10);
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map j10 = j(this, bundle, false, 2, (Object) null);
            for (String str3 : j10.keySet()) {
                jSONObject.put(str3, j10.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f48226d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f48225c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            J.a aVar = J.f47112e;
            V v10 = V.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            C6496s.g(jSONObject2, "eventObject.toString()");
            aVar.c(v10, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map i(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            a aVar = f48221f;
            C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
            aVar.a(next);
            Object obj = bundle.get(next);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(next, obj.toString());
            } else {
                U u10 = U.f71764a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, next}, 2));
                C6496s.g(format, "format(format, *args)");
                throw new C3459v(format);
            }
        }
        if (!z10) {
            c.c(hashMap);
            I5.a.f(kotlin.jvm.internal.V.d(hashMap), this.f48227e);
            C4187a.c(kotlin.jvm.internal.V.d(hashMap), this.f48227e);
        }
        return hashMap;
    }

    static /* synthetic */ Map j(C4028e eVar, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return eVar.i(bundle, z10);
    }

    private final Object writeReplace() {
        String jSONObject = this.f48223a.toString();
        C6496s.g(jSONObject, "jsonObject.toString()");
        String jSONObject2 = this.f48224b.toString();
        C6496s.g(jSONObject2, "operationalJsonObject.toString()");
        return new b(jSONObject, jSONObject2, this.f48225c, this.f48226d);
    }

    public final boolean b() {
        return this.f48225c;
    }

    public final JSONObject c() {
        return this.f48223a;
    }

    public final JSONObject e() {
        return this.f48223a;
    }

    public final String f() {
        return this.f48227e;
    }

    public final JSONObject g() {
        return this.f48224b;
    }

    public final boolean h() {
        return this.f48225c;
    }

    public String toString() {
        U u10 = U.f71764a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f48223a.optString("_eventName"), Boolean.valueOf(this.f48225c), this.f48223a.toString()}, 3));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r11 = r14.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4028e(java.lang.String r7, java.lang.String r8, java.lang.Double r9, android.os.Bundle r10, boolean r11, boolean r12, java.util.UUID r13, t5.C4022O r14) {
        /*
            r6 = this;
            java.lang.String r0 = "contextName"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r6.<init>()
            r6.f48225c = r11
            r6.f48226d = r12
            r6.f48227e = r8
            if (r14 == 0) goto L_0x001b
            org.json.JSONObject r11 = r14.e()
            if (r11 != 0) goto L_0x0020
        L_0x001b:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
        L_0x0020:
            r6.f48224b = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r13
            org.json.JSONObject r7 = r0.d(r1, r2, r3, r4, r5)
            r6.f48223a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4028e.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID, t5.O):void");
    }

    private C4028e(String str, String str2, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject(str);
        this.f48223a = jSONObject;
        this.f48224b = new JSONObject(str2);
        this.f48225c = z10;
        String optString = jSONObject.optString("_eventName");
        C6496s.g(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f48227e = optString;
        this.f48226d = z11;
    }
}

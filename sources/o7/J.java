package o7;

import Sg.p;
import android.util.Log;
import com.facebook.I;
import com.facebook.V;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

public final class J {

    /* renamed from: e  reason: collision with root package name */
    public static final a f47112e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f47113f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final V f47114a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47115b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f47116c;

    /* renamed from: d  reason: collision with root package name */
    private int f47117d = 3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : J.f47113f.entrySet()) {
                str2 = p.D(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        public final void a(V v10, int i10, String str, String str2) {
            C6496s.h(v10, "behavior");
            C6496s.h(str, "tag");
            C6496s.h(str2, "string");
            if (I.I(v10)) {
                String f10 = f(str2);
                if (!p.J(str, "FacebookSDK.", false, 2, (Object) null)) {
                    str = "FacebookSDK." + str;
                }
                Log.println(i10, str, f10);
                if (v10 == V.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(V v10, String str, String str2) {
            C6496s.h(v10, "behavior");
            C6496s.h(str, "tag");
            C6496s.h(str2, "string");
            a(v10, 3, str, str2);
        }

        public final void c(V v10, String str, String str2, Object... objArr) {
            C6496s.h(v10, "behavior");
            C6496s.h(str, "tag");
            C6496s.h(str2, "format");
            C6496s.h(objArr, "args");
            if (I.I(v10)) {
                U u10 = U.f71764a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C6496s.g(format, "format(format, *args)");
                a(v10, 3, str, format);
            }
        }

        public final synchronized void d(String str) {
            C6496s.h(str, "accessToken");
            if (!I.I(V.INCLUDE_ACCESS_TOKENS)) {
                e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String str, String str2) {
            C6496s.h(str, "original");
            C6496s.h(str2, "replace");
            J.f47113f.put(str, str2);
        }

        private a() {
        }
    }

    public J(V v10, String str) {
        C6496s.h(v10, "behavior");
        C6496s.h(str, "tag");
        this.f47114a = v10;
        this.f47115b = "FacebookSDK." + X.n(str, "tag");
        this.f47116c = new StringBuilder();
    }

    private final boolean g() {
        return I.I(this.f47114a);
    }

    public final void b(String str) {
        C6496s.h(str, "string");
        if (g()) {
            this.f47116c.append(str);
        }
    }

    public final void c(String str, Object... objArr) {
        C6496s.h(str, "format");
        C6496s.h(objArr, "args");
        if (g()) {
            StringBuilder sb2 = this.f47116c;
            U u10 = U.f71764a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C6496s.g(format, "format(format, *args)");
            sb2.append(format);
        }
    }

    public final void d(String str, Object obj) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String sb2 = this.f47116c.toString();
        C6496s.g(sb2, "contents.toString()");
        f(sb2);
        this.f47116c = new StringBuilder();
    }

    public final void f(String str) {
        C6496s.h(str, "string");
        f47112e.a(this.f47114a, this.f47117d, this.f47115b, str);
    }
}

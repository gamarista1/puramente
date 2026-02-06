package t5;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C3286a;
import com.facebook.I;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C4039p;

/* renamed from: t5.N  reason: case insensitive filesystem */
public final class C4021N {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48172b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C4041s f48173a;

    /* renamed from: t5.N$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4021N a(Context context, String str) {
            return new C4021N(context, str);
        }

        public final C4021N b(String str, String str2, C3286a aVar) {
            C6496s.h(str, "activityName");
            return new C4021N(str, str2, aVar);
        }

        public final Executor c() {
            return C4041s.f48273c.i();
        }

        public final C4039p.b d() {
            return C4041s.f48273c.k();
        }

        public final String e() {
            return C4041s.f48273c.m();
        }

        public final void f(Map map) {
            C6496s.h(map, "ud");
            W.i(map);
        }

        private a() {
        }
    }

    public C4021N(C4041s sVar) {
        C6496s.h(sVar, "loggerImpl");
        this.f48173a = sVar;
    }

    public final void a() {
        this.f48173a.l();
    }

    public final void b(Bundle bundle) {
        boolean z10;
        C6496s.h(bundle, "parameters");
        if ((bundle.getInt("previous") & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || I.p()) {
            this.f48173a.s("fb_sdk_settings_changed", (Double) null, bundle);
        }
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (I.p()) {
            this.f48173a.n(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (I.p()) {
            this.f48173a.o(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f48173a.r(str, str2);
    }

    public final void f(String str) {
        if (I.p()) {
            this.f48173a.s(str, (Double) null, (Bundle) null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (I.p()) {
            this.f48173a.s(str, (Double) null, bundle);
        }
    }

    public final void h(String str, Double d10, Bundle bundle) {
        if (I.p()) {
            this.f48173a.s(str, d10, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, C4022O o10) {
        if (I.p()) {
            this.f48173a.t(str, bigDecimal, currency, bundle, o10);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle, C4022O o10) {
        if (I.p()) {
            this.f48173a.y(bigDecimal, currency, bundle, o10);
        }
    }

    public C4021N(Context context) {
        this(new C4041s(context, (String) null, (C3286a) null));
    }

    public C4021N(Context context, String str) {
        this(new C4041s(context, str, (C3286a) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4021N(String str, String str2, C3286a aVar) {
        this(new C4041s(str, str2, aVar));
        C6496s.h(str, "activityName");
    }
}

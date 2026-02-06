package t5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C3286a;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t5.p  reason: case insensitive filesystem */
public final class C4039p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48255b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f48256c = C4039p.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final C4041s f48257a;

    /* renamed from: t5.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Application application, String str) {
            C6496s.h(application, "application");
            C4041s.f48273c.f(application, str);
        }

        public final void b() {
            C4027d.g((String) null);
        }

        public final String c(Context context) {
            C6496s.h(context, "context");
            return C4041s.f48273c.j(context);
        }

        public final b d() {
            return C4041s.f48273c.k();
        }

        public final String e() {
            return C4027d.c();
        }

        public final void f(Context context, String str) {
            C6496s.h(context, "context");
            C4041s.f48273c.n(context, str);
        }

        public final C4039p g(Context context) {
            C6496s.h(context, "context");
            return new C4039p(context, (String) null, (C3286a) null, (DefaultConstructorMarker) null);
        }

        public final void h() {
            C4041s.f48273c.t();
        }

        public final void i(b bVar) {
            C6496s.h(bVar, "flushBehavior");
            C4041s.f48273c.u(bVar);
        }

        public final void j(String str) {
            C4041s.f48273c.w(str);
        }

        public final void k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            W.l(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (String) null, 1024, (Object) null);
        }

        public final void l(String str) {
            C4027d.g(str);
        }

        private a() {
        }
    }

    /* renamed from: t5.p$b */
    public enum b {
        AUTO,
        EXPLICIT_ONLY
    }

    /* renamed from: t5.p$c */
    public enum c {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    /* renamed from: t5.p$d */
    public enum d {
        NEW,
        REFURBISHED,
        USED
    }

    public /* synthetic */ C4039p(Context context, String str, C3286a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, aVar);
    }

    public static final void a() {
        f48255b.b();
    }

    public static final String c(Context context) {
        return f48255b.c(context);
    }

    public static final String d() {
        return f48255b.e();
    }

    public static final C4039p j(Context context) {
        return f48255b.g(context);
    }

    public static final void k(b bVar) {
        f48255b.i(bVar);
    }

    public static final void l(String str) {
        f48255b.j(str);
    }

    public static final void m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        f48255b.k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static final void n(String str) {
        f48255b.l(str);
    }

    public final void b() {
        this.f48257a.l();
    }

    public final void e(String str, double d10, Bundle bundle) {
        this.f48257a.n(str, d10, bundle);
    }

    public final void f(String str, Bundle bundle) {
        this.f48257a.o(str, bundle);
    }

    public final void g(String str, c cVar, d dVar, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        this.f48257a.u(str, cVar, dVar, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.f48257a.v(bigDecimal, currency, bundle);
    }

    public final void i(Bundle bundle) {
        C6496s.h(bundle, "payload");
        this.f48257a.z(bundle, (String) null);
    }

    private C4039p(Context context, String str, C3286a aVar) {
        this.f48257a = new C4041s(context, str, aVar);
    }
}

package D5;

import D5.u;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C4049a;

public final class t {

    /* renamed from: g  reason: collision with root package name */
    public static final a f30528g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static t f30529h;

    /* renamed from: a  reason: collision with root package name */
    private final Class f30530a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f30531b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f30532c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f30533d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f30534e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f30535f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t a() {
            Class a10 = u.a("com.android.billingclient.api.SkuDetailsParams");
            Class a11 = u.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a10 == null || a11 == null) {
                return null;
            }
            Method d10 = u.d(a10, "newBuilder", new Class[0]);
            Method d11 = u.d(a11, "setType", String.class);
            Method d12 = u.d(a11, "setSkusList", List.class);
            Method d13 = u.d(a11, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null) {
                return null;
            }
            t.b(new t(a10, a11, d10, d11, d12, d13));
            return t.a();
        }

        public final synchronized t b() {
            t a10;
            a10 = t.a();
            if (a10 == null) {
                a10 = a();
            }
            return a10;
        }

        private a() {
        }
    }

    public t(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        C6496s.h(cls, "skuDetailsParamsClazz");
        C6496s.h(cls2, "builderClazz");
        C6496s.h(method, "newBuilderMethod");
        C6496s.h(method2, "setTypeMethod");
        C6496s.h(method3, "setSkusListMethod");
        C6496s.h(method4, "buildMethod");
        this.f30530a = cls;
        this.f30531b = cls2;
        this.f30532c = method;
        this.f30533d = method2;
        this.f30534e = method3;
        this.f30535f = method4;
    }

    public static final /* synthetic */ t a() {
        Class<t> cls = t.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30529h;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void b(t tVar) {
        Class<t> cls = t.class;
        if (!C4049a.d(cls)) {
            try {
                f30529h = tVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final Object c(u.b bVar, List list) {
        Object e10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(bVar, "productType");
            Object e11 = u.e(this.f30530a, this.f30532c, (Object) null, new Object[0]);
            if (e11 == null || (e10 = u.e(this.f30531b, this.f30533d, e11, bVar.b())) == null) {
                return null;
            }
            Object e12 = u.e(this.f30531b, this.f30534e, e10, list);
            if (e12 == null) {
                return null;
            }
            return u.e(this.f30531b, this.f30535f, e12, new Object[0]);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final Class d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f30530a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }
}

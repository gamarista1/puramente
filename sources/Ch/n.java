package Ch;

import Bh.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f62663j = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private final Class f62664h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f62665i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String str) {
            C6496s.h(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                C6496s.f(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                C6496s.f(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C6496s.g(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e10) {
                j.f62626a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Class cls, Class cls2, Class cls3) {
        super(cls);
        C6496s.h(cls, "sslSocketClass");
        C6496s.h(cls2, "sslSocketFactoryClass");
        C6496s.h(cls3, "paramClass");
        this.f62664h = cls2;
        this.f62665i = cls3;
    }
}

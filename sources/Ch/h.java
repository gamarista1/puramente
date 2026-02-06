package Ch;

import Bh.b;
import Bh.j;
import Ch.l;
import Sg.C5541d;
import Sg.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class h implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f62645f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final l.a f62646g;

    /* renamed from: a  reason: collision with root package name */
    private final Class f62647a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f62648b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f62649c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f62650d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f62651e;

    public static final class a {

        /* renamed from: Ch.h$a$a  reason: collision with other inner class name */
        public static final class C0927a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f62652a;

            C0927a(String str) {
                this.f62652a = str;
            }

            public boolean b(SSLSocket sSLSocket) {
                C6496s.h(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C6496s.g(name, "sslSocket.javaClass.name");
                return p.J(name, this.f62652a + '.', false, 2, (Object) null);
            }

            public m c(SSLSocket sSLSocket) {
                C6496s.h(sSLSocket, "sslSocket");
                return h.f62645f.b(sSLSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final h b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !C6496s.c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C6496s.e(cls2);
            return new h(cls2);
        }

        public final l.a c(String str) {
            C6496s.h(str, "packageName");
            return new C0927a(str);
        }

        public final l.a d() {
            return h.f62646g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f62645f = aVar;
        f62646g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class cls) {
        C6496s.h(cls, "sslSocketClass");
        this.f62647a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C6496s.g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f62648b = declaredMethod;
        this.f62649c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f62650d = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.f62651e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a() {
        return b.f62599f.b();
    }

    public boolean b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return this.f62647a.isInstance(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        if (!b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f62650d.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, C5541d.f65029b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && C6496s.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        if (b(sSLSocket)) {
            try {
                this.f62648b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f62649c.invoke(sSLSocket, new Object[]{str});
                }
                this.f62651e.invoke(sSLSocket, new Object[]{j.f62626a.c(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}

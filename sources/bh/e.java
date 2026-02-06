package Bh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e extends j {

    /* renamed from: i  reason: collision with root package name */
    public static final b f62612i = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f62613d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f62614e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f62615f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f62616g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f62617h;

    private static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List f62618a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f62619b;

        /* renamed from: c  reason: collision with root package name */
        private String f62620c;

        public a(List list) {
            C6496s.h(list, "protocols");
            this.f62618a = list;
        }

        public final String a() {
            return this.f62620c;
        }

        public final boolean b() {
            return this.f62619b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C6496s.h(obj, "proxy");
            C6496s.h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C6496s.c(name, "supports") && C6496s.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C6496s.c(name, "unsupported") && C6496s.c(Void.TYPE, returnType)) {
                this.f62619b = true;
                return null;
            } else if (C6496s.c(name, "protocols") && objArr.length == 0) {
                return this.f62618a;
            } else {
                if ((C6496s.c(name, "selectProtocol") || C6496s.c(name, "select")) && C6496s.c(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i10 = 0;
                            while (true) {
                                Object obj3 = list.get(i10);
                                C6496s.f(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (!this.f62618a.contains(str)) {
                                    if (i10 == size) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    this.f62620c = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = (String) this.f62618a.get(0);
                        this.f62620c = str2;
                        return str2;
                    }
                }
                if ((!C6496s.c(name, "protocolSelected") && !C6496s.c(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                C6496s.f(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f62620c = (String) obj4;
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C6496s.g(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod(com.amazon.a.a.o.b.au, new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                C6496s.g(method, "putMethod");
                C6496s.g(method2, "getMethod");
                C6496s.g(method3, "removeMethod");
                C6496s.g(cls4, "clientProviderClass");
                C6496s.g(cls5, "serverProviderClass");
                return new e(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public e(Method method, Method method2, Method method3, Class cls, Class cls2) {
        C6496s.h(method, "putMethod");
        C6496s.h(method2, "getMethod");
        C6496s.h(method3, "removeMethod");
        C6496s.h(cls, "clientProviderClass");
        C6496s.h(cls2, "serverProviderClass");
        this.f62613d = method;
        this.f62614e = method2;
        this.f62615f = method3;
        this.f62616g = cls;
        this.f62617h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        try {
            this.f62615f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        try {
            this.f62613d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f62616g, this.f62617h}, new a(j.f62626a.b(list)))});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public String h(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f62614e.invoke((Object) null, new Object[]{sSLSocket}));
            C6496s.f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                return null;
            } else if (aVar.b()) {
                return null;
            } else {
                return aVar.a();
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}

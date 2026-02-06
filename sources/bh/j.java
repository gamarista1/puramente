package Bh;

import Ch.e;
import Eh.b;
import Eh.c;
import Gh.C5404e;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import rh.B;
import rh.C6703A;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62626a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile j f62627b;

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f62628c = Logger.getLogger(C6703A.class.getName());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final j d() {
            e.f62641a.b();
            j a10 = a.f62596e.a();
            if (a10 != null) {
                return a10;
            }
            j a11 = b.f62599f.a();
            C6496s.e(a11);
            return a11;
        }

        private final j e() {
            i a10;
            c a11;
            d b10;
            if (j() && (b10 = d.f62608e.b()) != null) {
                return b10;
            }
            if (i() && (a11 = c.f62605e.a()) != null) {
                return a11;
            }
            if (k() && (a10 = i.f62623e.a()) != null) {
                return a10;
            }
            h a12 = h.f62621d.a();
            if (a12 != null) {
                return a12;
            }
            j a13 = e.f62612i.a();
            if (a13 != null) {
                return a13;
            }
            return new j();
        }

        /* access modifiers changed from: private */
        public final j f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            return C6496s.c("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return C6496s.c("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return C6496s.c("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List list) {
            C6496s.h(list, "protocols");
            ArrayList<B> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((B) next) != B.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            for (B b10 : arrayList) {
                arrayList2.add(b10.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            C6496s.h(list, "protocols");
            C5404e eVar = new C5404e();
            for (String str : b(list)) {
                eVar.K0(str.length());
                eVar.X(str);
            }
            return eVar.H0();
        }

        public final j g() {
            return j.f62627b;
        }

        public final boolean h() {
            return C6496s.c("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f62626a = aVar;
        f62627b = aVar.f();
    }

    public static /* synthetic */ void l(j jVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            jVar.k(str, i10, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
    }

    public c c(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        return new Eh.a(d(x509TrustManager));
    }

    public Eh.e d(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C6496s.g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        C6496s.h(socket, "socket");
        C6496s.h(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        C6496s.h(str, "closer");
        if (f62628c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        C6496s.h(str, "hostname");
        return true;
    }

    public void k(String str, int i10, Throwable th2) {
        Level level;
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (i10 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f62628c.log(level, str, th2);
    }

    public void m(String str, Object obj) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C6496s.g(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        try {
            SSLContext n10 = n();
            n10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n10.getSocketFactory();
            C6496s.g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        C6496s.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C6496s.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C6496s.g(arrays, "toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C6496s.g(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}

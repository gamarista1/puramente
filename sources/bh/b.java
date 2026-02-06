package Bh;

import Ch.d;
import Ch.h;
import Ch.i;
import Ch.j;
import Ch.k;
import Ch.l;
import Ch.m;
import Ch.n;
import Eh.c;
import Eh.e;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class b extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f62599f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f62600g;

    /* renamed from: d  reason: collision with root package name */
    private final List f62601d;

    /* renamed from: e  reason: collision with root package name */
    private final j f62602e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f62600g;
        }

        private a() {
        }
    }

    /* renamed from: Bh.b$b  reason: collision with other inner class name */
    public static final class C0925b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f62603a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f62604b;

        public C0925b(X509TrustManager x509TrustManager, Method method) {
            C6496s.h(x509TrustManager, "trustManager");
            C6496s.h(method, "findByIssuerAndSignatureMethod");
            this.f62603a = x509TrustManager;
            this.f62604b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            C6496s.h(x509Certificate, "cert");
            try {
                Object invoke = this.f62604b.invoke(this.f62603a, new Object[]{x509Certificate});
                C6496s.f(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0925b)) {
                return false;
            }
            C0925b bVar = (C0925b) obj;
            if (C6496s.c(this.f62603a, bVar.f62603a) && C6496s.c(this.f62604b, bVar.f62604b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f62603a.hashCode() * 31) + this.f62604b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f62603a + ", findByIssuerAndSignatureMethod=" + this.f62604b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (j.f62626a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f62600g = z10;
    }

    public b() {
        m[] mVarArr = {n.a.b(n.f62663j, (String) null, 1, (Object) null), new l(h.f62645f.d()), new l(k.f62659a.a()), new l(i.f62653a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C6565s.s(mVarArr)) {
            if (((m) next).a()) {
                arrayList.add(next);
            }
        }
        this.f62601d = arrayList;
        this.f62602e = j.f62655d.a();
    }

    public c c(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        d a10 = d.f62638d.a(x509TrustManager);
        if (a10 != null) {
            return a10;
        }
        return super.c(x509TrustManager);
    }

    public e d(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            C6496s.g(declaredMethod, "method");
            return new C0925b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        Iterator it = this.f62601d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).b(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        C6496s.h(socket, "socket");
        C6496s.h(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        C6496s.h(sSLSocket, "sslSocket");
        Iterator it = this.f62601d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).b(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sSLSocket);
        }
        return null;
    }

    public Object i(String str) {
        C6496s.h(str, "closer");
        return this.f62602e.a(str);
    }

    public boolean j(String str) {
        C6496s.h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void m(String str, Object obj) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (!this.f62602e.b(obj)) {
            j.l(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}

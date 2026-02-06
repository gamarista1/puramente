package Bh;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.openjsse.net.ssl.OpenJSSE;

public final class i extends j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62623e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f62624f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f62625d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            if (b()) {
                return new i((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean b() {
            return i.f62624f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f62623e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f62624f = z10;
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        return super.h(sSLSocket);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f62625d);
        C6496s.g(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f62625d);
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

    private i() {
        this.f62625d = new OpenJSSE();
    }
}

package Bh;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

public final class d extends j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62608e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f62609f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f62610d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i10) {
                if (version.major() > i10) {
                    return true;
                }
                return false;
            } else if (version.minor() != i11) {
                if (version.minor() > i11) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i12) {
                return true;
            } else {
                return false;
            }
        }

        public final d b() {
            if (c()) {
                return new d((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean c() {
            return d.f62609f;
        }

        private a() {
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62611a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f62608e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f62609f = z10;
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        C6496s.h(sSLSocket, "sslSocket");
        C6496s.h(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j.f62626a.b(list).toArray(new String[0]));
            return;
        }
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        C6496s.h(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.h(sSLSocket);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f62610d);
        C6496s.g(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        C6496s.h(x509TrustManager, "trustManager");
        SSLContext n10 = n();
        n10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = n10.getSocketFactory();
        C6496s.g(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f62611a);
                return x509TrustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C6496s.g(arrays, "toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    private d() {
        Provider newProvider = Conscrypt.newProvider();
        C6496s.g(newProvider, "newProvider()");
        this.f62610d = newProvider;
    }
}

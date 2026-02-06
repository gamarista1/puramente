package Ch;

import Eh.c;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62638d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final X509TrustManager f62639b;

    /* renamed from: c  reason: collision with root package name */
    private final X509TrustManagerExtensions f62640c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C6496s.h(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C6496s.h(x509TrustManager, "trustManager");
        C6496s.h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f62639b = x509TrustManager;
        this.f62640c = x509TrustManagerExtensions;
    }

    public List a(List list, String str) {
        C6496s.h(list, "chain");
        C6496s.h(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f62640c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            C6496s.g(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d) || ((d) obj).f62639b != this.f62639b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f62639b);
    }
}

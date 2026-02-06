package rh;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import sh.C6726e;
import yf.C6787a;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f73466e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final H f73467a;

    /* renamed from: b  reason: collision with root package name */
    private final C6712i f73468b;

    /* renamed from: c  reason: collision with root package name */
    private final List f73469c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f73470d;

    public static final class a {

        /* renamed from: rh.t$a$a  reason: collision with other inner class name */
        static final class C1066a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f73471a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1066a(List list) {
                super(0);
                this.f73471a = list;
            }

            public final List invoke() {
                return this.f73471a;
            }
        }

        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f73472a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f73472a = list;
            }

            public final List invoke() {
                return this.f73472a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return C6726e.w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C6565s.n();
        }

        public final t a(SSLSession sSLSession) {
            boolean z10;
            List list;
            C6496s.h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (C6496s.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    z10 = true;
                } else {
                    z10 = C6496s.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!z10) {
                    C6712i b10 = C6712i.f73335b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null");
                    } else if (!C6496s.c("NONE", protocol)) {
                        H a10 = H.f73192b.a(protocol);
                        try {
                            list = c(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C6565s.n();
                        }
                        return new t(a10, b10, c(sSLSession.getLocalCertificates()), new b(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
            } else {
                throw new IllegalStateException("cipherSuite == null");
            }
        }

        public final t b(H h10, C6712i iVar, List list, List list2) {
            C6496s.h(h10, "tlsVersion");
            C6496s.h(iVar, "cipherSuite");
            C6496s.h(list, "peerCertificates");
            C6496s.h(list2, "localCertificates");
            return new t(h10, iVar, C6726e.V(list2), new C1066a(C6726e.V(list)));
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f73473a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6787a aVar) {
            super(0);
            this.f73473a = aVar;
        }

        public final List invoke() {
            try {
                return (List) this.f73473a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C6565s.n();
            }
        }
    }

    public t(H h10, C6712i iVar, List list, C6787a aVar) {
        C6496s.h(h10, "tlsVersion");
        C6496s.h(iVar, "cipherSuite");
        C6496s.h(list, "localCertificates");
        C6496s.h(aVar, "peerCertificatesFn");
        this.f73467a = h10;
        this.f73468b = iVar;
        this.f73469c = list;
        this.f73470d = C6531o.b(new b(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C6496s.g(type, "type");
        return type;
    }

    public final C6712i a() {
        return this.f73468b;
    }

    public final List c() {
        return this.f73469c;
    }

    public final List d() {
        return (List) this.f73470d.getValue();
    }

    public final H e() {
        return this.f73467a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.f73467a != this.f73467a || !C6496s.c(tVar.f73468b, this.f73468b) || !C6496s.c(tVar.d(), d()) || !C6496s.c(tVar.f73469c, this.f73469c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f73467a.hashCode()) * 31) + this.f73468b.hashCode()) * 31) + d().hashCode()) * 31) + this.f73469c.hashCode();
    }

    public String toString() {
        Iterable<Certificate> d10 = d();
        ArrayList arrayList = new ArrayList(C6565s.y(d10, 10));
        for (Certificate b10 : d10) {
            arrayList.add(b(b10));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f73467a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f73468b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        Iterable<Certificate> iterable = this.f73469c;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
        for (Certificate b11 : iterable) {
            arrayList2.add(b(b11));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}

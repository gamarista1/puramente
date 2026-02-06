package rh;

import Gh.C5407h;
import com.revenuecat.purchases.common.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;

/* renamed from: rh.g  reason: case insensitive filesystem */
public final class C6710g {

    /* renamed from: c  reason: collision with root package name */
    public static final b f73271c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C6710g f73272d = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set f73273a;

    /* renamed from: b  reason: collision with root package name */
    private final Eh.c f73274b;

    /* renamed from: rh.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f73275a = new ArrayList();

        public final C6710g a() {
            return new C6710g(C6565s.j1(this.f73275a), (Eh.c) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rh.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            C6496s.h(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + b((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final C5407h b(X509Certificate x509Certificate) {
            C6496s.h(x509Certificate, "<this>");
            C5407h.a aVar = C5407h.f63295d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C6496s.g(encoded, "publicKey.encoded");
            return C5407h.a.g(aVar, encoded, 0, 0, 3, (Object) null).N();
        }

        private b() {
        }
    }

    /* renamed from: rh.g$c */
    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6710g f73276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f73277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73278c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6710g gVar, List list, String str) {
            super(0);
            this.f73276a = gVar;
            this.f73277b = list;
            this.f73278c = str;
        }

        public final List invoke() {
            List list;
            Eh.c d10 = this.f73276a.d();
            if (d10 == null || (list = d10.a(this.f73277b, this.f73278c)) == null) {
                list = this.f73277b;
            }
            Iterable<Certificate> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Certificate certificate : iterable) {
                C6496s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C6710g(Set set, Eh.c cVar) {
        C6496s.h(set, "pins");
        this.f73273a = set;
        this.f73274b = cVar;
    }

    public final void a(String str, List list) {
        C6496s.h(str, "hostname");
        C6496s.h(list, "peerCertificates");
        b(str, new c(this, list, str));
    }

    public final void b(String str, C6787a aVar) {
        C6496s.h(str, "hostname");
        C6496s.h(aVar, "cleanedPeerCertificatesFn");
        List<Object> c10 = c(str);
        if (!c10.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it = c10.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.c.a(it.next());
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(f73271c.a(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            for (Object a10 : c10) {
                android.support.v4.media.session.c.a(a10);
                sb2.append("\n    ");
                sb2.append((Object) null);
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public final List c(String str) {
        C6496s.h(str, "hostname");
        List n10 = C6565s.n();
        Iterator it = this.f73273a.iterator();
        if (!it.hasNext()) {
            return n10;
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }

    public final Eh.c d() {
        return this.f73274b;
    }

    public final C6710g e(Eh.c cVar) {
        C6496s.h(cVar, "certificateChainCleaner");
        if (C6496s.c(this.f73274b, cVar)) {
            return this;
        }
        return new C6710g(this.f73273a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6710g) {
            C6710g gVar = (C6710g) obj;
            if (!C6496s.c(gVar.f73273a, this.f73273a) || !C6496s.c(gVar.f73274b, this.f73274b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = (1517 + this.f73273a.hashCode()) * 41;
        Eh.c cVar = this.f73274b;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6710g(Set set, Eh.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}

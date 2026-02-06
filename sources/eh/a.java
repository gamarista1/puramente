package Eh;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0931a f62871c = new C0931a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final e f62872b;

    /* renamed from: Eh.a$a  reason: collision with other inner class name */
    public static final class C0931a {
        public /* synthetic */ C0931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0931a() {
        }
    }

    public a(e eVar) {
        C6496s.h(eVar, "trustRootIndex");
        this.f62872b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C6496s.c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List a(List list, String str) {
        C6496s.h(list, "chain");
        C6496s.h(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C6496s.g(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            C6496s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a10 = this.f62872b.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || !C6496s.c(x509Certificate, a10)) {
                    arrayList.add(a10);
                }
                if (b(a10, a10)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C6496s.g(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C6496s.f(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !C6496s.c(((a) obj).f62872b, this.f62872b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f62872b.hashCode();
    }
}

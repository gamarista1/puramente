package Eh;

import Gh.Y;
import Sg.p;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import sh.C6722a;
import sh.C6726e;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f62875a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C6496s.g(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C6565s.n();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (C6496s.c(next.get(0), Integer.valueOf(i10))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C6565s.n();
        }
    }

    private final boolean d(String str) {
        if (str.length() == ((int) Y.b(str, 0, 0, 3, (Object) null))) {
            return true;
        }
        return false;
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !p.J(str, ".", false, 2, (Object) null) && !p.u(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !p.J(str2, ".", false, 2, (Object) null) && !p.u(str2, "..", false, 2, (Object) null)) {
            if (!p.u(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!p.u(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String b10 = b(str2);
            if (!p.O(b10, "*", false, 2, (Object) null)) {
                return C6496s.c(str3, b10);
            }
            if (!p.J(b10, "*.", false, 2, (Object) null) || p.a0(b10, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b10.length() || C6496s.c("*.", b10)) {
                return false;
            }
            String substring = b10.substring(1);
            C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
            if (!p.u(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            if (length <= 0 || p.g0(str3, '.', length - 1, false, 4, (Object) null) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        Iterable<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String f10 : c10) {
            if (f62875a.f(b10, f10)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = C6722a.e(str);
        Iterable<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String e11 : c10) {
            if (C6496s.c(e10, C6722a.e(e11))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate x509Certificate) {
        C6496s.h(x509Certificate, "certificate");
        return C6565s.K0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        C6496s.h(str, "host");
        C6496s.h(x509Certificate, "certificate");
        if (C6726e.i(str)) {
            return h(str, x509Certificate);
        }
        return g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C6496s.h(str, "host");
        C6496s.h(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            C6496s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}

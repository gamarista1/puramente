package Eh;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C6496s;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Map f62873a;

    public b(X509Certificate... x509CertificateArr) {
        C6496s.h(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C6496s.g(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f62873a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.X509Certificate a(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cert"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map r1 = r4.f62873a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x001b }
            r5.verify(r3)     // Catch:{ Exception -> 0x001b }
            r1 = r2
        L_0x0030:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Eh.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof b) && C6496s.c(((b) obj).f62873a, this.f62873a))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f62873a.hashCode();
    }
}

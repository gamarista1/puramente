package com.amazon.a.a.o.b;

import android.app.Application;
import com.amazon.a.a.k.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37515a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV2");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37516b = "kiwi";

    /* renamed from: c  reason: collision with root package name */
    private static final int f37517c = 0;
    @a

    /* renamed from: d  reason: collision with root package name */
    private Application f37518d;
    @a

    /* renamed from: e  reason: collision with root package name */
    private com.amazon.a.a.m.c f37519e;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f37534a) {
            f37515a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f37519e.a(com.amazon.a.a.m.c.f37296a);
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37515a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key was cached: ");
            sb2.append(publicKey != null);
            cVar.a(sb2.toString());
        }
        return publicKey;
    }

    private PublicKey c() {
        if (com.amazon.a.a.o.c.f37534a) {
            f37515a.a("Loading authentication key from apk...");
        }
        CertPath d10 = d();
        if (a(d10)) {
            d(d10);
            return b(d10);
        }
        throw com.amazon.a.a.o.b.a.a.e();
    }

    private CertPath d() {
        JarFile e10 = e();
        return a(e10, a(e10));
    }

    private JarFile e() {
        String packageCodePath = this.f37518d.getPackageCodePath();
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37515a;
            cVar.a("Opening apk: " + packageCodePath);
        }
        try {
            return new JarFile(packageCodePath, false);
        } catch (IOException e10) {
            throw com.amazon.a.a.o.b.a.a.a(e10);
        }
    }

    private a f() {
        try {
            return new a();
        } catch (GeneralSecurityException e10) {
            throw com.amazon.a.a.o.b.a.a.b(e10);
        }
    }

    public PublicKey a() {
        if (com.amazon.a.a.o.c.f37534a) {
            f37515a.a("Loading data authentication key...");
        }
        PublicKey b10 = b();
        if (b10 != null) {
            return b10;
        }
        PublicKey c10 = c();
        a(c10);
        return c10;
    }

    private void d(CertPath certPath) {
        if (!f().a(certPath)) {
            throw com.amazon.a.a.o.b.a.a.f();
        }
    }

    private JarEntry a(JarFile jarFile) {
        if (com.amazon.a.a.o.c.f37534a) {
            f37515a.a("Searching for cert in apk");
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && nextElement.getName().equals(f37516b)) {
                return nextElement;
            }
        }
        throw com.amazon.a.a.o.b.a.a.d();
    }

    private PublicKey b(CertPath certPath) {
        return c(certPath).getPublicKey();
    }

    private X509Certificate c(CertPath certPath) {
        return (X509Certificate) certPath.getCertificates().get(0);
    }

    private CertPath a(JarFile jarFile, JarEntry jarEntry) {
        try {
            if (com.amazon.a.a.o.c.f37534a) {
                com.amazon.a.a.o.c cVar = f37515a;
                cVar.a("Extracting cert from entry: " + jarEntry.getName());
            }
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            if (com.amazon.a.a.o.c.f37534a) {
                f37515a.a("Generating certificates from entry input stream");
            }
            return instance.generateCertPath(a(instance.generateCertificates(jarFile.getInputStream(jarEntry))));
        } catch (Exception e10) {
            throw com.amazon.a.a.o.b.a.a.a(e10);
        }
    }

    public List<? extends Certificate> a(Collection<? extends Certificate> collection) {
        return new ArrayList(collection);
    }

    private boolean a(CertPath certPath) {
        if (certPath == null || certPath.getCertificates().size() <= 0) {
            return false;
        }
        Certificate certificate = (Certificate) certPath.getCertificates().get(0);
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        String name = ((X509Certificate) certificate).getSubjectX500Principal().getName();
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37515a;
            cVar.a("Kiwi Cert Details: " + name);
        }
        if (!name.contains("O=Amazon.com\\, Inc.") || !name.contains("C=US") || !name.contains("ST=Washington") || !name.contains("L=Seattle")) {
            return false;
        }
        return true;
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f37534a) {
            f37515a.a("Placing auth key into storage");
        }
        this.f37519e.a(com.amazon.a.a.m.c.f37296a, publicKey);
    }
}

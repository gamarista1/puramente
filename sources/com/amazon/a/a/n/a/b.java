package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.amazon.a.a.k.a;
import com.amazon.a.a.o.b.e;
import com.amazon.a.a.o.c;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37327a = new c("CommandResultVerifier");
    @a

    /* renamed from: b  reason: collision with root package name */
    private Application f37328b;
    @a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.o.b.b f37329c;

    private boolean b(String str, Signature signature) {
        boolean z10 = false;
        try {
            z10 = str.equals(a(signature));
            c cVar = f37327a;
            cVar.a("Signature valid: " + z10);
            return z10;
        } catch (CertificateException unused) {
            f37327a.b("Failed to extract fingerprint from signature");
            return z10;
        }
    }

    public void a(String str, String str2) {
        if (c.f37534a) {
            c cVar = f37327a;
            cVar.a("Verifying auth token: " + str);
        }
        Signature[] signatureArr = a(str2).signatures;
        int length = signatureArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (!a(str, signatureArr[i10])) {
                i10++;
            } else {
                return;
            }
        }
        throw new com.amazon.a.a.n.a.a.a();
    }

    private X509Certificate b(Signature signature) {
        return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    public boolean a(String str, List<String> list) {
        f37327a.a("checkSignatures(" + str + ", " + list);
        try {
            for (Signature signature : a(str).signatures) {
                for (String b10 : list) {
                    if (b(b10, signature)) {
                        return true;
                    }
                }
            }
        } catch (com.amazon.a.a.n.a.a.c e10) {
            f37327a.b("isPackageSignatureValid: caught exception while checking", e10);
        }
        return false;
    }

    private boolean a(String str, Signature signature) {
        try {
            return e.a(a(signature), str, this.f37329c.a());
        } catch (CertificateException unused) {
            if (!c.f37535b) {
                return false;
            }
            c cVar = f37327a;
            cVar.b("Failed to extract fingerprint from signature: " + signature);
            return false;
        }
    }

    private PackageInfo a(String str) {
        try {
            return this.f37328b.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e10) {
            c cVar = f37327a;
            cVar.a("getPackageInfo() caught exception" + e10);
            throw new com.amazon.a.a.n.a.a.c();
        }
    }

    private String a(Signature signature) {
        return com.amazon.c.a.a.c.a(b(signature).getSignature());
    }
}

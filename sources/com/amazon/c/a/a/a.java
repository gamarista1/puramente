package com.amazon.c.a.a;

import java.io.File;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37652a = "com.amazon.content.id.";

    public static String a(JarFile jarFile) {
        String a10;
        if (jarFile != null) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && (a10 = a(nextElement.getName())) != null && a10.length() != 0) {
                    return a10;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("apkSrc must not be null!");
    }

    public static boolean b(JarFile jarFile) {
        if (jarFile != null) {
            try {
                e(jarFile);
                if (d(jarFile) != null) {
                    return true;
                }
                return false;
            } catch (SecurityException unused) {
                return true;
            }
        } else {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
    }

    private static Certificate c(JarFile jarFile) {
        CodeSigner[] d10 = d(jarFile);
        if (d10 != null && d10.length > 0) {
            List<? extends Certificate> certificates = d10[0].getSignerCertPath().getCertificates();
            if (!certificates.isEmpty()) {
                return (Certificate) certificates.get(0);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:4:0x0015, LOOP_START, PHI: r0 
      PHI: (r0v1 java.security.CodeSigner[]) = (r0v0 java.security.CodeSigner[]), (r0v5 java.security.CodeSigner[]) binds: [B:0:0x0000, B:4:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.CodeSigner[] d(java.util.jar.JarFile r2) {
        /*
            java.util.Enumeration r2 = r2.entries()
            r0 = 0
        L_0x0005:
            boolean r1 = r2.hasMoreElements()
            if (r1 == 0) goto L_0x0017
            java.lang.Object r0 = r2.nextElement()
            java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0
            java.security.CodeSigner[] r0 = r0.getCodeSigners()
            if (r0 == 0) goto L_0x0005
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.a.d(java.util.jar.JarFile):java.security.CodeSigner[]");
    }

    private static void e(JarFile jarFile) {
        Enumeration<JarEntry> entries = jarFile.entries();
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = jarFile.getInputStream(entries.nextElement());
                do {
                } while (inputStream2.read(bArr, 0, 8192) != -1);
                inputStream2.close();
            } catch (Exception e10) {
                throw new b((Throwable) e10);
            } catch (Throwable th2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th2;
            }
        }
    }

    public static byte[] b(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("apkFileName cannot be null or empty!");
        }
        JarFile jarFile = new JarFile(str);
        try {
            e(jarFile);
            Certificate c10 = c(jarFile);
            if (c10 != null && (c10 instanceof X509Certificate)) {
                return ((X509Certificate) c10).getSignature();
            }
            return null;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("name cannot be null or empty!");
        }
        int indexOf = str.indexOf(f37652a);
        if (indexOf >= 0 && str.length() > 22) {
            return str.substring(indexOf + 22);
        }
        return null;
    }

    public static boolean a(File file) {
        JarFile jarFile = null;
        try {
            JarFile jarFile2 = new JarFile(file);
            try {
                boolean b10 = b(jarFile2);
                jarFile2.close();
                return b10;
            } catch (Throwable th2) {
                th = th2;
                jarFile = jarFile2;
                jarFile.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jarFile.close();
            throw th;
        }
    }
}

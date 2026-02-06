package com.amazon.a.a.o.b;

import android.app.Application;
import com.amazon.a.a.k.a;
import com.amazon.a.a.o.c;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37520a = new c("DataAuthenticationKeyLoaderV3");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37521b = "AppstoreAuthenticationKey.pem";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37522c = "-----BEGIN PUBLIC KEY-----";

    /* renamed from: d  reason: collision with root package name */
    private static final String f37523d = "-----END PUBLIC KEY-----";

    /* renamed from: e  reason: collision with root package name */
    private static final String f37524e = "RSA";
    @a

    /* renamed from: f  reason: collision with root package name */
    private Application f37525f;
    @a

    /* renamed from: g  reason: collision with root package name */
    private com.amazon.a.a.m.c f37526g;

    private PublicKey b() {
        boolean z10;
        if (c.f37534a) {
            f37520a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f37526g.a(com.amazon.a.a.m.c.f37296a);
        if (c.f37534a) {
            c cVar = f37520a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key was cached: ");
            if (publicKey != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            cVar.a(sb2.toString());
        }
        return publicKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC, Splitter:B:28:0x0061] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.security.PublicKey c() {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close stream"
            boolean r1 = com.amazon.a.a.o.c.f37534a
            if (r1 == 0) goto L_0x000d
            com.amazon.a.a.o.c r1 = f37520a
            java.lang.String r2 = "Loading authentication key from apk..."
            r1.a(r2)
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            android.app.Application r3 = r6.f37525f     // Catch:{ Exception -> 0x0052 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r4 = "AppstoreAuthenticationKey.pem"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ Exception -> 0x0052 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0052 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0052 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0052 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0052 }
        L_0x0029:
            java.lang.String r2 = r4.readLine()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r2 == 0) goto L_0x0039
            r1.append(r2)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            goto L_0x0029
        L_0x0033:
            r1 = move-exception
            r2 = r4
            goto L_0x005f
        L_0x0036:
            r1 = move-exception
            r2 = r4
            goto L_0x0053
        L_0x0039:
            r4.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0047
        L_0x003d:
            r2 = move-exception
            boolean r3 = com.amazon.a.a.o.c.f37534a
            if (r3 == 0) goto L_0x0047
            com.amazon.a.a.o.c r3 = f37520a
            r3.b(r0, r2)
        L_0x0047:
            java.lang.String r0 = r1.toString()
            java.security.PublicKey r0 = r6.a((java.lang.String) r0)
            return r0
        L_0x0050:
            r1 = move-exception
            goto L_0x005f
        L_0x0052:
            r1 = move-exception
        L_0x0053:
            com.amazon.a.a.o.c r3 = f37520a     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "Unable to load authentication Key"
            r3.b(r4, r1)     // Catch:{ all -> 0x0050 }
            com.amazon.a.a.o.b.a.a r1 = com.amazon.a.a.o.b.a.a.d()     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x005f:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x006f
        L_0x0065:
            r2 = move-exception
            boolean r3 = com.amazon.a.a.o.c.f37534a
            if (r3 == 0) goto L_0x006f
            com.amazon.a.a.o.c r3 = f37520a
            r3.b(r0, r2)
        L_0x006f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.o.b.d.c():java.security.PublicKey");
    }

    public PublicKey a() {
        if (c.f37534a) {
            f37520a.a("Loading data authentication key...");
        }
        PublicKey b10 = b();
        if (b10 != null) {
            return b10;
        }
        PublicKey c10 = c();
        a(c10);
        return c10;
    }

    private void a(PublicKey publicKey) {
        if (c.f37534a) {
            f37520a.a("Placing auth key into storage");
        }
        this.f37526g.a(com.amazon.a.a.m.c.f37296a, publicKey);
    }

    public PublicKey a(String str) {
        try {
            return KeyFactory.getInstance(f37524e).generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace(f37522c, "").replace(f37523d, ""))));
        } catch (Exception e10) {
            throw com.amazon.a.a.o.b.a.a.a(e10);
        }
    }
}

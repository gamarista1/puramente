package kc;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;

/* renamed from: kc.b  reason: case insensitive filesystem */
public class C5064b {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f60934c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f60935a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60936b;

    public C5064b(C5230g gVar) {
        this.f60935a = gVar.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f60936b = b(gVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + f.f37531c + str2;
    }

    private static String b(C5230g gVar) {
        String f10 = gVar.r().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = gVar.r().c();
        if (!c10.startsWith("1:") && !c10.startsWith("2:")) {
            return c10;
        }
        String[] split = c10.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f60935a) {
            string = this.f60935a.getString("|S|id", (String) null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f60935a) {
            try {
                String string = this.f60935a.getString("|S||P|", (String) null);
                if (string == null) {
                    return null;
                }
                PublicKey e10 = e(string);
                if (e10 == null) {
                    return null;
                }
                String c10 = c(e10);
                return c10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String f() {
        synchronized (this.f60935a) {
            try {
                String g10 = g();
                if (g10 != null) {
                    return g10;
                }
                String h10 = h();
                return h10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f60935a
            monitor-enter(r0)
            java.lang.String[] r1 = f60934c     // Catch:{ all -> 0x002d }
            int r2 = r1.length     // Catch:{ all -> 0x002d }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0034
            r5 = r1[r3]     // Catch:{ all -> 0x002d }
            java.lang.String r6 = r7.f60936b     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r7.a(r6, r5)     // Catch:{ all -> 0x002d }
            android.content.SharedPreferences r6 = r7.f60935a     // Catch:{ all -> 0x002d }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x002d }
            if (r5 != 0) goto L_0x0031
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002f
            java.lang.String r4 = r7.d(r4)     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r1 = move-exception
            goto L_0x0036
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0031:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.C5064b.i():java.lang.String");
    }
}

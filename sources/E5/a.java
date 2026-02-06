package E5;

import android.os.Bundle;
import com.facebook.I;
import java.util.HashSet;
import o7.C3884A;
import o7.C3906w;
import t7.C4049a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30636a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30637b;

    /* renamed from: c  reason: collision with root package name */
    private static HashSet f30638c = new HashSet();

    private a() {
    }

    public static final void a() {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f30637b) {
                    f30636a.b();
                    f30637b = !f30638c.isEmpty();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void b() {
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    f30638c = c(u10.b());
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        t7.C4049a.b(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return new java.util.HashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashSet c(org.json.JSONArray r3) {
        /*
            r2 = this;
            boolean r0 = t7.C4049a.d(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashSet r3 = o7.W.m(r3)     // Catch:{ Exception -> 0x0016 }
            if (r3 != 0) goto L_0x001b
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x0016 }
            r3.<init>()     // Catch:{ Exception -> 0x0016 }
            goto L_0x001b
        L_0x0014:
            r3 = move-exception
            goto L_0x001c
        L_0x0016:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0014 }
            r3.<init>()     // Catch:{ all -> 0x0014 }
        L_0x001b:
            return r3
        L_0x001c:
            t7.C4049a.b(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.c(org.json.JSONArray):java.util.HashSet");
    }

    public static final void d(Bundle bundle) {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f30637b) {
                    return;
                }
                if (bundle != null) {
                    for (String remove : f30638c) {
                        bundle.remove(remove);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}

package E5;

import Sg.m;
import android.os.Bundle;
import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import t7.C4049a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f30661a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30662b;

    /* renamed from: c  reason: collision with root package name */
    private static Map f30663c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static Map f30664d = new HashMap();

    private h() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        f30664d.remove(r5);
        f30663c.remove(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.json.JSONArray r12) {
        /*
            r11 = this;
            java.lang.String r0 = "key"
            boolean r1 = t7.C4049a.d(r11)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r12 == 0) goto L_0x0095
            boolean r1 = f30662b     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0095
        L_0x0011:
            int r1 = r12.length()     // Catch:{ all -> 0x0065 }
            r2 = 0
            r3 = r2
        L_0x0017:
            if (r3 >= r1) goto L_0x0091
            org.json.JSONObject r4 = r12.getJSONObject(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = r4.getString(r0)     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x008e
            int r6 = r5.length()     // Catch:{ all -> 0x0065 }
            if (r6 != 0) goto L_0x002a
            goto L_0x008e
        L_0x002a:
            java.lang.String r6 = "value"
            org.json.JSONArray r4 = r4.getJSONArray(r6)     // Catch:{ Exception -> 0x0084 }
            int r6 = r4.length()     // Catch:{ Exception -> 0x0084 }
            r7 = r2
        L_0x0035:
            if (r7 >= r6) goto L_0x008e
            org.json.JSONObject r8 = r4.getJSONObject(r7)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r9 = "require_exact_match"
            boolean r8 = r8.getBoolean(r9)     // Catch:{ Exception -> 0x0084 }
            org.json.JSONObject r9 = r4.getJSONObject(r7)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r10 = "potential_matches"
            org.json.JSONArray r9 = r9.getJSONArray(r10)     // Catch:{ Exception -> 0x0084 }
            java.util.HashSet r9 = r11.f(r9)     // Catch:{ Exception -> 0x0084 }
            if (r8 == 0) goto L_0x006b
            java.util.Map r8 = f30664d     // Catch:{ Exception -> 0x0084 }
            kotlin.jvm.internal.C6496s.g(r5, r0)     // Catch:{ Exception -> 0x0084 }
            java.util.Map r10 = f30664d     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x0084 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ Exception -> 0x0084 }
            if (r10 == 0) goto L_0x0067
            r10.addAll(r9)     // Catch:{ Exception -> 0x0084 }
            r9 = r10
            goto L_0x0067
        L_0x0065:
            r12 = move-exception
            goto L_0x0092
        L_0x0067:
            r8.put(r5, r9)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0081
        L_0x006b:
            java.util.Map r8 = f30663c     // Catch:{ Exception -> 0x0084 }
            kotlin.jvm.internal.C6496s.g(r5, r0)     // Catch:{ Exception -> 0x0084 }
            java.util.Map r10 = f30663c     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x0084 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ Exception -> 0x0084 }
            if (r10 == 0) goto L_0x007e
            r10.addAll(r9)     // Catch:{ Exception -> 0x0084 }
            r9 = r10
        L_0x007e:
            r8.put(r5, r9)     // Catch:{ Exception -> 0x0084 }
        L_0x0081:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x0084:
            java.util.Map r4 = f30664d     // Catch:{ all -> 0x0065 }
            r4.remove(r5)     // Catch:{ all -> 0x0065 }
            java.util.Map r4 = f30663c     // Catch:{ all -> 0x0065 }
            r4.remove(r5)     // Catch:{ all -> 0x0065 }
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0091:
            return
        L_0x0092:
            t7.C4049a.b(r12, r11)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.h.a(org.json.JSONArray):void");
    }

    public static final void b() {
        boolean z10;
        Class<h> cls = h.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f30662b) {
                    f30661a.e();
                    if (f30663c.isEmpty()) {
                        if (f30664d.isEmpty()) {
                            z10 = false;
                            f30662b = z10;
                        }
                    }
                    z10 = true;
                    f30662b = z10;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final boolean c(String str, Set set) {
        if (C4049a.d(this) || set == null) {
            return false;
        }
        try {
            Iterable<String> iterable = set;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String lowerCase : iterable) {
                Locale locale = Locale.ROOT;
                String lowerCase2 = lowerCase.toLowerCase(locale);
                C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase3 = str.toLowerCase(locale);
                C6496s.g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C6496s.c(lowerCase2, lowerCase3)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean d(String str, Set set) {
        if (C4049a.d(this) || set == null) {
            return false;
        }
        try {
            Iterable<String> iterable = set;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String mVar : iterable) {
                if (new m(mVar).d(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final void e() {
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    a(u10.t());
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
    private final java.util.HashSet f(org.json.JSONArray r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: E5.h.f(org.json.JSONArray):java.util.HashSet");
    }

    public static final void g(Bundle bundle) {
        boolean z10;
        Class<h> cls = h.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f30662b) {
                    return;
                }
                if (bundle != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (String next : bundle.keySet()) {
                        String valueOf = String.valueOf(bundle.get(next));
                        boolean z11 = false;
                        if (f30663c.get(next) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (f30664d.get(next) != null) {
                            z11 = true;
                        }
                        if (z10 || z11) {
                            h hVar = f30661a;
                            boolean d10 = hVar.d(valueOf, (Set) f30663c.get(next));
                            boolean c10 = hVar.c(valueOf, (Set) f30664d.get(next));
                            if (!d10 && !c10) {
                                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                                arrayList.add(next);
                            }
                        }
                    }
                    for (String remove : arrayList) {
                        bundle.remove(remove);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}

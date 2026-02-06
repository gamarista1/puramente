package D5;

import D5.u;
import F5.k;
import android.os.Bundle;
import com.facebook.I;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import o7.C3902s;
import t5.C4022O;
import t5.C4023P;
import t7.C4049a;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f30522a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f30523b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap f30524c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static String f30525d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f30526e = new AtomicBoolean(false);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30527a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                D5.u$a[] r0 = D5.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D5.u$a r1 = D5.u.a.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D5.u$a r1 = D5.u.a.V1     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D5.u$a r1 = D5.u.a.V2_V4     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                D5.u$a r1 = D5.u.a.V5_V7     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f30527a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D5.s.a.<clinit>():void");
        }
    }

    private s() {
    }

    public static final void a() {
        Class<s> cls = s.class;
        if (!C4049a.d(cls)) {
            try {
                if (!k.g()) {
                    r.i();
                    return;
                }
                f30526e.set(true);
                h();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return D5.u.a.V5_V7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        t7.C4049a.b(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final D5.u.a b() {
        /*
            r9 = this;
            boolean r0 = t7.C4049a.d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = com.facebook.I.l()     // Catch:{ Exception -> 0x007d }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x007d }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r3)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "context.packageManager.g…TA_DATA\n                )"
            kotlin.jvm.internal.C6496s.g(r0, r2)     // Catch:{ Exception -> 0x007d }
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "com.google.android.play.billingclient.version"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x007d }
            if (r0 != 0) goto L_0x002e
            D5.u$a r0 = D5.u.a.NONE     // Catch:{ Exception -> 0x007d }
            return r0
        L_0x002c:
            r0 = move-exception
            goto L_0x0080
        L_0x002e:
            java.lang.String r2 = "."
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x007d }
            r7 = 2
            r8 = 0
            r5 = 0
            r6 = 3
            r3 = r0
            java.util.List r2 = Sg.p.F0(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x007d }
            int r3 = r0.length()     // Catch:{ Exception -> 0x007d }
            if (r3 != 0) goto L_0x0046
            D5.u$a r0 = D5.u.a.V5_V7     // Catch:{ Exception -> 0x007d }
            return r0
        L_0x0046:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r3.<init>()     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = "GPBL."
            r3.append(r4)     // Catch:{ Exception -> 0x007d }
            r3.append(r0)     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x007d }
            g(r0)     // Catch:{ Exception -> 0x007d }
            r0 = 0
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x007d }
            java.lang.Integer r0 = Sg.p.m(r0)     // Catch:{ Exception -> 0x007d }
            if (r0 == 0) goto L_0x007a
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x007d }
            r2 = 1
            if (r0 != r2) goto L_0x0071
            D5.u$a r0 = D5.u.a.V1     // Catch:{ Exception -> 0x007d }
            goto L_0x0079
        L_0x0071:
            r2 = 5
            if (r0 >= r2) goto L_0x0077
            D5.u$a r0 = D5.u.a.V2_V4     // Catch:{ Exception -> 0x007d }
            goto L_0x0079
        L_0x0077:
            D5.u$a r0 = D5.u.a.V5_V7     // Catch:{ Exception -> 0x007d }
        L_0x0079:
            return r0
        L_0x007a:
            D5.u$a r0 = D5.u.a.V5_V7     // Catch:{ Exception -> 0x007d }
            return r0
        L_0x007d:
            D5.u$a r0 = D5.u.a.V5_V7     // Catch:{ all -> 0x002c }
            return r0
        L_0x0080:
            t7.C4049a.b(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.s.b():D5.u$a");
    }

    public static /* synthetic */ String d(s sVar, Bundle bundle, C4022O o10, Bundle bundle2, C4022O o11, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12;
        Class<s> cls = s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        try {
            return sVar.c(bundle, o10, bundle2, o11, z10, z12);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String e() {
        Class<s> cls = s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30525d;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final synchronized Bundle f(List list, long j10, boolean z10, List list2) {
        List list3;
        List<Pair> list4;
        boolean z11;
        Long l10;
        String str;
        String str2;
        a aVar;
        long j11;
        List list5 = list;
        List list6 = list2;
        synchronized (s.class) {
            Long l11 = null;
            if (C4049a.d(s.class)) {
                return null;
            }
            try {
                C6496s.h(list5, "purchases");
                C6496s.h(list6, "purchaseParameters");
                if (list6.isEmpty()) {
                    return null;
                }
                if (list.size() != list2.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                Bundle bundle = null;
                int i10 = 0;
                while (i10 < size) {
                    a aVar2 = (a) list5.get(i10);
                    Pair pair = (Pair) list6.get(i10);
                    Bundle bundle2 = (Bundle) pair.a();
                    C4022O o10 = (C4022O) pair.b();
                    a aVar3 = new a(aVar2.c(), new BigDecimal(String.valueOf(aVar2.a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), aVar2.b());
                    if (z10) {
                        list4 = (List) f30523b.get(aVar3);
                    } else {
                        list4 = (List) f30524c.get(aVar3);
                    }
                    Collection collection = list4;
                    if (collection == null || collection.isEmpty()) {
                        aVar = aVar3;
                        str2 = null;
                        str = null;
                        l10 = null;
                        z11 = false;
                    } else {
                        str2 = l11;
                        str = str2;
                        l10 = str;
                        z11 = false;
                        for (Pair pair2 : list4) {
                            long longValue = ((Number) pair2.c()).longValue();
                            Pair pair3 = (Pair) pair2.d();
                            Bundle bundle3 = (Bundle) pair3.a();
                            C4022O o11 = (C4022O) pair3.b();
                            if (Math.abs(j10 - longValue) <= p.f30510a.e()) {
                                if (l10 == null || longValue < l10.longValue()) {
                                    s sVar = f30522a;
                                    a aVar4 = aVar3;
                                    String d10 = d(sVar, bundle2, o10, bundle3, o11, !z10, false, 32, (Object) null);
                                    String c10 = sVar.c(bundle2, o10, bundle3, o11, !z10, true);
                                    if (c10 != null) {
                                        str2 = c10;
                                    }
                                    if (d10 != null) {
                                        l10 = Long.valueOf(longValue);
                                        arrayList.add(new Pair(aVar4, Long.valueOf(longValue)));
                                        aVar3 = aVar4;
                                        str = d10;
                                        z11 = true;
                                    } else {
                                        aVar3 = aVar4;
                                        str = d10;
                                    }
                                }
                            }
                        }
                        aVar = aVar3;
                    }
                    if (str2 != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putString("fb_iap_test_dedup_result", "1");
                        bundle.putString("fb_iap_test_dedup_key_used", str2);
                    }
                    if (z11) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        if (l10 != null) {
                            j11 = l10.longValue() / ((long) 1000);
                        } else {
                            j11 = 0;
                        }
                        bundle.putString("fb_iap_non_deduped_event_time", String.valueOf(j11));
                        bundle.putString("fb_iap_actual_dedup_result", "1");
                        bundle.putString("fb_iap_actual_dedup_key_used", str);
                    }
                    if (z10 && !z11) {
                        ConcurrentHashMap concurrentHashMap = f30524c;
                        if (concurrentHashMap.get(aVar) == null) {
                            concurrentHashMap.put(aVar, new ArrayList());
                        }
                        List list7 = (List) concurrentHashMap.get(aVar);
                        if (list7 != null) {
                            list7.add(new Pair(Long.valueOf(j10), new Pair(bundle2, o10)));
                        }
                    } else if (!z10 && !z11) {
                        ConcurrentHashMap concurrentHashMap2 = f30523b;
                        if (concurrentHashMap2.get(aVar) == null) {
                            concurrentHashMap2.put(aVar, new ArrayList());
                        }
                        List list8 = (List) concurrentHashMap2.get(aVar);
                        if (list8 != null) {
                            list8.add(new Pair(Long.valueOf(j10), new Pair(bundle2, o10)));
                        }
                    }
                    i10++;
                    list5 = list;
                    list6 = list2;
                    l11 = null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair4 = (Pair) it.next();
                    if (z10) {
                        list3 = (List) f30523b.get(pair4.c());
                    } else {
                        list3 = (List) f30524c.get(pair4.c());
                    }
                    if (list3 != null) {
                        Iterator it2 = list3.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i12 = i11 + 1;
                            if (((Number) ((Pair) it2.next()).c()).longValue() == ((Number) pair4.d()).longValue()) {
                                list3.remove(i11);
                                break;
                            }
                            i11 = i12;
                        }
                        if (z10) {
                            if (list3.isEmpty()) {
                                f30523b.remove(pair4.c());
                            } else {
                                f30523b.put(pair4.c(), list3);
                            }
                        } else if (list3.isEmpty()) {
                            f30524c.remove(pair4.c());
                        } else {
                            f30524c.put(pair4.c(), list3);
                        }
                    }
                }
                return bundle;
            } catch (Throwable th2) {
                C4049a.b(th2, s.class);
                return null;
            }
        }
    }

    private static final void g(String str) {
        Class<s> cls = s.class;
        if (!C4049a.d(cls)) {
            try {
                f30525d = str;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void h() {
        Class<s> cls = s.class;
        if (!C4049a.d(cls)) {
            try {
                if (f30526e.get()) {
                    u.a b10 = f30522a.b();
                    int i10 = a.f30527a[b10.ordinal()];
                    if (i10 == 2) {
                        b.g(u.a.V1);
                    } else if (i10 != 3) {
                        if (i10 == 4) {
                            if (C3902s.g(C3902s.b.IapLoggingLib5To7)) {
                                h.e(I.l(), b10);
                            }
                        }
                    } else if (C3902s.g(C3902s.b.IapLoggingLib2)) {
                        h.e(I.l(), b10);
                    } else {
                        b.g(u.a.V2_V4);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final String c(Bundle bundle, C4022O o10, Bundle bundle2, C4022O o11, boolean z10, boolean z11) {
        List<Pair> list;
        String str;
        String str2;
        if (C4049a.d(this)) {
            return null;
        }
        if (z11) {
            try {
                list = p.f30510a.f(z10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        } else {
            list = p.f30510a.d(z10);
        }
        if (list == null) {
            return null;
        }
        for (Pair pair : list) {
            Object c10 = C4022O.f48174b.c(C4023P.IAPParameters, (String) pair.c(), bundle, o10);
            if (c10 instanceof String) {
                str = (String) c10;
            } else {
                str = null;
            }
            if (str != null) {
                if (str.length() != 0) {
                    for (String str3 : (List) pair.d()) {
                        Object c11 = C4022O.f48174b.c(C4023P.IAPParameters, str3, bundle2, o11);
                        if (c11 instanceof String) {
                            str2 = (String) c11;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (str2.length() != 0) {
                                if (C6496s.c(str2, str)) {
                                    if (z10) {
                                        return (String) pair.c();
                                    }
                                    return str3;
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }
}

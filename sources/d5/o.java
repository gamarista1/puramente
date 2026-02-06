package D5;

import D5.u;
import Sg.k;
import Sg.m;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import org.json.JSONObject;
import t7.C4049a;

public final class o implements i {

    /* renamed from: N  reason: collision with root package name */
    public static final a f30462N = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    private static final String f30463O = o.class.getCanonicalName();

    /* renamed from: P  reason: collision with root package name */
    private static final AtomicBoolean f30464P = new AtomicBoolean(false);

    /* renamed from: Q  reason: collision with root package name */
    private static o f30465Q;

    /* renamed from: R  reason: collision with root package name */
    private static final Map f30466R = new ConcurrentHashMap();

    /* renamed from: S  reason: collision with root package name */
    private static final Map f30467S = new ConcurrentHashMap();

    /* renamed from: T  reason: collision with root package name */
    private static final Map f30468T = new ConcurrentHashMap();

    /* renamed from: A  reason: collision with root package name */
    private final Method f30469A;

    /* renamed from: B  reason: collision with root package name */
    private final Method f30470B;

    /* renamed from: C  reason: collision with root package name */
    private final Method f30471C;

    /* renamed from: D  reason: collision with root package name */
    private final Method f30472D;

    /* renamed from: E  reason: collision with root package name */
    private final Method f30473E;

    /* renamed from: F  reason: collision with root package name */
    private final Method f30474F;

    /* renamed from: G  reason: collision with root package name */
    private final Method f30475G;

    /* renamed from: H  reason: collision with root package name */
    private final Method f30476H;

    /* renamed from: I  reason: collision with root package name */
    private final Method f30477I;

    /* renamed from: J  reason: collision with root package name */
    private final Method f30478J;

    /* renamed from: K  reason: collision with root package name */
    private final Method f30479K;

    /* renamed from: L  reason: collision with root package name */
    private final Method f30480L;

    /* renamed from: M  reason: collision with root package name */
    private final Method f30481M;

    /* renamed from: a  reason: collision with root package name */
    private final Object f30482a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f30483b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f30484c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f30485d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f30486e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f30487f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f30488g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f30489h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f30490i;

    /* renamed from: j  reason: collision with root package name */
    private final Class f30491j;

    /* renamed from: k  reason: collision with root package name */
    private final Class f30492k;

    /* renamed from: l  reason: collision with root package name */
    private final Class f30493l;

    /* renamed from: m  reason: collision with root package name */
    private final Class f30494m;

    /* renamed from: n  reason: collision with root package name */
    private final Class f30495n;

    /* renamed from: o  reason: collision with root package name */
    private final Class f30496o;

    /* renamed from: p  reason: collision with root package name */
    private final Class f30497p;

    /* renamed from: q  reason: collision with root package name */
    private final Class f30498q;

    /* renamed from: r  reason: collision with root package name */
    private final Class f30499r;

    /* renamed from: s  reason: collision with root package name */
    private final Method f30500s;

    /* renamed from: t  reason: collision with root package name */
    private final Method f30501t;

    /* renamed from: u  reason: collision with root package name */
    private final Method f30502u;

    /* renamed from: v  reason: collision with root package name */
    private final Method f30503v;

    /* renamed from: w  reason: collision with root package name */
    private final Method f30504w;

    /* renamed from: x  reason: collision with root package name */
    private final Method f30505x;

    /* renamed from: y  reason: collision with root package name */
    private final Method f30506y;

    /* renamed from: z  reason: collision with root package name */
    private final Method f30507z;

    public static final class a implements InvocationHandler {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls, Class cls2, Class cls3) {
            Object e10;
            Method d10 = u.d(cls, "newBuilder", Context.class);
            Method d11 = u.d(cls2, "setListener", cls3);
            Method d12 = u.d(cls2, com.amazon.a.a.o.b.f37472ac, new Class[0]);
            Method d13 = u.d(cls2, "build", new Class[0]);
            if (d13 == null || d11 == null || d10 == null || d12 == null || (e10 = u.e(cls2, d11, u.e(cls, d10, (Object) null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return u.e(cls2, d13, u.e(cls2, d12, e10, new Object[0]), new Object[0]);
        }

        private final o b(Context context) {
            Class a10 = u.a("com.android.billingclient.api.BillingClient");
            Class a11 = u.a("com.android.billingclient.api.Purchase");
            Class a12 = u.a("com.android.billingclient.api.ProductDetails");
            Class a13 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class a14 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class a15 = u.a("com.android.billingclient.api.BillingResult");
            Class a16 = u.a("com.android.billingclient.api.QueryProductDetailsParams");
            Class a17 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class a18 = u.a("com.android.billingclient.api.QueryPurchasesParams");
            Class a19 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class a20 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class a21 = u.a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class a22 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class a23 = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class a24 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class a25 = u.a("com.android.billingclient.api.BillingClientStateListener");
            Class a26 = u.a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class a27 = u.a("com.android.billingclient.api.PurchasesResponseListener");
            Class a28 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a10 == null || a11 == null || a12 == null || a13 == null || a14 == null || a15 == null || a16 == null || a17 == null || a18 == null || a19 == null || a20 == null || a21 == null || a22 == null || a23 == null || a24 == null || a25 == null || a26 == null || a27 == null || a28 == null) {
                Log.w(o.h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            String str = "Failed to create Google Play billing library wrapper for in-app purchase auto-logging";
            Class cls = a23;
            Class cls2 = a27;
            Class cls3 = a24;
            Method d10 = u.d(a10, "queryPurchasesAsync", a18, cls2);
            Class cls4 = cls2;
            Method d11 = u.d(a18, "newBuilder", new Class[0]);
            Method d12 = u.d(a21, "build", new Class[0]);
            Class<String> cls5 = String.class;
            Class cls6 = a18;
            Class cls7 = a15;
            Method d13 = u.d(a21, "setProductType", cls5);
            Class cls8 = a21;
            Method d14 = u.d(a11, "getOriginalJson", new Class[0]);
            Class cls9 = a11;
            Class cls10 = a28;
            Method d15 = u.d(a10, "queryPurchaseHistoryAsync", a17, cls10);
            Method d16 = u.d(a17, "newBuilder", new Class[0]);
            Method d17 = u.d(a20, "build", new Class[0]);
            Method d18 = u.d(a20, "setProductType", cls5);
            Method d19 = u.d(a13, "getOriginalJson", new Class[0]);
            Class cls11 = a26;
            Class cls12 = cls10;
            Method d20 = u.d(a10, "queryProductDetailsAsync", a16, cls11);
            Method d21 = u.d(a16, "newBuilder", new Class[0]);
            Method d22 = u.d(a19, "build", new Class[0]);
            Method d23 = u.d(a19, "setProductList", List.class);
            Method d24 = u.d(a14, "newBuilder", new Class[0]);
            Method d25 = u.d(a22, "build", new Class[0]);
            Method d26 = u.d(a22, "setProductId", cls5);
            Method d27 = u.d(a22, "setProductType", cls5);
            Class cls13 = a12;
            Method d28 = u.d(cls13, "toString", new Class[0]);
            Method d29 = u.d(a10, "startConnection", a25);
            Class cls14 = cls7;
            Method d30 = u.d(cls14, "getResponseCode", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null || d14 == null || d15 == null || d16 == null || d17 == null || d18 == null || d19 == null || d20 == null || d21 == null || d22 == null || d23 == null || d24 == null || d25 == null || d26 == null || d27 == null || d28 == null || d29 == null || d30 == null) {
                Log.w(o.h(), str);
                return null;
            }
            Object a29 = a(context, a10, cls, cls3);
            if (a29 == null) {
                Log.w(o.h(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Class cls15 = cls9;
            Class cls16 = cls13;
            Class cls17 = cls14;
            Class cls18 = cls6;
            Class cls19 = cls8;
            o.n(new o(a29, a10, cls15, cls16, a13, a14, cls17, a16, a17, cls18, a19, a20, cls19, a22, a25, cls11, cls4, cls12, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, (DefaultConstructorMarker) null));
            return o.e();
        }

        public final Map c() {
            return o.d();
        }

        public final synchronized o d(Context context) {
            o e10;
            C6496s.h(context, "context");
            e10 = o.e();
            if (e10 == null) {
                e10 = b(context);
            }
            return e10;
        }

        public final Map e() {
            return o.f();
        }

        public final Map f() {
            return o.g();
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C6496s.h(obj, "proxy");
            C6496s.h(method, "m");
            return null;
        }

        private a() {
        }
    }

    public final class b implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object[] f30508a;

        public b(Object[] objArr) {
            this.f30508a = objArr;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C6496s.h(obj, "proxy");
            C6496s.h(method, "m");
            String name = method.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (!name.equals("onPurchaseHistoryResponse")) {
                        return null;
                    }
                    o.l(o.this, this.f30508a, objArr);
                    return null;
                case -1599362358:
                    if (!name.equals("onQueryPurchasesResponse")) {
                        return null;
                    }
                    o.m(o.this, this.f30508a, objArr);
                    return null;
                case -79406125:
                    if (!name.equals("onBillingSetupFinished")) {
                        return null;
                    }
                    o.j(o.this, this.f30508a, objArr);
                    return null;
                case 1227540564:
                    if (!name.equals("onBillingServiceDisconnected")) {
                        return null;
                    }
                    o.i(o.this, this.f30508a, objArr);
                    return null;
                case 1940131955:
                    if (!name.equals("onProductDetailsResponse")) {
                        return null;
                    }
                    o.k(o.this, this.f30508a, objArr);
                    return null;
                default:
                    return null;
            }
        }
    }

    public /* synthetic */ o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    /* access modifiers changed from: private */
    public static final void A(o oVar, u.b bVar, Runnable runnable) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(oVar, "this$0");
                C6496s.h(bVar, "$productType");
                C6496s.h(runnable, "$completionHandler");
                u.e(oVar.f30483b, oVar.f30505x, oVar.p(), oVar.s(bVar), Proxy.newProxyInstance(oVar.f30499r.getClassLoader(), new Class[]{oVar.f30499r}, new b(new Object[]{bVar, runnable})));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void B(Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                u.e(this.f30483b, this.f30480L, p(), Proxy.newProxyInstance(this.f30496o.getClassLoader(), new Class[]{this.f30496o}, new b(new Object[]{runnable})));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final /* synthetic */ Map d() {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30466R;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ o e() {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30465Q;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30468T;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map g() {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30467S;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String h() {
        Class<o> cls = o.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30463O;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void i(o oVar, Object[] objArr, Object[] objArr2) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                oVar.t(objArr, objArr2);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void j(o oVar, Object[] objArr, Object[] objArr2) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                oVar.u(objArr, objArr2);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void k(o oVar, Object[] objArr, Object[] objArr2) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                oVar.v(objArr, objArr2);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void l(o oVar, Object[] objArr, Object[] objArr2) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                oVar.w(objArr, objArr2);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void m(o oVar, Object[] objArr, Object[] objArr2) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                oVar.x(objArr, objArr2);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void n(o oVar) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                f30465Q = oVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void o(Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                if (f30464P.get()) {
                    runnable.run();
                } else {
                    B(runnable);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final Object r(u.b bVar, List list) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object e10 = u.e(this.f30495n, this.f30476H, u.e(this.f30495n, this.f30478J, u.e(this.f30495n, this.f30477I, u.e(this.f30487f, this.f30475G, (Object) null, new Object[0]), (String) it.next()), bVar.b()), new Object[0]);
                if (e10 != null) {
                    arrayList.add(e10);
                }
            }
            return u.e(this.f30492k, this.f30473E, u.e(this.f30492k, this.f30474F, u.e(this.f30489h, this.f30472D, (Object) null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final Object s(u.b bVar) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return u.e(this.f30493l, this.f30507z, u.e(this.f30493l, this.f30469A, u.e(this.f30490i, this.f30506y, (Object) null, new Object[0]), bVar.b()), new Object[0]);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final void t(Object[] objArr, Object[] objArr2) {
        if (!C4049a.d(this)) {
            try {
                f30464P.set(false);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0036: MOVE  (r5v3 java.lang.Runnable) = (r5v2 java.lang.Runnable)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final void u(java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r4 = this;
            boolean r0 = t7.C4049a.d(r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0044
            int r0 = r6.length     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x000d
            goto L_0x0044
        L_0x000d:
            r0 = 0
            r6 = r6[r0]     // Catch:{ all -> 0x003e }
            java.lang.Class r1 = r4.f30488g     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r4.f30481M     // Catch:{ all -> 0x003e }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x003e }
            java.lang.Object r6 = D5.u.e(r1, r2, r6, r3)     // Catch:{ all -> 0x003e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003e }
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r1)     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicBoolean r6 = f30464P     // Catch:{ all -> 0x003e }
            r1 = 1
            r6.set(r1)     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0040
            int r6 = r5.length     // Catch:{ all -> 0x003e }
            if (r6 != 0) goto L_0x0030
            goto L_0x0040
        L_0x0030:
            r5 = r5[r0]     // Catch:{ all -> 0x003e }
            boolean r6 = r5 instanceof java.lang.Runnable     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x0040
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0040
            r5.run()     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x003e:
            r5 = move-exception
            goto L_0x0041
        L_0x0040:
            return
        L_0x0041:
            t7.C4049a.b(r5, r4)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.o.u(java.lang.Object[], java.lang.Object[]):void");
    }

    private final void v(Object[] objArr, Object[] objArr2) {
        Object obj;
        Object obj2;
        String str;
        if (!C4049a.d(this)) {
            if (objArr != null) {
                try {
                    obj = C6559l.m0(objArr, 0);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            } else {
                obj = null;
            }
            if (objArr2 != null) {
                obj2 = C6559l.m0(objArr2, 1);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                return;
            }
            if (obj2 instanceof List) {
                for (Object e10 : (List) obj2) {
                    try {
                        Object e11 = u.e(this.f30485d, this.f30479K, e10, new Object[0]);
                        if (e11 instanceof String) {
                            str = (String) e11;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String q10 = q(str);
                            if (q10 != null) {
                                JSONObject jSONObject = new JSONObject(q10);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    Map map = f30468T;
                                    C6496s.g(string, "productId");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (obj == null) {
                    return;
                }
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        }
    }

    private final void w(Object[] objArr, Object[] objArr2) {
        Object obj;
        Object obj2;
        String str;
        if (!C4049a.d(this)) {
            if (objArr != null) {
                try {
                    obj = C6559l.m0(objArr, 0);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (obj instanceof u.b) {
                Object m02 = C6559l.m0(objArr, 1);
                if (m02 instanceof Runnable) {
                    if (objArr2 != null) {
                        obj2 = C6559l.m0(objArr2, 1);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        return;
                    }
                    if (obj2 instanceof List) {
                        ArrayList arrayList = new ArrayList();
                        for (Object e10 : (List) obj2) {
                            try {
                                Object e11 = u.e(this.f30486e, this.f30470B, e10, new Object[0]);
                                if (e11 instanceof String) {
                                    str = (String) e11;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        if (!f30468T.containsKey(string)) {
                                            C6496s.g(string, "productId");
                                            arrayList.add(string);
                                        }
                                        if (obj == u.b.INAPP) {
                                            Map map = f30466R;
                                            C6496s.g(string, "productId");
                                            map.put(string, jSONObject);
                                        } else {
                                            Map map2 = f30467S;
                                            C6496s.g(string, "productId");
                                            map2.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            y((u.b) obj, arrayList, (Runnable) m02);
                        } else {
                            ((Runnable) m02).run();
                        }
                    }
                }
            }
        }
    }

    private final void x(Object[] objArr, Object[] objArr2) {
        Object obj;
        Object obj2;
        String str;
        if (!C4049a.d(this)) {
            if (objArr != null) {
                try {
                    obj = C6559l.m0(objArr, 0);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (obj instanceof u.b) {
                Object m02 = C6559l.m0(objArr, 1);
                if (m02 instanceof Runnable) {
                    if (objArr2 != null) {
                        obj2 = C6559l.m0(objArr2, 1);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        return;
                    }
                    if (obj2 instanceof List) {
                        ArrayList arrayList = new ArrayList();
                        for (Object e10 : (List) obj2) {
                            Object e11 = u.e(this.f30484c, this.f30504w, e10, new Object[0]);
                            if (e11 instanceof String) {
                                str = (String) e11;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!f30468T.containsKey(string)) {
                                        C6496s.g(string, "productId");
                                        arrayList.add(string);
                                    }
                                    if (obj == u.b.INAPP) {
                                        Map map = f30466R;
                                        C6496s.g(string, "productId");
                                        map.put(string, jSONObject);
                                    } else {
                                        Map map2 = f30467S;
                                        C6496s.g(string, "productId");
                                        map2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            y((u.b) obj, arrayList, (Runnable) m02);
                        } else {
                            ((Runnable) m02).run();
                        }
                    }
                }
            }
        }
    }

    private final void y(u.b bVar, List list, Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                o(new n(this, runnable, bVar, list));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void z(o oVar, Runnable runnable, u.b bVar, List list) {
        Class<o> cls = o.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(oVar, "this$0");
                C6496s.h(runnable, "$completionHandler");
                C6496s.h(bVar, "$productType");
                C6496s.h(list, "$productIds");
                Object newProxyInstance = Proxy.newProxyInstance(oVar.f30497p.getClassLoader(), new Class[]{oVar.f30497p}, new b(new Object[]{runnable}));
                Object r10 = oVar.r(bVar, list);
                if (r10 != null) {
                    u.e(oVar.f30483b, oVar.f30471C, oVar.p(), r10, newProxyInstance);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public void a(u.b bVar, Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(bVar, "productType");
                C6496s.h(runnable, "completionHandler");
                o(new m(this, bVar, runnable));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public Object p() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f30482a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final String q(String str) {
        List b10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(str, "productDetailsString");
            k b11 = m.b(new m("jsonString='(.*?)'"), str, 0, 2, (Object) null);
            if (b11 == null || (b10 = b11.b()) == null) {
                return null;
            }
            return (String) C6565s.r0(b10, 1);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.f30482a = obj;
        this.f30483b = cls;
        this.f30484c = cls2;
        this.f30485d = cls3;
        this.f30486e = cls4;
        this.f30487f = cls5;
        this.f30488g = cls6;
        this.f30489h = cls7;
        this.f30490i = cls8;
        this.f30491j = cls9;
        this.f30492k = cls10;
        this.f30493l = cls11;
        this.f30494m = cls12;
        this.f30495n = cls13;
        this.f30496o = cls14;
        this.f30497p = cls15;
        this.f30498q = cls16;
        this.f30499r = cls17;
        this.f30500s = method;
        this.f30501t = method2;
        this.f30502u = method3;
        this.f30503v = method4;
        this.f30504w = method5;
        this.f30505x = method6;
        this.f30506y = method7;
        this.f30507z = method8;
        this.f30469A = method9;
        this.f30470B = method10;
        this.f30471C = method11;
        this.f30472D = method12;
        this.f30473E = method13;
        this.f30474F = method14;
        this.f30475G = method15;
        this.f30476H = method16;
        this.f30477I = method17;
        this.f30478J = method18;
        this.f30479K = method19;
        this.f30480L = method20;
        this.f30481M = method21;
    }
}

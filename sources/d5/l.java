package D5;

import D5.u;
import Sg.p;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6559l;
import org.json.JSONObject;
import t7.C4049a;

public final class l implements i {

    /* renamed from: q  reason: collision with root package name */
    public static final b f30426q = new b((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String f30427r = l.class.getCanonicalName();

    /* renamed from: s  reason: collision with root package name */
    private static l f30428s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicBoolean f30429t = new AtomicBoolean(false);

    /* renamed from: u  reason: collision with root package name */
    private static final Map f30430u = new ConcurrentHashMap();

    /* renamed from: v  reason: collision with root package name */
    private static final Map f30431v = new ConcurrentHashMap();

    /* renamed from: w  reason: collision with root package name */
    private static final Map f30432w = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Object f30433a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f30434b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f30435c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f30436d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f30437e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f30438f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f30439g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f30440h;

    /* renamed from: i  reason: collision with root package name */
    private final Method f30441i;

    /* renamed from: j  reason: collision with root package name */
    private final Method f30442j;

    /* renamed from: k  reason: collision with root package name */
    private final Method f30443k;

    /* renamed from: l  reason: collision with root package name */
    private final Method f30444l;

    /* renamed from: m  reason: collision with root package name */
    private final Method f30445m;

    /* renamed from: n  reason: collision with root package name */
    private final Method f30446n;

    /* renamed from: o  reason: collision with root package name */
    private final Method f30447o;

    /* renamed from: p  reason: collision with root package name */
    private final t f30448p;

    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f30449a;

        public a(Runnable runnable) {
            this.f30449a = runnable;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            Method d10;
            if (C4049a.d(this)) {
                return null;
            }
            try {
                C6496s.h(obj, "proxy");
                C6496s.h(method, "m");
                if (C6496s.c(method.getName(), "onBillingSetupFinished")) {
                    if (objArr != null) {
                        obj2 = C6559l.m0(objArr, 0);
                    } else {
                        obj2 = null;
                    }
                    Class a10 = u.a("com.android.billingclient.api.BillingResult");
                    if (!(a10 == null || (d10 = u.d(a10, "getResponseCode", new Class[0])) == null || !C6496s.c(u.e(a10, d10, obj2, new Object[0]), 0))) {
                        l.f30426q.g().set(true);
                        Runnable runnable = this.f30449a;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = method.getName();
                    C6496s.g(name, "m.name");
                    if (p.u(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                        l.f30426q.g().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls) {
            Object e10;
            Object e11;
            Object e12;
            Class a10 = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class a11 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a10 == null || a11 == null) {
                return null;
            }
            Method d10 = u.d(cls, "newBuilder", Context.class);
            Method d11 = u.d(a10, com.amazon.a.a.o.b.f37472ac, new Class[0]);
            Method d12 = u.d(a10, "setListener", a11);
            Method d13 = u.d(a10, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null || (e10 = u.e(cls, d10, (Object) null, context)) == null || (e11 = u.e(a10, d12, e10, Proxy.newProxyInstance(a11.getClassLoader(), new Class[]{a11}, new d()))) == null || (e12 = u.e(a10, d11, e11, new Object[0])) == null) {
                return null;
            }
            return u.e(a10, d13, e12, new Object[0]);
        }

        private final l b(Context context) {
            t b10 = t.f30528g.b();
            if (b10 == null) {
                return null;
            }
            Class a10 = u.a("com.android.billingclient.api.BillingClient");
            Class a11 = u.a("com.android.billingclient.api.Purchase");
            Class a12 = u.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class a13 = u.a("com.android.billingclient.api.SkuDetails");
            Class a14 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class a15 = u.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class a16 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a10 == null || a12 == null || a11 == null || a13 == null || a15 == null || a14 == null || a16 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Class<String> cls = String.class;
            Method d10 = u.d(a10, "queryPurchases", cls);
            Method d11 = u.d(a12, "getPurchasesList", new Class[0]);
            Method d12 = u.d(a11, "getOriginalJson", new Class[0]);
            Method d13 = u.d(a13, "getOriginalJson", new Class[0]);
            Method d14 = u.d(a14, "getOriginalJson", new Class[0]);
            Method d15 = u.d(a10, "querySkuDetailsAsync", b10.d(), a15);
            Method d16 = u.d(a10, "queryPurchaseHistoryAsync", cls, a16);
            if (d10 == null || d11 == null || d12 == null || d13 == null || d14 == null || d15 == null || d16 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object a17 = a(context, a10);
            if (a17 == null) {
                Log.w(l.l(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            l.o(new l(a17, a10, a12, a11, a13, a14, a15, a16, d10, d11, d12, d13, d14, d15, d16, b10, (DefaultConstructorMarker) null));
            return l.g();
        }

        public final Map c() {
            return l.f();
        }

        public final synchronized l d(Context context) {
            l g10;
            C6496s.h(context, "context");
            g10 = l.g();
            if (g10 == null) {
                g10 = b(context);
            }
            return g10;
        }

        public final Map e() {
            return l.j();
        }

        public final Map f() {
            return l.k();
        }

        public final AtomicBoolean g() {
            return l.m();
        }

        private b() {
        }
    }

    public final class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private u.b f30450a;

        /* renamed from: b  reason: collision with root package name */
        private Runnable f30451b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f30452c;

        public c(l lVar, u.b bVar, Runnable runnable) {
            C6496s.h(bVar, "skuType");
            C6496s.h(runnable, "completionHandler");
            this.f30452c = lVar;
            this.f30450a = bVar;
            this.f30451b = runnable;
        }

        public void a(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String str;
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(obj, "proxy");
                    C6496s.h(method, "method");
                    if (C6496s.c(method.getName(), "onPurchaseHistoryResponse")) {
                        if (objArr != null) {
                            obj2 = C6559l.m0(objArr, 1);
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
                                    Object e11 = u.e(l.h(this.f30452c), l.d(this.f30452c), e10, new Object[0]);
                                    if (e11 instanceof String) {
                                        str = (String) e11;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String string = jSONObject.getString("productId");
                                            C6496s.g(string, "skuID");
                                            arrayList.add(string);
                                            if (this.f30450a == u.b.INAPP) {
                                                l.f30426q.c().put(string, jSONObject);
                                            } else {
                                                l.f30426q.f().put(string, jSONObject);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                l.n(this.f30452c, this.f30450a, arrayList, this.f30451b);
                            } else {
                                this.f30451b.run();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return C6514M.f71813a;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                C6496s.h(obj, "proxy");
                C6496s.h(method, "m");
                return null;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f30453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f30454b;

        public e(l lVar, Runnable runnable) {
            C6496s.h(runnable, "completionHandler");
            this.f30454b = lVar;
            this.f30453a = runnable;
        }

        public void a(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String str;
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(obj, "proxy");
                    C6496s.h(method, "m");
                    if (C6496s.c(method.getName(), "onSkuDetailsResponse")) {
                        if (objArr != null) {
                            obj2 = C6559l.m0(objArr, 1);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            return;
                        }
                        if (obj2 instanceof List) {
                            for (Object e10 : (List) obj2) {
                                try {
                                    Object e11 = u.e(l.i(this.f30454b), l.e(this.f30454b), e10, new Object[0]);
                                    if (e11 instanceof String) {
                                        str = (String) e11;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String string = jSONObject.getString("productId");
                                            Map e12 = l.f30426q.e();
                                            C6496s.g(string, "skuID");
                                            e12.put(string, jSONObject);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            this.f30453a.run();
                        }
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return C6514M.f71813a;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, tVar);
    }

    public static final /* synthetic */ Method d(l lVar) {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f30445m;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Method e(l lVar) {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f30444l;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30430u;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ l g() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30428s;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class h(l lVar) {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f30438f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Class i(l lVar) {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return lVar.f30437e;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map j() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30432w;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30431v;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String l() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30427r;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean m() {
        Class<l> cls = l.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f30429t;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void n(l lVar, u.b bVar, List list, Runnable runnable) {
        Class<l> cls = l.class;
        if (!C4049a.d(cls)) {
            try {
                lVar.s(bVar, list, runnable);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void o(l lVar) {
        Class<l> cls = l.class;
        if (!C4049a.d(cls)) {
            try {
                f30428s = lVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void p(Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                if (f30429t.get()) {
                    runnable.run();
                } else {
                    u(runnable);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void r(l lVar, u.b bVar, Runnable runnable) {
        Class<l> cls = l.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(lVar, "this$0");
                C6496s.h(bVar, "$productType");
                C6496s.h(runnable, "$completionHandler");
                u.e(lVar.f30434b, lVar.f30447o, lVar.q(), bVar.b(), Proxy.newProxyInstance(lVar.f30440h.getClassLoader(), new Class[]{lVar.f30440h}, new c(lVar, bVar, runnable)));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void s(u.b bVar, List list, Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                p(new k(this, runnable, bVar, list));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void t(l lVar, Runnable runnable, u.b bVar, List list) {
        Class<l> cls = l.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(lVar, "this$0");
                C6496s.h(runnable, "$completionHandler");
                C6496s.h(bVar, "$skuType");
                C6496s.h(list, "$skuIDs");
                Object newProxyInstance = Proxy.newProxyInstance(lVar.f30439g.getClassLoader(), new Class[]{lVar.f30439g}, new e(lVar, runnable));
                u.e(lVar.f30434b, lVar.f30446n, lVar.q(), lVar.f30448p.c(bVar, list), newProxyInstance);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void u(Runnable runnable) {
        Method d10;
        if (!C4049a.d(this)) {
            try {
                Class a10 = u.a("com.android.billingclient.api.BillingClientStateListener");
                if (a10 != null && (d10 = u.d(this.f30434b, "startConnection", a10)) != null) {
                    u.e(this.f30434b, d10, q(), Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a(runnable)));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void a(u.b bVar, Runnable runnable) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(bVar, "productType");
                C6496s.h(runnable, "completionHandler");
                p(new j(this, bVar, runnable));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public Object q() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f30433a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar) {
        this.f30433a = obj;
        this.f30434b = cls;
        this.f30435c = cls2;
        this.f30436d = cls3;
        this.f30437e = cls4;
        this.f30438f = cls5;
        this.f30439g = cls6;
        this.f30440h = cls7;
        this.f30441i = method;
        this.f30442j = method2;
        this.f30443k = method3;
        this.f30444l = method4;
        this.f30445m = method5;
        this.f30446n = method6;
        this.f30447o = method7;
        this.f30448p = tVar;
    }
}

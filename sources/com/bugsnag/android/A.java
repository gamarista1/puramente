package com.bugsnag.android;

import K4.j;
import K4.k;
import K4.m;
import K4.n;
import K4.o;
import K4.r;
import K4.t;
import android.app.Application;
import android.content.Context;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import lf.C6514M;
import yf.p;

public class A {

    /* renamed from: A  reason: collision with root package name */
    private final C3285z0 f38364A;

    /* renamed from: a  reason: collision with root package name */
    final k f38365a;

    /* renamed from: b  reason: collision with root package name */
    final Z0 f38366b;

    /* renamed from: c  reason: collision with root package name */
    final B0 f38367c;

    /* renamed from: d  reason: collision with root package name */
    private final m f38368d;

    /* renamed from: e  reason: collision with root package name */
    private final L f38369e;

    /* renamed from: f  reason: collision with root package name */
    private final C3284z f38370f;

    /* renamed from: g  reason: collision with root package name */
    private final L4.d f38371g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f38372h;

    /* renamed from: i  reason: collision with root package name */
    final Context f38373i;

    /* renamed from: j  reason: collision with root package name */
    final C3223b0 f38374j;

    /* renamed from: k  reason: collision with root package name */
    final C3249k f38375k;

    /* renamed from: l  reason: collision with root package name */
    final BreadcrumbState f38376l;

    /* renamed from: m  reason: collision with root package name */
    final W0 f38377m;

    /* renamed from: n  reason: collision with root package name */
    protected final C3283y0 f38378n;

    /* renamed from: o  reason: collision with root package name */
    final C3266p1 f38379o;

    /* renamed from: p  reason: collision with root package name */
    final z1 f38380p;

    /* renamed from: q  reason: collision with root package name */
    final S0 f38381q;

    /* renamed from: r  reason: collision with root package name */
    final H f38382r;

    /* renamed from: s  reason: collision with root package name */
    final S f38383s;

    /* renamed from: t  reason: collision with root package name */
    final C f38384t;

    /* renamed from: u  reason: collision with root package name */
    C3248j1 f38385u;

    /* renamed from: v  reason: collision with root package name */
    final C3233e1 f38386v;

    /* renamed from: w  reason: collision with root package name */
    final N0 f38387w;

    /* renamed from: x  reason: collision with root package name */
    final O0 f38388x;

    /* renamed from: y  reason: collision with root package name */
    final Q0 f38389y;

    /* renamed from: z  reason: collision with root package name */
    final K4.b f38390z;

    class a implements p {
        a() {
        }

        /* renamed from: a */
        public C6514M invoke(Boolean bool, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("hasConnection", bool);
            hashMap.put("networkState", str);
            A.this.A("Connectivity changed", BreadcrumbType.STATE, hashMap);
            if (!bool.booleanValue()) {
                return null;
            }
            A.this.f38378n.v();
            A.this.f38379o.d();
            return null;
        }
    }

    class b implements p {
        b() {
        }

        /* renamed from: a */
        public C6514M invoke(String str, Map map) {
            A.this.B(str, map, BreadcrumbType.STATE);
            return null;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            A.this.f38382r.a();
            A a10 = A.this;
            z1.d(a10.f38373i, a10.f38380p, a10.f38381q);
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N0 f38394a;

        d(N0 n02) {
            this.f38394a = n02;
        }

        public void run() {
            A.this.f38388x.f(this.f38394a);
        }
    }

    class e implements p {
        e() {
        }

        /* renamed from: a */
        public C6514M invoke(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put(TicketDetailDestinationKt.LAUNCHED_FROM, str);
            hashMap.put("to", str2);
            A.this.A("Orientation changed", BreadcrumbType.STATE, hashMap);
            A.this.f38384t.d(str2);
            return null;
        }
    }

    class f implements p {
        f() {
        }

        /* renamed from: a */
        public C6514M invoke(Boolean bool, Integer num) {
            A.this.f38377m.g(Boolean.TRUE.equals(bool));
            if (A.this.f38377m.h(num)) {
                A a10 = A.this;
                a10.A("Trim Memory", BreadcrumbType.STATE, Collections.singletonMap("trimLevel", a10.f38377m.e()));
            }
            A.this.f38377m.c();
            return null;
        }
    }

    class g implements Callable {
        g() {
        }

        /* renamed from: a */
        public Boolean call() {
            boolean z10;
            File nativeReportPath = NativeInterface.getNativeReportPath();
            if (nativeReportPath.exists() || nativeReportPath.mkdirs()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public A(Context context, G g10) {
        Context context2 = context;
        G g11 = g10;
        W0 w02 = new W0();
        this.f38377m = w02;
        K4.b bVar = new K4.b();
        this.f38390z = bVar;
        L4.c cVar = new L4.c(context2, bVar);
        Context a10 = cVar.a();
        this.f38373i = a10;
        C3233e1 u10 = g10.u();
        this.f38386v = u10;
        J j10 = new J(a10, new a());
        this.f38382r = j10;
        L4.b bVar2 = new L4.b(cVar, g11, j10, bVar);
        k a11 = bVar2.a();
        this.f38365a = a11;
        S0 r10 = a11.r();
        this.f38381q = r10;
        if (!(context2 instanceof Application)) {
            r10.e("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        w1 w1Var = new w1(a10, a11, bVar);
        C3282y yVar = new C3282y(a11, g11);
        this.f38384t = yVar.d();
        C3284z c10 = yVar.c();
        this.f38370f = c10;
        this.f38376l = yVar.b();
        this.f38369e = yVar.e();
        this.f38366b = yVar.g();
        this.f38367c = yVar.f();
        L4.f fVar = new L4.f(cVar, bVar);
        C3284z zVar = c10;
        w1 w1Var2 = w1Var;
        J1 j12 = new J1(bVar2, w1Var, this, bVar, zVar);
        S0 s02 = r10;
        k kVar = a11;
        C3233e1 e1Var = u10;
        L4.c cVar2 = cVar;
        K4.b bVar3 = bVar;
        M m10 = new M(cVar, bVar2, fVar, j12, bVar, j10, w1Var2.c(), w02);
        w1 w1Var3 = w1Var2;
        this.f38371g = w1Var3.i(g10.F());
        C3283y0 y0Var = (C3283y0) new C3273t0(cVar2, bVar2, m10, bVar3, j12, fVar, e1Var, zVar).c().get();
        this.f38378n = y0Var;
        this.f38383s = new S(s02, y0Var, kVar, zVar, e1Var, bVar3);
        this.f38364A = new C3285z0(this, s02);
        this.f38388x = (O0) w1Var3.e().a();
        this.f38387w = (N0) w1Var3.d().a();
        this.f38389y = j12.b();
        this.f38379o = (C3266p1) j12.c().get();
        this.f38375k = (C3249k) m10.g().get();
        this.f38374j = (C3223b0) m10.h().get();
        this.f38385u = new C3248j1(g10.x(), kVar, s02);
        if (g10.D().contains(A1.USAGE)) {
            this.f38368d = new n();
        } else {
            this.f38368d = new o();
        }
        this.f38372h = g11.f38481a.g();
        this.f38380p = new z1(this, s02);
        Y();
    }

    private void C(C3262o0 o0Var) {
        List h10 = o0Var.h();
        if (h10.size() > 0) {
            String b10 = ((C3250k0) h10.get(0)).b();
            String c10 = ((C3250k0) h10.get(0)).c();
            HashMap hashMap = new HashMap();
            hashMap.put("errorClass", b10);
            hashMap.put(MetricTracker.Object.MESSAGE, c10);
            hashMap.put("unhandled", String.valueOf(o0Var.m()));
            hashMap.put("severity", o0Var.k().toString());
            this.f38376l.add(new Breadcrumb(b10, BreadcrumbType.ERROR, hashMap, new Date(), this.f38381q));
        }
    }

    private void D(String str) {
        S0 s02 = this.f38381q;
        s02.f("Invalid null value supplied to client." + str + ", ignoring");
    }

    private void J(N0 n02) {
        try {
            this.f38390z.d(t.IO, new d(n02));
        } catch (RejectedExecutionException e10) {
            this.f38381q.b("Failed to persist last run info", e10);
        }
    }

    private void L() {
        this.f38373i.registerComponentCallbacks(new B(this.f38374j, new e(), new f()));
    }

    private boolean W() {
        try {
            return ((Boolean) this.f38390z.e(t.IO, new g()).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void Y() {
        if (this.f38365a.l().d()) {
            this.f38364A.b();
        }
        NativeInterface.setClient(this);
        this.f38385u.e(this);
        C3227c1 c1Var = C3227c1.f38676a;
        c1Var.g(this.f38385u.b());
        if (this.f38365a.G().contains(A1.USAGE)) {
            c1Var.f(true);
        }
        this.f38378n.z();
        this.f38378n.v();
        this.f38379o.d();
        this.f38368d.c(this.f38372h);
        this.f38370f.l(this.f38368d);
        M();
        L();
        N();
        A("Bugsnag loaded", BreadcrumbType.STATE, new HashMap());
        this.f38381q.g("Bugsnag loaded");
    }

    /* access modifiers changed from: package-private */
    public void A(String str, BreadcrumbType breadcrumbType, Map map) {
        if (!this.f38365a.J(breadcrumbType)) {
            this.f38376l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f38381q));
        }
    }

    public void B(String str, Map map, BreadcrumbType breadcrumbType) {
        if (str == null || breadcrumbType == null || map == null) {
            D("leaveBreadcrumb");
            return;
        }
        this.f38376l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f38381q));
    }

    public void E() {
        this.f38389y.e();
    }

    public void F(Throwable th2, C3242h1 h1Var) {
        if (th2 == null) {
            D("notify");
        } else if (!this.f38365a.O(th2)) {
            Throwable th3 = th2;
            K(new C3262o0(th3, this.f38365a, q1.h("handledException"), this.f38366b.h(), this.f38367c.g(), this.f38381q), h1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(C3262o0 o0Var, C3242h1 h1Var) {
        o0Var.v(this.f38366b.h().j());
        C3254l1 i10 = this.f38379o.i();
        if (i10 != null && (this.f38365a.g() || !i10.k())) {
            o0Var.w(i10);
        }
        if (!this.f38370f.h(o0Var, this.f38381q) || (h1Var != null && !h1Var.a(o0Var))) {
            this.f38381q.g("Skipping notification - onError task returned false");
            return;
        }
        C(o0Var);
        this.f38383s.d(o0Var);
    }

    /* access modifiers changed from: package-private */
    public void H(Throwable th2, Y0 y02, String str, String str2) {
        int i10;
        Throwable th3 = th2;
        K(new C3262o0(th3, this.f38365a, q1.i(str, Severity.ERROR, str2), Y0.f38641c.b(this.f38366b.h(), y02), this.f38367c.g(), this.f38381q), (C3242h1) null);
        N0 n02 = this.f38387w;
        if (n02 == null) {
            i10 = 0;
        } else {
            i10 = n02.a();
        }
        boolean d10 = this.f38389y.d();
        if (d10) {
            i10++;
        }
        J(new N0(i10, true, d10));
        this.f38390z.c();
    }

    public void I() {
        this.f38379o.m();
    }

    /* access modifiers changed from: package-private */
    public void K(C3262o0 o0Var, C3242h1 h1Var) {
        o0Var.s(this.f38374j.j(new Date().getTime()));
        o0Var.c("device", this.f38374j.l());
        o0Var.p(this.f38375k.e());
        o0Var.c("app", this.f38375k.f());
        o0Var.q(this.f38376l.copy());
        L1 c10 = ((N1) this.f38371g.get()).c();
        o0Var.y(c10.b(), c10.a(), c10.c());
        o0Var.r(this.f38369e.c());
        o0Var.u(this.f38368d);
        G(o0Var, h1Var);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        Context context = this.f38373i;
        if (context instanceof Application) {
            Application application = (Application) context;
            j.i(application);
            j.f(this.f38379o);
            if (!this.f38365a.J(BreadcrumbType.STATE)) {
                application.registerActivityLifecycleCallbacks(new C3222b(new b()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N() {
        try {
            this.f38390z.d(t.DEFAULT, new c());
        } catch (RejectedExecutionException e10) {
            this.f38381q.b("Failed to register for system events", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(r rVar) {
        this.f38366b.removeObserver(rVar);
        this.f38376l.removeObserver(rVar);
        this.f38379o.removeObserver(rVar);
        this.f38384t.removeObserver(rVar);
        ((N1) this.f38371g.get()).removeObserver(rVar);
        this.f38369e.removeObserver(rVar);
        this.f38383s.removeObserver(rVar);
        this.f38389y.removeObserver(rVar);
        this.f38377m.removeObserver(rVar);
        this.f38367c.removeObserver(rVar);
    }

    public boolean P() {
        return this.f38379o.o();
    }

    /* access modifiers changed from: package-private */
    public void Q(boolean z10) {
        this.f38385u.f(this, z10);
    }

    /* access modifiers changed from: package-private */
    public void R(boolean z10) {
        this.f38385u.g(this, z10);
        if (z10) {
            this.f38364A.b();
        } else {
            this.f38364A.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(String str) {
        k().l(str);
    }

    /* access modifiers changed from: package-private */
    public void T(String str) {
        this.f38375k.m(str);
    }

    public void U(String str) {
        this.f38369e.e(str);
    }

    public void V(String str, String str2, String str3) {
        ((N1) this.f38371g.get()).d(new L1(str, str2, str3));
    }

    /* access modifiers changed from: package-private */
    public void X() {
        int i10;
        if (!W()) {
            this.f38381q.e("Failed to setup NDK directory.");
            return;
        }
        String absolutePath = this.f38388x.c().getAbsolutePath();
        N0 n02 = this.f38387w;
        if (n02 != null) {
            i10 = n02.a();
        } else {
            i10 = 0;
        }
        this.f38384t.c(this.f38365a, absolutePath, i10);
        a0();
        this.f38384t.b();
    }

    public void Z() {
        this.f38379o.r(false);
    }

    public void a(String str, String str2) {
        if (str != null) {
            this.f38367c.b(str, str2);
        } else {
            D("addFeatureFlag");
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        this.f38366b.g();
        this.f38369e.b();
        ((N1) this.f38371g.get()).b();
        this.f38377m.c();
        this.f38367c.f();
    }

    public void b(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            D("addMetadata");
        } else {
            this.f38366b.b(str, str2, obj);
        }
    }

    public void c(String str, Map map) {
        if (str == null || map == null) {
            D("addMetadata");
        } else {
            this.f38366b.c(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(r rVar) {
        this.f38366b.addObserver(rVar);
        this.f38376l.addObserver(rVar);
        this.f38379o.addObserver(rVar);
        this.f38384t.addObserver(rVar);
        ((N1) this.f38371g.get()).addObserver(rVar);
        this.f38369e.addObserver(rVar);
        this.f38383s.addObserver(rVar);
        this.f38389y.addObserver(rVar);
        this.f38377m.addObserver(rVar);
        this.f38367c.addObserver(rVar);
    }

    public void e(C3242h1 h1Var) {
        if (h1Var != null) {
            this.f38370f.a(h1Var);
        } else {
            D("addOnError");
        }
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2) {
        this.f38374j.c(str, str2);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        z1 z1Var = this.f38380p;
        if (z1Var != null) {
            try {
                K.f(this.f38373i, z1Var, this.f38381q);
            } catch (IllegalArgumentException unused) {
                this.f38381q.e("Receiver not registered");
            }
        }
        super.finalize();
    }

    public void g(String str) {
        if (str != null) {
            this.f38367c.c(str);
        } else {
            D("clearFeatureFlag");
        }
    }

    public void h() {
        this.f38367c.d();
    }

    public void i(String str) {
        if (str != null) {
            this.f38366b.d(str);
        } else {
            D("clearMetadata");
        }
    }

    public void j(String str, String str2) {
        if (str == null || str2 == null) {
            D("clearMetadata");
        } else {
            this.f38366b.e(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public C3249k k() {
        return this.f38375k;
    }

    public List l() {
        return this.f38376l.copy();
    }

    /* access modifiers changed from: package-private */
    public k m() {
        return this.f38365a;
    }

    public String n() {
        return this.f38369e.c();
    }

    /* access modifiers changed from: package-private */
    public L o() {
        return this.f38369e;
    }

    /* access modifiers changed from: package-private */
    public C3223b0 p() {
        return this.f38374j;
    }

    /* access modifiers changed from: package-private */
    public C3283y0 q() {
        return this.f38378n;
    }

    /* access modifiers changed from: package-private */
    public B0 r() {
        return this.f38367c;
    }

    public N0 s() {
        return this.f38387w;
    }

    /* access modifiers changed from: package-private */
    public S0 t() {
        return this.f38381q;
    }

    /* access modifiers changed from: package-private */
    public Map u() {
        return this.f38366b.h().n();
    }

    /* access modifiers changed from: package-private */
    public Z0 v() {
        return this.f38366b;
    }

    /* access modifiers changed from: package-private */
    public C3233e1 w() {
        return this.f38386v;
    }

    /* access modifiers changed from: package-private */
    public C3245i1 x(Class cls) {
        return this.f38385u.a(cls);
    }

    /* access modifiers changed from: package-private */
    public C3266p1 y() {
        return this.f38379o;
    }

    public L1 z() {
        return ((N1) this.f38371g.get()).c();
    }
}

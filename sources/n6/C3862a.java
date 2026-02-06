package n6;

import G6.b;
import G6.d;
import T5.g;
import T5.i;
import T5.k;
import U5.a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import d6.C3476b;
import d6.C3477c;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.C3777a;
import m6.C3779c;
import m6.C3780d;
import r6.C3976a;
import s6.C3990a;
import t6.C4046a;
import t6.C4047b;
import t6.C4048c;

/* renamed from: n6.a  reason: case insensitive filesystem */
public abstract class C3862a implements C4046a, C3777a.C0696a, C3990a.C0723a {

    /* renamed from: w  reason: collision with root package name */
    private static final Map f46864w = g.of("component_tag", "drawee");

    /* renamed from: x  reason: collision with root package name */
    private static final Map f46865x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: y  reason: collision with root package name */
    private static final Class f46866y = C3862a.class;

    /* renamed from: a  reason: collision with root package name */
    private final C3779c f46867a = C3779c.a();

    /* renamed from: b  reason: collision with root package name */
    private final C3777a f46868b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f46869c;

    /* renamed from: d  reason: collision with root package name */
    private C3780d f46870d;

    /* renamed from: e  reason: collision with root package name */
    private C3990a f46871e;

    /* renamed from: f  reason: collision with root package name */
    protected d f46872f;

    /* renamed from: g  reason: collision with root package name */
    protected d f46873g = new d();

    /* renamed from: h  reason: collision with root package name */
    private C4048c f46874h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f46875i;

    /* renamed from: j  reason: collision with root package name */
    private String f46876j;

    /* renamed from: k  reason: collision with root package name */
    private Object f46877k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46878l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46879m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46880n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f46881o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46882p;

    /* renamed from: q  reason: collision with root package name */
    private String f46883q;

    /* renamed from: r  reason: collision with root package name */
    private C3477c f46884r;

    /* renamed from: s  reason: collision with root package name */
    private Object f46885s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f46886t = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f46887u = false;

    /* renamed from: v  reason: collision with root package name */
    protected Drawable f46888v;

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    class C0704a extends C3476b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f46890b;

        C0704a(String str, boolean z10) {
            this.f46889a = str;
            this.f46890b = z10;
        }

        public void b(C3477c cVar) {
            boolean c10 = cVar.c();
            C3862a.this.O(this.f46889a, cVar, cVar.f(), c10);
        }

        public void e(C3477c cVar) {
            C3862a.this.L(this.f46889a, cVar, cVar.d(), true);
        }

        public void f(C3477c cVar) {
            boolean c10 = cVar.c();
            boolean g10 = cVar.g();
            float f10 = cVar.f();
            Object a10 = cVar.a();
            if (a10 != null) {
                C3862a.this.N(this.f46889a, cVar, a10, f10, c10, this.f46890b, g10);
            } else if (c10) {
                C3862a.this.L(this.f46889a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* renamed from: n6.a$b */
    private static class b extends f {
        private b() {
        }

        public static b e(d dVar, d dVar2) {
            if (j7.b.d()) {
                j7.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.b(dVar);
            bVar.b(dVar2);
            if (j7.b.d()) {
                j7.b.b();
            }
            return bVar;
        }
    }

    public C3862a(C3777a aVar, Executor executor, String str, Object obj) {
        this.f46868b = aVar;
        this.f46869c = executor;
        C(str, obj);
    }

    private C4048c B() {
        C4048c cVar = this.f46874h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f46877k);
    }

    private synchronized void C(String str, Object obj) {
        C3777a aVar;
        try {
            if (j7.b.d()) {
                j7.b.a("AbstractDraweeController#init");
            }
            this.f46867a.b(C3779c.a.ON_INIT_CONTROLLER);
            if (!this.f46886t && (aVar = this.f46868b) != null) {
                aVar.a(this);
            }
            this.f46878l = false;
            this.f46880n = false;
            Q();
            this.f46882p = false;
            C3780d dVar = this.f46870d;
            if (dVar != null) {
                dVar.a();
            }
            C3990a aVar2 = this.f46871e;
            if (aVar2 != null) {
                aVar2.a();
                this.f46871e.f(this);
            }
            d dVar2 = this.f46872f;
            if (dVar2 instanceof b) {
                ((b) dVar2).c();
            } else {
                this.f46872f = null;
            }
            C4048c cVar = this.f46874h;
            if (cVar != null) {
                cVar.reset();
                this.f46874h.f((Drawable) null);
                this.f46874h = null;
            }
            this.f46875i = null;
            if (a.w(2)) {
                a.A(f46866y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f46876j, str);
            }
            this.f46876j = str;
            this.f46877k = obj;
            if (j7.b.d()) {
                j7.b.b();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private boolean E(String str, C3477c cVar) {
        if (cVar == null && this.f46884r == null) {
            return true;
        }
        if (!str.equals(this.f46876j) || cVar != this.f46884r || !this.f46879m) {
            return false;
        }
        return true;
    }

    private void G(String str, Throwable th2) {
        if (a.w(2)) {
            a.B(f46866y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f46876j, str, th2);
        }
    }

    private void H(String str, Object obj) {
        if (a.w(2)) {
            a.C(f46866y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f46876j, str, w(obj), Integer.valueOf(x(obj)));
        }
    }

    private b.a I(C3477c cVar, Object obj, Uri uri) {
        Map map;
        if (cVar == null) {
            map = null;
        } else {
            map = cVar.getExtras();
        }
        return J(map, K(obj), uri);
    }

    private b.a J(Map map, Map map2, Uri uri) {
        PointF pointF;
        String str;
        C4048c cVar = this.f46874h;
        if (cVar instanceof C3976a) {
            C3976a aVar = (C3976a) cVar;
            String valueOf = String.valueOf(aVar.m());
            pointF = aVar.l();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return F6.b.a(f46864w, f46865x, map, (Map) null, t(), str, pointF, map2, o(), F(), uri);
    }

    /* access modifiers changed from: private */
    public void L(String str, C3477c cVar, Throwable th2, boolean z10) {
        C3779c.a aVar;
        Drawable drawable;
        if (j7.b.d()) {
            j7.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th2);
            cVar.close();
            if (j7.b.d()) {
                j7.b.b();
                return;
            }
            return;
        }
        C3779c cVar2 = this.f46867a;
        if (z10) {
            aVar = C3779c.a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = C3779c.a.ON_DATASOURCE_FAILURE_INT;
        }
        cVar2.b(aVar);
        if (z10) {
            G("final_failed @ onFailure", th2);
            this.f46884r = null;
            this.f46881o = true;
            C4048c cVar3 = this.f46874h;
            if (cVar3 != null) {
                if (this.f46882p && (drawable = this.f46888v) != null) {
                    cVar3.e(drawable, 1.0f, true);
                } else if (g0()) {
                    cVar3.a(th2);
                } else {
                    cVar3.b(th2);
                }
            }
            T(th2, cVar);
        } else {
            G("intermediate_failed @ onFailure", th2);
            U(th2);
        }
        if (j7.b.d()) {
            j7.b.b();
        }
    }

    /* access modifiers changed from: private */
    public void N(String str, C3477c cVar, Object obj, float f10, boolean z10, boolean z11, boolean z12) {
        C3779c.a aVar;
        Drawable l10;
        Object obj2;
        Drawable drawable;
        try {
            if (j7.b.d()) {
                j7.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", obj);
                R(obj);
                cVar.close();
                if (j7.b.d()) {
                    j7.b.b();
                    return;
                }
                return;
            }
            C3779c cVar2 = this.f46867a;
            if (z10) {
                aVar = C3779c.a.ON_DATASOURCE_RESULT;
            } else {
                aVar = C3779c.a.ON_DATASOURCE_RESULT_INT;
            }
            cVar2.b(aVar);
            try {
                l10 = l(obj);
                obj2 = this.f46885s;
                drawable = this.f46888v;
                this.f46885s = obj;
                this.f46888v = l10;
                if (z10) {
                    H("set_final_result @ onNewResult", obj);
                    this.f46884r = null;
                    B().e(l10, 1.0f, z11);
                    Y(str, obj, cVar);
                } else if (z12) {
                    H("set_temporary_result @ onNewResult", obj);
                    B().e(l10, 1.0f, z11);
                    Y(str, obj, cVar);
                } else {
                    H("set_intermediate_result @ onNewResult", obj);
                    B().e(l10, f10, z11);
                    V(str, obj);
                }
                if (!(drawable == null || drawable == l10)) {
                    P(drawable);
                }
                if (!(obj2 == null || obj2 == obj)) {
                    H("release_previous_result @ onNewResult", obj2);
                    R(obj2);
                }
                if (j7.b.d()) {
                    j7.b.b();
                }
            } catch (Exception e10) {
                H("drawable_failed @ onNewResult", obj);
                R(obj);
                L(str, cVar, e10, z10);
                if (j7.b.d()) {
                    j7.b.b();
                }
            }
        } catch (Throwable th2) {
            if (j7.b.d()) {
                j7.b.b();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public void O(String str, C3477c cVar, float f10, boolean z10) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", (Throwable) null);
            cVar.close();
        } else if (!z10) {
            this.f46874h.c(f10, false);
        }
    }

    private void Q() {
        Map map;
        boolean z10 = this.f46879m;
        this.f46879m = false;
        this.f46881o = false;
        C3477c cVar = this.f46884r;
        Map map2 = null;
        if (cVar != null) {
            map = cVar.getExtras();
            this.f46884r.close();
            this.f46884r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f46888v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f46883q != null) {
            this.f46883q = null;
        }
        this.f46888v = null;
        Object obj = this.f46885s;
        if (obj != null) {
            Map K10 = K(y(obj));
            H("release", this.f46885s);
            R(this.f46885s);
            this.f46885s = null;
            map2 = K10;
        }
        if (z10) {
            W(map, map2);
        }
    }

    private void T(Throwable th2, C3477c cVar) {
        b.a I10 = I(cVar, (Object) null, (Uri) null);
        p().f(this.f46876j, th2);
        q().f(this.f46876j, th2, I10);
    }

    private void U(Throwable th2) {
        p().s(this.f46876j, th2);
        q().o(this.f46876j);
    }

    private void V(String str, Object obj) {
        Object y10 = y(obj);
        p().a(str, y10);
        q().a(str, y10);
    }

    private void W(Map map, Map map2) {
        p().h(this.f46876j);
        q().t(this.f46876j, J(map, map2, (Uri) null));
    }

    private void Y(String str, Object obj, C3477c cVar) {
        Object y10 = y(obj);
        p().n(str, y10, m());
        q().n(str, y10, I(cVar, y10, (Uri) null));
    }

    private boolean g0() {
        C3780d dVar;
        if (!this.f46881o || (dVar = this.f46870d) == null || !dVar.e()) {
            return false;
        }
        return true;
    }

    private Rect t() {
        C4048c cVar = this.f46874h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    /* access modifiers changed from: protected */
    public C3780d A() {
        if (this.f46870d == null) {
            this.f46870d = new C3780d();
        }
        return this.f46870d;
    }

    /* access modifiers changed from: protected */
    public void D(String str, Object obj) {
        C(str, obj);
        this.f46886t = false;
        this.f46887u = false;
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return this.f46887u;
    }

    public abstract Map K(Object obj);

    /* access modifiers changed from: protected */
    public abstract void P(Drawable drawable);

    /* access modifiers changed from: protected */
    public abstract void R(Object obj);

    public void S(G6.b bVar) {
        this.f46873g.y(bVar);
    }

    /* access modifiers changed from: protected */
    public void X(C3477c cVar, Object obj) {
        p().r(this.f46876j, this.f46877k);
        q().b(this.f46876j, this.f46877k, I(cVar, obj, z()));
    }

    public void Z(String str) {
        this.f46883q = str;
    }

    public boolean a() {
        if (a.w(2)) {
            a.z(f46866y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f46876j);
        }
        if (!g0()) {
            return false;
        }
        this.f46870d.b();
        this.f46874h.reset();
        h0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void a0(Drawable drawable) {
        this.f46875i = drawable;
        C4048c cVar = this.f46874h;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    public void b() {
        String str;
        if (j7.b.d()) {
            j7.b.a("AbstractDraweeController#onAttach");
        }
        if (a.w(2)) {
            Class cls = f46866y;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f46876j;
            if (this.f46879m) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            a.A(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f46867a.b(C3779c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f46874h);
        this.f46868b.a(this);
        this.f46878l = true;
        if (!this.f46879m) {
            h0();
        }
        if (j7.b.d()) {
            j7.b.b();
        }
    }

    public void c() {
        if (j7.b.d()) {
            j7.b.a("AbstractDraweeController#onDetach");
        }
        if (a.w(2)) {
            a.z(f46866y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f46876j);
        }
        this.f46867a.b(C3779c.a.ON_DETACH_CONTROLLER);
        this.f46878l = false;
        this.f46868b.d(this);
        if (j7.b.d()) {
            j7.b.b();
        }
    }

    /* access modifiers changed from: protected */
    public void c0(C3990a aVar) {
        this.f46871e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    public C4047b d() {
        return this.f46874h;
    }

    /* access modifiers changed from: protected */
    public void d0(boolean z10) {
        this.f46887u = z10;
    }

    public boolean e(MotionEvent motionEvent) {
        if (a.w(2)) {
            a.A(f46866y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f46876j, motionEvent);
        }
        C3990a aVar = this.f46871e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !f0()) {
            return false;
        }
        this.f46871e.d(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0(boolean z10) {
        this.f46882p = z10;
    }

    public void f(C4047b bVar) {
        C3779c.a aVar;
        if (a.w(2)) {
            a.A(f46866y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f46876j, bVar);
        }
        C3779c cVar = this.f46867a;
        if (bVar != null) {
            aVar = C3779c.a.ON_SET_HIERARCHY;
        } else {
            aVar = C3779c.a.ON_CLEAR_HIERARCHY;
        }
        cVar.b(aVar);
        if (this.f46879m) {
            this.f46868b.a(this);
            release();
        }
        C4048c cVar2 = this.f46874h;
        if (cVar2 != null) {
            cVar2.f((Drawable) null);
            this.f46874h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof C4048c));
            C4048c cVar3 = (C4048c) bVar;
            this.f46874h = cVar3;
            cVar3.f(this.f46875i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean f0() {
        return g0();
    }

    /* access modifiers changed from: protected */
    public void h0() {
        if (j7.b.d()) {
            j7.b.a("AbstractDraweeController#submitRequest");
        }
        Object n10 = n();
        if (n10 != null) {
            if (j7.b.d()) {
                j7.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f46884r = null;
            this.f46879m = true;
            this.f46881o = false;
            this.f46867a.b(C3779c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f46884r, y(n10));
            M(this.f46876j, n10);
            N(this.f46876j, this.f46884r, n10, 1.0f, true, true, true);
            if (j7.b.d()) {
                j7.b.b();
            }
            if (j7.b.d()) {
                j7.b.b();
                return;
            }
            return;
        }
        this.f46867a.b(C3779c.a.ON_DATASOURCE_SUBMIT);
        this.f46874h.c(0.0f, true);
        this.f46879m = true;
        this.f46881o = false;
        C3477c s10 = s();
        this.f46884r = s10;
        X(s10, (Object) null);
        if (a.w(2)) {
            a.A(f46866y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f46876j, Integer.valueOf(System.identityHashCode(this.f46884r)));
        }
        this.f46884r.e(new C0704a(this.f46876j, this.f46884r.b()), this.f46869c);
        if (j7.b.d()) {
            j7.b.b();
        }
    }

    public void j(d dVar) {
        k.g(dVar);
        d dVar2 = this.f46872f;
        if (dVar2 instanceof b) {
            ((b) dVar2).b(dVar);
        } else if (dVar2 != null) {
            this.f46872f = b.e(dVar2, dVar);
        } else {
            this.f46872f = dVar;
        }
    }

    public void k(G6.b bVar) {
        this.f46873g.v(bVar);
    }

    /* access modifiers changed from: protected */
    public abstract Drawable l(Object obj);

    public Animatable m() {
        Drawable drawable = this.f46888v;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object n();

    public Object o() {
        return this.f46877k;
    }

    /* access modifiers changed from: protected */
    public d p() {
        d dVar = this.f46872f;
        if (dVar == null) {
            return c.b();
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public G6.b q() {
        return this.f46873g;
    }

    /* access modifiers changed from: protected */
    public Drawable r() {
        return this.f46875i;
    }

    public void release() {
        this.f46867a.b(C3779c.a.ON_RELEASE_CONTROLLER);
        C3780d dVar = this.f46870d;
        if (dVar != null) {
            dVar.c();
        }
        C3990a aVar = this.f46871e;
        if (aVar != null) {
            aVar.e();
        }
        C4048c cVar = this.f46874h;
        if (cVar != null) {
            cVar.reset();
        }
        Q();
    }

    /* access modifiers changed from: protected */
    public abstract C3477c s();

    public String toString() {
        return i.b(this).c("isAttached", this.f46878l).c("isRequestSubmitted", this.f46879m).c("hasFetchFailed", this.f46881o).a("fetchedImage", x(this.f46885s)).b("events", this.f46867a.toString()).toString();
    }

    /* access modifiers changed from: protected */
    public C3990a u() {
        return this.f46871e;
    }

    public String v() {
        return this.f46876j;
    }

    /* access modifiers changed from: protected */
    public String w(Object obj) {
        if (obj != null) {
            return obj.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    public abstract int x(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object y(Object obj);

    /* access modifiers changed from: protected */
    public abstract Uri z();

    public void b0(e eVar) {
    }

    /* access modifiers changed from: protected */
    public void M(String str, Object obj) {
    }
}

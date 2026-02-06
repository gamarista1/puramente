package X6;

import O6.e;
import Q6.a;
import T5.k;
import T5.n;
import V6.r;
import V6.s;
import V6.u;
import V6.v;
import a7.c;
import android.content.Context;
import b7.C3158a;
import com.facebook.imagepipeline.producers.B;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import j7.b;
import java.util.Set;
import k7.d;
import k7.f;
import k7.h;

public class x {

    /* renamed from: p  reason: collision with root package name */
    private static final Class f35344p = x.class;

    /* renamed from: q  reason: collision with root package name */
    private static x f35345q;

    /* renamed from: r  reason: collision with root package name */
    private static C3096t f35346r;

    /* renamed from: s  reason: collision with root package name */
    private static boolean f35347s;

    /* renamed from: a  reason: collision with root package name */
    private final p0 f35348a;

    /* renamed from: b  reason: collision with root package name */
    private final C3098v f35349b;

    /* renamed from: c  reason: collision with root package name */
    private final C3078a f35350c;

    /* renamed from: d  reason: collision with root package name */
    private final n f35351d;

    /* renamed from: e  reason: collision with root package name */
    private V6.n f35352e;

    /* renamed from: f  reason: collision with root package name */
    private u f35353f;

    /* renamed from: g  reason: collision with root package name */
    private V6.n f35354g;

    /* renamed from: h  reason: collision with root package name */
    private u f35355h;

    /* renamed from: i  reason: collision with root package name */
    private c f35356i;

    /* renamed from: j  reason: collision with root package name */
    private d f35357j;

    /* renamed from: k  reason: collision with root package name */
    private B f35358k;

    /* renamed from: l  reason: collision with root package name */
    private V f35359l;

    /* renamed from: m  reason: collision with root package name */
    private U6.d f35360m;

    /* renamed from: n  reason: collision with root package name */
    private g7.d f35361n;

    /* renamed from: o  reason: collision with root package name */
    private a f35362o;

    public x(C3098v vVar) {
        p0 p0Var;
        if (b.d()) {
            b.a("ImagePipelineConfig()");
        }
        C3098v vVar2 = (C3098v) k.g(vVar);
        this.f35349b = vVar2;
        if (vVar2.G().F()) {
            p0Var = new B(vVar.H().a());
        } else {
            p0Var = new q0(vVar.H().a());
        }
        this.f35348a = p0Var;
        this.f35350c = new C3078a(vVar.w());
        if (b.d()) {
            b.b();
        }
        this.f35351d = vVar2.v();
    }

    private C3096t a() {
        V p10 = p();
        Set e10 = this.f35349b.e();
        Set a10 = this.f35349b.a();
        n C10 = this.f35349b.C();
        u e11 = e();
        u h10 = h();
        n nVar = this.f35351d;
        V6.k y10 = this.f35349b.y();
        p0 p0Var = this.f35348a;
        n t10 = this.f35349b.G().t();
        n H10 = this.f35349b.G().H();
        this.f35349b.F();
        return new C3096t(p10, e10, a10, C10, e11, h10, nVar, y10, p0Var, t10, H10, (O5.a) null, this.f35349b);
    }

    private a c() {
        if (this.f35362o == null) {
            this.f35362o = Q6.b.a(m(), this.f35349b.H(), d(), this.f35349b.G().j(), this.f35349b.G().v(), this.f35349b.G().c(), this.f35349b.G().d(), this.f35349b.l());
        }
        return this.f35362o;
    }

    private c i() {
        c cVar;
        c cVar2;
        if (this.f35356i == null) {
            if (this.f35349b.r() != null) {
                this.f35356i = this.f35349b.r();
            } else {
                a c10 = c();
                if (c10 != null) {
                    cVar = c10.c();
                    cVar2 = c10.b();
                } else {
                    cVar = null;
                    cVar2 = null;
                }
                if (this.f35349b.o() == null) {
                    this.f35356i = new a7.b(cVar, cVar2, n());
                } else {
                    this.f35356i = new a7.b(cVar, cVar2, n(), this.f35349b.o().a());
                    e.e().g(this.f35349b.o().b());
                }
            }
        }
        return this.f35356i;
    }

    private d k() {
        if (this.f35357j == null) {
            if (this.f35349b.n() == null && this.f35349b.m() == null && this.f35349b.G().I()) {
                this.f35357j = new h(this.f35349b.G().m());
            } else {
                this.f35357j = new f(this.f35349b.G().m(), this.f35349b.G().x(), this.f35349b.n(), this.f35349b.m(), this.f35349b.G().E());
            }
        }
        return this.f35357j;
    }

    public static x l() {
        return (x) k.h(f35345q, "ImagePipelineFactory was not initialized!");
    }

    private B o() {
        if (this.f35358k == null) {
            this.f35358k = this.f35349b.G().p().a(this.f35349b.getContext(), this.f35349b.t().k(), i(), this.f35349b.h(), this.f35349b.E(), this.f35349b.z(), this.f35349b.G().A(), this.f35349b.H(), this.f35349b.t().i(this.f35349b.u()), this.f35349b.t().j(), e(), h(), this.f35351d, this.f35349b.y(), m(), this.f35349b.G().g(), this.f35349b.G().f(), this.f35349b.G().e(), this.f35349b.G().m(), f(), this.f35349b.G().l(), this.f35349b.G().u());
        }
        return this.f35358k;
    }

    private V p() {
        boolean w10 = this.f35349b.G().w();
        if (this.f35359l == null) {
            this.f35359l = new V(this.f35349b.getContext().getApplicationContext().getContentResolver(), o(), this.f35349b.b(), this.f35349b.z(), this.f35349b.G().K(), this.f35348a, this.f35349b.E(), w10, this.f35349b.G().J(), this.f35349b.p(), k(), this.f35349b.G().D(), this.f35349b.G().B(), this.f35349b.G().a(), this.f35349b.A());
        }
        return this.f35359l;
    }

    public static synchronized void q(C3098v vVar) {
        synchronized (x.class) {
            if (f35345q != null) {
                U5.a.E(f35344p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                if (f35347s) {
                    return;
                }
            }
            f35345q = new x(vVar);
        }
    }

    public static synchronized void r(Context context) {
        synchronized (x.class) {
            try {
                if (b.d()) {
                    b.a("ImagePipelineFactory#initialize");
                }
                q(C3097u.K(context).a());
                if (b.d()) {
                    b.b();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public C3158a b(Context context) {
        a c10 = c();
        if (c10 == null) {
            return null;
        }
        return c10.a(context);
    }

    public V6.n d() {
        if (this.f35352e == null) {
            this.f35352e = this.f35349b.x().a(this.f35349b.q(), this.f35349b.D(), this.f35349b.g(), this.f35349b.G().r(), this.f35349b.G().q(), this.f35349b.k());
        }
        return this.f35352e;
    }

    public u e() {
        if (this.f35353f == null) {
            this.f35353f = v.a(d(), this.f35349b.B());
        }
        return this.f35353f;
    }

    public C3078a f() {
        return this.f35350c;
    }

    public V6.n g() {
        if (this.f35354g == null) {
            this.f35354g = r.a(this.f35349b.s(), this.f35349b.D(), this.f35349b.f());
        }
        return this.f35354g;
    }

    public u h() {
        V6.x xVar;
        if (this.f35355h == null) {
            if (this.f35349b.c() != null) {
                xVar = this.f35349b.c();
            } else {
                xVar = g();
            }
            this.f35355h = s.a(xVar, this.f35349b.B());
        }
        return this.f35355h;
    }

    public C3096t j() {
        if (f35346r == null) {
            f35346r = a();
        }
        return f35346r;
    }

    public U6.d m() {
        if (this.f35360m == null) {
            this.f35360m = U6.e.a(this.f35349b.t(), n(), f());
        }
        return this.f35360m;
    }

    public g7.d n() {
        if (this.f35361n == null) {
            this.f35361n = g7.e.a(this.f35349b.t(), this.f35349b.G().G(), this.f35349b.G().s(), this.f35349b.G().o());
        }
        return this.f35361n;
    }
}

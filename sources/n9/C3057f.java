package N9;

import N9.A;
import N9.C3070t;
import android.os.Handler;
import ia.J;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import java.util.HashMap;
import k9.n1;
import o9.u;

/* renamed from: N9.f  reason: case insensitive filesystem */
public abstract class C3057f extends C3052a {

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f33221h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Handler f33222i;

    /* renamed from: j  reason: collision with root package name */
    private J f33223j;

    /* renamed from: N9.f$a */
    private final class a implements A, u {

        /* renamed from: a  reason: collision with root package name */
        private final Object f33224a;

        /* renamed from: b  reason: collision with root package name */
        private A.a f33225b;

        /* renamed from: c  reason: collision with root package name */
        private u.a f33226c;

        public a(Object obj) {
            this.f33225b = C3057f.this.w((C3070t.b) null);
            this.f33226c = C3057f.this.s((C3070t.b) null);
            this.f33224a = obj;
        }

        private boolean a(int i10, C3070t.b bVar) {
            C3070t.b bVar2;
            if (bVar != null) {
                bVar2 = C3057f.this.G(this.f33224a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I10 = C3057f.this.I(this.f33224a, i10);
            A.a aVar = this.f33225b;
            if (aVar.f33025a != I10 || !M.c(aVar.f33026b, bVar2)) {
                this.f33225b = C3057f.this.v(I10, bVar2, 0);
            }
            u.a aVar2 = this.f33226c;
            if (aVar2.f47542a == I10 && M.c(aVar2.f47543b, bVar2)) {
                return true;
            }
            this.f33226c = C3057f.this.r(I10, bVar2);
            return true;
        }

        private C3068q g(C3068q qVar) {
            long H10 = C3057f.this.H(this.f33224a, qVar.f33283f);
            long H11 = C3057f.this.H(this.f33224a, qVar.f33284g);
            if (H10 == qVar.f33283f && H11 == qVar.f33284g) {
                return qVar;
            }
            return new C3068q(qVar.f33278a, qVar.f33279b, qVar.f33280c, qVar.f33281d, qVar.f33282e, H10, H11);
        }

        public void M(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f33226c.m();
            }
        }

        public void P(int i10, C3070t.b bVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f33225b.j(g(qVar));
            }
        }

        public void V(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f33225b.s(nVar, g(qVar));
            }
        }

        public void W(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f33226c.i();
            }
        }

        public void b0(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f33226c.j();
            }
        }

        public void c0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f33225b.v(nVar, g(qVar));
            }
        }

        public void d0(int i10, C3070t.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f33226c.l(exc);
            }
        }

        public void e0(int i10, C3070t.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f33226c.k(i11);
            }
        }

        public void g0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f33225b.B(nVar, g(qVar));
            }
        }

        public void h0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f33225b.y(nVar, g(qVar), iOException, z10);
            }
        }

        public void m0(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f33226c.h();
            }
        }

        public void n0(int i10, C3070t.b bVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f33225b.E(g(qVar));
            }
        }
    }

    /* renamed from: N9.f$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C3070t f33228a;

        /* renamed from: b  reason: collision with root package name */
        public final C3070t.c f33229b;

        /* renamed from: c  reason: collision with root package name */
        public final a f33230c;

        public b(C3070t tVar, C3070t.c cVar, a aVar) {
            this.f33228a = tVar;
            this.f33229b = cVar;
            this.f33230c = aVar;
        }
    }

    protected C3057f() {
    }

    /* access modifiers changed from: protected */
    public void C(J j10) {
        this.f33223j = j10;
        this.f33222i = M.w();
    }

    /* access modifiers changed from: protected */
    public void E() {
        for (b bVar : this.f33221h.values()) {
            bVar.f33228a.o(bVar.f33229b);
            bVar.f33228a.h(bVar.f33230c);
            bVar.f33228a.m(bVar.f33230c);
        }
        this.f33221h.clear();
    }

    /* access modifiers changed from: protected */
    public abstract C3070t.b G(Object obj, C3070t.b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void J(Object obj, C3070t tVar, n1 n1Var);

    /* access modifiers changed from: protected */
    public final void L(Object obj, C3070t tVar) {
        C3645a.a(!this.f33221h.containsKey(obj));
        C3056e eVar = new C3056e(this, obj);
        a aVar = new a(obj);
        this.f33221h.put(obj, new b(tVar, eVar, aVar));
        tVar.f((Handler) C3645a.e(this.f33222i), aVar);
        tVar.j((Handler) C3645a.e(this.f33222i), aVar);
        tVar.q(eVar, this.f33223j, A());
        if (!B()) {
            tVar.n(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        for (b bVar : this.f33221h.values()) {
            bVar.f33228a.n(bVar.f33229b);
        }
    }

    /* access modifiers changed from: protected */
    public void z() {
        for (b bVar : this.f33221h.values()) {
            bVar.f33228a.k(bVar.f33229b);
        }
    }

    /* access modifiers changed from: protected */
    public long H(Object obj, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public int I(Object obj, int i10) {
        return i10;
    }
}

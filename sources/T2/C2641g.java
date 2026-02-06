package t2;

import android.os.Handler;
import f2.H;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import java.util.HashMap;
import k2.x;
import p2.t;
import t2.C2615C;
import t2.C2621I;

/* renamed from: t2.g  reason: case insensitive filesystem */
public abstract class C2641g extends C2635a {

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f26249h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Handler f26250i;

    /* renamed from: j  reason: collision with root package name */
    private x f26251j;

    /* renamed from: t2.g$a */
    private final class a implements C2621I, t {

        /* renamed from: a  reason: collision with root package name */
        private final Object f26252a;

        /* renamed from: b  reason: collision with root package name */
        private C2621I.a f26253b;

        /* renamed from: c  reason: collision with root package name */
        private t.a f26254c;

        public a(Object obj) {
            this.f26253b = C2641g.this.t((C2615C.b) null);
            this.f26254c = C2641g.this.r((C2615C.b) null);
            this.f26252a = obj;
        }

        private boolean a(int i10, C2615C.b bVar) {
            C2615C.b bVar2;
            if (bVar != null) {
                bVar2 = C2641g.this.C(this.f26252a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int E10 = C2641g.this.E(this.f26252a, i10);
            C2621I.a aVar = this.f26253b;
            if (aVar.f25986a != E10 || !L.c(aVar.f25987b, bVar2)) {
                this.f26253b = C2641g.this.s(E10, bVar2);
            }
            t.a aVar2 = this.f26254c;
            if (aVar2.f25302a == E10 && L.c(aVar2.f25303b, bVar2)) {
                return true;
            }
            this.f26254c = C2641g.this.q(E10, bVar2);
            return true;
        }

        private C2613A g(C2613A a10, C2615C.b bVar) {
            C2613A a11 = a10;
            C2615C.b bVar2 = bVar;
            long D10 = C2641g.this.D(this.f26252a, a11.f25957f, bVar2);
            long D11 = C2641g.this.D(this.f26252a, a11.f25958g, bVar2);
            if (D10 == a11.f25957f && D11 == a11.f25958g) {
                return a11;
            }
            return new C2613A(a11.f25952a, a11.f25953b, a11.f25954c, a11.f25955d, a11.f25956e, D10, D11);
        }

        public void O(int i10, C2615C.b bVar) {
            if (a(i10, bVar)) {
                this.f26254c.h();
            }
        }

        public void T(int i10, C2615C.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f26254c.l(exc);
            }
        }

        public void V(int i10, C2615C.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f26254c.k(i11);
            }
        }

        public void X(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            if (a(i10, bVar)) {
                this.f26253b.q(xVar, g(a10, bVar));
            }
        }

        public void Z(int i10, C2615C.b bVar) {
            if (a(i10, bVar)) {
                this.f26254c.i();
            }
        }

        public void b0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            if (a(i10, bVar)) {
                this.f26253b.u(xVar, g(a10, bVar));
            }
        }

        public void g0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f26253b.s(xVar, g(a10, bVar), iOException, z10);
            }
        }

        public void i0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            if (a(i10, bVar)) {
                this.f26253b.o(xVar, g(a10, bVar));
            }
        }

        public void j0(int i10, C2615C.b bVar, C2613A a10) {
            if (a(i10, bVar)) {
                this.f26253b.h(g(a10, bVar));
            }
        }

        public void l0(int i10, C2615C.b bVar) {
            if (a(i10, bVar)) {
                this.f26254c.j();
            }
        }

        public void m0(int i10, C2615C.b bVar) {
            if (a(i10, bVar)) {
                this.f26254c.m();
            }
        }
    }

    /* renamed from: t2.g$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C2615C f26256a;

        /* renamed from: b  reason: collision with root package name */
        public final C2615C.c f26257b;

        /* renamed from: c  reason: collision with root package name */
        public final a f26258c;

        public b(C2615C c10, C2615C.c cVar, a aVar) {
            this.f26256a = c10;
            this.f26257b = cVar;
            this.f26258c = aVar;
        }
    }

    protected C2641g() {
    }

    /* access modifiers changed from: protected */
    public void A() {
        for (b bVar : this.f26249h.values()) {
            bVar.f26256a.g(bVar.f26257b);
            bVar.f26256a.l(bVar.f26258c);
            bVar.f26256a.n(bVar.f26258c);
        }
        this.f26249h.clear();
    }

    /* access modifiers changed from: protected */
    public abstract C2615C.b C(Object obj, C2615C.b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void F(Object obj, C2615C c10, H h10);

    /* access modifiers changed from: protected */
    public final void H(Object obj, C2615C c10) {
        C2076a.a(!this.f26249h.containsKey(obj));
        C2640f fVar = new C2640f(this, obj);
        a aVar = new a(obj);
        this.f26249h.put(obj, new b(c10, fVar, aVar));
        c10.i((Handler) C2076a.e(this.f26250i), aVar);
        c10.h((Handler) C2076a.e(this.f26250i), aVar);
        c10.k(fVar, this.f26251j, w());
        if (!x()) {
            c10.f(fVar);
        }
    }

    public void c() {
        for (b bVar : this.f26249h.values()) {
            bVar.f26256a.c();
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        for (b bVar : this.f26249h.values()) {
            bVar.f26256a.f(bVar.f26257b);
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        for (b bVar : this.f26249h.values()) {
            bVar.f26256a.p(bVar.f26257b);
        }
    }

    /* access modifiers changed from: protected */
    public void y(x xVar) {
        this.f26251j = xVar;
        this.f26250i = L.z();
    }

    /* access modifiers changed from: protected */
    public int E(Object obj, int i10) {
        return i10;
    }

    /* access modifiers changed from: protected */
    public long D(Object obj, long j10, C2615C.b bVar) {
        return j10;
    }
}

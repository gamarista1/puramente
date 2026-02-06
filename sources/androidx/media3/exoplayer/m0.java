package androidx.media3.exoplayer;

import android.util.Pair;
import f2.H;
import f2.w;
import i2.C2076a;
import i2.C2087l;
import i2.L;
import i2.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.x;
import m2.C2192a;
import n2.C2280a;
import n2.u1;
import p2.t;
import t2.C2613A;
import t2.C2614B;
import t2.C2615C;
import t2.C2621I;
import t2.C2658x;
import t2.C2659y;
import t2.C2660z;
import t2.b0;
import w2.C2820b;

final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final u1 f17729a;

    /* renamed from: b  reason: collision with root package name */
    private final List f17730b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap f17731c = new IdentityHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f17732d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final d f17733e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f17734f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f17735g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C2280a f17736h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C2087l f17737i;

    /* renamed from: j  reason: collision with root package name */
    private b0 f17738j = new b0.a(0);

    /* renamed from: k  reason: collision with root package name */
    private boolean f17739k;

    /* renamed from: l  reason: collision with root package name */
    private x f17740l;

    private final class a implements C2621I, t {

        /* renamed from: a  reason: collision with root package name */
        private final c f17741a;

        public a(c cVar) {
            this.f17741a = cVar;
        }

        private Pair C(int i10, C2615C.b bVar) {
            C2615C.b bVar2 = null;
            if (bVar != null) {
                C2615C.b c10 = m0.n(this.f17741a, bVar);
                if (c10 == null) {
                    return null;
                }
                bVar2 = c10;
            }
            return Pair.create(Integer.valueOf(m0.s(this.f17741a, i10)), bVar2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void E(Pair pair, C2613A a10) {
            m0.this.f17736h.j0(((Integer) pair.first).intValue(), (C2615C.b) pair.second, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void F(Pair pair) {
            m0.this.f17736h.O(((Integer) pair.first).intValue(), (C2615C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void H(Pair pair) {
            m0.this.f17736h.Z(((Integer) pair.first).intValue(), (C2615C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void I(Pair pair) {
            m0.this.f17736h.l0(((Integer) pair.first).intValue(), (C2615C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void K(Pair pair, int i10) {
            m0.this.f17736h.V(((Integer) pair.first).intValue(), (C2615C.b) pair.second, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void L(Pair pair, Exception exc) {
            m0.this.f17736h.T(((Integer) pair.first).intValue(), (C2615C.b) pair.second, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            m0.this.f17736h.m0(((Integer) pair.first).intValue(), (C2615C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void P(Pair pair, C2658x xVar, C2613A a10) {
            m0.this.f17736h.i0(((Integer) pair.first).intValue(), (C2615C.b) pair.second, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Q(Pair pair, C2658x xVar, C2613A a10) {
            m0.this.f17736h.X(((Integer) pair.first).intValue(), (C2615C.b) pair.second, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void R(Pair pair, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
            m0.this.f17736h.g0(((Integer) pair.first).intValue(), (C2615C.b) pair.second, xVar, a10, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void U(Pair pair, C2658x xVar, C2613A a10) {
            m0.this.f17736h.b0(((Integer) pair.first).intValue(), (C2615C.b) pair.second, xVar, a10);
        }

        public void O(int i10, C2615C.b bVar) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new c0(this, C10));
            }
        }

        public void T(int i10, C2615C.b bVar, Exception exc) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new h0(this, C10, exc));
            }
        }

        public void V(int i10, C2615C.b bVar, int i11) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new j0(this, C10, i11));
            }
        }

        public void X(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new f0(this, C10, xVar, a10));
            }
        }

        public void Z(int i10, C2615C.b bVar) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new k0(this, C10));
            }
        }

        public void b0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new d0(this, C10, xVar, a10));
            }
        }

        public void g0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new g0(this, C10, xVar, a10, iOException, z10));
            }
        }

        public void i0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new b0(this, C10, xVar, a10));
            }
        }

        public void j0(int i10, C2615C.b bVar, C2613A a10) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new e0(this, C10, a10));
            }
        }

        public void l0(int i10, C2615C.b bVar) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new l0(this, C10));
            }
        }

        public void m0(int i10, C2615C.b bVar) {
            Pair C10 = C(i10, bVar);
            if (C10 != null) {
                m0.this.f17737i.f(new i0(this, C10));
            }
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C2615C f17743a;

        /* renamed from: b  reason: collision with root package name */
        public final C2615C.c f17744b;

        /* renamed from: c  reason: collision with root package name */
        public final a f17745c;

        public b(C2615C c10, C2615C.c cVar, a aVar) {
            this.f17743a = c10;
            this.f17744b = cVar;
            this.f17745c = aVar;
        }
    }

    static final class c implements Z {

        /* renamed from: a  reason: collision with root package name */
        public final C2660z f17746a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f17747b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List f17748c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f17749d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17750e;

        public c(C2615C c10, boolean z10) {
            this.f17746a = new C2660z(c10, z10);
        }

        public Object a() {
            return this.f17747b;
        }

        public H b() {
            return this.f17746a.V();
        }

        public void c(int i10) {
            this.f17749d = i10;
            this.f17750e = false;
            this.f17748c.clear();
        }
    }

    public interface d {
        void b();
    }

    public m0(d dVar, C2280a aVar, C2087l lVar, u1 u1Var) {
        this.f17729a = u1Var;
        this.f17733e = dVar;
        this.f17736h = aVar;
        this.f17737i = lVar;
        this.f17734f = new HashMap();
        this.f17735g = new HashSet();
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f17730b.remove(i12);
            this.f17732d.remove(cVar.f17747b);
            g(i12, -cVar.f17746a.V().p());
            cVar.f17750e = true;
            if (this.f17739k) {
                v(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f17730b.size()) {
            ((c) this.f17730b.get(i10)).f17749d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f17734f.get(cVar);
        if (bVar != null) {
            bVar.f17743a.f(bVar.f17744b);
        }
    }

    private void k() {
        Iterator it = this.f17735g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f17748c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f17735g.add(cVar);
        b bVar = (b) this.f17734f.get(cVar);
        if (bVar != null) {
            bVar.f17743a.p(bVar.f17744b);
        }
    }

    private static Object m(Object obj) {
        return C2192a.v(obj);
    }

    /* access modifiers changed from: private */
    public static C2615C.b n(c cVar, C2615C.b bVar) {
        for (int i10 = 0; i10 < cVar.f17748c.size(); i10++) {
            if (((C2615C.b) cVar.f17748c.get(i10)).f25963d == bVar.f25963d) {
                return bVar.a(p(cVar, bVar.f25960a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return C2192a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return C2192a.y(cVar.f17747b, obj);
    }

    /* access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f17749d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(C2615C c10, H h10) {
        this.f17733e.b();
    }

    private void v(c cVar) {
        if (cVar.f17750e && cVar.f17748c.isEmpty()) {
            b bVar = (b) C2076a.e((b) this.f17734f.remove(cVar));
            bVar.f17743a.g(bVar.f17744b);
            bVar.f17743a.l(bVar.f17745c);
            bVar.f17743a.n(bVar.f17745c);
            this.f17735g.remove(cVar);
        }
    }

    private void x(c cVar) {
        C2660z zVar = cVar.f17746a;
        a0 a0Var = new a0(this);
        a aVar = new a(cVar);
        this.f17734f.put(cVar, new b(zVar, a0Var, aVar));
        zVar.i(L.B(), aVar);
        zVar.h(L.B(), aVar);
        zVar.k(a0Var, this.f17740l, this.f17729a);
    }

    public H A(int i10, int i11, b0 b0Var) {
        boolean z10;
        if (i10 < 0 || i10 > i11 || i11 > r()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.a(z10);
        this.f17738j = b0Var;
        B(i10, i11);
        return i();
    }

    public H C(List list, b0 b0Var) {
        B(0, this.f17730b.size());
        return f(this.f17730b.size(), list, b0Var);
    }

    public H D(b0 b0Var) {
        int r10 = r();
        if (b0Var.a() != r10) {
            b0Var = b0Var.f().h(0, r10);
        }
        this.f17738j = b0Var;
        return i();
    }

    public H E(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = false;
        if (i10 < 0 || i10 > i11 || i11 > r()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.a(z10);
        if (list.size() == i11 - i10) {
            z11 = true;
        }
        C2076a.a(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f17730b.get(i12)).f17746a.m((w) list.get(i12 - i10));
        }
        return i();
    }

    public H f(int i10, List list, b0 b0Var) {
        if (!list.isEmpty()) {
            this.f17738j = b0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f17730b.get(i11 - 1);
                    cVar.c(cVar2.f17749d + cVar2.f17746a.V().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f17746a.V().p());
                this.f17730b.add(i11, cVar);
                this.f17732d.put(cVar.f17747b, cVar);
                if (this.f17739k) {
                    x(cVar);
                    if (this.f17731c.isEmpty()) {
                        this.f17735g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public C2614B h(C2615C.b bVar, C2820b bVar2, long j10) {
        Object o10 = o(bVar.f25960a);
        C2615C.b a10 = bVar.a(m(bVar.f25960a));
        c cVar = (c) C2076a.e((c) this.f17732d.get(o10));
        l(cVar);
        cVar.f17748c.add(a10);
        C2659y S10 = cVar.f17746a.o(a10, bVar2, j10);
        this.f17731c.put(S10, cVar);
        k();
        return S10;
    }

    public H i() {
        if (this.f17730b.isEmpty()) {
            return H.f19735a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f17730b.size(); i11++) {
            c cVar = (c) this.f17730b.get(i11);
            cVar.f17749d = i10;
            i10 += cVar.f17746a.V().p();
        }
        return new p0(this.f17730b, this.f17738j);
    }

    public b0 q() {
        return this.f17738j;
    }

    public int r() {
        return this.f17730b.size();
    }

    public boolean t() {
        return this.f17739k;
    }

    public void w(x xVar) {
        C2076a.g(!this.f17739k);
        this.f17740l = xVar;
        for (int i10 = 0; i10 < this.f17730b.size(); i10++) {
            c cVar = (c) this.f17730b.get(i10);
            x(cVar);
            this.f17735g.add(cVar);
        }
        this.f17739k = true;
    }

    public void y() {
        for (b bVar : this.f17734f.values()) {
            try {
                bVar.f17743a.g(bVar.f17744b);
            } catch (RuntimeException e10) {
                p.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f17743a.l(bVar.f17745c);
            bVar.f17743a.n(bVar.f17745c);
        }
        this.f17734f.clear();
        this.f17735g.clear();
        this.f17739k = false;
    }

    public void z(C2614B b10) {
        c cVar = (c) C2076a.e((c) this.f17731c.remove(b10));
        cVar.f17746a.j(b10);
        cVar.f17748c.remove(((C2659y) b10).f26335a);
        if (!this.f17731c.isEmpty()) {
            k();
        }
        v(cVar);
    }
}

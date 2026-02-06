package k9;

import N9.A;
import N9.C3065n;
import N9.C3066o;
import N9.C3067p;
import N9.C3068q;
import N9.C3070t;
import N9.O;
import N9.r;
import android.os.Handler;
import ia.C3604b;
import ia.J;
import ja.C3645a;
import ja.M;
import ja.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l9.C3747a;
import l9.s0;
import o9.u;

final class K0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f45312a;

    /* renamed from: b  reason: collision with root package name */
    private final List f45313b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap f45314c = new IdentityHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f45315d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final d f45316e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final A.a f45317f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final u.a f45318g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f45319h;

    /* renamed from: i  reason: collision with root package name */
    private final Set f45320i;

    /* renamed from: j  reason: collision with root package name */
    private O f45321j = new O.a(0);

    /* renamed from: k  reason: collision with root package name */
    private boolean f45322k;

    /* renamed from: l  reason: collision with root package name */
    private J f45323l;

    private final class a implements A, u {

        /* renamed from: a  reason: collision with root package name */
        private final c f45324a;

        /* renamed from: b  reason: collision with root package name */
        private A.a f45325b;

        /* renamed from: c  reason: collision with root package name */
        private u.a f45326c;

        public a(c cVar) {
            this.f45325b = K0.this.f45317f;
            this.f45326c = K0.this.f45318g;
            this.f45324a = cVar;
        }

        private boolean a(int i10, C3070t.b bVar) {
            C3070t.b bVar2;
            if (bVar != null) {
                bVar2 = K0.n(this.f45324a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int e10 = K0.r(this.f45324a, i10);
            A.a aVar = this.f45325b;
            if (aVar.f33025a != e10 || !M.c(aVar.f33026b, bVar2)) {
                this.f45325b = K0.this.f45317f.F(e10, bVar2, 0);
            }
            u.a aVar2 = this.f45326c;
            if (aVar2.f47542a == e10 && M.c(aVar2.f47543b, bVar2)) {
                return true;
            }
            this.f45326c = K0.this.f45318g.u(e10, bVar2);
            return true;
        }

        public void M(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f45326c.m();
            }
        }

        public void P(int i10, C3070t.b bVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f45325b.j(qVar);
            }
        }

        public void V(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f45325b.s(nVar, qVar);
            }
        }

        public void W(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f45326c.i();
            }
        }

        public void b0(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f45326c.j();
            }
        }

        public void c0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f45325b.v(nVar, qVar);
            }
        }

        public void d0(int i10, C3070t.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f45326c.l(exc);
            }
        }

        public void e0(int i10, C3070t.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f45326c.k(i11);
            }
        }

        public void g0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f45325b.B(nVar, qVar);
            }
        }

        public void h0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f45325b.y(nVar, qVar, iOException, z10);
            }
        }

        public void m0(int i10, C3070t.b bVar) {
            if (a(i10, bVar)) {
                this.f45326c.h();
            }
        }

        public void n0(int i10, C3070t.b bVar, C3068q qVar) {
            if (a(i10, bVar)) {
                this.f45325b.E(qVar);
            }
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C3070t f45328a;

        /* renamed from: b  reason: collision with root package name */
        public final C3070t.c f45329b;

        /* renamed from: c  reason: collision with root package name */
        public final a f45330c;

        public b(C3070t tVar, C3070t.c cVar, a aVar) {
            this.f45328a = tVar;
            this.f45329b = cVar;
            this.f45330c = aVar;
        }
    }

    static final class c implements I0 {

        /* renamed from: a  reason: collision with root package name */
        public final C3067p f45331a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f45332b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List f45333c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f45334d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f45335e;

        public c(C3070t tVar, boolean z10) {
            this.f45331a = new C3067p(tVar, z10);
        }

        public Object a() {
            return this.f45332b;
        }

        public n1 b() {
            return this.f45331a.Q();
        }

        public void c(int i10) {
            this.f45334d = i10;
            this.f45335e = false;
            this.f45333c.clear();
        }
    }

    public interface d {
        void b();
    }

    public K0(d dVar, C3747a aVar, Handler handler, s0 s0Var) {
        this.f45312a = s0Var;
        this.f45316e = dVar;
        A.a aVar2 = new A.a();
        this.f45317f = aVar2;
        u.a aVar3 = new u.a();
        this.f45318g = aVar3;
        this.f45319h = new HashMap();
        this.f45320i = new HashSet();
        aVar2.g(handler, aVar);
        aVar3.g(handler, aVar);
    }

    private void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f45313b.remove(i12);
            this.f45315d.remove(cVar.f45332b);
            g(i12, -cVar.f45331a.Q().t());
            cVar.f45335e = true;
            if (this.f45322k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f45313b.size()) {
            ((c) this.f45313b.get(i10)).f45334d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f45319h.get(cVar);
        if (bVar != null) {
            bVar.f45328a.n(bVar.f45329b);
        }
    }

    private void k() {
        Iterator it = this.f45320i.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f45333c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f45320i.add(cVar);
        b bVar = (b) this.f45319h.get(cVar);
        if (bVar != null) {
            bVar.f45328a.k(bVar.f45329b);
        }
    }

    private static Object m(Object obj) {
        return C3684a.A(obj);
    }

    /* access modifiers changed from: private */
    public static C3070t.b n(c cVar, C3070t.b bVar) {
        for (int i10 = 0; i10 < cVar.f45333c.size(); i10++) {
            if (((C3070t.b) cVar.f45333c.get(i10)).f33288d == bVar.f33288d) {
                return bVar.c(p(cVar, bVar.f33285a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return C3684a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return C3684a.D(cVar.f45332b, obj);
    }

    /* access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f45334d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(C3070t tVar, n1 n1Var) {
        this.f45316e.b();
    }

    private void u(c cVar) {
        if (cVar.f45335e && cVar.f45333c.isEmpty()) {
            b bVar = (b) C3645a.e((b) this.f45319h.remove(cVar));
            bVar.f45328a.o(bVar.f45329b);
            bVar.f45328a.h(bVar.f45330c);
            bVar.f45328a.m(bVar.f45330c);
            this.f45320i.remove(cVar);
        }
    }

    private void w(c cVar) {
        C3067p pVar = cVar.f45331a;
        J0 j02 = new J0(this);
        a aVar = new a(cVar);
        this.f45319h.put(cVar, new b(pVar, j02, aVar));
        pVar.f(M.y(), aVar);
        pVar.j(M.y(), aVar);
        pVar.q(j02, this.f45323l, this.f45312a);
    }

    public n1 B(List list, O o10) {
        A(0, this.f45313b.size());
        return f(this.f45313b.size(), list, o10);
    }

    public n1 C(O o10) {
        int q10 = q();
        if (o10.a() != q10) {
            o10 = o10.f().h(0, q10);
        }
        this.f45321j = o10;
        return i();
    }

    public n1 f(int i10, List list, O o10) {
        if (!list.isEmpty()) {
            this.f45321j = o10;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f45313b.get(i11 - 1);
                    cVar.c(cVar2.f45334d + cVar2.f45331a.Q().t());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f45331a.Q().t());
                this.f45313b.add(i11, cVar);
                this.f45315d.put(cVar.f45332b, cVar);
                if (this.f45322k) {
                    w(cVar);
                    if (this.f45314c.isEmpty()) {
                        this.f45320i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public r h(C3070t.b bVar, C3604b bVar2, long j10) {
        Object o10 = o(bVar.f33285a);
        C3070t.b c10 = bVar.c(m(bVar.f33285a));
        c cVar = (c) C3645a.e((c) this.f45315d.get(o10));
        l(cVar);
        cVar.f45333c.add(c10);
        C3066o M10 = cVar.f45331a.i(c10, bVar2, j10);
        this.f45314c.put(M10, cVar);
        k();
        return M10;
    }

    public n1 i() {
        if (this.f45313b.isEmpty()) {
            return n1.f45710a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f45313b.size(); i11++) {
            c cVar = (c) this.f45313b.get(i11);
            cVar.f45334d = i10;
            i10 += cVar.f45331a.Q().t();
        }
        return new X0(this.f45313b, this.f45321j);
    }

    public int q() {
        return this.f45313b.size();
    }

    public boolean s() {
        return this.f45322k;
    }

    public void v(J j10) {
        C3645a.f(!this.f45322k);
        this.f45323l = j10;
        for (int i10 = 0; i10 < this.f45313b.size(); i10++) {
            c cVar = (c) this.f45313b.get(i10);
            w(cVar);
            this.f45320i.add(cVar);
        }
        this.f45322k = true;
    }

    public void x() {
        for (b bVar : this.f45319h.values()) {
            try {
                bVar.f45328a.o(bVar.f45329b);
            } catch (RuntimeException e10) {
                s.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f45328a.h(bVar.f45330c);
            bVar.f45328a.m(bVar.f45330c);
        }
        this.f45319h.clear();
        this.f45320i.clear();
        this.f45322k = false;
    }

    public void y(r rVar) {
        c cVar = (c) C3645a.e((c) this.f45314c.remove(rVar));
        cVar.f45331a.g(rVar);
        cVar.f45333c.remove(((C3066o) rVar).f33258a);
        if (!this.f45314c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public n1 z(int i10, int i11, O o10) {
        boolean z10;
        if (i10 < 0 || i10 > i11 || i11 > q()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.a(z10);
        this.f45321j = o10;
        A(i10, i11);
        return i();
    }
}

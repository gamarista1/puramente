package com.google.firebase.database;

import Gb.j;
import Lb.C4367a;
import Lb.C4375i;
import Lb.E;
import Lb.I;
import Lb.l;
import Lb.n;
import Ob.m;
import Qb.i;
import Tb.f;
import Tb.g;
import Tb.p;
import Tb.q;
import Tb.r;
import Tb.t;
import Tb.u;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.tasks.Task;

public class h {

    /* renamed from: a  reason: collision with root package name */
    protected final n f57160a;

    /* renamed from: b  reason: collision with root package name */
    protected final l f57161b;

    /* renamed from: c  reason: collision with root package name */
    protected final Qb.h f57162c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57163d;

    class a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f57164a;

        a(j jVar) {
            this.f57164a = jVar;
        }

        public void a(Gb.b bVar) {
            this.f57164a.a(bVar);
        }

        public void b(a aVar) {
            h.this.x(this);
            this.f57164a.b(aVar);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4375i f57166a;

        b(C4375i iVar) {
            this.f57166a = iVar;
        }

        public void run() {
            h.this.f57160a.Z(this.f57166a);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4375i f57168a;

        c(C4375i iVar) {
            this.f57168a = iVar;
        }

        public void run() {
            h.this.f57160a.C(this.f57168a);
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f57170a;

        d(boolean z10) {
            this.f57170a = z10;
        }

        public void run() {
            h hVar = h.this;
            hVar.f57160a.P(hVar.o(), this.f57170a);
        }
    }

    h(n nVar, l lVar, Qb.h hVar, boolean z10) {
        this.f57160a = nVar;
        this.f57161b = lVar;
        this.f57162c = hVar;
        this.f57163d = z10;
        Ob.l.g(hVar.q(), "Validation of queries failed.");
    }

    private h B(Tb.n nVar, String str) {
        Tb.b bVar;
        m.g(str);
        if (!nVar.e0() && !nVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        } else if (!this.f57162c.o()) {
            if (str == null) {
                bVar = null;
            } else if (str.equals("[MIN_NAME]")) {
                bVar = Tb.b.j();
            } else if (str.equals("[MAX_KEY]")) {
                bVar = Tb.b.i();
            } else {
                bVar = Tb.b.e(str);
            }
            Qb.h x10 = this.f57162c.x(nVar, bVar);
            G(x10);
            I(x10);
            Ob.l.f(x10.q());
            return new h(this.f57160a, this.f57161b, x10, this.f57163d);
        } else {
            throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
        }
    }

    private void G(Qb.h hVar) {
        if (hVar.o() && hVar.m() && hVar.n() && !hVar.l()) {
            throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    private void H() {
        if (this.f57163d) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    private void I(Qb.h hVar) {
        if (hVar.d().equals(Tb.j.j())) {
            if (hVar.o()) {
                Tb.n h10 = hVar.h();
                if (!C4535q.b(hVar.g(), Tb.b.j()) || !(h10 instanceof t)) {
                    throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
                }
            }
            if (hVar.m()) {
                Tb.n f10 = hVar.f();
                if (!hVar.e().equals(Tb.b.i()) || !(f10 instanceof t)) {
                    throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
                }
            }
        } else if (!hVar.d().equals(q.j())) {
        } else {
            if ((hVar.o() && !r.b(hVar.h())) || (hVar.m() && !r.b(hVar.f()))) {
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
            }
        }
    }

    private void b(C4375i iVar) {
        I.b().c(iVar);
        this.f57160a.g0(new c(iVar));
    }

    private h g(Tb.n nVar, String str) {
        Tb.b bVar;
        m.g(str);
        if (nVar.e0() || nVar.isEmpty()) {
            if (str != null) {
                bVar = Tb.b.e(str);
            } else {
                bVar = null;
            }
            if (!this.f57162c.m()) {
                Qb.h b10 = this.f57162c.b(nVar, bVar);
                G(b10);
                I(b10);
                Ob.l.f(b10.q());
                return new h(this.f57160a, this.f57161b, b10, this.f57163d);
            }
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    private void y(C4375i iVar) {
        I.b().e(iVar);
        this.f57160a.g0(new b(iVar));
    }

    public h A(double d10, String str) {
        return B(new f(Double.valueOf(d10), r.a()), str);
    }

    public h C(String str) {
        return D(str, (String) null);
    }

    public h D(String str, String str2) {
        Tb.n nVar;
        if (str != null) {
            nVar = new t(str, r.a());
        } else {
            nVar = g.A();
        }
        return B(nVar, str2);
    }

    public h E(boolean z10) {
        return F(z10, (String) null);
    }

    public h F(boolean z10, String str) {
        return B(new Tb.a(Boolean.valueOf(z10), r.a()), str);
    }

    public Gb.a a(Gb.a aVar) {
        b(new C4367a(this.f57160a, aVar, o()));
        return aVar;
    }

    public void c(j jVar) {
        b(new E(this.f57160a, new a(jVar), o()));
    }

    public j d(j jVar) {
        b(new E(this.f57160a, jVar, o()));
        return jVar;
    }

    public h e(double d10) {
        return f(d10, (String) null);
    }

    public h f(double d10, String str) {
        return g(new f(Double.valueOf(d10), r.a()), str);
    }

    public h h(String str) {
        return i(str, (String) null);
    }

    public h i(String str, String str2) {
        Tb.n nVar;
        if (str != null) {
            nVar = new t(str, r.a());
        } else {
            nVar = g.A();
        }
        return g(nVar, str2);
    }

    public h j(boolean z10) {
        return k(z10, (String) null);
    }

    public h k(boolean z10, String str) {
        return g(new Tb.a(Boolean.valueOf(z10), r.a()), str);
    }

    public Task l() {
        return this.f57160a.N(this);
    }

    public l m() {
        return this.f57161b;
    }

    public b n() {
        return new b(this.f57160a, m());
    }

    public i o() {
        return new i(this.f57161b, this.f57162c);
    }

    public void p(boolean z10) {
        if (this.f57161b.isEmpty() || !this.f57161b.E().equals(Tb.b.f())) {
            this.f57160a.g0(new d(z10));
            return;
        }
        throw new Gb.c("Can't call keepSynced() on .info paths.");
    }

    public h q(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.f57162c.n()) {
            return new h(this.f57160a, this.f57161b, this.f57162c.s(i10), this.f57163d);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public h r(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        } else if (!this.f57162c.n()) {
            return new h(this.f57160a, this.f57161b, this.f57162c.t(i10), this.f57163d);
        } else {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
    }

    public h s(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        } else if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByKey() instead!");
        } else if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByPriority() instead!");
        } else if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByValue() instead!");
        } else {
            m.h(str);
            H();
            l lVar = new l(str);
            if (lVar.size() != 0) {
                return new h(this.f57160a, this.f57161b, this.f57162c.w(new p(lVar)), true);
            }
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
        }
    }

    public h t() {
        H();
        Qb.h w10 = this.f57162c.w(Tb.j.j());
        I(w10);
        return new h(this.f57160a, this.f57161b, w10, true);
    }

    public h u() {
        H();
        Qb.h w10 = this.f57162c.w(q.j());
        I(w10);
        return new h(this.f57160a, this.f57161b, w10, true);
    }

    public h v() {
        H();
        return new h(this.f57160a, this.f57161b, this.f57162c.w(u.j()), true);
    }

    public void w(Gb.a aVar) {
        if (aVar != null) {
            y(new C4367a(this.f57160a, aVar, o()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }

    public void x(j jVar) {
        if (jVar != null) {
            y(new E(this.f57160a, jVar, o()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }

    public h z(double d10) {
        return A(d10, (String) null);
    }

    h(n nVar, l lVar) {
        this.f57160a = nVar;
        this.f57161b = lVar;
        this.f57162c = Qb.h.f52272i;
        this.f57163d = false;
    }
}

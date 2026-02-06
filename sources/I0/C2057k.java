package i0;

import Y.C0;
import Y.C1474c;
import androidx.collection.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: i0.k  reason: case insensitive filesystem */
public abstract class C2057k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f21728e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f21729f = 8;

    /* renamed from: a  reason: collision with root package name */
    private n f21730a;

    /* renamed from: b  reason: collision with root package name */
    private int f21731b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21732c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f21733d;

    /* renamed from: i0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void j(p pVar) {
            synchronized (p.I()) {
                p.f21760h = C6565s.H0(p.f21760h, pVar);
                C6514M m10 = C6514M.f71813a;
            }
        }

        /* access modifiers changed from: private */
        public static final void l(C6798l lVar) {
            synchronized (p.I()) {
                p.f21761i = C6565s.H0(p.f21761i, lVar);
                C6514M m10 = C6514M.f71813a;
            }
            p.B();
        }

        public final C2057k c() {
            return p.H();
        }

        public final C2057k d() {
            return (C2057k) p.f21754b.a();
        }

        public final boolean e() {
            if (p.f21754b.a() != null) {
                return true;
            }
            return false;
        }

        public final C2057k f(C2057k kVar) {
            if (kVar instanceof C2045B) {
                C2045B b10 = (C2045B) kVar;
                if (b10.U() == C1474c.a()) {
                    b10.X((C6798l) null);
                    return kVar;
                }
            }
            if (kVar instanceof C2046C) {
                C2046C c10 = (C2046C) kVar;
                if (c10.C() == C1474c.a()) {
                    c10.F((C6798l) null);
                    return kVar;
                }
            }
            C2057k E10 = p.E(kVar, (C6798l) null, false, 6, (Object) null);
            E10.l();
            return E10;
        }

        public final void g() {
            p.H().o();
        }

        public final Object h(C6798l lVar, C6798l lVar2, C6787a aVar) {
            C2057k kVar;
            C2057k l10;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            C2057k kVar2 = (C2057k) p.f21754b.a();
            C2049c cVar = null;
            if (kVar2 instanceof C2045B) {
                C2045B b10 = (C2045B) kVar2;
                if (b10.U() == C1474c.a()) {
                    C6798l H10 = b10.h();
                    C6798l k10 = b10.k();
                    try {
                        ((C2045B) kVar2).X(p.L(lVar, H10, false, 4, (Object) null));
                        ((C2045B) kVar2).Y(p.M(lVar2, k10));
                        return aVar.invoke();
                    } finally {
                        b10.X(H10);
                        b10.Y(k10);
                    }
                }
            }
            if (kVar2 == null || (kVar2 instanceof C2049c)) {
                if (kVar2 instanceof C2049c) {
                    cVar = (C2049c) kVar2;
                }
                kVar = new C2045B(cVar, lVar, lVar2, true, false);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                kVar = kVar2.x(lVar);
            }
            try {
                l10 = kVar.l();
                Object invoke = aVar.invoke();
                kVar.s(l10);
                kVar.d();
                return invoke;
            } catch (Throwable th2) {
                kVar.d();
                throw th2;
            }
        }

        public final C2052f i(p pVar) {
            Object unused = p.A(p.f21753a);
            synchronized (p.I()) {
                p.f21760h = C6565s.L0(p.f21760h, pVar);
                C6514M m10 = C6514M.f71813a;
            }
            return new C2055i(pVar);
        }

        public final C2052f k(C6798l lVar) {
            synchronized (p.I()) {
                p.f21761i = C6565s.L0(p.f21761i, lVar);
                C6514M m10 = C6514M.f71813a;
            }
            p.B();
            return new C2056j(lVar);
        }

        public final void m(C2057k kVar, C2057k kVar2, C6798l lVar) {
            if (kVar != kVar2) {
                kVar2.s(kVar);
                kVar2.d();
            } else if (kVar instanceof C2045B) {
                ((C2045B) kVar).X(lVar);
            } else if (kVar instanceof C2046C) {
                ((C2046C) kVar).F(lVar);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + kVar).toString());
            }
        }

        public final void n() {
            boolean z10;
            synchronized (p.I()) {
                L E10 = ((C2047a) p.f21762j.get()).E();
                z10 = false;
                if (E10 != null && E10.e()) {
                    z10 = true;
                }
            }
            if (z10) {
                p.B();
            }
        }

        public final C2049c o(C6798l lVar, C6798l lVar2) {
            C2049c cVar;
            C2049c Q10;
            C2057k H10 = p.H();
            if (H10 instanceof C2049c) {
                cVar = (C2049c) H10;
            } else {
                cVar = null;
            }
            if (cVar != null && (Q10 = cVar.Q(lVar, lVar2)) != null) {
                return Q10;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public final C2057k p(C6798l lVar) {
            return p.H().x(lVar);
        }

        private a() {
        }
    }

    public /* synthetic */ C2057k(int i10, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, nVar);
    }

    public final void b() {
        synchronized (p.I()) {
            c();
            r();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public void c() {
        p.f21756d = p.f21756d.t(f());
    }

    public void d() {
        this.f21732c = true;
        synchronized (p.I()) {
            q();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final boolean e() {
        return this.f21732c;
    }

    public int f() {
        return this.f21731b;
    }

    public n g() {
        return this.f21730a;
    }

    public abstract C6798l h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract C6798l k();

    public C2057k l() {
        C2057k kVar = (C2057k) p.f21754b.a();
        p.f21754b.b(this);
        return kVar;
    }

    public abstract void m(C2057k kVar);

    public abstract void n(C2057k kVar);

    public abstract void o();

    public abstract void p(x xVar);

    public final void q() {
        int i10 = this.f21733d;
        if (i10 >= 0) {
            p.Y(i10);
            this.f21733d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(C2057k kVar) {
        p.f21754b.b(kVar);
    }

    public final void t(boolean z10) {
        this.f21732c = z10;
    }

    public void u(int i10) {
        this.f21731b = i10;
    }

    public void v(n nVar) {
        this.f21730a = nVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract C2057k x(C6798l lVar);

    public final int y() {
        int i10 = this.f21733d;
        this.f21733d = -1;
        return i10;
    }

    public final void z() {
        if (this.f21732c) {
            C0.a("Cannot use a disposed snapshot");
        }
    }

    private C2057k(int i10, n nVar) {
        this.f21730a = nVar;
        this.f21731b = i10;
        this.f21733d = i10 != 0 ? p.c0(i10, g()) : -1;
    }
}

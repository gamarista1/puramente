package E;

import E.E;
import H0.S;
import Y.C1488g1;
import Y.C1505o0;
import Y.C1510r0;
import Y.o1;
import i0.C2057k;
import lf.C6514M;
import yf.C6798l;

final class C implements S, S.a, E.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1543a;

    /* renamed from: b  reason: collision with root package name */
    private final E f1544b;

    /* renamed from: c  reason: collision with root package name */
    private final C1505o0 f1545c = C1488g1.a(-1);

    /* renamed from: d  reason: collision with root package name */
    private final C1505o0 f1546d = C1488g1.a(0);

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f1547e = u1.d((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C1510r0 f1548f = u1.d((Object) null, (o1) null, 2, (Object) null);

    public C(Object obj, E e10) {
        this.f1543a = obj;
        this.f1544b = e10;
    }

    private final S.a b() {
        return (S.a) this.f1547e.getValue();
    }

    private final int d() {
        return this.f1546d.b();
    }

    private final S e() {
        return (S) this.f1548f.getValue();
    }

    private final void h(S.a aVar) {
        this.f1547e.setValue(aVar);
    }

    private final void j(int i10) {
        this.f1546d.f(i10);
    }

    private final void k(S s10) {
        this.f1548f.setValue(s10);
    }

    public S.a a() {
        S.a aVar;
        if (d() == 0) {
            this.f1544b.r(this);
            S c10 = c();
            if (c10 != null) {
                aVar = c10.a();
            } else {
                aVar = null;
            }
            h(aVar);
        }
        j(d() + 1);
        return this;
    }

    public final S c() {
        return e();
    }

    public final void f() {
        int d10 = d();
        for (int i10 = 0; i10 < d10; i10++) {
            release();
        }
    }

    public void g(int i10) {
        this.f1545c.f(i10);
    }

    public int getIndex() {
        return this.f1545c.b();
    }

    public Object getKey() {
        return this.f1543a;
    }

    public final void i(S s10) {
        C6798l lVar;
        C2057k.a aVar = C2057k.f21728e;
        C2057k d10 = aVar.d();
        S.a aVar2 = null;
        if (d10 != null) {
            lVar = d10.h();
        } else {
            lVar = null;
        }
        C2057k f10 = aVar.f(d10);
        try {
            if (s10 != e()) {
                k(s10);
                if (d() > 0) {
                    S.a b10 = b();
                    if (b10 != null) {
                        b10.release();
                    }
                    if (s10 != null) {
                        aVar2 = s10.a();
                    }
                    h(aVar2);
                }
            }
            C6514M m10 = C6514M.f71813a;
            aVar.m(d10, f10, lVar);
        } catch (Throwable th2) {
            aVar.m(d10, f10, lVar);
            throw th2;
        }
    }

    public void release() {
        if (d() > 0) {
            j(d() - 1);
            if (d() == 0) {
                this.f1544b.t(this);
                S.a b10 = b();
                if (b10 != null) {
                    b10.release();
                }
                h((S.a) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once");
    }
}

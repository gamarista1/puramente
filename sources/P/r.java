package P;

import J.E;
import P.C1295k;
import Q0.L;
import Q0.Q;
import kotlin.Lazy;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.C6534r;
import yf.C6787a;

public abstract class r {

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1294j f4923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4924b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f4925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f4926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Lazy f4927e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1294j jVar, int i10, int i11, x xVar, Lazy lazy) {
            super(0);
            this.f4923a = jVar;
            this.f4924b = i10;
            this.f4925c = i11;
            this.f4926d = xVar;
            this.f4927e = lazy;
        }

        /* renamed from: a */
        public final C1295k.a invoke() {
            boolean z10;
            C1294j jVar = this.f4923a;
            int d10 = r.m(this.f4927e);
            int i10 = this.f4924b;
            int i11 = this.f4925c;
            boolean a10 = this.f4926d.a();
            if (this.f4926d.e() == C1289e.CROSSED) {
                z10 = true;
            } else {
                z10 = false;
            }
            return r.k(jVar, d10, i10, i11, a10, z10);
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1294j f4928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4929b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1294j jVar, int i10) {
            super(0);
            this.f4928a = jVar;
            this.f4929b = i10;
        }

        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(this.f4928a.k().q(this.f4929b));
        }
    }

    /* access modifiers changed from: private */
    public static final C1295k e(x xVar, C1287c cVar) {
        boolean z10;
        if (xVar.e() == C1289e.CROSSED) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new C1295k(f(xVar.j(), z10, true, xVar.k(), cVar), f(xVar.i(), z10, false, xVar.d(), cVar), z10);
    }

    private static final C1295k.a f(C1294j jVar, boolean z10, boolean z11, int i10, C1287c cVar) {
        int i11;
        int i12;
        if (z11) {
            i11 = jVar.g();
        } else {
            i11 = jVar.e();
        }
        if (i10 != jVar.i()) {
            return jVar.a(i11);
        }
        long a10 = cVar.a(jVar, i11);
        if (z10 ^ z11) {
            i12 = Q.n(a10);
        } else {
            i12 = Q.i(a10);
        }
        return jVar.a(i12);
    }

    private static final C1295k.a g(C1295k.a aVar, C1294j jVar, int i10) {
        return C1295k.a.b(aVar, jVar.k().c(i10), i10, 0, 4, (Object) null);
    }

    public static final C1295k h(C1295k kVar, x xVar) {
        if (!y.d(kVar, xVar)) {
            return kVar;
        }
        String c10 = xVar.b().c();
        if (xVar.getSize() > 1 || xVar.h() == null || c10.length() == 0) {
            return kVar;
        }
        return i(kVar, xVar);
    }

    private static final C1295k i(C1295k kVar, x xVar) {
        boolean z10;
        int i10;
        C1294j b10 = xVar.b();
        String c10 = b10.c();
        int g10 = b10.g();
        int length = c10.length();
        if (g10 == 0) {
            int a10 = E.a(c10, 0);
            if (xVar.a()) {
                return C1295k.b(kVar, g(kVar.e(), b10, a10), (C1295k.a) null, true, 2, (Object) null);
            }
            return C1295k.b(kVar, (C1295k.a) null, g(kVar.c(), b10, a10), false, 1, (Object) null);
        } else if (g10 == length) {
            int b11 = E.b(c10, length);
            if (xVar.a()) {
                return C1295k.b(kVar, g(kVar.e(), b10, b11), (C1295k.a) null, false, 2, (Object) null);
            }
            return C1295k.b(kVar, (C1295k.a) null, g(kVar.c(), b10, b11), true, 1, (Object) null);
        } else {
            C1295k h10 = xVar.h();
            if (h10 == null || !h10.d()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (xVar.a() ^ z10) {
                i10 = E.b(c10, g10);
            } else {
                i10 = E.a(c10, g10);
            }
            if (xVar.a()) {
                return C1295k.b(kVar, g(kVar.e(), b10, i10), (C1295k.a) null, z10, 2, (Object) null);
            }
            return C1295k.b(kVar, (C1295k.a) null, g(kVar.c(), b10, i10), z10, 1, (Object) null);
        }
    }

    private static final boolean j(C1294j jVar, int i10, boolean z10) {
        boolean z11;
        if (jVar.f() == -1) {
            return true;
        }
        if (i10 == jVar.f()) {
            return false;
        }
        if (jVar.d() == C1289e.CROSSED) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 ^ z11) {
            if (i10 < jVar.f()) {
                return true;
            }
        } else if (i10 > jVar.f()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C1295k.a k(C1294j jVar, int i10, int i11, int i12, boolean z10, boolean z11) {
        int i13;
        int i14;
        long C10 = jVar.k().C(i11);
        if (jVar.k().q(Q.n(C10)) == i10) {
            i13 = Q.n(C10);
        } else if (i10 >= jVar.k().n()) {
            i13 = jVar.k().u(jVar.k().n() - 1);
        } else {
            i13 = jVar.k().u(i10);
        }
        if (jVar.k().q(Q.i(C10)) == i10) {
            i14 = Q.i(C10);
        } else if (i10 >= jVar.k().n()) {
            i14 = L.p(jVar.k(), jVar.k().n() - 1, false, 2, (Object) null);
        } else {
            i14 = L.p(jVar.k(), i10, false, 2, (Object) null);
        }
        if (i13 == i12) {
            return jVar.a(i14);
        }
        if (i14 == i12) {
            return jVar.a(i13);
        }
        if (!(z10 ^ z11) ? i11 >= i13 : i11 > i14) {
            i13 = i14;
        }
        return jVar.a(i13);
    }

    /* access modifiers changed from: private */
    public static final C1295k.a l(x xVar, C1294j jVar, C1295k.a aVar) {
        int i10;
        int i11;
        int g10;
        if (xVar.a()) {
            i10 = jVar.g();
        } else {
            i10 = jVar.e();
        }
        if (xVar.a()) {
            i11 = xVar.k();
        } else {
            i11 = xVar.d();
        }
        if (i11 != jVar.i()) {
            return jVar.a(i10);
        }
        C6534r rVar = C6534r.NONE;
        Lazy a10 = C6531o.a(rVar, new b(jVar, i10));
        if (xVar.a()) {
            g10 = jVar.e();
        } else {
            g10 = jVar.g();
        }
        Lazy a11 = C6531o.a(rVar, new a(jVar, i10, g10, xVar, a10));
        if (jVar.h() != aVar.d()) {
            return n(a11);
        }
        int f10 = jVar.f();
        if (i10 == f10) {
            return aVar;
        }
        if (m(a10) != jVar.k().q(f10)) {
            return n(a11);
        }
        int c10 = aVar.c();
        long C10 = jVar.k().C(c10);
        if (!j(jVar, i10, xVar.a())) {
            return jVar.a(i10);
        }
        if (c10 == Q.n(C10) || c10 == Q.i(C10)) {
            return n(a11);
        }
        return jVar.a(i10);
    }

    /* access modifiers changed from: private */
    public static final int m(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    private static final C1295k.a n(Lazy lazy) {
        return (C1295k.a) lazy.getValue();
    }
}

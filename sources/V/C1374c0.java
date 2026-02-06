package V;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.I;
import C.N;
import C.W;
import C.Y;
import C.Z;
import H0.F;
import J0.C1241g;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.J0;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.A0;
import c1.h;
import g0.C2005a;
import k0.i;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import w.C2760D;
import w.C2762F;
import w.C2763G;
import w.C2777V;
import w.C2798j;
import w.n0;
import w.o0;
import w.q0;
import w.r0;
import w.t0;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: V.c0  reason: case insensitive filesystem */
public abstract class C1374c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7299a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f7300b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f7301c = h.j((float) 12);

    /* renamed from: d  reason: collision with root package name */
    private static final float f7302d = h.j((float) 8);

    /* renamed from: e  reason: collision with root package name */
    private static final float f7303e = h.j((float) 112);

    /* renamed from: f  reason: collision with root package name */
    private static final float f7304f = h.j((float) 280);

    /* renamed from: V.c0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f7305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2777V f7306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f7307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f7308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f7309e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C2777V v10, C1510r0 r0Var, A1 a12, A1 a13) {
            super(1);
            this.f7305a = z10;
            this.f7306b = v10;
            this.f7307c = r0Var;
            this.f7308d = a12;
            this.f7309e = a13;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float f10;
            float f11 = 0.8f;
            float f12 = 1.0f;
            if (!this.f7305a) {
                f10 = C1374c0.b(this.f7308d);
            } else if (((Boolean) this.f7306b.b()).booleanValue()) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            cVar.h(f10);
            if (!this.f7305a) {
                f11 = C1374c0.b(this.f7308d);
            } else if (((Boolean) this.f7306b.b()).booleanValue()) {
                f11 = 1.0f;
            }
            cVar.m(f11);
            if (!this.f7305a) {
                f12 = C1374c0.c(this.f7309e);
            } else if (!((Boolean) this.f7306b.b()).booleanValue()) {
                f12 = 0.0f;
            }
            cVar.c(f12);
            cVar.F0(((androidx.compose.ui.graphics.f) this.f7307c.getValue()).j());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.c0$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f7311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f7312c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, o oVar, q qVar) {
            super(2);
            this.f7310a = iVar;
            this.f7311b = oVar;
            this.f7312c = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1573559053, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
                }
                i d10 = m.d(androidx.compose.foundation.layout.i.b(n.k(this.f7310a, 0.0f, C1374c0.i(), 1, (Object) null), I.Max), this.f7311b, false, (z.n) null, false, 14, (Object) null);
                q qVar = this.f7312c;
                F a10 = C1090h.a(C1085c.f882a.g(), k0.c.f23044a.k(), mVar, 0);
                int a11 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                i e10 = k0.h.e(mVar, d10);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a12 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a12);
                } else {
                    mVar.q();
                }
                C1500m a13 = F1.a(mVar);
                F1.b(a13, a10, aVar.c());
                F1.b(a13, p10, aVar.e());
                p b10 = aVar.b();
                if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                    a13.r(Integer.valueOf(a11));
                    a13.V(Integer.valueOf(a11), b10);
                }
                F1.b(a13, e10, aVar.d());
                qVar.invoke(C1093k.f978a, mVar, 6);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.c0$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2777V f7314b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f7315c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f7316d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g2 f7317e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7318f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7319g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7320h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C2868g f7321i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q f7322j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7323k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, C2777V v10, C1510r0 r0Var, o oVar, g2 g2Var, long j10, float f10, float f11, C2868g gVar, q qVar, int i10) {
            super(2);
            this.f7313a = iVar;
            this.f7314b = v10;
            this.f7315c = r0Var;
            this.f7316d = oVar;
            this.f7317e = g2Var;
            this.f7318f = j10;
            this.f7319g = f10;
            this.f7320h = f11;
            this.f7321i = gVar;
            this.f7322j = qVar;
            this.f7323k = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1374c0.a(this.f7313a, this.f7314b, this.f7315c, this.f7316d, this.f7317e, this.f7318f, this.f7319g, this.f7320h, this.f7321i, this.f7322j, mVar, M0.a(this.f7323k | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.c0$d */
    static final class d extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7324a = new d();

        d() {
            super(3);
        }

        public final C2763G a(n0.b bVar, C1500m mVar, int i10) {
            q0 q0Var;
            mVar.T(-1355418157);
            if (C1506p.H()) {
                C1506p.Q(-1355418157, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
            }
            if (bVar.g(Boolean.FALSE, Boolean.TRUE)) {
                q0Var = C2798j.j(30, 0, (C2760D) null, 6, (Object) null);
            } else {
                q0Var = C2798j.j(75, 0, (C2760D) null, 6, (Object) null);
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return q0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((n0.b) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: V.c0$e */
    static final class e extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7325a = new e();

        e() {
            super(3);
        }

        public final C2763G a(n0.b bVar, C1500m mVar, int i10) {
            q0 q0Var;
            mVar.T(1033023423);
            if (C1506p.H()) {
                C1506p.Q(1033023423, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            if (bVar.g(Boolean.FALSE, Boolean.TRUE)) {
                q0Var = C2798j.j(120, 0, C2762F.f(), 2, (Object) null);
            } else {
                q0Var = C2798j.j(1, 74, (C2760D) null, 4, (Object) null);
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return q0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((n0.b) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: V.c0$f */
    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1372b0 f7327b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7328c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7329d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y f7330e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f7331f;

        /* renamed from: V.c0$f$a */
        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f7332a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(2);
                this.f7332a = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(2035552199, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                    }
                    i b10 = androidx.compose.foundation.layout.q.b(i.f23074a, X.p.f9291a.i(), 0.0f, 2, (Object) null);
                    p pVar = this.f7332a;
                    F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar, b10);
                    C1241g.a aVar = C1241g.f3853J;
                    C6787a a11 = aVar.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h10, aVar.c());
                    F1.b(a12, p10, aVar.e());
                    p b11 = aVar.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.c0$f$b */
        static final class b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Y f7333a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f7334b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p f7335c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p f7336d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Y y10, p pVar, p pVar2, p pVar3) {
                super(2);
                this.f7333a = y10;
                this.f7334b = pVar;
                this.f7335c = pVar2;
                this.f7336d = pVar3;
            }

            public final void a(C1500m mVar, int i10) {
                float j10;
                float j11;
                C1500m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-1728894036, i11, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                    }
                    i b10 = Y.b(this.f7333a, i.f23074a, 1.0f, false, 2, (Object) null);
                    if (this.f7334b != null) {
                        j10 = C1374c0.f7301c;
                    } else {
                        j10 = h.j((float) 0);
                    }
                    float f10 = j10;
                    if (this.f7335c != null) {
                        j11 = C1374c0.f7301c;
                    } else {
                        j11 = h.j((float) 0);
                    }
                    i m10 = n.m(b10, f10, 0.0f, j11, 0.0f, 10, (Object) null);
                    p pVar = this.f7336d;
                    F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                    int a10 = C1494j.a(mVar2, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar2, m10);
                    C1241g.a aVar = C1241g.f3853J;
                    C6787a a11 = aVar.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar2.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h10, aVar.c());
                    F1.b(a12, p10, aVar.e());
                    p b11 = aVar.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar2, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.c0$f$c */
        static final class c extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f7337a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(p pVar) {
                super(2);
                this.f7337a = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(580312062, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                    }
                    i b10 = androidx.compose.foundation.layout.q.b(i.f23074a, X.p.f9291a.k(), 0.0f, 2, (Object) null);
                    p pVar = this.f7337a;
                    F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar, b10);
                    C1241g.a aVar = C1241g.f3853J;
                    C6787a a11 = aVar.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a11);
                    } else {
                        mVar.q();
                    }
                    C1500m a12 = F1.a(mVar);
                    F1.b(a12, h10, aVar.c());
                    F1.b(a12, p10, aVar.e());
                    p b11 = aVar.b();
                    if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                        a12.r(Integer.valueOf(a10));
                        a12.V(Integer.valueOf(a10), b11);
                    }
                    F1.b(a12, e10, aVar.d());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                    pVar.invoke(mVar, 0);
                    mVar.u();
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar, C1372b0 b0Var, boolean z10, p pVar2, Y y10, p pVar3) {
            super(2);
            this.f7326a = pVar;
            this.f7327b = b0Var;
            this.f7328c = z10;
            this.f7329d = pVar2;
            this.f7330e = y10;
            this.f7331f = pVar3;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1065051884, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
                }
                mVar.T(1264683960);
                if (this.f7326a != null) {
                    C1521x.a(A.a().d(C2544x0.k(this.f7327b.a(this.f7328c))), g0.c.e(2035552199, true, new a(this.f7326a), mVar, 54), mVar, J0.f9784i | 48);
                }
                mVar.M();
                J0 d10 = A.a().d(C2544x0.k(this.f7327b.b(this.f7328c)));
                C2005a e10 = g0.c.e(-1728894036, true, new b(this.f7330e, this.f7326a, this.f7329d, this.f7331f), mVar, 54);
                int i11 = J0.f9784i;
                C1521x.a(d10, e10, mVar, i11 | 48);
                if (this.f7329d != null) {
                    C1521x.a(A.a().d(C2544x0.k(this.f7327b.c(this.f7328c))), g0.c.e(580312062, true, new c(this.f7329d), mVar, 54), mVar, i11 | 48);
                }
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.c0$g */
    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7341d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7342e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7343f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1372b0 f7344g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ N f7345h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f7346i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f7347j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p pVar, C6787a aVar, i iVar, p pVar2, p pVar3, boolean z10, C1372b0 b0Var, N n10, l lVar, int i10) {
            super(2);
            this.f7338a = pVar;
            this.f7339b = aVar;
            this.f7340c = iVar;
            this.f7341d = pVar2;
            this.f7342e = pVar3;
            this.f7343f = z10;
            this.f7344g = b0Var;
            this.f7345h = n10;
            this.f7346i = lVar;
            this.f7347j = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1374c0.d(this.f7338a, this.f7339b, this.f7340c, this.f7341d, this.f7342e, this.f7343f, this.f7344g, this.f7345h, this.f7346i, mVar, M0.a(this.f7347j | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static {
        float f10 = (float) 48;
        f7299a = h.j(f10);
        f7300b = h.j(f10);
    }

    public static final void a(i iVar, C2777V v10, C1510r0 r0Var, o oVar, g2 g2Var, long j10, float f10, float f11, C2868g gVar, q qVar, C1500m mVar, int i10) {
        int i11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21;
        int i22;
        i iVar2 = iVar;
        C2777V v11 = v10;
        o oVar2 = oVar;
        q qVar2 = qVar;
        int i23 = i10;
        C1500m h10 = mVar.h(-151448888);
        if ((i23 & 6) == 0) {
            if (h10.S(iVar2)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i11 = i22 | i23;
        } else {
            i11 = i23;
        }
        if ((i23 & 48) == 0) {
            if ((i23 & 64) == 0) {
                z11 = h10.S(v11);
            } else {
                z11 = h10.C(v11);
            }
            if (z11) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i11 |= i21;
        }
        C1510r0 r0Var2 = r0Var;
        if ((i23 & 384) == 0) {
            if (h10.S(r0Var2)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i11 |= i20;
        }
        if ((i23 & 3072) == 0) {
            if (h10.S(oVar2)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i11 |= i19;
        }
        g2 g2Var2 = g2Var;
        if ((i23 & 24576) == 0) {
            if (h10.S(g2Var2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i11 |= i18;
        }
        long j11 = j10;
        if ((196608 & i23) == 0) {
            if (h10.e(j11)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i11 |= i17;
        }
        if ((1572864 & i23) == 0) {
            if (h10.c(f10)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i11 |= i16;
        } else {
            float f16 = f10;
        }
        if ((i23 & 12582912) == 0) {
            if (h10.c(f11)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i11 |= i15;
        } else {
            float f17 = f11;
        }
        C2868g gVar2 = gVar;
        if ((i23 & 100663296) == 0) {
            if (h10.S(gVar2)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i11 |= i14;
        }
        if ((i23 & 805306368) == 0) {
            if (h10.C(qVar2)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        if ((i11 & 306783379) != 306783378 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-151448888, i11, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            n0 h11 = o0.h(v11, "DropDownMenu", h10, C2777V.f27247d | 48 | ((i11 >> 3) & 14), 0);
            e eVar = e.f7325a;
            C6490l lVar = C6490l.f71789a;
            r0 f18 = t0.f(lVar);
            boolean booleanValue = ((Boolean) h11.i()).booleanValue();
            h10.T(2139028452);
            if (C1506p.H()) {
                C1506p.Q(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            if (booleanValue) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            h10.M();
            Float valueOf = Float.valueOf(f12);
            boolean booleanValue2 = ((Boolean) h11.p()).booleanValue();
            h10.T(2139028452);
            if (C1506p.H()) {
                C1506p.Q(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            if (booleanValue2) {
                f13 = 1.0f;
            } else {
                f13 = 0.8f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            h10.M();
            A1 d10 = o0.d(h11, valueOf, Float.valueOf(f13), (C2763G) eVar.invoke(h11.n(), h10, 0), f18, "FloatAnimation", h10, 0);
            d dVar = d.f7324a;
            r0 f19 = t0.f(lVar);
            boolean booleanValue3 = ((Boolean) h11.i()).booleanValue();
            h10.T(-249413128);
            if (C1506p.H()) {
                C1506p.Q(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            if (booleanValue3) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            h10.M();
            Float valueOf2 = Float.valueOf(f14);
            boolean booleanValue4 = ((Boolean) h11.p()).booleanValue();
            h10.T(-249413128);
            if (C1506p.H()) {
                C1506p.Q(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            if (booleanValue4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            h10.M();
            Float valueOf3 = Float.valueOf(f15);
            boolean z12 = false;
            A1 d11 = o0.d(h11, valueOf2, valueOf3, (C2763G) dVar.invoke(h11.n(), h10, 0), f19, "FloatAnimation", h10, 0);
            boolean booleanValue5 = ((Boolean) h10.m(A0.a())).booleanValue();
            i.a aVar = i.f23074a;
            boolean b10 = h10.b(booleanValue5) | h10.S(d10);
            if ((i11 & 112) == 32 || ((i11 & 64) != 0 && h10.C(v11))) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean S10 = b10 | z10 | h10.S(d11);
            if ((i11 & 896) == 256) {
                z12 = true;
            }
            boolean z13 = S10 | z12;
            Object A10 = h10.A();
            if (z13 || A10 == C1500m.f10026a.a()) {
                i12 = i11;
                a aVar2 = new a(booleanValue5, v10, r0Var, d10, d11);
                h10.r(aVar2);
                A10 = aVar2;
            } else {
                i12 = i11;
            }
            int i24 = i12 >> 9;
            int i25 = i12 >> 6;
            O0.a(androidx.compose.ui.graphics.b.a(aVar, (C6798l) A10), g2Var, j10, 0, f10, f11, gVar, g0.c.e(1573559053, true, new b(iVar2, oVar2, qVar2), h10, 54), h10, (i24 & 896) | (i24 & 112) | 12582912 | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 8);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(iVar, v10, r0Var, oVar, g2Var, j10, f10, f11, gVar, qVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float b(A1 a12) {
        return ((Number) a12.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final float c(A1 a12) {
        return ((Number) a12.getValue()).floatValue();
    }

    public static final void d(p pVar, C6787a aVar, i iVar, p pVar2, p pVar3, boolean z10, C1372b0 b0Var, N n10, l lVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        N n11 = n10;
        int i21 = i10;
        C1500m h10 = mVar.h(-1564716777);
        p pVar4 = pVar;
        if ((i21 & 6) == 0) {
            if (h10.C(pVar4)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i21;
        } else {
            i11 = i21;
        }
        C6787a aVar2 = aVar;
        if ((i21 & 48) == 0) {
            if (h10.C(aVar2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        i iVar2 = iVar;
        if ((i21 & 384) == 0) {
            if (h10.S(iVar2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        p pVar5 = pVar2;
        if ((i21 & 3072) == 0) {
            if (h10.C(pVar5)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i11 |= i17;
        }
        p pVar6 = pVar3;
        if ((i21 & 24576) == 0) {
            if (h10.C(pVar6)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i11 |= i16;
        }
        boolean z11 = z10;
        if ((196608 & i21) == 0) {
            if (h10.b(z11)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        }
        C1372b0 b0Var2 = b0Var;
        if ((1572864 & i21) == 0) {
            if (h10.S(b0Var2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((12582912 & i21) == 0) {
            if (h10.S(n11)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        }
        l lVar2 = lVar;
        if ((100663296 & i21) == 0) {
            if (h10.S(lVar2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((38347923 & i11) != 38347922 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1564716777, i11, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            i h11 = n.h(androidx.compose.foundation.layout.q.q(androidx.compose.foundation.layout.q.h(androidx.compose.foundation.d.b(iVar, lVar, C1409u0.d(true, 0.0f, 0, h10, 6, 6), z10, (String) null, (O0.g) null, aVar, 24, (Object) null), 0.0f, 1, (Object) null), f7303e, f7300b, f7304f, 0.0f, 8, (Object) null), n11);
            F b10 = W.b(C1085c.f882a.f(), k0.c.f23044a.i(), h10, 48);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, h11);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, b10, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            p b11 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar3.d());
            T0.a(X.f7146a.c(h10, 6).l(), g0.c.e(1065051884, true, new f(pVar2, b0Var, z10, pVar3, Z.f873a, pVar), h10, 54), h10, 48);
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(pVar, aVar, iVar, pVar2, pVar3, z10, b0Var, n10, lVar, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long h(c1.p r5, c1.p r6) {
        /*
            int r0 = r6.g()
            int r1 = r5.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x000f
        L_0x000d:
            r0 = r3
            goto L_0x0049
        L_0x000f:
            int r0 = r6.h()
            int r1 = r5.g()
            if (r0 > r1) goto L_0x001b
            r0 = r2
            goto L_0x0049
        L_0x001b:
            int r0 = r6.k()
            if (r0 != 0) goto L_0x0022
            goto L_0x000d
        L_0x0022:
            int r0 = r5.g()
            int r1 = r6.g()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.h()
            int r4 = r6.h()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.g()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.k()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0049:
            int r1 = r6.i()
            int r4 = r5.d()
            if (r1 < r4) goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x008f
        L_0x0055:
            int r1 = r6.d()
            int r4 = r5.i()
            if (r1 > r4) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            int r1 = r6.f()
            if (r1 != 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            int r1 = r5.i()
            int r2 = r6.i()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.d()
            int r2 = r6.d()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.i()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.f()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x008f:
            long r5 = r0.n2.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1374c0.h(c1.p, c1.p):long");
    }

    public static final float i() {
        return f7302d;
    }

    public static final float j() {
        return f7299a;
    }
}

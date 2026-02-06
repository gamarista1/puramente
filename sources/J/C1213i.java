package J;

import D0.J;
import H0.C1181b;
import H0.C1194o;
import H0.C1197s;
import H0.F;
import H0.U;
import J0.C1241g;
import M.q0;
import P.C1293i;
import P.D;
import P.G;
import P.H;
import Q0.C1321d;
import Q0.S;
import Ug.C5600w0;
import Ug.K;
import W0.C1433a;
import W0.C1438f;
import W0.C1446n;
import W0.C1450s;
import W0.C1456y;
import W0.I;
import W0.Q;
import W0.T;
import W0.Z;
import W0.a0;
import W0.c0;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.L;
import Y.M;
import Y.M0;
import Y.Y0;
import Y.p1;
import android.view.KeyEvent;
import androidx.compose.ui.platform.C1651m1;
import androidx.compose.ui.platform.D1;
import i0.C2057k;
import java.util.List;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.w;
import lf.z;
import mf.C6565s;
import mf.O;
import q0.C2421g;
import q0.C2423i;
import qf.C6658d;
import r0.C2514n0;
import r0.C2520p0;
import rf.C6680b;
import t0.C2605f;
import yf.C6787a;
import yf.C6798l;
import z.C2938B;

/* renamed from: J.i  reason: case insensitive filesystem */
public abstract class C1213i {

    /* renamed from: J.i$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f3183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1228y f3184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1 f3185c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f3186d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G f3187e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1450s f3188f;

        /* renamed from: J.i$b$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f3189a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(0);
                this.f3189a = a12;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(C1213i.b(this.f3189a));
            }
        }

        /* renamed from: J.i$b$b  reason: collision with other inner class name */
        static final class C0071b implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3190a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ T f3191b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ G f3192c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1450s f3193d;

            C0071b(C1228y yVar, T t10, G g10, C1450s sVar) {
                this.f3190a = yVar;
                this.f3191b = t10;
                this.f3192c = g10;
                this.f3193d = sVar;
            }

            public final Object a(boolean z10, C6658d dVar) {
                if (!z10 || !this.f3190a.e()) {
                    C1213i.n(this.f3190a);
                } else {
                    C1213i.q(this.f3191b, this.f3190a, this.f3192c.O(), this.f3193d, this.f3192c.J());
                }
                return C6514M.f71813a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1228y yVar, A1 a12, T t10, G g10, C1450s sVar, C6658d dVar) {
            super(2, dVar);
            this.f3184b = yVar;
            this.f3185c = a12;
            this.f3186d = t10;
            this.f3187e = g10;
            this.f3188f = sVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f3184b, this.f3185c, this.f3186d, this.f3187e, this.f3188f, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f3183a;
            if (i10 == 0) {
                w.b(obj);
                C5694f p10 = p1.p(new a(this.f3185c));
                C0071b bVar = new C0071b(this.f3184b, this.f3186d, this.f3187e, this.f3188f);
                this.f3183a = 1;
                if (p10.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Throwable th2) {
                    C1213i.n(this.f3184b);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1213i.n(this.f3184b);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3194a;

        /* renamed from: J.i$c$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f3195a;

            public a(G g10) {
                this.f3195a = g10;
            }

            public void dispose() {
                this.f3195a.R();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(G g10) {
            super(1);
            this.f3194a = g10;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f3194a);
        }
    }

    /* renamed from: J.i$f */
    static final class f extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f3254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f3255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f3256c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q0.T f3257d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0 f3258e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f3259f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ B.l f3260g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C2514n0 f3261h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f3262i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f3263j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f3264k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C1450s f3265l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C1226w f3266m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f3267n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f3268o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ yf.q f3269p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f3270q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f3271r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f3272s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Q q10, C6798l lVar, i iVar, Q0.T t10, c0 c0Var, C6798l lVar2, B.l lVar3, C2514n0 n0Var, boolean z10, int i10, int i11, C1450s sVar, C1226w wVar, boolean z11, boolean z12, yf.q qVar, int i12, int i13, int i14) {
            super(2);
            this.f3254a = q10;
            this.f3255b = lVar;
            this.f3256c = iVar;
            this.f3257d = t10;
            this.f3258e = c0Var;
            this.f3259f = lVar2;
            this.f3260g = lVar3;
            this.f3261h = n0Var;
            this.f3262i = z10;
            this.f3263j = i10;
            this.f3264k = i11;
            this.f3265l = sVar;
            this.f3266m = wVar;
            this.f3267n = z11;
            this.f3268o = z12;
            this.f3269p = qVar;
            this.f3270q = i12;
            this.f3271r = i13;
            this.f3272s = i14;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            Q q10 = this.f3254a;
            Q q11 = q10;
            C1213i.a(q11, this.f3255b, this.f3256c, this.f3257d, this.f3258e, this.f3259f, this.f3260g, this.f3261h, this.f3262i, this.f3263j, this.f3264k, this.f3265l, this.f3266m, this.f3267n, this.f3268o, this.f3269p, mVar2, M0.a(this.f3270q | 1), M0.a(this.f3271r), this.f3272s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$g */
    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3273a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C1228y yVar) {
            super(1);
            this.f3273a = yVar;
        }

        public final void a(C1197s sVar) {
            a0 j10 = this.f3273a.j();
            if (j10 != null) {
                j10.h(sVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$h */
    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f3275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ I f3276c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C1228y yVar, Q q10, I i10) {
            super(1);
            this.f3274a = yVar;
            this.f3275b = q10;
            this.f3276c = i10;
        }

        public final void a(C2605f fVar) {
            a0 j10 = this.f3274a.j();
            if (j10 != null) {
                Q q10 = this.f3275b;
                C1228y yVar = this.f3274a;
                I i10 = this.f3276c;
                C2520p0 f10 = fVar.w1().f();
                M.f2895a.b(f10, q10, yVar.q(), yVar.c(), i10, j10.f(), yVar.f(), yVar.p());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$i  reason: collision with other inner class name */
    static final class C0075i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f3278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f3280d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f3281e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1450s f3282f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ I f3283g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ G f3284h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ K f3285i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ H.b f3286j;

        /* renamed from: J.i$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f3287a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ H.b f3288b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f3289c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1228y f3290d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a0 f3291e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ I f3292f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(H.b bVar, Q q10, C1228y yVar, a0 a0Var, I i10, C6658d dVar) {
                super(2, dVar);
                this.f3288b = bVar;
                this.f3289c = q10;
                this.f3290d = yVar;
                this.f3291e = a0Var;
                this.f3292f = i10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f3288b, this.f3289c, this.f3290d, this.f3291e, this.f3292f, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f3287a;
                if (i10 == 0) {
                    w.b(obj);
                    H.b bVar = this.f3288b;
                    Q q10 = this.f3289c;
                    I v10 = this.f3290d.v();
                    Q0.L f11 = this.f3291e.f();
                    I i11 = this.f3292f;
                    this.f3287a = 1;
                    if (C1213i.m(bVar, q10, v10, f11, i11, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0075i(C1228y yVar, boolean z10, boolean z11, T t10, Q q10, C1450s sVar, I i10, G g10, K k10, H.b bVar) {
            super(1);
            this.f3277a = yVar;
            this.f3278b = z10;
            this.f3279c = z11;
            this.f3280d = t10;
            this.f3281e = q10;
            this.f3282f = sVar;
            this.f3283g = i10;
            this.f3284h = g10;
            this.f3285i = k10;
            this.f3286j = bVar;
        }

        public final void a(p0.l lVar) {
            a0 j10;
            if (this.f3277a.e() != lVar.a()) {
                this.f3277a.C(lVar.a());
                if (!this.f3277a.e() || !this.f3278b || this.f3279c) {
                    C1213i.n(this.f3277a);
                } else {
                    C1213i.q(this.f3280d, this.f3277a, this.f3281e, this.f3282f, this.f3283g);
                }
                if (lVar.a() && (j10 = this.f3277a.j()) != null) {
                    C5600w0 unused = C5576k.d(this.f3285i, (qf.g) null, (Ug.M) null, new a(this.f3286j, this.f3281e, this.f3277a, j10, this.f3283g, (C6658d) null), 3, (Object) null);
                }
                if (!lVar.a()) {
                    G.u(this.f3284h, (C2421g) null, 1, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p0.l) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$j */
    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f3294b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ D1 f3295c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G f3296d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f3297e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f3298f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C1228y yVar, boolean z10, D1 d12, G g10, Q q10, I i10) {
            super(1);
            this.f3293a = yVar;
            this.f3294b = z10;
            this.f3295c = d12;
            this.f3296d = g10;
            this.f3297e = q10;
            this.f3298f = i10;
        }

        public final void a(C1197s sVar) {
            this.f3293a.F(sVar);
            a0 j10 = this.f3293a.j();
            if (j10 != null) {
                j10.i(sVar);
            }
            if (this.f3294b) {
                if (this.f3293a.d() == C1217m.Selection) {
                    if (!this.f3293a.s() || !this.f3295c.a()) {
                        this.f3296d.R();
                    } else {
                        this.f3296d.l0();
                    }
                    this.f3293a.M(H.c(this.f3296d, true));
                    this.f3293a.L(H.c(this.f3296d, false));
                    this.f3293a.J(Q0.Q.h(this.f3297e.g()));
                } else if (this.f3293a.d() == C1217m.Cursor) {
                    this.f3293a.J(H.c(this.f3296d, true));
                }
                C1213i.o(this.f3293a, this.f3297e, this.f3298f);
                a0 j11 = this.f3293a.j();
                if (j11 != null) {
                    C1228y yVar = this.f3293a;
                    Q q10 = this.f3297e;
                    I i10 = this.f3298f;
                    Z g10 = yVar.g();
                    if (g10 != null && yVar.e()) {
                        M.f2895a.k(g10, q10, i10, j11);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$k */
    static final class k extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3299a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C1228y yVar) {
            super(1);
            this.f3299a = yVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C6514M.f71813a;
        }

        public final void invoke(boolean z10) {
            this.f3299a.D(z10);
        }
    }

    /* renamed from: J.i$l */
    static final class l extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f3301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3302c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3303d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G f3304e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f3305f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C1228y yVar, androidx.compose.ui.focus.o oVar, boolean z10, boolean z11, G g10, I i10) {
            super(1);
            this.f3300a = yVar;
            this.f3301b = oVar;
            this.f3302c = z10;
            this.f3303d = z11;
            this.f3304e = g10;
            this.f3305f = i10;
        }

        public final void a(long j10) {
            C1213i.r(this.f3300a, this.f3301b, !this.f3302c);
            if (this.f3300a.e() && this.f3303d) {
                if (this.f3300a.d() != C1217m.Selection) {
                    a0 j11 = this.f3300a.j();
                    if (j11 != null) {
                        C1228y yVar = this.f3300a;
                        long j12 = j10;
                        M.f2895a.j(j12, j11, yVar.n(), this.f3305f, yVar.m());
                        if (yVar.v().k().length() > 0) {
                            yVar.B(C1217m.Cursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f3304e.t(C2421g.d(j10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$m */
    static final class m extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.q f3306a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(z.q qVar) {
            super(0);
            this.f3306a = qVar;
        }

        /* renamed from: a */
        public final W invoke() {
            return new W(this.f3306a, 0.0f, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: J.i$n */
    static final class n extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f3307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f3308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3309c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3310d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3311e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1450s f3312f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1228y f3313g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ I f3314h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ G f3315i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f3316j;

        /* renamed from: J.i$n$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f3317a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(G g10) {
                super(0);
                this.f3317a = g10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                this.f3317a.T();
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3318a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C1228y yVar) {
                super(1);
                this.f3318a = yVar;
            }

            /* renamed from: a */
            public final Boolean invoke(List list) {
                boolean z10;
                if (this.f3318a.j() != null) {
                    a0 j10 = this.f3318a.j();
                    C6496s.e(j10);
                    list.add(j10.f());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* renamed from: J.i$n$c */
        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3319a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ O0.v f3320b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C1228y yVar, O0.v vVar) {
                super(1);
                this.f3319a = yVar;
                this.f3320b = vVar;
            }

            /* renamed from: a */
            public final Boolean invoke(C1321d dVar) {
                C6514M m10;
                Z g10 = this.f3319a.g();
                if (g10 != null) {
                    C1228y yVar = this.f3319a;
                    M.f2895a.g(C6565s.q(new C1438f(), new C1433a(dVar, 1)), yVar.n(), yVar.m(), g10);
                    m10 = C6514M.f71813a;
                } else {
                    m10 = null;
                }
                if (m10 == null) {
                    this.f3319a.m().invoke(new Q(dVar.j(), S.a(dVar.j().length()), (Q0.Q) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$d */
        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f3321a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f3322b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1228y f3323c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O0.v f3324d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Q f3325e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(boolean z10, boolean z11, C1228y yVar, O0.v vVar, Q q10) {
                super(1);
                this.f3321a = z10;
                this.f3322b = z11;
                this.f3323c = yVar;
                this.f3324d = vVar;
                this.f3325e = q10;
            }

            /* renamed from: a */
            public final Boolean invoke(C1321d dVar) {
                C6514M m10;
                if (this.f3321a || !this.f3322b) {
                    return Boolean.FALSE;
                }
                Z g10 = this.f3323c.g();
                if (g10 != null) {
                    C1228y yVar = this.f3323c;
                    M.f2895a.g(C6565s.q(new C1446n(), new C1433a(dVar, 1)), yVar.n(), yVar.m(), g10);
                    m10 = C6514M.f71813a;
                } else {
                    m10 = null;
                }
                if (m10 == null) {
                    Q q10 = this.f3325e;
                    this.f3323c.m().invoke(new Q(Sg.p.z0(q10.h(), Q0.Q.n(q10.g()), Q0.Q.i(q10.g()), dVar).toString(), S.a(Q0.Q.n(q10.g()) + dVar.length()), (Q0.Q) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$e */
        static final class e extends C6498u implements yf.q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ I f3326a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f3327b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f3328c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G f3329d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C1228y f3330e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(I i10, boolean z10, Q q10, G g10, C1228y yVar) {
                super(3);
                this.f3326a = i10;
                this.f3327b = z10;
                this.f3328c = q10;
                this.f3329d = g10;
                this.f3330e = yVar;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = this.f3326a.a(i10);
                }
                if (!z10) {
                    i11 = this.f3326a.a(i11);
                }
                boolean z11 = false;
                if (this.f3327b && !(i10 == Q0.Q.n(this.f3328c.g()) && i11 == Q0.Q.i(this.f3328c.g()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > this.f3328c.e().length()) {
                        this.f3329d.x();
                    } else {
                        if (z10 || i10 == i11) {
                            this.f3329d.x();
                        } else {
                            G.w(this.f3329d, false, 1, (Object) null);
                        }
                        this.f3330e.m().invoke(new Q(this.f3328c.e(), S.b(i10, i11), (Q0.Q) null, 4, (DefaultConstructorMarker) null));
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }

        /* renamed from: J.i$n$f */
        static final class f extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3331a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1450s f3332b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(C1228y yVar, C1450s sVar) {
                super(0);
                this.f3331a = yVar;
                this.f3332b = sVar;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                this.f3331a.l().invoke(W0.r.j(this.f3332b.e()));
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$g */
        static final class g extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3333a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f3334b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f3335c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(C1228y yVar, androidx.compose.ui.focus.o oVar, boolean z10) {
                super(0);
                this.f3333a = yVar;
                this.f3334b = oVar;
                this.f3335c = z10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                C1213i.r(this.f3333a, this.f3334b, !this.f3335c);
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$h */
        static final class h extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f3336a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(G g10) {
                super(0);
                this.f3336a = g10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                G.w(this.f3336a, false, 1, (Object) null);
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$i  reason: collision with other inner class name */
        static final class C0076i extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f3337a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0076i(G g10) {
                super(0);
                this.f3337a = g10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                G.p(this.f3337a, false, 1, (Object) null);
                return Boolean.TRUE;
            }
        }

        /* renamed from: J.i$n$j */
        static final class j extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G f3338a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(G g10) {
                super(0);
                this.f3338a = g10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                this.f3338a.s();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a0 a0Var, Q q10, boolean z10, boolean z11, boolean z12, C1450s sVar, C1228y yVar, I i10, G g10, androidx.compose.ui.focus.o oVar) {
            super(1);
            this.f3307a = a0Var;
            this.f3308b = q10;
            this.f3309c = z10;
            this.f3310d = z11;
            this.f3311e = z12;
            this.f3312f = sVar;
            this.f3313g = yVar;
            this.f3314h = i10;
            this.f3315i = g10;
            this.f3316j = oVar;
        }

        public final void a(O0.v vVar) {
            boolean z10;
            O0.v vVar2 = vVar;
            O0.t.a0(vVar2, this.f3307a.b());
            O0.t.p0(vVar2, this.f3308b.g());
            if (!this.f3309c) {
                O0.t.k(vVar);
            }
            if (this.f3310d) {
                O0.t.L(vVar);
            }
            if (!this.f3309c || this.f3311e) {
                z10 = false;
            } else {
                z10 = true;
            }
            O0.t.Z(vVar2, z10);
            O0.t.s(vVar2, (String) null, new b(this.f3313g), 1, (Object) null);
            if (z10) {
                O0.t.o0(vVar2, (String) null, new c(this.f3313g, vVar2), 1, (Object) null);
                O0.t.v(vVar2, (String) null, new d(this.f3311e, this.f3309c, this.f3313g, vVar, this.f3308b), 1, (Object) null);
            }
            O0.t.i0(vVar2, (String) null, new e(this.f3314h, this.f3309c, this.f3308b, this.f3315i, this.f3313g), 1, (Object) null);
            O0.t.A(vVar, this.f3312f.e(), (String) null, new f(this.f3313g, this.f3312f), 2, (Object) null);
            O0.t.y(vVar2, (String) null, new g(this.f3313g, this.f3316j, this.f3311e), 1, (Object) null);
            O0.t.C(vVar2, (String) null, new h(this.f3315i), 1, (Object) null);
            if (!Q0.Q.h(this.f3308b.g()) && !this.f3310d) {
                O0.t.g(vVar2, (String) null, new C0076i(this.f3315i), 1, (Object) null);
                if (this.f3309c && !this.f3311e) {
                    O0.t.i(vVar2, (String) null, new j(this.f3315i), 1, (Object) null);
                }
            }
            if (this.f3309c && !this.f3311e) {
                O0.t.N(vVar2, (String) null, new a(this.f3315i), 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O0.v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$o */
    static final class o extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f3340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1450s f3341c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q0 f3342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C1228y yVar, androidx.compose.ui.focus.o oVar, C1450s sVar, q0 q0Var) {
            super(0);
            this.f3339a = yVar;
            this.f3340b = oVar;
            this.f3341c = sVar;
            this.f3342d = q0Var;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            if (!this.f3339a.e()) {
                this.f3340b.f();
            }
            int f10 = this.f3341c.f();
            C1456y.a aVar = C1456y.f8623b;
            if (!C1456y.n(f10, aVar.f()) && !C1456y.n(this.f3341c.f(), aVar.e())) {
                this.f3342d.k();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: J.i$p */
    static final class p extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f3344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f3345c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(i iVar, G g10, yf.p pVar, int i10) {
            super(2);
            this.f3343a = iVar;
            this.f3344b = g10;
            this.f3345c = pVar;
            this.f3346d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1213i.c(this.f3343a, this.f3344b, this.f3345c, mVar, M0.a(this.f3346d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$q */
    static final class q extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f3348b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3349c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(G g10, boolean z10, int i10) {
            super(2);
            this.f3347a = g10;
            this.f3348b = z10;
            this.f3349c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1213i.d(this.f3347a, this.f3348b, mVar, M0.a(this.f3349c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$r */
    static final class r implements C1293i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f3350a;

        r(long j10) {
            this.f3350a = j10;
        }

        public final long a() {
            return this.f3350a;
        }
    }

    /* renamed from: J.i$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f3351a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3352b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f3353c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G f3354d;

        /* renamed from: J.i$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f3355a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f3356b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ J f3357c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f3358d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ G f3359e;

            /* renamed from: J.i$s$a$a  reason: collision with other inner class name */
            static final class C0077a extends kotlin.coroutines.jvm.internal.l implements yf.p {

                /* renamed from: a  reason: collision with root package name */
                int f3360a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ J f3361b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ K f3362c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0077a(J j10, K k10, C6658d dVar) {
                    super(2, dVar);
                    this.f3361b = j10;
                    this.f3362c = k10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0077a(this.f3361b, this.f3362c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0077a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f3360a;
                    if (i10 == 0) {
                        w.b(obj);
                        J j10 = this.f3361b;
                        K k10 = this.f3362c;
                        this.f3360a = 1;
                        if (B.c(j10, k10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C6514M.f71813a;
                }
            }

            /* renamed from: J.i$s$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements yf.p {

                /* renamed from: a  reason: collision with root package name */
                int f3363a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ J f3364b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ G f3365c;

                /* renamed from: J.i$s$a$b$a  reason: collision with other inner class name */
                static final class C0078a extends C6498u implements C6798l {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ G f3366a;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0078a(G g10) {
                        super(1);
                        this.f3366a = g10;
                    }

                    public final void a(long j10) {
                        this.f3366a.l0();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((C2421g) obj).v());
                        return C6514M.f71813a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(J j10, G g10, C6658d dVar) {
                    super(2, dVar);
                    this.f3364b = j10;
                    this.f3365c = g10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new b(this.f3364b, this.f3365c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f3363a;
                    if (i10 == 0) {
                        w.b(obj);
                        J j10 = this.f3364b;
                        C0078a aVar = new C0078a(this.f3365c);
                        this.f3363a = 1;
                        if (C2938B.j(j10, (C6798l) null, (C6798l) null, (yf.q) null, aVar, this, 7, (Object) null) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(J j10, K k10, G g10, C6658d dVar) {
                super(2, dVar);
                this.f3357c = j10;
                this.f3358d = k10;
                this.f3359e = g10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f3357c, this.f3358d, this.f3359e, dVar);
                aVar.f3356b = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f3355a == 0) {
                    w.b(obj);
                    K k10 = (K) this.f3356b;
                    Ug.M m10 = Ug.M.UNDISPATCHED;
                    Ug.M m11 = m10;
                    C5600w0 unused = C5576k.d(k10, (qf.g) null, m11, new C0077a(this.f3357c, this.f3358d, (C6658d) null), 1, (Object) null);
                    C5600w0 unused2 = C5576k.d(k10, (qf.g) null, m11, new b(this.f3357c, this.f3359e, (C6658d) null), 1, (Object) null);
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(K k10, G g10, C6658d dVar) {
            super(2, dVar);
            this.f3353c = k10;
            this.f3354d = g10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            s sVar = new s(this.f3353c, this.f3354d, dVar);
            sVar.f3352b = obj;
            return sVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((s) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f3351a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a((J) this.f3352b, this.f3353c, this.f3354d, (C6658d) null);
                this.f3351a = 1;
                if (Ug.L.e(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$t */
    static final class t extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f3367a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(long j10) {
            super(1);
            this.f3367a = j10;
        }

        public final void a(O0.v vVar) {
            vVar.a(P.w.d(), new P.v(C1216l.Cursor, this.f3367a, P.u.Middle, true, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O0.v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$u */
    static final class u extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3369b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(G g10, int i10) {
            super(2);
            this.f3368a = g10;
            this.f3369b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1213i.e(this.f3368a, mVar, M0.a(this.f3369b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.i$v */
    static final class v extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f3371b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(C1228y yVar, G g10) {
            super(1);
            this.f3370a = yVar;
            this.f3371b = g10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f3370a.d() != C1217m.Selection || !C1221q.a(keyEvent)) {
                z10 = false;
            } else {
                z10 = true;
                G.u(this.f3371b, (C2421g) null, 1, (Object) null);
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((B0.b) obj).f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: J.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: J.i$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: J.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: J.i$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: J.i$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: J.i$n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v16, resolved type: J.i$n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v17, resolved type: J.i$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v18, resolved type: J.i$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v19, resolved type: J.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v20, resolved type: J.i$i} */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03bc, code lost:
        if (r9 == r2.a()) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05df, code lost:
        if (r5 == r2.a()) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0654, code lost:
        if (r9 == r2.a()) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06c5, code lost:
        if (r9 == r2.a()) goto L_0x06c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0762, code lost:
        if (r1 == r2.a()) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07ce, code lost:
        if (r5 == r2.a()) goto L_0x07d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x07f7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0857  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x08c0  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x08c2  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0938  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x093b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x09ab  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x09d0  */
    /* JADX WARNING: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(W0.Q r54, yf.C6798l r55, k0.i r56, Q0.T r57, W0.c0 r58, yf.C6798l r59, B.l r60, r0.C2514n0 r61, boolean r62, int r63, int r64, W0.C1450s r65, J.C1226w r66, boolean r67, boolean r68, yf.q r69, Y.C1500m r70, int r71, int r72, int r73) {
        /*
            r15 = r54
            r14 = r71
            r13 = r72
            r12 = r73
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r1 = r70
            Y.m r11 = r1.h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r11.S(r15)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            r10 = r55
            goto L_0x0043
        L_0x0031:
            r4 = r14 & 48
            r10 = r55
            if (r4 != 0) goto L_0x0043
            boolean r4 = r11.C(r10)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r9 = r56
            goto L_0x005f
        L_0x004c:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0049
            r9 = r56
            boolean r16 = r11.S(r9)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r16
        L_0x005f:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r7 = r57
            goto L_0x007d
        L_0x006a:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r57
            boolean r19 = r11.S(r7)
            if (r19 == 0) goto L_0x0079
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r1 = r1 | r19
        L_0x007d:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r2 = r58
            goto L_0x009b
        L_0x0088:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0085
            r2 = r58
            boolean r23 = r11.S(r2)
            if (r23 == 0) goto L_0x0097
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r23 = r20
        L_0x0099:
            r1 = r1 | r23
        L_0x009b:
            r23 = r12 & 32
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00aa
            r1 = r1 | r26
            r6 = r59
            goto L_0x00bd
        L_0x00aa:
            r27 = r14 & r26
            r6 = r59
            if (r27 != 0) goto L_0x00bd
            boolean r28 = r11.C(r6)
            if (r28 == 0) goto L_0x00b9
            r28 = r25
            goto L_0x00bb
        L_0x00b9:
            r28 = r24
        L_0x00bb:
            r1 = r1 | r28
        L_0x00bd:
            r28 = r12 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00c8
            r1 = r1 | r29
            r5 = r60
            goto L_0x00db
        L_0x00c8:
            r29 = r14 & r29
            r5 = r60
            if (r29 != 0) goto L_0x00db
            boolean r30 = r11.S(r5)
            if (r30 == 0) goto L_0x00d7
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r30
        L_0x00db:
            r8 = r12 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00e6
            r1 = r1 | r31
            r3 = r61
            goto L_0x00f9
        L_0x00e6:
            r31 = r14 & r31
            r3 = r61
            if (r31 != 0) goto L_0x00f9
            boolean r32 = r11.S(r3)
            if (r32 == 0) goto L_0x00f5
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r32
        L_0x00f9:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0104
            r1 = r1 | r33
            r2 = r62
            goto L_0x0117
        L_0x0104:
            r33 = r14 & r33
            r2 = r62
            if (r33 != 0) goto L_0x0117
            boolean r33 = r11.b(r2)
            if (r33 == 0) goto L_0x0113
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r1 = r1 | r33
        L_0x0117:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0122
            r1 = r1 | r33
            r3 = r63
            goto L_0x0135
        L_0x0122:
            r33 = r14 & r33
            r3 = r63
            if (r33 != 0) goto L_0x0135
            boolean r33 = r11.d(r3)
            if (r33 == 0) goto L_0x0131
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r33
        L_0x0135:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013e
            r33 = r13 | 6
            r5 = r64
            goto L_0x0154
        L_0x013e:
            r33 = r13 & 6
            r5 = r64
            if (r33 != 0) goto L_0x0152
            boolean r33 = r11.d(r5)
            if (r33 == 0) goto L_0x014d
            r33 = 4
            goto L_0x014f
        L_0x014d:
            r33 = 2
        L_0x014f:
            r33 = r13 | r33
            goto L_0x0154
        L_0x0152:
            r33 = r13
        L_0x0154:
            r34 = r13 & 48
            if (r34 != 0) goto L_0x0170
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0167
            r5 = r65
            boolean r34 = r11.S(r5)
            if (r34 == 0) goto L_0x0169
            r34 = 32
            goto L_0x016b
        L_0x0167:
            r5 = r65
        L_0x0169:
            r34 = 16
        L_0x016b:
            r33 = r33 | r34
        L_0x016d:
            r5 = r33
            goto L_0x0173
        L_0x0170:
            r5 = r65
            goto L_0x016d
        L_0x0173:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x017c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0179:
            r7 = r66
            goto L_0x018f
        L_0x017c:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0179
            r7 = r66
            boolean r33 = r11.S(r7)
            if (r33 == 0) goto L_0x018b
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x018d
        L_0x018b:
            r18 = 128(0x80, float:1.794E-43)
        L_0x018d:
            r5 = r5 | r18
        L_0x018f:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0198
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0195:
            r9 = r67
            goto L_0x01a8
        L_0x0198:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0195
            r9 = r67
            boolean r18 = r11.b(r9)
            if (r18 == 0) goto L_0x01a6
            r17 = 2048(0x800, float:2.87E-42)
        L_0x01a6:
            r5 = r5 | r17
        L_0x01a8:
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01b1
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x01ae:
            r10 = r68
            goto L_0x01c1
        L_0x01b1:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x01ae
            r10 = r68
            boolean r17 = r11.b(r10)
            if (r17 == 0) goto L_0x01bf
            r20 = 16384(0x4000, float:2.2959E-41)
        L_0x01bf:
            r5 = r5 | r20
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            if (r17 == 0) goto L_0x01cd
            r5 = r5 | r26
            r10 = r69
            goto L_0x01dd
        L_0x01cd:
            r18 = r13 & r26
            r10 = r69
            if (r18 != 0) goto L_0x01dd
            boolean r18 = r11.C(r10)
            if (r18 == 0) goto L_0x01db
            r24 = r25
        L_0x01db:
            r5 = r5 | r24
        L_0x01dd:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r1 & r18
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x0219
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r5
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r13) goto L_0x0219
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x01f7
            goto L_0x0219
        L_0x01f7:
            r11.I()
            r3 = r56
            r4 = r57
            r5 = r58
            r6 = r59
            r7 = r60
            r8 = r61
            r9 = r62
            r10 = r63
            r12 = r65
            r13 = r66
            r14 = r67
            r15 = r68
            r16 = r69
            r2 = r11
            r11 = r64
            goto L_0x09ca
        L_0x0219:
            r11.D()
            r10 = r14 & 1
            if (r10 == 0) goto L_0x024e
            boolean r10 = r11.L()
            if (r10 == 0) goto L_0x0227
            goto L_0x024e
        L_0x0227:
            r11.I()
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0230
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0230:
            r14 = r56
            r20 = r57
            r13 = r58
            r21 = r59
            r10 = r60
            r24 = r61
            r25 = r62
            r9 = r63
            r26 = r64
            r8 = r65
            r28 = r66
            r7 = r67
            r33 = r68
            r34 = r69
            goto L_0x02fa
        L_0x024e:
            if (r4 == 0) goto L_0x0253
            k0.i$a r4 = k0.i.f23074a
            goto L_0x0255
        L_0x0253:
            r4 = r56
        L_0x0255:
            if (r16 == 0) goto L_0x025e
            Q0.T$a r10 = Q0.T.f5294d
            Q0.T r10 = r10.a()
            goto L_0x0260
        L_0x025e:
            r10 = r57
        L_0x0260:
            if (r19 == 0) goto L_0x0269
            W0.c0$a r16 = W0.c0.f8551a
            W0.c0 r16 = r16.c()
            goto L_0x026b
        L_0x0269:
            r16 = r58
        L_0x026b:
            if (r23 == 0) goto L_0x0270
            J.i$a r19 = J.C1213i.a.f3182a
            goto L_0x0272
        L_0x0270:
            r19 = r59
        L_0x0272:
            if (r28 == 0) goto L_0x0277
            r20 = 0
            goto L_0x0279
        L_0x0277:
            r20 = r60
        L_0x0279:
            if (r8 == 0) goto L_0x028a
            r0.h2 r8 = new r0.h2
            r0.x0$a r21 = r0.C2544x0.f25560b
            long r13 = r21.h()
            r56 = r4
            r4 = 0
            r8.<init>(r13, r4)
            goto L_0x028e
        L_0x028a:
            r56 = r4
            r8 = r61
        L_0x028e:
            if (r0 == 0) goto L_0x0292
            r0 = 1
            goto L_0x0294
        L_0x0292:
            r0 = r62
        L_0x0294:
            if (r2 == 0) goto L_0x029a
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x029c
        L_0x029a:
            r2 = r63
        L_0x029c:
            if (r3 == 0) goto L_0x02a0
            r3 = 1
            goto L_0x02a2
        L_0x02a0:
            r3 = r64
        L_0x02a2:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x02af
            W0.s$a r4 = W0.C1450s.f8604g
            W0.s r4 = r4.a()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02b1
        L_0x02af:
            r4 = r65
        L_0x02b1:
            if (r6 == 0) goto L_0x02ba
            J.w$a r6 = J.C1226w.f3478g
            J.w r6 = r6.a()
            goto L_0x02bc
        L_0x02ba:
            r6 = r66
        L_0x02bc:
            if (r7 == 0) goto L_0x02c0
            r7 = 1
            goto L_0x02c2
        L_0x02c0:
            r7 = r67
        L_0x02c2:
            if (r9 == 0) goto L_0x02c6
            r9 = 0
            goto L_0x02c8
        L_0x02c6:
            r9 = r68
        L_0x02c8:
            if (r17 == 0) goto L_0x02eb
            J.f r13 = J.C1210f.f3166a
            yf.q r13 = r13.a()
            r14 = r56
            r25 = r0
            r26 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            r34 = r13
        L_0x02de:
            r13 = r16
            r21 = r19
            r9 = r2
            r8 = r4
            r53 = r20
            r20 = r10
            r10 = r53
            goto L_0x02fa
        L_0x02eb:
            r14 = r56
            r34 = r69
            r25 = r0
            r26 = r3
            r28 = r6
            r24 = r8
            r33 = r9
            goto L_0x02de
        L_0x02fa:
            r11.v()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x030b
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)"
            r2 = -958708118(0xffffffffc6db466a, float:-28067.207)
            Y.C1506p.Q(r2, r1, r5, r0)
        L_0x030b:
            java.lang.Object r0 = r11.A()
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r3 = r2.a()
            if (r0 != r3) goto L_0x031f
            androidx.compose.ui.focus.o r0 = new androidx.compose.ui.focus.o
            r0.<init>()
            r11.r(r0)
        L_0x031f:
            androidx.compose.ui.focus.o r0 = (androidx.compose.ui.focus.o) r0
            java.lang.Object r3 = r11.A()
            java.lang.Object r4 = r2.a()
            if (r3 != r4) goto L_0x0332
            M.q0 r3 = M.r0.b()
            r11.r(r3)
        L_0x0332:
            M.q0 r3 = (M.q0) r3
            java.lang.Object r4 = r11.A()
            java.lang.Object r6 = r2.a()
            if (r4 != r6) goto L_0x0346
            W0.T r4 = new W0.T
            r4.<init>(r3)
            r11.r(r4)
        L_0x0346:
            W0.T r4 = (W0.T) r4
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r6 = r11.m(r6)
            r19 = r6
            c1.d r19 = (c1.d) r19
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.g()
            java.lang.Object r6 = r11.m(r6)
            V0.h$b r6 = (V0.h.b) r6
            Y.I0 r12 = P.L.b()
            java.lang.Object r12 = r11.m(r12)
            P.K r12 = (P.K) r12
            long r16 = r12.a()
            Y.I0 r12 = androidx.compose.ui.platform.C1644k0.f()
            java.lang.Object r12 = r11.m(r12)
            p0.e r12 = (p0.e) r12
            r32 = r14
            Y.I0 r14 = androidx.compose.ui.platform.C1644k0.s()
            java.lang.Object r14 = r11.m(r14)
            androidx.compose.ui.platform.D1 r14 = (androidx.compose.ui.platform.D1) r14
            r68 = r3
            Y.I0 r3 = androidx.compose.ui.platform.C1644k0.o()
            java.lang.Object r3 = r11.m(r3)
            androidx.compose.ui.platform.m1 r3 = (androidx.compose.ui.platform.C1651m1) r3
            r69 = r14
            r14 = 1
            if (r9 != r14) goto L_0x039e
            if (r25 != 0) goto L_0x039e
            boolean r14 = r8.h()
            if (r14 == 0) goto L_0x039e
            z.q r14 = z.q.Horizontal
            goto L_0x03a0
        L_0x039e:
            z.q r14 = z.q.Vertical
        L_0x03a0:
            java.lang.Object[] r35 = new java.lang.Object[]{r14}
            J.W$c r36 = J.W.f2979f
            h0.j r36 = r36.a()
            boolean r37 = r11.S(r14)
            r38 = r9
            java.lang.Object r9 = r11.A()
            if (r37 != 0) goto L_0x03bf
            r37 = r10
            java.lang.Object r10 = r2.a()
            if (r9 != r10) goto L_0x03c9
            goto L_0x03c1
        L_0x03bf:
            r37 = r10
        L_0x03c1:
            J.i$m r9 = new J.i$m
            r9.<init>(r14)
            r11.r(r9)
        L_0x03c9:
            yf.a r9 = (yf.C6787a) r9
            r10 = 0
            r14 = 4
            r39 = 0
            r56 = r35
            r57 = r36
            r58 = r39
            r59 = r9
            r60 = r11
            r61 = r10
            r62 = r14
            java.lang.Object r9 = h0.C2018b.e(r56, r57, r58, r59, r60, r61, r62)
            J.W r9 = (J.W) r9
            r10 = r1 & 14
            r14 = 4
            if (r10 != r14) goto L_0x03ea
            r14 = 1
            goto L_0x03eb
        L_0x03ea:
            r14 = 0
        L_0x03eb:
            r35 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r35
            r35 = r9
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r9) goto L_0x03f8
            r1 = 1
            goto L_0x03f9
        L_0x03f8:
            r1 = 0
        L_0x03f9:
            r1 = r1 | r14
            java.lang.Object r9 = r11.A()
            if (r1 != 0) goto L_0x040a
            java.lang.Object r1 = r2.a()
            if (r9 != r1) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            r36 = r8
            goto L_0x0430
        L_0x040a:
            Q0.d r1 = r54.e()
            W0.a0 r1 = J.p0.c(r13, r1)
            Q0.Q r9 = r54.f()
            if (r9 == 0) goto L_0x042a
            r14 = r8
            long r8 = r9.r()
            r36 = r14
            J.M$a r14 = J.M.f2895a
            W0.a0 r8 = r14.a(r8, r1)
            if (r8 != 0) goto L_0x0428
            goto L_0x042c
        L_0x0428:
            r9 = r8
            goto L_0x042d
        L_0x042a:
            r36 = r8
        L_0x042c:
            r9 = r1
        L_0x042d:
            r11.r(r9)
        L_0x0430:
            r1 = r9
            W0.a0 r1 = (W0.a0) r1
            Q0.d r8 = r1.b()
            W0.I r14 = r1.a()
            r39 = r1
            r9 = 0
            Y.K0 r1 = Y.C1494j.b(r11, r9)
            boolean r9 = r11.S(r3)
            r40 = r10
            java.lang.Object r10 = r11.A()
            if (r9 != 0) goto L_0x0454
            java.lang.Object r9 = r2.a()
            if (r10 != r9) goto L_0x0485
        L_0x0454:
            J.y r10 = new J.y
            J.I r9 = new J.I
            r41 = 300(0x12c, float:4.2E-43)
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r56 = r9
            r57 = r8
            r58 = r20
            r59 = r43
            r60 = r44
            r61 = r25
            r62 = r45
            r63 = r19
            r64 = r6
            r65 = r46
            r66 = r41
            r67 = r42
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r10.<init>(r9, r1, r3)
            r11.r(r10)
        L_0x0485:
            r3 = r10
            J.y r3 = (J.C1228y) r3
            Q0.d r1 = r54.e()
            r56 = r3
            r57 = r1
            r58 = r8
            r59 = r20
            r60 = r25
            r61 = r19
            r62 = r6
            r63 = r55
            r64 = r28
            r65 = r12
            r66 = r16
            r56.N(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            W0.k r1 = r3.n()
            W0.Z r6 = r3.g()
            r1.d(r15, r6)
            java.lang.Object r1 = r11.A()
            java.lang.Object r6 = r2.a()
            if (r1 != r6) goto L_0x04c5
            J.l0 r1 = new J.l0
            r6 = 0
            r8 = 0
            r9 = 1
            r1.<init>(r8, r9, r6)
            r11.r(r1)
        L_0x04c5:
            J.l0 r1 = (J.l0) r1
            r6 = 2
            r8 = 0
            r9 = 0
            r56 = r1
            r57 = r54
            r58 = r9
            r60 = r6
            r61 = r8
            J.l0.f(r56, r57, r58, r60, r61)
            java.lang.Object r6 = r11.A()
            java.lang.Object r8 = r2.a()
            if (r6 != r8) goto L_0x04ea
            P.G r6 = new P.G
            r6.<init>(r1)
            r11.r(r6)
        L_0x04ea:
            r10 = r6
            P.G r10 = (P.G) r10
            r10.e0(r14)
            r10.k0(r13)
            yf.l r6 = r3.m()
            r10.f0(r6)
            r10.h0(r3)
            r10.j0(r15)
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.d()
            java.lang.Object r6 = r11.m(r6)
            androidx.compose.ui.platform.i0 r6 = (androidx.compose.ui.platform.C1638i0) r6
            r10.V(r6)
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.p()
            java.lang.Object r6 = r11.m(r6)
            androidx.compose.ui.platform.p1 r6 = (androidx.compose.ui.platform.p1) r6
            r10.i0(r6)
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.i()
            java.lang.Object r6 = r11.m(r6)
            z0.a r6 = (z0.C2951a) r6
            r10.d0(r6)
            r10.b0(r0)
            r6 = r33 ^ 1
            r10.Z(r6)
            r10.a0(r7)
            java.lang.Object r6 = r11.A()
            java.lang.Object r8 = r2.a()
            if (r6 != r8) goto L_0x054b
            qf.h r6 = qf.h.f72645a
            Ug.K r6 = Y.P.j(r6, r11)
            Y.B r8 = new Y.B
            r8.<init>(r6)
            r11.r(r8)
            r6 = r8
        L_0x054b:
            Y.B r6 = (Y.B) r6
            Ug.K r6 = r6.a()
            java.lang.Object r8 = r11.A()
            java.lang.Object r9 = r2.a()
            if (r8 != r9) goto L_0x0562
            H.b r8 = androidx.compose.foundation.relocation.b.a()
            r11.r(r8)
        L_0x0562:
            r9 = r8
            H.b r9 = (H.b) r9
            k0.i$a r8 = k0.i.f23074a
            boolean r16 = r11.C(r3)
            r17 = r13
            r13 = r5 & 7168(0x1c00, float:1.0045E-41)
            r67 = r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r13 != r12) goto L_0x0577
            r12 = 1
            goto L_0x0578
        L_0x0577:
            r12 = 0
        L_0x0578:
            r12 = r16 | r12
            r16 = 57344(0xe000, float:8.0356E-41)
            r41 = r1
            r1 = r5 & r16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r15) goto L_0x0587
            r15 = 1
            goto L_0x0588
        L_0x0587:
            r15 = 0
        L_0x0588:
            r12 = r12 | r15
            boolean r15 = r11.C(r4)
            r12 = r12 | r15
            r16 = r13
            r13 = r40
            r15 = 4
            if (r13 != r15) goto L_0x0597
            r15 = 1
            goto L_0x0598
        L_0x0597:
            r15 = 0
        L_0x0598:
            r12 = r12 | r15
            r15 = r5 & 112(0x70, float:1.57E-43)
            r15 = r15 ^ 48
            r40 = r13
            r13 = 32
            if (r15 <= r13) goto L_0x05b1
            r13 = r36
            boolean r36 = r11.S(r13)
            if (r36 != 0) goto L_0x05ac
            goto L_0x05b3
        L_0x05ac:
            r36 = r1
            r42 = r5
            goto L_0x05bd
        L_0x05b1:
            r13 = r36
        L_0x05b3:
            r36 = r1
            r1 = r5 & 48
            r42 = r5
            r5 = 32
            if (r1 != r5) goto L_0x05bf
        L_0x05bd:
            r1 = 1
            goto L_0x05c0
        L_0x05bf:
            r1 = 0
        L_0x05c0:
            r1 = r1 | r12
            boolean r5 = r11.C(r14)
            r1 = r1 | r5
            boolean r5 = r11.C(r6)
            r1 = r1 | r5
            boolean r5 = r11.C(r9)
            r1 = r1 | r5
            boolean r5 = r11.C(r10)
            r1 = r1 | r5
            java.lang.Object r5 = r11.A()
            if (r1 != 0) goto L_0x05e1
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x05ff
        L_0x05e1:
            J.i$i r5 = new J.i$i
            r56 = r5
            r57 = r3
            r58 = r7
            r59 = r33
            r60 = r4
            r61 = r54
            r62 = r13
            r63 = r14
            r64 = r10
            r65 = r6
            r66 = r9
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r11.r(r5)
        L_0x05ff:
            yf.l r5 = (yf.C6798l) r5
            r12 = r37
            k0.i r1 = J.P.a(r8, r7, r0, r12, r5)
            if (r7 == 0) goto L_0x060d
            if (r33 != 0) goto L_0x060d
            r5 = 1
            goto L_0x060e
        L_0x060d:
            r5 = 0
        L_0x060e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            Y.A1 r5 = Y.p1.o(r5, r11, r6)
            lf.M r6 = lf.C6514M.f71813a
            boolean r37 = r11.S(r5)
            boolean r43 = r11.C(r3)
            r37 = r37 | r43
            boolean r43 = r11.C(r4)
            r37 = r37 | r43
            boolean r43 = r11.C(r10)
            r37 = r37 | r43
            r43 = r9
            r9 = 32
            if (r15 <= r9) goto L_0x063f
            boolean r27 = r11.S(r13)
            if (r27 != 0) goto L_0x063c
            goto L_0x063f
        L_0x063c:
            r44 = r1
            goto L_0x0645
        L_0x063f:
            r44 = r1
            r1 = r42 & 48
            if (r1 != r9) goto L_0x0647
        L_0x0645:
            r1 = 1
            goto L_0x0648
        L_0x0647:
            r1 = 0
        L_0x0648:
            r1 = r37 | r1
            java.lang.Object r9 = r11.A()
            if (r1 != 0) goto L_0x0656
            java.lang.Object r1 = r2.a()
            if (r9 != r1) goto L_0x066d
        L_0x0656:
            J.i$b r9 = new J.i$b
            r1 = 0
            r56 = r9
            r57 = r3
            r58 = r5
            r59 = r4
            r60 = r10
            r61 = r13
            r62 = r1
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.r(r9)
        L_0x066d:
            yf.p r9 = (yf.p) r9
            r1 = 6
            Y.P.g(r6, r9, r11, r1)
            boolean r1 = r11.C(r3)
            java.lang.Object r6 = r11.A()
            if (r1 != 0) goto L_0x0683
            java.lang.Object r1 = r2.a()
            if (r6 != r1) goto L_0x068b
        L_0x0683:
            J.i$k r6 = new J.i$k
            r6.<init>(r3)
            r11.r(r6)
        L_0x068b:
            yf.l r6 = (yf.C6798l) r6
            k0.i r1 = P.t.k(r8, r6)
            boolean r6 = r11.C(r3)
            r9 = 16384(0x4000, float:2.2959E-41)
            r53 = r36
            r36 = r5
            r5 = r53
            if (r5 != r9) goto L_0x06a1
            r9 = 1
            goto L_0x06a2
        L_0x06a1:
            r9 = 0
        L_0x06a2:
            r6 = r6 | r9
            r9 = 2048(0x800, float:2.87E-42)
            r53 = r16
            r16 = r4
            r4 = r53
            if (r4 != r9) goto L_0x06af
            r9 = 1
            goto L_0x06b0
        L_0x06af:
            r9 = 0
        L_0x06b0:
            r6 = r6 | r9
            boolean r9 = r11.C(r14)
            r6 = r6 | r9
            boolean r9 = r11.C(r10)
            r6 = r6 | r9
            java.lang.Object r9 = r11.A()
            if (r6 != 0) goto L_0x06c7
            java.lang.Object r6 = r2.a()
            if (r9 != r6) goto L_0x06dd
        L_0x06c7:
            J.i$l r9 = new J.i$l
            r56 = r9
            r57 = r3
            r58 = r0
            r59 = r33
            r60 = r7
            r61 = r10
            r62 = r14
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.r(r9)
        L_0x06dd:
            yf.l r9 = (yf.C6798l) r9
            k0.i r1 = J.U.a(r1, r12, r7, r9)
            P.h r6 = r10.I()
            J.K r9 = r10.M()
            k0.i r1 = P.t.i(r1, r6, r9)
            D0.v r6 = J.g0.a()
            r70 = r0
            r37 = r12
            r0 = 0
            r9 = 2
            r12 = 0
            k0.i r1 = D0.C1131w.b(r1, r6, r0, r9, r12)
            boolean r0 = r11.C(r3)
            r9 = r40
            r6 = 4
            if (r9 != r6) goto L_0x0709
            r6 = 1
            goto L_0x070a
        L_0x0709:
            r6 = 0
        L_0x070a:
            r0 = r0 | r6
            boolean r6 = r11.C(r14)
            r0 = r0 | r6
            java.lang.Object r6 = r11.A()
            if (r0 != 0) goto L_0x0720
            java.lang.Object r0 = r2.a()
            if (r6 != r0) goto L_0x071d
            goto L_0x0720
        L_0x071d:
            r12 = r54
            goto L_0x072a
        L_0x0720:
            J.i$h r6 = new J.i$h
            r12 = r54
            r6.<init>(r3, r12, r14)
            r11.r(r6)
        L_0x072a:
            yf.l r6 = (yf.C6798l) r6
            k0.i r22 = androidx.compose.ui.draw.b.b(r8, r6)
            boolean r0 = r11.C(r3)
            r6 = 2048(0x800, float:2.87E-42)
            if (r4 != r6) goto L_0x073a
            r6 = 1
            goto L_0x073b
        L_0x073a:
            r6 = 0
        L_0x073b:
            r0 = r0 | r6
            r6 = r69
            boolean r40 = r11.S(r6)
            r0 = r0 | r40
            boolean r40 = r11.C(r10)
            r0 = r0 | r40
            r69 = r1
            r1 = 4
            if (r9 != r1) goto L_0x0751
            r1 = 1
            goto L_0x0752
        L_0x0751:
            r1 = 0
        L_0x0752:
            r0 = r0 | r1
            boolean r1 = r11.C(r14)
            r0 = r0 | r1
            java.lang.Object r1 = r11.A()
            if (r0 != 0) goto L_0x0764
            java.lang.Object r0 = r2.a()
            if (r1 != r0) goto L_0x077a
        L_0x0764:
            J.i$j r1 = new J.i$j
            r56 = r1
            r57 = r3
            r58 = r7
            r59 = r6
            r60 = r10
            r61 = r54
            r62 = r14
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r11.r(r1)
        L_0x077a:
            yf.l r1 = (yf.C6798l) r1
            k0.i r40 = androidx.compose.ui.layout.c.a(r8, r1)
            r0 = r39
            boolean r1 = r11.C(r0)
            r12 = 4
            if (r9 != r12) goto L_0x078b
            r12 = 1
            goto L_0x078c
        L_0x078b:
            r12 = 0
        L_0x078c:
            r1 = r1 | r12
            r12 = 2048(0x800, float:2.87E-42)
            if (r4 != r12) goto L_0x0793
            r4 = 1
            goto L_0x0794
        L_0x0793:
            r4 = 0
        L_0x0794:
            r1 = r1 | r4
            r4 = 0
            boolean r12 = r11.b(r4)
            r1 = r1 | r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r12) goto L_0x07a1
            r5 = 1
            goto L_0x07a2
        L_0x07a1:
            r5 = 0
        L_0x07a2:
            r1 = r1 | r5
            boolean r5 = r11.C(r3)
            r1 = r1 | r5
            boolean r5 = r11.C(r14)
            r1 = r1 | r5
            boolean r5 = r11.C(r10)
            r1 = r1 | r5
            r5 = 32
            if (r15 <= r5) goto L_0x07bc
            boolean r12 = r11.S(r13)
            if (r12 != 0) goto L_0x07c0
        L_0x07bc:
            r12 = r42 & 48
            if (r12 != r5) goto L_0x07c2
        L_0x07c0:
            r5 = 1
            goto L_0x07c3
        L_0x07c2:
            r5 = 0
        L_0x07c3:
            r1 = r1 | r5
            java.lang.Object r5 = r11.A()
            if (r1 != 0) goto L_0x07d0
            java.lang.Object r1 = r2.a()
            if (r5 != r1) goto L_0x07ee
        L_0x07d0:
            J.i$n r5 = new J.i$n
            r56 = r5
            r57 = r0
            r58 = r54
            r59 = r7
            r60 = r4
            r61 = r33
            r62 = r13
            r63 = r3
            r64 = r14
            r65 = r10
            r66 = r70
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r11.r(r5)
        L_0x07ee:
            yf.l r5 = (yf.C6798l) r5
            r0 = 1
            k0.i r1 = O0.m.c(r8, r0, r5)
            if (r7 == 0) goto L_0x0807
            if (r33 != 0) goto L_0x0807
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x0807
            boolean r0 = r3.x()
            if (r0 != 0) goto L_0x0807
            r0 = 1
            goto L_0x0808
        L_0x0807:
            r0 = 0
        L_0x0808:
            r56 = r8
            r57 = r3
            r58 = r54
            r59 = r14
            r60 = r24
            r61 = r0
            k0.i r12 = J.L.a(r56, r57, r58, r59, r60, r61)
            boolean r0 = r11.C(r10)
            java.lang.Object r4 = r11.A()
            if (r0 != 0) goto L_0x0828
            java.lang.Object r0 = r2.a()
            if (r4 != r0) goto L_0x0830
        L_0x0828:
            J.i$c r4 = new J.i$c
            r4.<init>(r10)
            r11.r(r4)
        L_0x0830:
            yf.l r4 = (yf.C6798l) r4
            r0 = 0
            Y.P.c(r10, r4, r11, r0)
            boolean r4 = r11.C(r3)
            r5 = r16
            boolean r16 = r11.C(r5)
            r4 = r4 | r16
            r0 = 4
            if (r9 != r0) goto L_0x0847
            r0 = 1
            goto L_0x0848
        L_0x0847:
            r0 = 0
        L_0x0848:
            r0 = r0 | r4
            r4 = 32
            if (r15 <= r4) goto L_0x0853
            boolean r9 = r11.S(r13)
            if (r9 != 0) goto L_0x0857
        L_0x0853:
            r9 = r42 & 48
            if (r9 != r4) goto L_0x0859
        L_0x0857:
            r4 = 1
            goto L_0x085a
        L_0x0859:
            r4 = 0
        L_0x085a:
            r0 = r0 | r4
            java.lang.Object r4 = r11.A()
            if (r0 != 0) goto L_0x086b
            java.lang.Object r0 = r2.a()
            if (r4 != r0) goto L_0x0868
            goto L_0x086b
        L_0x0868:
            r9 = r54
            goto L_0x0875
        L_0x086b:
            J.i$d r4 = new J.i$d
            r9 = r54
            r4.<init>(r3, r5, r9, r13)
            r11.r(r4)
        L_0x0875:
            yf.l r4 = (yf.C6798l) r4
            int r0 = r42 >> 3
            r0 = r0 & 14
            Y.P.c(r13, r4, r11, r0)
            yf.l r0 = r3.m()
            r4 = r33 ^ 1
            r9 = r38
            r5 = 1
            if (r9 != r5) goto L_0x088c
            r16 = r5
            goto L_0x088e
        L_0x088c:
            r16 = 0
        L_0x088e:
            int r23 = r13.e()
            r56 = r8
            r57 = r3
            r58 = r10
            r59 = r54
            r60 = r0
            r61 = r4
            r62 = r16
            r63 = r14
            r64 = r41
            r65 = r23
            k0.i r0 = J.S.a(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            boolean r4 = b(r36)
            boolean r16 = r11.C(r3)
            r5 = 32
            if (r15 <= r5) goto L_0x08bc
            boolean r15 = r11.S(r13)
            if (r15 != 0) goto L_0x08c0
        L_0x08bc:
            r15 = r42 & 48
            if (r15 != r5) goto L_0x08c2
        L_0x08c0:
            r5 = 1
            goto L_0x08c3
        L_0x08c2:
            r5 = 0
        L_0x08c3:
            r5 = r16 | r5
            r15 = r68
            boolean r16 = r11.C(r15)
            r5 = r5 | r16
            r56 = r14
            java.lang.Object r14 = r11.A()
            if (r5 != 0) goto L_0x08db
            java.lang.Object r2 = r2.a()
            if (r14 != r2) goto L_0x08e5
        L_0x08db:
            J.i$o r14 = new J.i$o
            r2 = r70
            r14.<init>(r3, r2, r13, r15)
            r11.r(r14)
        L_0x08e5:
            yf.a r14 = (yf.C6787a) r14
            k0.i r2 = androidx.compose.foundation.text.handwriting.a.c(r8, r4, r14)
            r14 = r32
            k0.i r4 = androidx.compose.foundation.text.input.internal.a.a(r14, r15, r3, r10)
            k0.i r2 = r4.h(r2)
            r4 = r44
            k0.i r2 = r2.h(r4)
            r4 = r67
            k0.i r2 = J.O.b(r2, r3, r4)
            k0.i r2 = p(r2, r3, r10)
            k0.i r0 = r2.h(r0)
            r5 = r35
            r15 = r37
            k0.i r0 = J.V.d(r0, r5, r15, r7)
            r2 = r69
            k0.i r0 = r0.h(r2)
            k0.i r0 = r0.h(r1)
            J.i$g r1 = new J.i$g
            r1.<init>(r3)
            k0.i r4 = androidx.compose.ui.layout.c.a(r0, r1)
            if (r7 == 0) goto L_0x093b
            boolean r0 = r3.e()
            if (r0 == 0) goto L_0x093b
            boolean r0 = r3.y()
            if (r0 == 0) goto L_0x093b
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x093b
            r18 = 1
            goto L_0x093d
        L_0x093b:
            r18 = 0
        L_0x093d:
            if (r18 == 0) goto L_0x0946
            k0.i r0 = P.I.c(r8, r10)
            r16 = r0
            goto L_0x0948
        L_0x0946:
            r16 = r8
        L_0x0948:
            J.i$e r8 = new J.i$e
            r0 = r8
            r1 = r34
            r2 = r3
            r3 = r20
            r6 = r4
            r4 = r26
            r27 = r5
            r23 = 1
            r5 = r9
            r47 = r6
            r6 = r27
            r27 = r7
            r7 = r54
            r29 = r13
            r13 = r8
            r8 = r17
            r30 = r9
            r31 = r43
            r9 = r12
            r32 = r15
            r15 = r10
            r10 = r22
            r12 = r11
            r11 = r40
            r48 = r12
            r12 = r16
            r49 = r13
            r22 = r17
            r13 = r31
            r31 = r56
            r23 = r14
            r14 = r15
            r50 = r15
            r15 = r18
            r16 = r33
            r17 = r21
            r18 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 54
            r1 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            r2 = r48
            r4 = r49
            r3 = 1
            g0.a r0 = g0.c.e(r1, r3, r4, r2, r0)
            r1 = 384(0x180, float:5.38E-43)
            r3 = r47
            r6 = r50
            c(r3, r6, r0, r2, r1)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x09ae
            Y.C1506p.P()
        L_0x09ae:
            r4 = r20
            r6 = r21
            r5 = r22
            r3 = r23
            r8 = r24
            r9 = r25
            r11 = r26
            r14 = r27
            r13 = r28
            r12 = r29
            r10 = r30
            r7 = r32
            r15 = r33
            r16 = r34
        L_0x09ca:
            Y.Y0 r2 = r2.k()
            if (r2 == 0) goto L_0x09eb
            J.i$f r1 = new J.i$f
            r0 = r1
            r51 = r1
            r1 = r54
            r52 = r2
            r2 = r55
            r17 = r71
            r18 = r72
            r19 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r51
            r0 = r52
            r0.a(r1)
        L_0x09eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1213i.a(W0.Q, yf.l, k0.i, Q0.T, W0.c0, yf.l, B.l, r0.n0, boolean, int, int, W0.s, J.w, boolean, boolean, yf.q, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean b(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void c(i iVar, G g10, yf.p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-20551815);
        if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(g10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            F h11 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, iVar);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
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
            F1.b(a12, h11, aVar.c());
            F1.b(a12, p10, aVar.e());
            yf.p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
            C1211g.a(g10, pVar, h10, (i11 >> 3) & 126);
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(iVar, g10, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(G g10, boolean z10, C1500m mVar, int i10) {
        int i11;
        a0 j10;
        Q0.L f10;
        boolean z11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(626339208);
        if ((i10 & 6) == 0) {
            if (h10.C(g10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.b(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z10) {
                h10.T(-1286242594);
                C1228y L10 = g10.L();
                Q0.L l10 = null;
                if (!(L10 == null || (j10 = L10.j()) == null || (f10 = j10.f()) == null)) {
                    C1228y L11 = g10.L();
                    if (L11 != null) {
                        z11 = L11.z();
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        l10 = f10;
                    }
                }
                if (l10 == null) {
                    h10.T(-1285984396);
                } else {
                    h10.T(-1285984395);
                    if (!Q0.Q.h(g10.O().g())) {
                        h10.T(-1680616096);
                        int b10 = g10.J().b(Q0.Q.n(g10.O().g()));
                        int b11 = g10.J().b(Q0.Q.i(g10.O().g()));
                        b1.i c10 = l10.c(b10);
                        b1.i c11 = l10.c(Math.max(b11 - 1, 0));
                        C1228y L12 = g10.L();
                        if (L12 == null || !L12.u()) {
                            h10.T(-1679975078);
                            h10.M();
                        } else {
                            h10.T(-1680216289);
                            H.a(true, c10, g10, h10, ((i11 << 6) & 896) | 6);
                            h10.M();
                        }
                        C1228y L13 = g10.L();
                        if (L13 == null || !L13.t()) {
                            h10.T(-1679655654);
                            h10.M();
                        } else {
                            h10.T(-1679895904);
                            H.a(false, c11, g10, h10, ((i11 << 6) & 896) | 6);
                            h10.M();
                        }
                        h10.M();
                    } else {
                        h10.T(-1679637798);
                        h10.M();
                    }
                    C1228y L14 = g10.L();
                    if (L14 != null) {
                        if (g10.S()) {
                            L14.K(false);
                        }
                        if (L14.e()) {
                            if (L14.s()) {
                                g10.l0();
                            } else {
                                g10.R();
                            }
                        }
                        C6514M m10 = C6514M.f71813a;
                    }
                }
                h10.M();
                h10.M();
            } else {
                h10.T(651305535);
                h10.M();
                g10.R();
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(g10, z10, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: P.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(P.G r9, Y.C1500m r10, int r11) {
        /*
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            Y.m r10 = r10.h(r0)
            r1 = r11 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r10.C(r9)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r11
            goto L_0x0018
        L_0x0017:
            r1 = r11
        L_0x0018:
            r3 = r1 & 3
            if (r3 != r2) goto L_0x0028
            boolean r2 = r10.i()
            if (r2 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r10.I()
            goto L_0x0101
        L_0x0028:
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0034
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)"
            Y.C1506p.Q(r0, r1, r2, r3)
        L_0x0034:
            J.y r0 = r9.L()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.r()
            r1 = 1
            if (r0 != r1) goto L_0x00ef
            Q0.d r0 = r9.N()
            if (r0 == 0) goto L_0x00ef
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ef
            r0 = -285446808(0xffffffffeefc6d68, float:-3.9061243E28)
            r10.T(r0)
            boolean r0 = r10.S(r9)
            java.lang.Object r2 = r10.A()
            if (r0 != 0) goto L_0x0065
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x006c
        L_0x0065:
            J.K r2 = r9.r()
            r10.r(r2)
        L_0x006c:
            J.K r2 = (J.K) r2
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r10.m(r0)
            c1.d r0 = (c1.d) r0
            long r3 = r9.B(r0)
            boolean r0 = r10.e(r3)
            java.lang.Object r5 = r10.A()
            if (r0 != 0) goto L_0x008e
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x0096
        L_0x008e:
            J.i$r r5 = new J.i$r
            r5.<init>(r3)
            r10.r(r5)
        L_0x0096:
            r0 = r5
            P.i r0 = (P.C1293i) r0
            k0.i$a r5 = k0.i.f23074a
            boolean r6 = r10.C(r2)
            boolean r7 = r10.C(r9)
            r6 = r6 | r7
            java.lang.Object r7 = r10.A()
            r8 = 0
            if (r6 != 0) goto L_0x00b3
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00bb
        L_0x00b3:
            J.i$s r7 = new J.i$s
            r7.<init>(r2, r9, r8)
            r10.r(r7)
        L_0x00bb:
            yf.p r7 = (yf.p) r7
            k0.i r2 = D0.T.d(r5, r2, r7)
            boolean r5 = r10.e(r3)
            java.lang.Object r6 = r10.A()
            if (r5 != 0) goto L_0x00d3
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00db
        L_0x00d3:
            J.i$t r6 = new J.i$t
            r6.<init>(r3)
            r10.r(r6)
        L_0x00db:
            yf.l r6 = (yf.C6798l) r6
            r3 = 0
            k0.i r2 = O0.m.d(r2, r3, r6, r1, r8)
            r6 = 0
            r7 = 4
            r3 = 0
            r1 = r0
            r5 = r10
            J.C1205a.a(r1, r2, r3, r5, r6, r7)
            r10.M()
            goto L_0x00f8
        L_0x00ef:
            r0 = -284257090(0xffffffffef0e94be, float:-4.412669E28)
            r10.T(r0)
            r10.M()
        L_0x00f8:
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0101
            Y.C1506p.P()
        L_0x0101:
            Y.Y0 r10 = r10.k()
            if (r10 == 0) goto L_0x010f
            J.i$u r0 = new J.i$u
            r0.<init>(r9, r11)
            r10.a(r0)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1213i.e(P.G, Y.m, int):void");
    }

    public static final Object m(H.b bVar, Q q10, I i10, Q0.L l10, I i11, C6658d dVar) {
        C2423i iVar;
        int b10 = i11.b(Q0.Q.k(q10.g()));
        if (b10 < l10.l().j().length()) {
            iVar = l10.d(b10);
        } else if (b10 != 0) {
            iVar = l10.d(b10 - 1);
        } else {
            iVar = new C2423i(0.0f, 0.0f, 1.0f, (float) c1.r.f(N.b(i10.j(), i10.a(), i10.b(), (String) null, 0, 24, (Object) null)));
        }
        Object b11 = bVar.b(iVar, dVar);
        if (b11 == C6680b.f()) {
            return b11;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void n(C1228y yVar) {
        Z g10 = yVar.g();
        if (g10 != null) {
            M.f2895a.f(g10, yVar.n(), yVar.m());
        }
        yVar.E((Z) null);
    }

    /* access modifiers changed from: private */
    public static final void o(C1228y yVar, Q q10, I i10) {
        C6798l lVar;
        C2057k.a aVar = C2057k.f21728e;
        C2057k d10 = aVar.d();
        if (d10 != null) {
            lVar = d10.h();
        } else {
            lVar = null;
        }
        C2057k f10 = aVar.f(d10);
        try {
            a0 j10 = yVar.j();
            if (j10 != null) {
                Z g10 = yVar.g();
                if (g10 == null) {
                    aVar.m(d10, f10, lVar);
                    return;
                }
                C1197s i11 = yVar.i();
                if (i11 == null) {
                    aVar.m(d10, f10, lVar);
                    return;
                }
                M.f2895a.e(q10, yVar.v(), j10.f(), i11, g10, yVar.e(), i10);
                C6514M m10 = C6514M.f71813a;
                aVar.m(d10, f10, lVar);
            }
        } finally {
            aVar.m(d10, f10, lVar);
        }
    }

    private static final i p(i iVar, C1228y yVar, G g10) {
        return androidx.compose.ui.input.key.a.b(iVar, new v(yVar, g10));
    }

    /* access modifiers changed from: private */
    public static final void q(T t10, C1228y yVar, Q q10, C1450s sVar, I i10) {
        yVar.E(M.f2895a.h(t10, q10, yVar.n(), sVar, yVar.m(), yVar.l()));
        o(yVar, q10, i10);
    }

    /* access modifiers changed from: private */
    public static final void r(C1228y yVar, androidx.compose.ui.focus.o oVar, boolean z10) {
        C1651m1 h10;
        if (!yVar.e()) {
            oVar.f();
        } else if (z10 && (h10 = yVar.h()) != null) {
            h10.b();
        }
    }

    /* renamed from: J.i$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f3196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f3197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f3198c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1450s f3199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1228y yVar, T t10, Q q10, C1450s sVar) {
            super(1);
            this.f3196a = yVar;
            this.f3197b = t10;
            this.f3198c = q10;
            this.f3199d = sVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            if (this.f3196a.e()) {
                C1228y yVar = this.f3196a;
                yVar.E(M.f2895a.i(this.f3197b, this.f3198c, yVar.n(), this.f3199d, this.f3196a.m(), this.f3196a.l()));
            }
            return new a();
        }

        /* renamed from: J.i$d$a */
        public static final class a implements L {
            public void dispose() {
            }
        }
    }

    /* renamed from: J.i$e */
    static final class e extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ yf.q f3200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1228y f3201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q0.T f3202c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3203d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3204e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ W f3205f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Q f3206g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f3207h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f3208i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i f3209j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i f3210k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ i f3211l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ H.b f3212m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ G f3213n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f3214o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f3215p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C6798l f3216q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ I f3217r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ c1.d f3218s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(yf.q qVar, C1228y yVar, Q0.T t10, int i10, int i11, W w10, Q q10, c0 c0Var, i iVar, i iVar2, i iVar3, i iVar4, H.b bVar, G g10, boolean z10, boolean z11, C6798l lVar, I i12, c1.d dVar) {
            super(2);
            this.f3200a = qVar;
            this.f3201b = yVar;
            this.f3202c = t10;
            this.f3203d = i10;
            this.f3204e = i11;
            this.f3205f = w10;
            this.f3206g = q10;
            this.f3207h = c0Var;
            this.f3208i = iVar;
            this.f3209j = iVar2;
            this.f3210k = iVar3;
            this.f3211l = iVar4;
            this.f3212m = bVar;
            this.f3213n = g10;
            this.f3214o = z10;
            this.f3215p = z11;
            this.f3216q = lVar;
            this.f3217r = i12;
            this.f3218s = dVar;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-374338080, i11, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                }
                C1500m mVar3 = mVar;
                yf.q qVar = this.f3200a;
                qVar.invoke(g0.c.e(2032502107, true, new a(this.f3201b, this.f3202c, this.f3203d, this.f3204e, this.f3205f, this.f3206g, this.f3207h, this.f3208i, this.f3209j, this.f3210k, this.f3211l, this.f3212m, this.f3213n, this.f3214o, this.f3215p, this.f3216q, this.f3217r, this.f3218s), mVar3, 54), mVar3, 6);
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

        /* renamed from: J.i$e$a */
        static final class a extends C6498u implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1228y f3219a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q0.T f3220b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f3221c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f3222d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ W f3223e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Q f3224f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c0 f3225g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ i f3226h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ i f3227i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i f3228j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ i f3229k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ H.b f3230l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ G f3231m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ boolean f3232n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ boolean f3233o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ C6798l f3234p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ I f3235q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ c1.d f3236r;

            /* renamed from: J.i$e$a$b */
            static final class b extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1228y f3253a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C1228y yVar) {
                    super(0);
                    this.f3253a = yVar;
                }

                /* renamed from: a */
                public final a0 invoke() {
                    return this.f3253a.j();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1228y yVar, Q0.T t10, int i10, int i11, W w10, Q q10, c0 c0Var, i iVar, i iVar2, i iVar3, i iVar4, H.b bVar, G g10, boolean z10, boolean z11, C6798l lVar, I i12, c1.d dVar) {
                super(2);
                this.f3219a = yVar;
                this.f3220b = t10;
                this.f3221c = i10;
                this.f3222d = i11;
                this.f3223e = w10;
                this.f3224f = q10;
                this.f3225g = c0Var;
                this.f3226h = iVar;
                this.f3227i = iVar2;
                this.f3228j = iVar3;
                this.f3229k = iVar4;
                this.f3230l = bVar;
                this.f3231m = g10;
                this.f3232n = z10;
                this.f3233o = z11;
                this.f3234p = lVar;
                this.f3235q = i12;
                this.f3236r = dVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(2032502107, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                    }
                    i a10 = C1218n.a(androidx.compose.foundation.layout.q.k(i.f23074a, this.f3219a.k(), 0.0f, 2, (Object) null), this.f3220b, this.f3221c, this.f3222d);
                    W w10 = this.f3223e;
                    Q q10 = this.f3224f;
                    c0 c0Var = this.f3225g;
                    boolean C10 = mVar.C(this.f3219a);
                    C1228y yVar = this.f3219a;
                    Object A10 = mVar.A();
                    if (C10 || A10 == C1500m.f10026a.a()) {
                        A10 = new b(yVar);
                        mVar.r(A10);
                    }
                    D.a(androidx.compose.foundation.relocation.b.b(Y.a(V.c(a10, w10, q10, c0Var, (C6787a) A10).h(this.f3226h).h(this.f3227i), this.f3220b).h(this.f3228j).h(this.f3229k), this.f3230l), g0.c.e(-363167407, true, new C0072a(this.f3231m, this.f3219a, this.f3232n, this.f3233o, this.f3234p, this.f3224f, this.f3235q, this.f3236r, this.f3222d), mVar, 54), mVar, 48, 0);
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

            /* renamed from: J.i$e$a$a  reason: collision with other inner class name */
            static final class C0072a extends C6498u implements yf.p {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G f3237a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1228y f3238b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f3239c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f3240d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C6798l f3241e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Q f3242f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ I f3243g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ c1.d f3244h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ int f3245i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0072a(G g10, C1228y yVar, boolean z10, boolean z11, C6798l lVar, Q q10, I i10, c1.d dVar, int i11) {
                    super(2);
                    this.f3237a = g10;
                    this.f3238b = yVar;
                    this.f3239c = z10;
                    this.f3240d = z11;
                    this.f3241e = lVar;
                    this.f3242f = q10;
                    this.f3243g = i10;
                    this.f3244h = dVar;
                    this.f3245i = i11;
                }

                /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
                /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(Y.C1500m r11, int r12) {
                    /*
                        r10 = this;
                        r0 = r12 & 3
                        r1 = 2
                        if (r0 != r1) goto L_0x0011
                        boolean r0 = r11.i()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0011
                    L_0x000c:
                        r11.I()
                        goto L_0x0102
                    L_0x0011:
                        boolean r0 = Y.C1506p.H()
                        if (r0 == 0) goto L_0x0020
                        r0 = -1
                        java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"
                        r2 = -363167407(0xffffffffea5a8151, float:-6.6039127E25)
                        Y.C1506p.Q(r2, r12, r0, r1)
                    L_0x0020:
                        J.i$e$a$a$a r12 = new J.i$e$a$a$a
                        J.y r4 = r10.f3238b
                        yf.l r5 = r10.f3241e
                        W0.Q r6 = r10.f3242f
                        W0.I r7 = r10.f3243g
                        c1.d r8 = r10.f3244h
                        int r9 = r10.f3245i
                        r3 = r12
                        r3.<init>(r4, r5, r6, r7, r8, r9)
                        k0.i$a r0 = k0.i.f23074a
                        r1 = 0
                        int r2 = Y.C1494j.a(r11, r1)
                        Y.y r3 = r11.p()
                        k0.i r0 = k0.h.e(r11, r0)
                        J0.g$a r4 = J0.C1241g.f3853J
                        yf.a r5 = r4.a()
                        Y.f r6 = r11.j()
                        if (r6 != 0) goto L_0x0050
                        Y.C1494j.c()
                    L_0x0050:
                        r11.F()
                        boolean r6 = r11.f()
                        if (r6 == 0) goto L_0x005d
                        r11.U(r5)
                        goto L_0x0060
                    L_0x005d:
                        r11.q()
                    L_0x0060:
                        Y.m r5 = Y.F1.a(r11)
                        yf.p r6 = r4.c()
                        Y.F1.b(r5, r12, r6)
                        yf.p r12 = r4.e()
                        Y.F1.b(r5, r3, r12)
                        yf.p r12 = r4.b()
                        boolean r3 = r5.f()
                        if (r3 != 0) goto L_0x008a
                        java.lang.Object r3 = r5.A()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r6)
                        if (r3 != 0) goto L_0x0098
                    L_0x008a:
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                        r5.r(r3)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r5.V(r2, r12)
                    L_0x0098:
                        yf.p r12 = r4.d()
                        Y.F1.b(r5, r0, r12)
                        r11.u()
                        P.G r12 = r10.f3237a
                        J.y r0 = r10.f3238b
                        J.m r0 = r0.d()
                        J.m r2 = J.C1217m.None
                        if (r0 == r2) goto L_0x00cb
                        J.y r0 = r10.f3238b
                        H0.s r0 = r0.i()
                        if (r0 == 0) goto L_0x00cb
                        J.y r0 = r10.f3238b
                        H0.s r0 = r0.i()
                        kotlin.jvm.internal.C6496s.e(r0)
                        boolean r0 = r0.G()
                        if (r0 == 0) goto L_0x00cb
                        boolean r0 = r10.f3239c
                        if (r0 == 0) goto L_0x00cb
                        r0 = 1
                        goto L_0x00cc
                    L_0x00cb:
                        r0 = r1
                    L_0x00cc:
                        J.C1213i.d(r12, r0, r11, r1)
                        J.y r12 = r10.f3238b
                        J.m r12 = r12.d()
                        J.m r0 = J.C1217m.Cursor
                        if (r12 != r0) goto L_0x00f0
                        boolean r12 = r10.f3240d
                        if (r12 != 0) goto L_0x00f0
                        boolean r12 = r10.f3239c
                        if (r12 == 0) goto L_0x00f0
                        r12 = -2032274(0xffffffffffe0fd6e, float:NaN)
                        r11.T(r12)
                        P.G r12 = r10.f3237a
                        J.C1213i.e(r12, r11, r1)
                        r11.M()
                        goto L_0x00f9
                    L_0x00f0:
                        r12 = -1955394(0xffffffffffe229be, float:NaN)
                        r11.T(r12)
                        r11.M()
                    L_0x00f9:
                        boolean r11 = Y.C1506p.H()
                        if (r11 == 0) goto L_0x0102
                        Y.C1506p.P()
                    L_0x0102:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J.C1213i.e.a.C0072a.a(Y.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                /* renamed from: J.i$e$a$a$a  reason: collision with other inner class name */
                public static final class C0073a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C1228y f3246a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C6798l f3247b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Q f3248c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ I f3249d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ c1.d f3250e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ int f3251f;

                    C0073a(C1228y yVar, C6798l lVar, Q q10, I i10, c1.d dVar, int i11) {
                        this.f3246a = yVar;
                        this.f3247b = lVar;
                        this.f3248c = q10;
                        this.f3249d = i10;
                        this.f3250e = dVar;
                        this.f3251f = i11;
                    }

                    public int b(C1194o oVar, List list, int i10) {
                        this.f3246a.v().m(oVar.getLayoutDirection());
                        return this.f3246a.v().c();
                    }

                    public H0.G j(H0.H h10, List list, long j10) {
                        C6798l lVar;
                        Q0.L l10;
                        C2057k.a aVar = C2057k.f21728e;
                        C1228y yVar = this.f3246a;
                        C2057k d10 = aVar.d();
                        C1197s sVar = null;
                        if (d10 != null) {
                            lVar = d10.h();
                        } else {
                            lVar = null;
                        }
                        C2057k f10 = aVar.f(d10);
                        try {
                            a0 j11 = yVar.j();
                            if (j11 != null) {
                                l10 = j11.f();
                            } else {
                                l10 = null;
                            }
                            z d11 = M.f2895a.d(this.f3246a.v(), j10, h10.getLayoutDirection(), l10);
                            int intValue = ((Number) d11.a()).intValue();
                            int intValue2 = ((Number) d11.b()).intValue();
                            Q0.L l11 = (Q0.L) d11.c();
                            if (!C6496s.c(l10, l11)) {
                                C1228y yVar2 = this.f3246a;
                                if (j11 != null) {
                                    sVar = j11.b();
                                }
                                yVar2.G(new a0(l11, (C1197s) null, sVar, 2, (DefaultConstructorMarker) null));
                                this.f3247b.invoke(l11);
                                C1213i.o(this.f3246a, this.f3248c, this.f3249d);
                            }
                            C1228y yVar3 = this.f3246a;
                            c1.d dVar = this.f3250e;
                            int i10 = 0;
                            if (this.f3251f == 1) {
                                i10 = J.a(l11.m(0));
                            }
                            yVar3.H(dVar.E(i10));
                            return h10.d1(intValue, intValue2, O.l(C6502A.a(C1181b.a(), Integer.valueOf(Math.round(l11.h()))), C6502A.a(C1181b.b(), Integer.valueOf(Math.round(l11.k())))), C0074a.f3252a);
                        } finally {
                            aVar.m(d10, f10, lVar);
                        }
                    }

                    /* renamed from: J.i$e$a$a$a$a  reason: collision with other inner class name */
                    static final class C0074a extends C6498u implements C6798l {

                        /* renamed from: a  reason: collision with root package name */
                        public static final C0074a f3252a = new C0074a();

                        C0074a() {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((U.a) obj);
                            return C6514M.f71813a;
                        }

                        public final void a(U.a aVar) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: J.i$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3182a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q0.L) obj);
            return C6514M.f71813a;
        }

        public final void a(Q0.L l10) {
        }
    }
}

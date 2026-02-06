package V;

import C.C1085c;
import C.W;
import C.Z;
import C.f0;
import Ef.m;
import H0.C1181b;
import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import O0.v;
import Q0.T;
import Ug.K;
import W.u;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.J0;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k0.c;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import r0.C2544x0;
import r0.b2;
import r0.g2;
import rf.C6680b;
import w.C2812x;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: V.e  reason: case insensitive filesystem */
public abstract class C1377e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7389a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f7390b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f7391c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f7392d;

    /* renamed from: e  reason: collision with root package name */
    private static final C2812x f7393e = new C2812x(0.8f, 0.0f, 0.8f, 0.15f);

    /* renamed from: f  reason: collision with root package name */
    private static final float f7394f = c1.h.j((float) 24);

    /* renamed from: g  reason: collision with root package name */
    private static final float f7395g = c1.h.j((float) 28);

    /* renamed from: h  reason: collision with root package name */
    private static final float f7396h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final float f7397i;

    /* renamed from: V.e$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f7398a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(W0 w02, float f10) {
            super(0);
            this.f7398a = f10;
        }

        public final void invoke() {
            C6496s.b((Float) null, -this.f7398a);
        }
    }

    /* renamed from: V.e$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0 f7399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U0 f7401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7402d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f7403e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7404f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f7405g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f7406h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f0 f0Var, float f10, W0 w02, U0 u02, p pVar, T t10, boolean z10, p pVar2, p pVar3) {
            super(2);
            this.f7399a = f0Var;
            this.f7400b = f10;
            this.f7401c = u02;
            this.f7402d = pVar;
            this.f7403e = t10;
            this.f7404f = z10;
            this.f7405g = pVar2;
            this.f7406h = pVar3;
        }

        /* access modifiers changed from: private */
        public static final float c(W0 w02) {
            if (w02 == null) {
                return 0.0f;
            }
            w02.getState();
            return 0.0f;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: V.z0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(Y.C1500m r22, int r23) {
            /*
                r21 = this;
                r0 = r21
                r13 = r22
                r1 = r23
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r22.i()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r22.I()
                goto L_0x00a4
            L_0x0017:
                boolean r2 = Y.C1506p.H()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)"
                r4 = -1943739546(0xffffffff8c24e366, float:-1.2702531E-31)
                Y.C1506p.Q(r4, r1, r2, r3)
            L_0x0026:
                k0.i$a r1 = k0.i.f23074a
                C.f0 r2 = r0.f7399a
                k0.i r1 = C.i0.d(r1, r2)
                k0.i r1 = o0.C2342e.b(r1)
                float r2 = r0.f7400b
                r3 = 1
                r4 = 0
                r5 = 0
                k0.i r1 = androidx.compose.foundation.layout.q.k(r1, r4, r2, r3, r5)
                boolean r2 = r13.S(r5)
                java.lang.Object r3 = r22.A()
                if (r2 != 0) goto L_0x004d
                Y.m$a r2 = Y.C1500m.f10026a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0055
            L_0x004d:
                V.f r3 = new V.f
                r3.<init>(r5)
                r13.r(r3)
            L_0x0055:
                r2 = r3
                V.z0 r2 = (V.C1419z0) r2
                V.U0 r3 = r0.f7401c
                long r3 = r3.d()
                V.U0 r5 = r0.f7401c
                long r5 = r5.e()
                V.U0 r7 = r0.f7401c
                long r7 = r7.c()
                yf.p r9 = r0.f7402d
                Q0.T r10 = r0.f7403e
                C.c r11 = C.C1085c.f882a
                C.c$f r12 = r11.b()
                boolean r14 = r0.f7404f
                if (r14 == 0) goto L_0x007f
                C.c$f r11 = r11.b()
            L_0x007c:
                r18 = r11
                goto L_0x0084
            L_0x007f:
                C.c$e r11 = r11.f()
                goto L_0x007c
            L_0x0084:
                yf.p r11 = r0.f7405g
                r16 = r11
                yf.p r11 = r0.f7406h
                r17 = r11
                r19 = 113246208(0x6c00000, float:7.2222373E-35)
                r20 = 3126(0xc36, float:4.38E-42)
                r11 = 1065353216(0x3f800000, float:1.0)
                r14 = 0
                r15 = 0
                r13 = r18
                r18 = r22
                V.C1377e.e(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r1 = Y.C1506p.H()
                if (r1 == 0) goto L_0x00a4
                Y.C1506p.P()
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.C1377e.b.b(Y.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.e$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0.i f7407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7408b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f7409c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f7410d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7411e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f7412f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7413g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f0 f7414h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ U0 f7415i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f7416j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7417k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k0.i iVar, p pVar, T t10, boolean z10, p pVar2, q qVar, float f10, f0 f0Var, U0 u02, W0 w02, int i10, int i11) {
            super(2);
            this.f7407a = iVar;
            this.f7408b = pVar;
            this.f7409c = t10;
            this.f7410d = z10;
            this.f7411e = pVar2;
            this.f7412f = qVar;
            this.f7413g = f10;
            this.f7414h = f0Var;
            this.f7415i = u02;
            this.f7416j = i10;
            this.f7417k = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1377e.a(this.f7407a, this.f7408b, this.f7409c, this.f7410d, this.f7411e, this.f7412f, this.f7413g, this.f7414h, this.f7415i, (W0) null, mVar, M0.a(this.f7416j | 1), this.f7417k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.e$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f7418a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(q qVar) {
            super(2);
            this.f7418a = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1370231018, i10, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                }
                C1085c.e c10 = C1085c.f882a.c();
                c.C0368c i11 = k0.c.f23044a.i();
                q qVar = this.f7418a;
                i.a aVar = k0.i.f23074a;
                F b10 = W.b(c10, i11, mVar, 54);
                int a10 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, aVar);
                C1241g.a aVar2 = C1241g.f3853J;
                C6787a a11 = aVar2.a();
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
                F1.b(a12, b10, aVar2.c());
                F1.b(a12, p10, aVar2.e());
                p b11 = aVar2.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b11);
                }
                F1.b(a12, e10, aVar2.d());
                qVar.invoke(Z.f873a, mVar, 6);
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

    /* renamed from: V.e$e  reason: collision with other inner class name */
    static final class C0165e extends C6498u implements C6798l {
        C0165e(W0 w02) {
            super(1);
        }

        public final void a(float f10) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.e$f */
    static final class f extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f7419a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ float f7420b;

        f(W0 w02, C6658d dVar) {
            super(3, dVar);
        }

        public final Object i(K k10, float f10, C6658d dVar) {
            f fVar = new f((W0) null, dVar);
            fVar.f7420b = f10;
            return fVar.invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((K) obj, ((Number) obj2).floatValue(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            int i10 = this.f7419a;
            if (i10 == 0) {
                w.b(obj);
                throw null;
            } else if (i10 == 1) {
                w.b(obj);
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: V.e$g */
    static final class g extends C6498u implements C6787a {
        g(W0 w02) {
            super(0);
        }

        /* renamed from: a */
        public final Float invoke() {
            float f10 = 0.0f;
            if (0.0f > 0.01f) {
                f10 = 1.0f;
            }
            return Float.valueOf(f10);
        }
    }

    /* renamed from: V.e$h */
    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f7422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f7424d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f7425e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f7426f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ U0 f7427g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7428h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f7429i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(p pVar, k0.i iVar, p pVar2, q qVar, float f10, f0 f0Var, U0 u02, W0 w02, int i10, int i11) {
            super(2);
            this.f7421a = pVar;
            this.f7422b = iVar;
            this.f7423c = pVar2;
            this.f7424d = qVar;
            this.f7425e = f10;
            this.f7426f = f0Var;
            this.f7427g = u02;
            this.f7428h = i10;
            this.f7429i = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1377e.d(this.f7421a, this.f7422b, this.f7423c, this.f7424d, this.f7425e, this.f7426f, this.f7427g, (W0) null, mVar, M0.a(this.f7428h | 1), this.f7429i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.e$j */
    static final class j implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1419z0 f7431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1085c.e f7432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1085c.m f7433c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7434d;

        /* renamed from: V.e$j$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f7435a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f7436b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ U f7437c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1085c.e f7438d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f7439e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ U f7440f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ H f7441g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C1085c.m f7442h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f7443i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f7444j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(U u10, int i10, U u11, C1085c.e eVar, long j10, U u12, H h10, C1085c.m mVar, int i11, int i12) {
                super(1);
                this.f7435a = u10;
                this.f7436b = i10;
                this.f7437c = u11;
                this.f7438d = eVar;
                this.f7439e = j10;
                this.f7440f = u12;
                this.f7441g = h10;
                this.f7442h = mVar;
                this.f7443i = i11;
                this.f7444j = i12;
            }

            public final void a(U.a aVar) {
                int max;
                int i10;
                int R02;
                int l10;
                U u10 = this.f7435a;
                U.a.l(aVar, u10, 0, (this.f7436b - u10.R0()) / 2, 0.0f, 4, (Object) null);
                U u11 = this.f7437c;
                C1085c.e eVar = this.f7438d;
                C1085c cVar = C1085c.f882a;
                if (C6496s.c(eVar, cVar.b())) {
                    max = (c1.b.l(this.f7439e) - this.f7437c.X0()) / 2;
                    if (max < this.f7435a.X0()) {
                        l10 = this.f7435a.X0() - max;
                    } else if (this.f7437c.X0() + max > c1.b.l(this.f7439e) - this.f7440f.X0()) {
                        l10 = (c1.b.l(this.f7439e) - this.f7440f.X0()) - (this.f7437c.X0() + max);
                    }
                    max += l10;
                } else if (C6496s.c(eVar, cVar.c())) {
                    max = (c1.b.l(this.f7439e) - this.f7437c.X0()) - this.f7440f.X0();
                } else {
                    max = Math.max(this.f7441g.E0(C1377e.f7397i), this.f7435a.X0());
                }
                int i11 = max;
                C1085c.m mVar = this.f7442h;
                if (C6496s.c(mVar, cVar.b())) {
                    R02 = (this.f7436b - this.f7437c.R0()) / 2;
                } else {
                    if (C6496s.c(mVar, cVar.a())) {
                        int i12 = this.f7443i;
                        if (i12 == 0) {
                            R02 = this.f7436b - this.f7437c.R0();
                        } else {
                            int R03 = i12 - (this.f7437c.R0() - this.f7444j);
                            int R04 = this.f7437c.R0() + R03;
                            if (R04 > c1.b.k(this.f7439e)) {
                                R03 -= R04 - c1.b.k(this.f7439e);
                            }
                            i10 = (this.f7436b - this.f7437c.R0()) - Math.max(0, R03);
                        }
                    } else {
                        i10 = 0;
                    }
                    U.a.l(aVar, u11, i11, i10, 0.0f, 4, (Object) null);
                    U.a.l(aVar, this.f7440f, c1.b.l(this.f7439e) - this.f7440f.X0(), (this.f7436b - this.f7440f.R0()) / 2, 0.0f, 4, (Object) null);
                }
                i10 = R02;
                U.a.l(aVar, u11, i11, i10, 0.0f, 4, (Object) null);
                U.a.l(aVar, this.f7440f, c1.b.l(this.f7439e) - this.f7440f.X0(), (this.f7436b - this.f7440f.R0()) / 2, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        j(C1419z0 z0Var, C1085c.e eVar, C1085c.m mVar, int i10) {
            this.f7431a = z0Var;
            this.f7432b = eVar;
            this.f7433c = mVar;
            this.f7434d = i10;
        }

        public final G j(H h10, List list, long j10) {
            int d10;
            int i10;
            int k10;
            List list2 = list;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                E e10 = (E) list2.get(i12);
                if (C6496s.c(androidx.compose.ui.layout.a.a(e10), "navigationIcon")) {
                    U v02 = e10.v0(c1.b.d(j10, 0, 0, 0, 0, 14, (Object) null));
                    int size2 = list.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        E e11 = (E) list2.get(i13);
                        if (C6496s.c(androidx.compose.ui.layout.a.a(e11), "actionIcons")) {
                            U v03 = e11.v0(c1.b.d(j10, 0, 0, 0, 0, 14, (Object) null));
                            if (c1.b.l(j10) == Integer.MAX_VALUE) {
                                d10 = c1.b.l(j10);
                            } else {
                                d10 = m.d((c1.b.l(j10) - v02.X0()) - v03.X0(), 0);
                            }
                            int i14 = d10;
                            int size3 = list.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                E e12 = (E) list2.get(i15);
                                if (C6496s.c(androidx.compose.ui.layout.a.a(e12), com.amazon.a.a.o.b.f37461S)) {
                                    U v04 = e12.v0(c1.b.d(j10, 0, i14, 0, 0, 12, (Object) null));
                                    if (v04.k0(C1181b.b()) != Integer.MIN_VALUE) {
                                        i10 = v04.k0(C1181b.b());
                                    } else {
                                        i10 = 0;
                                    }
                                    float a10 = this.f7431a.a();
                                    if (!Float.isNaN(a10)) {
                                        i11 = Af.a.d(a10);
                                    }
                                    if (c1.b.k(j10) == Integer.MAX_VALUE) {
                                        k10 = c1.b.k(j10);
                                    } else {
                                        k10 = c1.b.k(j10) + i11;
                                    }
                                    int i16 = k10;
                                    return H.N(h10, c1.b.l(j10), i16, (Map) null, new a(v02, i16, v04, this.f7432b, j10, v03, h10, this.f7433c, this.f7434d, i10), 4, (Object) null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: V.e$k */
    static final class k extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0.i f7445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1419z0 f7446b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7447c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7448d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7449e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f7450f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T f7451g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7452h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C1085c.m f7453i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C1085c.e f7454j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7455k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f7456l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f7457m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p f7458n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7459o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7460p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(k0.i iVar, C1419z0 z0Var, long j10, long j11, long j12, p pVar, T t10, float f10, C1085c.m mVar, C1085c.e eVar, int i10, boolean z10, p pVar2, p pVar3, int i11, int i12) {
            super(2);
            this.f7445a = iVar;
            this.f7446b = z0Var;
            this.f7447c = j10;
            this.f7448d = j11;
            this.f7449e = j12;
            this.f7450f = pVar;
            this.f7451g = t10;
            this.f7452h = f10;
            this.f7453i = mVar;
            this.f7454j = eVar;
            this.f7455k = i10;
            this.f7456l = z10;
            this.f7457m = pVar2;
            this.f7458n = pVar3;
            this.f7459o = i11;
            this.f7460p = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            k0.i iVar = this.f7445a;
            k0.i iVar2 = iVar;
            C1377e.e(iVar2, this.f7446b, this.f7447c, this.f7448d, this.f7449e, this.f7450f, this.f7451g, this.f7452h, this.f7453i, this.f7454j, this.f7455k, this.f7456l, this.f7457m, this.f7458n, mVar2, M0.a(this.f7459o | 1), M0.a(this.f7460p));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static {
        float f10 = (float) 16;
        float f11 = (float) 12;
        float j10 = c1.h.j(c1.h.j(f10) - c1.h.j(f11));
        f7389a = j10;
        float j11 = c1.h.j(c1.h.j(f10) - c1.h.j(f11));
        f7390b = j11;
        f7391c = c1.h.j(c1.h.j(f10) - j10);
        f7392d = c1.h.j(c1.h.j(f11) - j11);
        float j12 = c1.h.j((float) 4);
        f7396h = j12;
        f7397i = c1.h.j(c1.h.j(f10) - j12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: yf.q} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k0.i r33, yf.p r34, Q0.T r35, boolean r36, yf.p r37, yf.q r38, float r39, C.f0 r40, V.U0 r41, V.W0 r42, Y.C1500m r43, int r44, int r45) {
        /*
            r6 = r38
            r5 = r39
            r4 = r41
            r3 = r42
            r2 = r44
            r1 = r45
            r0 = -342194911(0xffffffffeb9a8521, float:-3.7360652E26)
            r7 = r43
            Y.m r15 = r7.h(r0)
            r7 = r1 & 1
            if (r7 == 0) goto L_0x001f
            r8 = r2 | 6
            r9 = r8
            r8 = r33
            goto L_0x0033
        L_0x001f:
            r8 = r2 & 6
            if (r8 != 0) goto L_0x0030
            r8 = r33
            boolean r9 = r15.S(r8)
            if (r9 == 0) goto L_0x002d
            r9 = 4
            goto L_0x002e
        L_0x002d:
            r9 = 2
        L_0x002e:
            r9 = r9 | r2
            goto L_0x0033
        L_0x0030:
            r8 = r33
            r9 = r2
        L_0x0033:
            r10 = r1 & 2
            if (r10 == 0) goto L_0x003c
            r9 = r9 | 48
            r14 = r34
            goto L_0x004e
        L_0x003c:
            r10 = r2 & 48
            r14 = r34
            if (r10 != 0) goto L_0x004e
            boolean r10 = r15.C(r14)
            if (r10 == 0) goto L_0x004b
            r10 = 32
            goto L_0x004d
        L_0x004b:
            r10 = 16
        L_0x004d:
            r9 = r9 | r10
        L_0x004e:
            r10 = r1 & 4
            if (r10 == 0) goto L_0x0057
            r9 = r9 | 384(0x180, float:5.38E-43)
            r13 = r35
            goto L_0x0069
        L_0x0057:
            r10 = r2 & 384(0x180, float:5.38E-43)
            r13 = r35
            if (r10 != 0) goto L_0x0069
            boolean r10 = r15.S(r13)
            if (r10 == 0) goto L_0x0066
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r9 = r9 | r10
        L_0x0069:
            r10 = r1 & 8
            if (r10 == 0) goto L_0x0072
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r12 = r36
            goto L_0x0084
        L_0x0072:
            r10 = r2 & 3072(0xc00, float:4.305E-42)
            r12 = r36
            if (r10 != 0) goto L_0x0084
            boolean r10 = r15.b(r12)
            if (r10 == 0) goto L_0x0081
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r9 = r9 | r10
        L_0x0084:
            r10 = r1 & 16
            if (r10 == 0) goto L_0x008d
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r11 = r37
            goto L_0x009f
        L_0x008d:
            r10 = r2 & 24576(0x6000, float:3.4438E-41)
            r11 = r37
            if (r10 != 0) goto L_0x009f
            boolean r10 = r15.C(r11)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r9 = r9 | r10
        L_0x009f:
            r10 = r1 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a8
            r9 = r9 | r16
            goto L_0x00b8
        L_0x00a8:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00b8
            boolean r10 = r15.C(r6)
            if (r10 == 0) goto L_0x00b5
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r9 = r9 | r10
        L_0x00b8:
            r10 = r1 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L_0x00c1
            r9 = r9 | r16
            goto L_0x00d1
        L_0x00c1:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r15.c(r5)
            if (r10 == 0) goto L_0x00ce
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r9 = r9 | r10
        L_0x00d1:
            r10 = r1 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00dc
            r9 = r9 | r16
        L_0x00d9:
            r10 = r40
            goto L_0x00ef
        L_0x00dc:
            r10 = r2 & r16
            if (r10 != 0) goto L_0x00d9
            r10 = r40
            boolean r16 = r15.S(r10)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r9 = r9 | r16
        L_0x00ef:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f8
            r9 = r9 | r17
            goto L_0x0108
        L_0x00f8:
            r0 = r2 & r17
            if (r0 != 0) goto L_0x0108
            boolean r0 = r15.S(r4)
            if (r0 == 0) goto L_0x0105
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r9 = r9 | r0
        L_0x0108:
            r0 = r1 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0111
            r9 = r9 | r17
            goto L_0x0121
        L_0x0111:
            r0 = r2 & r17
            if (r0 != 0) goto L_0x0121
            boolean r0 = r15.S(r3)
            if (r0 == 0) goto L_0x011e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0120
        L_0x011e:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0120:
            r9 = r9 | r0
        L_0x0121:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r9
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r14) goto L_0x0138
            boolean r0 = r15.i()
            if (r0 != 0) goto L_0x0131
            goto L_0x0138
        L_0x0131:
            r15.I()
            r1 = r8
            r3 = r15
            goto L_0x02b6
        L_0x0138:
            if (r7 == 0) goto L_0x013d
            k0.i$a r0 = k0.i.f23074a
            goto L_0x013e
        L_0x013d:
            r0 = r8
        L_0x013e:
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x014d
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)"
            r14 = -342194911(0xffffffffeb9a8521, float:-3.7360652E26)
            Y.C1506p.Q(r14, r9, r7, r8)
        L_0x014d:
            boolean r7 = java.lang.Float.isNaN(r39)
            if (r7 != 0) goto L_0x02dc
            r7 = 2139095040(0x7f800000, float:Infinity)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x015b
            r7 = 1
            goto L_0x015c
        L_0x015b:
            r7 = 0
        L_0x015c:
            if (r7 != 0) goto L_0x02dc
            Y.I0 r7 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r7 = r15.m(r7)
            c1.d r7 = (c1.d) r7
            float r7 = r7.t1(r5)
            r8 = 0
            float r7 = Ef.m.c(r7, r8)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r16
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r8) goto L_0x017b
            r8 = 1
            goto L_0x017c
        L_0x017b:
            r8 = 0
        L_0x017c:
            boolean r17 = r15.c(r7)
            r8 = r8 | r17
            java.lang.Object r14 = r15.A()
            if (r8 != 0) goto L_0x0190
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x0198
        L_0x0190:
            V.e$a r14 = new V.e$a
            r14.<init>(r3, r7)
            r15.r(r14)
        L_0x0198:
            yf.a r14 = (yf.C6787a) r14
            r7 = 0
            Y.P.h(r14, r15, r7)
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r14) goto L_0x01a4
            r8 = 1
            goto L_0x01a5
        L_0x01a4:
            r8 = r7
        L_0x01a5:
            java.lang.Object r7 = r15.A()
            if (r8 != 0) goto L_0x01b3
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x01bf
        L_0x01b3:
            V.e$g r7 = new V.e$g
            r7.<init>(r3)
            Y.A1 r7 = Y.p1.e(r7)
            r15.r(r7)
        L_0x01bf:
            Y.A1 r7 = (Y.A1) r7
            float r7 = c(r7)
            long r7 = r4.a(r7)
            r14 = 1137180672(0x43c80000, float:400.0)
            r1 = 5
            r13 = 0
            r2 = 0
            w.g0 r1 = w.C2798j.h(r2, r14, r13, r1, r13)
            r2 = 48
            r14 = 12
            r16 = 0
            r18 = 0
            r17 = 0
            r21 = r9
            r9 = r1
            r10 = r16
            r11 = r18
            r12 = r15
            r1 = r13
            r13 = r2
            r2 = r17
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            Y.A1 r7 = v.C2737t.a(r7, r9, r10, r11, r12, r13, r14)
            V.e$d r8 = new V.e$d
            r8.<init>(r6)
            r9 = 54
            r10 = 1370231018(0x51ac10ea, float:9.2377268E10)
            r14 = 1
            g0.a r17 = g0.c.e(r10, r14, r8, r15, r9)
            r8 = -1193605157(0xffffffffb8db07db, float:-1.0444197E-4)
            r15.T(r8)
            if (r3 == 0) goto L_0x0263
            boolean r8 = r42.a()
            if (r8 != 0) goto L_0x0263
            k0.i$a r22 = k0.i.f23074a
            z.q r24 = z.q.Vertical
            r8 = r21
            if (r8 != r1) goto L_0x0215
            r9 = r14
            goto L_0x0216
        L_0x0215:
            r9 = r2
        L_0x0216:
            java.lang.Object r10 = r15.A()
            if (r9 != 0) goto L_0x0224
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x022c
        L_0x0224:
            V.e$e r10 = new V.e$e
            r10.<init>(r3)
            r15.r(r10)
        L_0x022c:
            yf.l r10 = (yf.C6798l) r10
            z.m r23 = z.l.i(r10, r15, r2)
            if (r8 != r1) goto L_0x0235
            r2 = r14
        L_0x0235:
            java.lang.Object r1 = r15.A()
            if (r2 != 0) goto L_0x0243
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x024c
        L_0x0243:
            V.e$f r1 = new V.e$f
            r2 = 0
            r1.<init>(r3, r2)
            r15.r(r1)
        L_0x024c:
            r29 = r1
            yf.q r29 = (yf.q) r29
            r31 = 188(0xbc, float:2.63E-43)
            r32 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            k0.i r1 = z.l.h(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0265
        L_0x0263:
            k0.i$a r1 = k0.i.f23074a
        L_0x0265:
            r15.M()
            k0.i r1 = r0.h(r1)
            long r18 = b(r7)
            V.e$b r2 = new V.e$b
            r7 = r2
            r8 = r40
            r9 = r39
            r10 = r42
            r11 = r41
            r12 = r34
            r13 = r35
            r20 = r0
            r0 = r14
            r14 = r36
            r3 = r15
            r15 = r37
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 54
            r8 = -1943739546(0xffffffff8c24e366, float:-1.2702531E-31)
            g0.a r16 = g0.c.e(r8, r0, r2, r3, r7)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = 122(0x7a, float:1.71E-43)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7 = r1
            r9 = r18
            r17 = r3
            r18 = r0
            r19 = r2
            V.O0.a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x02b4
            Y.C1506p.P()
        L_0x02b4:
            r1 = r20
        L_0x02b6:
            Y.Y0 r13 = r3.k()
            if (r13 == 0) goto L_0x02db
            V.e$c r14 = new V.e$c
            r0 = r14
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r44
            r12 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x02db:
            return
        L_0x02dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The expandedHeight is expected to be specified and finite"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1377e.a(k0.i, yf.p, Q0.T, boolean, yf.p, yf.q, float, C.f0, V.U0, V.W0, Y.m, int, int):void");
    }

    private static final long b(A1 a12) {
        return ((C2544x0) a12.getValue()).y();
    }

    private static final float c(A1 a12) {
        return ((Number) a12.getValue()).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(yf.p r24, k0.i r25, yf.p r26, yf.q r27, float r28, C.f0 r29, V.U0 r30, V.W0 r31, Y.C1500m r32, int r33, int r34) {
        /*
            r9 = r33
            r10 = r34
            r0 = 226148675(0xd7ac143, float:7.726983E-31)
            r1 = r32
            Y.m r1 = r1.h(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r25
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r25
            boolean r6 = r1.S(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r8 = r1.C(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r1.C(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r28
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r1.c(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b1
            r14 = r10 & 32
            if (r14 != 0) goto L_0x00ab
            r14 = r29
            boolean r15 = r1.S(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r14 = r29
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
            goto L_0x00b3
        L_0x00b1:
            r14 = r29
        L_0x00b3:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00ce
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c7
            r15 = r30
            boolean r16 = r1.S(r15)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c7:
            r15 = r30
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r15 = r30
        L_0x00d0:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
            r2 = r31
            goto L_0x00ee
        L_0x00db:
            r17 = r9 & r17
            r2 = r31
            if (r17 != 0) goto L_0x00ee
            boolean r17 = r1.S(r2)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r5) goto L_0x010d
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x00ff
            goto L_0x010d
        L_0x00ff:
            r1.I()
            r2 = r25
            r8 = r31
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            goto L_0x0200
        L_0x010d:
            r1.D()
            r2 = r9 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = 6
            if (r2 == 0) goto L_0x013a
            boolean r2 = r1.L()
            if (r2 == 0) goto L_0x011f
            goto L_0x013a
        L_0x011f:
            r1.I()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x0128
            r3 = r3 & r17
        L_0x0128:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0130
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0130:
            r2 = r25
        L_0x0132:
            r8 = r31
        L_0x0134:
            r0 = r11
            r4 = r14
            r6 = r15
            r11 = r3
            r3 = r13
            goto L_0x017d
        L_0x013a:
            if (r4 == 0) goto L_0x013f
            k0.i$a r2 = k0.i.f23074a
            goto L_0x0141
        L_0x013f:
            r2 = r25
        L_0x0141:
            if (r6 == 0) goto L_0x014a
            V.u r4 = V.C1408u.f8019a
            yf.p r4 = r4.a()
            r7 = r4
        L_0x014a:
            if (r8 == 0) goto L_0x0153
            V.u r4 = V.C1408u.f8019a
            yf.q r4 = r4.b()
            r11 = r4
        L_0x0153:
            if (r12 == 0) goto L_0x015c
            V.V0 r4 = V.V0.f7135a
            float r4 = r4.b()
            r13 = r4
        L_0x015c:
            r4 = r10 & 32
            if (r4 == 0) goto L_0x0169
            V.V0 r4 = V.V0.f7135a
            C.f0 r4 = r4.c(r1, r5)
            r3 = r3 & r17
            r14 = r4
        L_0x0169:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x0178
            V.V0 r4 = V.V0.f7135a
            V.U0 r4 = r4.d(r1, r5)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            r15 = r4
        L_0x0178:
            if (r0 == 0) goto L_0x0132
            r0 = 0
            r8 = r0
            goto L_0x0134
        L_0x017d:
            r1.v()
            boolean r12 = Y.C1506p.H()
            if (r12 == 0) goto L_0x018f
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.TopAppBar (AppBar.kt:208)"
            r14 = 226148675(0xd7ac143, float:7.726983E-31)
            Y.C1506p.Q(r14, r11, r12, r13)
        L_0x018f:
            X.E r12 = X.E.f8756a
            X.H r12 = r12.d()
            Q0.T r13 = V.Z0.c(r12, r1, r5)
            c1.h$a r12 = c1.h.f19213b
            float r14 = r12.c()
            boolean r14 = c1.h.m(r3, r14)
            if (r14 != 0) goto L_0x01b3
            float r12 = r12.b()
            boolean r12 = c1.h.m(r3, r12)
            if (r12 == 0) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r17 = r3
            goto L_0x01bb
        L_0x01b3:
            V.V0 r12 = V.V0.f7135a
            float r12 = r12.b()
            r17 = r12
        L_0x01bb:
            int r12 = r11 >> 3
            r12 = r12 & 14
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            int r14 = r11 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r14
            int r5 = r11 << 6
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r5
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r5
            r11 = r11 | r12
            r12 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r12
            r22 = r11 | r5
            r23 = 0
            r14 = 0
            r11 = r2
            r12 = r24
            r15 = r7
            r16 = r0
            r18 = r4
            r19 = r6
            r20 = r8
            r21 = r1
            a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r5 = Y.C1506p.H()
            if (r5 == 0) goto L_0x01fb
            Y.C1506p.P()
        L_0x01fb:
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r4
            r4 = r0
        L_0x0200:
            Y.Y0 r11 = r1.k()
            if (r11 == 0) goto L_0x0215
            V.e$h r12 = new V.e$h
            r0 = r12
            r1 = r24
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1377e.d(yf.p, k0.i, yf.p, yf.q, float, C.f0, V.U0, V.W0, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void e(k0.i iVar, C1419z0 z0Var, long j10, long j11, long j12, p pVar, T t10, float f10, C1085c.m mVar, C1085c.e eVar, int i10, boolean z10, p pVar2, p pVar3, C1500m mVar2, int i11, int i12) {
        int i13;
        int i14;
        k0.i iVar2 = iVar;
        C1419z0 z0Var2 = z0Var;
        C1085c.m mVar3 = mVar;
        C1085c.e eVar2 = eVar;
        int i15 = i10;
        boolean z11 = z10;
        p pVar4 = pVar2;
        p pVar5 = pVar3;
        int i16 = i11;
        int i17 = i12;
        C1500m h10 = mVar2.h(-742442296);
        if ((i16 & 6) == 0) {
            i13 = (h10.S(iVar2) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        int i18 = 16;
        if ((i16 & 48) == 0) {
            i13 |= (i16 & 64) == 0 ? h10.S(z0Var2) : h10.C(z0Var2) ? 32 : 16;
        }
        int i19 = 128;
        long j13 = j10;
        if ((i16 & 384) == 0) {
            i13 |= h10.e(j13) ? 256 : 128;
        }
        int i20 = 1024;
        long j14 = j11;
        if ((i16 & 3072) == 0) {
            i13 |= h10.e(j14) ? 2048 : 1024;
        }
        long j15 = j12;
        if ((i16 & 24576) == 0) {
            i13 |= h10.e(j15) ? 16384 : 8192;
        }
        if ((196608 & i16) == 0) {
            i13 |= h10.C(pVar) ? 131072 : 65536;
        } else {
            p pVar6 = pVar;
        }
        T t11 = t10;
        if ((i16 & 1572864) == 0) {
            i13 |= h10.S(t11) ? 1048576 : 524288;
        }
        float f11 = f10;
        if ((i16 & 12582912) == 0) {
            i13 |= h10.c(f11) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i13 |= h10.S(mVar3) ? 67108864 : 33554432;
        }
        if ((805306368 & i16) == 0) {
            i13 |= h10.S(eVar2) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i14 = (h10.d(i15) ? 4 : 2) | i17;
        } else {
            i14 = i17;
        }
        if ((i17 & 48) == 0) {
            if (h10.b(z11)) {
                i18 = 32;
            }
            i14 |= i18;
        }
        if ((i17 & 384) == 0) {
            if (h10.C(pVar4)) {
                i19 = 256;
            }
            i14 |= i19;
        }
        if ((i17 & 3072) == 0) {
            if (h10.C(pVar5)) {
                i20 = 2048;
            }
            i14 |= i20;
        }
        if ((306783379 & i13) == 306783378 && (i14 & 1171) == 1170 && h10.i()) {
            h10.I();
        } else {
            if (C1506p.H()) {
                C1506p.Q(-742442296, i13, i14, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z12 = ((i13 & 112) == 32 || ((i13 & 64) != 0 && h10.C(z0Var2))) | ((1879048192 & i13) == 536870912) | ((234881024 & i13) == 67108864) | ((i14 & 14) == 4);
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new j(z0Var2, eVar2, mVar3, i15);
                h10.r(A10);
            }
            F f12 = (F) A10;
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            k0.i e10 = k0.h.e(h10, iVar);
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
            F1.b(a12, f12, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            i.a aVar2 = k0.i.f23074a;
            k0.i b11 = androidx.compose.ui.layout.a.b(aVar2, "navigationIcon");
            float f13 = f7396h;
            k0.i m10 = n.m(b11, f13, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            c.a aVar3 = k0.c.f23044a;
            F h11 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int a13 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            k0.i e11 = k0.h.e(h10, m10);
            C6787a a14 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a14);
            } else {
                h10.q();
            }
            C1500m a15 = F1.a(h10);
            F1.b(a15, h11, aVar.c());
            F1.b(a15, p11, aVar.e());
            p b12 = aVar.b();
            if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
                a15.r(Integer.valueOf(a13));
                a15.V(Integer.valueOf(a13), b12);
            }
            F1.b(a15, e11, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
            J0 d10 = A.a().d(C2544x0.k(j10));
            int i21 = J0.f9784i;
            C1521x.a(d10, pVar4, h10, ((i14 >> 3) & 112) | i21);
            h10.u();
            k0.i c10 = androidx.compose.ui.graphics.b.c(n.k(androidx.compose.ui.layout.a.b(aVar2, com.amazon.a.a.o.b.f37461S), f13, 0.0f, 2, (Object) null).h(z11 ? O0.m.a(aVar2, i.f7430a) : aVar2), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (g2) null, false, (b2) null, 0, 0, 0, 131067, (Object) null);
            F h12 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int a16 = C1494j.a(h10, 0);
            C1523y p12 = h10.p();
            k0.i e12 = k0.h.e(h10, c10);
            C6787a a17 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a17);
            } else {
                h10.q();
            }
            C1500m a18 = F1.a(h10);
            F1.b(a18, h12, aVar.c());
            F1.b(a18, p12, aVar.e());
            p b13 = aVar.b();
            if (a18.f() || !C6496s.c(a18.A(), Integer.valueOf(a16))) {
                a18.r(Integer.valueOf(a16));
                a18.V(Integer.valueOf(a16), b13);
            }
            F1.b(a18, e12, aVar.d());
            int i22 = i13 >> 9;
            u.a(j11, t10, pVar, h10, ((i13 >> 15) & 112) | (i22 & 14) | (i22 & 896));
            h10.u();
            k0.i m11 = n.m(androidx.compose.ui.layout.a.b(aVar2, "actionIcons"), 0.0f, 0.0f, f13, 0.0f, 11, (Object) null);
            F h13 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
            int a19 = C1494j.a(h10, 0);
            C1523y p13 = h10.p();
            k0.i e13 = k0.h.e(h10, m11);
            C6787a a20 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a20);
            } else {
                h10.q();
            }
            C1500m a21 = F1.a(h10);
            F1.b(a21, h13, aVar.c());
            F1.b(a21, p13, aVar.e());
            p b14 = aVar.b();
            if (a21.f() || !C6496s.c(a21.A(), Integer.valueOf(a19))) {
                a21.r(Integer.valueOf(a19));
                a21.V(Integer.valueOf(a19), b14);
            }
            F1.b(a21, e13, aVar.d());
            C1521x.a(A.a().d(C2544x0.k(j12)), pVar5, h10, ((i14 >> 6) & 112) | i21);
            h10.u();
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k kVar = r0;
            k kVar2 = new k(iVar, z0Var, j10, j11, j12, pVar, t10, f10, mVar, eVar, i10, z10, pVar2, pVar3, i11, i12);
            k10.a(kVar);
        }
    }

    /* renamed from: V.e$i */
    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final i f7430a = new i();

        i() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }

        public final void a(v vVar) {
        }
    }
}

package J;

import Ef.m;
import M.C1274o;
import Ug.K;
import W0.I;
import W0.Q;
import Y.C1500m;
import c1.h;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2422h;
import q0.C2423i;
import q0.C2427m;
import qf.C6658d;
import r0.C2514n0;
import r0.C2547y0;
import r0.T1;
import rf.C6680b;
import t0.C2602c;
import t0.C2605f;
import w.C2774S;
import w.C2785b0;
import w.C2797i;
import w.C2798j;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    private static final C2797i f2881a = C2798j.e(C2798j.f(b.f2894a), (C2785b0) null, 0, 6, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final float f2882b = h.j((float) 2);

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2514n0 f2883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1228y f2884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f2885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I f2886d;

        /* renamed from: J.L$a$a  reason: collision with other inner class name */
        static final class C0051a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f2887a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1274o f2888b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0051a(C1274o oVar, C6658d dVar) {
                super(2, dVar);
                this.f2888b = oVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0051a(this.f2888b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0051a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f2887a;
                if (i10 == 0) {
                    w.b(obj);
                    C1274o oVar = this.f2888b;
                    this.f2887a = 1;
                    if (oVar.e(this) == f10) {
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

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1274o f2889a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ I f2890b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f2891c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1228y f2892d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C2514n0 f2893e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C1274o oVar, I i10, Q q10, C1228y yVar, C2514n0 n0Var) {
                super(1);
                this.f2889a = oVar;
                this.f2890b = i10;
                this.f2891c = q10;
                this.f2892d = yVar;
                this.f2893e = n0Var;
            }

            public final void a(C2602c cVar) {
                C2423i iVar;
                Q0.L f10;
                cVar.H1();
                float c10 = this.f2889a.c();
                if (c10 != 0.0f) {
                    int b10 = this.f2890b.b(Q0.Q.n(this.f2891c.g()));
                    a0 j10 = this.f2892d.j();
                    if (j10 == null || (f10 = j10.f()) == null || (iVar = f10.e(b10)) == null) {
                        iVar = new C2423i(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float t12 = cVar.t1(L.b());
                    float f11 = t12 / ((float) 2);
                    float c11 = m.c(m.g(iVar.i() + f11, C2427m.k(cVar.d()) - f11), f11);
                    C2605f.R(cVar, this.f2893e, C2422h.a(c11, iVar.l()), C2422h.a(c11, iVar.e()), t12, 0, (T1) null, c10, (C2547y0) null, 0, 432, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2602c) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2514n0 n0Var, C1228y yVar, Q q10, I i10) {
            super(3);
            this.f2883a = n0Var;
            this.f2884b = yVar;
            this.f2885c = q10;
            this.f2886d = i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
            if (r1 == r0.a()) goto L_0x00cd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k0.i a(k0.i r9, Y.C1500m r10, int r11) {
            /*
                r8 = this;
                r0 = -84507373(0xfffffffffaf68513, float:-6.4000205E35)
                r10.T(r0)
                boolean r1 = Y.C1506p.H()
                if (r1 == 0) goto L_0x0012
                r1 = -1
                java.lang.String r2 = "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"
                Y.C1506p.Q(r0, r11, r1, r2)
            L_0x0012:
                java.lang.Object r11 = r10.A()
                Y.m$a r0 = Y.C1500m.f10026a
                java.lang.Object r1 = r0.a()
                if (r11 != r1) goto L_0x0026
                M.o r11 = new M.o
                r11.<init>()
                r10.r(r11)
            L_0x0026:
                r2 = r11
                M.o r2 = (M.C1274o) r2
                r0.n0 r11 = r8.f2883a
                boolean r1 = r11 instanceof r0.h2
                r3 = 0
                if (r1 == 0) goto L_0x003e
                r0.h2 r11 = (r0.h2) r11
                long r4 = r11.b()
                r6 = 16
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L_0x003e
                r11 = r3
                goto L_0x003f
            L_0x003e:
                r11 = 1
            L_0x003f:
                Y.I0 r1 = androidx.compose.ui.platform.C1644k0.s()
                java.lang.Object r1 = r10.m(r1)
                androidx.compose.ui.platform.D1 r1 = (androidx.compose.ui.platform.D1) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L_0x00e0
                J.y r1 = r8.f2884b
                boolean r1 = r1.e()
                if (r1 == 0) goto L_0x00e0
                W0.Q r1 = r8.f2885c
                long r4 = r1.g()
                boolean r1 = Q0.Q.h(r4)
                if (r1 == 0) goto L_0x00e0
                if (r11 == 0) goto L_0x00e0
                r11 = 808320157(0x302dfc9d, float:6.329602E-10)
                r10.T(r11)
                W0.Q r11 = r8.f2885c
                Q0.d r11 = r11.e()
                W0.Q r1 = r8.f2885c
                long r4 = r1.g()
                Q0.Q r1 = Q0.Q.b(r4)
                boolean r4 = r10.C(r2)
                java.lang.Object r5 = r10.A()
                if (r4 != 0) goto L_0x008b
                java.lang.Object r4 = r0.a()
                if (r5 != r4) goto L_0x0094
            L_0x008b:
                J.L$a$a r5 = new J.L$a$a
                r4 = 0
                r5.<init>(r2, r4)
                r10.r(r5)
            L_0x0094:
                yf.p r5 = (yf.p) r5
                Y.P.f(r11, r1, r5, r10, r3)
                boolean r11 = r10.C(r2)
                W0.I r1 = r8.f2886d
                boolean r1 = r10.C(r1)
                r11 = r11 | r1
                W0.Q r1 = r8.f2885c
                boolean r1 = r10.S(r1)
                r11 = r11 | r1
                J.y r1 = r8.f2884b
                boolean r1 = r10.C(r1)
                r11 = r11 | r1
                r0.n0 r1 = r8.f2883a
                boolean r1 = r10.S(r1)
                r11 = r11 | r1
                W0.I r3 = r8.f2886d
                W0.Q r4 = r8.f2885c
                J.y r5 = r8.f2884b
                r0.n0 r6 = r8.f2883a
                java.lang.Object r1 = r10.A()
                if (r11 != 0) goto L_0x00cd
                java.lang.Object r11 = r0.a()
                if (r1 != r11) goto L_0x00d6
            L_0x00cd:
                J.L$a$b r11 = new J.L$a$b
                r1 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r10.r(r11)
            L_0x00d6:
                yf.l r1 = (yf.C6798l) r1
                k0.i r9 = androidx.compose.ui.draw.b.d(r9, r1)
                r10.M()
                goto L_0x00eb
            L_0x00e0:
                r9 = 809534830(0x3040856e, float:7.003881E-10)
                r10.T(r9)
                r10.M()
                k0.i$a r9 = k0.i.f23074a
            L_0x00eb:
                boolean r11 = Y.C1506p.H()
                if (r11 == 0) goto L_0x00f4
                Y.C1506p.P()
            L_0x00f4:
                r10.M()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: J.L.a.a(k0.i, Y.m, int):k0.i");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2894a = new b();

        b() {
            super(1);
        }

        public final void a(C2774S.b bVar) {
            bVar.d(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.f(valueOf, 0);
            bVar.f(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.f(valueOf2, 500);
            bVar.f(valueOf2, 999);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2774S.b) obj);
            return C6514M.f71813a;
        }
    }

    public static final i a(i iVar, C1228y yVar, Q q10, I i10, C2514n0 n0Var, boolean z10) {
        if (z10) {
            return k0.h.c(iVar, (C6798l) null, new a(n0Var, yVar, q10, i10), 1, (Object) null);
        }
        return iVar;
    }

    public static final float b() {
        return f2882b;
    }
}

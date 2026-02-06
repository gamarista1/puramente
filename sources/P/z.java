package P;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.p1;
import k0.h;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import w.C2782a;
import w.C2795g0;
import w.C2802n;
import w.r0;
import w.t0;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C2802n f4975a = new C2802n(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    private static final r0 f4976b = t0.a(a.f4979a, b.f4980a);

    /* renamed from: c  reason: collision with root package name */
    private static final long f4977c;

    /* renamed from: d  reason: collision with root package name */
    private static final C2795g0 f4978d;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4979a = new a();

        a() {
            super(1);
        }

        public final C2802n a(long j10) {
            if (C2422h.c(j10)) {
                return new C2802n(C2421g.m(j10), C2421g.n(j10));
            }
            return z.f4975a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C2421g) obj).v());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f4980a = new b();

        b() {
            super(1);
        }

        public final long a(C2802n nVar) {
            return C2422h.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2421g.d(a((C2802n) obj));
        }
    }

    static final class c extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f4981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f4982b;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f4983a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(0);
                this.f4983a = a12;
            }

            public final long a() {
                return c.c(this.f4983a);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C2421g.d(a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, C6798l lVar) {
            super(3);
            this.f4981a = aVar;
            this.f4982b = lVar;
        }

        /* access modifiers changed from: private */
        public static final long c(A1 a12) {
            return ((C2421g) a12.getValue()).v();
        }

        public final i b(i iVar, C1500m mVar, int i10) {
            mVar.T(759876635);
            if (C1506p.H()) {
                C1506p.Q(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            A1 b10 = z.f(this.f4981a, mVar, 0);
            C6798l lVar = this.f4982b;
            boolean S10 = mVar.S(b10);
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new a(b10);
                mVar.r(A10);
            }
            i iVar2 = (i) lVar.invoke((C6787a) A10);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return iVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4984a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1 f4986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2782a f4987d;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f4988a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(0);
                this.f4988a = a12;
            }

            public final long a() {
                return z.g(this.f4988a);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C2421g.d(a());
            }
        }

        static final class b implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2782a f4989a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f4990b;

            static final class a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f4991a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2782a f4992b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ long f4993c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C2782a aVar, long j10, C6658d dVar) {
                    super(2, dVar);
                    this.f4992b = aVar;
                    this.f4993c = j10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new a(this.f4992b, this.f4993c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f4991a;
                    if (i10 == 0) {
                        w.b(obj);
                        C2782a aVar = this.f4992b;
                        C2421g d10 = C2421g.d(this.f4993c);
                        C2795g0 e10 = z.e();
                        this.f4991a = 1;
                        if (C2782a.f(aVar, d10, e10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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

            b(C2782a aVar, K k10) {
                this.f4989a = aVar;
                this.f4990b = k10;
            }

            public final Object a(long j10, C6658d dVar) {
                if (!C2422h.c(((C2421g) this.f4989a.m()).v()) || !C2422h.c(j10) || C2421g.n(((C2421g) this.f4989a.m()).v()) == C2421g.n(j10)) {
                    Object t10 = this.f4989a.t(C2421g.d(j10), dVar);
                    if (t10 == C6680b.f()) {
                        return t10;
                    }
                    return C6514M.f71813a;
                }
                C5600w0 unused = C5576k.d(this.f4990b, (g) null, (M) null, new a(this.f4989a, j10, (C6658d) null), 3, (Object) null);
                return C6514M.f71813a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                return a(((C2421g) obj).v(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1 a12, C2782a aVar, C6658d dVar) {
            super(2, dVar);
            this.f4986c = a12;
            this.f4987d = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f4986c, this.f4987d, dVar);
            dVar2.f4985b = obj;
            return dVar2;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4984a;
            if (i10 == 0) {
                w.b(obj);
                C5694f p10 = p1.p(new a(this.f4986c));
                b bVar = new b(this.f4987d, (K) this.f4985b);
                this.f4984a = 1;
                if (p10.collect(bVar, this) == f10) {
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

    static {
        long a10 = C2422h.a(0.01f, 0.01f);
        f4977c = a10;
        f4978d = new C2795g0(0.0f, 0.0f, C2421g.d(a10), 3, (DefaultConstructorMarker) null);
    }

    public static final i d(i iVar, C6787a aVar, C6798l lVar) {
        return h.c(iVar, (C6798l) null, new c(aVar, lVar), 1, (Object) null);
    }

    public static final C2795g0 e() {
        return f4978d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: w.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: w.a} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 f(yf.C6787a r9, Y.C1500m r10, int r11) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"
            r2 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            Y.C1506p.Q(r2, r11, r0, r1)
        L_0x000f:
            java.lang.Object r11 = r10.A()
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r1 = r0.a()
            if (r11 != r1) goto L_0x0022
            Y.A1 r11 = Y.p1.e(r9)
            r10.r(r11)
        L_0x0022:
            Y.A1 r11 = (Y.A1) r11
            java.lang.Object r9 = r10.A()
            java.lang.Object r1 = r0.a()
            if (r9 != r1) goto L_0x004b
            w.a r9 = new w.a
            long r1 = g(r11)
            q0.g r3 = q0.C2421g.d(r1)
            w.r0 r4 = f4976b
            long r1 = f4977c
            q0.g r5 = q0.C2421g.d(r1)
            r7 = 8
            r8 = 0
            r6 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.r(r9)
        L_0x004b:
            w.a r9 = (w.C2782a) r9
            lf.M r1 = lf.C6514M.f71813a
            boolean r2 = r10.C(r9)
            java.lang.Object r3 = r10.A()
            if (r2 != 0) goto L_0x005f
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0068
        L_0x005f:
            P.z$d r3 = new P.z$d
            r0 = 0
            r3.<init>(r11, r9, r0)
            r10.r(r3)
        L_0x0068:
            yf.p r3 = (yf.p) r3
            r11 = 6
            Y.P.g(r1, r3, r10, r11)
            Y.A1 r9 = r9.g()
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x007b
            Y.C1506p.P()
        L_0x007b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P.z.f(yf.a, Y.m, int):Y.A1");
    }

    /* access modifiers changed from: private */
    public static final long g(A1 a12) {
        return ((C2421g) a12.getValue()).v();
    }
}

package z;

import C0.e;
import H0.C1197s;
import J0.A;
import J0.C1242h;
import J0.C1243i;
import J0.C1245k;
import Ug.A0;
import Ug.C5582n;
import Ug.C5584o;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import a0.C1538b;
import c1.r;
import c1.s;
import java.util.concurrent.CancellationException;
import k0.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import lf.v;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2427m;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: z.f  reason: case insensitive filesystem */
public final class C2948f extends i.c implements H.c, A, C1242h {

    /* renamed from: n  reason: collision with root package name */
    private q f28907n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C2937A f28908o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f28909p;

    /* renamed from: q  reason: collision with root package name */
    private C2946d f28910q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f28911r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C2945c f28912s = new C2945c();

    /* renamed from: t  reason: collision with root package name */
    private C1197s f28913t;

    /* renamed from: u  reason: collision with root package name */
    private C2423i f28914u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f28915v;

    /* renamed from: w  reason: collision with root package name */
    private long f28916w = r.f19235b.a();
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f28917x;

    /* renamed from: z.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C6787a f28918a;

        /* renamed from: b  reason: collision with root package name */
        private final C5582n f28919b;

        public a(C6787a aVar, C5582n nVar) {
            this.f28918a = aVar;
            this.f28919b = nVar;
        }

        public final C5582n a() {
            return this.f28919b;
        }

        public final C6787a b() {
            return this.f28918a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r0 == null) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                Ug.n r0 = r4.f28919b
                qf.g r0 = r0.getContext()
                Ug.J$a r1 = Ug.J.f65317c
                qf.g$b r0 = r0.b(r1)
                Ug.J r0 = (Ug.J) r0
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.z1()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = Sg.C5538a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.C6496s.g(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L_0x0050
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L_0x0052
            L_0x0050:
                java.lang.String r0 = "("
            L_0x0052:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                yf.a r0 = r4.f28918a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                Ug.n r0 = r4.f28919b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.C2948f.a.toString():java.lang.String");
        }
    }

    /* renamed from: z.f$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28920a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                z.q[] r0 = z.q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                z.q r1 = z.q.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                z.q r1 = z.q.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f28920a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z.C2948f.b.<clinit>():void");
        }
    }

    /* renamed from: z.f$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28921a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f28922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2948f f28923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2942F f28924d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2946d f28925e;

        /* renamed from: z.f$c$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f28926a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f28927b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C2942F f28928c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2948f f28929d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C2946d f28930e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5600w0 f28931f;

            /* renamed from: z.f$c$a$a  reason: collision with other inner class name */
            static final class C0485a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2948f f28932a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2942F f28933b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5600w0 f28934c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p f28935d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0485a(C2948f fVar, C2942F f10, C5600w0 w0Var, p pVar) {
                    super(1);
                    this.f28932a = fVar;
                    this.f28933b = f10;
                    this.f28934c = w0Var;
                    this.f28935d = pVar;
                }

                public final void a(float f10) {
                    float f11;
                    if (this.f28932a.f28909p) {
                        f11 = 1.0f;
                    } else {
                        f11 = -1.0f;
                    }
                    C2937A p22 = this.f28932a.f28908o;
                    float A10 = f11 * p22.A(p22.u(this.f28935d.b(p22.u(p22.B(f11 * f10)), e.f1131a.b())));
                    if (Math.abs(A10) < Math.abs(f10)) {
                        C5600w0 w0Var = this.f28934c;
                        C0.e(w0Var, "Scroll animation cancelled because scroll was not consumed (" + A10 + " < " + f10 + ')', (Throwable) null, 2, (Object) null);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).floatValue());
                    return C6514M.f71813a;
                }
            }

            /* renamed from: z.f$c$a$b */
            static final class b extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2948f f28936a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2942F f28937b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C2946d f28938c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C2948f fVar, C2942F f10, C2946d dVar) {
                    super(0);
                    this.f28936a = fVar;
                    this.f28937b = f10;
                    this.f28938c = dVar;
                }

                public final void invoke() {
                    boolean z10;
                    boolean z11;
                    C2945c m22 = this.f28936a.f28912s;
                    C2948f fVar = this.f28936a;
                    while (true) {
                        z10 = true;
                        if (m22.f28894a.t()) {
                            C2423i iVar = (C2423i) ((a) m22.f28894a.u()).b().invoke();
                            if (iVar == null) {
                                z11 = true;
                            } else {
                                z11 = C2948f.D2(fVar, iVar, 0, 1, (Object) null);
                            }
                            if (!z11) {
                                break;
                            }
                            ((a) m22.f28894a.y(m22.f28894a.q() - 1)).a().resumeWith(v.b(C6514M.f71813a));
                        } else {
                            break;
                        }
                    }
                    if (this.f28936a.f28915v) {
                        C2423i n22 = this.f28936a.A2();
                        if (n22 == null || !C2948f.D2(this.f28936a, n22, 0, 1, (Object) null)) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f28936a.f28915v = false;
                        }
                    }
                    this.f28937b.j(this.f28936a.v2(this.f28938c));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2942F f10, C2948f fVar, C2946d dVar, C5600w0 w0Var, C6658d dVar2) {
                super(2, dVar2);
                this.f28928c = f10;
                this.f28929d = fVar;
                this.f28930e = dVar;
                this.f28931f = w0Var;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f28928c, this.f28929d, this.f28930e, this.f28931f, dVar);
                aVar.f28927b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(p pVar, C6658d dVar) {
                return ((a) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f28926a;
                if (i10 == 0) {
                    w.b(obj);
                    this.f28928c.j(this.f28929d.v2(this.f28930e));
                    C2942F f11 = this.f28928c;
                    C0485a aVar = new C0485a(this.f28929d, f11, this.f28931f, (p) this.f28927b);
                    b bVar = new b(this.f28929d, this.f28928c, this.f28930e);
                    this.f28926a = 1;
                    if (f11.h(aVar, bVar, this) == f10) {
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
        c(C2948f fVar, C2942F f10, C2946d dVar, C6658d dVar2) {
            super(2, dVar2);
            this.f28923c = fVar;
            this.f28924d = f10;
            this.f28925e = dVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f28923c, this.f28924d, this.f28925e, dVar);
            cVar.f28922b = obj;
            return cVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            Object f10 = C6680b.f();
            int i10 = this.f28921a;
            if (i10 == 0) {
                w.b(obj);
                C5600w0 n10 = A0.n(((K) this.f28922b).getCoroutineContext());
                this.f28923c.f28917x = true;
                C2937A p22 = this.f28923c.f28908o;
                C2848L l10 = C2848L.Default;
                a aVar = new a(this.f28924d, this.f28923c, this.f28925e, n10, (C6658d) null);
                this.f28921a = 1;
                if (p22.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (CancellationException e10) {
                    cancellationException = e10;
                    throw cancellationException;
                } catch (Throwable th2) {
                    this.f28923c.f28917x = false;
                    this.f28923c.f28912s.b(cancellationException);
                    this.f28923c.f28915v = false;
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f28923c.f28912s.d();
            this.f28923c.f28917x = false;
            this.f28923c.f28912s.b((Throwable) null);
            this.f28923c.f28915v = false;
            return C6514M.f71813a;
        }
    }

    public C2948f(q qVar, C2937A a10, boolean z10, C2946d dVar) {
        this.f28907n = qVar;
        this.f28908o = a10;
        this.f28909p = z10;
        this.f28910q = dVar;
    }

    /* access modifiers changed from: private */
    public final C2423i A2() {
        if (!S1()) {
            return null;
        }
        C1197s k10 = C1245k.k(this);
        C1197s sVar = this.f28913t;
        if (sVar != null) {
            if (!sVar.G()) {
                sVar = null;
            }
            if (sVar != null) {
                return k10.b0(sVar, false);
            }
        }
        return null;
    }

    private final boolean C2(C2423i iVar, long j10) {
        long G22 = G2(iVar, j10);
        if (Math.abs(C2421g.m(G22)) > 0.5f || Math.abs(C2421g.n(G22)) > 0.5f) {
            return false;
        }
        return true;
    }

    static /* synthetic */ boolean D2(C2948f fVar, C2423i iVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fVar.f28916w;
        }
        return fVar.C2(iVar, j10);
    }

    /* access modifiers changed from: private */
    public final void E2() {
        C2946d H22 = H2();
        if (!this.f28917x) {
            C5600w0 unused = C5576k.d(L1(), (g) null, M.UNDISPATCHED, new c(this, new C2942F(H22.b()), H22, (C6658d) null), 1, (Object) null);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running");
    }

    private final long G2(C2423i iVar, long j10) {
        long d10 = s.d(j10);
        int i10 = b.f28920a[this.f28907n.ordinal()];
        if (i10 == 1) {
            return C2422h.a(0.0f, H2().a(iVar.l(), iVar.e() - iVar.l(), C2427m.i(d10)));
        }
        if (i10 == 2) {
            return C2422h.a(H2().a(iVar.i(), iVar.j() - iVar.i(), C2427m.k(d10)), 0.0f);
        }
        throw new C6535s();
    }

    private final C2946d H2() {
        C2946d dVar = this.f28910q;
        if (dVar == null) {
            return (C2946d) C1243i.a(this, C2947e.a());
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    public final float v2(C2946d dVar) {
        if (r.e(this.f28916w, r.f19235b.a())) {
            return 0.0f;
        }
        C2423i z22 = z2();
        if (z22 == null) {
            if (this.f28915v) {
                z22 = A2();
            } else {
                z22 = null;
            }
            if (z22 == null) {
                return 0.0f;
            }
        }
        long d10 = s.d(this.f28916w);
        int i10 = b.f28920a[this.f28907n.ordinal()];
        if (i10 == 1) {
            return dVar.a(z22.l(), z22.e() - z22.l(), C2427m.i(d10));
        }
        if (i10 == 2) {
            return dVar.a(z22.i(), z22.j() - z22.i(), C2427m.k(d10));
        }
        throw new C6535s();
    }

    private final int w2(long j10, long j11) {
        int i10 = b.f28920a[this.f28907n.ordinal()];
        if (i10 == 1) {
            return C6496s.i(r.f(j10), r.f(j11));
        }
        if (i10 == 2) {
            return C6496s.i(r.g(j10), r.g(j11));
        }
        throw new C6535s();
    }

    private final int x2(long j10, long j11) {
        int i10 = b.f28920a[this.f28907n.ordinal()];
        if (i10 == 1) {
            return Float.compare(C2427m.i(j10), C2427m.i(j11));
        }
        if (i10 == 2) {
            return Float.compare(C2427m.k(j10), C2427m.k(j11));
        }
        throw new C6535s();
    }

    private final C2423i y2(C2423i iVar, long j10) {
        return iVar.t(C2421g.u(G2(iVar, j10)));
    }

    private final C2423i z2() {
        C1538b a10 = this.f28912s.f28894a;
        int q10 = a10.q();
        C2423i iVar = null;
        if (q10 > 0) {
            int i10 = q10 - 1;
            Object[] p10 = a10.p();
            do {
                C2423i iVar2 = (C2423i) ((a) p10[i10]).b().invoke();
                if (iVar2 != null) {
                    if (x2(iVar2.k(), s.d(this.f28916w)) <= 0) {
                        iVar = iVar2;
                    } else if (iVar == null) {
                        return iVar2;
                    } else {
                        return iVar;
                    }
                }
                i10--;
            } while (i10 >= 0);
        }
        return iVar;
    }

    public final long B2() {
        return this.f28916w;
    }

    public final void F2(C1197s sVar) {
        this.f28913t = sVar;
    }

    public final void I2(q qVar, boolean z10, C2946d dVar) {
        this.f28907n = qVar;
        this.f28909p = z10;
        this.f28910q = dVar;
    }

    public C2423i K0(C2423i iVar) {
        if (!r.e(this.f28916w, r.f19235b.a())) {
            return y2(iVar, this.f28916w);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
    }

    public void O(long j10) {
        C2423i A22;
        long j11 = this.f28916w;
        this.f28916w = j10;
        if (w2(j10, j11) < 0 && (A22 = A2()) != null) {
            C2423i iVar = this.f28914u;
            if (iVar == null) {
                iVar = A22;
            }
            if (!this.f28917x && !this.f28915v && C2(iVar, j11) && !C2(A22, j10)) {
                this.f28915v = true;
                E2();
            }
            this.f28914u = A22;
        }
    }

    public Object Q0(C6787a aVar, C6658d dVar) {
        C2423i iVar = (C2423i) aVar.invoke();
        if (iVar == null || D2(this, iVar, 0, 1, (Object) null)) {
            return C6514M.f71813a;
        }
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        if (this.f28912s.c(new a(aVar, oVar)) && !this.f28917x) {
            E2();
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    public boolean Q1() {
        return this.f28911r;
    }
}

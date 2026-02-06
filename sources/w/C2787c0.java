package w;

import Ef.m;
import Ug.C5582n;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Y.C1495j0;
import Y.C1503n0;
import Y.C1510r0;
import Y.D0;
import Y.o1;
import androidx.collection.I;
import dh.C5817a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6559l;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: w.c0  reason: case insensitive filesystem */
public final class C2787c0 extends p0 {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final a f27329r = new a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f27330s = 8;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final C2801m f27331t = new C2801m(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final C2801m f27332u = new C2801m(1.0f);

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f27333b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f27334c;

    /* renamed from: d  reason: collision with root package name */
    private Object f27335d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public n0 f27336e;

    /* renamed from: f  reason: collision with root package name */
    private long f27337f;

    /* renamed from: g  reason: collision with root package name */
    private final C6787a f27338g = new f(this);

    /* renamed from: h  reason: collision with root package name */
    private final C1503n0 f27339h = D0.a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    private C5582n f27340i;

    /* renamed from: j  reason: collision with root package name */
    private final C5817a f27341j = dh.c.b(false, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final C2781Z f27342k = new C2781Z();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public long f27343l = Long.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final I f27344m = new I(0, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public b f27345n;

    /* renamed from: o  reason: collision with root package name */
    private final C6798l f27346o = new e(this);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f27347p;

    /* renamed from: q  reason: collision with root package name */
    private final C6798l f27348q = new c(this);

    /* renamed from: w.c0$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2801m a() {
            return C2787c0.f27332u;
        }

        public final C2801m b() {
            return C2787c0.f27331t;
        }

        private a() {
        }
    }

    /* renamed from: w.c0$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f27349a;

        /* renamed from: b  reason: collision with root package name */
        private u0 f27350b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f27351c;

        /* renamed from: d  reason: collision with root package name */
        private float f27352d;

        /* renamed from: e  reason: collision with root package name */
        private C2801m f27353e = new C2801m(0.0f);

        /* renamed from: f  reason: collision with root package name */
        private C2801m f27354f;

        /* renamed from: g  reason: collision with root package name */
        private long f27355g;

        /* renamed from: h  reason: collision with root package name */
        private long f27356h;

        public final u0 a() {
            return this.f27350b;
        }

        public final long b() {
            return this.f27356h;
        }

        public final long c() {
            return this.f27355g;
        }

        public final C2801m d() {
            return this.f27354f;
        }

        public final long e() {
            return this.f27349a;
        }

        public final C2801m f() {
            return this.f27353e;
        }

        public final float g() {
            return this.f27352d;
        }

        public final boolean h() {
            return this.f27351c;
        }

        public final void i(u0 u0Var) {
            this.f27350b = u0Var;
        }

        public final void j(long j10) {
            this.f27356h = j10;
        }

        public final void k(boolean z10) {
            this.f27351c = z10;
        }

        public final void l(long j10) {
            this.f27355g = j10;
        }

        public final void m(C2801m mVar) {
            this.f27354f = mVar;
        }

        public final void n(long j10) {
            this.f27349a = j10;
        }

        public final void o(float f10) {
            this.f27352d = f10;
        }

        public String toString() {
            return "progress nanos: " + this.f27349a + ", animationSpec: " + this.f27350b + ", isComplete: " + this.f27351c + ", value: " + this.f27352d + ", start: " + this.f27353e + ", initialVelocity: " + this.f27354f + ", durationNanos: " + this.f27355g + ", animationSpecDuration: " + this.f27356h;
        }
    }

    /* renamed from: w.c0$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27357a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2787c0 c0Var) {
            super(1);
            this.f27357a = c0Var;
        }

        public final void a(long j10) {
            this.f27357a.f27343l = j10;
            long e10 = Af.a.e(((double) (j10 - this.f27357a.f27343l)) / ((double) this.f27357a.f27347p));
            if (this.f27357a.f27344m.d()) {
                I m10 = this.f27357a.f27344m;
                C2787c0 c0Var = this.f27357a;
                Object[] objArr = m10.f12112a;
                int i10 = m10.f12113b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    b bVar = (b) objArr[i12];
                    c0Var.N(bVar, e10);
                    bVar.k(true);
                }
                n0 p10 = this.f27357a.f27336e;
                if (p10 != null) {
                    p10.Q();
                }
                I m11 = this.f27357a.f27344m;
                int i13 = m11.f12113b;
                Object[] objArr2 = m11.f12112a;
                Ef.i u10 = m.u(0, i13);
                int k10 = u10.k();
                int n10 = u10.n();
                if (k10 <= n10) {
                    while (true) {
                        objArr2[k10 - i11] = objArr2[k10];
                        if (((b) objArr2[k10]).h()) {
                            i11++;
                        }
                        if (k10 == n10) {
                            break;
                        }
                        k10++;
                    }
                }
                C6559l.w(objArr2, (Object) null, i13 - i11, i13);
                m11.f12113b -= i11;
            }
            b k11 = this.f27357a.f27345n;
            if (k11 != null) {
                k11.l(this.f27357a.J());
                this.f27357a.N(k11, e10);
                this.f27357a.U(k11.g());
                if (k11.g() == 1.0f) {
                    this.f27357a.f27345n = null;
                }
                this.f27357a.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: w.c0$d */
    static final class d extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f27358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f27361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2763G f27362e;

        /* renamed from: w.c0$d$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f27363a;

            /* renamed from: b  reason: collision with root package name */
            Object f27364b;

            /* renamed from: c  reason: collision with root package name */
            int f27365c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2787c0 f27366d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f27367e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n0 f27368f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C2763G f27369g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2787c0 c0Var, Object obj, n0 n0Var, C2763G g10, C6658d dVar) {
                super(2, dVar);
                this.f27366d = c0Var;
                this.f27367e = obj;
                this.f27368f = n0Var;
                this.f27369g = g10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f27366d, this.f27367e, this.f27368f, this.f27369g, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01e7 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    r18 = this;
                    r1 = r18
                    java.lang.Object r0 = rf.C6680b.f()
                    int r2 = r1.f27365c
                    r3 = 5
                    r4 = 4
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    r10 = 0
                    r11 = 0
                    if (r2 == 0) goto L_0x0045
                    if (r2 == r7) goto L_0x0039
                    if (r2 == r6) goto L_0x0034
                    if (r2 == r5) goto L_0x002f
                    if (r2 == r4) goto L_0x002a
                    if (r2 != r3) goto L_0x0022
                    lf.w.b(r19)
                    goto L_0x01e8
                L_0x0022:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x002a:
                    lf.w.b(r19)
                    goto L_0x01d6
                L_0x002f:
                    lf.w.b(r19)
                    goto L_0x00b8
                L_0x0034:
                    lf.w.b(r19)
                    goto L_0x00ad
                L_0x0039:
                    java.lang.Object r2 = r1.f27364b
                    w.c0 r2 = (w.C2787c0) r2
                    java.lang.Object r7 = r1.f27363a
                    dh.a r7 = (dh.C5817a) r7
                    lf.w.b(r19)
                    goto L_0x008f
                L_0x0045:
                    lf.w.b(r19)
                    w.c0 r2 = r1.f27366d
                    java.lang.Object r2 = r2.b()
                    java.lang.Object r12 = r1.f27367e
                    boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r2)
                    if (r12 != 0) goto L_0x0078
                    w.c0 r12 = r1.f27366d
                    r12.K()
                    w.c0 r12 = r1.f27366d
                    r12.U(r10)
                    w.n0 r12 = r1.f27368f
                    java.lang.Object r13 = r1.f27367e
                    r12.R(r13)
                    w.n0 r12 = r1.f27368f
                    r12.J(r8)
                    w.c0 r12 = r1.f27366d
                    r12.d(r2)
                    w.c0 r2 = r1.f27366d
                    java.lang.Object r12 = r1.f27367e
                    r2.V(r12)
                L_0x0078:
                    w.c0 r2 = r1.f27366d
                    dh.a r2 = r2.H()
                    w.c0 r12 = r1.f27366d
                    r1.f27363a = r2
                    r1.f27364b = r12
                    r1.f27365c = r7
                    java.lang.Object r7 = r2.a(r11, r1)
                    if (r7 != r0) goto L_0x008d
                    return r0
                L_0x008d:
                    r7 = r2
                    r2 = r12
                L_0x008f:
                    java.lang.Object r2 = r2.F()     // Catch:{ all -> 0x01f0 }
                    r7.e(r11)
                    java.lang.Object r7 = r1.f27367e
                    boolean r2 = kotlin.jvm.internal.C6496s.c(r7, r2)
                    if (r2 != 0) goto L_0x00b8
                    w.c0 r2 = r1.f27366d
                    r1.f27363a = r11
                    r1.f27364b = r11
                    r1.f27365c = r6
                    java.lang.Object r2 = r2.D(r1)
                    if (r2 != r0) goto L_0x00ad
                    return r0
                L_0x00ad:
                    w.c0 r2 = r1.f27366d
                    r1.f27365c = r5
                    java.lang.Object r2 = r2.Z(r1)
                    if (r2 != r0) goto L_0x00b8
                    return r0
                L_0x00b8:
                    w.c0 r2 = r1.f27366d
                    java.lang.Object r2 = r2.a()
                    java.lang.Object r5 = r1.f27367e
                    boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r5)
                    if (r2 != 0) goto L_0x01ed
                    w.c0 r2 = r1.f27366d
                    float r2 = r2.I()
                    r5 = 1065353216(0x3f800000, float:1.0)
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 >= 0) goto L_0x01c7
                    w.c0 r2 = r1.f27366d
                    w.c0$b r2 = r2.f27345n
                    w.G r6 = r1.f27369g
                    if (r6 == 0) goto L_0x00e7
                    kotlin.jvm.internal.l r7 = kotlin.jvm.internal.C6490l.f71789a
                    w.r0 r7 = w.t0.f(r7)
                    w.y0 r6 = r6.a(r7)
                    goto L_0x00e8
                L_0x00e7:
                    r6 = r11
                L_0x00e8:
                    if (r2 == 0) goto L_0x00f4
                    w.u0 r7 = r2.a()
                    boolean r7 = kotlin.jvm.internal.C6496s.c(r6, r7)
                    if (r7 != 0) goto L_0x01c7
                L_0x00f4:
                    if (r2 == 0) goto L_0x00fc
                    w.u0 r7 = r2.a()
                    r12 = r7
                    goto L_0x00fd
                L_0x00fc:
                    r12 = r11
                L_0x00fd:
                    if (r12 == 0) goto L_0x0126
                    long r13 = r2.e()
                    w.m r15 = r2.f()
                    w.c0$a r5 = w.C2787c0.f27329r
                    w.m r16 = r5.a()
                    w.m r5 = r2.d()
                    if (r5 != 0) goto L_0x011d
                    w.c0$a r5 = w.C2787c0.f27329r
                    w.m r5 = r5.b()
                L_0x011d:
                    r17 = r5
                    w.q r5 = r12.d(r13, r15, r16, r17)
                    w.m r5 = (w.C2801m) r5
                    goto L_0x0163
                L_0x0126:
                    if (r2 == 0) goto L_0x015b
                    long r12 = r2.e()
                    int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                    if (r7 != 0) goto L_0x0131
                    goto L_0x015b
                L_0x0131:
                    long r12 = r2.c()
                    r14 = -9223372036854775808
                    int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r7 != 0) goto L_0x0141
                    w.c0 r7 = r1.f27366d
                    long r12 = r7.J()
                L_0x0141:
                    float r7 = (float) r12
                    r12 = 1315859240(0x4e6e6b28, float:1.0E9)
                    float r7 = r7 / r12
                    int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                    if (r12 > 0) goto L_0x0153
                    w.c0$a r5 = w.C2787c0.f27329r
                    w.m r5 = r5.b()
                    goto L_0x0163
                L_0x0153:
                    w.m r12 = new w.m
                    float r5 = r5 / r7
                    r12.<init>(r5)
                    r5 = r12
                    goto L_0x0163
                L_0x015b:
                    w.c0$a r5 = w.C2787c0.f27329r
                    w.m r5 = r5.b()
                L_0x0163:
                    if (r2 != 0) goto L_0x016a
                    w.c0$b r2 = new w.c0$b
                    r2.<init>()
                L_0x016a:
                    r2.i(r6)
                    r7 = 0
                    r2.k(r7)
                    w.c0 r12 = r1.f27366d
                    float r12 = r12.I()
                    r2.o(r12)
                    w.m r12 = r2.f()
                    w.c0 r13 = r1.f27366d
                    float r13 = r13.I()
                    r12.e(r7, r13)
                    w.c0 r7 = r1.f27366d
                    long r12 = r7.J()
                    r2.l(r12)
                    r2.n(r8)
                    r2.m(r5)
                    if (r6 == 0) goto L_0x01a9
                    w.m r7 = r2.f()
                    w.c0$a r8 = w.C2787c0.f27329r
                    w.m r8 = r8.a()
                    long r5 = r6.b(r7, r8, r5)
                    goto L_0x01bf
                L_0x01a9:
                    w.c0 r5 = r1.f27366d
                    long r5 = r5.J()
                    double r5 = (double) r5
                    w.c0 r7 = r1.f27366d
                    float r7 = r7.I()
                    double r7 = (double) r7
                    r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    double r12 = r12 - r7
                    double r5 = r5 * r12
                    long r5 = Af.a.e(r5)
                L_0x01bf:
                    r2.j(r5)
                    w.c0 r5 = r1.f27366d
                    r5.f27345n = r2
                L_0x01c7:
                    w.c0 r2 = r1.f27366d
                    r1.f27363a = r11
                    r1.f27364b = r11
                    r1.f27365c = r4
                    java.lang.Object r2 = r2.O(r1)
                    if (r2 != r0) goto L_0x01d6
                    return r0
                L_0x01d6:
                    w.c0 r2 = r1.f27366d
                    java.lang.Object r4 = r1.f27367e
                    r2.d(r4)
                    w.c0 r2 = r1.f27366d
                    r1.f27365c = r3
                    java.lang.Object r2 = r2.Y(r1)
                    if (r2 != r0) goto L_0x01e8
                    return r0
                L_0x01e8:
                    w.c0 r0 = r1.f27366d
                    r0.U(r10)
                L_0x01ed:
                    lf.M r0 = lf.C6514M.f71813a
                    return r0
                L_0x01f0:
                    r0 = move-exception
                    r2 = r0
                    r7.e(r11)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: w.C2787c0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n0 n0Var, C2787c0 c0Var, Object obj, C2763G g10, C6658d dVar) {
            super(1, dVar);
            this.f27359b = n0Var;
            this.f27360c = c0Var;
            this.f27361d = obj;
            this.f27362e = g10;
        }

        public final C6658d create(C6658d dVar) {
            return new d(this.f27359b, this.f27360c, this.f27361d, this.f27362e, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((d) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f27358a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f27360c, this.f27361d, this.f27359b, this.f27362e, (C6658d) null);
                this.f27358a = 1;
                if (L.e(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f27359b.z();
            return C6514M.f71813a;
        }
    }

    /* renamed from: w.c0$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27370a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C2787c0 c0Var) {
            super(1);
            this.f27370a = c0Var;
        }

        public final void a(long j10) {
            this.f27370a.f27343l = j10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: w.c0$f */
    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27371a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C2787c0 c0Var) {
            super(0);
            this.f27371a = c0Var;
        }

        public final void invoke() {
            C2787c0 c0Var = this.f27371a;
            n0 p10 = c0Var.f27336e;
            c0Var.W(p10 != null ? p10.q() : 0);
        }
    }

    /* renamed from: w.c0$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27372a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27374c;

        /* renamed from: d  reason: collision with root package name */
        int f27375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C2787c0 c0Var, C6658d dVar) {
            super(dVar);
            this.f27374c = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27373b = obj;
            this.f27375d |= Integer.MIN_VALUE;
            return this.f27374c.O(this);
        }
    }

    /* renamed from: w.c0$h */
    static final class h extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f27376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27377b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n0 f27380e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f27381f;

        /* renamed from: w.c0$h$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f27382a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f27383b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f27384c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Object f27385d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C2787c0 f27386e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n0 f27387f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ float f27388g;

            /* renamed from: w.c0$h$a$a  reason: collision with other inner class name */
            static final class C0454a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f27389a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2787c0 f27390b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0454a(C2787c0 c0Var, C6658d dVar) {
                    super(2, dVar);
                    this.f27390b = c0Var;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0454a(this.f27390b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0454a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f27389a;
                    if (i10 == 0) {
                        w.b(obj);
                        C2787c0 c0Var = this.f27390b;
                        this.f27389a = 1;
                        if (c0Var.O(this) == f10) {
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
            a(Object obj, Object obj2, C2787c0 c0Var, n0 n0Var, float f10, C6658d dVar) {
                super(2, dVar);
                this.f27384c = obj;
                this.f27385d = obj2;
                this.f27386e = c0Var;
                this.f27387f = n0Var;
                this.f27388g = f10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f27384c, this.f27385d, this.f27386e, this.f27387f, this.f27388g, dVar);
                aVar.f27383b = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f27382a;
                if (i10 == 0) {
                    w.b(obj);
                    K k10 = (K) this.f27383b;
                    if (!C6496s.c(this.f27384c, this.f27385d)) {
                        this.f27386e.K();
                    } else {
                        this.f27386e.f27345n = null;
                        if (C6496s.c(this.f27386e.a(), this.f27384c)) {
                            return C6514M.f71813a;
                        }
                    }
                    if (!C6496s.c(this.f27384c, this.f27385d)) {
                        this.f27387f.R(this.f27384c);
                        this.f27387f.J(0);
                        this.f27386e.V(this.f27384c);
                        this.f27387f.E(this.f27388g);
                    }
                    this.f27386e.U(this.f27388g);
                    if (this.f27386e.f27344m.d()) {
                        C5600w0 unused = C5576k.d(k10, (qf.g) null, (M) null, new C0454a(this.f27386e, (C6658d) null), 3, (Object) null);
                    } else {
                        this.f27386e.f27343l = Long.MIN_VALUE;
                    }
                    C2787c0 c0Var = this.f27386e;
                    this.f27382a = 1;
                    if (c0Var.Z(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f27386e.R();
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Object obj, Object obj2, C2787c0 c0Var, n0 n0Var, float f10, C6658d dVar) {
            super(1, dVar);
            this.f27377b = obj;
            this.f27378c = obj2;
            this.f27379d = c0Var;
            this.f27380e = n0Var;
            this.f27381f = f10;
        }

        public final C6658d create(C6658d dVar) {
            return new h(this.f27377b, this.f27378c, this.f27379d, this.f27380e, this.f27381f, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((h) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f27376a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f27377b, this.f27378c, this.f27379d, this.f27380e, this.f27381f, (C6658d) null);
                this.f27376a = 1;
                if (L.e(aVar, this) == f10) {
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

    /* renamed from: w.c0$i */
    static final class i extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f27391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27392b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n0 f27394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C2787c0 c0Var, Object obj, n0 n0Var, C6658d dVar) {
            super(1, dVar);
            this.f27392b = c0Var;
            this.f27393c = obj;
            this.f27394d = n0Var;
        }

        public final C6658d create(C6658d dVar) {
            return new i(this.f27392b, this.f27393c, this.f27394d, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((i) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            float f10;
            Object f11 = C6680b.f();
            int i10 = this.f27391a;
            if (i10 == 0) {
                w.b(obj);
                this.f27392b.E();
                this.f27392b.f27343l = Long.MIN_VALUE;
                this.f27392b.U(0.0f);
                Object obj2 = this.f27393c;
                if (C6496s.c(obj2, this.f27392b.a())) {
                    f10 = -4.0f;
                } else if (C6496s.c(obj2, this.f27392b.b())) {
                    f10 = -5.0f;
                } else {
                    f10 = -3.0f;
                }
                this.f27394d.R(this.f27393c);
                this.f27394d.J(0);
                this.f27392b.V(this.f27393c);
                this.f27392b.U(0.0f);
                this.f27392b.d(this.f27393c);
                this.f27394d.E(f10);
                if (f10 == -3.0f) {
                    C2787c0 c0Var = this.f27392b;
                    this.f27391a = 1;
                    if (c0Var.Z(this) == f11) {
                        return f11;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f27394d.z();
            return C6514M.f71813a;
        }
    }

    /* renamed from: w.c0$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27395a;

        /* renamed from: b  reason: collision with root package name */
        Object f27396b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f27397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27398d;

        /* renamed from: e  reason: collision with root package name */
        int f27399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C2787c0 c0Var, C6658d dVar) {
            super(dVar);
            this.f27398d = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27397c = obj;
            this.f27399e |= Integer.MIN_VALUE;
            return this.f27398d.Y(this);
        }
    }

    /* renamed from: w.c0$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27400a;

        /* renamed from: b  reason: collision with root package name */
        Object f27401b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f27402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2787c0 f27403d;

        /* renamed from: e  reason: collision with root package name */
        int f27404e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C2787c0 c0Var, C6658d dVar) {
            super(dVar);
            this.f27403d = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27402c = obj;
            this.f27404e |= Integer.MIN_VALUE;
            return this.f27403d.Z(this);
        }
    }

    public C2787c0(Object obj) {
        super((DefaultConstructorMarker) null);
        this.f27333b = u1.d(obj, (o1) null, 2, (Object) null);
        this.f27334c = u1.d(obj, (o1) null, 2, (Object) null);
        this.f27335d = obj;
    }

    private final Object A(C6658d dVar) {
        float n10 = l0.n(dVar.getContext());
        if (n10 <= 0.0f) {
            E();
            return C6514M.f71813a;
        }
        this.f27347p = n10;
        Object c10 = C1495j0.c(this.f27348q, dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object C(C2787c0 c0Var, Object obj, C2763G g10, C6658d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c0Var.b();
        }
        if ((i10 & 2) != 0) {
            g10 = null;
        }
        return c0Var.B(obj, g10, dVar);
    }

    /* access modifiers changed from: private */
    public final Object D(C6658d dVar) {
        if (this.f27343l == Long.MIN_VALUE) {
            Object c10 = C1495j0.c(this.f27346o, dVar);
            if (c10 == C6680b.f()) {
                return c10;
            }
            return C6514M.f71813a;
        }
        Object A10 = A(dVar);
        if (A10 == C6680b.f()) {
            return A10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void E() {
        n0 n0Var = this.f27336e;
        if (n0Var != null) {
            n0Var.g();
        }
        this.f27344m.h();
        if (this.f27345n != null) {
            this.f27345n = null;
            U(1.0f);
            R();
        }
    }

    /* access modifiers changed from: private */
    public final void K() {
        n0 n0Var = this.f27336e;
        if (n0Var != null) {
            b bVar = this.f27345n;
            if (bVar == null) {
                if (this.f27337f <= 0 || I() == 1.0f || C6496s.c(a(), b())) {
                    bVar = null;
                } else {
                    bVar = new b();
                    bVar.o(I());
                    long j10 = this.f27337f;
                    bVar.l(j10);
                    bVar.j(Af.a.e(((double) j10) * (1.0d - ((double) I()))));
                    bVar.f().e(0, I());
                }
            }
            if (bVar != null) {
                bVar.l(this.f27337f);
                this.f27344m.g(bVar);
                n0Var.I(bVar);
            }
            this.f27345n = null;
        }
    }

    /* access modifiers changed from: private */
    public final void N(b bVar, long j10) {
        long e10 = bVar.e() + j10;
        bVar.n(e10);
        long b10 = bVar.b();
        if (e10 >= b10) {
            bVar.o(1.0f);
            return;
        }
        u0 a10 = bVar.a();
        if (a10 != null) {
            C2801m f10 = bVar.f();
            C2801m mVar = f27332u;
            C2801m d10 = bVar.d();
            if (d10 == null) {
                d10 = f27331t;
            }
            bVar.o(m.k(((C2801m) a10.c(e10, f10, mVar, d10)).a(0), 0.0f, 1.0f));
            return;
        }
        bVar.o(t0.k(bVar.f().a(0), 1.0f, ((float) e10) / ((float) b10)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(qf.C6658d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof w.C2787c0.g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            w.c0$g r0 = (w.C2787c0.g) r0
            int r1 = r0.f27375d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27375d = r1
            goto L_0x0018
        L_0x0013:
            w.c0$g r0 = new w.c0$g
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f27373b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f27375d
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            java.lang.Object r2 = r0.f27372a
            w.c0 r2 = (w.C2787c0) r2
            lf.w.b(r10)
            goto L_0x0076
        L_0x003b:
            lf.w.b(r10)
            androidx.collection.I r10 = r9.f27344m
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x004d
            w.c0$b r10 = r9.f27345n
            if (r10 != 0) goto L_0x004d
            lf.M r10 = lf.C6514M.f71813a
            return r10
        L_0x004d:
            qf.g r10 = r0.getContext()
            float r10 = w.l0.n(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0062
            r9.E()
            r9.f27343l = r5
            lf.M r10 = lf.C6514M.f71813a
            return r10
        L_0x0062:
            long r7 = r9.f27343l
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0075
            yf.l r10 = r9.f27346o
            r0.f27372a = r9
            r0.f27375d = r4
            java.lang.Object r10 = Y.C1495j0.c(r10, r0)
            if (r10 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r9
        L_0x0076:
            androidx.collection.I r10 = r2.f27344m
            boolean r10 = r10.d()
            if (r10 != 0) goto L_0x0088
            w.c0$b r10 = r2.f27345n
            if (r10 == 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r2.f27343l = r5
            lf.M r10 = lf.C6514M.f71813a
            return r10
        L_0x0088:
            r0.f27372a = r2
            r0.f27375d = r3
            java.lang.Object r10 = r2.A(r0)
            if (r10 != r1) goto L_0x0076
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2787c0.O(qf.d):java.lang.Object");
    }

    public static /* synthetic */ Object Q(C2787c0 c0Var, float f10, Object obj, C6658d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = c0Var.b();
        }
        return c0Var.P(f10, obj, dVar);
    }

    /* access modifiers changed from: private */
    public final void R() {
        n0 n0Var = this.f27336e;
        if (n0Var != null) {
            n0Var.H(Af.a.e(((double) I()) * ((double) n0Var.q())));
        }
    }

    /* access modifiers changed from: private */
    public final void U(float f10) {
        this.f27339h.l(f10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof w.C2787c0.j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            w.c0$j r0 = (w.C2787c0.j) r0
            int r1 = r0.f27399e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27399e = r1
            goto L_0x0018
        L_0x0013:
            w.c0$j r0 = new w.c0$j
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f27397c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f27399e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.f27396b
            java.lang.Object r0 = r0.f27395a
            w.c0 r0 = (w.C2787c0) r0
            lf.w.b(r8)
            goto L_0x008c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.f27396b
            java.lang.Object r6 = r0.f27395a
            w.c0 r6 = (w.C2787c0) r6
            lf.w.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            lf.w.b(r8)
            java.lang.Object r8 = r7.b()
            dh.a r2 = r7.f27341j
            r0.f27395a = r7
            r0.f27396b = r8
            r0.f27399e = r5
            java.lang.Object r2 = dh.C5817a.C0988a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            r0.f27395a = r6
            r0.f27396b = r8
            r0.f27399e = r3
            Ug.o r2 = new Ug.o
            qf.d r3 = rf.C6680b.c(r0)
            r2.<init>(r3, r5)
            r2.E()
            r6.T(r2)
            dh.a r3 = r6.H()
            dh.C5817a.C0988a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.v()
            java.lang.Object r3 = rf.C6680b.f()
            if (r2 != r3) goto L_0x0086
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0086:
            if (r2 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x008c:
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r1)
            if (r8 == 0) goto L_0x0095
            lf.M r8 = lf.C6514M.f71813a
            return r8
        L_0x0095:
            r1 = -9223372036854775808
            r0.f27343l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2787c0.Y(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof w.C2787c0.k
            if (r0 == 0) goto L_0x0013
            r0 = r8
            w.c0$k r0 = (w.C2787c0.k) r0
            int r1 = r0.f27404e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27404e = r1
            goto L_0x0018
        L_0x0013:
            w.c0$k r0 = new w.c0$k
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f27402c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f27404e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.f27401b
            java.lang.Object r0 = r0.f27400a
            w.c0 r0 = (w.C2787c0) r0
            lf.w.b(r8)
            goto L_0x009a
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.f27401b
            java.lang.Object r6 = r0.f27400a
            w.c0 r6 = (w.C2787c0) r6
            lf.w.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            lf.w.b(r8)
            java.lang.Object r8 = r7.b()
            dh.a r2 = r7.f27341j
            r0.f27400a = r7
            r0.f27401b = r8
            r0.f27404e = r5
            java.lang.Object r2 = dh.C5817a.C0988a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            java.lang.Object r2 = r6.f27335d
            boolean r2 = kotlin.jvm.internal.C6496s.c(r8, r2)
            if (r2 == 0) goto L_0x006b
            dh.a r8 = r6.f27341j
            dh.C5817a.C0988a.c(r8, r4, r5, r4)
            goto L_0x00a0
        L_0x006b:
            r0.f27400a = r6
            r0.f27401b = r8
            r0.f27404e = r3
            Ug.o r2 = new Ug.o
            qf.d r3 = rf.C6680b.c(r0)
            r2.<init>(r3, r5)
            r2.E()
            r6.T(r2)
            dh.a r3 = r6.H()
            dh.C5817a.C0988a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.v()
            java.lang.Object r3 = rf.C6680b.f()
            if (r2 != r3) goto L_0x0094
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0094:
            if (r2 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x009a:
            boolean r2 = kotlin.jvm.internal.C6496s.c(r8, r1)
            if (r2 == 0) goto L_0x00a3
        L_0x00a0:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        L_0x00a3:
            r2 = -9223372036854775808
            r0.f27343l = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2787c0.Z(qf.d):java.lang.Object");
    }

    public final Object B(Object obj, C2763G g10, C6658d dVar) {
        n0 n0Var = this.f27336e;
        if (n0Var == null) {
            return C6514M.f71813a;
        }
        Object e10 = C2781Z.e(this.f27342k, (C2778W) null, new d(n0Var, this, obj, g10, (C6658d) null), dVar, 1, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final Object F() {
        return this.f27335d;
    }

    public final C5582n G() {
        return this.f27340i;
    }

    public final C5817a H() {
        return this.f27341j;
    }

    public final float I() {
        return this.f27339h.c();
    }

    public final long J() {
        return this.f27337f;
    }

    public final void L() {
        o0.e().o(this, o0.f27539a, this.f27338g);
    }

    public final void M() {
        long j10 = this.f27337f;
        L();
        long j11 = this.f27337f;
        if (j10 != j11) {
            b bVar = this.f27345n;
            if (bVar != null) {
                bVar.l(j11);
                if (bVar.a() == null) {
                    bVar.j(Af.a.e((1.0d - ((double) bVar.f().a(0))) * ((double) this.f27337f)));
                }
            } else if (j11 != 0) {
                R();
            }
        }
    }

    public final Object P(float f10, Object obj, C6658d dVar) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            C2783a0.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        n0 n0Var = this.f27336e;
        if (n0Var == null) {
            return C6514M.f71813a;
        }
        Object b10 = b();
        Object e10 = C2781Z.e(this.f27342k, (C2778W) null, new h(obj, b10, this, n0Var, f10, (C6658d) null), dVar, 1, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final void S(Object obj) {
        this.f27335d = obj;
    }

    public final void T(C5582n nVar) {
        this.f27340i = nVar;
    }

    public void V(Object obj) {
        this.f27333b.setValue(obj);
    }

    public final void W(long j10) {
        this.f27337f = j10;
    }

    public final Object X(Object obj, C6658d dVar) {
        n0 n0Var = this.f27336e;
        if (n0Var == null) {
            return C6514M.f71813a;
        }
        if (C6496s.c(a(), obj) && C6496s.c(b(), obj)) {
            return C6514M.f71813a;
        }
        Object e10 = C2781Z.e(this.f27342k, (C2778W) null, new i(this, obj, n0Var, (C6658d) null), dVar, 1, (Object) null);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public Object a() {
        return this.f27334c.getValue();
    }

    public Object b() {
        return this.f27333b.getValue();
    }

    public void d(Object obj) {
        this.f27334c.setValue(obj);
    }

    public void f(n0 n0Var) {
        boolean z10;
        n0 n0Var2 = this.f27336e;
        if (n0Var2 == null || C6496s.c(n0Var, n0Var2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2783a0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f27336e + ", new instance: " + n0Var);
        }
        this.f27336e = n0Var;
    }

    public void g() {
        this.f27336e = null;
        o0.e().k(this);
    }
}

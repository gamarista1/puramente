package z;

import c1.y;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.M;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import x.C2855T;
import yf.C6798l;
import yf.p;

/* renamed from: z.A  reason: case insensitive filesystem */
public final class C2937A {

    /* renamed from: a  reason: collision with root package name */
    private y f28742a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2855T f28743b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public n f28744c;

    /* renamed from: d  reason: collision with root package name */
    private q f28745d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28746e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C0.b f28747f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f28748g = C0.e.f1131a.b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public v f28749h = androidx.compose.foundation.gestures.d.f12672b;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c f28750i = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C6798l f28751j = new e(this);

    /* renamed from: z.A$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28752a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2937A f28754c;

        /* renamed from: d  reason: collision with root package name */
        int f28755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2937A a10, C6658d dVar) {
            super(dVar);
            this.f28754c = a10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f28753b = obj;
            this.f28755d |= Integer.MIN_VALUE;
            return this.f28754c.n(0, this);
        }
    }

    /* renamed from: z.A$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f28756a;

        /* renamed from: b  reason: collision with root package name */
        Object f28757b;

        /* renamed from: c  reason: collision with root package name */
        long f28758c;

        /* renamed from: d  reason: collision with root package name */
        int f28759d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f28760e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2937A f28761f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ M f28762g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f28763h;

        /* renamed from: z.A$b$a */
        public static final class a implements v {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2937A f28764a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f28765b;

            a(C2937A a10, p pVar) {
                this.f28764a = a10;
                this.f28765b = pVar;
            }

            public float a(float f10) {
                C2937A a10 = this.f28764a;
                return a10.t(a10.A(this.f28765b.a(a10.u(a10.B(f10)), C0.e.f1131a.a())));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2937A a10, M m10, long j10, C6658d dVar) {
            super(2, dVar);
            this.f28761f = a10;
            this.f28762g = m10;
            this.f28763h = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f28761f, this.f28762g, this.f28763h, dVar);
            bVar.f28760e = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(p pVar, C6658d dVar) {
            return ((b) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C2937A a10;
            C2937A a11;
            M m10;
            long j10;
            Object f10 = C6680b.f();
            int i10 = this.f28759d;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f28761f, (p) this.f28760e);
                a11 = this.f28761f;
                M m11 = this.f28762g;
                long j11 = this.f28763h;
                n a12 = a11.f28744c;
                long j12 = m11.f71758a;
                float t10 = a11.t(a11.z(j11));
                this.f28760e = a11;
                this.f28756a = a11;
                this.f28757b = m11;
                this.f28758c = j12;
                this.f28759d = 1;
                Object a13 = a12.a(aVar, t10, this);
                if (a13 == f10) {
                    return f10;
                }
                m10 = m11;
                obj = a13;
                a10 = a11;
                j10 = j12;
            } else if (i10 == 1) {
                j10 = this.f28758c;
                m10 = (M) this.f28757b;
                a11 = (C2937A) this.f28756a;
                a10 = (C2937A) this.f28760e;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m10.f71758a = a11.D(j10, a10.t(((Number) obj).floatValue()));
            return C6514M.f71813a;
        }
    }

    /* renamed from: z.A$c */
    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2937A f28766a;

        c(C2937A a10) {
            this.f28766a = a10;
        }

        public long a(long j10, int i10) {
            this.f28766a.f28748g = i10;
            C2855T f10 = this.f28766a.f28743b;
            if (f10 != null && this.f28766a.o()) {
                return f10.a(j10, this.f28766a.f28748g, this.f28766a.f28751j);
            }
            return this.f28766a.s(this.f28766a.f28749h, j10, i10);
        }

        public long b(long j10, int i10) {
            return this.f28766a.s(this.f28766a.f28749h, j10, i10);
        }
    }

    /* renamed from: z.A$d */
    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        long f28767a;

        /* renamed from: b  reason: collision with root package name */
        int f28768b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ long f28769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2937A f28770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2937A a10, C6658d dVar) {
            super(2, dVar);
            this.f28770d = a10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f28770d, dVar);
            dVar2.f28769c = ((y) obj).o();
            return dVar2;
        }

        public final Object i(long j10, C6658d dVar) {
            return ((d) create(y.b(j10), dVar)).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((y) obj).o(), (C6658d) obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = rf.C6680b.f()
                int r0 = r13.f28768b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0035
                if (r0 == r3) goto L_0x002e
                if (r0 == r2) goto L_0x0024
                if (r0 != r1) goto L_0x001c
                long r0 = r13.f28767a
                long r2 = r13.f28769c
                lf.w.b(r14)
                r9 = r0
                r0 = r14
                goto L_0x0089
            L_0x001c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0024:
                long r2 = r13.f28767a
                long r4 = r13.f28769c
                lf.w.b(r14)
                r0 = r14
                r7 = r4
                goto L_0x0068
            L_0x002e:
                long r3 = r13.f28769c
                lf.w.b(r14)
                r0 = r14
                goto L_0x004c
            L_0x0035:
                lf.w.b(r14)
                long r4 = r13.f28769c
                z.A r0 = r13.f28770d
                C0.b r0 = r0.f28747f
                r13.f28769c = r4
                r13.f28768b = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L_0x004b
                return r6
            L_0x004b:
                r3 = r4
            L_0x004c:
                c1.y r0 = (c1.y) r0
                long r7 = r0.o()
                long r7 = c1.y.k(r3, r7)
                z.A r0 = r13.f28770d
                r13.f28769c = r3
                r13.f28767a = r7
                r13.f28768b = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L_0x0065
                return r6
            L_0x0065:
                r11 = r3
                r2 = r7
                r7 = r11
            L_0x0068:
                c1.y r0 = (c1.y) r0
                long r9 = r0.o()
                z.A r0 = r13.f28770d
                C0.b r0 = r0.f28747f
                long r2 = c1.y.k(r2, r9)
                r13.f28769c = r7
                r13.f28767a = r9
                r13.f28768b = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L_0x0088
                return r6
            L_0x0088:
                r2 = r7
            L_0x0089:
                c1.y r0 = (c1.y) r0
                long r0 = r0.o()
                long r0 = c1.y.k(r9, r0)
                long r0 = c1.y.k(r2, r0)
                c1.y r0 = c1.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.C2937A.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: z.A$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2937A f28771a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C2937A a10) {
            super(1);
            this.f28771a = a10;
        }

        public final long a(long j10) {
            v e10 = this.f28771a.f28749h;
            C2937A a10 = this.f28771a;
            return a10.s(e10, j10, a10.f28748g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2421g.d(a(((C2421g) obj).v()));
        }
    }

    /* renamed from: z.A$f */
    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28772a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f28773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2937A f28774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f28775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C2937A a10, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f28774c = a10;
            this.f28775d = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f28774c, this.f28775d, dVar);
            fVar.f28773b = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((f) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28772a;
            if (i10 == 0) {
                w.b(obj);
                this.f28774c.f28749h = (v) this.f28773b;
                p pVar = this.f28775d;
                c d10 = this.f28774c.f28750i;
                this.f28772a = 1;
                if (pVar.invoke(d10, this) == f10) {
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

    public C2937A(y yVar, C2855T t10, n nVar, q qVar, boolean z10, C0.b bVar) {
        this.f28742a = yVar;
        this.f28743b = t10;
        this.f28744c = nVar;
        this.f28745d = qVar;
        this.f28746e = z10;
        this.f28747f = bVar;
    }

    /* access modifiers changed from: private */
    public final long D(long j10, float f10) {
        if (this.f28745d == q.Horizontal) {
            return y.e(j10, f10, 0.0f, 2, (Object) null);
        }
        return y.e(j10, 0.0f, f10, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        if (this.f28742a.d() || this.f28742a.c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final long s(v vVar, long j10, int i10) {
        long d10 = this.f28747f.d(j10, i10);
        long q10 = C2421g.q(j10, d10);
        long u10 = u(B(vVar.a(A(u(x(q10))))));
        return C2421g.r(C2421g.r(d10, u10), this.f28747f.b(u10, C2421g.q(q10, u10), i10));
    }

    private final long y(long j10) {
        if (this.f28745d == q.Horizontal) {
            return y.e(j10, 0.0f, 0.0f, 1, (Object) null);
        }
        return y.e(j10, 0.0f, 0.0f, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final float z(long j10) {
        if (this.f28745d == q.Horizontal) {
            return y.h(j10);
        }
        return y.i(j10);
    }

    public final float A(long j10) {
        if (this.f28745d == q.Horizontal) {
            return C2421g.m(j10);
        }
        return C2421g.n(j10);
    }

    public final long B(float f10) {
        if (f10 == 0.0f) {
            return C2421g.f25320b.c();
        }
        if (this.f28745d == q.Horizontal) {
            return C2422h.a(f10, 0.0f);
        }
        return C2422h.a(0.0f, f10);
    }

    public final boolean C(y yVar, q qVar, C2855T t10, boolean z10, n nVar, C0.b bVar) {
        boolean z11;
        boolean z12 = true;
        if (!C6496s.c(this.f28742a, yVar)) {
            this.f28742a = yVar;
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28743b = t10;
        if (this.f28745d != qVar) {
            this.f28745d = qVar;
            z11 = true;
        }
        if (this.f28746e != z10) {
            this.f28746e = z10;
        } else {
            z12 = z11;
        }
        this.f28744c = nVar;
        this.f28747f = bVar;
        return z12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(long r12, qf.C6658d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof z.C2937A.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            z.A$a r0 = (z.C2937A.a) r0
            int r1 = r0.f28755d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28755d = r1
            goto L_0x0018
        L_0x0013:
            z.A$a r0 = new z.A$a
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f28753b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28755d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r12 = r0.f28752a
            kotlin.jvm.internal.M r12 = (kotlin.jvm.internal.M) r12
            lf.w.b(r14)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            lf.w.b(r14)
            kotlin.jvm.internal.M r14 = new kotlin.jvm.internal.M
            r14.<init>()
            r14.f71758a = r12
            x.L r2 = x.C2848L.Default
            z.A$b r10 = new z.A$b
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f28752a = r14
            r0.f28755d = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r12 = r14
        L_0x0057:
            long r12 = r12.f71758a
            c1.y r12 = c1.y.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2937A.n(long, qf.d):java.lang.Object");
    }

    public final boolean p() {
        if (this.f28745d == q.Vertical) {
            return true;
        }
        return false;
    }

    public final Object q(long j10, C6658d dVar) {
        long y10 = y(j10);
        d dVar2 = new d(this, (C6658d) null);
        C2855T t10 = this.f28743b;
        if (t10 == null || !o()) {
            Object invoke = dVar2.invoke(y.b(y10), dVar);
            if (invoke == C6680b.f()) {
                return invoke;
            }
            return C6514M.f71813a;
        }
        Object c10 = t10.c(y10, dVar2, dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    public final long r(long j10) {
        if (this.f28742a.b()) {
            return C2421g.f25320b.c();
        }
        return B(t(this.f28742a.f(t(A(j10)))));
    }

    public final float t(float f10) {
        if (this.f28746e) {
            return f10 * ((float) -1);
        }
        return f10;
    }

    public final long u(long j10) {
        if (this.f28746e) {
            return C2421g.s(j10, -1.0f);
        }
        return j10;
    }

    public final Object v(C2848L l10, p pVar, C6658d dVar) {
        Object e10 = this.f28742a.e(l10, new f(this, pVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public final boolean w() {
        boolean z10;
        if (!this.f28742a.b()) {
            C2855T t10 = this.f28743b;
            if (t10 != null) {
                z10 = t10.b();
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final long x(long j10) {
        if (this.f28745d == q.Horizontal) {
            return C2421g.g(j10, 0.0f, 0.0f, 1, (Object) null);
        }
        return C2421g.g(j10, 0.0f, 0.0f, 2, (Object) null);
    }
}

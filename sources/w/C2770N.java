package w;

import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import a0.C1538b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: w.N  reason: case insensitive filesystem */
public final class C2770N {

    /* renamed from: f  reason: collision with root package name */
    public static final int f27201f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f27202a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1538b f27203b = new C1538b(new a[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f27204c = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f27205d = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f27206e = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);

    /* renamed from: w.N$a */
    public final class a implements A1 {

        /* renamed from: a  reason: collision with root package name */
        private Object f27207a;

        /* renamed from: b  reason: collision with root package name */
        private Object f27208b;

        /* renamed from: c  reason: collision with root package name */
        private final r0 f27209c;

        /* renamed from: d  reason: collision with root package name */
        private final String f27210d;

        /* renamed from: e  reason: collision with root package name */
        private final C1510r0 f27211e;

        /* renamed from: f  reason: collision with root package name */
        private C2797i f27212f;

        /* renamed from: g  reason: collision with root package name */
        private m0 f27213g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f27214h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f27215i;

        /* renamed from: j  reason: collision with root package name */
        private long f27216j;

        public a(Object obj, Object obj2, r0 r0Var, C2797i iVar, String str) {
            this.f27207a = obj;
            this.f27208b = obj2;
            this.f27209c = r0Var;
            this.f27210d = str;
            this.f27211e = u1.d(obj, (o1) null, 2, (Object) null);
            this.f27212f = iVar;
            this.f27213g = new m0(this.f27212f, r0Var, this.f27207a, this.f27208b, (C2805q) null, 16, (DefaultConstructorMarker) null);
        }

        public final Object g() {
            return this.f27207a;
        }

        public Object getValue() {
            return this.f27211e.getValue();
        }

        public final Object k() {
            return this.f27208b;
        }

        public final boolean m() {
            return this.f27214h;
        }

        public final void n(long j10) {
            C2770N.this.l(false);
            if (this.f27215i) {
                this.f27215i = false;
                this.f27216j = j10;
            }
            long j11 = j10 - this.f27216j;
            r(this.f27213g.f(j11));
            this.f27214h = this.f27213g.c(j11);
        }

        public final void q() {
            this.f27215i = true;
        }

        public void r(Object obj) {
            this.f27211e.setValue(obj);
        }

        public final void s() {
            r(this.f27213g.g());
            this.f27215i = true;
        }

        public final void t(Object obj, Object obj2, C2797i iVar) {
            this.f27207a = obj;
            this.f27208b = obj2;
            this.f27212f = iVar;
            this.f27213g = new m0(iVar, this.f27209c, obj, obj2, (C2805q) null, 16, (DefaultConstructorMarker) null);
            C2770N.this.l(true);
            this.f27214h = false;
            this.f27215i = true;
        }
    }

    /* renamed from: w.N$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f27218a;

        /* renamed from: b  reason: collision with root package name */
        int f27219b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f27220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f27221d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2770N f27222e;

        /* renamed from: w.N$b$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1510r0 f27223a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2770N f27224b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f27225c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Ug.K f27226d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1510r0 r0Var, C2770N n10, K k10, Ug.K k11) {
                super(1);
                this.f27223a = r0Var;
                this.f27224b = n10;
                this.f27225c = k10;
                this.f27226d = k11;
            }

            public final void a(long j10) {
                long j11;
                A1 a12 = (A1) this.f27223a.getValue();
                if (a12 != null) {
                    j11 = ((Number) a12.getValue()).longValue();
                } else {
                    j11 = j10;
                }
                int i10 = 0;
                if (this.f27224b.f27205d == Long.MIN_VALUE || this.f27225c.f71756a != l0.n(this.f27226d.getCoroutineContext())) {
                    this.f27224b.f27205d = j10;
                    C1538b b10 = this.f27224b.f27203b;
                    int q10 = b10.q();
                    if (q10 > 0) {
                        Object[] p10 = b10.p();
                        int i11 = 0;
                        do {
                            ((a) p10[i11]).q();
                            i11++;
                        } while (i11 < q10);
                    }
                    this.f27225c.f71756a = l0.n(this.f27226d.getCoroutineContext());
                }
                if (this.f27225c.f71756a == 0.0f) {
                    C1538b b11 = this.f27224b.f27203b;
                    int q11 = b11.q();
                    if (q11 > 0) {
                        Object[] p11 = b11.p();
                        do {
                            ((a) p11[i10]).s();
                            i10++;
                        } while (i10 < q11);
                        return;
                    }
                    return;
                }
                this.f27224b.i((long) (((float) (j11 - this.f27224b.f27205d)) / this.f27225c.f71756a));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: w.N$b$b  reason: collision with other inner class name */
        static final class C0451b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Ug.K f27227a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0451b(Ug.K k10) {
                super(0);
                this.f27227a = k10;
            }

            /* renamed from: a */
            public final Float invoke() {
                return Float.valueOf(l0.n(this.f27227a.getCoroutineContext()));
            }
        }

        /* renamed from: w.N$b$c */
        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f27228a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ float f27229b;

            c(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(dVar);
                cVar.f27229b = ((Number) obj).floatValue();
                return cVar;
            }

            public final Object i(float f10, C6658d dVar) {
                return ((c) create(Float.valueOf(f10), dVar)).invokeSuspend(C6514M.f71813a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).floatValue(), (C6658d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                boolean z10;
                C6680b.f();
                if (this.f27228a == 0) {
                    w.b(obj);
                    if (this.f27229b > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1510r0 r0Var, C2770N n10, C6658d dVar) {
            super(2, dVar);
            this.f27221d = r0Var;
            this.f27222e = n10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f27221d, this.f27222e, dVar);
            bVar.f27220c = obj;
            return bVar;
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0055 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r7.f27219b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r7.f27218a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f27220c
                Ug.K r4 = (Ug.K) r4
                lf.w.b(r8)
                r8 = r4
                goto L_0x0040
            L_0x001b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0023:
                java.lang.Object r1 = r7.f27218a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f27220c
                Ug.K r4 = (Ug.K) r4
                lf.w.b(r8)
                r8 = r4
                goto L_0x0056
            L_0x0030:
                lf.w.b(r8)
                java.lang.Object r8 = r7.f27220c
                Ug.K r8 = (Ug.K) r8
                kotlin.jvm.internal.K r1 = new kotlin.jvm.internal.K
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f71756a = r4
            L_0x0040:
                w.N$b$a r4 = new w.N$b$a
                Y.r0 r5 = r7.f27221d
                w.N r6 = r7.f27222e
                r4.<init>(r5, r6, r1, r8)
                r7.f27220c = r8
                r7.f27218a = r1
                r7.f27219b = r3
                java.lang.Object r4 = w.C2768L.a(r4, r7)
                if (r4 != r0) goto L_0x0056
                return r0
            L_0x0056:
                float r4 = r1.f71756a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0040
                w.N$b$b r4 = new w.N$b$b
                r4.<init>(r8)
                Xg.f r4 = Y.p1.p(r4)
                w.N$b$c r5 = new w.N$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f27220c = r8
                r7.f27218a = r1
                r7.f27219b = r2
                java.lang.Object r4 = Xg.C5696h.v(r4, r5, r7)
                if (r4 != r0) goto L_0x0040
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C2770N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: w.N$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2770N f27230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f27231b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2770N n10, int i10) {
            super(2);
            this.f27230a = n10;
            this.f27231b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f27230a.k(mVar, M0.a(this.f27231b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public C2770N(String str) {
        this.f27202a = str;
    }

    private final boolean g() {
        return ((Boolean) this.f27204c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.f27206e.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        C1538b bVar = this.f27203b;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            z10 = true;
            int i10 = 0;
            do {
                a aVar = (a) p10[i10];
                if (!aVar.m()) {
                    aVar.n(j10);
                }
                if (!aVar.m()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < q10);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f27204c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f27206e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a aVar) {
        this.f27203b.b(aVar);
        l(true);
    }

    public final void j(a aVar) {
        this.f27203b.w(aVar);
    }

    public final void k(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(-318043801);
        if ((i10 & 6) == 0) {
            if (h10.C(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object A10 = h10.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = u1.d((Object) null, (o1) null, 2, (Object) null);
                h10.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            if (h() || g()) {
                h10.T(1719915818);
                boolean C10 = h10.C(this);
                Object A11 = h10.A();
                if (C10 || A11 == aVar.a()) {
                    A11 = new b(r0Var, this, (C6658d) null);
                    h10.r(A11);
                }
                P.g(this, (p) A11, h10, i11 & 14);
                h10.M();
            } else {
                h10.T(1721436120);
                h10.M();
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(this, i10));
        }
    }
}

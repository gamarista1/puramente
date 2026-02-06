package U;

import Ug.C5599w;
import Ug.C5600w0;
import Ug.C5603y;
import Ug.K;
import Ug.L;
import Ug.M;
import Y.C1510r0;
import Y.o1;
import e1.C1943b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import qf.C6658d;
import qf.g;
import r0.C2541w0;
import r0.C2544x0;
import r0.C2547y0;
import rf.C6680b;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import w.C2762F;
import w.C2782a;
import w.C2784b;
import w.C2798j;
import w.q0;
import yf.C6798l;
import yf.p;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private C2421g f6227a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6228b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6229c;

    /* renamed from: d  reason: collision with root package name */
    private Float f6230d;

    /* renamed from: e  reason: collision with root package name */
    private C2421g f6231e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C2782a f6232f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C2782a f6233g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C2782a f6234h;

    /* renamed from: i  reason: collision with root package name */
    private final C5599w f6235i;

    /* renamed from: j  reason: collision with root package name */
    private final C1510r0 f6236j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f6237k;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f6238a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f6239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f6240c;

        /* renamed from: d  reason: collision with root package name */
        int f6241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C6658d dVar) {
            super(dVar);
            this.f6240c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6239b = obj;
            this.f6241d |= Integer.MIN_VALUE;
            return this.f6240c.d(this);
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6242a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f6244c;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f6245a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f6246b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, C6658d dVar) {
                super(2, dVar);
                this.f6246b = hVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f6246b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f6245a;
                if (i10 == 0) {
                    w.b(obj);
                    C2782a a10 = this.f6246b.f6232f;
                    Float b10 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    q0 j10 = C2798j.j(75, 0, C2762F.e(), 2, (Object) null);
                    this.f6245a = 1;
                    if (C2782a.f(a10, b10, j10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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

        /* renamed from: U.h$b$b  reason: collision with other inner class name */
        static final class C0146b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f6247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f6248b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0146b(h hVar, C6658d dVar) {
                super(2, dVar);
                this.f6248b = hVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0146b(this.f6248b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0146b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f6247a;
                if (i10 == 0) {
                    w.b(obj);
                    C2782a c10 = this.f6248b.f6233g;
                    Float b10 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    q0 j10 = C2798j.j(225, 0, C2762F.d(), 2, (Object) null);
                    this.f6247a = 1;
                    if (C2782a.f(c10, b10, j10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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

        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f6249a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f6250b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(h hVar, C6658d dVar) {
                super(2, dVar);
                this.f6250b = hVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new c(this.f6250b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f6249a;
                if (i10 == 0) {
                    w.b(obj);
                    C2782a b10 = this.f6250b.f6234h;
                    Float b11 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    q0 j10 = C2798j.j(225, 0, C2762F.e(), 2, (Object) null);
                    this.f6249a = 1;
                    if (C2782a.f(b10, b11, j10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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
        b(h hVar, C6658d dVar) {
            super(2, dVar);
            this.f6244c = hVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f6244c, dVar);
            bVar.f6243b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f6242a == 0) {
                w.b(obj);
                K k10 = (K) this.f6243b;
                C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new a(this.f6244c, (C6658d) null), 3, (Object) null);
                C5600w0 unused2 = C5576k.d(k10, (g) null, (M) null, new C0146b(this.f6244c, (C6658d) null), 3, (Object) null);
                return C5576k.d(k10, (g) null, (M) null, new c(this.f6244c, (C6658d) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6251a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f6253c;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f6254a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f6255b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, C6658d dVar) {
                super(2, dVar);
                this.f6255b = hVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f6255b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f6254a;
                if (i10 == 0) {
                    w.b(obj);
                    C2782a a10 = this.f6255b.f6232f;
                    Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                    q0 j10 = C2798j.j(150, 0, C2762F.e(), 2, (Object) null);
                    this.f6254a = 1;
                    if (C2782a.f(a10, b10, j10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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
        c(h hVar, C6658d dVar) {
            super(2, dVar);
            this.f6253c = hVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f6253c, dVar);
            cVar.f6252b = obj;
            return cVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f6251a == 0) {
                w.b(obj);
                return C5576k.d((K) this.f6252b, (g) null, (M) null, new a(this.f6253c, (C6658d) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ h(C2421g gVar, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, f10, z10);
    }

    private final Object f(C6658d dVar) {
        Object e10 = L.e(new b(this, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    private final Object g(C6658d dVar) {
        Object e10 = L.e(new c(this, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    private final boolean i() {
        return ((Boolean) this.f6237k.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f6236j.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f6237k.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f6236j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(qf.C6658d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            U.h$a r0 = (U.h.a) r0
            int r1 = r0.f6241d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6241d = r1
            goto L_0x0018
        L_0x0013:
            U.h$a r0 = new U.h$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6239b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f6241d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            lf.w.b(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.f6238a
            U.h r2 = (U.h) r2
            lf.w.b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.f6238a
            U.h r2 = (U.h) r2
            lf.w.b(r7)
            goto L_0x0056
        L_0x0047:
            lf.w.b(r7)
            r0.f6238a = r6
            r0.f6241d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.l(r5)
            Ug.w r7 = r2.f6235i
            r0.f6238a = r2
            r0.f6241d = r4
            java.lang.Object r7 = r7.y(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.f6238a = r7
            r0.f6241d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U.h.d(qf.d):java.lang.Object");
    }

    public final void e(C2605f fVar, long j10) {
        float f10;
        if (this.f6230d == null) {
            this.f6230d = Float.valueOf(i.b(fVar.d()));
        }
        if (this.f6227a == null) {
            this.f6227a = C2421g.d(fVar.y1());
        }
        if (this.f6231e == null) {
            this.f6231e = C2421g.d(C2422h.a(C2427m.k(fVar.d()) / 2.0f, C2427m.i(fVar.d()) / 2.0f));
        }
        if (!i() || j()) {
            f10 = ((Number) this.f6232f.m()).floatValue();
        } else {
            f10 = 1.0f;
        }
        Float f11 = this.f6230d;
        C6496s.e(f11);
        float b10 = C1943b.b(f11.floatValue(), this.f6228b, ((Number) this.f6233g.m()).floatValue());
        C2421g gVar = this.f6227a;
        C6496s.e(gVar);
        float m10 = C2421g.m(gVar.v());
        C2421g gVar2 = this.f6231e;
        C6496s.e(gVar2);
        float b11 = C1943b.b(m10, C2421g.m(gVar2.v()), ((Number) this.f6234h.m()).floatValue());
        C2421g gVar3 = this.f6227a;
        C6496s.e(gVar3);
        float n10 = C2421g.n(gVar3.v());
        C2421g gVar4 = this.f6231e;
        C6496s.e(gVar4);
        long a10 = C2422h.a(b11, C1943b.b(n10, C2421g.n(gVar4.v()), ((Number) this.f6234h.m()).floatValue()));
        long o10 = C2544x0.o(j10, C2544x0.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.f6229c) {
            float k10 = C2427m.k(fVar.d());
            float i10 = C2427m.i(fVar.d());
            int b12 = C2541w0.f25557a.b();
            C2603d w12 = fVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().c(0.0f, 0.0f, k10, i10, b12);
                C2605f.n0(fVar, o10, b10, a10, 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        } else {
            C2605f.n0(fVar, o10, b10, a10, 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
        }
    }

    public final void h() {
        k(true);
        this.f6235i.j0(C6514M.f71813a);
    }

    private h(C2421g gVar, float f10, boolean z10) {
        this.f6227a = gVar;
        this.f6228b = f10;
        this.f6229c = z10;
        this.f6232f = C2784b.b(0.0f, 0.0f, 2, (Object) null);
        this.f6233g = C2784b.b(0.0f, 0.0f, 2, (Object) null);
        this.f6234h = C2784b.b(0.0f, 0.0f, 2, (Object) null);
        this.f6235i = C5603y.a((C5600w0) null);
        Boolean bool = Boolean.FALSE;
        this.f6236j = u1.d(bool, (o1) null, 2, (Object) null);
        this.f6237k = u1.d(bool, (o1) null, 2, (Object) null);
    }
}

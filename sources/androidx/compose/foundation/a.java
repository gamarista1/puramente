package androidx.compose.foundation;

import B.k;
import B.l;
import B.n;
import D0.C1124o;
import D0.C1126q;
import D0.C1127s;
import D0.J;
import D0.T;
import D0.V;
import J0.B0;
import J0.C1244j;
import J0.C1247m;
import J0.s0;
import J0.w0;
import O0.t;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import android.view.KeyEvent;
import c1.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import rf.C6680b;
import x.C2845I;
import x.C2872k;
import x.C2885x;
import x.C2887z;
import yf.C6787a;
import yf.p;
import z.r;

public abstract class a extends C1247m implements s0, B0.e, p0.b, w0, B0 {

    /* renamed from: H  reason: collision with root package name */
    public static final C0229a f12456H = new C0229a((DefaultConstructorMarker) null);

    /* renamed from: I  reason: collision with root package name */
    public static final int f12457I = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public n.b f12458A;

    /* renamed from: B  reason: collision with root package name */
    private B.g f12459B;

    /* renamed from: C  reason: collision with root package name */
    private final Map f12460C;

    /* renamed from: D  reason: collision with root package name */
    private long f12461D;

    /* renamed from: E  reason: collision with root package name */
    private l f12462E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f12463F;

    /* renamed from: G  reason: collision with root package name */
    private final Object f12464G;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public l f12465p;

    /* renamed from: q  reason: collision with root package name */
    private C2845I f12466q;

    /* renamed from: r  reason: collision with root package name */
    private String f12467r;

    /* renamed from: s  reason: collision with root package name */
    private O0.g f12468s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f12469t;

    /* renamed from: u  reason: collision with root package name */
    private C6787a f12470u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f12471v;

    /* renamed from: w  reason: collision with root package name */
    private final C2885x f12472w;

    /* renamed from: x  reason: collision with root package name */
    private final C2887z f12473x;

    /* renamed from: y  reason: collision with root package name */
    private V f12474y;

    /* renamed from: z  reason: collision with root package name */
    private C1244j f12475z;

    /* renamed from: androidx.compose.foundation.a$a  reason: collision with other inner class name */
    public static final class C0229a {
        public /* synthetic */ C0229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0229a() {
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12476a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f12476a = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            this.f12476a.E2().invoke();
            return Boolean.TRUE;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f12478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B.g f12479c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, B.g gVar, C6658d dVar) {
            super(2, dVar);
            this.f12478b = lVar;
            this.f12479c = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f12478b, this.f12479c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12477a;
            if (i10 == 0) {
                w.b(obj);
                l lVar = this.f12478b;
                B.g gVar = this.f12479c;
                this.f12477a = 1;
                if (lVar.b(gVar, this) == f10) {
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

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f12481b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B.h f12482c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, B.h hVar, C6658d dVar) {
            super(2, dVar);
            this.f12481b = lVar;
            this.f12482c = hVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f12481b, this.f12482c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12480a;
            if (i10 == 0) {
                w.b(obj);
                l lVar = this.f12481b;
                B.h hVar = this.f12482c;
                this.f12480a = 1;
                if (lVar.b(hVar, this) == f10) {
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

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        boolean f12483a;

        /* renamed from: b  reason: collision with root package name */
        int f12484b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f12485c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f12486d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f12487e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f12488f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f12489g;

        /* renamed from: androidx.compose.foundation.a$e$a  reason: collision with other inner class name */
        static final class C0230a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f12490a;

            /* renamed from: b  reason: collision with root package name */
            int f12491b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f12492c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f12493d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ l f12494e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0230a(a aVar, long j10, l lVar, C6658d dVar) {
                super(2, dVar);
                this.f12492c = aVar;
                this.f12493d = j10;
                this.f12494e = lVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0230a(this.f12492c, this.f12493d, this.f12494e, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0230a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                n.b bVar;
                Object f10 = C6680b.f();
                int i10 = this.f12491b;
                if (i10 == 0) {
                    w.b(obj);
                    if (this.f12492c.z2()) {
                        long a10 = C2872k.a();
                        this.f12491b = 1;
                        if (Ug.V.a(a10, this) == f10) {
                            return f10;
                        }
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else if (i10 == 2) {
                    bVar = (n.b) this.f12490a;
                    w.b(obj);
                    this.f12492c.f12458A = bVar;
                    return C6514M.f71813a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b bVar2 = new n.b(this.f12493d, (DefaultConstructorMarker) null);
                l lVar = this.f12494e;
                this.f12490a = bVar2;
                this.f12491b = 2;
                if (lVar.b(bVar2, this) == f10) {
                    return f10;
                }
                bVar = bVar2;
                this.f12492c.f12458A = bVar;
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar, long j10, l lVar, a aVar, C6658d dVar) {
            super(2, dVar);
            this.f12486d = rVar;
            this.f12487e = j10;
            this.f12488f = lVar;
            this.f12489g = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f12486d, this.f12487e, this.f12488f, this.f12489g, dVar);
            eVar.f12485c = obj;
            return eVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f12484b
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x0041
                if (r2 == r7) goto L_0x0037
                if (r2 == r6) goto L_0x0031
                if (r2 == r5) goto L_0x0028
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                goto L_0x0023
            L_0x001b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0023:
                lf.w.b(r17)
                goto L_0x00d1
            L_0x0028:
                java.lang.Object r2 = r0.f12485c
                B.n$c r2 = (B.n.c) r2
                lf.w.b(r17)
                goto L_0x00a2
            L_0x0031:
                boolean r2 = r0.f12483a
                lf.w.b(r17)
                goto L_0x0086
            L_0x0037:
                java.lang.Object r2 = r0.f12485c
                Ug.w0 r2 = (Ug.C5600w0) r2
                lf.w.b(r17)
                r7 = r17
                goto L_0x006c
            L_0x0041:
                lf.w.b(r17)
                java.lang.Object r2 = r0.f12485c
                r9 = r2
                Ug.K r9 = (Ug.K) r9
                androidx.compose.foundation.a$e$a r2 = new androidx.compose.foundation.a$e$a
                androidx.compose.foundation.a r11 = r0.f12489g
                long r12 = r0.f12487e
                B.l r14 = r0.f12488f
                r15 = 0
                r10 = r2
                r10.<init>(r11, r12, r14, r15)
                r13 = 3
                r14 = 0
                r10 = 0
                r11 = 0
                r12 = r2
                Ug.w0 r2 = Ug.C5576k.d(r9, r10, r11, r12, r13, r14)
                z.r r9 = r0.f12486d
                r0.f12485c = r2
                r0.f12484b = r7
                java.lang.Object r7 = r9.j1(r0)
                if (r7 != r1) goto L_0x006c
                return r1
            L_0x006c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                boolean r9 = r2.a()
                if (r9 == 0) goto L_0x00af
                r0.f12485c = r8
                r0.f12483a = r7
                r0.f12484b = r6
                java.lang.Object r2 = Ug.A0.g(r2, r0)
                if (r2 != r1) goto L_0x0085
                return r1
            L_0x0085:
                r2 = r7
            L_0x0086:
                if (r2 == 0) goto L_0x00d1
                B.n$b r2 = new B.n$b
                long r6 = r0.f12487e
                r2.<init>(r6, r8)
                B.n$c r3 = new B.n$c
                r3.<init>(r2)
                B.l r6 = r0.f12488f
                r0.f12485c = r3
                r0.f12484b = r5
                java.lang.Object r2 = r6.b(r2, r0)
                if (r2 != r1) goto L_0x00a1
                return r1
            L_0x00a1:
                r2 = r3
            L_0x00a2:
                B.l r3 = r0.f12488f
                r0.f12485c = r8
                r0.f12484b = r4
                java.lang.Object r2 = r3.b(r2, r0)
                if (r2 != r1) goto L_0x00d1
                return r1
            L_0x00af:
                androidx.compose.foundation.a r2 = r0.f12489g
                B.n$b r2 = r2.f12458A
                if (r2 == 0) goto L_0x00d1
                B.l r4 = r0.f12488f
                if (r7 == 0) goto L_0x00c1
                B.n$c r5 = new B.n$c
                r5.<init>(r2)
                goto L_0x00c6
            L_0x00c1:
                B.n$a r5 = new B.n$a
                r5.<init>(r2)
            L_0x00c6:
                r0.f12485c = r8
                r0.f12484b = r3
                java.lang.Object r2 = r4.b(r5, r0)
                if (r2 != r1) goto L_0x00d1
                return r1
            L_0x00d1:
                androidx.compose.foundation.a r1 = r0.f12489g
                r1.f12458A = r8
                lf.M r1 = lf.C6514M.f71813a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n.b f12497c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, n.b bVar, C6658d dVar) {
            super(2, dVar);
            this.f12496b = aVar;
            this.f12497c = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f12496b, this.f12497c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12495a;
            if (i10 == 0) {
                w.b(obj);
                l u22 = this.f12496b.f12465p;
                if (u22 != null) {
                    n.b bVar = this.f12497c;
                    this.f12495a = 1;
                    if (u22.b(bVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n.b f12500c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, n.b bVar, C6658d dVar) {
            super(2, dVar);
            this.f12499b = aVar;
            this.f12500c = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new g(this.f12499b, this.f12500c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((g) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12498a;
            if (i10 == 0) {
                w.b(obj);
                l u22 = this.f12499b.f12465p;
                if (u22 != null) {
                    n.c cVar = new n.c(this.f12500c);
                    this.f12498a = 1;
                    if (u22.b(cVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12502b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, C6658d dVar) {
            super(2, dVar);
            this.f12502b = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new h(this.f12502b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f12501a == 0) {
                w.b(obj);
                this.f12502b.B2();
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12504b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, C6658d dVar) {
            super(2, dVar);
            this.f12504b = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new i(this.f12504b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((i) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f12503a == 0) {
                w.b(obj);
                this.f12504b.C2();
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12505a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12506b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f12507c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, C6658d dVar) {
            super(2, dVar);
            this.f12507c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            j jVar = new j(this.f12507c, dVar);
            jVar.f12506b = obj;
            return jVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((j) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12505a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = this.f12507c;
                this.f12505a = 1;
                if (aVar.y2((J) this.f12506b, this) == f10) {
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

    public /* synthetic */ a(l lVar, C2845I i10, boolean z10, String str, O0.g gVar, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, i10, z10, str, gVar, aVar);
    }

    /* access modifiers changed from: private */
    public final void B2() {
        if (this.f12459B == null) {
            B.g gVar = new B.g();
            l lVar = this.f12465p;
            if (lVar != null) {
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new c(lVar, gVar, (C6658d) null), 3, (Object) null);
            }
            this.f12459B = gVar;
        }
    }

    /* access modifiers changed from: private */
    public final void C2() {
        B.g gVar = this.f12459B;
        if (gVar != null) {
            B.h hVar = new B.h(gVar);
            l lVar = this.f12465p;
            if (lVar != null) {
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new d(lVar, hVar, (C6658d) null), 3, (Object) null);
            }
            this.f12459B = null;
        }
    }

    private final void G2() {
        C2845I i10;
        if (this.f12475z == null && (i10 = this.f12466q) != null) {
            if (this.f12465p == null) {
                this.f12465p = k.a();
            }
            this.f12473x.r2(this.f12465p);
            l lVar = this.f12465p;
            C6496s.e(lVar);
            C1244j a10 = i10.a(lVar);
            l2(a10);
            this.f12475z = a10;
        }
    }

    private final boolean I2() {
        if (this.f12462E != null || this.f12466q == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean z2() {
        if (d.g(this) || C2872k.c(this)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void A2() {
        l lVar = this.f12465p;
        if (lVar != null) {
            n.b bVar = this.f12458A;
            if (bVar != null) {
                lVar.a(new n.a(bVar));
            }
            B.g gVar = this.f12459B;
            if (gVar != null) {
                lVar.a(new B.h(gVar));
            }
            for (n.b aVar : this.f12460C.values()) {
                lVar.a(new n.a(aVar));
            }
        }
        this.f12458A = null;
        this.f12459B = null;
        this.f12460C.clear();
    }

    public final void C0(C1124o oVar, C1126q qVar, long j10) {
        long b10 = s.b(j10);
        this.f12461D = C2422h.a((float) c1.n.j(b10), (float) c1.n.k(b10));
        G2();
        if (this.f12469t && qVar == C1126q.Main) {
            int f10 = oVar.f();
            C1127s.a aVar = C1127s.f1491a;
            if (C1127s.i(f10, aVar.a())) {
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new h(this, (C6658d) null), 3, (Object) null);
            } else if (C1127s.i(f10, aVar.b())) {
                C5600w0 unused2 = C5576k.d(L1(), (qf.g) null, (M) null, new i(this, (C6658d) null), 3, (Object) null);
            }
        }
        if (this.f12474y == null) {
            this.f12474y = (V) l2(T.a(new j(this, (C6658d) null)));
        }
        V v10 = this.f12474y;
        if (v10 != null) {
            v10.C0(oVar, qVar, j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean D2() {
        return this.f12469t;
    }

    /* access modifiers changed from: protected */
    public final C6787a E2() {
        return this.f12470u;
    }

    public final boolean F1() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final Object F2(r rVar, long j10, C6658d dVar) {
        Object e10;
        l lVar = this.f12465p;
        if (lVar == null || (e10 = L.e(new e(rVar, j10, lVar, this, (C6658d) null), dVar)) != C6680b.f()) {
            return C6514M.f71813a;
        }
        return e10;
    }

    /* access modifiers changed from: protected */
    public final C6514M H2() {
        V v10 = this.f12474y;
        if (v10 == null) {
            return null;
        }
        v10.P0();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r2.f12475z == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J2(B.l r3, x.C2845I r4, boolean r5, java.lang.String r6, O0.g r7, yf.C6787a r8) {
        /*
            r2 = this;
            B.l r0 = r2.f12462E
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r3)
            r1 = 1
            if (r0 != 0) goto L_0x0012
            r2.A2()
            r2.f12462E = r3
            r2.f12465p = r3
            r3 = r1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            x.I r0 = r2.f12466q
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r4)
            if (r0 != 0) goto L_0x001e
            r2.f12466q = r4
            r3 = r1
        L_0x001e:
            boolean r4 = r2.f12469t
            if (r4 == r5) goto L_0x0041
            if (r5 == 0) goto L_0x002f
            x.x r4 = r2.f12472w
            r2.l2(r4)
            x.z r4 = r2.f12473x
            r2.l2(r4)
            goto L_0x003c
        L_0x002f:
            x.x r4 = r2.f12472w
            r2.o2(r4)
            x.z r4 = r2.f12473x
            r2.o2(r4)
            r2.A2()
        L_0x003c:
            J0.x0.b(r2)
            r2.f12469t = r5
        L_0x0041:
            java.lang.String r4 = r2.f12467r
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r6)
            if (r4 != 0) goto L_0x004e
            r2.f12467r = r6
            J0.x0.b(r2)
        L_0x004e:
            O0.g r4 = r2.f12468s
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r7)
            if (r4 != 0) goto L_0x005b
            r2.f12468s = r7
            J0.x0.b(r2)
        L_0x005b:
            r2.f12470u = r8
            boolean r4 = r2.f12463F
            boolean r5 = r2.I2()
            if (r4 == r5) goto L_0x0072
            boolean r4 = r2.I2()
            r2.f12463F = r4
            if (r4 != 0) goto L_0x0072
            J0.j r4 = r2.f12475z
            if (r4 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 == 0) goto L_0x0088
            J0.j r3 = r2.f12475z
            if (r3 != 0) goto L_0x007d
            boolean r4 = r2.f12463F
            if (r4 != 0) goto L_0x0088
        L_0x007d:
            if (r3 == 0) goto L_0x0082
            r2.o2(r3)
        L_0x0082:
            r3 = 0
            r2.f12475z = r3
            r2.G2()
        L_0x0088:
            x.z r3 = r2.f12473x
            B.l r4 = r2.f12465p
            r3.r2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.J2(B.l, x.I, boolean, java.lang.String, O0.g, yf.a):void");
    }

    public Object L() {
        return this.f12464G;
    }

    public final boolean Q1() {
        return this.f12471v;
    }

    public final boolean T0(KeyEvent keyEvent) {
        return false;
    }

    public final void V1() {
        if (!this.f12463F) {
            G2();
        }
        if (this.f12469t) {
            l2(this.f12472w);
            l2(this.f12473x);
        }
    }

    public final void W(v vVar) {
        O0.g gVar = this.f12468s;
        if (gVar != null) {
            C6496s.e(gVar);
            t.g0(vVar, gVar.n());
        }
        t.x(vVar, this.f12467r, new b(this));
        if (this.f12469t) {
            this.f12473x.W(vVar);
        } else {
            t.k(vVar);
        }
        x2(vVar);
    }

    public final void W1() {
        A2();
        if (this.f12462E == null) {
            this.f12465p = null;
        }
        C1244j jVar = this.f12475z;
        if (jVar != null) {
            o2(jVar);
        }
        this.f12475z = null;
    }

    public final boolean e1(KeyEvent keyEvent) {
        G2();
        if (!this.f12469t || !C2872k.f(keyEvent)) {
            if (!this.f12469t || !C2872k.b(keyEvent)) {
                return false;
            }
            n.b bVar = (n.b) this.f12460C.remove(B0.a.m(B0.d.a(keyEvent)));
            if (!(bVar == null || this.f12465p == null)) {
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new g(this, bVar, (C6658d) null), 3, (Object) null);
            }
            this.f12470u.invoke();
        } else if (this.f12460C.containsKey(B0.a.m(B0.d.a(keyEvent)))) {
            return false;
        } else {
            n.b bVar2 = new n.b(this.f12461D, (DefaultConstructorMarker) null);
            this.f12460C.put(B0.a.m(B0.d.a(keyEvent)), bVar2);
            if (this.f12465p != null) {
                C5600w0 unused2 = C5576k.d(L1(), (qf.g) null, (M) null, new f(this, bVar2, (C6658d) null), 3, (Object) null);
            }
        }
        return true;
    }

    public final void i1() {
        B.g gVar;
        l lVar = this.f12465p;
        if (!(lVar == null || (gVar = this.f12459B) == null)) {
            lVar.a(new B.h(gVar));
        }
        this.f12459B = null;
        V v10 = this.f12474y;
        if (v10 != null) {
            v10.i1();
        }
    }

    public final void m0(p0.l lVar) {
        if (lVar.a()) {
            G2();
        }
        if (this.f12469t) {
            this.f12473x.m0(lVar);
        }
    }

    public abstract Object y2(J j10, C6658d dVar);

    private a(l lVar, C2845I i10, boolean z10, String str, O0.g gVar, C6787a aVar) {
        this.f12465p = lVar;
        this.f12466q = i10;
        this.f12467r = str;
        this.f12468s = gVar;
        this.f12469t = z10;
        this.f12470u = aVar;
        this.f12472w = new C2885x();
        this.f12473x = new C2887z(this.f12465p);
        this.f12460C = new LinkedHashMap();
        this.f12461D = C2421g.f25320b.c();
        this.f12462E = this.f12465p;
        this.f12463F = I2();
        this.f12464G = f12456H;
    }

    public void x2(v vVar) {
    }
}

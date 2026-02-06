package Z3;

import H0.C1187h;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Ug.U0;
import Ug.Z;
import X3.g;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.N;
import Xg.x;
import Y.C1503n0;
import Y.C1510r0;
import Y.D0;
import Y.T0;
import Y.o1;
import Y.p1;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import j4.C3619f;
import j4.C3622i;
import j4.C3623j;
import j4.C3631r;
import java.util.concurrent.CancellationException;
import k4.C3663e;
import k4.C3668j;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6479a;
import kotlin.jvm.internal.C6491m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l4.C3737c;
import lf.C6514M;
import lf.C6525i;
import lf.C6535s;
import lf.w;
import n4.C3854a;
import n4.C3856c;
import q0.C2427m;
import qf.C6658d;
import r0.C2465Q;
import r0.C2547y0;
import rf.C6680b;
import t0.C2605f;
import w0.C2816b;
import w0.C2817c;
import yf.C6798l;
import yf.p;

public final class f extends C2817c implements T0 {

    /* renamed from: v  reason: collision with root package name */
    public static final a f10429v = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final C6798l f10430w = new e();

    /* renamed from: g  reason: collision with root package name */
    private K f10431g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final x f10432h = N.a(C2427m.c(C2427m.f25341b.b()));

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f10433i = u1.d((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: j  reason: collision with root package name */
    private final C1503n0 f10434j = D0.a(1.0f);

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f10435k = u1.d((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    private b f10436l;

    /* renamed from: m  reason: collision with root package name */
    private C2817c f10437m;

    /* renamed from: n  reason: collision with root package name */
    private C6798l f10438n;

    /* renamed from: o  reason: collision with root package name */
    private C6798l f10439o;

    /* renamed from: p  reason: collision with root package name */
    private C1187h f10440p;

    /* renamed from: q  reason: collision with root package name */
    private int f10441q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10442r;

    /* renamed from: s  reason: collision with root package name */
    private final C1510r0 f10443s;

    /* renamed from: t  reason: collision with root package name */
    private final C1510r0 f10444t;

    /* renamed from: u  reason: collision with root package name */
    private final C1510r0 f10445u;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6798l a() {
            return f.f10430w;
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10446a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public C2817c a() {
                return null;
            }

            public boolean equals(Object obj) {
                if (this != obj && !(obj instanceof a)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1515560141;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* renamed from: Z3.f$b$b  reason: collision with other inner class name */
        public static final class C0194b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C2817c f10447a;

            /* renamed from: b  reason: collision with root package name */
            private final C3619f f10448b;

            public C0194b(C2817c cVar, C3619f fVar) {
                super((DefaultConstructorMarker) null);
                this.f10447a = cVar;
                this.f10448b = fVar;
            }

            public C2817c a() {
                return this.f10447a;
            }

            public final C3619f b() {
                return this.f10448b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0194b)) {
                    return false;
                }
                C0194b bVar = (C0194b) obj;
                if (C6496s.c(this.f10447a, bVar.f10447a) && C6496s.c(this.f10448b, bVar.f10448b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int i10;
                C2817c cVar = this.f10447a;
                if (cVar == null) {
                    i10 = 0;
                } else {
                    i10 = cVar.hashCode();
                }
                return (i10 * 31) + this.f10448b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f10447a + ", result=" + this.f10448b + ')';
            }
        }

        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C2817c f10449a;

            public c(C2817c cVar) {
                super((DefaultConstructorMarker) null);
                this.f10449a = cVar;
            }

            public C2817c a() {
                return this.f10449a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && C6496s.c(this.f10449a, ((c) obj).f10449a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                C2817c cVar = this.f10449a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f10449a + ')';
            }
        }

        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C2817c f10450a;

            /* renamed from: b  reason: collision with root package name */
            private final C3631r f10451b;

            public d(C2817c cVar, C3631r rVar) {
                super((DefaultConstructorMarker) null);
                this.f10450a = cVar;
                this.f10451b = rVar;
            }

            public C2817c a() {
                return this.f10450a;
            }

            public final C3631r b() {
                return this.f10451b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (C6496s.c(this.f10450a, dVar.f10450a) && C6496s.c(this.f10451b, dVar.f10451b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f10450a.hashCode() * 31) + this.f10451b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f10450a + ", result=" + this.f10451b + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C2817c a();

        private b() {
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f10453b;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f10454a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f10455b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f10456c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, C6658d dVar) {
                super(2, dVar);
                this.f10456c = fVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f10456c, dVar);
                aVar.f10455b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C3622i iVar, C6658d dVar) {
                return ((a) create(iVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                f fVar;
                Object f10 = C6680b.f();
                int i10 = this.f10454a;
                if (i10 == 0) {
                    w.b(obj);
                    f fVar2 = this.f10456c;
                    g y10 = fVar2.y();
                    C3622i t10 = this.f10456c.S((C3622i) this.f10455b);
                    this.f10455b = fVar2;
                    this.f10454a = 1;
                    obj = y10.a(t10, this);
                    if (obj == f10) {
                        return f10;
                    }
                    fVar = fVar2;
                } else if (i10 == 1) {
                    fVar = (f) this.f10455b;
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return fVar.R((C3623j) obj);
            }
        }

        /* synthetic */ class b implements C5695g, C6491m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f10457a;

            b(f fVar) {
                this.f10457a = fVar;
            }

            /* renamed from: a */
            public final Object emit(b bVar, C6658d dVar) {
                Object j10 = this.f10457a.T(bVar);
                if (j10 == C6680b.f()) {
                    return j10;
                }
                return C6514M.f71813a;
            }

            public final C6525i d() {
                return new C6479a(2, this.f10457a, f.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C5695g) || !(obj instanceof C6491m)) {
                    return false;
                }
                return C6496s.c(d(), ((C6491m) obj).d());
            }

            public final int hashCode() {
                return d().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C6658d dVar) {
            super(2, dVar);
            this.f10453b = fVar;
        }

        /* access modifiers changed from: private */
        public static final C3622i l(f fVar) {
            return fVar.A();
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f10453b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f10452a;
            if (i10 == 0) {
                w.b(obj);
                C5694f C10 = C5696h.C(p1.p(new g(this.f10453b)), new a(this.f10453b, (C6658d) null));
                b bVar = new b(this.f10453b);
                this.f10452a = 1;
                if (C10.collect(bVar, this) == f10) {
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

    static final class e implements C3668j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f10459b;

        public static final class a implements C5694f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5694f f10460a;

            /* renamed from: Z3.f$e$a$a  reason: collision with other inner class name */
            public static final class C0195a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C5695g f10461a;

                /* renamed from: Z3.f$e$a$a$a  reason: collision with other inner class name */
                public static final class C0196a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f10462a;

                    /* renamed from: b  reason: collision with root package name */
                    int f10463b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ C0195a f10464c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0196a(C0195a aVar, C6658d dVar) {
                        super(dVar);
                        this.f10464c = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f10462a = obj;
                        this.f10463b |= Integer.MIN_VALUE;
                        return this.f10464c.emit((Object) null, this);
                    }
                }

                public C0195a(C5695g gVar) {
                    this.f10461a = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, qf.C6658d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof Z3.f.e.a.C0195a.C0196a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        Z3.f$e$a$a$a r0 = (Z3.f.e.a.C0195a.C0196a) r0
                        int r1 = r0.f10463b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f10463b = r1
                        goto L_0x0018
                    L_0x0013:
                        Z3.f$e$a$a$a r0 = new Z3.f$e$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f10462a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f10463b
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        lf.w.b(r8)
                        goto L_0x004b
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        lf.w.b(r8)
                        Xg.g r8 = r6.f10461a
                        q0.m r7 = (q0.C2427m) r7
                        long r4 = r7.o()
                        k4.i r7 = Z3.h.e(r4)
                        if (r7 == 0) goto L_0x004b
                        r0.f10463b = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L_0x004b
                        return r1
                    L_0x004b:
                        lf.M r7 = lf.C6514M.f71813a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Z3.f.e.a.C0195a.emit(java.lang.Object, qf.d):java.lang.Object");
                }
            }

            public a(C5694f fVar) {
                this.f10460a = fVar;
            }

            public Object collect(C5695g gVar, C6658d dVar) {
                Object collect = this.f10460a.collect(new C0195a(gVar), dVar);
                if (collect == C6680b.f()) {
                    return collect;
                }
                return C6514M.f71813a;
            }
        }

        e(f fVar) {
            this.f10459b = fVar;
        }

        public final Object b(C6658d dVar) {
            return C5696h.u(new a(this.f10459b.f10432h), dVar);
        }
    }

    public f(C3622i iVar, g gVar) {
        b.a aVar = b.a.f10446a;
        this.f10436l = aVar;
        this.f10438n = f10430w;
        this.f10440p = C1187h.f2609a.d();
        this.f10441q = C2605f.f25940d0.b();
        this.f10443s = u1.d(aVar, (o1) null, 2, (Object) null);
        this.f10444t = u1.d(iVar, (o1) null, 2, (Object) null);
        this.f10445u = u1.d(gVar, (o1) null, 2, (Object) null);
    }

    private final o C(b bVar, b bVar2) {
        C3623j jVar;
        C2817c cVar;
        boolean z10;
        if (bVar2 instanceof b.d) {
            jVar = ((b.d) bVar2).b();
        } else {
            if (bVar2 instanceof b.C0194b) {
                jVar = ((b.C0194b) bVar2).b();
            }
            return null;
        }
        C3856c a10 = jVar.b().P().a(h.f10466a, jVar);
        if (a10 instanceof C3854a) {
            C2817c a11 = bVar.a();
            if (bVar instanceof b.c) {
                cVar = a11;
            } else {
                cVar = null;
            }
            C2817c a12 = bVar2.a();
            C1187h hVar = this.f10440p;
            C3854a aVar = (C3854a) a10;
            int b10 = aVar.b();
            if (!(jVar instanceof C3631r) || !((C3631r) jVar).d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new o(cVar, a12, hVar, b10, z10, aVar.c());
        }
        return null;
    }

    private final void D(float f10) {
        this.f10434j.l(f10);
    }

    private final void E(C2547y0 y0Var) {
        this.f10435k.setValue(y0Var);
    }

    private final void J(C2817c cVar) {
        this.f10433i.setValue(cVar);
    }

    private final void M(b bVar) {
        this.f10443s.setValue(bVar);
    }

    private final void O(C2817c cVar) {
        this.f10437m = cVar;
        J(cVar);
    }

    private final void P(b bVar) {
        this.f10436l = bVar;
        M(bVar);
    }

    /* access modifiers changed from: private */
    public final C2817c Q(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return C2816b.b(C2465Q.c(((BitmapDrawable) drawable).getBitmap()), 0, 0, this.f10441q, 6, (Object) null);
        }
        return new R8.a(drawable.mutate());
    }

    /* access modifiers changed from: private */
    public final b R(C3623j jVar) {
        C2817c cVar;
        if (jVar instanceof C3631r) {
            C3631r rVar = (C3631r) jVar;
            return new b.d(Q(rVar.a()), rVar);
        } else if (jVar instanceof C3619f) {
            C3619f fVar = (C3619f) jVar;
            Drawable a10 = fVar.a();
            if (a10 != null) {
                cVar = Q(a10);
            } else {
                cVar = null;
            }
            return new b.C0194b(cVar, fVar);
        } else {
            throw new C6535s();
        }
    }

    /* access modifiers changed from: private */
    public final C3622i S(C3622i iVar) {
        C3622i.a C10 = C3622i.R(iVar, (Context) null, 1, (Object) null).C(new d(this));
        if (iVar.q().m() == null) {
            C10.A(new e(this));
        }
        if (iVar.q().l() == null) {
            C10.u(z.n(this.f10440p));
        }
        if (iVar.q().k() != C3663e.EXACT) {
            C10.o(C3663e.INEXACT);
        }
        return C10.a();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [w0.c] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(Z3.f.b r4) {
        /*
            r3 = this;
            Z3.f$b r0 = r3.f10436l
            yf.l r1 = r3.f10438n
            java.lang.Object r4 = r1.invoke(r4)
            Z3.f$b r4 = (Z3.f.b) r4
            r3.P(r4)
            Z3.o r1 = r3.C(r0, r4)
            if (r1 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            w0.c r1 = r4.a()
        L_0x0018:
            r3.O(r1)
            Ug.K r1 = r3.f10431g
            if (r1 == 0) goto L_0x004b
            w0.c r1 = r0.a()
            w0.c r2 = r4.a()
            if (r1 == r2) goto L_0x004b
            w0.c r0 = r0.a()
            boolean r1 = r0 instanceof Y.T0
            r2 = 0
            if (r1 == 0) goto L_0x0035
            Y.T0 r0 = (Y.T0) r0
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.d()
        L_0x003b:
            w0.c r0 = r4.a()
            boolean r1 = r0 instanceof Y.T0
            if (r1 == 0) goto L_0x0046
            r2 = r0
            Y.T0 r2 = (Y.T0) r2
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.b()
        L_0x004b:
            yf.l r0 = r3.f10439o
            if (r0 == 0) goto L_0x0052
            r0.invoke(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.f.T(Z3.f$b):void");
    }

    private final void v() {
        K k10 = this.f10431g;
        if (k10 != null) {
            L.d(k10, (CancellationException) null, 1, (Object) null);
        }
        this.f10431g = null;
    }

    private final float w() {
        return this.f10434j.c();
    }

    private final C2547y0 x() {
        return (C2547y0) this.f10435k.getValue();
    }

    private final C2817c z() {
        return (C2817c) this.f10433i.getValue();
    }

    public final C3622i A() {
        return (C3622i) this.f10444t.getValue();
    }

    public final b B() {
        return (b) this.f10443s.getValue();
    }

    public final void F(C1187h hVar) {
        this.f10440p = hVar;
    }

    public final void G(int i10) {
        this.f10441q = i10;
    }

    public final void H(g gVar) {
        this.f10445u.setValue(gVar);
    }

    public final void I(C6798l lVar) {
        this.f10439o = lVar;
    }

    public final void K(boolean z10) {
        this.f10442r = z10;
    }

    public final void L(C3622i iVar) {
        this.f10444t.setValue(iVar);
    }

    public final void N(C6798l lVar) {
        this.f10438n = lVar;
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        D(f10);
        return true;
    }

    public void b() {
        T0 t02;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f10431g == null) {
                C2817c cVar = null;
                K a10 = L.a(U0.b((C5600w0) null, 1, (Object) null).n1(Z.c().D1()));
                this.f10431g = a10;
                C2817c cVar2 = this.f10437m;
                if (cVar2 instanceof T0) {
                    t02 = (T0) cVar2;
                } else {
                    t02 = null;
                }
                if (t02 != null) {
                    t02.b();
                }
                if (this.f10442r) {
                    Drawable F10 = C3622i.R(A(), (Context) null, 1, (Object) null).e(y().b()).a().F();
                    if (F10 != null) {
                        cVar = Q(F10);
                    }
                    T(new b.c(cVar));
                } else {
                    C5600w0 unused = C5576k.d(a10, (qf.g) null, (M) null, new c(this, (C6658d) null), 3, (Object) null);
                }
            }
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void c() {
        T0 t02;
        v();
        C2817c cVar = this.f10437m;
        if (cVar instanceof T0) {
            t02 = (T0) cVar;
        } else {
            t02 = null;
        }
        if (t02 != null) {
            t02.c();
        }
    }

    public void d() {
        T0 t02;
        v();
        C2817c cVar = this.f10437m;
        if (cVar instanceof T0) {
            t02 = (T0) cVar;
        } else {
            t02 = null;
        }
        if (t02 != null) {
            t02.d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean e(C2547y0 y0Var) {
        E(y0Var);
        return true;
    }

    public long k() {
        C2817c z10 = z();
        if (z10 != null) {
            return z10.k();
        }
        return C2427m.f25341b.a();
    }

    /* access modifiers changed from: protected */
    public void m(C2605f fVar) {
        this.f10432h.setValue(C2427m.c(fVar.d()));
        C2817c z10 = z();
        if (z10 != null) {
            z10.j(fVar, fVar.d(), w(), x());
        }
    }

    public final g y() {
        return (g) this.f10445u.getValue();
    }

    public static final class d implements C3737c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f10458a;

        public d(f fVar) {
            this.f10458a = fVar;
        }

        public void onStart(Drawable drawable) {
            C2817c cVar;
            f fVar = this.f10458a;
            if (drawable != null) {
                cVar = this.f10458a.Q(drawable);
            } else {
                cVar = null;
            }
            fVar.T(new b.c(cVar));
        }

        public void onError(Drawable drawable) {
        }

        public void onSuccess(Drawable drawable) {
        }
    }

    /* access modifiers changed from: private */
    public static final b o(b bVar) {
        return bVar;
    }
}

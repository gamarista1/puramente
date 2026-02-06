package W;

import Y.A1;
import Y.C1503n0;
import Y.C1510r0;
import Y.D0;
import Y.o1;
import Y.p1;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;
import yf.r;
import z.m;

/* renamed from: W.f  reason: case insensitive filesystem */
public final class C1431f {

    /* renamed from: p  reason: collision with root package name */
    public static final a f8292p = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f8293a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f8294b;

    /* renamed from: c  reason: collision with root package name */
    private final C2797i f8295c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f8296d;

    /* renamed from: e  reason: collision with root package name */
    private final n f8297e = new n();

    /* renamed from: f  reason: collision with root package name */
    private final m f8298f = new h(this);

    /* renamed from: g  reason: collision with root package name */
    private final C1510r0 f8299g;

    /* renamed from: h  reason: collision with root package name */
    private final A1 f8300h;

    /* renamed from: i  reason: collision with root package name */
    private final A1 f8301i;

    /* renamed from: j  reason: collision with root package name */
    private final C1503n0 f8302j;

    /* renamed from: k  reason: collision with root package name */
    private final A1 f8303k;

    /* renamed from: l  reason: collision with root package name */
    private final C1503n0 f8304l;

    /* renamed from: m  reason: collision with root package name */
    private final C1510r0 f8305m;

    /* renamed from: n  reason: collision with root package name */
    private final C1510r0 f8306n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C1430e f8307o;

    /* renamed from: W.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: W.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f8308a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f8309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1431f f8310c;

        /* renamed from: d  reason: collision with root package name */
        int f8311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1431f fVar, C6658d dVar) {
            super(dVar);
            this.f8310c = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8309b = obj;
            this.f8311d |= Integer.MIN_VALUE;
            return this.f8310c.j((C2848L) null, (q) null, this);
        }
    }

    /* renamed from: W.f$c */
    static final class c extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f8312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1431f f8313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f8314c;

        /* renamed from: W.f$c$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1431f f8315a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1431f fVar) {
                super(0);
                this.f8315a = fVar;
            }

            /* renamed from: a */
            public final h invoke() {
                return this.f8315a.o();
            }
        }

        /* renamed from: W.f$c$b */
        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f8316a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f8317b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q f8318c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1431f f8319d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(q qVar, C1431f fVar, C6658d dVar) {
                super(2, dVar);
                this.f8318c = qVar;
                this.f8319d = fVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                b bVar = new b(this.f8318c, this.f8319d, dVar);
                bVar.f8317b = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(h hVar, C6658d dVar) {
                return ((b) create(hVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f8316a;
                if (i10 == 0) {
                    w.b(obj);
                    q qVar = this.f8318c;
                    C1430e c10 = this.f8319d.f8307o;
                    this.f8316a = 1;
                    if (qVar.invoke(c10, (h) this.f8317b, this) == f10) {
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
        c(C1431f fVar, q qVar, C6658d dVar) {
            super(1, dVar);
            this.f8313b = fVar;
            this.f8314c = qVar;
        }

        public final C6658d create(C6658d dVar) {
            return new c(this.f8313b, this.f8314c, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((c) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f8312a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f8313b);
                b bVar = new b(this.f8314c, this.f8313b, (C6658d) null);
                this.f8312a = 1;
                if (androidx.compose.material3.internal.b.h(aVar, bVar, this) == f10) {
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

    /* renamed from: W.f$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f8320a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f8321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1431f f8322c;

        /* renamed from: d  reason: collision with root package name */
        int f8323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1431f fVar, C6658d dVar) {
            super(dVar);
            this.f8322c = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8321b = obj;
            this.f8323d |= Integer.MIN_VALUE;
            return this.f8322c.i((Object) null, (C2848L) null, (r) null, this);
        }
    }

    /* renamed from: W.f$e */
    static final class e extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f8324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1431f f8325b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f8326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f8327d;

        /* renamed from: W.f$e$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1431f f8328a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1431f fVar) {
                super(0);
                this.f8328a = fVar;
            }

            /* renamed from: a */
            public final Pair invoke() {
                return C6502A.a(this.f8328a.o(), this.f8328a.x());
            }
        }

        /* renamed from: W.f$e$b */
        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f8329a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f8330b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r f8331c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1431f f8332d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(r rVar, C1431f fVar, C6658d dVar) {
                super(2, dVar);
                this.f8331c = rVar;
                this.f8332d = fVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                b bVar = new b(this.f8331c, this.f8332d, dVar);
                bVar.f8330b = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(Pair pair, C6658d dVar) {
                return ((b) create(pair, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f8329a;
                if (i10 == 0) {
                    w.b(obj);
                    Pair pair = (Pair) this.f8330b;
                    Object b10 = pair.b();
                    r rVar = this.f8331c;
                    C1430e c10 = this.f8332d.f8307o;
                    this.f8329a = 1;
                    if (rVar.invoke(c10, (h) pair.a(), b10, this) == f10) {
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
        e(C1431f fVar, Object obj, r rVar, C6658d dVar) {
            super(1, dVar);
            this.f8325b = fVar;
            this.f8326c = obj;
            this.f8327d = rVar;
        }

        public final C6658d create(C6658d dVar) {
            return new e(this.f8325b, this.f8326c, this.f8327d, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((e) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f8324a;
            if (i10 == 0) {
                w.b(obj);
                this.f8325b.D(this.f8326c);
                a aVar = new a(this.f8325b);
                b bVar = new b(this.f8327d, this.f8325b, (C6658d) null);
                this.f8324a = 1;
                if (androidx.compose.material3.internal.b.h(aVar, bVar, this) == f10) {
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

    /* renamed from: W.f$f  reason: collision with other inner class name */
    public static final class C0176f implements C1430e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1431f f8333a;

        C0176f(C1431f fVar) {
            this.f8333a = fVar;
        }

        public void a(float f10, float f11) {
            this.f8333a.F(f10);
            this.f8333a.E(f11);
        }
    }

    /* renamed from: W.f$g */
    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1431f f8334a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C1431f fVar) {
            super(0);
            this.f8334a = fVar;
        }

        public final Object invoke() {
            Object d10 = this.f8334a.t();
            if (d10 != null) {
                return d10;
            }
            C1431f fVar = this.f8334a;
            float w10 = fVar.w();
            if (!Float.isNaN(w10)) {
                return fVar.m(w10, fVar.s());
            }
            return fVar.s();
        }
    }

    /* renamed from: W.f$h */
    public static final class h implements m {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final b f8335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1431f f8336b;

        /* renamed from: W.f$h$a */
        static final class a extends l implements q {

            /* renamed from: a  reason: collision with root package name */
            int f8337a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f8338b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p f8339c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, p pVar, C6658d dVar) {
                super(3, dVar);
                this.f8338b = hVar;
                this.f8339c = pVar;
            }

            /* renamed from: i */
            public final Object invoke(C1430e eVar, h hVar, C6658d dVar) {
                return new a(this.f8338b, this.f8339c, dVar).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f8337a;
                if (i10 == 0) {
                    w.b(obj);
                    b b10 = this.f8338b.f8335a;
                    p pVar = this.f8339c;
                    this.f8337a = 1;
                    if (pVar.invoke(b10, this) == f10) {
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

        /* renamed from: W.f$h$b */
        public static final class b implements z.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1431f f8340a;

            b(C1431f fVar) {
                this.f8340a = fVar;
            }

            public void a(float f10) {
                C1430e.b(this.f8340a.f8307o, this.f8340a.z(f10), 0.0f, 2, (Object) null);
            }
        }

        h(C1431f fVar) {
            this.f8336b = fVar;
            this.f8335a = new b(fVar);
        }

        public Object a(C2848L l10, p pVar, C6658d dVar) {
            Object j10 = this.f8336b.j(l10, new a(this, pVar, (C6658d) null), dVar);
            if (j10 == C6680b.f()) {
                return j10;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: W.f$i */
    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1431f f8341a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C1431f fVar) {
            super(0);
            this.f8341a = fVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            float e10 = this.f8341a.o().e(this.f8341a.s());
            float e11 = this.f8341a.o().e(this.f8341a.q()) - e10;
            float abs = Math.abs(e11);
            float f10 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float A10 = (this.f8341a.A() - e10) / e11;
                if (A10 < 1.0E-6f) {
                    f10 = 0.0f;
                } else if (A10 <= 0.999999f) {
                    f10 = A10;
                }
            }
            return Float.valueOf(f10);
        }
    }

    /* renamed from: W.f$j */
    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1431f f8342a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C1431f fVar) {
            super(0);
            this.f8342a = fVar;
        }

        public final Object invoke() {
            Object d10 = this.f8342a.t();
            if (d10 != null) {
                return d10;
            }
            C1431f fVar = this.f8342a;
            float w10 = fVar.w();
            if (!Float.isNaN(w10)) {
                return fVar.l(w10, fVar.s(), 0.0f);
            }
            return fVar.s();
        }
    }

    /* renamed from: W.f$k */
    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1431f f8343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f8344b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C1431f fVar, Object obj) {
            super(0);
            this.f8343a = fVar;
            this.f8344b = obj;
        }

        public final void invoke() {
            C1430e c10 = this.f8343a.f8307o;
            C1431f fVar = this.f8343a;
            Object obj = this.f8344b;
            float e10 = fVar.o().e(obj);
            if (!Float.isNaN(e10)) {
                C1430e.b(c10, e10, 0.0f, 2, (Object) null);
                fVar.D((Object) null);
            }
            fVar.C(obj);
        }
    }

    public C1431f(Object obj, C6798l lVar, C6787a aVar, C2797i iVar, C6798l lVar2) {
        this.f8293a = lVar;
        this.f8294b = aVar;
        this.f8295c = iVar;
        this.f8296d = lVar2;
        this.f8299g = u1.d(obj, (o1) null, 2, (Object) null);
        this.f8300h = p1.e(new j(this));
        this.f8301i = p1.e(new g(this));
        this.f8302j = D0.a(Float.NaN);
        this.f8303k = p1.d(p1.q(), new i(this));
        this.f8304l = D0.a(0.0f);
        this.f8305m = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f8306n = u1.d(androidx.compose.material3.internal.b.g(), (o1) null, 2, (Object) null);
        this.f8307o = new C0176f(this);
    }

    private final void B(h hVar) {
        this.f8306n.setValue(hVar);
    }

    /* access modifiers changed from: private */
    public final void C(Object obj) {
        this.f8299g.setValue(obj);
    }

    /* access modifiers changed from: private */
    public final void D(Object obj) {
        this.f8305m.setValue(obj);
    }

    /* access modifiers changed from: private */
    public final void E(float f10) {
        this.f8304l.l(f10);
    }

    /* access modifiers changed from: private */
    public final void F(float f10) {
        this.f8302j.l(f10);
    }

    private final boolean H(Object obj) {
        return this.f8297e.e(new k(this, obj));
    }

    public static /* synthetic */ Object k(C1431f fVar, Object obj, C2848L l10, r rVar, C6658d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l10 = C2848L.Default;
        }
        return fVar.i(obj, l10, rVar, dVar);
    }

    /* access modifiers changed from: private */
    public final Object l(float f10, Object obj, float f11) {
        Object a10;
        h o10 = o();
        float e10 = o10.e(obj);
        float floatValue = ((Number) this.f8294b.invoke()).floatValue();
        int i10 = (e10 > f10 ? 1 : (e10 == f10 ? 0 : -1));
        if (i10 == 0 || Float.isNaN(e10)) {
            return obj;
        }
        if (i10 < 0) {
            if (f11 >= floatValue) {
                Object a11 = o10.a(f10, true);
                C6496s.e(a11);
                return a11;
            }
            a10 = o10.a(f10, true);
            C6496s.e(a10);
            if (f10 < Math.abs(e10 + Math.abs(((Number) this.f8293a.invoke(Float.valueOf(Math.abs(o10.e(a10) - e10)))).floatValue()))) {
                return obj;
            }
        } else if (f11 <= (-floatValue)) {
            Object a12 = o10.a(f10, false);
            C6496s.e(a12);
            return a12;
        } else {
            a10 = o10.a(f10, false);
            C6496s.e(a10);
            float abs = Math.abs(e10 - Math.abs(((Number) this.f8293a.invoke(Float.valueOf(Math.abs(e10 - o10.e(a10))))).floatValue()));
            if (f10 < 0.0f) {
                if (Math.abs(f10) < abs) {
                    return obj;
                }
            } else if (f10 > abs) {
                return obj;
            }
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public final Object m(float f10, Object obj) {
        Object a10;
        h o10 = o();
        float e10 = o10.e(obj);
        int i10 = (e10 > f10 ? 1 : (e10 == f10 ? 0 : -1));
        if (i10 == 0 || Float.isNaN(e10)) {
            return obj;
        }
        if (i10 < 0) {
            a10 = o10.a(f10, true);
            if (a10 == null) {
                return obj;
            }
        } else {
            a10 = o10.a(f10, false);
            if (a10 == null) {
                return obj;
            }
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public final Object t() {
        return this.f8305m.getValue();
    }

    public final float A() {
        if (!Float.isNaN(w())) {
            return w();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final Object G(float f10, C6658d dVar) {
        Object s10 = s();
        Object l10 = l(A(), s10, f10);
        if (((Boolean) this.f8296d.invoke(l10)).booleanValue()) {
            Object d10 = androidx.compose.material3.internal.b.d(this, l10, f10, dVar);
            if (d10 == C6680b.f()) {
                return d10;
            }
            return C6514M.f71813a;
        }
        Object d11 = androidx.compose.material3.internal.b.d(this, s10, f10, dVar);
        if (d11 == C6680b.f()) {
            return d11;
        }
        return C6514M.f71813a;
    }

    public final void I(h hVar, Object obj) {
        if (!C6496s.c(o(), hVar)) {
            B(hVar);
            if (!H(obj)) {
                D(obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r7, x.C2848L r8, yf.r r9, qf.C6658d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof W.C1431f.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            W.f$d r0 = (W.C1431f.d) r0
            int r1 = r0.f8323d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8323d = r1
            goto L_0x0018
        L_0x0013:
            W.f$d r0 = new W.f$d
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8321b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f8323d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.f8320a
            W.f r7 = (W.C1431f) r7
            lf.w.b(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x005a
        L_0x0030:
            r8 = move-exception
            goto L_0x0094
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            lf.w.b(r10)
            W.h r10 = r6.o()
            boolean r10 = r10.c(r7)
            if (r10 == 0) goto L_0x00cc
            W.n r10 = r6.f8297e     // Catch:{ all -> 0x0092 }
            W.f$e r2 = new W.f$e     // Catch:{ all -> 0x0092 }
            r2.<init>(r6, r7, r9, r5)     // Catch:{ all -> 0x0092 }
            r0.f8320a = r6     // Catch:{ all -> 0x0092 }
            r0.f8323d = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch:{ all -> 0x0092 }
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r7 = r6
        L_0x005a:
            r7.D(r5)
            W.h r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x00cf
            float r9 = r7.w()
            W.h r10 = r7.o()
            float r10 = r10.e(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00cf
            yf.l r9 = r7.f8296d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00cf
            r7.C(r8)
            goto L_0x00cf
        L_0x0092:
            r8 = move-exception
            r7 = r6
        L_0x0094:
            r7.D(r5)
            W.h r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto L_0x00cb
            float r10 = r7.w()
            W.h r0 = r7.o()
            float r0 = r0.e(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x00cb
            yf.l r10 = r7.f8296d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cb
            r7.C(r9)
        L_0x00cb:
            throw r8
        L_0x00cc:
            r6.C(r7)
        L_0x00cf:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C1431f.i(java.lang.Object, x.L, yf.r, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(x.C2848L r7, yf.q r8, qf.C6658d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof W.C1431f.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            W.f$b r0 = (W.C1431f.b) r0
            int r1 = r0.f8311d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8311d = r1
            goto L_0x0018
        L_0x0013:
            W.f$b r0 = new W.f$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8309b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f8311d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.f8308a
            W.f r7 = (W.C1431f) r7
            lf.w.b(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r8 = move-exception
            goto L_0x0089
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            lf.w.b(r9)
            W.n r9 = r6.f8297e     // Catch:{ all -> 0x0087 }
            W.f$c r2 = new W.f$c     // Catch:{ all -> 0x0087 }
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x0087 }
            r0.f8308a = r6     // Catch:{ all -> 0x0087 }
            r0.f8311d = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x0087 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r7 = r6
        L_0x0050:
            W.h r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x0084
            float r9 = r7.w()
            W.h r0 = r7.o()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0084
            yf.l r9 = r7.f8296d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0084
            r7.C(r8)
        L_0x0084:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        L_0x0087:
            r8 = move-exception
            r7 = r6
        L_0x0089:
            W.h r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto L_0x00bd
            float r0 = r7.w()
            W.h r1 = r7.o()
            float r1 = r1.e(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            yf.l r0 = r7.f8296d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            r7.C(r9)
        L_0x00bd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C1431f.j(x.L, yf.q, qf.d):java.lang.Object");
    }

    public final float n(float f10) {
        float f11;
        float z10 = z(f10);
        if (Float.isNaN(w())) {
            f11 = 0.0f;
        } else {
            f11 = w();
        }
        F(z10);
        return z10 - f11;
    }

    public final h o() {
        return (h) this.f8306n.getValue();
    }

    public final C2797i p() {
        return this.f8295c;
    }

    public final Object q() {
        return this.f8301i.getValue();
    }

    public final C6798l r() {
        return this.f8296d;
    }

    public final Object s() {
        return this.f8299g.getValue();
    }

    public final m u() {
        return this.f8298f;
    }

    public final float v() {
        return this.f8304l.c();
    }

    public final float w() {
        return this.f8302j.c();
    }

    public final Object x() {
        return this.f8300h.getValue();
    }

    public final boolean y() {
        if (t() != null) {
            return true;
        }
        return false;
    }

    public final float z(float f10) {
        float f11;
        if (Float.isNaN(w())) {
            f11 = 0.0f;
        } else {
            f11 = w();
        }
        return Ef.m.k(f11 + f10, o().d(), o().f());
    }
}

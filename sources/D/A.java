package D;

import B.l;
import E.C1133b;
import E.C1138g;
import E.C1141j;
import E.E;
import E.L;
import E.M;
import H0.W;
import H0.X;
import Ug.C5600w0;
import Ug.K;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import h0.C2017a;
import h0.C2026j;
import h0.C2028l;
import i0.C2057k;
import java.util.List;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import w.C2795g0;
import w.C2798j;
import w.C2799k;
import w.C2800l;
import w.C2805q;
import w.l0;
import w.r0;
import w.t0;
import x.C2848L;
import yf.C6798l;
import yf.p;
import z.v;
import z.y;
import z.z;

public final class A implements y {

    /* renamed from: y  reason: collision with root package name */
    public static final c f1150y = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C2026j f1151z = C2017a.a(a.f1176a, b.f1177a);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f1152a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1153b;

    /* renamed from: c  reason: collision with root package name */
    private r f1154c;

    /* renamed from: d  reason: collision with root package name */
    private final y f1155d;

    /* renamed from: e  reason: collision with root package name */
    private final e f1156e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C1510r0 f1157f;

    /* renamed from: g  reason: collision with root package name */
    private final l f1158g;

    /* renamed from: h  reason: collision with root package name */
    private float f1159h;

    /* renamed from: i  reason: collision with root package name */
    private final y f1160i;

    /* renamed from: j  reason: collision with root package name */
    private int f1161j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1162k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public W f1163l;

    /* renamed from: m  reason: collision with root package name */
    private final X f1164m;

    /* renamed from: n  reason: collision with root package name */
    private final C1133b f1165n;

    /* renamed from: o  reason: collision with root package name */
    private final LazyLayoutItemAnimator f1166o;

    /* renamed from: p  reason: collision with root package name */
    private final C1141j f1167p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f1168q;

    /* renamed from: r  reason: collision with root package name */
    private final u f1169r;

    /* renamed from: s  reason: collision with root package name */
    private final E f1170s;

    /* renamed from: t  reason: collision with root package name */
    private final C1510r0 f1171t;

    /* renamed from: u  reason: collision with root package name */
    private final C1510r0 f1172u;

    /* renamed from: v  reason: collision with root package name */
    private final C1510r0 f1173v;

    /* renamed from: w  reason: collision with root package name */
    private final C1510r0 f1174w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public C2799k f1175x;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1176a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(C2028l lVar, A a10) {
            return C6565s.q(Integer.valueOf(a10.s()), Integer.valueOf(a10.t()));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1177a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final A invoke(List list) {
            return new A(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return A.f1151z;
        }

        private c() {
        }
    }

    public static final class d implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f1178a;

        d(A a10) {
            this.f1178a = a10;
        }

        /* JADX INFO: finally extract failed */
        public d.b a(int i10) {
            C6798l lVar;
            C2057k.a aVar = C2057k.f21728e;
            A a10 = this.f1178a;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            C2057k f10 = aVar.f(d10);
            try {
                long n10 = ((r) a10.f1157f.getValue()).n();
                aVar.m(d10, f10, lVar);
                return this.f1178a.D().e(i10, n10);
            } catch (Throwable th2) {
                aVar.m(d10, f10, lVar);
                throw th2;
            }
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f1179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1180b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(A a10, int i10) {
            super(1);
            this.f1179a = a10;
            this.f1180b = i10;
        }

        public final void a(L l10) {
            C6798l lVar;
            v h10 = this.f1179a.f1152a;
            int i10 = this.f1180b;
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            aVar.m(d10, aVar.f(d10), lVar);
            h10.b(l10, i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L) obj);
            return C6514M.f71813a;
        }
    }

    public static final class f implements X {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f1181b;

        f(A a10) {
            this.f1181b = a10;
        }

        public void q(W w10) {
            this.f1181b.f1163l = w10;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f1182a;

        /* renamed from: b  reason: collision with root package name */
        Object f1183b;

        /* renamed from: c  reason: collision with root package name */
        Object f1184c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f1185d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A f1186e;

        /* renamed from: f  reason: collision with root package name */
        int f1187f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(A a10, C6658d dVar) {
            super(dVar);
            this.f1186e = a10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1185d = obj;
            this.f1187f |= Integer.MIN_VALUE;
            return this.f1186e.e((C2848L) null, (p) null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f1188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f1189b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1190c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(A a10, int i10, int i11, C6658d dVar) {
            super(2, dVar);
            this.f1189b = a10;
            this.f1190c = i10;
            this.f1191d = i11;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new h(this.f1189b, this.f1190c, this.f1191d, dVar);
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((h) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f1188a == 0) {
                w.b(obj);
                this.f1189b.O(this.f1190c, this.f1191d, true);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f1192a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(A a10) {
            super(1);
            this.f1192a = a10;
        }

        public final Float a(float f10) {
            return Float.valueOf(-this.f1192a.J(-f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f1193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f1194b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(A a10, C6658d dVar) {
            super(2, dVar);
            this.f1194b = a10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new j(this.f1194b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((j) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f1193a;
            if (i10 == 0) {
                w.b(obj);
                C2799k j10 = this.f1194b.f1175x;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                C2795g0 h10 = C2798j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.b(0.5f), 1, (Object) null);
                this.f1193a = 1;
                if (l0.j(j10, b10, h10, true, (C6798l) null, this, 8, (Object) null) == f10) {
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

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f1195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f1196b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(A a10, C6658d dVar) {
            super(2, dVar);
            this.f1196b = a10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new k(this.f1196b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((k) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f1195a;
            if (i10 == 0) {
                w.b(obj);
                C2799k j10 = this.f1196b.f1175x;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                C2795g0 h10 = C2798j.h(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.b(0.5f), 1, (Object) null);
                this.f1195a = 1;
                if (l0.j(j10, b10, h10, true, (C6798l) null, this, 8, (Object) null) == f10) {
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

    public A(int i10, int i11, v vVar) {
        this.f1152a = vVar;
        y yVar = new y(i10, i11);
        this.f1155d = yVar;
        this.f1156e = new e(this);
        this.f1157f = p1.h(B.f1198b, p1.j());
        this.f1158g = B.k.a();
        this.f1160i = z.a(new i(this));
        this.f1162k = true;
        this.f1164m = new f(this);
        this.f1165n = new C1133b();
        this.f1166o = new LazyLayoutItemAnimator();
        this.f1167p = new C1141j();
        this.f1168q = new androidx.compose.foundation.lazy.layout.d(vVar.d(), new e(this, i10));
        this.f1169r = new d(this);
        this.f1170s = new E();
        yVar.b();
        this.f1171t = M.c((C1510r0) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f1172u = u1.d(bool, (o1) null, 2, (Object) null);
        this.f1173v = u1.d(bool, (o1) null, 2, (Object) null);
        this.f1174w = M.c((C1510r0) null, 1, (DefaultConstructorMarker) null);
        r0 f10 = t0.f(C6490l.f71789a);
        Float valueOf = Float.valueOf(0.0f);
        this.f1175x = C2800l.d(f10, valueOf, valueOf, 0, 0, false, 56, (Object) null);
    }

    private final void I(float f10, p pVar) {
        if (this.f1162k) {
            this.f1152a.c(this.f1169r, f10, pVar);
        }
    }

    public static /* synthetic */ Object L(A a10, int i10, int i11, C6658d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a10.K(i10, i11, dVar);
    }

    private void M(boolean z10) {
        this.f1173v.setValue(Boolean.valueOf(z10));
    }

    private void N(boolean z10) {
        this.f1172u.setValue(Boolean.valueOf(z10));
    }

    private final void P(float f10, c1.d dVar, K k10) {
        C6798l lVar;
        float f11 = f10;
        if (f11 > dVar.t1(B.f1197a)) {
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            C2057k f12 = aVar.f(d10);
            try {
                float floatValue = ((Number) this.f1175x.getValue()).floatValue();
                if (this.f1175x.r()) {
                    this.f1175x = C2800l.g(this.f1175x, floatValue - f11, 0.0f, 0, 0, false, 30, (Object) null);
                    C5600w0 unused = C5576k.d(k10, (qf.g) null, (Ug.M) null, new j(this, (C6658d) null), 3, (Object) null);
                } else {
                    this.f1175x = new C2799k(t0.f(C6490l.f71789a), Float.valueOf(-f11), (C2805q) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
                    C5600w0 unused2 = C5576k.d(k10, (qf.g) null, (Ug.M) null, new k(this, (C6658d) null), 3, (Object) null);
                }
            } finally {
                aVar.m(d10, f12, lVar);
            }
        }
    }

    public static /* synthetic */ Object m(A a10, int i10, int i11, C6658d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a10.l(i10, i11, dVar);
    }

    public static /* synthetic */ void o(A a10, r rVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        a10.n(rVar, z10, z11);
    }

    public final E A() {
        return this.f1170s;
    }

    public final C1510r0 B() {
        return this.f1174w;
    }

    public final r C() {
        return this.f1154c;
    }

    public final androidx.compose.foundation.lazy.layout.d D() {
        return this.f1168q;
    }

    public final W E() {
        return this.f1163l;
    }

    public final X F() {
        return this.f1164m;
    }

    public final float G() {
        return ((Number) this.f1175x.getValue()).floatValue();
    }

    public final float H() {
        return this.f1159h;
    }

    public final float J(float f10) {
        if ((f10 < 0.0f && !d()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f1159h) <= 0.5f) {
            float f11 = this.f1159h + f10;
            this.f1159h = f11;
            if (Math.abs(f11) > 0.5f) {
                r rVar = (r) this.f1157f.getValue();
                float f12 = this.f1159h;
                int round = Math.round(f12);
                r rVar2 = this.f1154c;
                boolean x10 = rVar.x(round, !this.f1153b);
                if (x10 && rVar2 != null) {
                    x10 = rVar2.x(round, true);
                }
                if (x10) {
                    n(rVar, this.f1153b, true);
                    M.d(this.f1174w);
                    I(f12 - this.f1159h, rVar);
                } else {
                    W w10 = this.f1163l;
                    if (w10 != null) {
                        w10.h();
                    }
                    I(f12 - this.f1159h, x());
                }
            }
            if (Math.abs(this.f1159h) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f1159h;
            this.f1159h = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f1159h).toString());
    }

    public final Object K(int i10, int i11, C6658d dVar) {
        Object a10 = y.a(this, (C2848L) null, new h(this, i10, i11, (C6658d) null), dVar, 1, (Object) null);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    public final void O(int i10, int i11, boolean z10) {
        if (!(this.f1155d.a() == i10 && this.f1155d.c() == i11)) {
            this.f1166o.o();
        }
        this.f1155d.d(i10, i11);
        if (z10) {
            W w10 = this.f1163l;
            if (w10 != null) {
                w10.h();
                return;
            }
            return;
        }
        M.d(this.f1171t);
    }

    public final int Q(l lVar, int i10) {
        return this.f1155d.j(lVar, i10);
    }

    public boolean b() {
        return this.f1160i.b();
    }

    public boolean c() {
        return ((Boolean) this.f1173v.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f1172u.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: yf.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(x.C2848L r6, yf.p r7, qf.C6658d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof D.A.g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            D.A$g r0 = (D.A.g) r0
            int r1 = r0.f1187f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1187f = r1
            goto L_0x0018
        L_0x0013:
            D.A$g r0 = new D.A$g
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f1185d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f1187f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f1184c
            r7 = r6
            yf.p r7 = (yf.p) r7
            java.lang.Object r6 = r0.f1183b
            x.L r6 = (x.C2848L) r6
            java.lang.Object r2 = r0.f1182a
            D.A r2 = (D.A) r2
            lf.w.b(r8)
            goto L_0x005a
        L_0x0045:
            lf.w.b(r8)
            E.b r8 = r5.f1165n
            r0.f1182a = r5
            r0.f1183b = r6
            r0.f1184c = r7
            r0.f1187f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            z.y r8 = r2.f1160i
            r2 = 0
            r0.f1182a = r2
            r0.f1183b = r2
            r0.f1184c = r2
            r0.f1187f = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D.A.e(x.L, yf.p, qf.d):java.lang.Object");
    }

    public float f(float f10) {
        return this.f1160i.f(f10);
    }

    public final Object l(int i10, int i11, C6658d dVar) {
        Object d10 = C1138g.d(this.f1156e, i10, i11, 100, r(), dVar);
        if (d10 == C6680b.f()) {
            return d10;
        }
        return C6514M.f71813a;
    }

    public final void n(r rVar, boolean z10, boolean z11) {
        if (z10 || !this.f1153b) {
            if (z10) {
                this.f1153b = true;
            }
            M(rVar.l());
            N(rVar.m());
            this.f1159h -= rVar.o();
            this.f1157f.setValue(rVar);
            if (z11) {
                this.f1155d.i(rVar.v());
            } else {
                this.f1155d.h(rVar);
                if (this.f1162k) {
                    this.f1152a.a(this.f1169r, rVar);
                }
            }
            if (z10) {
                P(rVar.w(), rVar.t(), rVar.s());
            }
            this.f1161j++;
            return;
        }
        this.f1154c = rVar;
    }

    public final C1133b p() {
        return this.f1165n;
    }

    public final C1141j q() {
        return this.f1167p;
    }

    public final c1.d r() {
        return ((r) this.f1157f.getValue()).t();
    }

    public final int s() {
        return this.f1155d.a();
    }

    public final int t() {
        return this.f1155d.c();
    }

    public final boolean u() {
        return this.f1153b;
    }

    public final l v() {
        return this.f1158g;
    }

    public final LazyLayoutItemAnimator w() {
        return this.f1166o;
    }

    public final p x() {
        return (p) this.f1157f.getValue();
    }

    public final C1510r0 y() {
        return this.f1171t;
    }

    public final Ef.i z() {
        return (Ef.i) this.f1155d.b().getValue();
    }

    public A(int i10, int i11) {
        this(i10, i11, w.b(0, 1, (Object) null));
    }
}

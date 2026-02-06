package w;

import Y.C1495j0;
import k0.l;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class l0 {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f27443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f27444b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, r0 r0Var) {
            super(1);
            this.f27443a = pVar;
            this.f27444b = r0Var;
        }

        public final void a(C2796h hVar) {
            this.f27443a.invoke(hVar.e(), this.f27444b.b().invoke(hVar.g()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27445a;

        /* renamed from: b  reason: collision with root package name */
        Object f27446b;

        /* renamed from: c  reason: collision with root package name */
        Object f27447c;

        /* renamed from: d  reason: collision with root package name */
        Object f27448d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f27449e;

        /* renamed from: f  reason: collision with root package name */
        int f27450f;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27449e = obj;
            this.f27450f |= Integer.MIN_VALUE;
            return l0.c((C2799k) null, (C2788d) null, 0, (C6798l) null, this);
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f27452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2788d f27454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2805q f27455d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2799k f27456e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f27457f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f27458g;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2799k f27459a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2799k kVar) {
                super(0);
                this.f27459a = kVar;
            }

            public final void invoke() {
                this.f27459a.u(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10, Object obj, C2788d dVar, C2805q qVar, C2799k kVar, float f10, C6798l lVar) {
            super(1);
            this.f27452a = n10;
            this.f27453b = obj;
            this.f27454c = dVar;
            this.f27455d = qVar;
            this.f27456e = kVar;
            this.f27457f = f10;
            this.f27458g = lVar;
        }

        public final void a(long j10) {
            N n10 = this.f27452a;
            C2796h hVar = new C2796h(this.f27453b, this.f27454c.e(), this.f27455d, j10, this.f27454c.g(), j10, true, new a(this.f27456e));
            l0.m(hVar, j10, this.f27457f, this.f27454c, this.f27456e, this.f27458g);
            n10.f71759a = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2799k f27460a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C2799k kVar) {
            super(0);
            this.f27460a = kVar;
        }

        public final void invoke() {
            this.f27460a.u(false);
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f27461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f27462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2788d f27463c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2799k f27464d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f27465e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(N n10, float f10, C2788d dVar, C2799k kVar, C6798l lVar) {
            super(1);
            this.f27461a = n10;
            this.f27462b = f10;
            this.f27463c = dVar;
            this.f27464d = kVar;
            this.f27465e = lVar;
        }

        public final void a(long j10) {
            Object obj = this.f27461a.f71759a;
            C6496s.e(obj);
            l0.m((C2796h) obj, j10, this.f27462b, this.f27463c, this.f27464d, this.f27465e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f27468a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C6798l lVar) {
            super(1);
            this.f27468a = lVar;
        }

        public final Object a(long j10) {
            return this.f27468a.invoke(Long.valueOf(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, C2797i iVar, p pVar, C6658d dVar) {
        Object d10 = d(t0.f(C6490l.f71789a), kotlin.coroutines.jvm.internal.b.b(f10), kotlin.coroutines.jvm.internal.b.b(f11), kotlin.coroutines.jvm.internal.b.b(f12), iVar, pVar, dVar);
        if (d10 == C6680b.f()) {
            return d10;
        }
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.internal.N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.internal.N} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3 A[Catch:{ CancellationException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(w.C2799k r25, w.C2788d r26, long r27, yf.C6798l r29, qf.C6658d r30) {
        /*
            r9 = r25
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof w.l0.b
            if (r2 == 0) goto L_0x001a
            r2 = r1
            w.l0$b r2 = (w.l0.b) r2
            int r3 = r2.f27450f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f27450f = r3
        L_0x0018:
            r10 = r2
            goto L_0x0020
        L_0x001a:
            w.l0$b r2 = new w.l0$b
            r2.<init>(r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r10.f27449e
            java.lang.Object r11 = rf.C6680b.f()
            int r2 = r10.f27450f
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r13) goto L_0x0051
            if (r2 != r12) goto L_0x0049
            java.lang.Object r0 = r10.f27448d
            r2 = r0
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r0 = r10.f27447c
            yf.l r0 = (yf.C6798l) r0
            java.lang.Object r3 = r10.f27446b
            w.d r3 = (w.C2788d) r3
            java.lang.Object r4 = r10.f27445a
            w.k r4 = (w.C2799k) r4
        L_0x0041:
            lf.w.b(r1)     // Catch:{ CancellationException -> 0x0045 }
            goto L_0x0063
        L_0x0045:
            r0 = move-exception
            r9 = r4
            goto L_0x0123
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.lang.Object r0 = r10.f27448d
            r2 = r0
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r0 = r10.f27447c
            yf.l r0 = (yf.C6798l) r0
            java.lang.Object r3 = r10.f27446b
            w.d r3 = (w.C2788d) r3
            java.lang.Object r4 = r10.f27445a
            w.k r4 = (w.C2799k) r4
            goto L_0x0041
        L_0x0063:
            r8 = r0
            r0 = r3
            goto L_0x00e6
        L_0x0067:
            lf.w.b(r1)
            r1 = 0
            java.lang.Object r15 = r0.f(r1)
            w.q r17 = r0.b(r1)
            kotlin.jvm.internal.N r14 = new kotlin.jvm.internal.N
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00af
            qf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x00ab }
            float r7 = n(r1)     // Catch:{ CancellationException -> 0x00ab }
            w.l0$d r8 = new w.l0$d     // Catch:{ CancellationException -> 0x00ab }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r26
            r5 = r17
            r6 = r25
            r15 = r8
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x00ab }
            r10.f27445a = r9     // Catch:{ CancellationException -> 0x00ab }
            r10.f27446b = r0     // Catch:{ CancellationException -> 0x00ab }
            r8 = r29
            r10.f27447c = r8     // Catch:{ CancellationException -> 0x00ab }
            r10.f27448d = r14     // Catch:{ CancellationException -> 0x00ab }
            r10.f27450f = r13     // Catch:{ CancellationException -> 0x00ab }
            java.lang.Object r1 = k(r0, r15, r10)     // Catch:{ CancellationException -> 0x00ab }
            if (r1 != r11) goto L_0x00e4
            return r11
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            r2 = r14
            goto L_0x0123
        L_0x00af:
            r8 = r29
            w.h r13 = new w.h     // Catch:{ CancellationException -> 0x00ab }
            w.r0 r16 = r26.e()     // Catch:{ CancellationException -> 0x00ab }
            java.lang.Object r20 = r26.g()     // Catch:{ CancellationException -> 0x00ab }
            w.l0$e r1 = new w.l0$e     // Catch:{ CancellationException -> 0x00ab }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x00ab }
            r23 = 1
            r7 = r14
            r14 = r13
            r18 = r27
            r21 = r27
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23, r24)     // Catch:{ CancellationException -> 0x0120 }
            qf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0120 }
            float r4 = n(r1)     // Catch:{ CancellationException -> 0x0120 }
            r1 = r13
            r2 = r27
            r5 = r26
            r6 = r25
            r14 = r7
            r7 = r29
            m(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x00ab }
            r14.f71759a = r13     // Catch:{ CancellationException -> 0x00ab }
        L_0x00e4:
            r4 = r9
            r2 = r14
        L_0x00e6:
            java.lang.Object r1 = r2.f71759a     // Catch:{ CancellationException -> 0x0045 }
            kotlin.jvm.internal.C6496s.e(r1)     // Catch:{ CancellationException -> 0x0045 }
            w.h r1 = (w.C2796h) r1     // Catch:{ CancellationException -> 0x0045 }
            boolean r1 = r1.h()     // Catch:{ CancellationException -> 0x0045 }
            if (r1 == 0) goto L_0x011d
            qf.g r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0045 }
            float r1 = n(r1)     // Catch:{ CancellationException -> 0x0045 }
            w.l0$f r3 = new w.l0$f     // Catch:{ CancellationException -> 0x0045 }
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r29 = r4
            r30 = r8
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x0045 }
            r10.f27445a = r4     // Catch:{ CancellationException -> 0x0045 }
            r10.f27446b = r0     // Catch:{ CancellationException -> 0x0045 }
            r10.f27447c = r8     // Catch:{ CancellationException -> 0x0045 }
            r10.f27448d = r2     // Catch:{ CancellationException -> 0x0045 }
            r10.f27450f = r12     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r1 = k(r0, r3, r10)     // Catch:{ CancellationException -> 0x0045 }
            if (r1 != r11) goto L_0x00e6
            return r11
        L_0x011d:
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x0120:
            r0 = move-exception
            r14 = r7
            goto L_0x00ac
        L_0x0123:
            java.lang.Object r1 = r2.f71759a
            w.h r1 = (w.C2796h) r1
            r3 = 0
            if (r1 != 0) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r1.k(r3)
        L_0x012e:
            java.lang.Object r1 = r2.f71759a
            w.h r1 = (w.C2796h) r1
            if (r1 == 0) goto L_0x0143
            long r1 = r1.c()
            long r4 = r9.k()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0143
            r9.u(r3)
        L_0x0143:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l0.c(w.k, w.d, long, yf.l, qf.d):java.lang.Object");
    }

    public static final Object d(r0 r0Var, Object obj, Object obj2, Object obj3, C2797i iVar, p pVar, C6658d dVar) {
        C2805q qVar;
        Object obj4 = obj3;
        if (obj4 == null || (qVar = (C2805q) r0Var.a().invoke(obj4)) == null) {
            qVar = C2806r.g((C2805q) r0Var.a().invoke(obj));
        } else {
            Object obj5 = obj;
        }
        m0 m0Var = new m0(iVar, r0Var, obj, obj2, qVar);
        C2799k kVar = new C2799k(r0Var, obj, qVar, 0, 0, false, 56, (DefaultConstructorMarker) null);
        r0 r0Var2 = r0Var;
        Object f10 = f(kVar, m0Var, 0, new a(pVar, r0Var), dVar, 2, (Object) null);
        if (f10 == C6680b.f()) {
            return f10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, C2797i iVar, p pVar, C6658d dVar, int i10, Object obj) {
        float f13;
        if ((i10 & 4) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f12;
        }
        if ((i10 & 8) != 0) {
            iVar = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return b(f10, f11, f13, iVar, pVar, dVar);
    }

    public static /* synthetic */ Object f(C2799k kVar, C2788d dVar, long j10, C6798l lVar, C6658d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = c.f27451a;
        }
        return c(kVar, dVar, j11, lVar, dVar2);
    }

    public static final Object g(C2799k kVar, C2814z zVar, boolean z10, C6798l lVar, C6658d dVar) {
        long j10;
        C2813y yVar = new C2813y(zVar, kVar.m(), kVar.getValue(), kVar.q());
        if (z10) {
            j10 = kVar.k();
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object c10 = c(kVar, yVar, j10, lVar, dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object h(C2799k kVar, C2814z zVar, boolean z10, C6798l lVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = g.f27466a;
        }
        return g(kVar, zVar, z10, lVar, dVar);
    }

    public static final Object i(C2799k kVar, Object obj, C2797i iVar, boolean z10, C6798l lVar, C6658d dVar) {
        long j10;
        C2797i iVar2 = iVar;
        m0 m0Var = new m0(iVar2, kVar.m(), kVar.getValue(), obj, kVar.q());
        if (z10) {
            j10 = kVar.k();
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object c10 = c(kVar, m0Var, j10, lVar, dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object j(C2799k kVar, Object obj, C2797i iVar, boolean z10, C6798l lVar, C6658d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            iVar = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        C2797i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = h.f27467a;
        }
        return i(kVar, obj, iVar2, z11, lVar, dVar);
    }

    private static final Object k(C2788d dVar, C6798l lVar, C6658d dVar2) {
        if (dVar.a()) {
            return C2768L.a(lVar, dVar2);
        }
        return C1495j0.c(new i(lVar), dVar2);
    }

    private static final void l(C2796h hVar, long j10, long j11, C2788d dVar, C2799k kVar, C6798l lVar) {
        hVar.j(j10);
        hVar.l(dVar.f(j11));
        hVar.m(dVar.b(j11));
        if (dVar.c(j11)) {
            hVar.i(hVar.c());
            hVar.k(false);
        }
        o(hVar, kVar);
        lVar.invoke(hVar);
    }

    /* access modifiers changed from: private */
    public static final void m(C2796h hVar, long j10, float f10, C2788d dVar, C2799k kVar, C6798l lVar) {
        long d10;
        if (f10 == 0.0f) {
            d10 = dVar.d();
        } else {
            d10 = (long) (((float) (j10 - hVar.d())) / f10);
        }
        l(hVar, j10, d10, dVar, kVar, lVar);
    }

    public static final float n(qf.g gVar) {
        float f10;
        boolean z10;
        l lVar = (l) gVar.b(l.f23090W);
        if (lVar != null) {
            f10 = lVar.U();
        } else {
            f10 = 1.0f;
        }
        if (f10 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2783a0.b("negative scale factor");
        }
        return f10;
    }

    public static final void o(C2796h hVar, C2799k kVar) {
        kVar.v(hVar.e());
        C2806r.f(kVar.q(), hVar.g());
        kVar.s(hVar.b());
        kVar.t(hVar.c());
        kVar.u(hVar.h());
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f27451a = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }

        public final void a(C2796h hVar) {
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f27466a = new g();

        g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }

        public final void a(C2796h hVar) {
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f27467a = new h();

        h() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }

        public final void a(C2796h hVar) {
        }
    }
}

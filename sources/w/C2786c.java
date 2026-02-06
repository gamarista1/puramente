package w;

import Ug.K;
import Wg.d;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import c1.h;
import c1.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.r;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2423i;
import q0.C2427m;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: w.c  reason: case insensitive filesystem */
public abstract class C2786c {

    /* renamed from: a  reason: collision with root package name */
    private static final C2795g0 f27307a = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C2795g0 f27308b = C2798j.h(0.0f, 0.0f, h.e(G0.a(h.f19213b)), 3, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C2795g0 f27309c = C2798j.h(0.0f, 0.0f, C2427m.c(G0.f(C2427m.f25341b)), 3, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static final C2795g0 f27310d = C2798j.h(0.0f, 0.0f, C2421g.d(G0.e(C2421g.f25320b)), 3, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C2795g0 f27311e = C2798j.h(0.0f, 0.0f, G0.g(C2423i.f25325e), 3, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C2795g0 f27312f = C2798j.h(0.0f, 0.0f, Integer.valueOf(G0.b(r.f71790a)), 3, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private static final C2795g0 f27313g = C2798j.h(0.0f, 0.0f, n.b(G0.c(n.f19226b)), 3, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private static final C2795g0 f27314h = C2798j.h(0.0f, 0.0f, c1.r.b(G0.d(c1.r.f19235b)), 3, (Object) null);

    /* renamed from: w.c$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f27315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27316b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, Object obj) {
            super(0);
            this.f27315a = dVar;
            this.f27316b = obj;
        }

        public final void invoke() {
            this.f27315a.c(this.f27316b);
        }
    }

    /* renamed from: w.c$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f27317a;

        /* renamed from: b  reason: collision with root package name */
        int f27318b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f27319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f27320d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2782a f27321e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1 f27322f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1 f27323g;

        /* renamed from: w.c$b$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f27324a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f27325b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C2782a f27326c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ A1 f27327d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ A1 f27328e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, C2782a aVar, A1 a12, A1 a13, C6658d dVar) {
                super(2, dVar);
                this.f27325b = obj;
                this.f27326c = aVar;
                this.f27327d = a12;
                this.f27328e = a13;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f27325b, this.f27326c, this.f27327d, this.f27328e, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f27324a;
                if (i10 == 0) {
                    w.b(obj);
                    if (!C6496s.c(this.f27325b, this.f27326c.k())) {
                        C2782a aVar = this.f27326c;
                        Object obj2 = this.f27325b;
                        C2797i b10 = C2786c.g(this.f27327d);
                        this.f27324a = 1;
                        if (C2782a.f(aVar, obj2, b10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
                            return f10;
                        }
                    }
                    return C6514M.f71813a;
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6798l a10 = C2786c.f(this.f27328e);
                if (a10 != null) {
                    a10.invoke(this.f27326c.m());
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C2782a aVar, A1 a12, A1 a13, C6658d dVar2) {
            super(2, dVar2);
            this.f27320d = dVar;
            this.f27321e = aVar;
            this.f27322f = a12;
            this.f27323g = a13;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f27320d, this.f27321e, this.f27322f, this.f27323g, dVar);
            bVar.f27319c = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r13.f27318b
                r2 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                java.lang.Object r1 = r13.f27317a
                Wg.f r1 = (Wg.f) r1
                java.lang.Object r3 = r13.f27319c
                Ug.K r3 = (Ug.K) r3
                lf.w.b(r14)
                r4 = r14
                goto L_0x003d
            L_0x0018:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0020:
                lf.w.b(r14)
                java.lang.Object r1 = r13.f27319c
                Ug.K r1 = (Ug.K) r1
                Wg.d r3 = r13.f27320d
                Wg.f r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L_0x0030:
                r13.f27319c = r3
                r13.f27317a = r1
                r13.f27318b = r2
                java.lang.Object r4 = r1.a(r13)
                if (r4 != r0) goto L_0x003d
                return r0
            L_0x003d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x006f
                java.lang.Object r4 = r1.next()
                Wg.d r5 = r13.f27320d
                java.lang.Object r5 = r5.i()
                java.lang.Object r5 = Wg.h.f(r5)
                if (r5 != 0) goto L_0x0057
                r7 = r4
                goto L_0x0058
            L_0x0057:
                r7 = r5
            L_0x0058:
                w.c$b$a r4 = new w.c$b$a
                w.a r8 = r13.f27321e
                Y.A1 r9 = r13.f27322f
                Y.A1 r10 = r13.f27323g
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                Ug.C5600w0 unused = Ug.C5576k.d(r5, r6, r7, r8, r9, r10)
                goto L_0x0030
            L_0x006f:
                lf.M r0 = lf.C6514M.f71813a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C2786c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final A1 c(float f10, C2797i iVar, String str, C6798l lVar, C1500m mVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            iVar = f27308b;
        }
        C2797i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        C6798l lVar2 = lVar;
        if (C1506p.H()) {
            C1506p.Q(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i12 = i10 << 6;
        C1500m mVar2 = mVar;
        A1 e10 = e(h.e(f10), t0.b(h.f19213b), iVar2, (Object) null, str2, lVar2, mVar2, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (C1506p.H()) {
            C1506p.P();
        }
        return e10;
    }

    public static final A1 d(float f10, C2797i iVar, float f11, String str, C6798l lVar, C1500m mVar, int i10, int i11) {
        C2797i iVar2;
        float f12;
        String str2;
        C6798l lVar2;
        C2797i iVar3;
        boolean z10;
        C1500m mVar2 = mVar;
        int i12 = i10;
        if ((i11 & 2) != 0) {
            iVar2 = f27307a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.01f;
        } else {
            f12 = f11;
        }
        if ((i11 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if ((i11 & 16) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (C1506p.H()) {
            C1506p.Q(668842840, i12, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (iVar2 == f27307a) {
            mVar2.T(1125598679);
            if ((((i12 & 896) ^ 384) <= 256 || !mVar2.c(f12)) && (i12 & 384) != 256) {
                z10 = false;
            } else {
                z10 = true;
            }
            Object A10 = mVar.A();
            if (z10 || A10 == C1500m.f10026a.a()) {
                A10 = C2798j.h(0.0f, 0.0f, Float.valueOf(f12), 3, (Object) null);
                mVar2.r(A10);
            }
            iVar3 = (C2795g0) A10;
            mVar.M();
        } else {
            mVar2.T(1125708605);
            mVar.M();
            iVar3 = iVar2;
        }
        Float valueOf = Float.valueOf(f10);
        r0 f13 = t0.f(C6490l.f71789a);
        Float valueOf2 = Float.valueOf(f12);
        int i13 = i12 & 14;
        int i14 = i12 << 3;
        A1 e10 = e(valueOf, f13, iVar3, valueOf2, str2, lVar2, mVar, i13 | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return e10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: w.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: w.c$b} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r2 == r10.a()) goto L_0x0106;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 e(java.lang.Object r14, w.r0 r15, w.C2797i r16, java.lang.Object r17, java.lang.String r18, yf.C6798l r19, Y.C1500m r20, int r21, int r22) {
        /*
            r0 = r14
            r1 = r20
            r2 = r21
            r3 = r22 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r20.A()
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x001f
            r3 = 7
            r5 = 0
            w.g0 r3 = w.C2798j.h(r5, r5, r4, r3, r4)
            r1.r(r3)
        L_0x001f:
            w.g0 r3 = (w.C2795g0) r3
            goto L_0x0024
        L_0x0022:
            r3 = r16
        L_0x0024:
            r5 = r22 & 8
            if (r5 == 0) goto L_0x002a
            r5 = r4
            goto L_0x002c
        L_0x002a:
            r5 = r17
        L_0x002c:
            r6 = r22 & 16
            if (r6 == 0) goto L_0x0033
            java.lang.String r6 = "ValueAnimation"
            goto L_0x0035
        L_0x0033:
            r6 = r18
        L_0x0035:
            r7 = r22 & 32
            if (r7 == 0) goto L_0x003b
            r7 = r4
            goto L_0x003d
        L_0x003b:
            r7 = r19
        L_0x003d:
            boolean r8 = Y.C1506p.H()
            r9 = -1
            if (r8 == 0) goto L_0x004c
            r8 = -1994373980(0xffffffff892044a4, float:-1.9291574E-33)
            java.lang.String r10 = "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)"
            Y.C1506p.Q(r8, r2, r9, r10)
        L_0x004c:
            java.lang.Object r8 = r20.A()
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r11 = r10.a()
            if (r8 != r11) goto L_0x0060
            r8 = 2
            Y.r0 r8 = Y.u1.d(r4, r4, r8, r4)
            r1.r(r8)
        L_0x0060:
            Y.r0 r8 = (Y.C1510r0) r8
            java.lang.Object r11 = r20.A()
            java.lang.Object r12 = r10.a()
            if (r11 != r12) goto L_0x0075
            w.a r11 = new w.a
            r12 = r15
            r11.<init>(r14, r15, r5, r6)
            r1.r(r11)
        L_0x0075:
            w.a r11 = (w.C2782a) r11
            int r6 = r2 >> 15
            r6 = r6 & 14
            Y.A1 r6 = Y.p1.o(r7, r1, r6)
            if (r5 == 0) goto L_0x009e
            boolean r7 = r3 instanceof w.C2795g0
            if (r7 == 0) goto L_0x009e
            r7 = r3
            w.g0 r7 = (w.C2795g0) r7
            java.lang.Object r12 = r7.h()
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r5)
            if (r12 != 0) goto L_0x009e
            float r3 = r7.f()
            float r7 = r7.g()
            w.g0 r3 = w.C2798j.g(r3, r7, r5)
        L_0x009e:
            r5 = 0
            Y.A1 r3 = Y.p1.o(r3, r1, r5)
            java.lang.Object r7 = r20.A()
            java.lang.Object r12 = r10.a()
            r13 = 6
            if (r7 != r12) goto L_0x00b5
            Wg.d r7 = Wg.g.b(r9, r4, r4, r13, r4)
            r1.r(r7)
        L_0x00b5:
            Wg.d r7 = (Wg.d) r7
            boolean r4 = r1.C(r7)
            r9 = r2 & 14
            r9 = r9 ^ r13
            r12 = 4
            if (r9 <= r12) goto L_0x00c7
            boolean r9 = r1.C(r14)
            if (r9 != 0) goto L_0x00ca
        L_0x00c7:
            r2 = r2 & r13
            if (r2 != r12) goto L_0x00cc
        L_0x00ca:
            r2 = 1
            goto L_0x00cd
        L_0x00cc:
            r2 = r5
        L_0x00cd:
            r2 = r2 | r4
            java.lang.Object r4 = r20.A()
            if (r2 != 0) goto L_0x00da
            java.lang.Object r2 = r10.a()
            if (r4 != r2) goto L_0x00e2
        L_0x00da:
            w.c$a r4 = new w.c$a
            r4.<init>(r7, r14)
            r1.r(r4)
        L_0x00e2:
            yf.a r4 = (yf.C6787a) r4
            Y.P.h(r4, r1, r5)
            boolean r0 = r1.C(r7)
            boolean r2 = r1.C(r11)
            r0 = r0 | r2
            boolean r2 = r1.S(r3)
            r0 = r0 | r2
            boolean r2 = r1.S(r6)
            r0 = r0 | r2
            java.lang.Object r2 = r20.A()
            if (r0 != 0) goto L_0x0106
            java.lang.Object r0 = r10.a()
            if (r2 != r0) goto L_0x0119
        L_0x0106:
            w.c$b r2 = new w.c$b
            r0 = 0
            r14 = r2
            r15 = r7
            r16 = r11
            r17 = r3
            r18 = r6
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            r1.r(r2)
        L_0x0119:
            yf.p r2 = (yf.p) r2
            Y.P.g(r7, r2, r1, r5)
            java.lang.Object r0 = r8.getValue()
            Y.A1 r0 = (Y.A1) r0
            if (r0 != 0) goto L_0x012a
            Y.A1 r0 = r11.g()
        L_0x012a:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0133
            Y.C1506p.P()
        L_0x0133:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2786c.e(java.lang.Object, w.r0, w.i, java.lang.Object, java.lang.String, yf.l, Y.m, int, int):Y.A1");
    }

    /* access modifiers changed from: private */
    public static final C6798l f(A1 a12) {
        return (C6798l) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C2797i g(A1 a12) {
        return (C2797i) a12.getValue();
    }
}

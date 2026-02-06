package androidx.compose.ui.window;

import H0.C1197s;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import O0.m;
import O0.v;
import Ug.K;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.I0;
import Y.L;
import Y.M;
import Y.M0;
import Y.o1;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c1.r;
import c1.t;
import g0.C2005a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import o0.C2338a;
import qf.C6658d;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f14229a = C1521x.d((o1) null, a.f14230a, 1, (Object) null);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14230a = new a();

        a() {
            super(0);
        }

        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* renamed from: androidx.compose.ui.window.b$b  reason: collision with other inner class name */
    static final class C0270b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f14232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f14233c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f14234d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f14235e;

        /* renamed from: androidx.compose.ui.window.b$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f14236a;

            public a(l lVar) {
                this.f14236a = lVar;
            }

            public void dispose() {
                this.f14236a.disposeComposition();
                this.f14236a.i();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0270b(l lVar, C6787a aVar, s sVar, String str, t tVar) {
            super(1);
            this.f14231a = lVar;
            this.f14232b = aVar;
            this.f14233c = sVar;
            this.f14234d = str;
            this.f14235e = tVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f14231a.n();
            this.f14231a.p(this.f14232b, this.f14233c, this.f14234d, this.f14235e);
            return new a(this.f14231a);
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f14238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f14239c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f14240d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f14241e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, C6787a aVar, s sVar, String str, t tVar) {
            super(0);
            this.f14237a = lVar;
            this.f14238b = aVar;
            this.f14239c = sVar;
            this.f14240d = str;
            this.f14241e = tVar;
        }

        public final void invoke() {
            this.f14237a.p(this.f14238b, this.f14239c, this.f14240d, this.f14241e);
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f14243b;

        public static final class a implements L {
            public void dispose() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, r rVar) {
            super(1);
            this.f14242a = lVar;
            this.f14243b = rVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f14242a.setPositionProvider(this.f14243b);
            this.f14242a.t();
            return new a();
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f14244a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f14245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f14246c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14247a = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar, C6658d dVar) {
            super(2, dVar);
            this.f14246c = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f14246c, dVar);
            eVar.f14245b = obj;
            return eVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r3.f14244a
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r1 = r3.f14245b
                Ug.K r1 = (Ug.K) r1
                lf.w.b(r4)
                goto L_0x0036
            L_0x0013:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x001b:
                lf.w.b(r4)
                java.lang.Object r4 = r3.f14245b
                Ug.K r4 = (Ug.K) r4
                r1 = r4
            L_0x0023:
                boolean r4 = Ug.L.g(r1)
                if (r4 == 0) goto L_0x003c
                androidx.compose.ui.window.b$e$a r4 = androidx.compose.ui.window.b.e.a.f14247a
                r3.f14245b = r1
                r3.f14244a = r2
                java.lang.Object r4 = androidx.compose.ui.platform.C1670w0.a(r4, r3)
                if (r4 != r0) goto L_0x0036
                return r0
            L_0x0036:
                androidx.compose.ui.window.l r4 = r3.f14246c
                r4.l()
                goto L_0x0023
            L_0x003c:
                lf.M r4 = lf.C6514M.f71813a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14248a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(1);
            this.f14248a = lVar;
        }

        public final void a(C1197s sVar) {
            C1197s x02 = sVar.x0();
            C6496s.e(x02);
            this.f14248a.r(x02);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f14252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f14253b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f14254c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f14255d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f14256e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f14257f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(r rVar, C6787a aVar, s sVar, p pVar, int i10, int i11) {
            super(2);
            this.f14252a = rVar;
            this.f14253b = aVar;
            this.f14254c = sVar;
            this.f14255d = pVar;
            this.f14256e = i10;
            this.f14257f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            b.a(this.f14252a, this.f14253b, this.f14254c, this.f14255d, mVar, M0.a(this.f14256e | 1), this.f14257f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f14258a = new i();

        i() {
            super(0);
        }

        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class j extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1 f14260b;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14261a = new a();

            a() {
                super(1);
            }

            public final void a(v vVar) {
                O0.t.O(vVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.ui.window.b$j$b  reason: collision with other inner class name */
        static final class C0271b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f14262a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0271b(l lVar) {
                super(1);
                this.f14262a = lVar;
            }

            public final void a(long j10) {
                this.f14262a.m10setPopupContentSizefhxjrPA(r.b(j10));
                this.f14262a.t();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((r) obj).j());
                return C6514M.f71813a;
            }
        }

        static final class c extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f14263a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(A1 a12) {
                super(2);
                this.f14263a = a12;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(606497925, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                    }
                    b.b(this.f14263a).invoke(mVar, 0);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(l lVar, A1 a12) {
            super(2);
            this.f14259a = lVar;
            this.f14260b = a12;
        }

        public final void a(C1500m mVar, int i10) {
            float f10;
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
                }
                k0.i d10 = m.d(k0.i.f23074a, false, a.f14261a, 1, (Object) null);
                boolean C10 = mVar.C(this.f14259a);
                l lVar = this.f14259a;
                Object A10 = mVar.A();
                if (C10 || A10 == C1500m.f10026a.a()) {
                    A10 = new C0271b(lVar);
                    mVar.r(A10);
                }
                k0.i a10 = androidx.compose.ui.layout.e.a(d10, (C6798l) A10);
                if (this.f14259a.getCanCalculatePosition()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0.i a11 = C2338a.a(a10, f10);
                C2005a e10 = g0.c.e(606497925, true, new c(this.f14260b), mVar, 54);
                c cVar = c.f14264a;
                int a12 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e11 = k0.h.e(mVar, a11);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a13 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a13);
                } else {
                    mVar.q();
                }
                C1500m a14 = F1.a(mVar);
                F1.b(a14, cVar, aVar.c());
                F1.b(a14, p10, aVar.e());
                p b10 = aVar.b();
                if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a12))) {
                    a14.r(Integer.valueOf(a12));
                    a14.V(Integer.valueOf(a12), b10);
                }
                F1.b(a14, e11, aVar.d());
                e10.invoke(mVar, 6);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.window.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.compose.ui.window.b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: androidx.compose.ui.window.b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.window.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: androidx.compose.ui.window.l} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        if (r9 == r24.a()) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        if (r5 == r24.a()) goto L_0x01d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.window.r r35, yf.C6787a r36, androidx.compose.ui.window.s r37, yf.p r38, Y.C1500m r39, int r40, int r41) {
        /*
            r11 = r35
            r12 = r38
            r13 = r40
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r39
            Y.m r14 = r1.h(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r13 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r14.S(r11)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r13
            goto L_0x0026
        L_0x0025:
            r1 = r13
        L_0x0026:
            r2 = r41 & 2
            r10 = 32
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r36
            goto L_0x0042
        L_0x0031:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r36
            boolean r4 = r14.C(r3)
            if (r4 == 0) goto L_0x003f
            r4 = r10
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
        L_0x0042:
            r4 = r41 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r37
            goto L_0x005e
        L_0x004d:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r37
            boolean r6 = r14.S(r5)
            if (r6 == 0) goto L_0x005b
            r6 = r9
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
        L_0x005e:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r1
            goto L_0x0077
        L_0x0066:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0064
            boolean r6 = r14.C(r12)
            if (r6 == 0) goto L_0x0073
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r6
            goto L_0x0064
        L_0x0077:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x008b
            boolean r1 = r14.i()
            if (r1 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r14.I()
            r2 = r3
            r3 = r5
            goto L_0x02ea
        L_0x008b:
            r7 = 0
            if (r2 == 0) goto L_0x0091
            r22 = r7
            goto L_0x0093
        L_0x0091:
            r22 = r3
        L_0x0093:
            if (r4 == 0) goto L_0x00a9
            androidx.compose.ui.window.s r1 = new androidx.compose.ui.window.s
            r28 = 15
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r1
            r23.<init>((boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            goto L_0x00ab
        L_0x00a9:
            r23 = r5
        L_0x00ab:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x00b7
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)"
            Y.C1506p.Q(r0, r8, r1, r2)
        L_0x00b7:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r14.m(r0)
            r16 = r0
            android.view.View r16 = (android.view.View) r16
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r14.m(r0)
            r17 = r0
            c1.d r17 = (c1.d) r17
            Y.I0 r0 = f14229a
            java.lang.Object r0 = r14.m(r0)
            java.lang.String r0 = (java.lang.String) r0
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.k()
            java.lang.Object r1 = r14.m(r1)
            r6 = r1
            c1.t r6 = (c1.t) r6
            r5 = 0
            Y.r r4 = Y.C1494j.d(r14, r5)
            int r1 = r8 >> 9
            r1 = r1 & 14
            Y.A1 r3 = Y.p1.o(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            androidx.compose.ui.window.b$i r18 = androidx.compose.ui.window.b.i.f14258a
            r19 = 3072(0xc00, float:4.305E-42)
            r20 = 6
            r2 = 0
            r21 = 0
            r15 = r3
            r3 = r21
            r30 = r4
            r4 = r18
            r5 = r14
            r31 = r6
            r6 = r19
            r7 = r20
            java.lang.Object r1 = h0.C2018b.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r1 = r14.A()
            Y.m$a r24 = Y.C1500m.f10026a
            java.lang.Object r2 = r24.a()
            r6 = 1
            if (r1 != r2) goto L_0x0159
            androidx.compose.ui.window.l r5 = new androidx.compose.ui.window.l
            r18 = 128(0x80, float:1.794E-43)
            r19 = 0
            r20 = 0
            r4 = r0
            r0 = r5
            r1 = r22
            r2 = r23
            r3 = r4
            r32 = r4
            r4 = r16
            r33 = r5
            r5 = r17
            r6 = r35
            r34 = r8
            r8 = r20
            r9 = r18
            r12 = r10
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.b$j r0 = new androidx.compose.ui.window.b$j
            r1 = r33
            r0.<init>(r1, r15)
            r2 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            g0.a r0 = g0.c.c(r2, r3, r0)
            r2 = r30
            r1.m(r2, r0)
            r14.r(r1)
            goto L_0x015f
        L_0x0159:
            r32 = r0
            r3 = r6
            r34 = r8
            r12 = r10
        L_0x015f:
            androidx.compose.ui.window.l r1 = (androidx.compose.ui.window.l) r1
            boolean r0 = r14.C(r1)
            r2 = r34
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 != r12) goto L_0x016d
            r5 = r3
            goto L_0x016e
        L_0x016d:
            r5 = 0
        L_0x016e:
            r0 = r0 | r5
            r5 = r2 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x0177
            r7 = r3
            goto L_0x0178
        L_0x0177:
            r7 = 0
        L_0x0178:
            r0 = r0 | r7
            r7 = r32
            boolean r8 = r14.S(r7)
            r0 = r0 | r8
            r8 = r31
            boolean r9 = r14.S(r8)
            r0 = r0 | r9
            java.lang.Object r9 = r14.A()
            if (r0 != 0) goto L_0x0193
            java.lang.Object r0 = r24.a()
            if (r9 != r0) goto L_0x01a7
        L_0x0193:
            androidx.compose.ui.window.b$b r9 = new androidx.compose.ui.window.b$b
            r16 = r9
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.r(r9)
        L_0x01a7:
            yf.l r9 = (yf.C6798l) r9
            r0 = 0
            Y.P.c(r1, r9, r14, r0)
            boolean r9 = r14.C(r1)
            if (r4 != r12) goto L_0x01b5
            r4 = r3
            goto L_0x01b6
        L_0x01b5:
            r4 = r0
        L_0x01b6:
            r4 = r4 | r9
            if (r5 != r6) goto L_0x01bb
            r5 = r3
            goto L_0x01bc
        L_0x01bb:
            r5 = r0
        L_0x01bc:
            r4 = r4 | r5
            boolean r5 = r14.S(r7)
            r4 = r4 | r5
            boolean r5 = r14.S(r8)
            r4 = r4 | r5
            java.lang.Object r5 = r14.A()
            if (r4 != 0) goto L_0x01d3
            java.lang.Object r4 = r24.a()
            if (r5 != r4) goto L_0x01e7
        L_0x01d3:
            androidx.compose.ui.window.b$c r5 = new androidx.compose.ui.window.b$c
            r16 = r5
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.r(r5)
        L_0x01e7:
            yf.a r5 = (yf.C6787a) r5
            Y.P.h(r5, r14, r0)
            boolean r4 = r14.C(r1)
            r2 = r2 & 14
            r5 = 4
            if (r2 != r5) goto L_0x01f7
            r5 = r3
            goto L_0x01f8
        L_0x01f7:
            r5 = r0
        L_0x01f8:
            r3 = r4 | r5
            java.lang.Object r4 = r14.A()
            if (r3 != 0) goto L_0x0206
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x020e
        L_0x0206:
            androidx.compose.ui.window.b$d r4 = new androidx.compose.ui.window.b$d
            r4.<init>(r1, r11)
            r14.r(r4)
        L_0x020e:
            yf.l r4 = (yf.C6798l) r4
            Y.P.c(r11, r4, r14, r2)
            boolean r2 = r14.C(r1)
            java.lang.Object r3 = r14.A()
            if (r2 != 0) goto L_0x0223
            java.lang.Object r2 = r24.a()
            if (r3 != r2) goto L_0x022c
        L_0x0223:
            androidx.compose.ui.window.b$e r3 = new androidx.compose.ui.window.b$e
            r2 = 0
            r3.<init>(r1, r2)
            r14.r(r3)
        L_0x022c:
            yf.p r3 = (yf.p) r3
            Y.P.g(r1, r3, r14, r0)
            k0.i$a r2 = k0.i.f23074a
            boolean r3 = r14.C(r1)
            java.lang.Object r4 = r14.A()
            if (r3 != 0) goto L_0x0243
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x024b
        L_0x0243:
            androidx.compose.ui.window.b$f r4 = new androidx.compose.ui.window.b$f
            r4.<init>(r1)
            r14.r(r4)
        L_0x024b:
            yf.l r4 = (yf.C6798l) r4
            k0.i r2 = androidx.compose.ui.layout.c.a(r2, r4)
            boolean r3 = r14.C(r1)
            boolean r4 = r14.S(r8)
            r3 = r3 | r4
            java.lang.Object r4 = r14.A()
            if (r3 != 0) goto L_0x0266
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x026e
        L_0x0266:
            androidx.compose.ui.window.b$g r4 = new androidx.compose.ui.window.b$g
            r4.<init>(r1, r8)
            r14.r(r4)
        L_0x026e:
            H0.F r4 = (H0.F) r4
            int r0 = Y.C1494j.a(r14, r0)
            Y.y r1 = r14.p()
            k0.i r2 = k0.h.e(r14, r2)
            J0.g$a r3 = J0.C1241g.f3853J
            yf.a r5 = r3.a()
            Y.f r6 = r14.j()
            if (r6 != 0) goto L_0x028b
            Y.C1494j.c()
        L_0x028b:
            r14.F()
            boolean r6 = r14.f()
            if (r6 == 0) goto L_0x0298
            r14.U(r5)
            goto L_0x029b
        L_0x0298:
            r14.q()
        L_0x029b:
            Y.m r5 = Y.F1.a(r14)
            yf.p r6 = r3.c()
            Y.F1.b(r5, r4, r6)
            yf.p r4 = r3.e()
            Y.F1.b(r5, r1, r4)
            yf.p r1 = r3.b()
            boolean r4 = r5.f()
            if (r4 != 0) goto L_0x02c5
            java.lang.Object r4 = r5.A()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r6)
            if (r4 != 0) goto L_0x02d3
        L_0x02c5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5.r(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.V(r0, r1)
        L_0x02d3:
            yf.p r0 = r3.d()
            Y.F1.b(r5, r2, r0)
            r14.u()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x02e6
            Y.C1506p.P()
        L_0x02e6:
            r2 = r22
            r3 = r23
        L_0x02ea:
            Y.Y0 r7 = r14.k()
            if (r7 == 0) goto L_0x0301
            androidx.compose.ui.window.b$h r8 = new androidx.compose.ui.window.b$h
            r0 = r8
            r1 = r35
            r4 = r38
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.r, yf.a, androidx.compose.ui.window.s, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p b(A1 a12) {
        return (p) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final int g(boolean z10, t tVar, boolean z11) {
        int i10;
        if (!z10) {
            i10 = 262152;
        } else {
            i10 = 262144;
        }
        if (tVar == t.SecureOn) {
            i10 |= 8192;
        }
        if (!z11) {
            return i10 | 512;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static final int h(s sVar, boolean z10) {
        if (sVar.e() && z10) {
            return sVar.d() | 8192;
        }
        if (!sVar.e() || z10) {
            return sVar.d();
        }
        return sVar.d() & -8193;
    }

    public static final boolean i(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final c1.p j(Rect rect) {
        return new c1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    static final class g implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f14250b;

        g(l lVar, t tVar) {
            this.f14249a = lVar;
            this.f14250b = tVar;
        }

        public final G j(H h10, List list, long j10) {
            this.f14249a.setParentLayoutDirection(this.f14250b);
            return H.N(h10, 0, 0, (Map) null, a.f14251a, 4, (Object) null);
        }

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14251a = new a();

            a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }

            public final void a(U.a aVar) {
            }
        }
    }
}

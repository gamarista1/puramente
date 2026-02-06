package androidx.compose.ui.window;

import H0.F;
import H0.U;
import J0.C1241g;
import O0.m;
import O0.v;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.L;
import Y.M;
import Y.M0;
import Y.Y0;
import c1.t;
import java.util.List;
import java.util.UUID;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class a {

    /* renamed from: androidx.compose.ui.window.a$a  reason: collision with other inner class name */
    static final class C0266a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f14208a;

        /* renamed from: androidx.compose.ui.window.a$a$a  reason: collision with other inner class name */
        public static final class C0267a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f14209a;

            public C0267a(k kVar) {
                this.f14209a = kVar;
            }

            public void dispose() {
                this.f14209a.dismiss();
                this.f14209a.h();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0266a(k kVar) {
            super(1);
            this.f14208a = kVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f14208a.show();
            return new C0267a(this.f14208a);
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f14210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f14211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f14212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t f14213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, C6787a aVar, i iVar, t tVar) {
            super(0);
            this.f14210a = kVar;
            this.f14211b = aVar;
            this.f14212c = iVar;
            this.f14213d = tVar;
        }

        public final void invoke() {
            this.f14210a.l(this.f14211b, this.f14212c, this.f14213d);
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f14214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f14215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f14216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14217d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f14218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, i iVar, p pVar, int i10, int i11) {
            super(2);
            this.f14214a = aVar;
            this.f14215b = iVar;
            this.f14216c = pVar;
            this.f14217d = i10;
            this.f14218e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            a.a(this.f14214a, this.f14215b, this.f14216c, mVar, M0.a(this.f14217d | 1), this.f14218e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f14219a;

        /* renamed from: androidx.compose.ui.window.a$d$a  reason: collision with other inner class name */
        static final class C0268a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0268a f14220a = new C0268a();

            C0268a() {
                super(1);
            }

            public final void a(v vVar) {
                O0.t.j(vVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        static final class b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f14221a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(A1 a12) {
                super(2);
                this.f14221a = a12;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-533674951, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                    }
                    a.b(this.f14221a).invoke(mVar, 0);
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
        d(A1 a12) {
            super(2);
            this.f14219a = a12;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(488261145, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
                }
                a.c(m.d(i.f23074a, false, C0268a.f14220a, 1, (Object) null), g0.c.e(-533674951, true, new b(this.f14219a), mVar, 54), mVar, 48, 0);
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

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f14222a = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class f implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final f f14223a = new f();

        /* renamed from: androidx.compose.ui.window.a$f$a  reason: collision with other inner class name */
        static final class C0269a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f14224a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0269a(List list) {
                super(1);
                this.f14224a = list;
            }

            public final void a(U.a aVar) {
                List list = this.f14224a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    U.a.l(aVar, (U) list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        f() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: H0.U} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final H0.G j(H0.H r12, java.util.List r13, long r14) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r13.size()
                r0.<init>(r1)
                int r1 = r13.size()
                r2 = 0
                r3 = r2
            L_0x000f:
                if (r3 >= r1) goto L_0x0021
                java.lang.Object r4 = r13.get(r3)
                H0.E r4 = (H0.E) r4
                H0.U r4 = r4.v0(r14)
                r0.add(r4)
                int r3 = r3 + 1
                goto L_0x000f
            L_0x0021:
                boolean r13 = r0.isEmpty()
                r1 = 0
                r3 = 1
                if (r13 == 0) goto L_0x002b
                r13 = r1
                goto L_0x0051
            L_0x002b:
                java.lang.Object r13 = r0.get(r2)
                r4 = r13
                H0.U r4 = (H0.U) r4
                int r4 = r4.X0()
                int r5 = mf.C6565s.p(r0)
                if (r3 > r5) goto L_0x0051
                r6 = r3
            L_0x003d:
                java.lang.Object r7 = r0.get(r6)
                r8 = r7
                H0.U r8 = (H0.U) r8
                int r8 = r8.X0()
                if (r4 >= r8) goto L_0x004c
                r13 = r7
                r4 = r8
            L_0x004c:
                if (r6 == r5) goto L_0x0051
                int r6 = r6 + 1
                goto L_0x003d
            L_0x0051:
                H0.U r13 = (H0.U) r13
                if (r13 == 0) goto L_0x005b
                int r13 = r13.X0()
            L_0x0059:
                r5 = r13
                goto L_0x0060
            L_0x005b:
                int r13 = c1.b.n(r14)
                goto L_0x0059
            L_0x0060:
                boolean r13 = r0.isEmpty()
                if (r13 == 0) goto L_0x0067
                goto L_0x008d
            L_0x0067:
                java.lang.Object r13 = r0.get(r2)
                r1 = r13
                H0.U r1 = (H0.U) r1
                int r1 = r1.R0()
                int r2 = mf.C6565s.p(r0)
                if (r3 > r2) goto L_0x008c
            L_0x0078:
                java.lang.Object r4 = r0.get(r3)
                r6 = r4
                H0.U r6 = (H0.U) r6
                int r6 = r6.R0()
                if (r1 >= r6) goto L_0x0087
                r13 = r4
                r1 = r6
            L_0x0087:
                if (r3 == r2) goto L_0x008c
                int r3 = r3 + 1
                goto L_0x0078
            L_0x008c:
                r1 = r13
            L_0x008d:
                H0.U r1 = (H0.U) r1
                if (r1 == 0) goto L_0x0097
                int r13 = r1.R0()
            L_0x0095:
                r6 = r13
                goto L_0x009c
            L_0x0097:
                int r13 = c1.b.m(r14)
                goto L_0x0095
            L_0x009c:
                androidx.compose.ui.window.a$f$a r8 = new androidx.compose.ui.window.a$f$a
                r8.<init>(r0)
                r9 = 4
                r10 = 0
                r7 = 0
                r4 = r12
                H0.G r12 = H0.H.N(r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.f.j(H0.H, java.util.List, long):H0.G");
        }
    }

    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f14225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f14226b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14227c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, p pVar, int i10, int i11) {
            super(2);
            this.f14225a = iVar;
            this.f14226b = pVar;
            this.f14227c = i10;
            this.f14228d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            a.c(this.f14225a, this.f14226b, mVar, M0.a(this.f14227c | 1), this.f14228d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.window.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.ui.window.k} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(yf.C6787a r23, androidx.compose.ui.window.i r24, yf.p r25, Y.C1500m r26, int r27, int r28) {
        /*
            r7 = r23
            r8 = r25
            r9 = r27
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r26
            Y.m r6 = r1.h(r0)
            r1 = r28 & 1
            r5 = 4
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.C(r7)
            if (r1 == 0) goto L_0x0023
            r1 = r5
            goto L_0x0024
        L_0x0023:
            r1 = 2
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r2 = r28 & 2
            r4 = 32
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
        L_0x002f:
            r3 = r24
            goto L_0x0043
        L_0x0032:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x002f
            r3 = r24
            boolean r10 = r6.S(r3)
            if (r10 == 0) goto L_0x0040
            r10 = r4
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r1 = r1 | r10
        L_0x0043:
            r10 = r28 & 4
            if (r10 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r10 = r9 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005a
            boolean r10 = r6.C(r8)
            if (r10 == 0) goto L_0x0057
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r10
        L_0x005a:
            r10 = r1 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x006e
            boolean r10 = r6.i()
            if (r10 != 0) goto L_0x0067
            goto L_0x006e
        L_0x0067:
            r6.I()
            r2 = r3
            r11 = r6
            goto L_0x018a
        L_0x006e:
            if (r2 == 0) goto L_0x007d
            androidx.compose.ui.window.i r2 = new androidx.compose.ui.window.i
            r15 = 7
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r2
            r11.<init>((boolean) r12, (boolean) r13, (boolean) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)
            r3 = r2
        L_0x007d:
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0089
            r2 = -1
            java.lang.String r10 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)"
            Y.C1506p.Q(r0, r1, r2, r10)
        L_0x0089:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r6.m(r0)
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r6.m(r0)
            c1.d r0 = (c1.d) r0
            Y.I0 r10 = androidx.compose.ui.platform.C1644k0.k()
            java.lang.Object r10 = r6.m(r10)
            r15 = r10
            c1.t r15 = (c1.t) r15
            r14 = 0
            Y.r r13 = Y.C1494j.d(r6, r14)
            int r10 = r1 >> 6
            r10 = r10 & 14
            Y.A1 r12 = Y.p1.o(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r14]
            androidx.compose.ui.window.a$e r16 = androidx.compose.ui.window.a.e.f14222a
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 6
            r11 = 0
            r19 = 0
            r20 = r12
            r12 = r19
            r21 = r13
            r13 = r16
            r14 = r6
            r24 = r15
            r15 = r17
            r16 = r18
            java.lang.Object r10 = h0.C2018b.e(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            boolean r11 = r6.S(r2)
            boolean r12 = r6.S(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r6.A()
            r14 = 1
            if (r11 != 0) goto L_0x00f5
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            r13 = r1
            r22 = r3
            r15 = r5
            r11 = r6
            goto L_0x0121
        L_0x00f5:
            androidx.compose.ui.window.k r12 = new androidx.compose.ui.window.k
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r23
            r15 = r2
            r2 = r3
            r22 = r3
            r3 = r15
            r15 = r4
            r4 = r24
            r15 = r5
            r5 = r11
            r11 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.a$d r0 = new androidx.compose.ui.window.a$d
            r1 = r20
            r0.<init>(r1)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            g0.a r0 = g0.c.c(r1, r14, r0)
            r1 = r21
            r12.i(r1, r0)
            r11.r(r12)
        L_0x0121:
            androidx.compose.ui.window.k r12 = (androidx.compose.ui.window.k) r12
            boolean r0 = r11.C(r12)
            java.lang.Object r1 = r11.A()
            if (r0 != 0) goto L_0x0135
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x013d
        L_0x0135:
            androidx.compose.ui.window.a$a r1 = new androidx.compose.ui.window.a$a
            r1.<init>(r12)
            r11.r(r1)
        L_0x013d:
            yf.l r1 = (yf.C6798l) r1
            r0 = 0
            Y.P.c(r12, r1, r11, r0)
            boolean r1 = r11.C(r12)
            r2 = r13 & 14
            if (r2 != r15) goto L_0x014d
            r2 = r14
            goto L_0x014e
        L_0x014d:
            r2 = r0
        L_0x014e:
            r1 = r1 | r2
            r2 = r13 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != r3) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r14 = r0
        L_0x0157:
            r1 = r1 | r14
            r10 = r24
            boolean r2 = r11.S(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r11.A()
            if (r1 != 0) goto L_0x0171
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r3 = r22
            goto L_0x017b
        L_0x0171:
            androidx.compose.ui.window.a$b r2 = new androidx.compose.ui.window.a$b
            r3 = r22
            r2.<init>(r12, r7, r3, r10)
            r11.r(r2)
        L_0x017b:
            yf.a r2 = (yf.C6787a) r2
            Y.P.h(r2, r11, r0)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0189
            Y.C1506p.P()
        L_0x0189:
            r2 = r3
        L_0x018a:
            Y.Y0 r6 = r11.k()
            if (r6 == 0) goto L_0x01a1
            androidx.compose.ui.window.a$c r10 = new androidx.compose.ui.window.a$c
            r0 = r10
            r1 = r23
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r10)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(yf.a, androidx.compose.ui.window.i, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p b(A1 a12) {
        return (p) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(i iVar, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-1177876616);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18 || !h10.i()) {
            if (i15 != 0) {
                iVar = i.f23074a;
            }
            if (C1506p.H()) {
                C1506p.Q(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f14223a;
            int i16 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, iVar);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            int i17 = ((i16 << 6) & 896) | 6;
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, fVar, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            pVar.invoke(h10, Integer.valueOf((i17 >> 6) & 14));
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(iVar, pVar, i10, i11));
        }
    }
}

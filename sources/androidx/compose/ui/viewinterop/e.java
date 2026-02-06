package androidx.compose.ui.viewinterop;

import J0.C1241g;
import J0.G;
import J0.m0;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.r;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C1798v;
import c1.t;
import h0.C2023g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import x3.C2914f;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final C6798l f14163a = h.f14181a;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f14164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f14165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f14166c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14167d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f14168e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar, k0.i iVar, C6798l lVar2, int i10, int i11) {
            super(2);
            this.f14164a = lVar;
            this.f14165b = iVar;
            this.f14166c = lVar2;
            this.f14167d = i10;
            this.f14168e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            e.a(this.f14164a, this.f14165b, this.f14166c, mVar, M0.a(this.f14167d | 1), this.f14168e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14169a = new b();

        b() {
            super(2);
        }

        public final void a(G g10, C6798l lVar) {
            e.f(g10).setResetBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C6798l) obj2);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14170a = new c();

        c() {
            super(2);
        }

        public final void a(G g10, C6798l lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C6798l) obj2);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14171a = new d();

        d() {
            super(2);
        }

        public final void a(G g10, C6798l lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C6798l) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.e$e  reason: collision with other inner class name */
    static final class C0265e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C0265e f14172a = new C0265e();

        C0265e() {
            super(2);
        }

        public final void a(G g10, C6798l lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C6798l) obj2);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final f f14173a = new f();

        f() {
            super(2);
        }

        public final void a(G g10, C6798l lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C6798l) obj2);
            return C6514M.f71813a;
        }
    }

    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f14174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f14175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f14176c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f14177d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f14178e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f14179f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f14180g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C6798l lVar, k0.i iVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, int i10, int i11) {
            super(2);
            this.f14174a = lVar;
            this.f14175b = iVar;
            this.f14176c = lVar2;
            this.f14177d = lVar3;
            this.f14178e = lVar4;
            this.f14179f = i10;
            this.f14180g = i11;
        }

        public final void a(C1500m mVar, int i10) {
            e.b(this.f14174a, this.f14175b, this.f14176c, this.f14177d, this.f14178e, mVar, M0.a(this.f14179f | 1), this.f14180g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f14181a = new h();

        h() {
            super(1);
        }

        public final void a(View view) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C6514M.f71813a;
        }
    }

    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f14182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f14183b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f14184c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2023g f14185d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f14186e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f14187f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Context context, C6798l lVar, r rVar, C2023g gVar, int i10, View view) {
            super(0);
            this.f14182a = context;
            this.f14183b = lVar;
            this.f14184c = rVar;
            this.f14185d = gVar;
            this.f14186e = i10;
            this.f14187f = view;
        }

        /* renamed from: a */
        public final G invoke() {
            Context context = this.f14182a;
            C6798l lVar = this.f14183b;
            r rVar = this.f14184c;
            C2023g gVar = this.f14185d;
            int i10 = this.f14186e;
            View view = this.f14187f;
            C6496s.f(view, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new i(context, lVar, rVar, gVar, i10, (m0) view).getLayoutNode();
        }
    }

    static final class j extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final j f14188a = new j();

        j() {
            super(2);
        }

        public final void a(G g10, k0.i iVar) {
            e.f(g10).setModifier(iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (k0.i) obj2);
            return C6514M.f71813a;
        }
    }

    static final class k extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final k f14189a = new k();

        k() {
            super(2);
        }

        public final void a(G g10, c1.d dVar) {
            e.f(g10).setDensity(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (c1.d) obj2);
            return C6514M.f71813a;
        }
    }

    static final class l extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final l f14190a = new l();

        l() {
            super(2);
        }

        public final void a(G g10, C1798v vVar) {
            e.f(g10).setLifecycleOwner(vVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C1798v) obj2);
            return C6514M.f71813a;
        }
    }

    static final class m extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final m f14191a = new m();

        m() {
            super(2);
        }

        public final void a(G g10, C2914f fVar) {
            e.f(g10).setSavedStateRegistryOwner(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C2914f) obj2);
            return C6514M.f71813a;
        }
    }

    static final class n extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final n f14192a = new n();

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14193a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    c1.t[] r0 = c1.t.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f14193a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.n.a.<clinit>():void");
            }
        }

        n() {
            super(2);
        }

        public final void a(G g10, t tVar) {
            i c10 = e.f(g10);
            int i10 = a.f14193a[tVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new C6535s();
            }
            c10.setLayoutDirection(i11);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (t) obj2);
            return C6514M.f71813a;
        }
    }

    public static final void a(C6798l lVar, k0.i iVar, C6798l lVar2, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.C(lVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(iVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.C(lVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146 || !h10.i()) {
            if (i16 != 0) {
                iVar = k0.i.f23074a;
            }
            if (i17 != 0) {
                lVar2 = f14163a;
            }
            if (C1506p.H()) {
                C1506p.Q(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            int i18 = (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344);
            b(lVar, iVar, (C6798l) null, f14163a, lVar2, h10, i18, 4);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        k0.i iVar2 = iVar;
        C6798l lVar3 = lVar2;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(lVar, iVar2, lVar3, i10, i11));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(yf.C6798l r21, k0.i r22, yf.C6798l r23, yf.C6798l r24, yf.C6798l r25, Y.C1500m r26, int r27, int r28) {
        /*
            r1 = r21
            r6 = r27
            r0 = -180024211(0xfffffffff5450c6d, float:-2.497887E32)
            r2 = r26
            Y.m r2 = r2.h(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.C(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r6
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r22
            goto L_0x003f
        L_0x002d:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r22
            boolean r7 = r2.S(r5)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r8 = r23
            goto L_0x005a
        L_0x0048:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0045
            r8 = r23
            boolean r9 = r2.C(r8)
            if (r9 == 0) goto L_0x0057
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r9
        L_0x005a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r10 = r24
            goto L_0x0075
        L_0x0063:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0060
            r10 = r24
            boolean r11 = r2.C(r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r11
        L_0x0075:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r12 = r25
            goto L_0x0090
        L_0x007e:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r25
            boolean r13 = r2.C(r12)
            if (r13 == 0) goto L_0x008d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r13
        L_0x0090:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a5
            boolean r13 = r2.i()
            if (r13 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r2.I()
            r4 = r5
        L_0x00a1:
            r3 = r8
            r5 = r12
            goto L_0x0197
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            k0.i$a r4 = k0.i.f23074a
            goto L_0x00ab
        L_0x00aa:
            r4 = r5
        L_0x00ab:
            if (r7 == 0) goto L_0x00af
            r5 = 0
            r8 = r5
        L_0x00af:
            if (r9 == 0) goto L_0x00b4
            yf.l r5 = f14163a
            r10 = r5
        L_0x00b4:
            if (r11 == 0) goto L_0x00b9
            yf.l r5 = f14163a
            r12 = r5
        L_0x00b9:
            boolean r5 = Y.C1506p.H()
            if (r5 == 0) goto L_0x00c5
            r5 = -1
            java.lang.String r7 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:211)"
            Y.C1506p.Q(r0, r3, r5, r7)
        L_0x00c5:
            r0 = 0
            int r15 = Y.C1494j.a(r2, r0)
            k0.i r0 = androidx.compose.ui.viewinterop.f.e(r4)
            k0.i r14 = k0.h.e(r2, r0)
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r2.m(r0)
            r16 = r0
            c1.d r16 = (c1.d) r16
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.k()
            java.lang.Object r0 = r2.m(r0)
            r19 = r0
            c1.t r19 = (c1.t) r19
            Y.y r20 = r2.p()
            Y.I0 r0 = X1.a.a()
            java.lang.Object r0 = r2.m(r0)
            r17 = r0
            androidx.lifecycle.v r17 = (androidx.lifecycle.C1798v) r17
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r2.m(r0)
            r18 = r0
            x3.f r18 = (x3.C2914f) r18
            if (r8 == 0) goto L_0x014d
            r0 = 607871394(0x243b61a2, float:4.063186E-17)
            r2.T(r0)
            r0 = r3 & 14
            yf.a r0 = d(r1, r2, r0)
            Y.f r3 = r2.j()
            boolean r3 = r3 instanceof J0.E0
            if (r3 != 0) goto L_0x011f
            Y.C1494j.c()
        L_0x011f:
            r2.F()
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x012c
            r2.U(r0)
            goto L_0x012f
        L_0x012c:
            r2.q()
        L_0x012f:
            Y.m r0 = Y.F1.a(r2)
            r13 = r0
            g(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.viewinterop.e$b r3 = androidx.compose.ui.viewinterop.e.b.f14169a
            Y.F1.b(r0, r8, r3)
            androidx.compose.ui.viewinterop.e$c r3 = androidx.compose.ui.viewinterop.e.c.f14170a
            Y.F1.b(r0, r12, r3)
            androidx.compose.ui.viewinterop.e$d r3 = androidx.compose.ui.viewinterop.e.d.f14171a
            Y.F1.b(r0, r10, r3)
            r2.u()
            r2.M()
            goto L_0x018c
        L_0x014d:
            r0 = 608726777(0x24486ef9, float:4.3462084E-17)
            r2.T(r0)
            r0 = r3 & 14
            yf.a r0 = d(r1, r2, r0)
            Y.f r3 = r2.j()
            boolean r3 = r3 instanceof J0.E0
            if (r3 != 0) goto L_0x0164
            Y.C1494j.c()
        L_0x0164:
            r2.l()
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0171
            r2.U(r0)
            goto L_0x0174
        L_0x0171:
            r2.q()
        L_0x0174:
            Y.m r0 = Y.F1.a(r2)
            r13 = r0
            g(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.viewinterop.e$e r3 = androidx.compose.ui.viewinterop.e.C0265e.f14172a
            Y.F1.b(r0, r12, r3)
            androidx.compose.ui.viewinterop.e$f r3 = androidx.compose.ui.viewinterop.e.f.f14173a
            Y.F1.b(r0, r10, r3)
            r2.u()
            r2.M()
        L_0x018c:
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00a1
            Y.C1506p.P()
            goto L_0x00a1
        L_0x0197:
            Y.Y0 r8 = r2.k()
            if (r8 == 0) goto L_0x01ae
            androidx.compose.ui.viewinterop.e$g r9 = new androidx.compose.ui.viewinterop.e$g
            r0 = r9
            r1 = r21
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(yf.l, k0.i, yf.l, yf.l, yf.l, Y.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.ui.viewinterop.e$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.ui.viewinterop.e$i} */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (r0 == Y.C1500m.f10026a.a()) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final yf.C6787a d(yf.C6798l r9, Y.C1500m r10, int r11) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)"
            r2 = 2030558801(0x7907de51, float:4.4091824E34)
            Y.C1506p.Q(r2, r11, r0, r1)
        L_0x000f:
            r0 = 0
            int r6 = Y.C1494j.a(r10, r0)
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r10.m(r1)
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            Y.r r4 = Y.C1494j.d(r10, r0)
            Y.I0 r1 = h0.C2025i.d()
            java.lang.Object r1 = r10.m(r1)
            r5 = r1
            h0.g r5 = (h0.C2023g) r5
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r1 = r10.m(r1)
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            boolean r1 = r10.C(r2)
            r3 = r11 & 14
            r3 = r3 ^ 6
            r8 = 4
            if (r3 <= r8) goto L_0x004a
            boolean r3 = r10.S(r9)
            if (r3 != 0) goto L_0x004e
        L_0x004a:
            r11 = r11 & 6
            if (r11 != r8) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            r11 = r1 | r0
            boolean r0 = r10.C(r4)
            r11 = r11 | r0
            boolean r0 = r10.C(r5)
            r11 = r11 | r0
            boolean r0 = r10.d(r6)
            r11 = r11 | r0
            boolean r0 = r10.C(r7)
            r11 = r11 | r0
            java.lang.Object r0 = r10.A()
            if (r11 != 0) goto L_0x0073
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x007d
        L_0x0073:
            androidx.compose.ui.viewinterop.e$i r0 = new androidx.compose.ui.viewinterop.e$i
            r1 = r0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.r(r0)
        L_0x007d:
            yf.a r0 = (yf.C6787a) r0
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x0088
            Y.C1506p.P()
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.d(yf.l, Y.m, int):yf.a");
    }

    public static final C6798l e() {
        return f14163a;
    }

    /* access modifiers changed from: private */
    public static final i f(G g10) {
        c S10 = g10.S();
        if (S10 != null) {
            return (i) S10;
        }
        G0.a.c("Required value was null.");
        throw new C6527k();
    }

    private static final void g(C1500m mVar, k0.i iVar, int i10, c1.d dVar, C1798v vVar, C2914f fVar, t tVar, C1523y yVar) {
        C1241g.a aVar = C1241g.f3853J;
        F1.b(mVar, yVar, aVar.e());
        F1.b(mVar, iVar, j.f14188a);
        F1.b(mVar, dVar, k.f14189a);
        F1.b(mVar, vVar, l.f14190a);
        F1.b(mVar, fVar, m.f14191a);
        F1.b(mVar, tVar, n.f14192a);
        p b10 = aVar.b();
        if (mVar.f() || !C6496s.c(mVar.A(), Integer.valueOf(i10))) {
            mVar.r(Integer.valueOf(i10));
            mVar.V(Integer.valueOf(i10), b10);
        }
    }
}

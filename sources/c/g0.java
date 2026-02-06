package C;

import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.P;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.C1680b0;
import androidx.core.view.C1710q0;
import androidx.core.view.D0;
import androidx.core.view.I;
import androidx.core.view.r;
import i0.C2057k;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C2388d;
import yf.C6798l;

public final class g0 {

    /* renamed from: A  reason: collision with root package name */
    private static boolean f930A;

    /* renamed from: x  reason: collision with root package name */
    public static final a f931x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f932y = 8;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final WeakHashMap f933z = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final C1084b f934a;

    /* renamed from: b  reason: collision with root package name */
    private final C1084b f935b;

    /* renamed from: c  reason: collision with root package name */
    private final C1084b f936c;

    /* renamed from: d  reason: collision with root package name */
    private final C1084b f937d;

    /* renamed from: e  reason: collision with root package name */
    private final C1084b f938e;

    /* renamed from: f  reason: collision with root package name */
    private final C1084b f939f;

    /* renamed from: g  reason: collision with root package name */
    private final C1084b f940g;

    /* renamed from: h  reason: collision with root package name */
    private final C1084b f941h;

    /* renamed from: i  reason: collision with root package name */
    private final C1084b f942i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f943j;

    /* renamed from: k  reason: collision with root package name */
    private final f0 f944k;

    /* renamed from: l  reason: collision with root package name */
    private final f0 f945l;

    /* renamed from: m  reason: collision with root package name */
    private final f0 f946m;

    /* renamed from: n  reason: collision with root package name */
    private final d0 f947n;

    /* renamed from: o  reason: collision with root package name */
    private final d0 f948o;

    /* renamed from: p  reason: collision with root package name */
    private final d0 f949p;

    /* renamed from: q  reason: collision with root package name */
    private final d0 f950q;

    /* renamed from: r  reason: collision with root package name */
    private final d0 f951r;

    /* renamed from: s  reason: collision with root package name */
    private final d0 f952s;

    /* renamed from: t  reason: collision with root package name */
    private final d0 f953t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f954u;

    /* renamed from: v  reason: collision with root package name */
    private int f955v;

    /* renamed from: w  reason: collision with root package name */
    private final D f956w;

    public static final class a {

        /* renamed from: C.g0$a$a  reason: collision with other inner class name */
        static final class C0010a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g0 f957a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f958b;

            /* renamed from: C.g0$a$a$a  reason: collision with other inner class name */
            public static final class C0011a implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g0 f959a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f960b;

                public C0011a(g0 g0Var, View view) {
                    this.f959a = g0Var;
                    this.f960b = view;
                }

                public void dispose() {
                    this.f959a.b(this.f960b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0010a(g0 g0Var, View view) {
                super(1);
                this.f957a = g0Var;
                this.f958b = view;
            }

            /* renamed from: a */
            public final L invoke(M m10) {
                this.f957a.l(this.f958b);
                return new C0011a(this.f957a, this.f958b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final g0 d(View view) {
            g0 g0Var;
            synchronized (g0.f933z) {
                try {
                    WeakHashMap a10 = g0.f933z;
                    Object obj = a10.get(view);
                    if (obj == null) {
                        obj = new g0((D0) null, view, (DefaultConstructorMarker) null);
                        a10.put(view, obj);
                    }
                    g0Var = (g0) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g0Var;
        }

        /* access modifiers changed from: private */
        public final C1084b e(D0 d02, int i10, String str) {
            C1084b bVar = new C1084b(i10, str);
            if (d02 != null) {
                bVar.h(d02, i10);
            }
            return bVar;
        }

        /* access modifiers changed from: private */
        public final d0 f(D0 d02, int i10, String str) {
            C2388d dVar;
            if (d02 == null || (dVar = d02.g(i10)) == null) {
                dVar = C2388d.f25149e;
            }
            return l0.a(dVar, str);
        }

        public final g0 c(C1500m mVar, int i10) {
            if (C1506p.H()) {
                C1506p.Q(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) mVar.m(AndroidCompositionLocals_androidKt.k());
            g0 d10 = d(view);
            boolean C10 = mVar.C(d10) | mVar.C(view);
            Object A10 = mVar.A();
            if (C10 || A10 == C1500m.f10026a.a()) {
                A10 = new C0010a(d10, view);
                mVar.r(A10);
            }
            P.c(d10, (C6798l) A10, mVar, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
            return d10;
        }

        private a() {
        }
    }

    public /* synthetic */ g0(D0 d02, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(d02, view);
    }

    public static /* synthetic */ void n(g0 g0Var, D0 d02, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        g0Var.m(d02, i10);
    }

    public final void b(View view) {
        int i10 = this.f955v - 1;
        this.f955v = i10;
        if (i10 == 0) {
            C1680b0.C0(view, (I) null);
            C1680b0.I0(view, (C1710q0.b) null);
            view.removeOnAttachStateChangeListener(this.f956w);
        }
    }

    public final boolean c() {
        return this.f954u;
    }

    public final C1084b d() {
        return this.f935b;
    }

    public final C1084b e() {
        return this.f936c;
    }

    public final d0 f() {
        return this.f953t;
    }

    public final d0 g() {
        return this.f952s;
    }

    public final C1084b h() {
        return this.f938e;
    }

    public final f0 i() {
        return this.f944k;
    }

    public final C1084b j() {
        return this.f939f;
    }

    public final C1084b k() {
        return this.f940g;
    }

    public final void l(View view) {
        if (this.f955v == 0) {
            C1680b0.C0(view, this.f956w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f956w);
            C1680b0.I0(view, this.f956w);
        }
        this.f955v++;
    }

    public final void m(D0 d02, int i10) {
        if (f930A) {
            WindowInsets x10 = d02.x();
            C6496s.e(x10);
            d02 = D0.y(x10);
        }
        this.f934a.h(d02, i10);
        this.f936c.h(d02, i10);
        this.f935b.h(d02, i10);
        this.f938e.h(d02, i10);
        this.f939f.h(d02, i10);
        this.f940g.h(d02, i10);
        this.f941h.h(d02, i10);
        this.f942i.h(d02, i10);
        this.f937d.h(d02, i10);
        if (i10 == 0) {
            this.f947n.f(l0.j(d02.g(D0.n.a())));
            this.f948o.f(l0.j(d02.g(D0.n.f())));
            this.f949p.f(l0.j(d02.g(D0.n.g())));
            this.f950q.f(l0.j(d02.g(D0.n.h())));
            this.f951r.f(l0.j(d02.g(D0.n.j())));
            r e10 = d02.e();
            if (e10 != null) {
                this.f943j.f(l0.j(e10.e()));
            }
        }
        C2057k.f21728e.n();
    }

    public final void o(D0 d02) {
        this.f953t.f(l0.j(d02.f(D0.n.c())));
    }

    public final void p(D0 d02) {
        this.f952s.f(l0.j(d02.f(D0.n.c())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.e()).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g0(androidx.core.view.D0 r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            C.g0$a r0 = f931x
            int r1 = androidx.core.view.D0.n.a()
            java.lang.String r2 = "captionBar"
            C.b r1 = r0.e(r10, r1, r2)
            r9.f934a = r1
            int r1 = androidx.core.view.D0.n.b()
            java.lang.String r2 = "displayCutout"
            C.b r1 = r0.e(r10, r1, r2)
            r9.f935b = r1
            int r2 = androidx.core.view.D0.n.c()
            java.lang.String r3 = "ime"
            C.b r2 = r0.e(r10, r2, r3)
            r9.f936c = r2
            int r3 = androidx.core.view.D0.n.e()
            java.lang.String r4 = "mandatorySystemGestures"
            C.b r3 = r0.e(r10, r3, r4)
            r9.f937d = r3
            int r4 = androidx.core.view.D0.n.f()
            java.lang.String r5 = "navigationBars"
            C.b r4 = r0.e(r10, r4, r5)
            r9.f938e = r4
            int r4 = androidx.core.view.D0.n.g()
            java.lang.String r5 = "statusBars"
            C.b r4 = r0.e(r10, r4, r5)
            r9.f939f = r4
            int r4 = androidx.core.view.D0.n.h()
            java.lang.String r5 = "systemBars"
            C.b r4 = r0.e(r10, r4, r5)
            r9.f940g = r4
            int r5 = androidx.core.view.D0.n.i()
            java.lang.String r6 = "systemGestures"
            C.b r5 = r0.e(r10, r5, r6)
            r9.f941h = r5
            int r6 = androidx.core.view.D0.n.j()
            java.lang.String r7 = "tappableElement"
            C.b r6 = r0.e(r10, r6, r7)
            r9.f942i = r6
            if (r10 == 0) goto L_0x007f
            androidx.core.view.r r7 = r10.e()
            if (r7 == 0) goto L_0x007f
            p1.d r7 = r7.e()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            p1.d r7 = p1.C2388d.f25149e
        L_0x0081:
            java.lang.String r8 = "waterfall"
            C.d0 r7 = C.l0.a(r7, r8)
            r9.f943j = r7
            C.f0 r2 = C.h0.h(r4, r2)
            C.f0 r1 = C.h0.h(r2, r1)
            r9.f944k = r1
            C.f0 r2 = C.h0.h(r6, r3)
            C.f0 r2 = C.h0.h(r2, r5)
            C.f0 r2 = C.h0.h(r2, r7)
            r9.f945l = r2
            C.f0 r1 = C.h0.h(r1, r2)
            r9.f946m = r1
            int r1 = androidx.core.view.D0.n.a()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f947n = r1
            int r1 = androidx.core.view.D0.n.f()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f948o = r1
            int r1 = androidx.core.view.D0.n.g()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f949p = r1
            int r1 = androidx.core.view.D0.n.h()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f950q = r1
            int r1 = androidx.core.view.D0.n.j()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f951r = r1
            int r1 = androidx.core.view.D0.n.c()
            java.lang.String r2 = "imeAnimationTarget"
            C.d0 r1 = r0.f(r10, r1, r2)
            r9.f952s = r1
            int r1 = androidx.core.view.D0.n.c()
            java.lang.String r2 = "imeAnimationSource"
            C.d0 r10 = r0.f(r10, r1, r2)
            r9.f953t = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x0107
            android.view.View r10 = (android.view.View) r10
            goto L_0x0108
        L_0x0107:
            r10 = r0
        L_0x0108:
            if (r10 == 0) goto L_0x0111
            int r11 = k0.m.f23100I
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x0112
        L_0x0111:
            r10 = r0
        L_0x0112:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0119
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0119:
            if (r0 == 0) goto L_0x0120
            boolean r10 = r0.booleanValue()
            goto L_0x0121
        L_0x0120:
            r10 = 1
        L_0x0121:
            r9.f954u = r10
            C.D r10 = new C.D
            r10.<init>(r9)
            r9.f956w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.g0.<init>(androidx.core.view.D0, android.view.View):void");
    }
}

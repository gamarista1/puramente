package androidx.compose.ui.platform;

import J0.C1239e0;
import J0.C1245k;
import J0.C1254u;
import J0.G;
import J0.m0;
import O0.e;
import O0.g;
import O0.u;
import Q0.C1321d;
import Q0.L;
import Q0.Q;
import Y0.t;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.A;
import androidx.collection.C;
import androidx.collection.C1588b;
import androidx.collection.C1599m;
import androidx.collection.C1600n;
import androidx.collection.C1601o;
import androidx.collection.C1602p;
import androidx.collection.D;
import androidx.collection.H;
import androidx.collection.O;
import androidx.collection.Z;
import androidx.core.view.C1677a;
import com.google.android.gms.common.api.a;
import e1.C1942a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import qf.C6658d;
import r0.Z1;
import y1.B;
import y1.C2930A;
import yf.C6787a;
import yf.C6798l;

/* renamed from: androidx.compose.ui.platform.x  reason: case insensitive filesystem */
public final class C1671x extends C1677a {

    /* renamed from: L  reason: collision with root package name */
    public static final d f14012L = new d((DefaultConstructorMarker) null);

    /* renamed from: M  reason: collision with root package name */
    public static final int f14013M = 8;

    /* renamed from: N  reason: collision with root package name */
    private static final C1599m f14014N = C1600n.a(k0.m.f23104a, k0.m.f23105b, k0.m.f23116m, k0.m.f23127x, k0.m.f23092A, k0.m.f23093B, k0.m.f23094C, k0.m.f23095D, k0.m.f23096E, k0.m.f23097F, k0.m.f23106c, k0.m.f23107d, k0.m.f23108e, k0.m.f23109f, k0.m.f23110g, k0.m.f23111h, k0.m.f23112i, k0.m.f23113j, k0.m.f23114k, k0.m.f23115l, k0.m.f23117n, k0.m.f23118o, k0.m.f23119p, k0.m.f23120q, k0.m.f23121r, k0.m.f23122s, k0.m.f23123t, k0.m.f23124u, k0.m.f23125v, k0.m.f23126w, k0.m.f23128y, k0.m.f23129z);

    /* renamed from: A  reason: collision with root package name */
    private A f14015A;

    /* renamed from: B  reason: collision with root package name */
    private A f14016B;

    /* renamed from: C  reason: collision with root package name */
    private final String f14017C;

    /* renamed from: D  reason: collision with root package name */
    private final String f14018D;

    /* renamed from: E  reason: collision with root package name */
    private final t f14019E;

    /* renamed from: F  reason: collision with root package name */
    private C f14020F;

    /* renamed from: G  reason: collision with root package name */
    private C1639i1 f14021G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f14022H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final Runnable f14023I;

    /* renamed from: J  reason: collision with root package name */
    private final List f14024J;

    /* renamed from: K  reason: collision with root package name */
    private final C6798l f14025K;

    /* renamed from: a  reason: collision with root package name */
    private final r f14026a;

    /* renamed from: b  reason: collision with root package name */
    private int f14027b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private C6798l f14028c = new m(this);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityManager f14029d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14030e;

    /* renamed from: f  reason: collision with root package name */
    private long f14031f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f14032g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f14033h;

    /* renamed from: i  reason: collision with root package name */
    private List f14034i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Handler f14035j;

    /* renamed from: k  reason: collision with root package name */
    private e f14036k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f14037l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public C2930A f14038m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f14039n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C f14040o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C f14041p;

    /* renamed from: q  reason: collision with root package name */
    private Z f14042q;

    /* renamed from: r  reason: collision with root package name */
    private Z f14043r;

    /* renamed from: s  reason: collision with root package name */
    private int f14044s;

    /* renamed from: t  reason: collision with root package name */
    private Integer f14045t;

    /* renamed from: u  reason: collision with root package name */
    private final C1588b f14046u;

    /* renamed from: v  reason: collision with root package name */
    private final Wg.d f14047v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14048w;

    /* renamed from: x  reason: collision with root package name */
    private g f14049x;

    /* renamed from: y  reason: collision with root package name */
    private C1601o f14050y;

    /* renamed from: z  reason: collision with root package name */
    private D f14051z;

    /* renamed from: androidx.compose.ui.platform.x$a */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1671x f14052a;

        a(C1671x xVar) {
            this.f14052a = xVar;
        }

        public void onViewAttachedToWindow(View view) {
            AccessibilityManager j10 = this.f14052a.f14029d;
            C1671x xVar = this.f14052a;
            j10.addAccessibilityStateChangeListener(xVar.f14032g);
            j10.addTouchExplorationStateChangeListener(xVar.f14033h);
        }

        public void onViewDetachedFromWindow(View view) {
            this.f14052a.f14035j.removeCallbacks(this.f14052a.f14023I);
            AccessibilityManager j10 = this.f14052a.f14029d;
            C1671x xVar = this.f14052a;
            j10.removeAccessibilityStateChangeListener(xVar.f14032g);
            j10.removeTouchExplorationStateChangeListener(xVar.f14033h);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14053a = new b();

        private b() {
        }

        public static final void a(C2930A a10, O0.n nVar) {
            O0.a aVar;
            if (A.h(nVar) && (aVar = (O0.a) O0.k.a(nVar.w(), O0.i.f4556a.w())) != null) {
                a10.b(new C2930A.a(16908349, aVar.b()));
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14054a = new c();

        private c() {
        }

        public static final void a(C2930A a10, O0.n nVar) {
            if (A.h(nVar)) {
                O0.j w10 = nVar.w();
                O0.i iVar = O0.i.f4556a;
                O0.a aVar = (O0.a) O0.k.a(w10, iVar.q());
                if (aVar != null) {
                    a10.b(new C2930A.a(16908358, aVar.b()));
                }
                O0.a aVar2 = (O0.a) O0.k.a(nVar.w(), iVar.n());
                if (aVar2 != null) {
                    a10.b(new C2930A.a(16908359, aVar2.b()));
                }
                O0.a aVar3 = (O0.a) O0.k.a(nVar.w(), iVar.o());
                if (aVar3 != null) {
                    a10.b(new C2930A.a(16908360, aVar3.b()));
                }
                O0.a aVar4 = (O0.a) O0.k.a(nVar.w(), iVar.p());
                if (aVar4 != null) {
                    a10.b(new C2930A.a(16908361, aVar4.b()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$e */
    private final class e extends B {
        public e() {
        }

        public void a(int i10, C2930A a10, String str, Bundle bundle) {
            C1671x.this.z(i10, a10, str, bundle);
        }

        public C2930A b(int i10) {
            C2930A i11 = C1671x.this.H(i10);
            C1671x xVar = C1671x.this;
            if (xVar.f14039n && i10 == xVar.f14037l) {
                xVar.f14038m = i11;
            }
            return i11;
        }

        public C2930A d(int i10) {
            return b(C1671x.this.f14037l);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return C1671x.this.k0(i10, i11, bundle);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$f */
    private static final class f implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final f f14056a = new f();

        private f() {
        }

        /* renamed from: a */
        public int compare(O0.n nVar, O0.n nVar2) {
            C2423i j10 = nVar.j();
            C2423i j11 = nVar2.j();
            int compare = Float.compare(j10.i(), j11.i());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j10.l(), j11.l());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j10.e(), j11.e());
            if (compare3 != 0) {
                return compare3;
            }
            return Float.compare(j10.j(), j11.j());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final O0.n f14057a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14058b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14059c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14060d;

        /* renamed from: e  reason: collision with root package name */
        private final int f14061e;

        /* renamed from: f  reason: collision with root package name */
        private final long f14062f;

        public g(O0.n nVar, int i10, int i11, int i12, int i13, long j10) {
            this.f14057a = nVar;
            this.f14058b = i10;
            this.f14059c = i11;
            this.f14060d = i12;
            this.f14061e = i13;
            this.f14062f = j10;
        }

        public final int a() {
            return this.f14058b;
        }

        public final int b() {
            return this.f14060d;
        }

        public final int c() {
            return this.f14059c;
        }

        public final O0.n d() {
            return this.f14057a;
        }

        public final int e() {
            return this.f14061e;
        }

        public final long f() {
            return this.f14062f;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$h */
    private static final class h implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final h f14063a = new h();

        private h() {
        }

        /* renamed from: a */
        public int compare(O0.n nVar, O0.n nVar2) {
            C2423i j10 = nVar.j();
            C2423i j11 = nVar2.j();
            int compare = Float.compare(j11.j(), j10.j());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j10.l(), j11.l());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j10.e(), j11.e());
            if (compare3 != 0) {
                return compare3;
            }
            return Float.compare(j11.i(), j10.i());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$i */
    private static final class i implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final i f14064a = new i();

        private i() {
        }

        /* renamed from: a */
        public int compare(Pair pair, Pair pair2) {
            int compare = Float.compare(((C2423i) pair.c()).l(), ((C2423i) pair2.c()).l());
            if (compare != 0) {
                return compare;
            }
            return Float.compare(((C2423i) pair.c()).e(), ((C2423i) pair2.c()).e());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$j */
    public /* synthetic */ class j {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14065a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                P0.a[] r0 = P0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                P0.a r1 = P0.a.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                P0.a r1 = P0.a.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                P0.a r1 = P0.a.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f14065a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1671x.j.<clinit>():void");
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f14066a;

        /* renamed from: b  reason: collision with root package name */
        Object f14067b;

        /* renamed from: c  reason: collision with root package name */
        Object f14068c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14069d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1671x f14070e;

        /* renamed from: f  reason: collision with root package name */
        int f14071f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C1671x xVar, C6658d dVar) {
            super(dVar);
            this.f14070e = xVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14069d = obj;
            this.f14071f |= Integer.MIN_VALUE;
            return this.f14070e.B(this);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$l */
    static final class l extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f14072a = new l();

        l() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$m */
    static final class m extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1671x f14073a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C1671x xVar) {
            super(1);
            this.f14073a = xVar;
        }

        /* renamed from: a */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.f14073a.a0().getParent().requestSendAccessibilityEvent(this.f14073a.a0(), accessibilityEvent));
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$n */
    static final class n extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1636h1 f14074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1671x f14075b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C1636h1 h1Var, C1671x xVar) {
            super(0);
            this.f14074a = h1Var;
            this.f14075b = xVar;
        }

        public final void invoke() {
            O0.n b10;
            G q10;
            O0.h a10 = this.f14074a.a();
            O0.h e10 = this.f14074a.e();
            Float b11 = this.f14074a.b();
            Float c10 = this.f14074a.c();
            float floatValue = (a10 == null || b11 == null) ? 0.0f : ((Number) a10.c().invoke()).floatValue() - b11.floatValue();
            float floatValue2 = (e10 == null || c10 == null) ? 0.0f : ((Number) e10.c().invoke()).floatValue() - c10.floatValue();
            if (!(floatValue == 0.0f && floatValue2 == 0.0f)) {
                int x10 = this.f14075b.u0(this.f14074a.d());
                C1642j1 j1Var = (C1642j1) this.f14075b.P().c(this.f14075b.f14037l);
                if (j1Var != null) {
                    C1671x xVar = this.f14075b;
                    try {
                        C2930A l10 = xVar.f14038m;
                        if (l10 != null) {
                            l10.q0(xVar.A(j1Var));
                            C6514M m10 = C6514M.f71813a;
                        }
                    } catch (IllegalStateException unused) {
                        C6514M m11 = C6514M.f71813a;
                    }
                }
                this.f14075b.a0().invalidate();
                C1642j1 j1Var2 = (C1642j1) this.f14075b.P().c(x10);
                if (!(j1Var2 == null || (b10 = j1Var2.b()) == null || (q10 = b10.q()) == null)) {
                    C1671x xVar2 = this.f14075b;
                    if (a10 != null) {
                        xVar2.f14040o.t(x10, a10);
                    }
                    if (e10 != null) {
                        xVar2.f14041p.t(x10, e10);
                    }
                    xVar2.h0(q10);
                }
            }
            if (a10 != null) {
                this.f14074a.g((Float) a10.c().invoke());
            }
            if (e10 != null) {
                this.f14074a.h((Float) e10.c().invoke());
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$o */
    static final class o extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1671x f14076a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C1671x xVar) {
            super(1);
            this.f14076a = xVar;
        }

        public final void a(C1636h1 h1Var) {
            this.f14076a.s0(h1Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1636h1) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$p */
    static final class p extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final p f14077a = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            O0.j I10 = g10.I();
            boolean z10 = false;
            if (I10 != null && I10.z()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$q */
    static final class q extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final q f14078a = new q();

        q() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.j0().q(C1239e0.a(8)));
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$r */
    static final class r extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final r f14079a = new r();

        /* renamed from: androidx.compose.ui.platform.x$r$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14080a = new a();

            a() {
                super(0);
            }

            /* renamed from: a */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: androidx.compose.ui.platform.x$r$b */
        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f14081a = new b();

            b() {
                super(0);
            }

            /* renamed from: a */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        r() {
            super(2);
        }

        /* renamed from: a */
        public final Integer invoke(O0.n nVar, O0.n nVar2) {
            O0.j w10 = nVar.w();
            O0.q qVar = O0.q.f4613a;
            return Integer.valueOf(Float.compare(((Number) w10.t(qVar.H(), a.f14080a)).floatValue(), ((Number) nVar2.w().t(qVar.H(), b.f14081a)).floatValue()));
        }
    }

    public C1671x(r rVar) {
        this.f14026a = rVar;
        Object systemService = rVar.getContext().getSystemService("accessibility");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f14029d = accessibilityManager;
        this.f14031f = 100;
        this.f14032g = new C1665u(this);
        this.f14033h = new C1667v(this);
        this.f14034i = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f14035j = new Handler(Looper.getMainLooper());
        this.f14036k = new e();
        this.f14037l = Integer.MIN_VALUE;
        this.f14040o = new C(0, 1, (DefaultConstructorMarker) null);
        this.f14041p = new C(0, 1, (DefaultConstructorMarker) null);
        this.f14042q = new Z(0, 1, (DefaultConstructorMarker) null);
        this.f14043r = new Z(0, 1, (DefaultConstructorMarker) null);
        this.f14044s = -1;
        this.f14046u = new C1588b(0, 1, (DefaultConstructorMarker) null);
        this.f14047v = Wg.g.b(1, (Wg.a) null, (C6798l) null, 6, (Object) null);
        this.f14048w = true;
        this.f14050y = C1602p.a();
        this.f14051z = new D(0, 1, (DefaultConstructorMarker) null);
        this.f14015A = new A(0, 1, (DefaultConstructorMarker) null);
        this.f14016B = new A(0, 1, (DefaultConstructorMarker) null);
        this.f14017C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f14018D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f14019E = new t();
        this.f14020F = C1602p.b();
        this.f14021G = new C1639i1(rVar.getSemanticsOwner().a(), C1602p.a());
        rVar.addOnAttachStateChangeListener(new a(this));
        this.f14023I = new C1669w(this);
        this.f14024J = new ArrayList();
        this.f14025K = new o(this);
    }

    /* access modifiers changed from: private */
    public final Rect A(C1642j1 j1Var) {
        Rect a10 = j1Var.a();
        long u10 = this.f14026a.u(C2422h.a((float) a10.left, (float) a10.top));
        long u11 = this.f14026a.u(C2422h.a((float) a10.right, (float) a10.bottom));
        return new Rect((int) ((float) Math.floor((double) C2421g.m(u10))), (int) ((float) Math.floor((double) C2421g.n(u10))), (int) ((float) Math.ceil((double) C2421g.m(u11))), (int) ((float) Math.ceil((double) C2421g.n(u11))));
    }

    private final void A0(int i10) {
        g gVar = this.f14049x;
        if (gVar != null) {
            if (i10 == gVar.d().o()) {
                if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                    AccessibilityEvent G10 = G(u0(gVar.d().o()), 131072);
                    G10.setFromIndex(gVar.b());
                    G10.setToIndex(gVar.e());
                    G10.setAction(gVar.a());
                    G10.setMovementGranularity(gVar.c());
                    G10.getText().add(X(gVar.d()));
                    w0(G10);
                }
            } else {
                return;
            }
        }
        this.f14049x = null;
    }

    /* JADX WARNING: type inference failed for: r1v48, types: [Q0.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0560, code lost:
        if (r0.containsAll(r2) != false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05c9, code lost:
        if (androidx.compose.ui.platform.A.g((O0.a) r1, O0.k.a(r18.b(), (O0.u) r0.getKey())) == false) goto L_0x0566;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void B0(androidx.collection.C1601o r37) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List r0 = r7.f14024J
            java.util.Collection r0 = (java.util.Collection) r0
            r10.<init>(r0)
            java.util.List r0 = r7.f14024J
            r0.clear()
            int[] r11 = r8.f12189b
            long[] r12 = r8.f12188a
            int r0 = r12.length
            r13 = 2
            int r14 = r0 + -2
            if (r14 < 0) goto L_0x0653
            r6 = 0
        L_0x001d:
            r0 = r12[r6]
            long r2 = ~r0
            r4 = 7
            long r2 = r2 << r4
            long r2 = r2 & r0
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x063a
            int r2 = r6 - r14
            int r2 = ~r2
            int r2 = r2 >>> 31
            r5 = 8
            int r4 = 8 - r2
            r16 = r0
            r3 = 0
        L_0x0039:
            if (r3 >= r4) goto L_0x062b
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r16 & r0
            r18 = 128(0x80, double:6.32E-322)
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x060b
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r11[r0]
            androidx.collection.C r0 = r7.f14020F
            java.lang.Object r0 = r0.c(r2)
            r18 = r0
            androidx.compose.ui.platform.i1 r18 = (androidx.compose.ui.platform.C1639i1) r18
            if (r18 != 0) goto L_0x0058
            goto L_0x060b
        L_0x0058:
            java.lang.Object r0 = r8.c(r2)
            androidx.compose.ui.platform.j1 r0 = (androidx.compose.ui.platform.C1642j1) r0
            r19 = 0
            if (r0 == 0) goto L_0x0068
            O0.n r0 = r0.b()
            r1 = r0
            goto L_0x006a
        L_0x0068:
            r1 = r19
        L_0x006a:
            if (r1 == 0) goto L_0x0600
            O0.j r0 = r1.w()
            java.util.Iterator r20 = r0.iterator()
            r21 = 0
        L_0x0076:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x05cc
            java.lang.Object r0 = r20.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            O0.q r22 = O0.q.f4613a
            O0.u r9 = r22.k()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r13, r9)
            if (r9 != 0) goto L_0x00a3
            java.lang.Object r9 = r0.getKey()
            O0.u r13 = r22.I()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r9 = 0
            goto L_0x00a7
        L_0x00a3:
            boolean r9 = r7.q0(r2, r10)
        L_0x00a7:
            if (r9 != 0) goto L_0x00d4
            java.lang.Object r9 = r0.getValue()
            O0.j r13 = r18.b()
            java.lang.Object r23 = r0.getKey()
            r15 = r23
            O0.u r15 = (O0.u) r15
            java.lang.Object r13 = O0.k.a(r13, r15)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 == 0) goto L_0x00d4
        L_0x00c3:
            r25 = r1
            r8 = r2
            r23 = r3
            r13 = r4
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = 2
            r11 = r5
            goto L_0x0568
        L_0x00d4:
            java.lang.Object r9 = r0.getKey()
            O0.u r9 = (O0.u) r9
            O0.u r13 = r22.v()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r13 == 0) goto L_0x0101
            java.lang.Object r0 = r0.getValue()
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C6496s.f(r0, r9)
            java.lang.String r0 = (java.lang.String) r0
            O0.j r9 = r18.b()
            O0.u r13 = r22.v()
            boolean r9 = r9.g(r13)
            if (r9 == 0) goto L_0x00c3
            r7.z0(r2, r5, r0)
            goto L_0x00c3
        L_0x0101:
            O0.u r13 = r22.B()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r13 == 0) goto L_0x010d
            r13 = 1
            goto L_0x0115
        L_0x010d:
            O0.u r13 = r22.G()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
        L_0x0115:
            r15 = 64
            if (r13 == 0) goto L_0x015e
            int r9 = r7.u0(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r15 = 8
            r22 = 0
            r23 = 2048(0x800, float:2.87E-42)
            r24 = 0
            r0 = r36
            r25 = r1
            r1 = r9
            r9 = r2
            r2 = r23
            r23 = r3
            r3 = r13
            r13 = r4
            r4 = r24
            r5 = r15
            r15 = r6
            r6 = r22
            y0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.u0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            r8 = r9
        L_0x0153:
            r24 = r10
            r26 = r11
            r27 = r12
        L_0x0159:
            r10 = 2
        L_0x015a:
            r11 = 8
            goto L_0x0568
        L_0x015e:
            r25 = r1
            r5 = r2
            r23 = r3
            r13 = r4
            O0.u r1 = r22.x()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r7.u0(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r9 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r26 = r5
            r5 = r9
            r9 = r6
            r6 = r15
            y0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r26
            int r1 = r7.u0(r15)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            r24 = r10
            r26 = r11
            r27 = r12
            r8 = r15
            r10 = 2
            r11 = 8
            r15 = r9
            goto L_0x0568
        L_0x01a6:
            O0.u r1 = r22.A()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            r2 = 4
            if (r1 == 0) goto L_0x02a9
            O0.j r0 = r25.w()
            O0.u r1 = r22.y()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.g r0 = (O0.g) r0
            O0.g$a r1 = O0.g.f4539b
            int r1 = r1.g()
            if (r0 != 0) goto L_0x01c9
            r0 = 0
            goto L_0x01d1
        L_0x01c9:
            int r0 = r0.n()
            boolean r0 = O0.g.k(r0, r1)
        L_0x01d1:
            if (r0 == 0) goto L_0x0280
            O0.j r0 = r25.w()
            O0.u r1 = r22.A()
            java.lang.Object r0 = O0.k.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r0 == 0) goto L_0x025c
            int r0 = r7.u0(r5)
            android.view.accessibility.AccessibilityEvent r0 = r7.G(r0, r2)
            O0.n r1 = r25.a()
            O0.j r2 = r1.n()
            O0.u r3 = r22.d()
            java.lang.Object r2 = O0.k.a(r2, r3)
            r26 = r2
            java.util.List r26 = (java.util.List) r26
            if (r26 == 0) goto L_0x021a
            r33 = 62
            r34 = 0
            java.lang.String r27 = ","
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            java.lang.String r2 = e1.C1942a.e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x021c
        L_0x021a:
            r2 = r19
        L_0x021c:
            O0.j r1 = r1.n()
            O0.u r3 = r22.D()
            java.lang.Object r1 = O0.k.a(r1, r3)
            r26 = r1
            java.util.List r26 = (java.util.List) r26
            if (r26 == 0) goto L_0x0243
            r33 = 62
            r34 = 0
            java.lang.String r27 = ","
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            java.lang.String r1 = e1.C1942a.e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0245
        L_0x0243:
            r1 = r19
        L_0x0245:
            if (r2 == 0) goto L_0x024c
            r0.setContentDescription(r2)
            lf.M r2 = lf.C6514M.f71813a
        L_0x024c:
            if (r1 == 0) goto L_0x0255
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x0255:
            r7.w0(r0)
            r8 = r5
            r15 = r6
            goto L_0x0153
        L_0x025c:
            int r1 = r7.u0(r5)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r9 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r35 = r5
            r5 = r9
            r9 = r6
            r6 = r15
            y0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r9
            r24 = r10
            r26 = r11
            r27 = r12
            r8 = r35
            goto L_0x0159
        L_0x0280:
            r9 = r6
            r6 = r5
            int r1 = r7.u0(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r5 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r8 = r6
            r6 = r15
            y0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.u0(r8)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r9
            goto L_0x0153
        L_0x02a9:
            r8 = r5
            r15 = r6
            O0.u r1 = r22.d()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            if (r1 == 0) goto L_0x02cf
            int r1 = r7.u0(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.C6496s.f(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r3 = 2048(0x800, float:2.87E-42)
            r7.x0(r1, r3, r2, r0)
            goto L_0x0153
        L_0x02cf:
            O0.u r1 = r22.g()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            r2 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0413
            O0.j r0 = r25.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.y()
            boolean r0 = r0.g(r1)
            if (r0 == 0) goto L_0x03f7
            O0.j r0 = r18.b()
            Q0.d r0 = r7.Z(r0)
            if (r0 == 0) goto L_0x02f9
            goto L_0x02fa
        L_0x02f9:
            r0 = r3
        L_0x02fa:
            O0.j r1 = r25.w()
            Q0.d r1 = r7.Z(r1)
            if (r1 == 0) goto L_0x0305
            r3 = r1
        L_0x0305:
            java.lang.CharSequence r5 = r7.T0(r3, r2)
            int r1 = r0.length()
            int r2 = r3.length()
            int r4 = Ef.m.h(r1, r2)
            r6 = 0
        L_0x0316:
            if (r6 >= r4) goto L_0x032b
            char r9 = r0.charAt(r6)
            r24 = r10
            char r10 = r3.charAt(r6)
            if (r9 == r10) goto L_0x0326
        L_0x0324:
            r9 = 1
            goto L_0x032e
        L_0x0326:
            r9 = 1
            int r6 = r6 + r9
            r10 = r24
            goto L_0x0316
        L_0x032b:
            r24 = r10
            goto L_0x0324
        L_0x032e:
            r26 = r11
            r10 = 0
        L_0x0331:
            int r11 = r4 - r6
            if (r10 >= r11) goto L_0x034a
            int r11 = r1 + -1
            int r11 = r11 - r10
            char r11 = r0.charAt(r11)
            int r22 = r2 + -1
            int r9 = r22 - r10
            char r9 = r3.charAt(r9)
            if (r11 == r9) goto L_0x0347
            goto L_0x034a
        L_0x0347:
            r9 = 1
            int r10 = r10 + r9
            goto L_0x0331
        L_0x034a:
            int r1 = r1 - r10
            int r1 = r1 - r6
            int r3 = r2 - r10
            int r3 = r3 - r6
            O0.j r4 = r18.b()
            O0.q r9 = O0.q.f4613a
            O0.u r10 = r9.w()
            boolean r4 = r4.g(r10)
            O0.j r10 = r25.w()
            O0.u r11 = r9.w()
            boolean r10 = r10.g(r11)
            O0.j r11 = r18.b()
            r27 = r12
            O0.u r12 = r9.g()
            boolean r11 = r11.g(r12)
            if (r11 == 0) goto L_0x037f
            if (r4 != 0) goto L_0x037f
            if (r10 == 0) goto L_0x037f
            r12 = 1
            goto L_0x0380
        L_0x037f:
            r12 = 0
        L_0x0380:
            if (r11 == 0) goto L_0x0388
            if (r4 == 0) goto L_0x0388
            if (r10 != 0) goto L_0x0388
            r10 = 1
            goto L_0x0389
        L_0x0388:
            r10 = 0
        L_0x0389:
            if (r12 != 0) goto L_0x03ac
            if (r10 == 0) goto L_0x038e
            goto L_0x03ac
        L_0x038e:
            int r2 = r7.u0(r8)
            r4 = 16
            android.view.accessibility.AccessibilityEvent r2 = r7.G(r2, r4)
            r2.setFromIndex(r6)
            r2.setRemovedCount(r1)
            r2.setAddedCount(r3)
            r2.setBeforeText(r0)
            java.util.List r0 = r2.getText()
            r0.add(r5)
            goto L_0x03c6
        L_0x03ac:
            int r1 = r7.u0(r8)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r0 = r36
            r2 = r3
            r3 = r4
            r4 = r6
            android.view.accessibility.AccessibilityEvent r2 = r0.J(r1, r2, r3, r4, r5)
        L_0x03c6:
            java.lang.String r0 = "android.widget.EditText"
            r2.setClassName(r0)
            r7.w0(r2)
            if (r12 != 0) goto L_0x03d2
            if (r10 == 0) goto L_0x0159
        L_0x03d2:
            O0.j r0 = r25.w()
            O0.u r1 = r9.E()
            java.lang.Object r0 = r0.r(r1)
            Q0.Q r0 = (Q0.Q) r0
            long r0 = r0.r()
            int r3 = Q0.Q.n(r0)
            r2.setFromIndex(r3)
            int r0 = Q0.Q.i(r0)
            r2.setToIndex(r0)
            r7.w0(r2)
            goto L_0x0159
        L_0x03f7:
            r24 = r10
            r26 = r11
            r27 = r12
            int r1 = r7.u0(r8)
            r10 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x015a
        L_0x0413:
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = 2
            O0.u r1 = r22.E()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            if (r1 == 0) goto L_0x047f
            O0.j r0 = r25.w()
            Q0.d r0 = r7.Z(r0)
            if (r0 == 0) goto L_0x0436
            java.lang.String r0 = r0.j()
            if (r0 != 0) goto L_0x0435
            goto L_0x0436
        L_0x0435:
            r3 = r0
        L_0x0436:
            O0.j r0 = r25.w()
            O0.u r1 = r22.E()
            java.lang.Object r0 = r0.r(r1)
            Q0.Q r0 = (Q0.Q) r0
            long r0 = r0.r()
            int r4 = r7.u0(r8)
            int r5 = Q0.Q.n(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = Q0.Q.i(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r3.length()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r11 = r7.T0(r3, r2)
            r0 = r36
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r11
            android.view.accessibility.AccessibilityEvent r0 = r0.J(r1, r2, r3, r4, r5)
            r7.w0(r0)
            int r0 = r25.o()
            r7.A0(r0)
            goto L_0x015a
        L_0x047f:
            O0.u r1 = r22.k()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            if (r1 == 0) goto L_0x048b
            r1 = 1
            goto L_0x0493
        L_0x048b:
            O0.u r1 = r22.I()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
        L_0x0493:
            if (r1 == 0) goto L_0x04cc
            J0.G r0 = r25.q()
            r7.h0(r0)
            java.util.List r0 = r7.f14024J
            androidx.compose.ui.platform.h1 r0 = androidx.compose.ui.platform.C1645k1.a(r0, r8)
            kotlin.jvm.internal.C6496s.e(r0)
            O0.j r1 = r25.w()
            O0.u r2 = r22.k()
            java.lang.Object r1 = O0.k.a(r1, r2)
            O0.h r1 = (O0.h) r1
            r0.f(r1)
            O0.j r1 = r25.w()
            O0.u r2 = r22.I()
            java.lang.Object r1 = O0.k.a(r1, r2)
            O0.h r1 = (O0.h) r1
            r0.i(r1)
            r7.s0(r0)
            goto L_0x015a
        L_0x04cc:
            O0.u r1 = r22.i()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r9, r1)
            if (r1 == 0) goto L_0x0514
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04f9
            int r0 = r25.o()
            int r0 = r7.u0(r0)
            r11 = 8
            android.view.accessibility.AccessibilityEvent r0 = r7.G(r0, r11)
            r7.w0(r0)
            goto L_0x04fb
        L_0x04f9:
            r11 = 8
        L_0x04fb:
            int r0 = r25.o()
            int r1 = r7.u0(r0)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0568
        L_0x0514:
            r11 = 8
            O0.i r1 = O0.i.f4556a
            O0.u r2 = r1.d()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r9, r2)
            if (r2 == 0) goto L_0x05a4
            O0.j r0 = r25.w()
            O0.u r2 = r1.d()
            java.lang.Object r0 = r0.r(r2)
            java.util.List r0 = (java.util.List) r0
            O0.j r2 = r18.b()
            O0.u r1 = r1.d()
            java.lang.Object r1 = O0.k.a(r2, r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x058d
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            if (r3 > 0) goto L_0x0584
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            if (r3 > 0) goto L_0x057b
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x0566
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x0563
            goto L_0x0566
        L_0x0563:
            r21 = 0
            goto L_0x0568
        L_0x0566:
            r21 = 1
        L_0x0568:
            r2 = r8
            r5 = r11
            r4 = r13
            r6 = r15
            r3 = r23
            r1 = r25
            r11 = r26
            r12 = r27
        L_0x0574:
            r8 = r37
            r13 = r10
            r10 = r24
            goto L_0x0076
        L_0x057b:
            r2 = 0
            java.lang.Object r0 = r1.get(r2)
            android.support.v4.media.session.c.a(r0)
            throw r19
        L_0x0584:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            android.support.v4.media.session.c.a(r0)
            throw r19
        L_0x058d:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0568
            r2 = r8
            r5 = r11
            r4 = r13
            r6 = r15
            r3 = r23
            r1 = r25
            r11 = r26
            r12 = r27
            r21 = 1
            goto L_0x0574
        L_0x05a4:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof O0.a
            if (r1 == 0) goto L_0x0566
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            kotlin.jvm.internal.C6496s.f(r1, r2)
            O0.a r1 = (O0.a) r1
            O0.j r2 = r18.b()
            java.lang.Object r0 = r0.getKey()
            O0.u r0 = (O0.u) r0
            java.lang.Object r0 = O0.k.a(r2, r0)
            boolean r0 = androidx.compose.ui.platform.A.g(r1, r0)
            if (r0 != 0) goto L_0x0563
            goto L_0x0566
        L_0x05cc:
            r25 = r1
            r8 = r2
            r23 = r3
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r13 = r4
            r11 = r5
            if (r21 != 0) goto L_0x05e7
            O0.j r0 = r18.b()
            r1 = r25
            boolean r21 = androidx.compose.ui.platform.A.l(r1, r0)
        L_0x05e7:
            if (r21 == 0) goto L_0x05fe
            int r1 = r7.u0(r8)
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            y0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0618
        L_0x05fe:
            r8 = 0
            goto L_0x0618
        L_0x0600:
            java.lang.String r0 = "no value for specified key"
            G0.a.c(r0)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x060b:
            r23 = r3
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r8 = 0
            r13 = r4
            r11 = r5
        L_0x0618:
            long r16 = r16 >> r11
            r0 = 1
            int r3 = r23 + 1
            r8 = r37
            r5 = r11
            r4 = r13
            r6 = r15
            r11 = r26
            r12 = r27
            r13 = r10
            r10 = r24
            goto L_0x0039
        L_0x062b:
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r0 = 1
            r8 = 0
            r13 = r4
            r11 = r5
            if (r13 != r11) goto L_0x0653
            goto L_0x0644
        L_0x063a:
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r0 = 1
            r8 = 0
        L_0x0644:
            if (r15 == r14) goto L_0x0653
            int r6 = r15 + 1
            r8 = r37
            r13 = r10
            r10 = r24
            r11 = r26
            r12 = r27
            goto L_0x001d
        L_0x0653:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1671x.B0(androidx.collection.o):void");
    }

    private final void C0(G g10, D d10) {
        O0.j I10;
        G d11;
        if (g10.J0() && !this.f14026a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            if (!g10.j0().q(C1239e0.a(8))) {
                g10 = A.j(g10, q.f14078a);
            }
            if (g10 != null && (I10 = g10.I()) != null) {
                if (!I10.z() && (d11 = A.j(g10, p.f14077a)) != null) {
                    g10 = d11;
                }
                int p02 = g10.p0();
                if (d10.f(p02)) {
                    y0(this, u0(p02), 2048, 1, (List) null, 8, (Object) null);
                }
            }
        }
    }

    private final boolean D(C1601o oVar, boolean z10, int i10, long j10) {
        u uVar;
        boolean z11;
        O0.h hVar;
        int i11;
        C1601o oVar2 = oVar;
        boolean z12 = z10;
        int i12 = i10;
        long j11 = j10;
        if (C2421g.j(j11, C2421g.f25320b.b()) || !C2421g.p(j10)) {
            return false;
        }
        if (z12) {
            uVar = O0.q.f4613a.I();
        } else if (!z12) {
            uVar = O0.q.f4613a.k();
        } else {
            throw new C6535s();
        }
        Object[] objArr = oVar2.f12190c;
        long[] jArr = oVar2.f12188a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            boolean z13 = false;
            while (true) {
                long j12 = jArr[i13];
                if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j12 & 255) < 128) {
                            C1642j1 j1Var = (C1642j1) objArr[(i13 << 3) + i15];
                            if (Z1.e(j1Var.a()).b(j11) && (hVar = (O0.h) O0.k.a(j1Var.b().w(), uVar)) != null) {
                                if (hVar.b()) {
                                    i11 = -i12;
                                } else {
                                    i11 = i12;
                                }
                                if (i12 == 0 && hVar.b()) {
                                    i11 = -1;
                                }
                                if (i11 < 0) {
                                    if (((Number) hVar.c().invoke()).floatValue() <= 0.0f) {
                                    }
                                } else if (((Number) hVar.c().invoke()).floatValue() >= ((Number) hVar.a().invoke()).floatValue()) {
                                }
                                z13 = true;
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i14 != 8) {
                        return z13;
                    }
                }
                if (i13 == length) {
                    z11 = z13;
                    break;
                }
                i13++;
            }
        } else {
            z11 = false;
        }
        return z11;
    }

    private final void D0(G g10) {
        if (g10.J0() && !this.f14026a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            int p02 = g10.p0();
            O0.h hVar = (O0.h) this.f14040o.c(p02);
            O0.h hVar2 = (O0.h) this.f14041p.c(p02);
            if (hVar != null || hVar2 != null) {
                AccessibilityEvent G10 = G(p02, 4096);
                if (hVar != null) {
                    G10.setScrollX((int) ((Number) hVar.c().invoke()).floatValue());
                    G10.setMaxScrollX((int) ((Number) hVar.a().invoke()).floatValue());
                }
                if (hVar2 != null) {
                    G10.setScrollY((int) ((Number) hVar2.c().invoke()).floatValue());
                    G10.setMaxScrollY((int) ((Number) hVar2.a().invoke()).floatValue());
                }
                w0(G10);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void E() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (e0()) {
                v0(this.f14026a.getSemanticsOwner().a(), this.f14021G);
            }
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                B0(P());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    V0();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    private final boolean E0(O0.n nVar, int i10, int i11, boolean z10) {
        String X10;
        Integer num;
        Integer num2;
        O0.j w10 = nVar.w();
        O0.i iVar = O0.i.f4556a;
        boolean z11 = false;
        if (w10.g(iVar.x()) && A.h(nVar)) {
            yf.q qVar = (yf.q) ((O0.a) nVar.w().r(iVar.x())).a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        } else if ((i10 == i11 && i11 == this.f14044s) || (X10 = X(nVar)) == null) {
            return false;
        } else {
            if (i10 < 0 || i10 != i11 || i11 > X10.length()) {
                i10 = -1;
            }
            this.f14044s = i10;
            if (X10.length() > 0) {
                z11 = true;
            }
            int u02 = u0(nVar.o());
            Integer num3 = null;
            if (z11) {
                num = Integer.valueOf(this.f14044s);
            } else {
                num = null;
            }
            if (z11) {
                num2 = Integer.valueOf(this.f14044s);
            } else {
                num2 = null;
            }
            if (z11) {
                num3 = Integer.valueOf(X10.length());
            }
            w0(J(u02, num, num2, num3, X10));
            A0(nVar.o());
            return true;
        }
    }

    private final boolean F(int i10) {
        if (!c0(i10)) {
            return false;
        }
        this.f14037l = Integer.MIN_VALUE;
        this.f14038m = null;
        this.f14026a.invalidate();
        y0(this, i10, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    private final void F0(O0.n nVar, C2930A a10) {
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.h())) {
            a10.y0(true);
            a10.B0((CharSequence) O0.k.a(nVar.w(), qVar.h()));
        }
    }

    private final AccessibilityEvent G(int i10, int i11) {
        C1642j1 j1Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f14026a.getContext().getPackageName());
        obtain.setSource(this.f14026a, i10);
        if (e0() && (j1Var = (C1642j1) P().c(i10)) != null) {
            obtain.setPassword(j1Var.b().w().g(O0.q.f4613a.w()));
        }
        return obtain;
    }

    private final void G0(O0.n nVar, C2930A a10) {
        a10.r0(U(nVar));
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y1.C2930A H(int r7) {
        /*
            r6 = this;
            androidx.compose.ui.platform.r r0 = r6.f14026a
            androidx.compose.ui.platform.r$b r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.v r0 = r0.a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.m r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.m$b r0 = r0.b()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.m$b r2 = androidx.lifecycle.C1790m.b.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            y1.A r0 = y1.C2930A.f0()
            androidx.collection.o r2 = r6.P()
            java.lang.Object r2 = r2.c(r7)
            androidx.compose.ui.platform.j1 r2 = (androidx.compose.ui.platform.C1642j1) r2
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x0031:
            O0.n r3 = r2.b()
            r4 = -1
            if (r7 != r4) goto L_0x0049
            androidx.compose.ui.platform.r r4 = r6.f14026a
            android.view.ViewParent r4 = r4.getParentForAccessibility()
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0045
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0045:
            r0.P0(r1)
            goto L_0x0074
        L_0x0049:
            O0.n r5 = r3.r()
            if (r5 == 0) goto L_0x0057
            int r1 = r5.o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0057:
            if (r1 == 0) goto L_0x0084
            int r1 = r1.intValue()
            androidx.compose.ui.platform.r r5 = r6.f14026a
            O0.p r5 = r5.getSemanticsOwner()
            O0.n r5 = r5.a()
            int r5 = r5.o()
            if (r1 != r5) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r1
        L_0x006f:
            androidx.compose.ui.platform.r r1 = r6.f14026a
            r0.Q0(r1, r4)
        L_0x0074:
            androidx.compose.ui.platform.r r1 = r6.f14026a
            r0.Z0(r1, r7)
            android.graphics.Rect r1 = r6.A(r2)
            r0.q0(r1)
            r6.n0(r7, r0, r3)
            return r0
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "semanticsNode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " has null parent"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            G0.a.c(r7)
            lf.k r7 = new lf.k
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1671x.H(int):y1.A");
    }

    private final String I(O0.n nVar) {
        Collection collection;
        CharSequence charSequence;
        O0.j n10 = nVar.a().n();
        O0.q qVar = O0.q.f4613a;
        Collection collection2 = (Collection) O0.k.a(n10, qVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) O0.k.a(n10, qVar.D())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) O0.k.a(n10, qVar.g())) == null || charSequence.length() == 0))) {
            return this.f14026a.getContext().getResources().getString(k0.n.f23137h);
        }
        return null;
    }

    private final void I0(O0.n nVar, C2930A a10) {
        a10.a1(V(nVar));
    }

    private final AccessibilityEvent J(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent G10 = G(i10, 8192);
        if (num != null) {
            G10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            G10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            G10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            G10.getText().add(charSequence);
        }
        return G10;
    }

    private final void J0(O0.n nVar, C2930A a10) {
        SpannableString spannableString;
        C1321d W10 = W(nVar);
        if (W10 != null) {
            spannableString = Q0(W10);
        } else {
            spannableString = null;
        }
        a10.b1(spannableString);
    }

    private final void K0() {
        O0.n nVar;
        this.f14015A.i();
        this.f14016B.i();
        C1642j1 j1Var = (C1642j1) P().c(-1);
        if (j1Var != null) {
            nVar = j1Var.b();
        } else {
            nVar = null;
        }
        C6496s.e(nVar);
        List O02 = O0(A.k(nVar), C6565s.t(nVar));
        int p10 = C6565s.p(O02);
        int i10 = 1;
        if (1 <= p10) {
            while (true) {
                int o10 = ((O0.n) O02.get(i10 - 1)).o();
                int o11 = ((O0.n) O02.get(i10)).o();
                this.f14015A.q(o10, o11);
                this.f14016B.q(o11, o10);
                if (i10 != p10) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void L(C1671x xVar, boolean z10) {
        List<AccessibilityServiceInfo> list;
        if (z10) {
            list = xVar.f14029d.getEnabledAccessibilityServiceList(-1);
        } else {
            list = C6565s.n();
        }
        xVar.f14034i = list;
    }

    private final List L0(boolean z10, ArrayList arrayList, C c10) {
        Comparator comparator;
        ArrayList arrayList2 = new ArrayList();
        int p10 = C6565s.p(arrayList);
        int i10 = 0;
        if (p10 >= 0) {
            int i11 = 0;
            while (true) {
                O0.n nVar = (O0.n) arrayList.get(i11);
                if (i11 == 0 || !N0(arrayList2, nVar)) {
                    arrayList2.add(new Pair(nVar.j(), C6565s.t(nVar)));
                }
                if (i11 == p10) {
                    break;
                }
                i11++;
            }
        }
        C6565s.C(arrayList2, i.f14064a);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            Pair pair = (Pair) arrayList2.get(i12);
            List list = (List) pair.d();
            if (z10) {
                comparator = h.f14063a;
            } else {
                comparator = f.f14056a;
            }
            C6565s.C(list, new C1675z(new C1673y(comparator, G.f3544Z.b())));
            arrayList3.addAll((Collection) pair.d());
        }
        C6565s.C(arrayList3, new C1663t(r.f14079a));
        while (i10 <= C6565s.p(arrayList3)) {
            List list2 = (List) c10.c(((O0.n) arrayList3.get(i10)).o());
            if (list2 != null) {
                if (!f0((O0.n) arrayList3.get(i10))) {
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
                arrayList3.addAll(i10, list2);
                i10 += list2.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }

    private final void M(O0.n nVar, ArrayList arrayList, C c10) {
        boolean e10 = A.k(nVar);
        boolean booleanValue = ((Boolean) nVar.w().t(O0.q.f4613a.s(), l.f14072a)).booleanValue();
        if ((booleanValue || f0(nVar)) && P().b(nVar.o())) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            c10.t(nVar.o(), O0(e10, C6565s.h1(nVar.k())));
            return;
        }
        List k10 = nVar.k();
        int size = k10.size();
        for (int i10 = 0; i10 < size; i10++) {
            M((O0.n) k10.get(i10), arrayList, c10);
        }
    }

    /* access modifiers changed from: private */
    public static final int M0(yf.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final int N(O0.n nVar) {
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.d()) || !nVar.w().g(qVar.E())) {
            return this.f14044s;
        }
        return Q.i(((Q) nVar.w().r(qVar.E())).r());
    }

    private static final boolean N0(ArrayList arrayList, O0.n nVar) {
        boolean z10;
        boolean z11;
        float l10 = nVar.j().l();
        float e10 = nVar.j().e();
        if (l10 >= e10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int p10 = C6565s.p(arrayList);
        if (p10 >= 0) {
            int i10 = 0;
            while (true) {
                C2423i iVar = (C2423i) ((Pair) arrayList.get(i10)).c();
                if (iVar.l() >= iVar.e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 || z11 || Math.max(l10, iVar.l()) >= Math.min(e10, iVar.e())) {
                    if (i10 == p10) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList.set(i10, new Pair(iVar.o(0.0f, l10, Float.POSITIVE_INFINITY, e10), ((Pair) arrayList.get(i10)).d()));
                    ((List) ((Pair) arrayList.get(i10)).d()).add(nVar);
                    return true;
                }
            }
        }
        return false;
    }

    private final int O(O0.n nVar) {
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.d()) || !nVar.w().g(qVar.E())) {
            return this.f14044s;
        }
        return Q.n(((Q) nVar.w().r(qVar.E())).r());
    }

    private final List O0(boolean z10, List list) {
        C b10 = C1602p.b();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            M((O0.n) list.get(i10), arrayList, b10);
        }
        return L0(z10, arrayList, b10);
    }

    /* access modifiers changed from: private */
    public final C1601o P() {
        if (this.f14048w) {
            this.f14048w = false;
            this.f14050y = C1645k1.b(this.f14026a.getSemanticsOwner());
            if (e0()) {
                K0();
            }
        }
        return this.f14050y;
    }

    private final RectF P0(O0.n nVar, C2423i iVar) {
        C2423i iVar2;
        if (nVar == null) {
            return null;
        }
        C2423i t10 = iVar.t(nVar.s());
        C2423i i10 = nVar.i();
        if (t10.r(i10)) {
            iVar2 = t10.p(i10);
        } else {
            iVar2 = null;
        }
        if (iVar2 == null) {
            return null;
        }
        long u10 = this.f14026a.u(C2422h.a(iVar2.i(), iVar2.l()));
        long u11 = this.f14026a.u(C2422h.a(iVar2.j(), iVar2.e()));
        return new RectF(C2421g.m(u10), C2421g.n(u10), C2421g.m(u11), C2421g.n(u11));
    }

    private final SpannableString Q0(C1321d dVar) {
        return (SpannableString) T0(Y0.a.b(dVar, this.f14026a.getDensity(), this.f14026a.getFontFamilyResolver(), this.f14019E), 100000);
    }

    /* access modifiers changed from: private */
    public static final void R0(C1671x xVar, boolean z10) {
        xVar.f14034i = xVar.f14029d.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean S0(O0.n nVar, int i10, boolean z10, boolean z11) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int o10 = nVar.o();
        Integer num = this.f14045t;
        if (num == null || o10 != num.intValue()) {
            this.f14044s = -1;
            this.f14045t = Integer.valueOf(nVar.o());
        }
        String X10 = X(nVar);
        boolean z12 = false;
        if (!(X10 == null || X10.length() == 0)) {
            C1631g Y10 = Y(nVar, i10);
            if (Y10 == null) {
                return false;
            }
            int N10 = N(nVar);
            if (N10 == -1) {
                if (z10) {
                    N10 = 0;
                } else {
                    N10 = X10.length();
                }
            }
            if (z10) {
                iArr = Y10.a(N10);
            } else {
                iArr = Y10.b(N10);
            }
            if (iArr == null) {
                return false;
            }
            int i15 = iArr[0];
            z12 = true;
            int i16 = iArr[1];
            if (!z11 || !d0(nVar)) {
                if (z10) {
                    i14 = i16;
                } else {
                    i14 = i15;
                }
                i12 = i11;
            } else {
                i11 = O(nVar);
                if (i11 == -1) {
                    if (z10) {
                        i11 = i15;
                    } else {
                        i11 = i16;
                    }
                }
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i15;
                }
            }
            if (z10) {
                i13 = 256;
            } else {
                i13 = 512;
            }
            this.f14049x = new g(nVar, i13, i10, i15, i16, SystemClock.uptimeMillis());
            E0(nVar, i11, i12, true);
        }
        return z12;
    }

    private final CharSequence T0(CharSequence charSequence, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        } else if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i10) {
            return charSequence;
        } else {
            int i11 = i10 - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i11)) && Character.isLowSurrogate(charSequence.charAt(i10))) {
                i10 = i11;
            }
            CharSequence subSequence = charSequence.subSequence(0, i10);
            C6496s.f(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
    }

    private final boolean U(O0.n nVar) {
        boolean z10;
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        P0.a aVar = (P0.a) O0.k.a(w10, qVar.G());
        O0.g gVar = (O0.g) O0.k.a(nVar.w(), qVar.y());
        boolean z11 = true;
        boolean z12 = false;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) O0.k.a(nVar.w(), qVar.A())) == null) {
            return z10;
        }
        int g10 = O0.g.f4539b.g();
        if (gVar != null) {
            z12 = O0.g.k(gVar.n(), g10);
        }
        if (z12) {
            z11 = z10;
        }
        return z11;
    }

    private final void U0(int i10) {
        int i11 = this.f14027b;
        if (i11 != i10) {
            this.f14027b = i10;
            y0(this, i10, 128, (Integer) null, (List) null, 12, (Object) null);
            y0(this, i11, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    private final String V(O0.n nVar) {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        Object a10 = O0.k.a(w10, qVar.B());
        P0.a aVar = (P0.a) O0.k.a(nVar.w(), qVar.G());
        O0.g gVar = (O0.g) O0.k.a(nVar.w(), qVar.y());
        int i10 = 0;
        if (aVar != null) {
            int i11 = j.f14065a[aVar.ordinal()];
            if (i11 == 1) {
                int f11 = O0.g.f4539b.f();
                if (gVar == null) {
                    z13 = false;
                } else {
                    z13 = O0.g.k(gVar.n(), f11);
                }
                if (z13 && a10 == null) {
                    a10 = this.f14026a.getContext().getResources().getString(k0.n.f23139j);
                }
            } else if (i11 == 2) {
                int f12 = O0.g.f4539b.f();
                if (gVar == null) {
                    z14 = false;
                } else {
                    z14 = O0.g.k(gVar.n(), f12);
                }
                if (z14 && a10 == null) {
                    a10 = this.f14026a.getContext().getResources().getString(k0.n.f23138i);
                }
            } else if (i11 == 3 && a10 == null) {
                a10 = this.f14026a.getContext().getResources().getString(k0.n.f23134e);
            }
        }
        Boolean bool = (Boolean) O0.k.a(nVar.w(), qVar.A());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int g10 = O0.g.f4539b.g();
            if (gVar == null) {
                z12 = false;
            } else {
                z12 = O0.g.k(gVar.n(), g10);
            }
            if (!z12 && a10 == null) {
                if (booleanValue) {
                    a10 = this.f14026a.getContext().getResources().getString(k0.n.f23136g);
                } else {
                    a10 = this.f14026a.getContext().getResources().getString(k0.n.f23135f);
                }
            }
        }
        O0.f fVar = (O0.f) O0.k.a(nVar.w(), qVar.x());
        if (fVar != null) {
            if (fVar != O0.f.f4534d.a()) {
                if (a10 == null) {
                    Ef.e c10 = fVar.c();
                    if (((Number) c10.g()).floatValue() - ((Number) c10.a()).floatValue() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = (fVar.b() - ((Number) c10.a()).floatValue()) / (((Number) c10.g()).floatValue() - ((Number) c10.a()).floatValue());
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (f10 == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (f10 == 1.0f) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            i10 = 100;
                        } else {
                            i10 = Ef.m.l(Math.round(f10 * ((float) 100)), 1, 99);
                        }
                    }
                    a10 = this.f14026a.getContext().getResources().getString(k0.n.f23142m, new Object[]{Integer.valueOf(i10)});
                }
            } else if (a10 == null) {
                a10 = this.f14026a.getContext().getResources().getString(k0.n.f23133d);
            }
        }
        if (nVar.w().g(qVar.g())) {
            a10 = I(nVar);
        }
        return (String) a10;
    }

    private final void V0() {
        O0.n nVar;
        String str;
        O0.j b10;
        D d10 = new D(0, 1, (DefaultConstructorMarker) null);
        D d11 = this.f14051z;
        int[] iArr = d11.f12195b;
        long[] jArr = d11.f12194a;
        int length = jArr.length - 2;
        long j10 = 128;
        long j11 = 255;
        char c10 = 7;
        long j12 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            int[] iArr2 = iArr;
            while (true) {
                long j13 = jArr[i10];
                long[] jArr2 = jArr;
                if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & j11) < j10) {
                            int i13 = iArr2[(i10 << 3) + i12];
                            C1642j1 j1Var = (C1642j1) P().c(i13);
                            if (j1Var != null) {
                                nVar = j1Var.b();
                            } else {
                                nVar = null;
                            }
                            if (nVar == null || !nVar.w().g(O0.q.f4613a.v())) {
                                d10.f(i13);
                                C1639i1 i1Var = (C1639i1) this.f14020F.c(i13);
                                if (i1Var == null || (b10 = i1Var.b()) == null) {
                                    str = null;
                                } else {
                                    str = (String) O0.k.a(b10, O0.q.f4613a.v());
                                }
                                z0(i13, 32, str);
                            }
                        }
                        j13 >>= 8;
                        i12++;
                        j10 = 128;
                        j11 = 255;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr = jArr2;
                j10 = 128;
                j11 = 255;
            }
        }
        this.f14051z.r(d10);
        this.f14020F.i();
        C1601o P10 = P();
        int[] iArr3 = P10.f12189b;
        Object[] objArr = P10.f12190c;
        long[] jArr3 = P10.f12188a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j14 = jArr3[i14];
                if ((((~j14) << c10) & j14 & j12) != j12) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j14 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr3[i17];
                            C1642j1 j1Var2 = (C1642j1) objArr[i17];
                            O0.j w10 = j1Var2.b().w();
                            O0.q qVar = O0.q.f4613a;
                            if (w10.g(qVar.v()) && this.f14051z.f(i18)) {
                                z0(i18, 16, (String) j1Var2.b().w().r(qVar.v()));
                            }
                            this.f14020F.t(i18, new C1639i1(j1Var2.b(), P()));
                        }
                        j14 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                c10 = 7;
                j12 = -9187201950435737472L;
            }
        }
        this.f14021G = new C1639i1(this.f14026a.getSemanticsOwner().a(), P());
    }

    private final C1321d W(O0.n nVar) {
        C1321d dVar;
        C1321d Z10 = Z(nVar.w());
        List list = (List) O0.k.a(nVar.w(), O0.q.f4613a.D());
        if (list != null) {
            dVar = (C1321d) C6565s.q0(list);
        } else {
            dVar = null;
        }
        if (Z10 == null) {
            return dVar;
        }
        return Z10;
    }

    private final String X(O0.n nVar) {
        C1321d dVar;
        if (nVar == null) {
            return null;
        }
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.d())) {
            return C1942a.e((List) nVar.w().r(qVar.d()), com.amazon.a.a.o.b.f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        }
        if (nVar.w().g(qVar.g())) {
            C1321d Z10 = Z(nVar.w());
            if (Z10 != null) {
                return Z10.j();
            }
            return null;
        }
        List list = (List) O0.k.a(nVar.w(), qVar.D());
        if (list == null || (dVar = (C1321d) C6565s.q0(list)) == null) {
            return null;
        }
        return dVar.j();
    }

    private final C1631g Y(O0.n nVar, int i10) {
        String X10;
        L e10;
        if (nVar == null || (X10 = X(nVar)) == null || X10.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            C1619c a10 = C1619c.f13691d.a(this.f14026a.getContext().getResources().getConfiguration().locale);
            a10.e(X10);
            return a10;
        } else if (i10 != 2) {
            if (i10 != 4) {
                if (i10 == 8) {
                    C1628f a11 = C1628f.f13738c.a();
                    a11.e(X10);
                    return a11;
                } else if (i10 != 16) {
                    return null;
                }
            }
            if (!nVar.w().g(O0.i.f4556a.i()) || (e10 = C1645k1.e(nVar.w())) == null) {
                return null;
            }
            if (i10 == 4) {
                C1622d a12 = C1622d.f13703d.a();
                a12.j(X10, e10);
                return a12;
            }
            C1625e a13 = C1625e.f13710f.a();
            a13.j(X10, e10, nVar);
            return a13;
        } else {
            C1634h a14 = C1634h.f13744d.a(this.f14026a.getContext().getResources().getConfiguration().locale);
            a14.e(X10);
            return a14;
        }
    }

    private final C1321d Z(O0.j jVar) {
        return (C1321d) O0.k.a(jVar, O0.q.f4613a.g());
    }

    private final boolean c0(int i10) {
        if (this.f14037l == i10) {
            return true;
        }
        return false;
    }

    private final boolean d0(O0.n nVar) {
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.d()) || !nVar.w().g(qVar.g())) {
            return false;
        }
        return true;
    }

    private final boolean f0(O0.n nVar) {
        String str;
        boolean z10;
        List list = (List) O0.k.a(nVar.w(), O0.q.f4613a.d());
        if (list != null) {
            str = (String) C6565s.q0(list);
        } else {
            str = null;
        }
        if (str == null && W(nVar) == null && V(nVar) == null && !U(nVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (C1645k1.g(nVar)) {
            if (nVar.w().z()) {
                return true;
            }
            if (nVar.A() && z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean g0() {
        if (this.f14030e || (this.f14029d.isEnabled() && this.f14029d.isTouchExplorationEnabled())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void h0(G g10) {
        if (this.f14046u.add(g10)) {
            this.f14047v.c(C6514M.f71813a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v30, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k0(int r18, int r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r7 = r17
            r1 = r18
            r0 = r19
            r2 = r20
            androidx.collection.o r3 = r17.P()
            java.lang.Object r3 = r3.c(r1)
            androidx.compose.ui.platform.j1 r3 = (androidx.compose.ui.platform.C1642j1) r3
            r8 = 0
            if (r3 == 0) goto L_0x001b
            O0.n r3 = r3.b()
            if (r3 != 0) goto L_0x001e
        L_0x001b:
            r0 = r8
            goto L_0x06de
        L_0x001e:
            r4 = 64
            if (r0 == r4) goto L_0x06da
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r4) goto L_0x06d5
            r4 = 256(0x100, float:3.59E-43)
            r5 = 1
            if (r0 == r4) goto L_0x06bb
            r6 = 512(0x200, float:7.175E-43)
            if (r0 == r6) goto L_0x06bb
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 == r4) goto L_0x0694
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r4) goto L_0x0666
            boolean r4 = androidx.compose.ui.platform.A.h(r3)
            if (r4 != 0) goto L_0x003e
            return r8
        L_0x003e:
            if (r0 == r5) goto L_0x063f
            r4 = 2
            if (r0 == r4) goto L_0x0615
            r4 = 0
            switch(r0) {
                case 16: goto L_0x05dd;
                case 32: goto L_0x05b6;
                case 4096: goto L_0x035d;
                case 8192: goto L_0x035d;
                case 32768: goto L_0x0338;
                case 65536: goto L_0x0313;
                case 262144: goto L_0x02ee;
                case 524288: goto L_0x02c9;
                case 1048576: goto L_0x02a4;
                case 2097152: goto L_0x0268;
                case 16908342: goto L_0x0174;
                case 16908349: goto L_0x013c;
                case 16908372: goto L_0x0117;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r0) {
                case 16908344: goto L_0x035d;
                case 16908345: goto L_0x035d;
                case 16908346: goto L_0x035d;
                case 16908347: goto L_0x035d;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r0) {
                case 16908358: goto L_0x00f2;
                case 16908359: goto L_0x00cd;
                case 16908360: goto L_0x00a8;
                case 16908361: goto L_0x0083;
                default: goto L_0x004d;
            }
        L_0x004d:
            androidx.collection.Z r2 = r7.f14042q
            java.lang.Object r1 = r2.g(r1)
            androidx.collection.Z r1 = (androidx.collection.Z) r1
            if (r1 == 0) goto L_0x0082
            java.lang.Object r0 = r1.g(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.d()
            java.lang.Object r0 = O0.k.a(r0, r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0073
            return r8
        L_0x0073:
            int r1 = r0.size()
            if (r1 > 0) goto L_0x007a
            return r8
        L_0x007a:
            java.lang.Object r0 = r0.get(r8)
            android.support.v4.media.session.c.a(r0)
            throw r4
        L_0x0082:
            return r8
        L_0x0083:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.p()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x00a7
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00a7:
            return r8
        L_0x00a8:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.o()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x00cc
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00cc:
            return r8
        L_0x00cd:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.n()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x00f1
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00f1:
            return r8
        L_0x00f2:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.q()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x0116
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0116:
            return r8
        L_0x0117:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.l()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x013b
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x013b:
            return r8
        L_0x013c:
            if (r2 == 0) goto L_0x0173
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto L_0x0147
            goto L_0x0173
        L_0x0147:
            O0.j r1 = r3.w()
            O0.i r3 = O0.i.f4556a
            O0.u r3 = r3.w()
            java.lang.Object r1 = O0.k.a(r1, r3)
            O0.a r1 = (O0.a) r1
            if (r1 == 0) goto L_0x0173
            lf.i r1 = r1.a()
            yf.l r1 = (yf.C6798l) r1
            if (r1 == 0) goto L_0x0173
            float r0 = r2.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0173:
            return r8
        L_0x0174:
            O0.n r0 = r3.r()
            if (r0 == 0) goto L_0x018d
            O0.j r1 = r0.w()
            if (r1 == 0) goto L_0x018d
            O0.i r2 = O0.i.f4556a
            O0.u r2 = r2.t()
            java.lang.Object r1 = O0.k.a(r1, r2)
            O0.a r1 = (O0.a) r1
            goto L_0x018e
        L_0x018d:
            r1 = r4
        L_0x018e:
            if (r0 == 0) goto L_0x01ac
            if (r1 == 0) goto L_0x0193
            goto L_0x01ac
        L_0x0193:
            O0.n r0 = r0.r()
            if (r0 == 0) goto L_0x018d
            O0.j r1 = r0.w()
            if (r1 == 0) goto L_0x018d
            O0.i r2 = O0.i.f4556a
            O0.u r2 = r2.t()
            java.lang.Object r1 = O0.k.a(r1, r2)
            O0.a r1 = (O0.a) r1
            goto L_0x018e
        L_0x01ac:
            if (r0 != 0) goto L_0x01af
            return r8
        L_0x01af:
            H0.w r2 = r0.p()
            H0.s r2 = r2.m()
            q0.i r2 = H0.C1198t.a(r2)
            H0.w r4 = r0.p()
            H0.s r4 = r4.m()
            H0.s r4 = r4.x0()
            if (r4 == 0) goto L_0x01ce
            long r9 = H0.C1198t.e(r4)
            goto L_0x01d4
        L_0x01ce:
            q0.g$a r4 = q0.C2421g.f25320b
            long r9 = r4.c()
        L_0x01d4:
            q0.i r2 = r2.t(r9)
            long r9 = r3.s()
            long r11 = r3.u()
            long r11 = c1.s.d(r11)
            q0.i r4 = q0.C2424j.b(r9, r11)
            O0.j r6 = r0.w()
            O0.q r9 = O0.q.f4613a
            O0.u r10 = r9.k()
            java.lang.Object r6 = O0.k.a(r6, r10)
            O0.h r6 = (O0.h) r6
            O0.j r0 = r0.w()
            O0.u r9 = r9.I()
            java.lang.Object r0 = O0.k.a(r0, r9)
            O0.h r0 = (O0.h) r0
            float r9 = r4.i()
            float r10 = r2.i()
            float r9 = r9 - r10
            float r10 = r4.j()
            float r11 = r2.j()
            float r10 = r10 - r11
            float r9 = m0(r9, r10)
            if (r6 == 0) goto L_0x0225
            boolean r6 = r6.b()
            if (r6 != r5) goto L_0x0225
            float r9 = -r9
        L_0x0225:
            boolean r3 = androidx.compose.ui.platform.A.k(r3)
            if (r3 == 0) goto L_0x022c
            float r9 = -r9
        L_0x022c:
            float r3 = r4.l()
            float r6 = r2.l()
            float r3 = r3 - r6
            float r4 = r4.e()
            float r2 = r2.e()
            float r4 = r4 - r2
            float r2 = m0(r3, r4)
            if (r0 == 0) goto L_0x024b
            boolean r0 = r0.b()
            if (r0 != r5) goto L_0x024b
            float r2 = -r2
        L_0x024b:
            if (r1 == 0) goto L_0x0267
            lf.i r0 = r1.a()
            yf.p r0 = (yf.p) r0
            if (r0 == 0) goto L_0x0267
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0267:
            return r8
        L_0x0268:
            if (r2 == 0) goto L_0x0270
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r2.getString(r0)
        L_0x0270:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.y()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x02a3
            lf.i r0 = r0.a()
            yf.l r0 = (yf.C6798l) r0
            if (r0 == 0) goto L_0x02a3
            Q0.d r1 = new Q0.d
            if (r4 != 0) goto L_0x0290
            java.lang.String r4 = ""
        L_0x0290:
            r10 = r4
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02a3:
            return r8
        L_0x02a4:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.f()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x02c8
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02c8:
            return r8
        L_0x02c9:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.b()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x02ed
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02ed:
            return r8
        L_0x02ee:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.g()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x0312
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x0312
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0312:
            return r8
        L_0x0313:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.e()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x0337
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x0337
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0337:
            return r8
        L_0x0338:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.r()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x035c
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x035c
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x035c:
            return r8
        L_0x035d:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L_0x0363
            r1 = r5
            goto L_0x0364
        L_0x0363:
            r1 = r8
        L_0x0364:
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r0 != r2) goto L_0x036a
            r2 = r5
            goto L_0x036b
        L_0x036a:
            r2 = r8
        L_0x036b:
            r4 = 16908345(0x1020039, float:2.387739E-38)
            if (r0 != r4) goto L_0x0372
            r4 = r5
            goto L_0x0373
        L_0x0372:
            r4 = r8
        L_0x0373:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r0 != r6) goto L_0x037a
            r6 = r5
            goto L_0x037b
        L_0x037a:
            r6 = r8
        L_0x037b:
            r9 = 16908344(0x1020038, float:2.3877386E-38)
            if (r0 != r9) goto L_0x0382
            r9 = r5
            goto L_0x0383
        L_0x0382:
            r9 = r8
        L_0x0383:
            r10 = 16908346(0x102003a, float:2.3877392E-38)
            if (r0 != r10) goto L_0x038a
            r0 = r5
            goto L_0x038b
        L_0x038a:
            r0 = r8
        L_0x038b:
            if (r4 != 0) goto L_0x0396
            if (r6 != 0) goto L_0x0396
            if (r1 != 0) goto L_0x0396
            if (r2 == 0) goto L_0x0394
            goto L_0x0396
        L_0x0394:
            r10 = r8
            goto L_0x0397
        L_0x0396:
            r10 = r5
        L_0x0397:
            if (r9 != 0) goto L_0x03a2
            if (r0 != 0) goto L_0x03a2
            if (r1 != 0) goto L_0x03a2
            if (r2 == 0) goto L_0x03a0
            goto L_0x03a2
        L_0x03a0:
            r0 = r8
            goto L_0x03a3
        L_0x03a2:
            r0 = r5
        L_0x03a3:
            if (r1 != 0) goto L_0x03a7
            if (r2 == 0) goto L_0x043d
        L_0x03a7:
            O0.j r1 = r3.w()
            O0.q r11 = O0.q.f4613a
            O0.u r11 = r11.x()
            java.lang.Object r1 = O0.k.a(r1, r11)
            O0.f r1 = (O0.f) r1
            O0.j r11 = r3.w()
            O0.i r12 = O0.i.f4556a
            O0.u r12 = r12.w()
            java.lang.Object r11 = O0.k.a(r11, r12)
            O0.a r11 = (O0.a) r11
            if (r1 == 0) goto L_0x043d
            if (r11 == 0) goto L_0x043d
            Ef.e r0 = r1.c()
            java.lang.Comparable r0 = r0.g()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            Ef.e r3 = r1.c()
            java.lang.Comparable r3 = r3.a()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r0 = Ef.m.c(r0, r3)
            Ef.e r3 = r1.c()
            java.lang.Comparable r3 = r3.a()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            Ef.e r4 = r1.c()
            java.lang.Comparable r4 = r4.g()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = Ef.m.g(r3, r4)
            int r4 = r1.d()
            if (r4 <= 0) goto L_0x041a
            float r0 = r0 - r3
            int r3 = r1.d()
            int r3 = r3 + r5
        L_0x0417:
            float r3 = (float) r3
            float r0 = r0 / r3
            goto L_0x041e
        L_0x041a:
            float r0 = r0 - r3
            r3 = 20
            goto L_0x0417
        L_0x041e:
            if (r2 == 0) goto L_0x0421
            float r0 = -r0
        L_0x0421:
            lf.i r2 = r11.a()
            yf.l r2 = (yf.C6798l) r2
            if (r2 == 0) goto L_0x043c
            float r1 = r1.b()
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x043c:
            return r8
        L_0x043d:
            H0.w r1 = r3.p()
            H0.s r1 = r1.m()
            q0.i r1 = H0.C1198t.a(r1)
            long r11 = r1.k()
            O0.j r1 = r3.w()
            java.lang.Float r1 = androidx.compose.ui.platform.C1645k1.d(r1)
            O0.j r5 = r3.w()
            O0.i r13 = O0.i.f4556a
            O0.u r14 = r13.t()
            java.lang.Object r5 = O0.k.a(r5, r14)
            O0.a r5 = (O0.a) r5
            if (r5 != 0) goto L_0x0468
            return r8
        L_0x0468:
            O0.j r14 = r3.w()
            O0.q r15 = O0.q.f4613a
            O0.u r8 = r15.k()
            java.lang.Object r8 = O0.k.a(r14, r8)
            O0.h r8 = (O0.h) r8
            r14 = 0
            if (r8 == 0) goto L_0x0515
            if (r10 == 0) goto L_0x0515
            if (r1 == 0) goto L_0x0484
            float r10 = r1.floatValue()
            goto L_0x0488
        L_0x0484:
            float r10 = q0.C2427m.k(r11)
        L_0x0488:
            if (r4 != 0) goto L_0x048c
            if (r2 == 0) goto L_0x048d
        L_0x048c:
            float r10 = -r10
        L_0x048d:
            boolean r16 = r8.b()
            if (r16 == 0) goto L_0x0494
            float r10 = -r10
        L_0x0494:
            boolean r16 = androidx.compose.ui.platform.A.k(r3)
            if (r16 == 0) goto L_0x049f
            if (r4 != 0) goto L_0x049e
            if (r6 == 0) goto L_0x049f
        L_0x049e:
            float r10 = -r10
        L_0x049f:
            boolean r4 = l0(r8, r10)
            if (r4 == 0) goto L_0x0515
            O0.j r0 = r3.w()
            O0.u r1 = r13.o()
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L_0x04df
            O0.j r0 = r3.w()
            O0.u r1 = r13.p()
            boolean r0 = r0.g(r1)
            if (r0 == 0) goto L_0x04c2
            goto L_0x04df
        L_0x04c2:
            lf.i r0 = r5.a()
            yf.p r0 = (yf.p) r0
            if (r0 == 0) goto L_0x04dd
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x0514
        L_0x04dd:
            r8 = 0
            goto L_0x0514
        L_0x04df:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f2
            O0.j r0 = r3.w()
            O0.u r1 = r13.p()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            goto L_0x0500
        L_0x04f2:
            O0.j r0 = r3.w()
            O0.u r1 = r13.o()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
        L_0x0500:
            if (r0 == 0) goto L_0x04dd
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x04dd
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0514:
            return r8
        L_0x0515:
            O0.j r4 = r3.w()
            O0.u r6 = r15.I()
            java.lang.Object r4 = O0.k.a(r4, r6)
            O0.h r4 = (O0.h) r4
            if (r4 == 0) goto L_0x05b4
            if (r0 == 0) goto L_0x05b4
            if (r1 == 0) goto L_0x052e
            float r0 = r1.floatValue()
            goto L_0x0532
        L_0x052e:
            float r0 = q0.C2427m.i(r11)
        L_0x0532:
            if (r9 != 0) goto L_0x0536
            if (r2 == 0) goto L_0x0537
        L_0x0536:
            float r0 = -r0
        L_0x0537:
            boolean r1 = r4.b()
            if (r1 == 0) goto L_0x053e
            float r0 = -r0
        L_0x053e:
            boolean r1 = l0(r4, r0)
            if (r1 == 0) goto L_0x05b4
            O0.j r1 = r3.w()
            O0.u r2 = r13.q()
            boolean r1 = r1.g(r2)
            if (r1 != 0) goto L_0x057e
            O0.j r1 = r3.w()
            O0.u r2 = r13.n()
            boolean r1 = r1.g(r2)
            if (r1 == 0) goto L_0x0561
            goto L_0x057e
        L_0x0561:
            lf.i r1 = r5.a()
            yf.p r1 = (yf.p) r1
            if (r1 == 0) goto L_0x057c
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x05b3
        L_0x057c:
            r8 = 0
            goto L_0x05b3
        L_0x057e:
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0591
            O0.j r0 = r3.w()
            O0.u r1 = r13.n()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            goto L_0x059f
        L_0x0591:
            O0.j r0 = r3.w()
            O0.u r1 = r13.q()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
        L_0x059f:
            if (r0 == 0) goto L_0x057c
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x057c
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x05b3:
            return r8
        L_0x05b4:
            r0 = 0
            return r0
        L_0x05b6:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.m()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x05db
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x05db
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x05dc
        L_0x05db:
            r8 = 0
        L_0x05dc:
            return r8
        L_0x05dd:
            O0.j r0 = r3.w()
            O0.i r2 = O0.i.f4556a
            O0.u r2 = r2.k()
            java.lang.Object r0 = O0.k.a(r0, r2)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x05fe
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x05fe
            java.lang.Object r0 = r0.invoke()
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x05fe:
            r8 = r4
            r5 = 12
            r6 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r0 = r17
            r1 = r18
            y0(r0, r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x0613
            boolean r8 = r8.booleanValue()
            goto L_0x0614
        L_0x0613:
            r8 = 0
        L_0x0614:
            return r8
        L_0x0615:
            O0.j r0 = r3.w()
            O0.q r1 = O0.q.f4613a
            O0.u r1 = r1.i()
            java.lang.Object r0 = O0.k.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r0 == 0) goto L_0x063d
            androidx.compose.ui.platform.r r0 = r7.f14026a
            p0.g r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.d$a r1 = androidx.compose.ui.focus.d.f13315b
            int r1 = r1.c()
            r2 = 0
            r0.l(r2, r5, r5, r1)
            r8 = r5
            goto L_0x063e
        L_0x063d:
            r8 = 0
        L_0x063e:
            return r8
        L_0x063f:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.s()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x0664
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x0664
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x0665
        L_0x0664:
            r8 = 0
        L_0x0665:
            return r8
        L_0x0666:
            r0 = -1
            if (r2 == 0) goto L_0x0670
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r1 = r2.getInt(r1, r0)
            goto L_0x0671
        L_0x0670:
            r1 = r0
        L_0x0671:
            if (r2 == 0) goto L_0x0679
            java.lang.String r4 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r0 = r2.getInt(r4, r0)
        L_0x0679:
            r2 = 0
            boolean r8 = r7.E0(r3, r1, r0, r2)
            if (r8 == 0) goto L_0x0693
            int r0 = r3.o()
            int r1 = r7.u0(r0)
            r5 = 12
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r17
            y0(r0, r1, r2, r3, r4, r5, r6)
        L_0x0693:
            return r8
        L_0x0694:
            O0.j r0 = r3.w()
            O0.i r1 = O0.i.f4556a
            O0.u r1 = r1.c()
            java.lang.Object r0 = O0.k.a(r0, r1)
            O0.a r0 = (O0.a) r0
            if (r0 == 0) goto L_0x06b9
            lf.i r0 = r0.a()
            yf.a r0 = (yf.C6787a) r0
            if (r0 == 0) goto L_0x06b9
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x06ba
        L_0x06b9:
            r8 = 0
        L_0x06ba:
            return r8
        L_0x06bb:
            if (r2 == 0) goto L_0x06d3
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r2.getInt(r1)
            java.lang.String r6 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r2 = r2.getBoolean(r6)
            if (r0 != r4) goto L_0x06cd
            r8 = r5
            goto L_0x06ce
        L_0x06cd:
            r8 = 0
        L_0x06ce:
            boolean r0 = r7.S0(r3, r1, r8, r2)
            return r0
        L_0x06d3:
            r0 = 0
            return r0
        L_0x06d5:
            boolean r0 = r17.F(r18)
            return r0
        L_0x06da:
            boolean r0 = r17.r0(r18)
        L_0x06de:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1671x.k0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean l0(O0.h hVar, float f10) {
        if ((f10 >= 0.0f || ((Number) hVar.c().invoke()).floatValue() <= 0.0f) && (f10 <= 0.0f || ((Number) hVar.c().invoke()).floatValue() >= ((Number) hVar.a().invoke()).floatValue())) {
            return false;
        }
        return true;
    }

    private static final float m0(float f10, float f11) {
        if (Math.signum(f10) != Math.signum(f11)) {
            return 0.0f;
        }
        if (Math.abs(f10) < Math.abs(f11)) {
            return f10;
        }
        return f11;
    }

    private final void n0(int i10, C2930A a10, O0.n nVar) {
        int i11;
        boolean z10;
        View h10;
        C2930A.a aVar;
        C2930A.a aVar2;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        boolean z18;
        int i12 = i10;
        C2930A a11 = a10;
        O0.n nVar2 = nVar;
        a11.t0("android.view.View");
        O0.j w10 = nVar.w();
        O0.q qVar = O0.q.f4613a;
        if (w10.g(qVar.g())) {
            a11.t0("android.widget.EditText");
        }
        if (nVar.w().g(qVar.D())) {
            a11.t0("android.widget.TextView");
        }
        O0.g gVar = (O0.g) O0.k.a(nVar.w(), qVar.y());
        if (gVar != null) {
            gVar.n();
            if (nVar.x() || nVar.t().isEmpty()) {
                g.a aVar3 = O0.g.f4539b;
                if (O0.g.k(gVar.n(), aVar3.g())) {
                    a11.T0(this.f14026a.getContext().getResources().getString(k0.n.f23141l));
                } else {
                    if (O0.g.k(gVar.n(), aVar3.f())) {
                        a11.T0(this.f14026a.getContext().getResources().getString(k0.n.f23140k));
                    } else {
                        String i13 = C1645k1.i(gVar.n());
                        if (!O0.g.k(gVar.n(), aVar3.d()) || nVar.A() || nVar.w().z()) {
                            a11.t0(i13);
                        }
                    }
                }
            }
            C6514M m10 = C6514M.f71813a;
        }
        a11.N0(this.f14026a.getContext().getPackageName());
        a11.G0(C1645k1.f(nVar));
        List t10 = nVar.t();
        int size = t10.size();
        for (int i14 = 0; i14 < size; i14++) {
            O0.n nVar3 = (O0.n) t10.get(i14);
            if (P().a(nVar3.o())) {
                androidx.compose.ui.viewinterop.c cVar = this.f14026a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar3.q());
                if (nVar3.o() != -1) {
                    if (cVar != null) {
                        a11.c(cVar);
                    } else {
                        a11.d(this.f14026a, nVar3.o());
                    }
                }
            }
        }
        if (i12 == this.f14037l) {
            a11.m0(true);
            a11.b(C2930A.a.f28605l);
        } else {
            a11.m0(false);
            a11.b(C2930A.a.f28604k);
        }
        J0(nVar2, a11);
        F0(nVar2, a11);
        I0(nVar2, a11);
        G0(nVar2, a11);
        O0.j w11 = nVar.w();
        O0.q qVar2 = O0.q.f4613a;
        P0.a aVar4 = (P0.a) O0.k.a(w11, qVar2.G());
        if (aVar4 != null) {
            if (aVar4 == P0.a.On) {
                a11.s0(true);
            } else if (aVar4 == P0.a.Off) {
                a11.s0(false);
            }
            C6514M m11 = C6514M.f71813a;
        }
        Boolean bool = (Boolean) O0.k.a(nVar.w(), qVar2.A());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int g10 = O0.g.f4539b.g();
            if (gVar == null) {
                z18 = false;
            } else {
                z18 = O0.g.k(gVar.n(), g10);
            }
            if (z18) {
                a11.W0(booleanValue);
            } else {
                a11.s0(booleanValue);
            }
            C6514M m12 = C6514M.f71813a;
        }
        if (!nVar.w().z() || nVar.t().isEmpty()) {
            List list = (List) O0.k.a(nVar.w(), qVar2.d());
            if (list != null) {
                str2 = (String) C6565s.q0(list);
            } else {
                str2 = null;
            }
            a11.x0(str2);
        }
        String str3 = (String) O0.k.a(nVar.w(), qVar2.C());
        if (str3 != null) {
            O0.n nVar4 = nVar2;
            while (true) {
                if (nVar4 == null) {
                    z17 = false;
                    break;
                }
                O0.j w12 = nVar4.w();
                O0.r rVar = O0.r.f4650a;
                if (w12.g(rVar.a())) {
                    z17 = ((Boolean) nVar4.w().r(rVar.a())).booleanValue();
                    break;
                }
                nVar4 = nVar4.r();
            }
            if (z17) {
                a11.i1(str3);
            }
        }
        O0.j w13 = nVar.w();
        O0.q qVar3 = O0.q.f4613a;
        if (((C6514M) O0.k.a(w13, qVar3.j())) != null) {
            a11.E0(true);
            C6514M m13 = C6514M.f71813a;
        }
        a11.R0(nVar.w().g(qVar3.w()));
        a11.z0(nVar.w().g(qVar3.p()));
        Integer num = (Integer) O0.k.a(nVar.w(), qVar3.u());
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        a11.L0(i11);
        a11.A0(A.h(nVar));
        a11.C0(nVar.w().g(qVar3.i()));
        int i15 = 2;
        if (a10.T()) {
            a11.D0(((Boolean) nVar.w().r(qVar3.i())).booleanValue());
            if (a10.U()) {
                a11.a(2);
            } else {
                a11.a(1);
            }
        }
        a11.j1(C1645k1.g(nVar));
        O0.e eVar = (O0.e) O0.k.a(nVar.w(), qVar3.t());
        if (eVar != null) {
            int i16 = eVar.i();
            e.a aVar5 = O0.e.f4530b;
            if (O0.e.f(i16, aVar5.b()) || !O0.e.f(i16, aVar5.a())) {
                i15 = 1;
            }
            a11.J0(i15);
            C6514M m14 = C6514M.f71813a;
        }
        a11.u0(false);
        O0.j w14 = nVar.w();
        O0.i iVar = O0.i.f4556a;
        O0.a aVar6 = (O0.a) O0.k.a(w14, iVar.k());
        if (aVar6 != null) {
            boolean c10 = C6496s.c(O0.k.a(nVar.w(), qVar3.A()), Boolean.TRUE);
            g.a aVar7 = O0.g.f4539b;
            int g11 = aVar7.g();
            if (gVar == null) {
                z13 = false;
            } else {
                z13 = O0.g.k(gVar.n(), g11);
            }
            if (!z13) {
                int e10 = aVar7.e();
                if (gVar == null) {
                    z16 = false;
                } else {
                    z16 = O0.g.k(gVar.n(), e10);
                }
                if (!z16) {
                    z14 = false;
                    if (z14 || (z14 && !c10)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    a11.u0(z15);
                    if (A.h(nVar) && a10.P()) {
                        a11.b(new C2930A.a(16, aVar6.b()));
                    }
                    C6514M m15 = C6514M.f71813a;
                }
            }
            z14 = true;
            if (z14) {
            }
            z15 = true;
            a11.u0(z15);
            a11.b(new C2930A.a(16, aVar6.b()));
            C6514M m152 = C6514M.f71813a;
        }
        a11.K0(false);
        O0.a aVar8 = (O0.a) O0.k.a(nVar.w(), iVar.m());
        if (aVar8 != null) {
            a11.K0(true);
            if (A.h(nVar)) {
                a11.b(new C2930A.a(32, aVar8.b()));
            }
            C6514M m16 = C6514M.f71813a;
        }
        O0.a aVar9 = (O0.a) O0.k.a(nVar.w(), iVar.c());
        if (aVar9 != null) {
            a11.b(new C2930A.a(16384, aVar9.b()));
            C6514M m17 = C6514M.f71813a;
        }
        if (A.h(nVar)) {
            O0.a aVar10 = (O0.a) O0.k.a(nVar.w(), iVar.y());
            if (aVar10 != null) {
                a11.b(new C2930A.a(2097152, aVar10.b()));
                C6514M m18 = C6514M.f71813a;
            }
            O0.a aVar11 = (O0.a) O0.k.a(nVar.w(), iVar.l());
            if (aVar11 != null) {
                a11.b(new C2930A.a(16908372, aVar11.b()));
                C6514M m19 = C6514M.f71813a;
            }
            O0.a aVar12 = (O0.a) O0.k.a(nVar.w(), iVar.e());
            if (aVar12 != null) {
                a11.b(new C2930A.a(65536, aVar12.b()));
                C6514M m20 = C6514M.f71813a;
            }
            O0.a aVar13 = (O0.a) O0.k.a(nVar.w(), iVar.r());
            if (aVar13 != null) {
                if (a10.U() && this.f14026a.getClipboardManager().c()) {
                    a11.b(new C2930A.a(32768, aVar13.b()));
                }
                C6514M m21 = C6514M.f71813a;
            }
        }
        String X10 = X(nVar2);
        if (X10 == null || X10.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a11.c1(O(nVar2), N(nVar2));
            O0.a aVar14 = (O0.a) O0.k.a(nVar.w(), iVar.x());
            if (aVar14 != null) {
                str = aVar14.b();
            } else {
                str = null;
            }
            a11.b(new C2930A.a(131072, str));
            a11.a(256);
            a11.a(512);
            a11.M0(11);
            Collection collection = (List) O0.k.a(nVar.w(), qVar3.d());
            if (collection == null || collection.isEmpty()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && nVar.w().g(iVar.i()) && !A.i(nVar)) {
                a11.M0(a10.z() | 20);
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence F10 = a10.F();
            if (F10 == null || F10.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && nVar.w().g(iVar.i())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (nVar.w().g(qVar3.C())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            a11.n0(arrayList);
        }
        O0.f fVar = (O0.f) O0.k.a(nVar.w(), qVar3.x());
        if (fVar != null) {
            if (nVar.w().g(iVar.w())) {
                a11.t0("android.widget.SeekBar");
            } else {
                a11.t0("android.widget.ProgressBar");
            }
            if (fVar != O0.f.f4534d.a()) {
                a11.S0(C2930A.g.d(1, ((Number) fVar.c().a()).floatValue(), ((Number) fVar.c().g()).floatValue(), fVar.b()));
            }
            if (nVar.w().g(iVar.w()) && A.h(nVar)) {
                if (fVar.b() < Ef.m.c(((Number) fVar.c().g()).floatValue(), ((Number) fVar.c().a()).floatValue())) {
                    a11.b(C2930A.a.f28610q);
                }
                if (fVar.b() > Ef.m.g(((Number) fVar.c().a()).floatValue(), ((Number) fVar.c().g()).floatValue())) {
                    a11.b(C2930A.a.f28611r);
                }
            }
        }
        b.a(a10, nVar);
        K0.a.d(nVar2, a11);
        K0.a.e(nVar2, a11);
        O0.h hVar = (O0.h) O0.k.a(nVar.w(), qVar3.k());
        O0.a aVar15 = (O0.a) O0.k.a(nVar.w(), iVar.t());
        if (!(hVar == null || aVar15 == null)) {
            if (!K0.a.b(nVar)) {
                a11.t0("android.widget.HorizontalScrollView");
            }
            if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                a11.V0(true);
            }
            if (A.h(nVar)) {
                if (p0(hVar)) {
                    a11.b(C2930A.a.f28610q);
                    if (!A.k(nVar)) {
                        aVar2 = C2930A.a.f28581F;
                    } else {
                        aVar2 = C2930A.a.f28579D;
                    }
                    a11.b(aVar2);
                }
                if (o0(hVar)) {
                    a11.b(C2930A.a.f28611r);
                    if (!A.k(nVar)) {
                        aVar = C2930A.a.f28579D;
                    } else {
                        aVar = C2930A.a.f28581F;
                    }
                    a11.b(aVar);
                }
            }
        }
        O0.h hVar2 = (O0.h) O0.k.a(nVar.w(), qVar3.I());
        if (!(hVar2 == null || aVar15 == null)) {
            if (!K0.a.b(nVar)) {
                a11.t0("android.widget.ScrollView");
            }
            if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                a11.V0(true);
            }
            if (A.h(nVar)) {
                if (p0(hVar2)) {
                    a11.b(C2930A.a.f28610q);
                    a11.b(C2930A.a.f28580E);
                }
                if (o0(hVar2)) {
                    a11.b(C2930A.a.f28611r);
                    a11.b(C2930A.a.f28578C);
                }
            }
        }
        if (i17 >= 29) {
            c.a(a10, nVar);
        }
        a11.O0((CharSequence) O0.k.a(nVar.w(), qVar3.v()));
        if (A.h(nVar)) {
            O0.a aVar16 = (O0.a) O0.k.a(nVar.w(), iVar.g());
            if (aVar16 != null) {
                a11.b(new C2930A.a(262144, aVar16.b()));
                C6514M m22 = C6514M.f71813a;
            }
            O0.a aVar17 = (O0.a) O0.k.a(nVar.w(), iVar.b());
            if (aVar17 != null) {
                a11.b(new C2930A.a(524288, aVar17.b()));
                C6514M m23 = C6514M.f71813a;
            }
            O0.a aVar18 = (O0.a) O0.k.a(nVar.w(), iVar.f());
            if (aVar18 != null) {
                a11.b(new C2930A.a(1048576, aVar18.b()));
                C6514M m24 = C6514M.f71813a;
            }
            if (nVar.w().g(iVar.d())) {
                List list2 = (List) nVar.w().r(iVar.d());
                int size2 = list2.size();
                C1599m mVar = f14014N;
                if (size2 < mVar.b()) {
                    Z z19 = new Z(0, 1, (DefaultConstructorMarker) null);
                    H b10 = O.b();
                    if (this.f14043r.e(i12)) {
                        H h11 = (H) this.f14043r.g(i12);
                        androidx.collection.B b11 = new androidx.collection.B(0, 1, (DefaultConstructorMarker) null);
                        int[] iArr = mVar.f12185a;
                        int i18 = mVar.f12186b;
                        for (int i19 = 0; i19 < i18; i19++) {
                            b11.h(iArr[i19]);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        if (list2.size() > 0) {
                            android.support.v4.media.session.c.a(list2.get(0));
                            C6496s.e(h11);
                            throw null;
                        } else if (arrayList2.size() > 0) {
                            android.support.v4.media.session.c.a(arrayList2.get(0));
                            b11.a(0);
                            throw null;
                        }
                    } else if (list2.size() > 0) {
                        android.support.v4.media.session.c.a(list2.get(0));
                        mVar.a(0);
                        throw null;
                    }
                    this.f14042q.k(i12, z19);
                    this.f14043r.k(i12, b10);
                } else {
                    throw new IllegalStateException("Can't have more than " + mVar.b() + " custom actions for one widget");
                }
            }
        }
        a11.U0(f0(nVar2));
        int e11 = this.f14015A.e(i12, -1);
        if (e11 != -1) {
            View h12 = C1645k1.h(this.f14026a.getAndroidViewsHandler$ui_release(), e11);
            if (h12 != null) {
                a11.g1(h12);
            } else {
                a11.h1(this.f14026a, e11);
            }
            z(i12, a11, this.f14017C, (Bundle) null);
        }
        int e12 = this.f14016B.e(i12, -1);
        if (e12 != -1 && (h10 = C1645k1.h(this.f14026a.getAndroidViewsHandler$ui_release(), e12)) != null) {
            a11.e1(h10);
            z(i12, a11, this.f14018D, (Bundle) null);
        }
    }

    private static final boolean o0(O0.h hVar) {
        if ((((Number) hVar.c().invoke()).floatValue() <= 0.0f || hVar.b()) && (((Number) hVar.c().invoke()).floatValue() >= ((Number) hVar.a().invoke()).floatValue() || !hVar.b())) {
            return false;
        }
        return true;
    }

    private static final boolean p0(O0.h hVar) {
        if ((((Number) hVar.c().invoke()).floatValue() >= ((Number) hVar.a().invoke()).floatValue() || hVar.b()) && (((Number) hVar.c().invoke()).floatValue() <= 0.0f || !hVar.b())) {
            return false;
        }
        return true;
    }

    private final boolean q0(int i10, List list) {
        boolean z10;
        C1636h1 a10 = C1645k1.a(list, i10);
        if (a10 != null) {
            z10 = false;
        } else {
            a10 = new C1636h1(i10, this.f14024J, (Float) null, (Float) null, (O0.h) null, (O0.h) null);
            z10 = true;
        }
        this.f14024J.add(a10);
        return z10;
    }

    private final boolean r0(int i10) {
        if (!g0() || c0(i10)) {
            return false;
        }
        int i11 = this.f14037l;
        if (i11 != Integer.MIN_VALUE) {
            y0(this, i11, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.f14037l = i10;
        this.f14026a.invalidate();
        y0(this, i10, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public final void s0(C1636h1 h1Var) {
        if (h1Var.Y0()) {
            this.f14026a.getSnapshotObserver().i(h1Var, this.f14025K, new n(h1Var, this));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final void t0(C1671x xVar) {
        Trace.beginSection("measureAndLayout");
        try {
            m0.j(xVar.f14026a, false, 1, (Object) null);
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                xVar.E();
                Trace.endSection();
                xVar.f14022H = false;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* access modifiers changed from: private */
    public final int u0(int i10) {
        if (i10 == this.f14026a.getSemanticsOwner().a().o()) {
            return -1;
        }
        return i10;
    }

    private final void v0(O0.n nVar, C1639i1 i1Var) {
        D b10 = androidx.collection.r.b();
        List t10 = nVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            O0.n nVar2 = (O0.n) t10.get(i10);
            if (P().a(nVar2.o())) {
                if (!i1Var.a().a(nVar2.o())) {
                    h0(nVar.q());
                    return;
                }
                b10.f(nVar2.o());
            }
        }
        D a10 = i1Var.a();
        int[] iArr = a10.f12195b;
        long[] jArr = a10.f12194a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) >= 128 || b10.a(iArr[(i11 << 3) + i13])) {
                            j10 >>= 8;
                            i13++;
                        } else {
                            h0(nVar.q());
                            return;
                        }
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List t11 = nVar.t();
        int size2 = t11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            O0.n nVar3 = (O0.n) t11.get(i14);
            if (P().a(nVar3.o())) {
                Object c10 = this.f14020F.c(nVar3.o());
                C6496s.e(c10);
                v0(nVar3, (C1639i1) c10);
            }
        }
    }

    private final boolean w0(AccessibilityEvent accessibilityEvent) {
        if (!e0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f14039n = true;
        }
        try {
            return ((Boolean) this.f14028c.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f14039n = false;
        }
    }

    private final boolean x0(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !e0()) {
            return false;
        }
        AccessibilityEvent G10 = G(i10, i11);
        if (num != null) {
            G10.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            G10.setContentDescription(C1942a.e(list, com.amazon.a.a.o.b.f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null));
        }
        Trace.beginSection("sendEvent");
        try {
            return w0(G10);
        } finally {
            Trace.endSection();
        }
    }

    static /* synthetic */ boolean y0(C1671x xVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return xVar.x0(i10, i11, num, list);
    }

    /* access modifiers changed from: private */
    public final void z(int i10, C2930A a10, String str, Bundle bundle) {
        O0.n b10;
        int i11;
        C1642j1 j1Var = (C1642j1) P().c(i10);
        if (j1Var != null && (b10 = j1Var.b()) != null) {
            String X10 = X(b10);
            if (C6496s.c(str, this.f14017C)) {
                int e10 = this.f14015A.e(i10, -1);
                if (e10 != -1) {
                    a10.w().putInt(str, e10);
                }
            } else if (C6496s.c(str, this.f14018D)) {
                int e11 = this.f14016B.e(i10, -1);
                if (e11 != -1) {
                    a10.w().putInt(str, e11);
                }
            } else if (!b10.w().g(O0.i.f4556a.i()) || bundle == null || !C6496s.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                O0.j w10 = b10.w();
                O0.q qVar = O0.q.f4613a;
                if (w10.g(qVar.C()) && bundle != null && C6496s.c(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) O0.k.a(b10.w(), qVar.C());
                    if (str2 != null) {
                        a10.w().putCharSequence(str, str2);
                    }
                } else if (C6496s.c(str, "androidx.compose.ui.semantics.id")) {
                    a10.w().putInt(str, b10.o());
                }
            } else {
                int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i13 > 0 && i12 >= 0) {
                    if (X10 != null) {
                        i11 = X10.length();
                    } else {
                        i11 = a.e.API_PRIORITY_OTHER;
                    }
                    if (i12 < i11) {
                        L e12 = C1645k1.e(b10.w());
                        if (e12 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i14 = 0; i14 < i13; i14++) {
                                int i15 = i12 + i14;
                                if (i15 >= e12.l().j().length()) {
                                    arrayList.add((Object) null);
                                } else {
                                    arrayList.add(P0(b10, e12.d(i15)));
                                }
                            }
                            a10.w().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            }
        }
    }

    private final void z0(int i10, int i11, String str) {
        AccessibilityEvent G10 = G(u0(i10), 32);
        G10.setContentChangeTypes(i11);
        if (str != null) {
            G10.getText().add(str);
        }
        w0(G10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(qf.C6658d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.platform.C1671x.k
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.platform.x$k r0 = (androidx.compose.ui.platform.C1671x.k) r0
            int r1 = r0.f14071f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14071f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.x$k r0 = new androidx.compose.ui.platform.x$k
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f14069d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f14071f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r2 = r0.f14068c
            Wg.f r2 = (Wg.f) r2
            java.lang.Object r6 = r0.f14067b
            androidx.collection.D r6 = (androidx.collection.D) r6
            java.lang.Object r7 = r0.f14066a
            androidx.compose.ui.platform.x r7 = (androidx.compose.ui.platform.C1671x) r7
            lf.w.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x00d2
        L_0x003a:
            r12 = move-exception
            goto L_0x00de
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0045:
            java.lang.Object r2 = r0.f14068c
            Wg.f r2 = (Wg.f) r2
            java.lang.Object r6 = r0.f14067b
            androidx.collection.D r6 = (androidx.collection.D) r6
            java.lang.Object r7 = r0.f14066a
            androidx.compose.ui.platform.x r7 = (androidx.compose.ui.platform.C1671x) r7
            lf.w.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0077
        L_0x0055:
            lf.w.b(r12)
            androidx.collection.D r12 = new androidx.collection.D     // Catch:{ all -> 0x00dc }
            r2 = 0
            r12.<init>(r3, r5, r2)     // Catch:{ all -> 0x00dc }
            Wg.d r2 = r11.f14047v     // Catch:{ all -> 0x00dc }
            Wg.f r2 = r2.iterator()     // Catch:{ all -> 0x00dc }
            r7 = r11
        L_0x0065:
            r0.f14066a = r7     // Catch:{ all -> 0x003a }
            r0.f14067b = r12     // Catch:{ all -> 0x003a }
            r0.f14068c = r2     // Catch:{ all -> 0x003a }
            r0.f14071f = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r6 = r2.a(r0)     // Catch:{ all -> 0x003a }
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r10 = r6
            r6 = r12
            r12 = r10
        L_0x0077:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x003a }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00d4
            r2.next()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.e0()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00d2
            androidx.collection.b r12 = r7.f14046u     // Catch:{ all -> 0x003a }
            int r12 = r12.size()     // Catch:{ all -> 0x003a }
            r8 = r3
        L_0x008f:
            if (r8 >= r12) goto L_0x00a2
            androidx.collection.b r9 = r7.f14046u     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.z(r8)     // Catch:{ all -> 0x003a }
            J0.G r9 = (J0.G) r9     // Catch:{ all -> 0x003a }
            r7.C0(r9, r6)     // Catch:{ all -> 0x003a }
            r7.D0(r9)     // Catch:{ all -> 0x003a }
            int r8 = r8 + 1
            goto L_0x008f
        L_0x00a2:
            r6.h()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.f14022H     // Catch:{ all -> 0x003a }
            if (r12 != 0) goto L_0x00b2
            r7.f14022H = r5     // Catch:{ all -> 0x003a }
            android.os.Handler r12 = r7.f14035j     // Catch:{ all -> 0x003a }
            java.lang.Runnable r8 = r7.f14023I     // Catch:{ all -> 0x003a }
            r12.post(r8)     // Catch:{ all -> 0x003a }
        L_0x00b2:
            androidx.collection.b r12 = r7.f14046u     // Catch:{ all -> 0x003a }
            r12.clear()     // Catch:{ all -> 0x003a }
            androidx.collection.C r12 = r7.f14040o     // Catch:{ all -> 0x003a }
            r12.i()     // Catch:{ all -> 0x003a }
            androidx.collection.C r12 = r7.f14041p     // Catch:{ all -> 0x003a }
            r12.i()     // Catch:{ all -> 0x003a }
            long r8 = r7.f14031f     // Catch:{ all -> 0x003a }
            r0.f14066a = r7     // Catch:{ all -> 0x003a }
            r0.f14067b = r6     // Catch:{ all -> 0x003a }
            r0.f14068c = r2     // Catch:{ all -> 0x003a }
            r0.f14071f = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r12 = Ug.V.a(r8, r0)     // Catch:{ all -> 0x003a }
            if (r12 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            r12 = r6
            goto L_0x0065
        L_0x00d4:
            androidx.collection.b r12 = r7.f14046u
            r12.clear()
            lf.M r12 = lf.C6514M.f71813a
            return r12
        L_0x00dc:
            r12 = move-exception
            r7 = r11
        L_0x00de:
            androidx.collection.b r0 = r7.f14046u
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1671x.B(qf.d):java.lang.Object");
    }

    public final boolean C(boolean z10, int i10, long j10) {
        if (!C6496s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return D(P(), z10, i10, j10);
    }

    public final void H0(long j10) {
        this.f14031f = j10;
    }

    public final boolean K(MotionEvent motionEvent) {
        if (!g0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int b02 = b0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f14026a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            U0(b02);
            if (b02 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f14027b == Integer.MIN_VALUE) {
                return this.f14026a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            U0(Integer.MIN_VALUE);
            return true;
        }
    }

    public final String Q() {
        return this.f14018D;
    }

    public final String R() {
        return this.f14017C;
    }

    public final A S() {
        return this.f14016B;
    }

    public final A T() {
        return this.f14015A;
    }

    public final r a0() {
        return this.f14026a;
    }

    public final int b0(float f10, float f11) {
        int i10;
        m0.j(this.f14026a, false, 1, (Object) null);
        C1254u uVar = new C1254u();
        G.z0(this.f14026a.getRoot(), C2422h.a(f10, f11), uVar, false, false, 12, (Object) null);
        int p10 = C6565s.p(uVar);
        while (true) {
            i10 = Integer.MIN_VALUE;
            if (-1 >= p10) {
                break;
            }
            G m10 = C1245k.m(uVar.get(p10));
            if (this.f14026a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(m10) != null) {
                return Integer.MIN_VALUE;
            }
            if (m10.j0().q(C1239e0.a(8))) {
                i10 = u0(m10.p0());
                if (C1645k1.f(O0.o.a(m10, false))) {
                    break;
                }
            }
            p10--;
        }
        return i10;
    }

    public final boolean e0() {
        if (this.f14030e || (this.f14029d.isEnabled() && !this.f14034i.isEmpty())) {
            return true;
        }
        return false;
    }

    public B getAccessibilityNodeProvider(View view) {
        return this.f14036k;
    }

    public final void i0(G g10) {
        this.f14048w = true;
        if (e0()) {
            h0(g10);
        }
    }

    public final void j0() {
        this.f14048w = true;
        if (e0() && !this.f14022H) {
            this.f14022H = true;
            this.f14035j.post(this.f14023I);
        }
    }
}

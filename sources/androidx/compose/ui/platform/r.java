package androidx.compose.ui.platform;

import A0.a;
import B0.a;
import D0.C;
import D0.C1117h;
import D0.C1130v;
import D0.D;
import D0.E;
import D0.F;
import D0.N;
import D0.P;
import D0.Q;
import H0.U;
import H0.Y;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import J0.I;
import J0.S;
import J0.Z;
import J0.l0;
import J0.m0;
import J0.o0;
import J0.s0;
import J0.v0;
import Ug.K;
import V0.h;
import W0.L;
import W0.T;
import W0.V;
import Y.A1;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import a0.C1538b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1686e0;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.f0;
import c1.C1892a;
import com.google.android.gms.common.api.a;
import i0.C2057k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k0.i;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.C6501x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import lf.C6514M;
import lf.C6521e;
import lf.C6527k;
import m0.C2176b;
import n0.C2228a;
import n0.C2230c;
import n0.C2235h;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2427m;
import qf.C6658d;
import r0.C2458M;
import r0.C2523q0;
import r0.F1;
import r0.M1;
import r0.Z1;
import rf.C6680b;
import t0.C2600a;
import u0.C2673c;
import x3.C2914f;
import x3.C2915g;
import y1.C2930A;
import yf.C6787a;
import yf.C6798l;
import z0.C2951a;
import z0.C2953c;

public final class r extends ViewGroup implements m0, B1, P, DefaultLifecycleObserver {

    /* renamed from: X0  reason: collision with root package name */
    public static final a f13826X0 = new a((DefaultConstructorMarker) null);

    /* renamed from: Y0  reason: collision with root package name */
    public static final int f13827Y0 = 8;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public static Class f13828Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public static Method f13829a1;

    /* renamed from: A  reason: collision with root package name */
    private final C1117h f13830A;

    /* renamed from: A0  reason: collision with root package name */
    private final T f13831A0;

    /* renamed from: B  reason: collision with root package name */
    private final E f13832B;

    /* renamed from: B0  reason: collision with root package name */
    private final AtomicReference f13833B0;

    /* renamed from: C  reason: collision with root package name */
    private C6798l f13834C;

    /* renamed from: C0  reason: collision with root package name */
    private final C1651m1 f13835C0;

    /* renamed from: D  reason: collision with root package name */
    private final l0.d f13836D;

    /* renamed from: D0  reason: collision with root package name */
    private final V0.g f13837D0;

    /* renamed from: E  reason: collision with root package name */
    private boolean f13838E;

    /* renamed from: E0  reason: collision with root package name */
    private final C1510r0 f13839E0;

    /* renamed from: F  reason: collision with root package name */
    private final C1643k f13840F;

    /* renamed from: F0  reason: collision with root package name */
    private int f13841F0;

    /* renamed from: G  reason: collision with root package name */
    private final o0 f13842G;

    /* renamed from: G0  reason: collision with root package name */
    private final C1510r0 f13843G0;

    /* renamed from: H  reason: collision with root package name */
    private boolean f13844H;

    /* renamed from: H0  reason: collision with root package name */
    private final C2951a f13845H0;

    /* renamed from: I  reason: collision with root package name */
    private C1617b0 f13846I;

    /* renamed from: I0  reason: collision with root package name */
    private final A0.c f13847I0;

    /* renamed from: J0  reason: collision with root package name */
    private final I0.f f13848J0;

    /* renamed from: K0  reason: collision with root package name */
    private final p1 f13849K0;
    /* access modifiers changed from: private */

    /* renamed from: L0  reason: collision with root package name */
    public MotionEvent f13850L0;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public long f13851M0;

    /* renamed from: N0  reason: collision with root package name */
    private final C1 f13852N0;

    /* renamed from: O0  reason: collision with root package name */
    private final C1538b f13853O0;
    /* access modifiers changed from: private */

    /* renamed from: P0  reason: collision with root package name */
    public final u f13854P0;

    /* renamed from: Q0  reason: collision with root package name */
    private final Runnable f13855Q0;

    /* renamed from: R0  reason: collision with root package name */
    private boolean f13856R0;

    /* renamed from: S0  reason: collision with root package name */
    private final C6787a f13857S0;

    /* renamed from: T0  reason: collision with root package name */
    private final C1623d0 f13858T0;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f13859U0;

    /* renamed from: V0  reason: collision with root package name */
    private final N0.l f13860V0;

    /* renamed from: W0  reason: collision with root package name */
    private final D0.x f13861W0;

    /* renamed from: a  reason: collision with root package name */
    private long f13862a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13863b = true;

    /* renamed from: c  reason: collision with root package name */
    private final I f13864c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f13865d;

    /* renamed from: e  reason: collision with root package name */
    private final O0.d f13866e;

    /* renamed from: f  reason: collision with root package name */
    private final EmptySemanticsElement f13867f;

    /* renamed from: f0  reason: collision with root package name */
    private C1660r0 f13868f0;

    /* renamed from: g  reason: collision with root package name */
    private final p0.g f13869g;

    /* renamed from: g0  reason: collision with root package name */
    private c1.b f13870g0;

    /* renamed from: h  reason: collision with root package name */
    private final DragAndDropModifierOnDragListener f13871h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f13872h0;

    /* renamed from: i  reason: collision with root package name */
    private qf.g f13873i;

    /* renamed from: i0  reason: collision with root package name */
    private final S f13874i0;

    /* renamed from: j  reason: collision with root package name */
    private final C2230c f13875j;

    /* renamed from: j0  reason: collision with root package name */
    private final v1 f13876j0;

    /* renamed from: k  reason: collision with root package name */
    private final E1 f13877k;

    /* renamed from: k0  reason: collision with root package name */
    private long f13878k0;

    /* renamed from: l  reason: collision with root package name */
    private final k0.i f13879l;

    /* renamed from: l0  reason: collision with root package name */
    private final int[] f13880l0;

    /* renamed from: m  reason: collision with root package name */
    private final k0.i f13881m;

    /* renamed from: m0  reason: collision with root package name */
    private final float[] f13882m0;

    /* renamed from: n  reason: collision with root package name */
    private final C2523q0 f13883n;

    /* renamed from: n0  reason: collision with root package name */
    private final float[] f13884n0;

    /* renamed from: o  reason: collision with root package name */
    private final G f13885o;

    /* renamed from: o0  reason: collision with root package name */
    private final float[] f13886o0;

    /* renamed from: p  reason: collision with root package name */
    private final v0 f13887p;

    /* renamed from: p0  reason: collision with root package name */
    private long f13888p0;

    /* renamed from: q  reason: collision with root package name */
    private final O0.p f13889q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f13890q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C1671x f13891r;

    /* renamed from: r0  reason: collision with root package name */
    private long f13892r0;

    /* renamed from: s  reason: collision with root package name */
    private C2176b f13893s;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f13894s0;

    /* renamed from: t  reason: collision with root package name */
    private final C1640j f13895t;

    /* renamed from: t0  reason: collision with root package name */
    private final C1510r0 f13896t0;

    /* renamed from: u  reason: collision with root package name */
    private final F1 f13897u;

    /* renamed from: u0  reason: collision with root package name */
    private final A1 f13898u0;

    /* renamed from: v  reason: collision with root package name */
    private final l0.w f13899v;

    /* renamed from: v0  reason: collision with root package name */
    private C6798l f13900v0;

    /* renamed from: w  reason: collision with root package name */
    private final List f13901w;

    /* renamed from: w0  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f13902w0;

    /* renamed from: x  reason: collision with root package name */
    private List f13903x;

    /* renamed from: x0  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f13904x0;

    /* renamed from: y  reason: collision with root package name */
    private boolean f13905y;

    /* renamed from: y0  reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f13906y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f13907z;

    /* renamed from: z0  reason: collision with root package name */
    private final V f13908z0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (r.f13828Z0 == null) {
                    r.f13828Z0 = Class.forName(com.amazon.a.a.o.b.at);
                    Class O10 = r.f13828Z0;
                    if (O10 != null) {
                        method = O10.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    r.f13829a1 = method;
                }
                Method K10 = r.f13829a1;
                if (K10 != null) {
                    obj = K10.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C1798v f13909a;

        /* renamed from: b  reason: collision with root package name */
        private final C2914f f13910b;

        public b(C1798v vVar, C2914f fVar) {
            this.f13909a = vVar;
            this.f13910b = fVar;
        }

        public final C1798v a() {
            return this.f13909a;
        }

        public final C2914f b() {
            return this.f13910b;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13911a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(1);
            this.f13911a = rVar;
        }

        public final Boolean a(int i10) {
            boolean z10;
            a.C0001a aVar = A0.a.f420b;
            if (A0.a.f(i10, aVar.b())) {
                z10 = this.f13911a.isInTouchMode();
            } else if (!A0.a.f(i10, aVar.a())) {
                z10 = false;
            } else if (this.f13911a.isInTouchMode()) {
                z10 = this.f13911a.requestFocusFromTouch();
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((A0.a) obj).i());
        }
    }

    public static final class d extends C1677a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f13913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f13914c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13915a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(G g10) {
                return Boolean.valueOf(g10.j0().q(C1239e0.a(8)));
            }
        }

        d(r rVar, G g10, r rVar2) {
            this.f13912a = rVar;
            this.f13913b = g10;
            this.f13914c = rVar2;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            Integer num;
            super.onInitializeAccessibilityNodeInfo(view, a10);
            if (this.f13912a.f13891r.e0()) {
                a10.j1(false);
            }
            G f10 = O0.o.f(this.f13913b, a.f13915a);
            if (f10 != null) {
                num = Integer.valueOf(f10.p0());
            } else {
                num = null;
            }
            if (num == null || num.intValue() == this.f13912a.getSemanticsOwner().a().o()) {
                num = -1;
            }
            a10.Q0(this.f13914c, num.intValue());
            int p02 = this.f13913b.p0();
            int e10 = this.f13912a.f13891r.T().e(p02, -1);
            if (e10 != -1) {
                View h10 = C1645k1.h(this.f13912a.getAndroidViewsHandler$ui_release(), e10);
                if (h10 != null) {
                    a10.g1(h10);
                } else {
                    a10.h1(this.f13914c, e10);
                }
                this.f13912a.b0(p02, a10.k1(), this.f13912a.f13891r.R());
            }
            int e11 = this.f13912a.f13891r.S().e(p02, -1);
            if (e11 != -1) {
                View h11 = C1645k1.h(this.f13912a.getAndroidViewsHandler$ui_release(), e11);
                if (h11 != null) {
                    a10.e1(h11);
                } else {
                    a10.f1(this.f13914c, e11);
                }
                this.f13912a.b0(p02, a10.k1(), this.f13912a.f13891r.Q());
            }
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13916a = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class f extends C6494p implements C6787a {
        f(Object obj) {
            super(0, obj, O.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        /* renamed from: i */
        public final androidx.compose.ui.platform.coreshims.d invoke() {
            return O.g((View) this.receiver);
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyEvent f13918b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(r rVar, KeyEvent keyEvent) {
            super(0);
            this.f13917a = rVar;
            this.f13918b = keyEvent;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(r.super.dispatchKeyEvent(this.f13918b));
        }
    }

    /* synthetic */ class h extends C6494p implements yf.q {
        h(Object obj) {
            super(3, obj, r.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean i(C2235h hVar, long j10, C6798l lVar) {
            return Boolean.valueOf(((r) this.receiver).S0(hVar, j10, lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.c.a(obj);
            return i((C2235h) null, ((C2427m) obj2).o(), (C6798l) obj3);
        }
    }

    /* synthetic */ class i extends C6494p implements C6798l {
        i(Object obj) {
            super(1, obj, r.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void i(C6787a aVar) {
            ((r) this.receiver).h(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((C6787a) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class j extends C6494p implements yf.p {
        j(Object obj) {
            super(2, obj, r.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        /* renamed from: i */
        public final Boolean invoke(androidx.compose.ui.focus.d dVar, C2423i iVar) {
            return Boolean.valueOf(((r) this.receiver).D0(dVar, iVar));
        }
    }

    /* synthetic */ class k extends C6494p implements C6798l {
        k(Object obj) {
            super(1, obj, r.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        public final Boolean i(int i10) {
            return Boolean.valueOf(((r) this.receiver).C0(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return i(((androidx.compose.ui.focus.d) obj).o());
        }
    }

    /* synthetic */ class l extends C6494p implements C6787a {
        l(Object obj) {
            super(0, obj, r.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        public final void invoke() {
            ((r) this.receiver).A0();
        }
    }

    /* synthetic */ class m extends C6494p implements C6787a {
        m(Object obj) {
            super(0, obj, r.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        /* renamed from: i */
        public final C2423i invoke() {
            return ((r) this.receiver).B0();
        }
    }

    /* synthetic */ class n extends C6501x {
        n(Object obj) {
            super(obj, r.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0);
        }

        public Object get() {
            return ((r) this.receiver).getLayoutDirection();
        }

        public void set(Object obj) {
            ((r) this.receiver).setLayoutDirection((c1.t) obj);
        }
    }

    static final class o extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final o f13919a = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    static final class p extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13920a;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f13921a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f13921a = dVar;
            }

            /* renamed from: a */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean z10;
                Boolean k10 = androidx.compose.ui.focus.s.k(focusTargetNode, this.f13921a.o());
                if (k10 != null) {
                    z10 = k10.booleanValue();
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f13922a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f13922a = dVar;
            }

            /* renamed from: a */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean z10;
                Boolean k10 = androidx.compose.ui.focus.s.k(focusTargetNode, this.f13922a.o());
                if (k10 != null) {
                    z10 = k10.booleanValue();
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(r rVar) {
            super(1);
            this.f13920a = rVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            Rect rect;
            androidx.compose.ui.focus.d m02 = this.f13920a.m0(keyEvent);
            if (m02 == null || !B0.c.e(B0.d.b(keyEvent), B0.c.f765a.a())) {
                return Boolean.FALSE;
            }
            C2423i R10 = this.f13920a.B0();
            Boolean b10 = this.f13920a.getFocusOwner().b(m02.o(), R10, new b(m02));
            boolean z11 = true;
            if (b10 != null) {
                z10 = b10.booleanValue();
            } else {
                z10 = true;
            }
            if (z10) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.j.a(m02.o())) {
                return Boolean.FALSE;
            }
            Integer c10 = androidx.compose.ui.focus.h.c(m02.o());
            if (c10 != null) {
                int intValue = c10.intValue();
                if (R10 != null) {
                    rect = Z1.b(R10);
                } else {
                    rect = null;
                }
                if (rect != null) {
                    View I10 = this.f13920a.k0(intValue);
                    if (C6496s.c(I10, this.f13920a)) {
                        I10 = null;
                    }
                    if (I10 != null && androidx.compose.ui.focus.h.b(I10, Integer.valueOf(intValue), rect)) {
                        return Boolean.TRUE;
                    }
                    if (!this.f13920a.getFocusOwner().l(false, true, false, m02.o())) {
                        return Boolean.TRUE;
                    }
                    Boolean b11 = this.f13920a.getFocusOwner().b(m02.o(), (C2423i) null, new a(m02));
                    if (b11 != null) {
                        z11 = b11.booleanValue();
                    }
                    return Boolean.valueOf(z11);
                }
                throw new IllegalStateException("Invalid rect");
            }
            throw new IllegalStateException("Invalid focus direction");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((B0.b) obj).f());
        }
    }

    public static final class q implements D0.x {

        /* renamed from: a  reason: collision with root package name */
        private C1130v f13923a = C1130v.f1507a.a();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f13924b;

        q(r rVar) {
            this.f13924b = rVar;
        }

        public void a(C1130v vVar) {
            if (vVar == null) {
                vVar = C1130v.f1507a.a();
            }
            this.f13923a = vVar;
            K.f13595a.a(this.f13924b, vVar);
        }
    }

    /* renamed from: androidx.compose.ui.platform.r$r  reason: collision with other inner class name */
    static final class C0262r extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f13926b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0262r(r rVar, androidx.compose.ui.viewinterop.c cVar) {
            super(0);
            this.f13925a = rVar;
            this.f13926b = cVar;
        }

        public final void invoke() {
            this.f13925a.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f13926b);
            HashMap<G, androidx.compose.ui.viewinterop.c> layoutNodeToHolder = this.f13925a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            kotlin.jvm.internal.V.d(layoutNodeToHolder).remove(this.f13925a.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f13926b));
            this.f13926b.setImportantForAccessibility(0);
        }
    }

    static final class s extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13927a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(int i10) {
            super(1);
            this.f13927a = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z10;
            Boolean k10 = androidx.compose.ui.focus.s.k(focusTargetNode, this.f13927a);
            if (k10 != null) {
                z10 = k10.booleanValue();
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class t extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13928a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(r rVar) {
            super(0);
            this.f13928a = rVar;
        }

        public final void invoke() {
            MotionEvent L10 = this.f13928a.f13850L0;
            if (L10 != null) {
                int actionMasked = L10.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    this.f13928a.f13851M0 = SystemClock.uptimeMillis();
                    r rVar = this.f13928a;
                    rVar.post(rVar.f13854P0);
                }
            }
        }
    }

    public static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13929a;

        u(r rVar) {
            this.f13929a = rVar;
        }

        public void run() {
            this.f13929a.removeCallbacks(this);
            MotionEvent L10 = this.f13929a.f13850L0;
            if (L10 != null) {
                boolean z10 = false;
                if (L10.getToolType(0) == 3) {
                    z10 = true;
                }
                int actionMasked = L10.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (!(actionMasked == 7 || actionMasked == 9)) {
                    i10 = 2;
                }
                r rVar = this.f13929a;
                rVar.Q0(L10, i10, rVar.f13851M0, false);
            }
        }
    }

    static final class v extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final v f13930a = new v();

        v() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(F0.b bVar) {
            return Boolean.FALSE;
        }
    }

    static final class w extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13931a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(r rVar) {
            super(1);
            this.f13931a = rVar;
        }

        /* access modifiers changed from: private */
        public static final void c(C6787a aVar) {
            aVar.invoke();
        }

        public final void b(C6787a aVar) {
            Looper looper;
            Handler handler = this.f13931a.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = this.f13931a.getHandler();
            if (handler2 != null) {
                handler2.post(new C1661s(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C6787a) obj);
            return C6514M.f71813a;
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f13932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f13933b;

        /* renamed from: c  reason: collision with root package name */
        int f13934c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(r rVar, C6658d dVar) {
            super(dVar);
            this.f13933b = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13932a = obj;
            this.f13934c |= Integer.MIN_VALUE;
            return this.f13933b.k((yf.p) null, this);
        }
    }

    static final class y extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13935a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(r rVar) {
            super(1);
            this.f13935a = rVar;
        }

        /* renamed from: a */
        public final Q invoke(K k10) {
            r rVar = this.f13935a;
            return new Q(rVar, rVar.getTextInputService(), k10);
        }
    }

    static final class z extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13936a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(r rVar) {
            super(0);
            this.f13936a = rVar;
        }

        /* renamed from: a */
        public final b invoke() {
            return this.f13936a.get_viewTreeOwners();
        }
    }

    public r(Context context, qf.g gVar) {
        super(context);
        l0.d dVar;
        int i10;
        C1623d0 d0Var;
        C2421g.a aVar = C2421g.f25320b;
        this.f13862a = aVar.b();
        N0.l lVar = null;
        this.f13864c = new I((C2600a) null, 1, (DefaultConstructorMarker) null);
        this.f13865d = p1.h(C1892a.a(context), p1.n());
        O0.d dVar2 = new O0.d();
        this.f13866e = dVar2;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar2);
        this.f13867f = emptySemanticsElement;
        this.f13869g = new FocusOwnerImpl(new i(this), new j(this), new k(this), new l(this), new m(this), new n(this));
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(this));
        this.f13871h = dragAndDropModifierOnDragListener;
        this.f13873i = gVar;
        this.f13875j = dragAndDropModifierOnDragListener;
        this.f13877k = new E1();
        i.a aVar2 = k0.i.f23074a;
        k0.i a10 = androidx.compose.ui.input.key.a.a(aVar2, new p(this));
        this.f13879l = a10;
        k0.i a11 = androidx.compose.ui.input.rotary.a.a(aVar2, v.f13930a);
        this.f13881m = a11;
        this.f13883n = new C2523q0();
        G g10 = new G(false, 0, 3, (DefaultConstructorMarker) null);
        g10.g(Y.f2557b);
        g10.b(getDensity());
        g10.n(aVar2.h(emptySemanticsElement).h(a11).h(a10).h(getFocusOwner().k()).h(dragAndDropModifierOnDragListener.d()));
        this.f13885o = g10;
        this.f13887p = this;
        this.f13889q = new O0.p(getRoot(), dVar2);
        C1671x xVar = new C1671x(this);
        this.f13891r = xVar;
        this.f13893s = new C2176b(this, new f(this));
        this.f13895t = new C1640j(context);
        this.f13897u = C2458M.a(this);
        this.f13899v = new l0.w();
        this.f13901w = new ArrayList();
        this.f13830A = new C1117h();
        this.f13832B = new E(getRoot());
        this.f13834C = e.f13916a;
        if (c0()) {
            dVar = new l0.d(this, getAutofillTree());
        } else {
            dVar = null;
        }
        this.f13836D = dVar;
        this.f13840F = new C1643k(context);
        this.f13842G = new o0(new w(this));
        this.f13874i0 = new S(getRoot());
        this.f13876j0 = new X(ViewConfiguration.get(context));
        this.f13878k0 = c1.o.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);
        this.f13880l0 = new int[]{0, 0};
        float[] c10 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f13882m0 = c10;
        this.f13884n0 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f13886o0 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f13888p0 = -1;
        this.f13892r0 = aVar.a();
        this.f13894s0 = true;
        this.f13896t0 = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f13898u0 = p1.e(new z(this));
        this.f13902w0 = new C1652n(this);
        this.f13904x0 = new C1654o(this);
        this.f13906y0 = new C1656p(this);
        V v10 = new V(getView(), this);
        this.f13908z0 = v10;
        this.f13831A0 = new T((L) O.h().invoke(v10));
        this.f13833B0 = k0.p.a();
        this.f13835C0 = new C1650m0(getTextInputService());
        this.f13837D0 = new P(context);
        this.f13839E0 = p1.h(V0.k.a(context), p1.n());
        this.f13841F0 = n0(context.getResources().getConfiguration());
        c1.t e10 = androidx.compose.ui.focus.h.e(context.getResources().getConfiguration().getLayoutDirection());
        this.f13843G0 = u1.d(e10 == null ? c1.t.Ltr : e10, (o1) null, 2, (Object) null);
        this.f13845H0 = new C2953c(this);
        if (isInTouchMode()) {
            i10 = A0.a.f420b.b();
        } else {
            i10 = A0.a.f420b.a();
        }
        this.f13847I0 = new A0.c(i10, new c(this), (DefaultConstructorMarker) null);
        this.f13848J0 = new I0.f(this);
        this.f13849K0 = new S(this);
        this.f13852N0 = new C1();
        this.f13853O0 = new C1538b(new C6787a[16], 0);
        this.f13854P0 = new u(this);
        this.f13855Q0 = new C1658q(this);
        this.f13857S0 = new t(this);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
            d0Var = new C1626e0(c10, (DefaultConstructorMarker) null);
        } else {
            d0Var = new C1632g0();
        }
        this.f13858T0 = d0Var;
        addOnAttachStateChangeListener(this.f13893s);
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            N.f13613a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C1680b0.o0(this, xVar);
        C6798l a12 = B1.f13494T.a();
        if (a12 != null) {
            a12.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().u(this);
        if (i11 >= 29) {
            D.f13504a.a(this);
        }
        this.f13860V0 = i11 >= 31 ? new N0.l() : lVar;
        this.f13861W0 = new q(this);
    }

    /* access modifiers changed from: private */
    public final void A0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* access modifiers changed from: private */
    public final C2423i B0() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return androidx.compose.ui.focus.h.a(findFocus);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final boolean C0(int i10) {
        Rect rect;
        View view;
        d.a aVar = androidx.compose.ui.focus.d.f13315b;
        if (androidx.compose.ui.focus.d.l(i10, aVar.b()) || androidx.compose.ui.focus.d.l(i10, aVar.c())) {
            return false;
        }
        Integer c10 = androidx.compose.ui.focus.h.c(i10);
        if (c10 != null) {
            int intValue = c10.intValue();
            C2423i B02 = B0();
            if (B02 != null) {
                rect = Z1.b(B02);
            } else {
                rect = null;
            }
            FocusFinder instance = FocusFinder.getInstance();
            if (rect == null) {
                view = instance.findNextFocus(this, findFocus(), intValue);
            } else {
                view = instance.findNextFocusFromRect(this, rect, intValue);
            }
            if (view != null) {
                return androidx.compose.ui.focus.h.b(view, Integer.valueOf(intValue), rect);
            }
            return false;
        }
        throw new IllegalStateException("Invalid focus direction");
    }

    /* access modifiers changed from: private */
    public final boolean D0(androidx.compose.ui.focus.d dVar, C2423i iVar) {
        int i10;
        Rect rect;
        Integer c10;
        if (isFocused() || hasFocus()) {
            return true;
        }
        if (dVar == null || (c10 = androidx.compose.ui.focus.h.c(dVar.o())) == null) {
            i10 = 130;
        } else {
            i10 = c10.intValue();
        }
        if (iVar != null) {
            rect = Z1.b(iVar);
        } else {
            rect = null;
        }
        return super.requestFocus(i10, rect);
    }

    private final long E0(int i10, int i11) {
        return C6508G.b(C6508G.b((long) i11) | C6508G.b(C6508G.b((long) i10) << 32));
    }

    private final void F0() {
        if (!this.f13890q0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f13888p0) {
                this.f13888p0 = currentAnimationTimeMillis;
                H0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f13880l0);
                int[] iArr = this.f13880l0;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f13880l0;
                this.f13892r0 = C2422h.a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void G0(MotionEvent motionEvent) {
        this.f13888p0 = AnimationUtils.currentAnimationTimeMillis();
        H0();
        long f10 = M1.f(this.f13884n0, C2422h.a(motionEvent.getX(), motionEvent.getY()));
        this.f13892r0 = C2422h.a(motionEvent.getRawX() - C2421g.m(f10), motionEvent.getRawY() - C2421g.n(f10));
    }

    private final void H0() {
        this.f13858T0.a(this, this.f13884n0);
        D0.a(this.f13884n0, this.f13886o0);
    }

    private final void L0(G g10) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (g10 != null) {
                while (g10 != null && g10.f0() == G.g.InMeasureBlock && f0(g10)) {
                    g10 = g10.n0();
                }
                if (g10 == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    static /* synthetic */ void M0(r rVar, G g10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = null;
        }
        rVar.L0(g10);
    }

    /* access modifiers changed from: private */
    public static final void N0(r rVar) {
        rVar.U0();
    }

    /* access modifiers changed from: private */
    public static final void O0(r rVar) {
        rVar.f13856R0 = false;
        MotionEvent motionEvent = rVar.f13850L0;
        C6496s.e(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            rVar.P0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
    }

    private final int P0(MotionEvent motionEvent) {
        Object obj;
        if (this.f13859U0) {
            this.f13859U0 = false;
            this.f13877k.b(N.b(motionEvent.getMetaState()));
        }
        C c10 = this.f13830A.c(motionEvent, this);
        if (c10 != null) {
            List b10 = c10.b();
            int size = b10.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    obj = b10.get(size);
                    if (((D) obj).b()) {
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        size = i10;
                    }
                }
            }
            obj = null;
            D d10 = (D) obj;
            if (d10 != null) {
                this.f13862a = d10.f();
            }
            int b11 = this.f13832B.b(c10, this, x0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || Q.c(b11)) {
                return b11;
            }
            this.f13830A.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return b11;
        }
        this.f13832B.c();
        return F.a(false, false);
    }

    /* access modifiers changed from: private */
    public final void Q0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int i11;
        int i12;
        long j11;
        int i13;
        MotionEvent motionEvent2 = motionEvent;
        int i14 = i10;
        int actionMasked = motionEvent.getActionMasked();
        int i15 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i15 = motionEvent.getActionIndex();
            }
        } else if (!(i14 == 9 || i14 == 10)) {
            i15 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i15 >= 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i16 = pointerCount - i11;
        if (i16 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                pointerPropertiesArr[i17] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i16];
            for (int i18 = 0; i18 < i16; i18++) {
                pointerCoordsArr[i18] = new MotionEvent.PointerCoords();
            }
            for (int i19 = 0; i19 < i16; i19++) {
                if (i15 < 0 || i19 < i15) {
                    i13 = 0;
                } else {
                    i13 = 1;
                }
                int i20 = i13 + i19;
                motionEvent2.getPointerProperties(i20, pointerPropertiesArr[i19]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i19];
                motionEvent2.getPointerCoords(i20, pointerCoords);
                long u10 = u(C2422h.a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = C2421g.m(u10);
                pointerCoords.y = C2421g.n(u10);
            }
            if (z10) {
                i12 = 0;
            } else {
                i12 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j11 = j10;
            } else {
                j11 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j11, j10, i10, i16, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i12, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            C c10 = this.f13830A.c(obtain, this);
            C6496s.e(c10);
            this.f13832B.b(c10, this, true);
            obtain.recycle();
        }
    }

    static /* synthetic */ void R0(r rVar, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        rVar.Q0(motionEvent, i10, j10, z10);
    }

    /* access modifiers changed from: private */
    public final boolean S0(C2235h hVar, long j10, C6798l lVar) {
        Resources resources = getContext().getResources();
        return E.f13511a.a(this, hVar, new C2228a(c1.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, lVar, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final void T0(r rVar, boolean z10) {
        int i10;
        A0.c cVar = rVar.f13847I0;
        if (z10) {
            i10 = A0.a.f420b.b();
        } else {
            i10 = A0.a.f420b.a();
        }
        cVar.b(i10);
    }

    private final void U0() {
        getLocationOnScreen(this.f13880l0);
        long j10 = this.f13878k0;
        int j11 = c1.n.j(j10);
        int k10 = c1.n.k(j10);
        int[] iArr = this.f13880l0;
        boolean z10 = false;
        int i10 = iArr[0];
        if (!(j11 == i10 && k10 == iArr[1])) {
            this.f13878k0 = c1.o.a(i10, iArr[1]);
            if (!(j11 == Integer.MAX_VALUE || k10 == Integer.MAX_VALUE)) {
                getRoot().U().I().S1();
                z10 = true;
            }
        }
        this.f13874i0.c(z10);
    }

    /* access modifiers changed from: private */
    public final void b0(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e10;
        if (C6496s.c(str, this.f13891r.R())) {
            int e11 = this.f13891r.T().e(i10, -1);
            if (e11 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e11);
            }
        } else if (C6496s.c(str, this.f13891r.Q()) && (e10 = this.f13891r.S().e(i10, -1)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, e10);
        }
    }

    private final boolean c0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private final boolean f0(G g10) {
        G n02;
        if (this.f13872h0 || ((n02 = g10.n0()) != null && !n02.N())) {
            return true;
        }
        return false;
    }

    private final void g0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof r) {
                ((r) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                g0((ViewGroup) childAt);
            }
        }
    }

    @C6521e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.f13896t0.getValue();
    }

    private final long h0(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return E0(0, size);
        }
        if (mode == 0) {
            return E0(0, a.e.API_PRIORITY_OTHER);
        }
        if (mode == 1073741824) {
            return E0(size, size);
        }
        throw new IllegalStateException();
    }

    private final void i0() {
        if (this.f13907z) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f13907z = false;
        }
    }

    /* access modifiers changed from: private */
    public final View k0(int i10) {
        View view = this;
        while (view != null) {
            FocusFinder instance = FocusFinder.getInstance();
            View rootView = getRootView();
            C6496s.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            view = instance.findNextFocus((ViewGroup) rootView, view, i10);
            if (view != null && !O.e(this, view)) {
                return view;
            }
        }
        return null;
    }

    private final View l0(int i10, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class[]) null);
            declaredMethod.setAccessible(true);
            if (C6496s.c(declaredMethod.invoke(view, (Object[]) null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View l02 = l0(i10, viewGroup.getChildAt(i11));
                    if (l02 != null) {
                        return l02;
                    }
                }
            }
        }
        return null;
    }

    private final int n0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final void o0(r rVar) {
        rVar.U0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int p0(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            androidx.compose.ui.platform.r$u r1 = r9.f13854P0
            r9.removeCallbacks(r1)
            r10 = 0
            r17.G0(r18)     // Catch:{ all -> 0x0125 }
            r11 = 1
            r9.f13890q0 = r11     // Catch:{ all -> 0x0125 }
            r9.a(r10)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0125 }
            int r12 = r18.getActionMasked()     // Catch:{ all -> 0x002b }
            android.view.MotionEvent r13 = r9.f13850L0     // Catch:{ all -> 0x002b }
            r14 = 3
            if (r13 == 0) goto L_0x0029
            int r1 = r13.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0029
            r15 = r11
            goto L_0x002e
        L_0x0029:
            r15 = r10
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            goto L_0x0127
        L_0x002e:
            r8 = 10
            if (r13 == 0) goto L_0x0043
            boolean r1 = r9.r0(r0, r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r9.w0(r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0045
            D0.E r1 = r9.f13832B     // Catch:{ all -> 0x002b }
            r1.c()     // Catch:{ all -> 0x002b }
        L_0x0043:
            r11 = r8
            goto L_0x0061
        L_0x0045:
            int r1 = r13.getActionMasked()     // Catch:{ all -> 0x002b }
            if (r1 == r8) goto L_0x0043
            if (r15 == 0) goto L_0x0043
            long r4 = r13.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r16 = 0
            r3 = 10
            r6 = 0
            r1 = r17
            r2 = r13
            r11 = r8
            r8 = r16
            R0(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
        L_0x0061:
            int r1 = r0.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = r10
        L_0x006a:
            r8 = 9
            if (r15 != 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            if (r12 == r14) goto L_0x008e
            if (r12 == r8) goto L_0x008e
            boolean r1 = r17.x0(r18)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x008e
            long r4 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r12 = 0
            r3 = 9
            r6 = 0
            r1 = r17
            r2 = r18
            r14 = r8
            r8 = r12
            R0(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
            goto L_0x008f
        L_0x008e:
            r14 = r8
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.recycle()     // Catch:{ all -> 0x002b }
        L_0x0094:
            android.view.MotionEvent r1 = r9.f13850L0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0115
            int r1 = r1.getAction()     // Catch:{ all -> 0x002b }
            if (r1 != r11) goto L_0x0115
            android.view.MotionEvent r1 = r9.f13850L0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x00a7
            int r1 = r1.getPointerId(r10)     // Catch:{ all -> 0x002b }
            goto L_0x00a8
        L_0x00a7:
            r1 = -1
        L_0x00a8:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != r14) goto L_0x00bc
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x00bc
            if (r1 < 0) goto L_0x0115
            D0.h r2 = r9.f13830A     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0115
        L_0x00bc:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            android.view.MotionEvent r2 = r9.f13850L0     // Catch:{ all -> 0x002b }
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L_0x00d3
            float r2 = r2.getX()     // Catch:{ all -> 0x002b }
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            android.view.MotionEvent r4 = r9.f13850L0     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x00dc
            float r3 = r4.getY()     // Catch:{ all -> 0x002b }
        L_0x00dc:
            float r4 = r18.getX()     // Catch:{ all -> 0x002b }
            float r5 = r18.getY()     // Catch:{ all -> 0x002b }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            r2 = r10
            goto L_0x00ef
        L_0x00ee:
            r2 = 1
        L_0x00ef:
            android.view.MotionEvent r3 = r9.f13850L0     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x00f8
            long r3 = r3.getEventTime()     // Catch:{ all -> 0x002b }
            goto L_0x00fa
        L_0x00f8:
            r3 = -1
        L_0x00fa:
            long r5 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            r11 = 1
            goto L_0x0105
        L_0x0104:
            r11 = r10
        L_0x0105:
            if (r2 != 0) goto L_0x0109
            if (r11 == 0) goto L_0x0115
        L_0x0109:
            if (r1 < 0) goto L_0x0110
            D0.h r2 = r9.f13830A     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
        L_0x0110:
            D0.E r1 = r9.f13832B     // Catch:{ all -> 0x002b }
            r1.a()     // Catch:{ all -> 0x002b }
        L_0x0115:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r18)     // Catch:{ all -> 0x002b }
            r9.f13850L0 = r1     // Catch:{ all -> 0x002b }
            int r0 = r17.P0(r18)     // Catch:{ all -> 0x002b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            r9.f13890q0 = r10
            return r0
        L_0x0125:
            r0 = move-exception
            goto L_0x012b
        L_0x0127:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x012b:
            r9.f13890q0 = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.p0(android.view.MotionEvent):int");
    }

    private final boolean q0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().q(new F0.b(f10 * C1686e0.j(viewConfiguration, getContext()), f10 * C1686e0.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean r0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private void setDensity(c1.d dVar) {
        this.f13865d.setValue(dVar);
    }

    private void setFontFamilyResolver(h.b bVar) {
        this.f13839E0.setValue(bVar);
    }

    /* access modifiers changed from: private */
    public void setLayoutDirection(c1.t tVar) {
        this.f13843G0.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f13896t0.setValue(bVar);
    }

    private final void t0(G g10) {
        g10.D0();
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                t0((G) p10[i10]);
                i10++;
            } while (i10 < q10);
        }
    }

    private final void u0(G g10) {
        int i10 = 0;
        S.G(this.f13874i0, g10, false, 2, (Object) null);
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            do {
                u0((G) p10[i10]);
                i10++;
            } while (i10 < q10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082 A[LOOP:0: B:20:0x004c->B:36:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[EDGE_INSN: B:38:0x0085->B:37:0x0085 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean v0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            if (r0 != 0) goto L_0x0085
            int r1 = r7.getPointerCount()
            r4 = r3
        L_0x004c:
            if (r4 >= r1) goto L_0x0085
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L_0x007f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x007f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L_0x007f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x007f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L_0x007d
            androidx.compose.ui.platform.H0 r0 = androidx.compose.ui.platform.H0.f13528a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            if (r0 != 0) goto L_0x0085
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.v0(android.view.MotionEvent):boolean");
    }

    private final boolean w0(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean x0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f > x10 || x10 > ((float) getWidth()) || 0.0f > y10 || y10 > ((float) getHeight())) {
            return false;
        }
        return true;
    }

    private final boolean y0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f13850L0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    public void A(G g10, boolean z10, boolean z11) {
        if (z10) {
            if (this.f13874i0.B(g10, z11)) {
                M0(this, (G) null, 1, (Object) null);
            }
        } else if (this.f13874i0.E(g10, z11)) {
            M0(this, (G) null, 1, (Object) null);
        }
    }

    public final boolean I0(l0 l0Var) {
        if (this.f13868f0 != null) {
            w1.f13987p.b();
        }
        this.f13852N0.c(l0Var);
        return true;
    }

    public final void J0(androidx.compose.ui.viewinterop.c cVar) {
        h(new C0262r(this, cVar));
    }

    public final void K0() {
        this.f13838E = true;
    }

    public void a(boolean z10) {
        C6787a aVar;
        if (this.f13874i0.m() || this.f13874i0.n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    aVar = this.f13857S0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                aVar = null;
            }
            if (this.f13874i0.r(aVar)) {
                requestLayout();
            }
            S.d(this.f13874i0, false, 1, (Object) null);
            i0();
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
        }
    }

    public final void a0(androidx.compose.ui.viewinterop.c cVar, G g10) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(cVar, g10);
        getAndroidViewsHandler$ui_release().addView(cVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(g10, cVar);
        cVar.setImportantForAccessibility(1);
        C1680b0.o0(cVar, new d(this, g10, this));
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void autofill(SparseArray sparseArray) {
        l0.d dVar;
        if (c0() && (dVar = this.f13836D) != null) {
            l0.f.a(dVar, sparseArray);
        }
    }

    public void b(G g10, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (this.f13874i0.C(g10, z11) && z12) {
                L0(g10);
            }
        } else if (this.f13874i0.F(g10, z11) && z12) {
            L0(g10);
        }
    }

    public boolean canScrollHorizontally(int i10) {
        return this.f13891r.C(false, i10, this.f13862a);
    }

    public boolean canScrollVertically(int i10) {
        return this.f13891r.C(true, i10, this.f13862a);
    }

    public long d(long j10) {
        F0();
        return M1.f(this.f13884n0, j10);
    }

    public final Object d0(C6658d dVar) {
        Object B10 = this.f13891r.B(dVar);
        if (B10 == C6680b.f()) {
            return B10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            t0(getRoot());
        }
        m0.j(this, false, 1, (Object) null);
        C2057k.f21728e.n();
        this.f13905y = true;
        C2523q0 q0Var = this.f13883n;
        Canvas a10 = q0Var.a().a();
        q0Var.a().z(canvas);
        getRoot().B(q0Var.a(), (C2673c) null);
        q0Var.a().z(a10);
        if (!this.f13901w.isEmpty()) {
            int size = this.f13901w.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l0) this.f13901w.get(i10)).k();
            }
        }
        if (w1.f13987p.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f13901w.clear();
        this.f13905y = false;
        List list = this.f13903x;
        if (list != null) {
            C6496s.e(list);
            this.f13901w.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f13856R0) {
            removeCallbacks(this.f13855Q0);
            if (motionEvent.getActionMasked() == 8) {
                this.f13856R0 = false;
            } else {
                this.f13855Q0.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (v0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return q0(motionEvent);
        }
        return Q.c(p0(motionEvent));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f13856R0) {
            removeCallbacks(this.f13855Q0);
            this.f13855Q0.run();
        }
        if (v0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f13891r.K(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && x0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f13850L0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f13850L0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f13856R0 = true;
                postDelayed(this.f13855Q0, 8);
                return false;
            }
        } else if (!y0(motionEvent)) {
            return false;
        }
        return Q.c(p0(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().h(B0.b.b(keyEvent), new g(this, keyEvent));
        }
        this.f13877k.b(N.b(keyEvent.getMetaState()));
        if (p0.g.a(getFocusOwner(), B0.b.b(keyEvent), (C6787a) null, 2, (Object) null) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if ((!isFocused() || !getFocusOwner().f(B0.b.b(keyEvent))) && !super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            B.f13493a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13856R0) {
            removeCallbacks(this.f13855Q0);
            MotionEvent motionEvent2 = this.f13850L0;
            C6496s.e(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || r0(motionEvent, motionEvent2)) {
                this.f13855Q0.run();
            } else {
                this.f13856R0 = false;
            }
        }
        if (v0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !y0(motionEvent)) {
            return false;
        }
        int p02 = p0(motionEvent);
        if (Q.b(p02)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return Q.c(p02);
    }

    public void e(G g10, boolean z10) {
        this.f13874i0.i(g10, z10);
    }

    public final Object e0(C6658d dVar) {
        Object b10 = this.f13893s.b(dVar);
        if (b10 == C6680b.f()) {
            return b10;
        }
        return C6514M.f71813a;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return l0(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i10)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public View focusSearch(View view, int i10) {
        int i11;
        if (view != null) {
            C2423i a10 = androidx.compose.ui.focus.h.a(view);
            androidx.compose.ui.focus.d d10 = androidx.compose.ui.focus.h.d(i10);
            if (d10 != null) {
                i11 = d10.o();
            } else {
                i11 = androidx.compose.ui.focus.d.f13315b.a();
            }
            if (C6496s.c(getFocusOwner().b(i11, a10, o.f13919a), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i10);
    }

    public void g(View view) {
        this.f13907z = true;
    }

    public final C1617b0 getAndroidViewsHandler$ui_release() {
        if (this.f13846I == null) {
            C1617b0 b0Var = new C1617b0(getContext());
            this.f13846I = b0Var;
            addView(b0Var);
            requestLayout();
        }
        C1617b0 b0Var2 = this.f13846I;
        C6496s.e(b0Var2);
        return b0Var2;
    }

    public l0.g getAutofill() {
        return this.f13836D;
    }

    public l0.w getAutofillTree() {
        return this.f13899v;
    }

    public final C6798l getConfigurationChangeObserver() {
        return this.f13834C;
    }

    public final C2176b getContentCaptureManager$ui_release() {
        return this.f13893s;
    }

    public qf.g getCoroutineContext() {
        return this.f13873i;
    }

    public c1.d getDensity() {
        return (c1.d) this.f13865d.getValue();
    }

    public C2230c getDragAndDropManager() {
        return this.f13875j;
    }

    public p0.g getFocusOwner() {
        return this.f13869g;
    }

    public void getFocusedRect(Rect rect) {
        C6514M m10;
        C2423i B02 = B0();
        if (B02 != null) {
            rect.left = Math.round(B02.i());
            rect.top = Math.round(B02.l());
            rect.right = Math.round(B02.j());
            rect.bottom = Math.round(B02.e());
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            super.getFocusedRect(rect);
        }
    }

    public h.b getFontFamilyResolver() {
        return (h.b) this.f13839E0.getValue();
    }

    public V0.g getFontLoader() {
        return this.f13837D0;
    }

    public F1 getGraphicsContext() {
        return this.f13897u;
    }

    public C2951a getHapticFeedBack() {
        return this.f13845H0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f13874i0.m();
    }

    public A0.b getInputModeManager() {
        return this.f13847I0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f13888p0;
    }

    public c1.t getLayoutDirection() {
        return (c1.t) this.f13843G0.getValue();
    }

    public long getMeasureIteration() {
        return this.f13874i0.q();
    }

    public I0.f getModifierLocalManager() {
        return this.f13848J0;
    }

    public U.a getPlacementScope() {
        return H0.V.b(this);
    }

    public D0.x getPointerIconService() {
        return this.f13861W0;
    }

    public G getRoot() {
        return this.f13885o;
    }

    public v0 getRootForTest() {
        return this.f13887p;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        N0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f13860V0) == null) {
            return false;
        }
        return lVar.c();
    }

    public O0.p getSemanticsOwner() {
        return this.f13889q;
    }

    public I getSharedDrawScope() {
        return this.f13864c;
    }

    public boolean getShowLayoutBounds() {
        return this.f13844H;
    }

    public o0 getSnapshotObserver() {
        return this.f13842G;
    }

    public C1651m1 getSoftwareKeyboardController() {
        return this.f13835C0;
    }

    public T getTextInputService() {
        return this.f13831A0;
    }

    public p1 getTextToolbar() {
        return this.f13849K0;
    }

    public View getView() {
        return this;
    }

    public v1 getViewConfiguration() {
        return this.f13876j0;
    }

    public final b getViewTreeOwners() {
        return (b) this.f13898u0.getValue();
    }

    public D1 getWindowInfo() {
        return this.f13877k;
    }

    public void h(C6787a aVar) {
        if (!this.f13853O0.j(aVar)) {
            this.f13853O0.b(aVar);
        }
    }

    public final void j0(androidx.compose.ui.viewinterop.c cVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(cVar, canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(yf.p r5, qf.C6658d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.r.x
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.platform.r$x r0 = (androidx.compose.ui.platform.r.x) r0
            int r1 = r0.f13934c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13934c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.r$x r0 = new androidx.compose.ui.platform.r$x
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13932a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f13934c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            lf.w.b(r6)
            goto L_0x0044
        L_0x0031:
            lf.w.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.f13833B0
            androidx.compose.ui.platform.r$y r2 = new androidx.compose.ui.platform.r$y
            r2.<init>(r4)
            r0.f13934c = r3
            java.lang.Object r5 = k0.p.d(r6, r2, r5, r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            lf.k r5 = new lf.k
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.k(yf.p, qf.d):java.lang.Object");
    }

    public void m(G g10, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f13874i0.s(g10, j10);
            if (!this.f13874i0.m()) {
                S.d(this.f13874i0, false, 1, (Object) null);
                i0();
            }
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public androidx.compose.ui.focus.d m0(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        long a10 = B0.d.a(keyEvent);
        a.C0004a aVar = B0.a.f613b;
        if (B0.a.p(a10, aVar.l())) {
            if (B0.d.f(keyEvent)) {
                i10 = androidx.compose.ui.focus.d.f13315b.f();
            } else {
                i10 = androidx.compose.ui.focus.d.f13315b.e();
            }
            return androidx.compose.ui.focus.d.i(i10);
        } else if (B0.a.p(a10, aVar.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.g());
        } else {
            if (B0.a.p(a10, aVar.d())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.d());
            }
            boolean z14 = true;
            if (B0.a.p(a10, aVar.f())) {
                z10 = true;
            } else {
                z10 = B0.a.p(a10, aVar.k());
            }
            if (z10) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.h());
            }
            if (B0.a.p(a10, aVar.c())) {
                z11 = true;
            } else {
                z11 = B0.a.p(a10, aVar.j());
            }
            if (z11) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.a());
            }
            if (B0.a.p(a10, aVar.b())) {
                z12 = true;
            } else {
                z12 = B0.a.p(a10, aVar.g());
            }
            if (z12) {
                z13 = true;
            } else {
                z13 = B0.a.p(a10, aVar.i());
            }
            if (z13) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.b());
            }
            if (!B0.a.p(a10, aVar.a())) {
                z14 = B0.a.p(a10, aVar.h());
            }
            if (z14) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f13315b.c());
            }
            return null;
        }
    }

    public long o(long j10) {
        F0();
        return M1.f(this.f13886o0, C2422h.a(C2421g.m(j10) - C2421g.m(this.f13892r0), C2421g.n(j10) - C2421g.n(this.f13892r0)));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i10;
        C1798v a10;
        C1798v a11;
        C1790m lifecycle;
        l0.d dVar;
        super.onAttachedToWindow();
        this.f13877k.c(hasWindowFocus());
        u0(getRoot());
        t0(getRoot());
        getSnapshotObserver().k();
        if (c0() && (dVar = this.f13836D) != null) {
            l0.v.f23484a.a(dVar);
        }
        C1798v a12 = f0.a(this);
        C2914f a13 = C2915g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        C1790m mVar = null;
        if (viewTreeOwners == null || !(a12 == null || a13 == null || (a12 == viewTreeOwners.a() && a13 == viewTreeOwners.a()))) {
            if (a12 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a13 != null) {
                if (!(viewTreeOwners == null || (a11 = viewTreeOwners.a()) == null || (lifecycle = a11.getLifecycle()) == null)) {
                    lifecycle.d(this);
                }
                a12.getLifecycle().a(this);
                b bVar = new b(a12, a13);
                set_viewTreeOwners(bVar);
                C6798l lVar = this.f13900v0;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.f13900v0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        A0.c cVar = this.f13847I0;
        if (isInTouchMode()) {
            i10 = A0.a.f420b.b();
        } else {
            i10 = A0.a.f420b.a();
        }
        cVar.b(i10);
        b viewTreeOwners2 = getViewTreeOwners();
        if (!(viewTreeOwners2 == null || (a10 = viewTreeOwners2.a()) == null)) {
            mVar = a10.getLifecycle();
        }
        if (mVar != null) {
            mVar.a(this);
            mVar.a(this.f13893s);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f13902w0);
            getViewTreeObserver().addOnScrollChangedListener(this.f13904x0);
            getViewTreeObserver().addOnTouchModeChangeListener(this.f13906y0);
            if (Build.VERSION.SDK_INT >= 31) {
                J.f13579a.b(this);
                return;
            }
            return;
        }
        G0.a.c("No lifecycle owner exists");
        throw new C6527k();
    }

    public boolean onCheckIsTextEditor() {
        Q q10 = (Q) k0.p.c(this.f13833B0);
        if (q10 == null) {
            return this.f13908z0.r();
        }
        return q10.f();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(C1892a.a(getContext()));
        if (n0(configuration) != this.f13841F0) {
            this.f13841F0 = n0(configuration);
            setFontFamilyResolver(V0.k.a(getContext()));
        }
        this.f13834C.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Q q10 = (Q) k0.p.c(this.f13833B0);
        if (q10 == null) {
            return this.f13908z0.o(editorInfo);
        }
        return q10.e(editorInfo);
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f13893s.q(jArr, iArr, consumer);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1790m mVar;
        l0.d dVar;
        C1798v a10;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a10 = viewTreeOwners.a()) == null) {
            mVar = null;
        } else {
            mVar = a10.getLifecycle();
        }
        if (mVar != null) {
            mVar.d(this.f13893s);
            mVar.d(this);
            if (c0() && (dVar = this.f13836D) != null) {
                l0.v.f23484a.b(dVar);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f13902w0);
            getViewTreeObserver().removeOnScrollChangedListener(this.f13904x0);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.f13906y0);
            if (Build.VERSION.SDK_INT >= 31) {
                J.f13579a.a(this);
                return;
            }
            return;
        }
        G0.a.c("No lifecycle owner exists");
        throw new C6527k();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10 && !hasFocus()) {
            getFocusOwner().p();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f13874i0.r(this.f13857S0);
        this.f13870g0 = null;
        U0();
        if (this.f13846I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                u0(getRoot());
            }
            long h02 = h0(i10);
            long h03 = h0(i11);
            long a10 = c1.b.f19206b.a((int) C6508G.b(h02 >>> 32), (int) C6508G.b(h02 & 4294967295L), (int) C6508G.b(h03 >>> 32), (int) C6508G.b(4294967295L & h03));
            c1.b bVar = this.f13870g0;
            boolean z10 = false;
            if (bVar == null) {
                this.f13870g0 = c1.b.a(a10);
                this.f13872h0 = false;
            } else {
                if (bVar != null) {
                    z10 = c1.b.f(bVar.r(), a10);
                }
                if (!z10) {
                    this.f13872h0 = true;
                }
            }
            this.f13874i0.H(a10);
            this.f13874i0.t();
            setMeasuredDimension(getRoot().s0(), getRoot().O());
            if (this.f13846I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().s0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().O(), 1073741824));
            }
            C6514M m10 = C6514M.f71813a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        l0.d dVar;
        if (c0() && viewStructure != null && (dVar = this.f13836D) != null) {
            l0.f.b(dVar, viewStructure);
        }
    }

    public void onResume(C1798v vVar) {
        setShowLayoutBounds(f13826X0.b());
    }

    public void onRtlPropertiesChanged(int i10) {
        if (this.f13863b) {
            c1.t e10 = androidx.compose.ui.focus.h.e(i10);
            if (e10 == null) {
                e10 = c1.t.Ltr;
            }
            setLayoutDirection(e10);
        }
    }

    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        N0.l lVar;
        if (Build.VERSION.SDK_INT >= 31 && (lVar = this.f13860V0) != null) {
            lVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        C2176b bVar = this.f13893s;
        bVar.v(bVar, longSparseArray);
    }

    public void onWindowFocusChanged(boolean z10) {
        boolean a10;
        this.f13877k.c(z10);
        this.f13859U0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a10 = f13826X0.b())) {
            setShowLayoutBounds(a10);
            s0();
        }
    }

    public void p(float[] fArr) {
        F0();
        M1.n(fArr, this.f13884n0);
        O.j(fArr, C2421g.m(this.f13892r0), C2421g.n(this.f13892r0), this.f13882m0);
    }

    public long r(long j10) {
        F0();
        return M1.f(this.f13886o0, j10);
    }

    public boolean requestFocus(int i10, Rect rect) {
        int i11;
        C2423i iVar;
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().m().b()) {
            return super.requestFocus(i10, rect);
        }
        androidx.compose.ui.focus.d d10 = androidx.compose.ui.focus.h.d(i10);
        if (d10 != null) {
            i11 = d10.o();
        } else {
            i11 = androidx.compose.ui.focus.d.f13315b.b();
        }
        p0.g focusOwner = getFocusOwner();
        if (rect != null) {
            iVar = Z1.e(rect);
        } else {
            iVar = null;
        }
        Boolean b10 = focusOwner.b(i11, iVar, new s(i11));
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public void s(G g10) {
        this.f13874i0.D(g10);
        M0(this, (G) null, 1, (Object) null);
    }

    public void s0() {
        t0(getRoot());
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f13891r.H0(j10);
    }

    public final void setConfigurationChangeObserver(C6798l lVar) {
        this.f13834C = lVar;
    }

    public final void setContentCaptureManager$ui_release(C2176b bVar) {
        this.f13893s = bVar;
    }

    public void setCoroutineContext(qf.g gVar) {
        this.f13873i = gVar;
        i.c k10 = getRoot().j0().k();
        if (k10 instanceof D0.V) {
            ((D0.V) k10).P0();
        }
        int a10 = C1239e0.a(16);
        if (!k10.v0().S1()) {
            G0.a.b("visitSubtree called on an unattached node");
        }
        i.c J12 = k10.v0().J1();
        G m10 = C1245k.m(k10);
        Z z10 = new Z();
        while (m10 != null) {
            if (J12 == null) {
                J12 = m10.j0().k();
            }
            if ((J12.I1() & a10) != 0) {
                while (J12 != null) {
                    if ((J12.N1() & a10) != 0) {
                        i.c cVar = J12;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                s0 s0Var = (s0) cVar;
                                if (s0Var instanceof D0.V) {
                                    ((D0.V) s0Var).P0();
                                }
                            } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                int i10 = 0;
                                for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar = m22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                bVar.b(cVar);
                                                cVar = null;
                                            }
                                            bVar.b(m22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar = C1245k.g(bVar);
                        }
                    }
                    J12 = J12.J1();
                }
            }
            z10.c(m10.v0());
            if (z10.a()) {
                m10 = (G) z10.b();
            } else {
                m10 = null;
            }
            J12 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f13888p0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(C6798l lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f13900v0 = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.f13844H = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(G g10) {
        this.f13891r.i0(g10);
        this.f13893s.s(g10);
    }

    public long u(long j10) {
        F0();
        long f10 = M1.f(this.f13884n0, j10);
        return C2422h.a(C2421g.m(f10) + C2421g.m(this.f13892r0), C2421g.n(f10) + C2421g.n(this.f13892r0));
    }

    public void v(G g10) {
        this.f13874i0.v(g10);
        K0();
    }

    public l0 w(yf.p pVar, C6787a aVar, C2673c cVar) {
        C1660r0 r0Var;
        if (cVar != null) {
            return new C1666u0(cVar, (F1) null, this, pVar, aVar);
        }
        l0 l0Var = (l0) this.f13852N0.b();
        if (l0Var != null) {
            l0Var.e(pVar, aVar);
            return l0Var;
        } else if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C1666u0(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        } else {
            if (isHardwareAccelerated() && this.f13894s0) {
                try {
                    return new C1627e1(this, pVar, aVar);
                } catch (Throwable unused) {
                    this.f13894s0 = false;
                }
            }
            if (this.f13868f0 == null) {
                w1.c cVar2 = w1.f13987p;
                if (!cVar2.a()) {
                    cVar2.d(new View(getContext()));
                }
                if (cVar2.b()) {
                    r0Var = new C1660r0(getContext());
                } else {
                    r0Var = new x1(getContext());
                }
                this.f13868f0 = r0Var;
                addView(r0Var);
            }
            C1660r0 r0Var2 = this.f13868f0;
            C6496s.e(r0Var2);
            return new w1(this, r0Var2, pVar, aVar);
        }
    }

    public void x() {
        if (this.f13838E) {
            getSnapshotObserver().b();
            this.f13838E = false;
        }
        C1617b0 b0Var = this.f13846I;
        if (b0Var != null) {
            g0(b0Var);
        }
        while (this.f13853O0.t()) {
            int q10 = this.f13853O0.q();
            for (int i10 = 0; i10 < q10; i10++) {
                C6787a aVar = (C6787a) this.f13853O0.p()[i10];
                this.f13853O0.B(i10, (Object) null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f13853O0.z(0, q10);
        }
    }

    public void z() {
        this.f13891r.j0();
        this.f13893s.t();
    }

    public final void z0(l0 l0Var, boolean z10) {
        if (!z10) {
            if (!this.f13905y) {
                this.f13901w.remove(l0Var);
                List list = this.f13903x;
                if (list != null) {
                    list.remove(l0Var);
                }
            }
        } else if (!this.f13905y) {
            this.f13901w.add(l0Var);
        } else {
            List list2 = this.f13903x;
            if (list2 == null) {
                list2 = new ArrayList();
                this.f13903x = list2;
            }
            list2.add(l0Var);
        }
    }

    public void addView(View view, int i10) {
        C6496s.e(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    public C1640j getAccessibilityManager() {
        return this.f13895t;
    }

    public C1643k getClipboardManager() {
        return this.f13840F;
    }

    public void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i10;
        generateDefaultLayoutParams.height = i11;
        C6514M m10 = C6514M.f71813a;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    public void c(G g10) {
    }
}

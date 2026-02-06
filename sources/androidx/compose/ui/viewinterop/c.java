package androidx.compose.ui.viewinterop;

import D0.L;
import H0.C1194o;
import H0.C1197s;
import H0.F;
import H0.U;
import J0.m0;
import J0.n0;
import J0.o0;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1496k;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.I1;
import androidx.compose.ui.platform.J0;
import androidx.compose.ui.platform.r;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.f0;
import c1.y;
import c1.z;
import java.util.List;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import r0.C2448H;
import r0.C2520p0;
import rf.C6680b;
import t0.C2605f;
import x3.C2914f;
import x3.C2915g;
import yf.C6787a;
import yf.C6798l;

public abstract class c extends ViewGroup implements G, C1496k, n0 {

    /* renamed from: x  reason: collision with root package name */
    public static final b f14106x = new b((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f14107y = 8;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C6798l f14108z = a.f14132a;

    /* renamed from: a  reason: collision with root package name */
    private final int f14109a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0.b f14110b;

    /* renamed from: c  reason: collision with root package name */
    private final View f14111c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final m0 f14112d;

    /* renamed from: e  reason: collision with root package name */
    private C6787a f14113e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f14114f;

    /* renamed from: g  reason: collision with root package name */
    private C6787a f14115g;

    /* renamed from: h  reason: collision with root package name */
    private C6787a f14116h;

    /* renamed from: i  reason: collision with root package name */
    private k0.i f14117i;

    /* renamed from: j  reason: collision with root package name */
    private C6798l f14118j;

    /* renamed from: k  reason: collision with root package name */
    private c1.d f14119k;

    /* renamed from: l  reason: collision with root package name */
    private C6798l f14120l;

    /* renamed from: m  reason: collision with root package name */
    private C1798v f14121m;

    /* renamed from: n  reason: collision with root package name */
    private C2914f f14122n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C6787a f14123o;

    /* renamed from: p  reason: collision with root package name */
    private final C6787a f14124p;

    /* renamed from: q  reason: collision with root package name */
    private C6798l f14125q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f14126r;

    /* renamed from: s  reason: collision with root package name */
    private int f14127s;

    /* renamed from: t  reason: collision with root package name */
    private int f14128t;

    /* renamed from: u  reason: collision with root package name */
    private final H f14129u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f14130v;

    /* renamed from: w  reason: collision with root package name */
    private final J0.G f14131w;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14132a = new a();

        a() {
            super(1);
        }

        /* access modifiers changed from: private */
        public static final void c(C6787a aVar) {
            aVar.invoke();
        }

        public final void b(c cVar) {
            cVar.getHandler().post(new b(cVar.f14123o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((c) obj);
            return C6514M.f71813a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.c$c  reason: collision with other inner class name */
    static final class C0264c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J0.G f14133a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f14134b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0264c(J0.G g10, k0.i iVar) {
            super(1);
            this.f14133a = g10;
            this.f14134b = iVar;
        }

        public final void a(k0.i iVar) {
            this.f14133a.n(iVar.h(this.f14134b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k0.i) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J0.G f14135a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(J0.G g10) {
            super(1);
            this.f14135a = g10;
        }

        public final void a(c1.d dVar) {
            this.f14135a.b(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c1.d) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J0.G f14137b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, J0.G g10) {
            super(1);
            this.f14136a = cVar;
            this.f14137b = g10;
        }

        public final void a(m0 m0Var) {
            r rVar;
            if (m0Var instanceof r) {
                rVar = (r) m0Var;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                rVar.a0(this.f14136a, this.f14137b);
            }
            ViewParent parent = this.f14136a.getView().getParent();
            c cVar = this.f14136a;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14138a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(1);
            this.f14138a = cVar;
        }

        public final void a(m0 m0Var) {
            r rVar;
            if (m0Var instanceof r) {
                rVar = (r) m0Var;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                rVar.J0(this.f14138a);
            }
            this.f14138a.removeAllViewsInLayout();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return C6514M.f71813a;
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J0.G f14146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f14147c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar, J0.G g10, c cVar2) {
            super(1);
            this.f14145a = cVar;
            this.f14146b = g10;
            this.f14147c = cVar2;
        }

        public final void a(C2605f fVar) {
            r rVar;
            c cVar = this.f14145a;
            J0.G g10 = this.f14146b;
            c cVar2 = this.f14147c;
            C2520p0 f10 = fVar.w1().f();
            if (cVar.getView().getVisibility() != 8) {
                cVar.f14130v = true;
                m0 m02 = g10.m0();
                if (m02 instanceof r) {
                    rVar = (r) m02;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    rVar.j0(cVar2, C2448H.d(f10));
                }
                cVar.f14130v = false;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J0.G f14149b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, J0.G g10) {
            super(1);
            this.f14148a = cVar;
            this.f14149b = g10;
        }

        public final void a(C1197s sVar) {
            d.f(this.f14148a, this.f14149b);
            this.f14148a.f14112d.g(this.f14148a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f14150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f14151b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f14152c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z10, c cVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f14151b = z10;
            this.f14152c = cVar;
            this.f14153d = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new k(this.f14151b, this.f14152c, this.f14153d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((k) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f14150a;
            if (i10 == 0) {
                w.b(obj);
                if (!this.f14151b) {
                    C0.b b10 = this.f14152c.f14110b;
                    long a10 = y.f19251b.a();
                    long j10 = this.f14153d;
                    this.f14150a = 1;
                    if (b10.a(a10, j10, this) == f10) {
                        return f10;
                    }
                } else {
                    C0.b b11 = this.f14152c.f14110b;
                    long j11 = this.f14153d;
                    long a11 = y.f19251b.a();
                    this.f14150a = 2;
                    if (b11.a(j11, a11, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f14154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f14155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f14156c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f14155b = cVar;
            this.f14156c = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new l(this.f14155b, this.f14156c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((l) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f14154a;
            if (i10 == 0) {
                w.b(obj);
                C0.b b10 = this.f14155b.f14110b;
                long j10 = this.f14156c;
                this.f14154a = 1;
                if (b10.c(j10, this) == f10) {
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

    static final class m extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f14157a = new m();

        m() {
            super(0);
        }

        public final void invoke() {
        }
    }

    static final class n extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f14158a = new n();

        n() {
            super(0);
        }

        public final void invoke() {
        }
    }

    static final class o extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14159a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(0);
            this.f14159a = cVar;
        }

        public final void invoke() {
            this.f14159a.getLayoutNode().C0();
        }
    }

    static final class p extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14160a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(0);
            this.f14160a = cVar;
        }

        public final void invoke() {
            c cVar;
            if (this.f14160a.f14114f && this.f14160a.isAttachedToWindow() && this.f14160a.getView().getParent() == (cVar = this.f14160a)) {
                cVar.getSnapshotObserver().i(this.f14160a, c.f14108z, this.f14160a.getUpdate());
            }
        }
    }

    static final class q extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final q f14161a = new q();

        q() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public c(Context context, Y.r rVar, int i10, C0.b bVar, View view, m0 m0Var) {
        super(context);
        this.f14109a = i10;
        this.f14110b = bVar;
        this.f14111c = view;
        this.f14112d = m0Var;
        if (rVar != null) {
            I1.i(this, rVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f14113e = q.f14161a;
        this.f14115g = n.f14158a;
        this.f14116h = m.f14157a;
        i.a aVar = k0.i.f23074a;
        this.f14117i = aVar;
        this.f14119k = c1.f.b(1.0f, 0.0f, 2, (Object) null);
        this.f14123o = new p(this);
        this.f14124p = new o(this);
        this.f14126r = new int[2];
        this.f14127s = Integer.MIN_VALUE;
        this.f14128t = Integer.MIN_VALUE;
        this.f14129u = new H(this);
        J0.G g10 = new J0.G(false, 0, 3, (DefaultConstructorMarker) null);
        g10.C1(this);
        k0.i a10 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.b.b(L.a(O0.m.c(androidx.compose.ui.input.nestedscroll.a.a(aVar, d.f14162a, bVar), true, h.f14144a), this), new i(this, g10, this)), new j(this, g10));
        g10.d(i10);
        g10.n(this.f14117i.h(a10));
        this.f14118j = new C0264c(g10, a10);
        g10.b(this.f14119k);
        this.f14120l = new d(g10);
        g10.G1(new e(this, g10));
        g10.H1(new f(this));
        g10.g(new g(this, g10));
        this.f14131w = g10;
    }

    /* access modifiers changed from: private */
    public final o0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            G0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f14112d.getSnapshotObserver();
    }

    /* access modifiers changed from: private */
    public static final void t(C6787a aVar) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final int u(int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(Ef.m.l(i12, i10, i11), 1073741824);
        }
        if (i12 == -2 && i11 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        if (i12 != -1 || i11 == Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
    }

    public boolean Y0() {
        return isAttachedToWindow();
    }

    public void c() {
        this.f14116h.invoke();
    }

    public void f() {
        this.f14115g.invoke();
        removeAllViewsInLayout();
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f14126r);
        int[] iArr = this.f14126r;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f14126r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final c1.d getDensity() {
        return this.f14119k;
    }

    public final View getInteropView() {
        return this.f14111c;
    }

    public final J0.G getLayoutNode() {
        return this.f14131w;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f14111c.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final C1798v getLifecycleOwner() {
        return this.f14121m;
    }

    public final k0.i getModifier() {
        return this.f14117i;
    }

    public int getNestedScrollAxes() {
        return this.f14129u.a();
    }

    public final C6798l getOnDensityChanged$ui_release() {
        return this.f14120l;
    }

    public final C6798l getOnModifierChanged$ui_release() {
        return this.f14118j;
    }

    public final C6798l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f14125q;
    }

    public final C6787a getRelease() {
        return this.f14116h;
    }

    public final C6787a getReset() {
        return this.f14115g;
    }

    public final C2914f getSavedStateRegistryOwner() {
        return this.f14122n;
    }

    public final C6787a getUpdate() {
        return this.f14113e;
    }

    public final View getView() {
        return this.f14111c;
    }

    public void i(View view, View view2, int i10, int i11) {
        this.f14129u.c(view, view2, i10, i11);
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        s();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f14111c.isNestedScrollingEnabled();
    }

    public void j(View view, int i10) {
        this.f14129u.e(view, i10);
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            long d10 = this.f14110b.d(C2422h.a(d.g(i10), d.g(i11)), d.i(i12));
            iArr[0] = J0.b(C2421g.m(d10));
            iArr[1] = J0.b(C2421g.n(d10));
        }
    }

    public void l() {
        if (this.f14111c.getParent() != this) {
            addView(this.f14111c);
        } else {
            this.f14115g.invoke();
        }
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long b10 = this.f14110b.b(C2422h.a(d.g(i10), d.g(i11)), C2422h.a(d.g(i12), d.g(i13)), d.i(i14));
            iArr[0] = J0.b(C2421g.m(b10));
            iArr[1] = J0.b(C2421g.n(b10));
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            this.f14110b.b(C2422h.a(d.g(i10), d.g(i11)), C2422h.a(d.g(i12), d.g(i13)), d.i(i14));
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14123o.invoke();
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        s();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f14111c.layout(0, 0, i12 - i10, i13 - i11);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f14111c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        } else if (this.f14111c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            this.f14111c.measure(i10, i11);
            setMeasuredDimension(this.f14111c.getMeasuredWidth(), this.f14111c.getMeasuredHeight());
            this.f14127s = i10;
            this.f14128t = i11;
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a10 = z.a(d.h(f10), d.h(f11));
        C5600w0 unused = C5576k.d(this.f14110b.e(), (qf.g) null, (M) null, new k(z10, this, a10, (C6658d) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C5600w0 unused = C5576k.d(this.f14110b.e(), (qf.g) null, (M) null, new l(this, z.a(d.h(f10), d.h(f11)), (C6658d) null), 3, (Object) null);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        C6798l lVar = this.f14125q;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s() {
        if (this.f14130v) {
            this.f14111c.postOnAnimation(new a(this.f14124p));
        } else {
            this.f14131w.C0();
        }
    }

    public final void setDensity(c1.d dVar) {
        if (dVar != this.f14119k) {
            this.f14119k = dVar;
            C6798l lVar = this.f14120l;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(C1798v vVar) {
        if (vVar != this.f14121m) {
            this.f14121m = vVar;
            f0.b(this, vVar);
        }
    }

    public final void setModifier(k0.i iVar) {
        if (iVar != this.f14117i) {
            this.f14117i = iVar;
            C6798l lVar = this.f14118j;
            if (lVar != null) {
                lVar.invoke(iVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(C6798l lVar) {
        this.f14120l = lVar;
    }

    public final void setOnModifierChanged$ui_release(C6798l lVar) {
        this.f14118j = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(C6798l lVar) {
        this.f14125q = lVar;
    }

    /* access modifiers changed from: protected */
    public final void setRelease(C6787a aVar) {
        this.f14116h = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setReset(C6787a aVar) {
        this.f14115g = aVar;
    }

    public final void setSavedStateRegistryOwner(C2914f fVar) {
        if (fVar != this.f14122n) {
            this.f14122n = fVar;
            C2915g.b(this, fVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void setUpdate(C6787a aVar) {
        this.f14113e = aVar;
        this.f14114f = true;
        this.f14123o.invoke();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void v() {
        int i10;
        int i11 = this.f14127s;
        if (i11 != Integer.MIN_VALUE && (i10 = this.f14128t) != Integer.MIN_VALUE) {
            measure(i11, i10);
        }
    }

    public static final class g implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f14139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J0.G f14140b;

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f14142a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ J0.G f14143b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, J0.G g10) {
                super(1);
                this.f14142a = cVar;
                this.f14143b = g10;
            }

            public final void a(U.a aVar) {
                d.f(this.f14142a, this.f14143b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        g(c cVar, J0.G g10) {
            this.f14139a = cVar;
            this.f14140b = g10;
        }

        private final int c(int i10) {
            c cVar = this.f14139a;
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            C6496s.e(layoutParams);
            cVar.measure(cVar.u(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return this.f14139a.getMeasuredHeight();
        }

        private final int d(int i10) {
            c cVar = this.f14139a;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c cVar2 = this.f14139a;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            C6496s.e(layoutParams);
            cVar.measure(makeMeasureSpec, cVar2.u(0, i10, layoutParams.height));
            return this.f14139a.getMeasuredWidth();
        }

        public int a(C1194o oVar, List list, int i10) {
            return c(i10);
        }

        public int b(C1194o oVar, List list, int i10) {
            return d(i10);
        }

        public int g(C1194o oVar, List list, int i10) {
            return c(i10);
        }

        public int h(C1194o oVar, List list, int i10) {
            return d(i10);
        }

        public H0.G j(H0.H h10, List list, long j10) {
            if (this.f14139a.getChildCount() == 0) {
                return H0.H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, a.f14141a, 4, (Object) null);
            }
            if (c1.b.n(j10) != 0) {
                this.f14139a.getChildAt(0).setMinimumWidth(c1.b.n(j10));
            }
            if (c1.b.m(j10) != 0) {
                this.f14139a.getChildAt(0).setMinimumHeight(c1.b.m(j10));
            }
            c cVar = this.f14139a;
            int n10 = c1.b.n(j10);
            int l10 = c1.b.l(j10);
            ViewGroup.LayoutParams layoutParams = this.f14139a.getLayoutParams();
            C6496s.e(layoutParams);
            int q10 = cVar.u(n10, l10, layoutParams.width);
            c cVar2 = this.f14139a;
            int m10 = c1.b.m(j10);
            int k10 = c1.b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = this.f14139a.getLayoutParams();
            C6496s.e(layoutParams2);
            cVar.measure(q10, cVar2.u(m10, k10, layoutParams2.height));
            return H0.H.N(h10, this.f14139a.getMeasuredWidth(), this.f14139a.getMeasuredHeight(), (Map) null, new b(this.f14139a, this.f14140b), 4, (Object) null);
        }

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14141a = new a();

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

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f14144a = new h();

        h() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }

        public final void a(v vVar) {
        }
    }
}

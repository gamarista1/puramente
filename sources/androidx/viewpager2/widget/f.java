package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1680b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import y1.C2930A;
import y1.D;

public final class f extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    static boolean f18595u = true;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f18596a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f18597b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private b f18598c = new b(3);

    /* renamed from: d  reason: collision with root package name */
    int f18599d;

    /* renamed from: e  reason: collision with root package name */
    boolean f18600e = false;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.j f18601f = new a();

    /* renamed from: g  reason: collision with root package name */
    LinearLayoutManager f18602g;

    /* renamed from: h  reason: collision with root package name */
    private int f18603h = -1;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f18604i;

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f18605j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.recyclerview.widget.j f18606k;

    /* renamed from: l  reason: collision with root package name */
    e f18607l;

    /* renamed from: m  reason: collision with root package name */
    private b f18608m;

    /* renamed from: n  reason: collision with root package name */
    private c f18609n;

    /* renamed from: o  reason: collision with root package name */
    private d f18610o;

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView.m f18611p = null;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18612q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f18613r = true;

    /* renamed from: s  reason: collision with root package name */
    private int f18614s = -1;

    /* renamed from: t  reason: collision with root package name */
    e f18615t;

    class a extends g {
        a() {
            super((a) null);
        }

        public void a() {
            f fVar = f.this;
            fVar.f18600e = true;
            fVar.f18607l.l();
        }
    }

    class b extends i {
        b() {
        }

        public void a(int i10) {
            if (i10 == 0) {
                f.this.n();
            }
        }

        public void c(int i10) {
            f fVar = f.this;
            if (fVar.f18599d != i10) {
                fVar.f18599d = i10;
                fVar.f18615t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        public void c(int i10) {
            f.this.clearFocus();
            if (f.this.hasFocus()) {
                f.this.f18605j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        public void a(View view) {
        }

        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (qVar.width != -1 || qVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i10) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView.h hVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView.h hVar) {
        }

        /* access modifiers changed from: package-private */
        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void h(b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void n() {
        }

        /* access modifiers changed from: package-private */
        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void p(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        public void q() {
        }

        /* access modifiers changed from: package-private */
        public void r() {
        }

        /* access modifiers changed from: package-private */
        public void s() {
        }

        /* access modifiers changed from: package-private */
        public void t() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        public void j(C2930A a10) {
        }

        /* access modifiers changed from: package-private */
        public void k(View view, C2930A a10) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$f  reason: collision with other inner class name */
    class C0320f extends e {
        C0320f() {
            super(f.this, (a) null);
        }

        public boolean b(int i10) {
            if ((i10 == 8192 || i10 == 4096) && !f.this.e()) {
                return true;
            }
            return false;
        }

        public boolean d() {
            return true;
        }

        public void j(C2930A a10) {
            if (!f.this.e()) {
                a10.k0(C2930A.a.f28611r);
                a10.k0(C2930A.a.f28610q);
                a10.V0(false);
            }
        }

        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        public abstract void a();

        public final void b(int i10, int i11) {
            a();
        }

        public final void c(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        public void M0(RecyclerView.w wVar, RecyclerView.B b10, C2930A a10) {
            super.M0(wVar, b10, a10);
            f.this.f18615t.j(a10);
        }

        /* access modifiers changed from: protected */
        public void M1(RecyclerView.B b10, int[] iArr) {
            int offscreenPageLimit = f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.M1(b10, iArr);
                return;
            }
            int pageSize = f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public void P0(RecyclerView.w wVar, RecyclerView.B b10, View view, C2930A a10) {
            f.this.f18615t.k(view, a10);
        }

        public boolean h1(RecyclerView.w wVar, RecyclerView.B b10, int i10, Bundle bundle) {
            if (f.this.f18615t.b(i10)) {
                return f.this.f18615t.l(i10);
            }
            return super.h1(wVar, b10, i10, bundle);
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    class j extends e {

        /* renamed from: b  reason: collision with root package name */
        private final D f18623b = new a();

        /* renamed from: c  reason: collision with root package name */
        private final D f18624c = new b();

        /* renamed from: d  reason: collision with root package name */
        private RecyclerView.j f18625d;

        class a implements D {
            a() {
            }

            public boolean a(View view, D.a aVar) {
                j.this.x(((f) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements D {
            b() {
            }

            public boolean a(View view, D.a aVar) {
                j.this.x(((f) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super((a) null);
            }

            public void a() {
                j.this.y();
            }
        }

        j() {
            super(f.this, (a) null);
        }

        private void u(C2930A a10) {
            int i10;
            int i11;
            if (f.this.getAdapter() != null) {
                i10 = 1;
                if (f.this.getOrientation() == 1) {
                    i10 = f.this.getAdapter().e();
                    i11 = 1;
                } else {
                    i11 = f.this.getAdapter().e();
                }
            } else {
                i11 = 0;
                i10 = 0;
            }
            a10.v0(C2930A.e.b(i10, i11, false, 0));
        }

        private void v(View view, C2930A a10) {
            int i10;
            int i11 = 0;
            if (f.this.getOrientation() == 1) {
                i10 = f.this.f18602g.h0(view);
            } else {
                i10 = 0;
            }
            if (f.this.getOrientation() == 0) {
                i11 = f.this.f18602g.h0(view);
            }
            a10.w0(C2930A.f.b(i10, 1, i11, 1, false, false));
        }

        private void w(C2930A a10) {
            int e10;
            RecyclerView.h adapter = f.this.getAdapter();
            if (adapter != null && (e10 = adapter.e()) != 0 && f.this.e()) {
                if (f.this.f18599d > 0) {
                    a10.a(8192);
                }
                if (f.this.f18599d < e10 - 1) {
                    a10.a(4096);
                }
                a10.V0(true);
            }
        }

        public boolean a() {
            return true;
        }

        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.w(this.f18625d);
            }
        }

        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.y(this.f18625d);
            }
        }

        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void h(b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f18625d = new c();
            if (f.this.getImportantForAccessibility() == 0) {
                f.this.setImportantForAccessibility(1);
            }
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C2930A l12 = C2930A.l1(accessibilityNodeInfo);
            u(l12);
            w(l12);
        }

        /* access modifiers changed from: package-private */
        public void k(View view, C2930A a10) {
            v(view, a10);
        }

        public boolean m(int i10, Bundle bundle) {
            int i11;
            if (c(i10, bundle)) {
                if (i10 == 8192) {
                    i11 = f.this.getCurrentItem() - 1;
                } else {
                    i11 = f.this.getCurrentItem() + 1;
                }
                x(i11);
                return true;
            }
            throw new IllegalStateException();
        }

        public void n() {
            y();
        }

        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(f.this);
            accessibilityEvent.setClassName(g());
        }

        public void q() {
            y();
        }

        public void r() {
            y();
        }

        public void s() {
            y();
        }

        public void t() {
            y();
        }

        /* access modifiers changed from: package-private */
        public void x(int i10) {
            if (f.this.e()) {
                f.this.k(i10, true);
            }
        }

        /* access modifiers changed from: package-private */
        public void y() {
            int e10;
            int i10;
            f fVar = f.this;
            int i11 = 16908360;
            C1680b0.i0(fVar, 16908360);
            C1680b0.i0(fVar, 16908361);
            C1680b0.i0(fVar, 16908358);
            C1680b0.i0(fVar, 16908359);
            if (f.this.getAdapter() != null && (e10 = f.this.getAdapter().e()) != 0 && f.this.e()) {
                if (f.this.getOrientation() == 0) {
                    boolean d10 = f.this.d();
                    if (d10) {
                        i10 = 16908360;
                    } else {
                        i10 = 16908361;
                    }
                    if (d10) {
                        i11 = 16908361;
                    }
                    if (f.this.f18599d < e10 - 1) {
                        C1680b0.k0(fVar, new C2930A.a(i10, (CharSequence) null), (CharSequence) null, this.f18623b);
                    }
                    if (f.this.f18599d > 0) {
                        C1680b0.k0(fVar, new C2930A.a(i11, (CharSequence) null), (CharSequence) null, this.f18624c);
                        return;
                    }
                    return;
                }
                if (f.this.f18599d < e10 - 1) {
                    C1680b0.k0(fVar, new C2930A.a(16908359, (CharSequence) null), (CharSequence) null, this.f18623b);
                }
                if (f.this.f18599d > 0) {
                    C1680b0.k0(fVar, new C2930A.a(16908358, (CharSequence) null), (CharSequence) null, this.f18624c);
                }
            }
        }
    }

    public interface k {
        void a(View view, float f10);
    }

    private class l extends androidx.recyclerview.widget.j {
        l() {
        }

        public View f(RecyclerView.p pVar) {
            if (f.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (f.this.f18615t.d()) {
                return f.this.f18615t.o();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(f.this.f18599d);
            accessibilityEvent.setToIndex(f.this.f18599d);
            f.this.f18615t.p(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!f.this.e() || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!f.this.e() || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    private static class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f18635a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f18636b;

        o(int i10, RecyclerView recyclerView) {
            this.f18635a = i10;
            this.f18636b = recyclerView;
        }

        public void run() {
            this.f18636b.A1(this.f18635a);
        }
    }

    public f(Context context) {
        super(context);
        b(context, (AttributeSet) null);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        e eVar;
        if (f18595u) {
            eVar = new j();
        } else {
            eVar = new C0320f();
        }
        this.f18615t = eVar;
        m mVar = new m(context);
        this.f18605j = mVar;
        mVar.setId(View.generateViewId());
        this.f18605j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f18602g = hVar;
        this.f18605j.setLayoutManager(hVar);
        this.f18605j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f18605j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f18605j.l(a());
        e eVar2 = new e(this);
        this.f18607l = eVar2;
        this.f18609n = new c(this, eVar2, this.f18605j);
        l lVar = new l();
        this.f18606k = lVar;
        lVar.b(this.f18605j);
        this.f18605j.n(this.f18607l);
        b bVar = new b(3);
        this.f18608m = bVar;
        this.f18607l.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f18608m.d(bVar2);
        this.f18608m.d(cVar);
        this.f18615t.h(this.f18608m, this.f18605j);
        this.f18608m.d(this.f18598c);
        d dVar = new d(this.f18602g);
        this.f18610o = dVar;
        this.f18608m.d(dVar);
        RecyclerView recyclerView = this.f18605j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.w(this.f18601f);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f18603h != -1 && (adapter = getAdapter()) != null) {
            if (this.f18604i != null) {
                this.f18604i = null;
            }
            int max = Math.max(0, Math.min(this.f18603h, adapter.e() - 1));
            this.f18599d = max;
            this.f18603h = -1;
            this.f18605j.r1(max);
            this.f18615t.n();
        }
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I3.a.f2814a);
        C1680b0.m0(this, context, I3.a.f2814a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(I3.a.f2815b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.y(this.f18601f);
        }
    }

    public boolean c() {
        return this.f18609n.a();
    }

    public boolean canScrollHorizontally(int i10) {
        return this.f18605j.canScrollHorizontally(i10);
    }

    public boolean canScrollVertically(int i10) {
        return this.f18605j.canScrollVertically(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.f18602g.Z() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f18632a;
            sparseArray.put(this.f18605j.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f18613r;
    }

    public void g(i iVar) {
        this.f18598c.d(iVar);
    }

    public CharSequence getAccessibilityClassName() {
        if (this.f18615t.a()) {
            return this.f18615t.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f18605j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f18599d;
    }

    public int getItemDecorationCount() {
        return this.f18605j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f18614s;
    }

    public int getOrientation() {
        if (this.f18602g.l2() == 1) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f18605j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f18607l.h();
    }

    public void h() {
        if (this.f18610o.d() != null) {
            double g10 = this.f18607l.g();
            int i10 = (int) g10;
            float f10 = (float) (g10 - ((double) i10));
            this.f18610o.b(i10, f10, Math.round(((float) getPageSize()) * f10));
        }
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, boolean z10) {
        int i11;
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f18603h != -1) {
                this.f18603h = Math.max(i10, 0);
            }
        } else if (adapter.e() > 0) {
            int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
            if (min != this.f18599d || !this.f18607l.j()) {
                int i12 = this.f18599d;
                if (min != i12 || !z10) {
                    double d10 = (double) i12;
                    this.f18599d = min;
                    this.f18615t.r();
                    if (!this.f18607l.j()) {
                        d10 = this.f18607l.g();
                    }
                    this.f18607l.m(min, z10);
                    if (!z10) {
                        this.f18605j.r1(min);
                        return;
                    }
                    double d11 = (double) min;
                    if (Math.abs(d11 - d10) > 3.0d) {
                        RecyclerView recyclerView = this.f18605j;
                        if (d11 > d10) {
                            i11 = min - 3;
                        } else {
                            i11 = min + 3;
                        }
                        recyclerView.r1(i11);
                        RecyclerView recyclerView2 = this.f18605j;
                        recyclerView2.post(new o(min, recyclerView2));
                        return;
                    }
                    this.f18605j.A1(min);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        androidx.recyclerview.widget.j jVar = this.f18606k;
        if (jVar != null) {
            View f10 = jVar.f(this.f18602g);
            if (f10 != null) {
                int h02 = this.f18602g.h0(f10);
                if (h02 != this.f18599d && getScrollState() == 0) {
                    this.f18608m.c(h02);
                }
                this.f18600e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f18615t.i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f18605j.getMeasuredWidth();
        int measuredHeight = this.f18605j.getMeasuredHeight();
        this.f18596a.left = getPaddingLeft();
        this.f18596a.right = (i12 - i10) - getPaddingRight();
        this.f18596a.top = getPaddingTop();
        this.f18596a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f18596a, this.f18597b);
        RecyclerView recyclerView = this.f18605j;
        Rect rect = this.f18597b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f18600e) {
            n();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        measureChild(this.f18605j, i10, i11);
        int measuredWidth = this.f18605j.getMeasuredWidth();
        int measuredHeight = this.f18605j.getMeasuredHeight();
        int measuredState = this.f18605j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f18603h = nVar.f18633b;
        this.f18604i = nVar.f18634c;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f18632a = this.f18605j.getId();
        int i10 = this.f18603h;
        if (i10 == -1) {
            i10 = this.f18599d;
        }
        nVar.f18633b = i10;
        Parcelable parcelable = this.f18604i;
        if (parcelable != null) {
            nVar.f18634c = parcelable;
        } else {
            this.f18605j.getAdapter();
        }
        return nVar;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(f.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (this.f18615t.c(i10, bundle)) {
            return this.f18615t.m(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f18605j.getAdapter();
        this.f18615t.f(adapter);
        m(adapter);
        this.f18605j.setAdapter(hVar);
        this.f18599d = 0;
        i();
        this.f18615t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f18615t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.f18614s = i10;
            this.f18605j.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.f18602g.y2(i10);
        this.f18615t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f18612q) {
                this.f18611p = this.f18605j.getItemAnimator();
                this.f18612q = true;
            }
            this.f18605j.setItemAnimator((RecyclerView.m) null);
        } else if (this.f18612q) {
            this.f18605j.setItemAnimator(this.f18611p);
            this.f18611p = null;
            this.f18612q = false;
        }
        if (kVar != this.f18610o.d()) {
            this.f18610o.e(kVar);
            h();
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f18613r = z10;
        this.f18615t.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f18632a;

        /* renamed from: b  reason: collision with root package name */
        int f18633b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f18634c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            /* renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f18632a = parcel.readInt();
            this.f18633b = parcel.readInt();
            this.f18634c = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f18632a);
            parcel.writeInt(this.f18633b);
            parcel.writeParcelable(this.f18634c, i10);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}

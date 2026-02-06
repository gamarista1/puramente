package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import com.google.android.gms.common.api.a;
import i.C2037a;
import i.C2042f;
import p1.C2388d;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements H, F, G {

    /* renamed from: G  reason: collision with root package name */
    static final int[] f11438G = {C2037a.f21259b, 16842841};

    /* renamed from: H  reason: collision with root package name */
    private static final D0 f11439H = new D0.a().d(C2388d.b(0, 1, 0, 1)).a();

    /* renamed from: I  reason: collision with root package name */
    private static final Rect f11440I = new Rect();

    /* renamed from: A  reason: collision with root package name */
    ViewPropertyAnimator f11441A;

    /* renamed from: B  reason: collision with root package name */
    final AnimatorListenerAdapter f11442B;

    /* renamed from: C  reason: collision with root package name */
    private final Runnable f11443C;

    /* renamed from: D  reason: collision with root package name */
    private final Runnable f11444D;

    /* renamed from: E  reason: collision with root package name */
    private final H f11445E;

    /* renamed from: F  reason: collision with root package name */
    private final f f11446F;

    /* renamed from: a  reason: collision with root package name */
    private int f11447a;

    /* renamed from: b  reason: collision with root package name */
    private int f11448b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f11449c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f11450d;

    /* renamed from: e  reason: collision with root package name */
    private I f11451e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f11452f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11453g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11454h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11455i;

    /* renamed from: j  reason: collision with root package name */
    boolean f11456j;

    /* renamed from: k  reason: collision with root package name */
    private int f11457k;

    /* renamed from: l  reason: collision with root package name */
    private int f11458l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f11459m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f11460n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final Rect f11461o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    private final Rect f11462p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    private final Rect f11463q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f11464r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f11465s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f11466t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private D0 f11467u;

    /* renamed from: v  reason: collision with root package name */
    private D0 f11468v;

    /* renamed from: w  reason: collision with root package name */
    private D0 f11469w;

    /* renamed from: x  reason: collision with root package name */
    private D0 f11470x;

    /* renamed from: y  reason: collision with root package name */
    private d f11471y;

    /* renamed from: z  reason: collision with root package name */
    private OverScroller f11472z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f11441A = null;
            actionBarOverlayLayout.f11456j = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f11441A = null;
            actionBarOverlayLayout.f11456j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f11441A = actionBarOverlayLayout.f11450d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f11442B);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f11441A = actionBarOverlayLayout.f11450d.animate().translationY((float) (-ActionBarOverlayLayout.this.f11450d.getHeight())).setListener(ActionBarOverlayLayout.this.f11442B);
        }
    }

    public interface d {
        void a();

        void b(int i10);

        void c();

        void d(boolean z10);

        void e();

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D0 d02 = D0.f15980b;
        this.f11467u = d02;
        this.f11468v = d02;
        this.f11469w = d02;
        this.f11470x = d02;
        this.f11442B = new a();
        this.f11443C = new b();
        this.f11444D = new c();
        w(context);
        this.f11445E = new H(this);
        f fVar = new f(context);
        this.f11446F = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f11443C.run();
    }

    private boolean C(float f10) {
        this.f11472z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        if (this.f11472z.getFinalY() > this.f11450d.getHeight()) {
            return true;
        }
        return false;
    }

    private void p() {
        v();
        this.f11444D.run();
    }

    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private boolean r() {
        C1680b0.f(this.f11446F, f11439H, this.f11462p);
        return !this.f11462p.equals(f11440I);
    }

    private I u(View view) {
        if (view instanceof I) {
            return (I) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f11438G);
        boolean z10 = false;
        this.f11447a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f11452f = drawable;
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        this.f11472z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f11444D, 600);
    }

    private void z() {
        v();
        postDelayed(this.f11443C, 600);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (this.f11449c == null) {
            this.f11449c = (ContentFrameLayout) findViewById(C2042f.f21369b);
            this.f11450d = (ActionBarContainer) findViewById(C2042f.f21370c);
            this.f11451e = u(findViewById(C2042f.f21368a));
        }
    }

    public boolean a() {
        A();
        return this.f11451e.a();
    }

    public boolean b() {
        A();
        return this.f11451e.b();
    }

    public boolean c() {
        A();
        return this.f11451e.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(Menu menu, j.a aVar) {
        A();
        this.f11451e.d(menu, aVar);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f11452f != null) {
            if (this.f11450d.getVisibility() == 0) {
                i10 = (int) (((float) this.f11450d.getBottom()) + this.f11450d.getTranslationY() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f11452f.setBounds(0, i10, getWidth(), this.f11452f.getIntrinsicHeight() + i10);
            this.f11452f.draw(canvas);
        }
    }

    public boolean e() {
        A();
        return this.f11451e.e();
    }

    public void f() {
        A();
        this.f11451e.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        A();
        return this.f11451e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f11450d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f11445E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f11451e.getTitle();
    }

    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f11451e.o();
        } else if (i10 == 5) {
            this.f11451e.w();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void l() {
        A();
        this.f11451e.q();
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 != 0 || !onStartNestedScroll(view, view2, i10)) {
            return false;
        }
        return true;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        D0 z10 = D0.z(windowInsets, this);
        boolean q10 = q(this.f11450d, new Rect(z10.k(), z10.m(), z10.l(), z10.j()), true, true, false, true);
        C1680b0.f(this, z10, this.f11459m);
        Rect rect = this.f11459m;
        D0 n10 = z10.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f11467u = n10;
        boolean z11 = true;
        if (!this.f11468v.equals(n10)) {
            this.f11468v = this.f11467u;
            q10 = true;
        }
        if (!this.f11460n.equals(this.f11459m)) {
            this.f11460n.set(this.f11459m);
        } else {
            z11 = q10;
        }
        if (z11) {
            requestLayout();
        }
        return z10.a().c().b().x();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        C1680b0.l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        A();
        measureChildWithMargins(this.f11450d, i10, 0, i11, 0);
        e eVar = (e) this.f11450d.getLayoutParams();
        int max = Math.max(0, this.f11450d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f11450d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f11450d.getMeasuredState());
        if ((C1680b0.K(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = this.f11447a;
            if (this.f11454h && this.f11450d.getTabContainer() != null) {
                i12 += this.f11447a;
            }
        } else {
            i12 = this.f11450d.getVisibility() != 8 ? this.f11450d.getMeasuredHeight() : 0;
        }
        this.f11461o.set(this.f11459m);
        this.f11469w = this.f11467u;
        if (this.f11453g || z10 || !r()) {
            this.f11469w = new D0.a(this.f11469w).d(C2388d.b(this.f11469w.k(), this.f11469w.m() + i12, this.f11469w.l(), this.f11469w.j())).a();
        } else {
            Rect rect = this.f11461o;
            rect.top += i12;
            rect.bottom = rect.bottom;
            this.f11469w = this.f11469w.n(0, i12, 0, 0);
        }
        q(this.f11449c, this.f11461o, true, true, true, true);
        if (!this.f11470x.equals(this.f11469w)) {
            D0 d02 = this.f11469w;
            this.f11470x = d02;
            C1680b0.g(this.f11449c, d02);
        }
        measureChildWithMargins(this.f11449c, i10, 0, i11, 0);
        e eVar2 = (e) this.f11449c.getLayoutParams();
        int max3 = Math.max(max, this.f11449c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f11449c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f11449c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f11455i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f11456j = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f11457k + i11;
        this.f11457k = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f11445E.b(view, view2, i10);
        this.f11457k = getActionBarHideOffset();
        v();
        d dVar = this.f11471y;
        if (dVar != null) {
            dVar.f();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f11450d.getVisibility() != 0) {
            return false;
        }
        return this.f11455i;
    }

    public void onStopNestedScroll(View view) {
        if (this.f11455i && !this.f11456j) {
            if (this.f11457k <= this.f11450d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f11471y;
        if (dVar != null) {
            dVar.c();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f11458l ^ i10;
        this.f11458l = i10;
        boolean z11 = false;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        d dVar = this.f11471y;
        if (dVar != null) {
            dVar.d(!z11);
            if (z10 || !z11) {
                this.f11471y.a();
            } else {
                this.f11471y.e();
            }
        }
        if ((i11 & 256) != 0 && this.f11471y != null) {
            C1680b0.l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f11448b = i10;
        d dVar = this.f11471y;
        if (dVar != null) {
            dVar.b(i10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f11450d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f11450d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f11471y = dVar;
        if (getWindowToken() != null) {
            this.f11471y.b(this.f11448b);
            int i10 = this.f11458l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                C1680b0.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f11454h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f11455i) {
            this.f11455i = z10;
            if (!z10) {
                v();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        A();
        this.f11451e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f11451e.s(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f11453g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f11451e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f11451e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        removeCallbacks(this.f11443C);
        removeCallbacks(this.f11444D);
        ViewPropertyAnimator viewPropertyAnimator = this.f11441A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f11453g;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f11451e.setIcon(drawable);
    }
}

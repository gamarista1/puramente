package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.S;

public class ActionMenuView extends S implements e.b, k {

    /* renamed from: A  reason: collision with root package name */
    e f11476A;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f11477p;

    /* renamed from: q  reason: collision with root package name */
    private Context f11478q;

    /* renamed from: r  reason: collision with root package name */
    private int f11479r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11480s;

    /* renamed from: t  reason: collision with root package name */
    private C1564c f11481t;

    /* renamed from: u  reason: collision with root package name */
    private j.a f11482u;

    /* renamed from: v  reason: collision with root package name */
    e.a f11483v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f11484w;

    /* renamed from: x  reason: collision with root package name */
    private int f11485x;

    /* renamed from: y  reason: collision with root package name */
    private int f11486y;

    /* renamed from: z  reason: collision with root package name */
    private int f11487z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends S.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11488a;

        /* renamed from: b  reason: collision with root package name */
        public int f11489b;

        /* renamed from: c  reason: collision with root package name */
        public int f11490c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11491d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11492e;

        /* renamed from: f  reason: collision with root package name */
        boolean f11493f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f11488a = cVar.f11488a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f11488a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f11476A;
            if (eVar2 == null || !eVar2.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f11483v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i10, int i11, int i12, int i13) {
        ActionMenuItemView actionMenuItemView;
        boolean z10;
        int i14;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z11 = false;
        if (actionMenuItemView == null || !actionMenuItemView.f()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i11 > 0) {
            i14 = 2;
            if (!z10 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z10 || i15 >= 2) {
                    i14 = i15;
                }
                if (!cVar.f11488a && z10) {
                    z11 = true;
                }
                cVar.f11491d = z11;
                cVar.f11489b = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        z11 = true;
        cVar.f11491d = z11;
        cVar.f11489b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    private void M(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        boolean z16;
        int i19;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i20 = size - paddingLeft;
        int i21 = this.f11486y;
        int i22 = i20 / i21;
        int i23 = i20 % i21;
        if (i22 == 0) {
            setMeasuredDimension(i20, 0);
            return;
        }
        int i24 = i21 + (i23 / i22);
        int childCount = getChildCount();
        int i25 = 0;
        int i26 = 0;
        boolean z17 = false;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        long j10 = 0;
        while (i26 < childCount) {
            View childAt = getChildAt(i26);
            int i30 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z18 = childAt instanceof ActionMenuItemView;
                int i31 = i27 + 1;
                if (z18) {
                    int i32 = this.f11487z;
                    i18 = i31;
                    z15 = false;
                    childAt.setPadding(i32, 0, i32, 0);
                } else {
                    i18 = i31;
                    z15 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f11493f = z15;
                cVar.f11490c = z15 ? 1 : 0;
                cVar.f11489b = z15;
                cVar.f11491d = z15;
                cVar.leftMargin = z15;
                cVar.rightMargin = z15;
                if (!z18 || !((ActionMenuItemView) childAt).f()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                cVar.f11492e = z16;
                if (cVar.f11488a) {
                    i19 = 1;
                } else {
                    i19 = i22;
                }
                int L10 = L(childAt, i24, i19, childMeasureSpec, paddingTop);
                i28 = Math.max(i28, L10);
                if (cVar.f11491d) {
                    i29++;
                }
                if (cVar.f11488a) {
                    z17 = true;
                }
                i22 -= L10;
                i25 = Math.max(i25, childAt.getMeasuredHeight());
                if (L10 == 1) {
                    j10 |= (long) (1 << i26);
                    i25 = i25;
                } else {
                    int i33 = i25;
                }
                i27 = i18;
            }
            i26++;
            size2 = i30;
        }
        int i34 = size2;
        if (!z17 || i27 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z19 = false;
        while (true) {
            if (i29 <= 0 || i22 <= 0) {
                i14 = mode;
                i12 = i20;
                z11 = z19;
                i13 = i25;
            } else {
                int i35 = Integer.MAX_VALUE;
                int i36 = 0;
                int i37 = 0;
                long j11 = 0;
                while (i37 < childCount) {
                    boolean z20 = z19;
                    c cVar2 = (c) getChildAt(i37).getLayoutParams();
                    int i38 = i25;
                    if (cVar2.f11491d) {
                        int i39 = cVar2.f11489b;
                        if (i39 < i35) {
                            j11 = 1 << i37;
                            i35 = i39;
                            i36 = 1;
                        } else if (i39 == i35) {
                            i36++;
                            j11 |= 1 << i37;
                        }
                    }
                    i37++;
                    i25 = i38;
                    z19 = z20;
                }
                z11 = z19;
                i13 = i25;
                j10 |= j11;
                if (i36 > i22) {
                    i14 = mode;
                    i12 = i20;
                    break;
                }
                int i40 = i35 + 1;
                int i41 = 0;
                while (i41 < childCount) {
                    View childAt2 = getChildAt(i41);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i42 = i20;
                    int i43 = mode;
                    long j12 = (long) (1 << i41);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f11489b == i40) {
                            j10 |= j12;
                        }
                        z14 = z10;
                    } else {
                        if (!z10 || !cVar3.f11492e || i22 != 1) {
                            z14 = z10;
                        } else {
                            int i44 = this.f11487z;
                            z14 = z10;
                            childAt2.setPadding(i44 + i24, 0, i44, 0);
                        }
                        cVar3.f11489b++;
                        cVar3.f11493f = true;
                        i22--;
                    }
                    i41++;
                    mode = i43;
                    i20 = i42;
                    z10 = z14;
                }
                i25 = i13;
                z19 = true;
            }
        }
        if (z17 || i27 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i22 <= 0 || j10 == 0 || (i22 >= i27 - 1 && !z12 && i28 <= 1)) {
            i15 = 0;
            z13 = z11;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z12) {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f11492e) {
                    bitCount -= 0.5f;
                }
                int i45 = childCount - 1;
                if ((j10 & ((long) (1 << i45))) != 0 && !((c) getChildAt(i45).getLayoutParams()).f11492e) {
                    bitCount -= 0.5f;
                }
            } else {
                i15 = 0;
            }
            if (bitCount > 0.0f) {
                i17 = (int) (((float) (i22 * i24)) / bitCount);
            } else {
                i17 = i15;
            }
            z13 = z11;
            for (int i46 = i15; i46 < childCount; i46++) {
                if ((j10 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f11490c = i17;
                        cVar4.f11493f = true;
                        if (i46 == 0 && !cVar4.f11492e) {
                            cVar4.leftMargin = (-i17) / 2;
                        }
                        z13 = true;
                    } else if (cVar4.f11488a) {
                        cVar4.f11490c = i17;
                        cVar4.f11493f = true;
                        cVar4.rightMargin = (-i17) / 2;
                        z13 = true;
                    } else {
                        if (i46 != 0) {
                            cVar4.leftMargin = i17 / 2;
                        }
                        if (i46 != childCount - 1) {
                            cVar4.rightMargin = i17 / 2;
                        }
                    }
                }
            }
        }
        if (z13) {
            for (int i47 = i15; i47 < childCount; i47++) {
                View childAt4 = getChildAt(i47);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f11493f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f11489b * i24) + cVar5.f11490c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i14 != 1073741824) {
            i16 = i13;
        } else {
            i16 = i34;
        }
        setMeasuredDimension(i12, i16);
    }

    public void B() {
        C1564c cVar = this.f11481t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return m();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C10 = m();
        C10.f11488a = true;
        return C10;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = ((a) childAt).a();
        }
        if (i10 <= 0 || !(childAt2 instanceof a)) {
            return z10;
        }
        return z10 | ((a) childAt2).b();
    }

    public boolean H() {
        C1564c cVar = this.f11481t;
        if (cVar == null || !cVar.B()) {
            return false;
        }
        return true;
    }

    public boolean I() {
        C1564c cVar = this.f11481t;
        if (cVar == null || !cVar.D()) {
            return false;
        }
        return true;
    }

    public boolean J() {
        C1564c cVar = this.f11481t;
        if (cVar == null || !cVar.E()) {
            return false;
        }
        return true;
    }

    public boolean K() {
        return this.f11480s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f11477p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f11482u = aVar;
        this.f11483v = aVar2;
    }

    public boolean P() {
        C1564c cVar = this.f11481t;
        if (cVar == null || !cVar.K()) {
            return false;
        }
        return true;
    }

    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f11477p = eVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(g gVar) {
        return this.f11477p.M(gVar, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f11477p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f11477p = eVar;
            eVar.S(new d());
            C1564c cVar = new C1564c(context);
            this.f11481t = cVar;
            cVar.J(true);
            C1564c cVar2 = this.f11481t;
            j.a aVar = this.f11482u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.e(aVar);
            this.f11477p.c(this.f11481t, this.f11478q);
            this.f11481t.H(this);
        }
        return this.f11477p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f11481t.A();
    }

    public int getPopupTheme() {
        return this.f11479r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1564c cVar = this.f11481t;
        if (cVar != null) {
            cVar.g(false);
            if (this.f11481t.E()) {
                this.f11481t.B();
                this.f11481t.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (!this.f11484w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i12 - i10;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = r0.b(this);
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f11488a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i21)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i15 = getPaddingLeft() + cVar.leftMargin;
                        i16 = i15 + measuredWidth;
                    } else {
                        i16 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i15 = i16 - measuredWidth;
                    }
                    int i22 = i17 - (measuredHeight / 2);
                    childAt.layout(i15, i22, i16, measuredHeight + i22);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i21);
                    i20++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i23 = (i18 / 2) - (measuredWidth2 / 2);
            int i24 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i23, i24, measuredWidth2 + i23, measuredHeight2 + i24);
            return;
        }
        int i25 = i20 - (i19 ^ 1);
        if (i25 > 0) {
            i14 = paddingRight / i25;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f11488a) {
                    int i27 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width = i27 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f11488a) {
                int i30 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i30, i31, i30 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft = i30 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = this.f11484w;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11484w = z10;
        if (z11 != z10) {
            this.f11485x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.f11484w || (eVar = this.f11477p) == null || size == this.f11485x)) {
            this.f11485x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (!this.f11484w || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        M(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f11481t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f11476A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f11481t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f11480s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f11479r != i10) {
            this.f11479r = i10;
            if (i10 == 0) {
                this.f11478q = getContext();
            } else {
                this.f11478q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C1564c cVar) {
        this.f11481t = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f11486y = (int) (56.0f * f10);
        this.f11487z = (int) (f10 * 4.0f);
        this.f11478q = context;
        this.f11479r = 0;
    }
}

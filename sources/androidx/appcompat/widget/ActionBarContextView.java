package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.core.view.C1680b0;
import androidx.core.view.C1700l0;
import i.C2037a;
import i.C2042f;
import i.C2043g;
import i.j;

public class ActionBarContextView extends C1562a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f11424i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f11425j;

    /* renamed from: k  reason: collision with root package name */
    private View f11426k;

    /* renamed from: l  reason: collision with root package name */
    private View f11427l;

    /* renamed from: m  reason: collision with root package name */
    private View f11428m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f11429n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f11430o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f11431p;

    /* renamed from: q  reason: collision with root package name */
    private int f11432q;

    /* renamed from: r  reason: collision with root package name */
    private int f11433r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11434s;

    /* renamed from: t  reason: collision with root package name */
    private int f11435t;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11436a;

        a(b bVar) {
            this.f11436a = bVar;
        }

        public void onClick(View view) {
            this.f11436a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        int i10;
        if (this.f11429n == null) {
            LayoutInflater.from(getContext()).inflate(C2043g.f21394a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f11429n = linearLayout;
            this.f11430o = (TextView) linearLayout.findViewById(C2042f.f21373f);
            this.f11431p = (TextView) this.f11429n.findViewById(C2042f.f21372e);
            if (this.f11432q != 0) {
                this.f11430o.setTextAppearance(getContext(), this.f11432q);
            }
            if (this.f11433r != 0) {
                this.f11431p.setTextAppearance(getContext(), this.f11433r);
            }
        }
        this.f11430o.setText(this.f11424i);
        this.f11431p.setText(this.f11425j);
        boolean isEmpty = TextUtils.isEmpty(this.f11424i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f11425j);
        TextView textView = this.f11431p;
        int i11 = 8;
        if (!isEmpty2) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f11429n;
        if (!isEmpty || !isEmpty2) {
            i11 = 0;
        }
        linearLayout2.setVisibility(i11);
        if (this.f11429n.getParent() == null) {
            addView(this.f11429n);
        }
    }

    public /* bridge */ /* synthetic */ C1700l0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f11426k == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f11425j;
    }

    public CharSequence getTitle() {
        return this.f11424i;
    }

    public void h(b bVar) {
        View view = this.f11426k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f11435t, this, false);
            this.f11426k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f11426k);
        }
        View findViewById = this.f11426k.findViewById(C2042f.f21377j);
        this.f11427l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        C1564c cVar = this.f11762d;
        if (cVar != null) {
            cVar.y();
        }
        C1564c cVar2 = new C1564c(getContext());
        this.f11762d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f11762d, this.f11760b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f11762d.o(this);
        this.f11761c = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f11761c, layoutParams);
    }

    public boolean j() {
        return this.f11434s;
    }

    public void k() {
        removeAllViews();
        this.f11428m = null;
        this.f11761c = null;
        this.f11762d = null;
        View view = this.f11427l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        C1564c cVar = this.f11762d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1564c cVar = this.f11762d;
        if (cVar != null) {
            cVar.B();
            this.f11762d.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        boolean b10 = r0.b(this);
        if (b10) {
            i14 = (i12 - i10) - getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f11426k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11426k.getLayoutParams();
            if (b10) {
                i16 = marginLayoutParams.rightMargin;
            } else {
                i16 = marginLayoutParams.leftMargin;
            }
            if (b10) {
                i17 = marginLayoutParams.leftMargin;
            } else {
                i17 = marginLayoutParams.rightMargin;
            }
            int d10 = C1562a.d(i14, i16, b10);
            i14 = C1562a.d(d10 + e(this.f11426k, d10, paddingTop, paddingTop2, b10), i17, b10);
        }
        int i18 = i14;
        LinearLayout linearLayout = this.f11429n;
        if (!(linearLayout == null || this.f11428m != null || linearLayout.getVisibility() == 8)) {
            i18 += e(this.f11429n, i18, paddingTop, paddingTop2, b10);
        }
        int i19 = i18;
        View view2 = this.f11428m;
        if (view2 != null) {
            e(view2, i19, paddingTop, paddingTop2, b10);
        }
        if (b10) {
            i15 = getPaddingLeft();
        } else {
            i15 = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f11761c;
        if (actionMenuView != null) {
            e(actionMenuView, i15, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i15 = this.f11763e;
            if (i15 <= 0) {
                i15 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i16 = i15 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
            View view = this.f11426k;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11426k.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f11761c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f11761c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f11429n;
            if (linearLayout != null && this.f11428m == null) {
                if (this.f11434s) {
                    this.f11429n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f11429n.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f11429n;
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f11428m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i17 = layoutParams.width;
                if (i17 != -2) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    paddingLeft = Math.min(i17, paddingLeft);
                }
                int i18 = layoutParams.height;
                if (i18 == -2) {
                    i14 = Integer.MIN_VALUE;
                }
                if (i18 >= 0) {
                    i16 = Math.min(i18, i16);
                }
                this.f11428m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
            }
            if (this.f11763e <= 0) {
                int childCount = getChildCount();
                int i19 = 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i19) {
                        i19 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i19);
                return;
            }
            setMeasuredDimension(size, i15);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f11763e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f11428m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f11428m = view;
        if (!(view == null || (linearLayout = this.f11429n) == null)) {
            removeView(linearLayout);
            this.f11429n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11425j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f11424i = charSequence;
        i();
        C1680b0.r0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f11434s) {
            requestLayout();
        }
        this.f11434s = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21264g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g0 v10 = g0.v(context, attributeSet, j.f21674y, i10, 0);
        setBackground(v10.g(j.f21679z));
        this.f11432q = v10.n(j.f21447D, 0);
        this.f11433r = v10.n(j.f21442C, 0);
        this.f11763e = v10.m(j.f21437B, 0);
        this.f11435t = v10.n(j.f21432A, C2043g.f21397d);
        v10.x();
    }
}

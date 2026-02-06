package com.google.android.material.appbar;

import Ua.a;
import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1680b0;
import com.google.android.material.internal.m;
import ib.C5020g;
import ib.C5021h;
import q1.C2429a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: f  reason: collision with root package name */
    private static final int f55486f = i.f52929s;

    /* renamed from: g  reason: collision with root package name */
    private static final ImageView.ScaleType[] f55487g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a  reason: collision with root package name */
    private Integer f55488a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55489b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55490c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView.ScaleType f55491d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f55492e;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f52722J);
    }

    private Drawable A(Drawable drawable) {
        if (drawable == null || this.f55488a == null) {
            return drawable;
        }
        Drawable l10 = C2429a.l(drawable.mutate());
        C2429a.h(l10, this.f55488a.intValue());
        return l10;
    }

    private void B() {
        ImageView b10 = m.b(this);
        if (b10 != null) {
            Boolean bool = this.f55492e;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f55491d;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    private Pair w(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void x(Context context) {
        int i10;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C5020g gVar = new C5020g();
            if (background != null) {
                i10 = ((ColorDrawable) background).getColor();
            } else {
                i10 = 0;
            }
            gVar.W(ColorStateList.valueOf(i10));
            gVar.M(context);
            gVar.V(C1680b0.v(this));
            C1680b0.s0(this, gVar);
        }
    }

    private void y(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void z() {
        if (this.f55489b || this.f55490c) {
            TextView e10 = m.e(this);
            TextView c10 = m.c(this);
            if (e10 != null || c10 != null) {
                Pair w10 = w(e10, c10);
                if (this.f55489b && e10 != null) {
                    y(e10, w10);
                }
                if (this.f55490c && c10 != null) {
                    y(c10, w10);
                }
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f55491d;
    }

    public Integer getNavigationIconTint() {
        return this.f55488a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5021h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z();
        B();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        C5021h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f55492e;
        if (bool == null || bool.booleanValue() != z10) {
            this.f55492e = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f55491d != scaleType) {
            this.f55491d = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(A(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f55488a = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f55490c != z10) {
            this.f55490c = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f55489b != z10) {
            this.f55489b = z10;
            requestLayout();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f55486f
            android.content.Context r8 = jb.C5041a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = Ua.j.f52950C3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r10 = Ua.j.f52974F3
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L_0x002b
            int r10 = Ua.j.f52974F3
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x002b:
            int r10 = Ua.j.f52989H3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f55489b = r10
            int r10 = Ua.j.f52982G3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f55490c = r10
            int r10 = Ua.j.f52966E3
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L_0x004c
            android.widget.ImageView$ScaleType[] r0 = f55487g
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004c
            r10 = r0[r10]
            r7.f55491d = r10
        L_0x004c:
            int r10 = Ua.j.f52958D3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x0060
            int r10 = Ua.j.f52958D3
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f55492e = r10
        L_0x0060:
            r9.recycle()
            r7.x(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

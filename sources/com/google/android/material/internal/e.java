package com.google.android.material.internal;

import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;
import androidx.core.view.C1718v;
import com.google.android.gms.common.api.a;

public abstract class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f56057a;

    /* renamed from: b  reason: collision with root package name */
    private int f56058b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56059c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f56060d;

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        if (i11 == Integer.MIN_VALUE) {
            return Math.min(i12, i10);
        }
        if (i11 != 1073741824) {
            return i12;
        }
        return i10;
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.f52964E1, 0, 0);
        this.f56057a = obtainStyledAttributes.getDimensionPixelSize(j.f52980G1, 0);
        this.f56058b = obtainStyledAttributes.getDimensionPixelSize(j.f52972F1, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(Ua.e.f52818N);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.f56059c;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f56058b;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f56057a;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f56060d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getChildCount() == 0) {
            this.f56060d = 0;
            return;
        }
        this.f56060d = 1;
        if (C1680b0.A(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        if (z11) {
            i15 = getPaddingLeft();
        } else {
            i15 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i18 = (i12 - i10) - i15;
        int i19 = i14;
        int i20 = paddingTop;
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(Ua.e.f52818N, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = C1718v.b(marginLayoutParams);
                    i17 = C1718v.a(marginLayoutParams);
                } else {
                    i17 = 0;
                    i16 = 0;
                }
                int measuredWidth = i19 + i16 + childAt.getMeasuredWidth();
                if (!this.f56059c && measuredWidth > i18) {
                    i20 = this.f56057a + paddingTop;
                    this.f56060d++;
                    i19 = i14;
                }
                childAt.setTag(Ua.e.f52818N, Integer.valueOf(this.f56060d - 1));
                int i22 = i19 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                int measuredHeight = childAt.getMeasuredHeight() + i20;
                if (z11) {
                    childAt.layout(i18 - measuredWidth2, i20, (i18 - i19) - i16, measuredHeight);
                } else {
                    childAt.layout(i22, i20, measuredWidth2, measuredHeight);
                }
                i19 += i16 + i17 + childAt.getMeasuredWidth() + this.f56058b;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i12 = size;
        } else {
            i12 = a.e.API_PRIORITY_OTHER;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i10;
                int i20 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
                int i21 = paddingLeft;
                if (paddingLeft + i14 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i15 = i21;
                } else {
                    i15 = getPaddingLeft();
                    i16 = this.f56057a + paddingTop;
                }
                int measuredWidth = i15 + i14 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i15 + i14 + i13 + childAt.getMeasuredWidth() + this.f56058b;
                if (i18 == getChildCount() - 1) {
                    i17 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i10) {
        this.f56058b = i10;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i10) {
        this.f56057a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f56059c = z10;
    }
}

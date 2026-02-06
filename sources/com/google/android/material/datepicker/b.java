package com.google.android.material.datepicker;

import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import fb.C4982c;
import ib.C5020g;
import ib.C5024k;
import x1.g;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f55794a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f55795b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f55796c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f55797d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55798e;

    /* renamed from: f  reason: collision with root package name */
    private final C5024k f55799f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C5024k kVar, Rect rect) {
        g.c(rect.left);
        g.c(rect.top);
        g.c(rect.right);
        g.c(rect.bottom);
        this.f55794a = rect;
        this.f55795b = colorStateList2;
        this.f55796c = colorStateList;
        this.f55797d = colorStateList3;
        this.f55798e = i10;
        this.f55799f = kVar;
    }

    static b a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.a(z10, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, j.f53051Q2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(j.f53058R2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f53072T2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f53065S2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f53079U2, 0));
        ColorStateList a10 = C4982c.a(context, obtainStyledAttributes, j.f53086V2);
        ColorStateList a11 = C4982c.a(context, obtainStyledAttributes, j.f53122a3);
        ColorStateList a12 = C4982c.a(context, obtainStyledAttributes, j.f53107Y2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f53114Z2, 0);
        C5024k m10 = C5024k.b(context, obtainStyledAttributes.getResourceId(j.f53093W2, 0), obtainStyledAttributes.getResourceId(j.f53100X2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f55794a.bottom;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f55794a.top;
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView) {
        C5020g gVar = new C5020g();
        C5020g gVar2 = new C5020g();
        gVar.setShapeAppearanceModel(this.f55799f);
        gVar2.setShapeAppearanceModel(this.f55799f);
        gVar.W(this.f55796c);
        gVar.b0((float) this.f55798e, this.f55797d);
        textView.setTextColor(this.f55795b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f55795b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f55794a;
        C1680b0.s0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}

package com.google.android.material.divider;

import Ua.a;
import Ua.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.c;
import androidx.core.view.C1680b0;
import ib.C5020g;

public class MaterialDivider extends View {

    /* renamed from: f  reason: collision with root package name */
    private static final int f55940f = i.f52926p;

    /* renamed from: a  reason: collision with root package name */
    private final C5020g f55941a;

    /* renamed from: b  reason: collision with root package name */
    private int f55942b;

    /* renamed from: c  reason: collision with root package name */
    private int f55943c;

    /* renamed from: d  reason: collision with root package name */
    private int f55944d;

    /* renamed from: e  reason: collision with root package name */
    private int f55945e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f52745w);
    }

    public int getDividerColor() {
        return this.f55943c;
    }

    public int getDividerInsetEnd() {
        return this.f55945e;
    }

    public int getDividerInsetStart() {
        return this.f55944d;
    }

    public int getDividerThickness() {
        return this.f55942b;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i10;
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z10 = true;
        if (C1680b0.A(this) != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f55945e;
        } else {
            i10 = this.f55944d;
        }
        if (z10) {
            width = getWidth();
            i11 = this.f55944d;
        } else {
            width = getWidth();
            i11 = this.f55945e;
        }
        this.f55941a.setBounds(i10, 0, width - i11, getBottom() - getTop());
        this.f55941a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f55942b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f55943c != i10) {
            this.f55943c = i10;
            this.f55941a.W(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(c.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f55945e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f55944d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f55942b != i10) {
            this.f55942b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f55940f
            android.content.Context r8 = jb.C5041a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            ib.g r0 = new ib.g
            r0.<init>()
            r7.f55941a = r0
            int[] r2 = Ua.j.f53170g3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r10 = Ua.j.f53202k3
            android.content.res.Resources r0 = r7.getResources()
            int r1 = Ua.c.f52782k
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f55942b = r10
            int r10 = Ua.j.f53194j3
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f55944d = r10
            int r10 = Ua.j.f53186i3
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f55945e = r10
            int r10 = Ua.j.f53178h3
            android.content.res.ColorStateList r8 = fb.C4982c.a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

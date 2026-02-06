package com.google.android.material.internal;

import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.S;

public abstract class f extends S {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f56061p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f56062q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f56063r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private int f56064s = 119;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f56065t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f56066u = false;

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray h10 = l.h(context, attributeSet, j.f53001J1, i10, 0, new int[0]);
        this.f56064s = h10.getInt(j.f53015L1, this.f56064s);
        Drawable drawable = h10.getDrawable(j.f53008K1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f56065t = h10.getBoolean(j.f53022M1, true);
        h10.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f56061p;
        if (drawable != null) {
            if (this.f56066u) {
                this.f56066u = false;
                Rect rect = this.f56062q;
                Rect rect2 = this.f56063r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f56065t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f56064s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f56061p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f56061p;
        if (drawable != null && drawable.isStateful()) {
            this.f56061p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f56061p;
    }

    public int getForegroundGravity() {
        return this.f56064s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f56061p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f56066u = z10 | this.f56066u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f56066u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f56061p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f56061p);
            }
            this.f56061p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f56064s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f56064s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f56064s = i10;
            if (i10 == 119 && this.f56061p != null) {
                this.f56061p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f56061p) {
            return true;
        }
        return false;
    }
}

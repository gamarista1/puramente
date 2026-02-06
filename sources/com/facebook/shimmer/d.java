package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.b;

public abstract class d extends FrameLayout {
    private final Paint mContentPaint = new Paint();
    private final c mShimmerDrawable = new c();
    private boolean mShowShimmer = true;

    public d(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        b.C0657b bVar;
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new b.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f42431a, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(a.f42436f) || !obtainStyledAttributes.getBoolean(a.f42436f, false)) {
                bVar = new b.a();
            } else {
                bVar = new b.c();
            }
            setShimmer(bVar.c(obtainStyledAttributes).a());
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        return this.mShimmerDrawable.a();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public d setShimmer(b bVar) {
        this.mShimmerDrawable.d(bVar);
        if (bVar == null || !bVar.f42466o) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.mContentPaint);
        }
        return this;
    }

    public void showShimmer(boolean z10) {
        if (!this.mShowShimmer) {
            this.mShowShimmer = true;
            if (z10) {
                startShimmer();
            }
        }
    }

    public void startShimmer() {
        this.mShimmerDrawable.e();
    }

    public void stopShimmer() {
        this.mShimmerDrawable.f();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable) {
            return true;
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet);
    }
}

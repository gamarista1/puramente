package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ha.f;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f43001a;

    /* renamed from: b  reason: collision with root package name */
    private float f43002b;

    /* renamed from: c  reason: collision with root package name */
    private int f43003c = 0;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f43004a;

        /* renamed from: b  reason: collision with root package name */
        private float f43005b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f43006c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43007d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f43004a = f10;
            this.f43005b = f11;
            this.f43006c = z10;
            if (!this.f43007d) {
                this.f43007d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f43007d = false;
            b unused = AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.f44159a, 0, 0);
            try {
                this.f43003c = obtainStyledAttributes.getInt(f.f44160b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f43001a = new c();
    }

    public int getResizeMode() {
        return this.f43003c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f43002b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = (float) measuredWidth;
            float f13 = (float) measuredHeight;
            float f14 = f12 / f13;
            float f15 = (this.f43002b / f14) - 1.0f;
            if (Math.abs(f15) <= 0.01f) {
                this.f43001a.a(this.f43002b, f14, false);
                return;
            }
            int i12 = this.f43003c;
            if (i12 != 0) {
                if (i12 == 1) {
                    f11 = this.f43002b;
                } else if (i12 != 2) {
                    if (i12 == 4) {
                        if (f15 > 0.0f) {
                            f10 = this.f43002b;
                        } else {
                            f11 = this.f43002b;
                        }
                    }
                    this.f43001a.a(this.f43002b, f14, true);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                } else {
                    f10 = this.f43002b;
                }
                measuredHeight = (int) (f12 / f11);
                this.f43001a.a(this.f43002b, f14, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else if (f15 > 0.0f) {
                f11 = this.f43002b;
                measuredHeight = (int) (f12 / f11);
                this.f43001a.a(this.f43002b, f14, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else {
                f10 = this.f43002b;
            }
            measuredWidth = (int) (f13 * f10);
            this.f43001a.a(this.f43002b, f14, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f10) {
        if (this.f43002b != f10) {
            this.f43002b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f43003c != i10) {
            this.f43003c = i10;
            requestLayout();
        }
    }
}

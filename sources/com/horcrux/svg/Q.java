package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

class Q extends C4916z {

    /* renamed from: f  reason: collision with root package name */
    private float f58800f;

    /* renamed from: g  reason: collision with root package name */
    private float f58801g;

    /* renamed from: h  reason: collision with root package name */
    private float f58802h;

    /* renamed from: i  reason: collision with root package name */
    private float f58803i;

    /* renamed from: j  reason: collision with root package name */
    private String f58804j;

    /* renamed from: k  reason: collision with root package name */
    private int f58805k;

    public Q(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f58804j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f58805k = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f58800f = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f58801g = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f58803i = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f58802h = f10;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void w(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f58804j != null) {
            float f13 = this.f58800f;
            float f14 = this.mScale;
            float f15 = this.f58801g;
            canvas.concat(o0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f58802h) * f14, (f15 + this.f58803i) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f58804j, this.f58805k));
            super.draw(canvas, paint, f10);
        }
    }
}

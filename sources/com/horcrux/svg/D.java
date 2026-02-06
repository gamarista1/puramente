package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

class D extends C4916z {

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f58709f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f58710g;

    /* renamed from: h  reason: collision with root package name */
    private SVGLength f58711h;

    /* renamed from: i  reason: collision with root package name */
    private SVGLength f58712i;

    /* renamed from: j  reason: collision with root package name */
    private String f58713j;

    /* renamed from: k  reason: collision with root package name */
    private String f58714k;

    /* renamed from: l  reason: collision with root package name */
    private float f58715l;

    /* renamed from: m  reason: collision with root package name */
    private float f58716m;

    /* renamed from: n  reason: collision with root package name */
    private float f58717n;

    /* renamed from: o  reason: collision with root package name */
    private float f58718o;

    /* renamed from: p  reason: collision with root package name */
    String f58719p;

    /* renamed from: q  reason: collision with root package name */
    int f58720q;

    /* renamed from: r  reason: collision with root package name */
    Matrix f58721r = new Matrix();

    public D(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(String str) {
        this.f58714k = str;
        invalidate();
    }

    public void B(Dynamic dynamic) {
        this.f58709f = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f58710g = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f58719p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f58720q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f58715l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f58716m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f58718o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f58717n = f10;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void w(Canvas canvas, Paint paint, float f10, L l10, float f11) {
        double d10;
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f58721r.reset();
        J j10 = l10.f58773b;
        this.f58721r.setTranslate((float) j10.f58762a, (float) j10.f58763b);
        if ("auto".equals(this.f58714k)) {
            d10 = -1.0d;
        } else {
            d10 = Double.parseDouble(this.f58714k);
        }
        if (d10 == -1.0d) {
            d10 = l10.f58774c;
        }
        this.f58721r.preRotate(((float) d10) + 180.0f);
        if ("strokeWidth".equals(this.f58713j)) {
            Matrix matrix = this.f58721r;
            float f12 = this.mScale;
            matrix.preScale(f11 / f12, f11 / f12);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f58711h) / ((double) this.mScale)), (float) (relativeOnHeight(this.f58712i) / ((double) this.mScale)));
        if (this.f58719p != null) {
            float f13 = this.f58715l;
            float f14 = this.mScale;
            float f15 = this.f58716m;
            Matrix a10 = o0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f58717n) * f14, (f15 + this.f58718o) * f14), rectF, this.f58719p, this.f58720q);
            float[] fArr = new float[9];
            a10.getValues(fArr);
            this.f58721r.preScale(fArr[0], fArr[4]);
        }
        this.f58721r.preTranslate((float) (-relativeOnWidth(this.f58709f)), (float) (-relativeOnHeight(this.f58710g)));
        canvas.concat(this.f58721r);
        l(canvas, paint, f10);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    public void x(Dynamic dynamic) {
        this.f58712i = SVGLength.b(dynamic);
        invalidate();
    }

    public void y(String str) {
        this.f58713j = str;
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f58711h = SVGLength.b(dynamic);
        invalidate();
    }
}

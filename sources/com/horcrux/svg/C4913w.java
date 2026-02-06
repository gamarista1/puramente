package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.w  reason: case insensitive filesystem */
class C4913w extends C4916z {

    /* renamed from: f  reason: collision with root package name */
    SVGLength f59055f;

    /* renamed from: g  reason: collision with root package name */
    SVGLength f59056g;

    /* renamed from: h  reason: collision with root package name */
    SVGLength f59057h;

    /* renamed from: i  reason: collision with root package name */
    SVGLength f59058i;

    /* renamed from: j  reason: collision with root package name */
    Bitmap f59059j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: k  reason: collision with root package name */
    Canvas f59060k = new Canvas(this.f59059j);

    public C4913w(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f59060k);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        canvas.translate((float) relativeOnWidth(this.f59055f), (float) relativeOnHeight(this.f59056g));
        canvas.clipRect(0.0f, 0.0f, (float) relativeOnWidth(this.f59057h), (float) relativeOnHeight(this.f59058i));
        super.draw(canvas, paint, f10);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(this.f59060k, view, j10);
    }

    /* access modifiers changed from: package-private */
    public void l(Canvas canvas, Paint paint, float f10) {
        r();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        q();
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f59058i = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f59057h = SVGLength.b(dynamic);
        invalidate();
    }

    public void y(Dynamic dynamic) {
        this.f59055f = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f59056g = SVGLength.b(dynamic);
        invalidate();
    }
}

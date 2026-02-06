package com.horcrux.svg;

import U5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

class n0 extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private String f58995a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58996b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58997c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58998d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f58999e;

    public n0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f58995a);
        if (definedTemplate == null) {
            a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f58995a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f58996b), (float) relativeOnHeight(this.f58997c));
        boolean z10 = definedTemplate instanceof RenderableView;
        if (z10) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof Q) {
            ((Q) definedTemplate).w(canvas, paint, f10, (float) relativeOnWidth(this.f58998d), (float) relativeOnHeight(this.f58999e));
        } else {
            definedTemplate.draw(canvas, paint, f10 * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (z10) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f58995a);
        if (definedTemplate == null) {
            a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f58995a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f58996b), (float) relativeOnHeight(this.f58997c));
        path.transform(matrix, path2);
        return path2;
    }

    /* access modifiers changed from: package-private */
    public int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f58995a);
            if (definedTemplate == null) {
                a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f58995a + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                if (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) {
                    return hitTest;
                }
                return getId();
            }
        }
        return -1;
    }

    public void l(Dynamic dynamic) {
        this.f58999e = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(String str) {
        this.f58995a = str;
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f58998d = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f58996b = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f58997c = SVGLength.b(dynamic);
        invalidate();
    }
}

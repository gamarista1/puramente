package com.horcrux.svg;

import U5.a;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C4891a;

class N extends C4895e {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f58781j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58782a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58783b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58784c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58785d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f58786e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f58787f;

    /* renamed from: g  reason: collision with root package name */
    private ReadableArray f58788g;

    /* renamed from: h  reason: collision with root package name */
    private C4891a.b f58789h;

    /* renamed from: i  reason: collision with root package name */
    private Matrix f58790i = null;

    public N(ReactContext reactContext) {
        super(reactContext);
    }

    public void l(Dynamic dynamic) {
        this.f58786e = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(Dynamic dynamic) {
        this.f58787f = SVGLength.b(dynamic);
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f58782a = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f58783b = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(ReadableArray readableArray) {
        this.f58788g = readableArray;
        invalidate();
    }

    public void q(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f58781j;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f58790i == null) {
                    this.f58790i = new Matrix();
                }
                this.f58790i.setValues(fArr);
            } else if (c10 != -1) {
                a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f58790i = null;
        }
        invalidate();
    }

    public void r(int i10) {
        if (i10 == 0) {
            this.f58789h = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58789h = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f58784c = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            C4891a aVar = new C4891a(C4891a.C0872a.RADIAL_GRADIENT, new SVGLength[]{this.f58782a, this.f58783b, this.f58784c, this.f58785d, this.f58786e, this.f58787f}, this.f58789h);
            aVar.e(this.f58788g);
            Matrix matrix = this.f58790i;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f58789h == C4891a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f58785d = SVGLength.b(dynamic);
        invalidate();
    }
}

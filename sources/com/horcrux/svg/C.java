package com.horcrux.svg;

import U5.a;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C4891a;

class C extends C4895e {

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f58701h = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58702a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58703b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58704c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58705d;

    /* renamed from: e  reason: collision with root package name */
    private ReadableArray f58706e;

    /* renamed from: f  reason: collision with root package name */
    private C4891a.b f58707f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f58708g = null;

    public C(ReactContext reactContext) {
        super(reactContext);
    }

    public void l(ReadableArray readableArray) {
        this.f58706e = readableArray;
        invalidate();
    }

    public void m(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f58701h;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f58708g == null) {
                    this.f58708g = new Matrix();
                }
                this.f58708g.setValues(fArr);
            } else if (c10 != -1) {
                a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f58708g = null;
        }
        invalidate();
    }

    public void n(int i10) {
        if (i10 == 0) {
            this.f58707f = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58707f = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f58702a = SVGLength.b(dynamic);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f58704c = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f58703b = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f58705d = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            C4891a aVar = new C4891a(C4891a.C0872a.LINEAR_GRADIENT, new SVGLength[]{this.f58702a, this.f58703b, this.f58704c, this.f58705d}, this.f58707f);
            aVar.e(this.f58706e);
            Matrix matrix = this.f58708g;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f58707f == C4891a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}

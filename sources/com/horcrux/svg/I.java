package com.horcrux.svg;

import U5.a;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C4891a;

class I extends C4916z {

    /* renamed from: s  reason: collision with root package name */
    private static final float[] f58748s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f58749f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f58750g;

    /* renamed from: h  reason: collision with root package name */
    private SVGLength f58751h;

    /* renamed from: i  reason: collision with root package name */
    private SVGLength f58752i;

    /* renamed from: j  reason: collision with root package name */
    private C4891a.b f58753j;

    /* renamed from: k  reason: collision with root package name */
    private C4891a.b f58754k;

    /* renamed from: l  reason: collision with root package name */
    private float f58755l;

    /* renamed from: m  reason: collision with root package name */
    private float f58756m;

    /* renamed from: n  reason: collision with root package name */
    private float f58757n;

    /* renamed from: o  reason: collision with root package name */
    private float f58758o;

    /* renamed from: p  reason: collision with root package name */
    String f58759p;

    /* renamed from: q  reason: collision with root package name */
    int f58760q;

    /* renamed from: r  reason: collision with root package name */
    private Matrix f58761r = null;

    public I(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(Dynamic dynamic) {
        this.f58751h = SVGLength.b(dynamic);
        invalidate();
    }

    public void B(Dynamic dynamic) {
        this.f58749f = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f58750g = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public RectF getViewBox() {
        float f10 = this.f58755l;
        float f11 = this.mScale;
        float f12 = this.f58756m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f58757n) * f11, (f12 + this.f58758o) * f11);
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            C4891a aVar = new C4891a(C4891a.C0872a.PATTERN, new SVGLength[]{this.f58749f, this.f58750g, this.f58751h, this.f58752i}, this.f58753j);
            aVar.d(this.f58754k);
            aVar.g(this);
            Matrix matrix = this.f58761r;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            C4891a.b bVar = this.f58753j;
            C4891a.b bVar2 = C4891a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f58754k == bVar2) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f58759p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f58760q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f58755l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f58756m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f58758o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f58757n = f10;
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f58752i = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(int i10) {
        if (i10 == 0) {
            this.f58754k = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58754k = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void y(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f58748s;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f58761r == null) {
                    this.f58761r = new Matrix();
                }
                this.f58761r.setValues(fArr);
            } else if (c10 != -1) {
                a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f58761r = null;
        }
        invalidate();
    }

    public void z(int i10) {
        if (i10 == 0) {
            this.f58753j = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58753j = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }
}

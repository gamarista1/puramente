package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C4891a;

class E extends C4916z {

    /* renamed from: f  reason: collision with root package name */
    SVGLength f58722f;

    /* renamed from: g  reason: collision with root package name */
    SVGLength f58723g;

    /* renamed from: h  reason: collision with root package name */
    SVGLength f58724h;

    /* renamed from: i  reason: collision with root package name */
    SVGLength f58725i;

    /* renamed from: j  reason: collision with root package name */
    private C4891a.b f58726j;

    /* renamed from: k  reason: collision with root package name */
    private C4891a.b f58727k;

    /* renamed from: l  reason: collision with root package name */
    a f58728l;

    enum a {
        LUMINANCE,
        ALPHA
    }

    public E(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(int i10) {
        if (i10 == 0) {
            this.f58728l = a.LUMINANCE;
        } else if (i10 == 1) {
            this.f58728l = a.ALPHA;
        }
        invalidate();
    }

    public void B(int i10) {
        if (i10 == 0) {
            this.f58726j = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58726j = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f58724h = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f58722f = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f58723g = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    public a w() {
        return this.f58728l;
    }

    public C4891a.b x() {
        return this.f58726j;
    }

    public void y(Dynamic dynamic) {
        this.f58725i = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(int i10) {
        if (i10 == 0) {
            this.f58727k = C4891a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f58727k = C4891a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }
}

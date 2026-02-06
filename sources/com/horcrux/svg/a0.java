package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

class a0 extends m0 {

    /* renamed from: q  reason: collision with root package name */
    private String f58880q;

    /* renamed from: r  reason: collision with root package name */
    private k0 f58881r;

    /* renamed from: s  reason: collision with root package name */
    private j0 f58882s;

    /* renamed from: t  reason: collision with root package name */
    private SVGLength f58883t;

    /* renamed from: u  reason: collision with root package name */
    private i0 f58884u = i0.align;

    /* renamed from: v  reason: collision with root package name */
    private l0 f58885v = l0.exact;

    public a0(ReactContext reactContext) {
        super(reactContext);
    }

    public void H(String str) {
        this.f58884u = i0.valueOf(str);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public j0 N() {
        return this.f58882s;
    }

    /* access modifiers changed from: package-private */
    public k0 O() {
        return this.f58881r;
    }

    /* access modifiers changed from: package-private */
    public SVGLength P() {
        return this.f58883t;
    }

    /* access modifiers changed from: package-private */
    public Path Q(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f58880q);
        if (!(definedTemplate instanceof RenderableView)) {
            return null;
        }
        return ((RenderableView) definedTemplate).getPath(canvas, paint);
    }

    public void R(String str) {
        this.f58880q = str;
        invalidate();
    }

    public void S(String str) {
        this.f58882s = j0.valueOf(str);
        invalidate();
    }

    public void T(String str) {
        this.f58881r = k0.valueOf(str);
        invalidate();
    }

    public void U(String str) {
        this.f58885v = l0.valueOf(str);
        invalidate();
    }

    public void V(Dynamic dynamic) {
        this.f58883t = SVGLength.b(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        l(canvas, paint, f10);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        return y(canvas, paint);
    }

    /* access modifiers changed from: package-private */
    public void q() {
    }

    /* access modifiers changed from: package-private */
    public void r() {
    }
}

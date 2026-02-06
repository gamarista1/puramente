package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

class m0 extends C4916z {

    /* renamed from: f  reason: collision with root package name */
    SVGLength f58983f = null;

    /* renamed from: g  reason: collision with root package name */
    SVGLength f58984g = null;

    /* renamed from: h  reason: collision with root package name */
    private String f58985h = null;

    /* renamed from: i  reason: collision with root package name */
    h0 f58986i = h0.spacing;

    /* renamed from: j  reason: collision with root package name */
    private b0 f58987j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f58988k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f58989l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f58990m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f58991n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList f58992o;

    /* renamed from: p  reason: collision with root package name */
    double f58993p = Double.NaN;

    public m0(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public m0 A() {
        ArrayList arrayList = p().f59076a;
        ViewParent parent = getParent();
        int size = arrayList.size() - 1;
        m0 m0Var = this;
        ViewParent viewParent = parent;
        while (size >= 0 && (viewParent instanceof m0) && ((C4912v) arrayList.get(size)).f59047j != f0.start && m0Var.f58988k == null) {
            m0Var = (m0) viewParent;
            size--;
            viewParent = m0Var.getParent();
        }
        return m0Var;
    }

    /* access modifiers changed from: package-private */
    public m0 B() {
        m0 m0Var = this;
        ViewParent viewParent = getParent();
        while (viewParent instanceof m0) {
            m0Var = (m0) viewParent;
            viewParent = m0Var.getParent();
        }
        return m0Var;
    }

    public void C(Dynamic dynamic) {
        this.f58985h = SVGLength.c(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f58991n = SVGLength.a(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f58992o = SVGLength.a(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f58983f = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(String str) {
        this.f58986i = h0.valueOf(str);
        invalidate();
    }

    public void H(String str) {
        this.f58987j = b0.b(str);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f58988k = SVGLength.a(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f58989l = SVGLength.a(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f58990m = SVGLength.a(dynamic);
        invalidate();
    }

    public void L(Dynamic dynamic) {
        this.f58984g = SVGLength.b(dynamic);
        invalidate();
    }

    public void M(Dynamic dynamic) {
        String c10 = SVGLength.c(dynamic);
        if (c10 != null) {
            String trim = c10.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f58987j = b0.b(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f58987j = b0.baseline;
            }
            try {
                this.f58985h = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f58985h = null;
            }
        } else {
            this.f58987j = b0.baseline;
            this.f58985h = null;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void clearCache() {
        this.f58993p = Double.NaN;
        super.clearCache();
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        v(canvas);
        clip(canvas, paint);
        y(canvas, paint);
        r();
        l(canvas, paint, f10);
        q();
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        v(canvas);
        return y(canvas, paint);
    }

    public void invalidate() {
        if (this.mPath != null) {
            super.invalidate();
            B().clearChildCache();
        }
    }

    /* access modifiers changed from: package-private */
    public Path o(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    /* access modifiers changed from: package-private */
    public void r() {
        boolean z10;
        if ((this instanceof a0) || (this instanceof Z)) {
            z10 = false;
        } else {
            z10 = true;
        }
        p().p(z10, this, this.f59105a, this.f58988k, this.f58989l, this.f58991n, this.f58992o, this.f58990m);
    }

    /* access modifiers changed from: package-private */
    public b0 w() {
        b0 b0Var;
        if (this.f58987j == null) {
            ViewParent parent = getParent();
            while (parent != null) {
                if (!(parent instanceof m0) || (b0Var = ((m0) parent).f58987j) == null) {
                    parent = parent.getParent();
                } else {
                    this.f58987j = b0Var;
                    return b0Var;
                }
            }
        }
        if (this.f58987j == null) {
            this.f58987j = b0.baseline;
        }
        return this.f58987j;
    }

    /* access modifiers changed from: package-private */
    public String x() {
        String str;
        if (this.f58985h == null) {
            ViewParent parent = getParent();
            while (parent != null) {
                if (!(parent instanceof m0) || (str = ((m0) parent).f58985h) == null) {
                    parent = parent.getParent();
                } else {
                    this.f58985h = str;
                    return str;
                }
            }
        }
        return this.f58985h;
    }

    /* access modifiers changed from: package-private */
    public Path y(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        r();
        this.mPath = super.getPath(canvas, paint);
        q();
        return this.mPath;
    }

    /* access modifiers changed from: package-private */
    public double z(Paint paint) {
        if (!Double.isNaN(this.f58993p)) {
            return this.f58993p;
        }
        double d10 = 0.0d;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof m0) {
                d10 += ((m0) childAt).z(paint);
            }
        }
        this.f58993p = d10;
        return d10;
    }
}

package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

class B extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58697a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58698b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58699c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58700d;

    public B(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f58697a);
        double relativeOnHeight = relativeOnHeight(this.f58698b);
        double relativeOnWidth2 = relativeOnWidth(this.f58699c);
        double relativeOnHeight2 = relativeOnHeight(this.f58700d);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new F(C4897g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, relativeOnHeight)}));
        this.elements.add(new F(C4897g.kCGPathElementAddLineToPoint, new J[]{new J(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    public void l(Dynamic dynamic) {
        this.f58697a = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(Dynamic dynamic) {
        this.f58699c = SVGLength.b(dynamic);
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f58698b = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f58700d = SVGLength.b(dynamic);
        invalidate();
    }
}

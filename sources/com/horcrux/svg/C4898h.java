package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.h  reason: case insensitive filesystem */
class C4898h extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58949a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58950b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58951c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58952d;

    public C4898h(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f58949a);
        double relativeOnHeight = relativeOnHeight(this.f58950b);
        double relativeOnWidth2 = relativeOnWidth(this.f58951c);
        double relativeOnHeight2 = relativeOnHeight(this.f58952d);
        double d10 = relativeOnWidth - relativeOnWidth2;
        double d11 = relativeOnHeight - relativeOnHeight2;
        double d12 = relativeOnWidth2 + relativeOnWidth;
        double d13 = relativeOnHeight2 + relativeOnHeight;
        double d14 = relativeOnHeight;
        path.addOval(new RectF((float) d10, (float) d11, (float) d12, (float) d13), Path.Direction.CW);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new F(C4897g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, d11)}));
        ArrayList<F> arrayList2 = this.elements;
        C4897g gVar = C4897g.kCGPathElementAddLineToPoint;
        double d15 = d14;
        arrayList2.add(new F(gVar, new J[]{new J(relativeOnWidth, d11), new J(d12, d15)}));
        this.elements.add(new F(gVar, new J[]{new J(d12, d15), new J(relativeOnWidth, d13)}));
        ArrayList<F> arrayList3 = this.elements;
        J j10 = new J(relativeOnWidth, d13);
        double d16 = d10;
        arrayList3.add(new F(gVar, new J[]{j10, new J(d16, d15)}));
        this.elements.add(new F(gVar, new J[]{new J(d16, d15), new J(relativeOnWidth, d11)}));
        return path;
    }

    public void l(Dynamic dynamic) {
        this.f58949a = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(Dynamic dynamic) {
        this.f58950b = SVGLength.b(dynamic);
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f58951c = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f58952d = SVGLength.b(dynamic);
        invalidate();
    }
}

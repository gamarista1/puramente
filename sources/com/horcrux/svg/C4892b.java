package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.b  reason: case insensitive filesystem */
class C4892b extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58886a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58887b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58888c;

    public C4892b(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f58886a);
        double relativeOnHeight = relativeOnHeight(this.f58887b);
        double relativeOnOther = relativeOnOther(this.f58888c);
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) relativeOnOther, Path.Direction.CW);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d10 = relativeOnHeight - relativeOnOther;
        arrayList.add(new F(C4897g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, d10)}));
        ArrayList<F> arrayList2 = this.elements;
        C4897g gVar = C4897g.kCGPathElementAddLineToPoint;
        J j10 = new J(relativeOnWidth, d10);
        double d11 = d10;
        double d12 = relativeOnWidth + relativeOnOther;
        arrayList2.add(new F(gVar, new J[]{j10, new J(d12, relativeOnHeight)}));
        double d13 = relativeOnHeight + relativeOnOther;
        this.elements.add(new F(gVar, new J[]{new J(d12, relativeOnHeight), new J(relativeOnWidth, d13)}));
        double d14 = relativeOnWidth - relativeOnOther;
        this.elements.add(new F(gVar, new J[]{new J(relativeOnWidth, d13), new J(d14, relativeOnHeight)}));
        this.elements.add(new F(gVar, new J[]{new J(d14, relativeOnHeight), new J(relativeOnWidth, d11)}));
        return path;
    }

    public void l(Dynamic dynamic) {
        this.f58886a = SVGLength.b(dynamic);
        invalidate();
    }

    public void m(Dynamic dynamic) {
        this.f58887b = SVGLength.b(dynamic);
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f58888c = SVGLength.b(dynamic);
        invalidate();
    }
}

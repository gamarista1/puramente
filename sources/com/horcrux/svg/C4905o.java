package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.o  reason: case insensitive filesystem */
class C4905o extends C4906p {

    /* renamed from: c  reason: collision with root package name */
    String f59000c;

    /* renamed from: d  reason: collision with root package name */
    SVGLength f59001d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f59002e;

    public C4905o(ReactContext reactContext) {
        super(reactContext);
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        float f10;
        float f11;
        Bitmap n10 = C4906p.n(hashMap, bitmap, this.f59000c);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SVGLength sVGLength = this.f59001d;
        if (sVGLength != null) {
            f10 = (float) relativeOnWidth(sVGLength);
        } else {
            f10 = 0.0f;
        }
        SVGLength sVGLength2 = this.f59002e;
        if (sVGLength2 != null) {
            f11 = (float) relativeOnHeight(sVGLength2);
        } else {
            f11 = 0.0f;
        }
        RectF rectF = new RectF(0.0f, 0.0f, f10, f11);
        getSvgView().getCtm().mapRect(rectF);
        canvas.drawBitmap(n10, rectF.width(), rectF.height(), (Paint) null);
        return createBitmap;
    }

    public void t(Dynamic dynamic) {
        this.f59001d = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f59002e = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(String str) {
        this.f59000c = str;
        invalidate();
    }
}

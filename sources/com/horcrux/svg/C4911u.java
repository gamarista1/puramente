package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.u  reason: case insensitive filesystem */
class C4911u extends C4895e {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f59033a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private C4910t f59034b;

    /* renamed from: c  reason: collision with root package name */
    private C4910t f59035c;

    /* renamed from: d  reason: collision with root package name */
    private final FilterRegion f59036d = new FilterRegion();

    public C4911u(ReactContext reactContext) {
        super(reactContext);
    }

    public Bitmap l(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        RectF rectF2;
        this.f59033a.clear();
        this.f59033a.put("SourceGraphic", bitmap);
        this.f59033a.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f59033a.put("BackgroundImage", bitmap2);
        this.f59033a.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Rect cropRect = this.f59036d.getCropRect(this, this.f59034b, rectF);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof C4906p) {
                C4906p pVar = (C4906p) childAt;
                createBitmap.eraseColor(0);
                FilterRegion filterRegion = pVar.f59004b;
                C4910t tVar = this.f59035c;
                if (tVar == C4910t.USER_SPACE_ON_USE) {
                    rectF2 = new RectF(cropRect);
                } else {
                    rectF2 = rectF;
                }
                Rect cropRect2 = filterRegion.getCropRect(pVar, tVar, rectF2);
                canvas.drawBitmap(pVar.l(this.f59033a, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = createBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String m10 = pVar.m();
                if (m10 != null) {
                    this.f59033a.put(m10, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return createBitmap;
    }

    public void m(String str) {
        this.f59034b = C4910t.b(str);
        invalidate();
    }

    public void n(Dynamic dynamic) {
        this.f59036d.setHeight(dynamic);
        invalidate();
    }

    public void o(String str) {
        this.f59035c = C4910t.b(str);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f59036d.setWidth(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f59036d.setX(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f59036d.setY(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        SvgView svgView;
        if (this.mName != null && (svgView = getSvgView()) != null) {
            svgView.defineFilter(this, this.mName);
        }
    }
}

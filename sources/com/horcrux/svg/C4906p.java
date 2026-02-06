package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.p  reason: case insensitive filesystem */
abstract class C4906p extends C4895e {

    /* renamed from: a  reason: collision with root package name */
    private String f59003a;

    /* renamed from: b  reason: collision with root package name */
    public final FilterRegion f59004b = new FilterRegion();

    public C4906p(ReactContext reactContext) {
        super(reactContext);
    }

    protected static Bitmap n(HashMap hashMap, Bitmap bitmap, String str) {
        Bitmap bitmap2;
        if (str != null) {
            bitmap2 = (Bitmap) hashMap.get(str);
        } else {
            bitmap2 = null;
        }
        if (bitmap2 != null) {
            return bitmap2;
        }
        return bitmap;
    }

    public abstract Bitmap l(HashMap hashMap, Bitmap bitmap);

    public String m() {
        return this.f59003a;
    }

    public void o(Dynamic dynamic) {
        this.f59004b.setHeight(dynamic);
        invalidate();
    }

    public void p(String str) {
        this.f59003a = str;
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f59004b.setWidth(dynamic);
        invalidate();
    }

    public void r(Dynamic dynamic) {
        this.f59004b.setX(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f59004b.setY(dynamic);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
    }
}

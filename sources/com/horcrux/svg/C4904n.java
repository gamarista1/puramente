package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.n  reason: case insensitive filesystem */
class C4904n extends C4906p {

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f58994c;

    public C4904n(ReactContext reactContext) {
        super(reactContext);
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = this.f58994c.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = this.f58994c.getString(i10);
            if (string.isEmpty()) {
                bitmap2 = bitmap;
            } else {
                bitmap2 = (Bitmap) hashMap.get(string);
            }
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return createBitmap;
    }

    public void t(ReadableArray readableArray) {
        this.f58994c = readableArray;
        invalidate();
    }
}

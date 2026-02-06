package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.e  reason: case insensitive filesystem */
abstract class C4895e extends VirtualView {
    C4895e(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int hitTest(float[] fArr) {
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean isResponsible() {
        return false;
    }
}

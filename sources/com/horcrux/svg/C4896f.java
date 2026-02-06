package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.f  reason: case insensitive filesystem */
class C4896f extends C4895e {
    public C4896f(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}

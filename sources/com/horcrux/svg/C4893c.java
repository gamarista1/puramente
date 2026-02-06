package com.horcrux.svg;

import U5.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.c  reason: case insensitive filesystem */
class C4893c extends C4916z {
    public C4893c(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        a.I("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    /* access modifiers changed from: package-private */
    public int hitTest(float[] fArr) {
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean isResponsible() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void mergeProperties(RenderableView renderableView) {
    }

    /* access modifiers changed from: package-private */
    public void resetProperties() {
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}

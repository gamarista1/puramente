package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

class H extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private Path f58747a = new Path();

    public H(ReactContext reactContext) {
        super(reactContext);
        G.f58734a = this.mScale;
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f58747a;
    }

    public void l(String str) {
        this.f58747a = G.o(str);
        ArrayList<F> arrayList = G.f58739f;
        this.elements = arrayList;
        Iterator<F> it = arrayList.iterator();
        while (it.hasNext()) {
            for (J j10 : it.next().f58733b) {
                double d10 = j10.f58762a;
                float f10 = this.mScale;
                j10.f58762a = d10 * ((double) f10);
                j10.f58763b *= (double) f10;
            }
        }
        invalidate();
    }
}

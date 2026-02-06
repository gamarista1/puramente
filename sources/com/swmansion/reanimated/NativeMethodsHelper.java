package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.uimanager.C3407d0;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.scroll.e;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.swiperefresh.a;

public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static f findScrollView(a aVar) {
        for (int i10 = 0; i10 < aVar.getChildCount(); i10++) {
            if (aVar.getChildAt(i10) instanceof f) {
                return (f) aVar.getChildAt(i10);
            }
        }
        return null;
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset((float) view2.getLeft(), (float) view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) C3407d0.a(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        computeBoundingBox(view2, iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i10;
        iArr[1] = iArr[1] - i11;
        float[] fArr2 = new float[6];
        fArr2[0] = G.f((float) view.getLeft());
        fArr2[1] = G.f((float) view.getTop());
        for (int i12 = 2; i12 < 6; i12++) {
            fArr2[i12] = G.f((float) iArr[i12 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(View view, double d10, double d11, boolean z10) {
        int round = Math.round(G.g(d10));
        int round2 = Math.round(G.g(d11));
        boolean z11 = view instanceof e;
        if (!z11) {
            if (view instanceof a) {
                view = findScrollView((a) view);
            }
            if (!(view instanceof f)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
        }
        if (!z10) {
            view.scrollTo(round, round2);
        } else if (z11) {
            view.post(new b(view, round, round2));
        } else {
            view.post(new c(view, round, round2));
        }
    }
}

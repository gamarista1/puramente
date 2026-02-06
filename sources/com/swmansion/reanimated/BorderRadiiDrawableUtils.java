package com.swmansion.reanimated;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3430x;
import com.swmansion.reanimated.ReactNativeUtils;
import j8.d;

public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        return new ReactNativeUtils.BorderRadii(getRadiusForCorner(view, d.BORDER_RADIUS, 0.0f), getRadiusForCorner(view, d.BORDER_TOP_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, d.BORDER_TOP_RIGHT_RADIUS, Float.NaN), getRadiusForCorner(view, d.BORDER_BOTTOM_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, d.BORDER_BOTTOM_RIGHT_RADIUS, Float.NaN));
    }

    private static float getRadiusForCorner(View view, d dVar, float f10) {
        C3430x j10 = C3400a.j(view, dVar);
        if (j10 == null) {
            return f10;
        }
        Rect bounds = view.getBackground().getBounds();
        return j10.b((float) bounds.width(), (float) bounds.height()).c().a();
    }
}

package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i10, int i11) {
        this.color = i11;
        addState(new int[]{16842910}, context.getResources().getDrawable(i10));
        addState(new int[]{16842908}, context.getResources().getDrawable(i10));
        addState(new int[]{16842919}, context.getResources().getDrawable(i10));
    }

    private static int darken(int i10, double d10) {
        return Color.argb(255, (int) (((double) Color.red(i10)) * d10), (int) (((double) Color.green(i10)) * d10), (int) (((double) Color.blue(i10)) * d10));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842919 || i10 == 16842908) {
                z10 = true;
            }
        }
        if (z10) {
            setColorFilter(darken(this.color, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(this.color, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }
}

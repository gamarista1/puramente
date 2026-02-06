package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.C1680b0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import q1.C2429a;

abstract class f {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C2429a.l(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C2429a.i(drawable, colorStateList);
            } else {
                C2429a.i(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C2429a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C2429a.l(drawable).mutate();
            C2429a.i(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private static void d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean N10 = C1680b0.N(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (N10 || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(N10);
        checkableImageButton.setPressable(N10);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        C1680b0.y0(checkableImageButton, i10);
    }

    static void e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}

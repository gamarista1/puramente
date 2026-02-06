package com.google.android.material.textview;

import Ua.a;
import Ua.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C;
import fb.C4981b;
import fb.C4982c;
import jb.C5041a;

public class MaterialTextView extends C {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void f(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, j.f53258r3);
        int i11 = i(getContext(), obtainStyledAttributes, j.f53274t3, j.f53282u3);
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    private static boolean g(Context context) {
        return C4981b.b(context, a.f52719G, true);
    }

    private static int h(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f53290v3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(j.f53298w3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = C4982c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f53290v3, i10, i11);
        int i12 = i(context, obtainStyledAttributes, j.f53306x3, j.f53314y3);
        obtainStyledAttributes.recycle();
        if (i12 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            f(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(C5041a.c(context, attributeSet, i10, i11), attributeSet, i10);
        int h10;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!j(context2, theme, attributeSet, i10, i11) && (h10 = h(theme, attributeSet, i10, i11)) != -1) {
                f(theme, h10);
            }
        }
    }
}

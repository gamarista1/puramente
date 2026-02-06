package fb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.g0;
import j.C2115a;

/* renamed from: fb.c  reason: case insensitive filesystem */
public abstract class C4982c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList a10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = C2115a.a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i10);
        }
        return a10;
    }

    public static ColorStateList b(Context context, g0 g0Var, int i10) {
        int n10;
        ColorStateList a10;
        if (!g0Var.s(i10) || (n10 = g0Var.n(i10, 0)) == 0 || (a10 = C2115a.a(context, n10)) == null) {
            return g0Var.c(i10);
        }
        return a10;
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (b10 = C2115a.b(context, resourceId)) == null) {
            return typedArray.getDrawable(i10);
        }
        return b10;
    }

    static int e(TypedArray typedArray, int i10, int i11) {
        if (typedArray.hasValue(i10)) {
            return i10;
        }
        return i11;
    }

    public static C4983d f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new C4983d(context, resourceId);
    }

    public static boolean g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}

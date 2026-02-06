package fb;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import s1.C2589a;

/* renamed from: fb.h  reason: case insensitive filesystem */
public abstract class C4987h {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0) {
            return null;
        }
        return Typeface.create(typeface, C2589a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

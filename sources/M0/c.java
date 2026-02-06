package M0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;
import r0.C2465Q;
import r0.H1;

public abstract class c {
    public static final H1 a(H1.a aVar, Resources resources, int i10) {
        Drawable drawable = resources.getDrawable(i10, (Resources.Theme) null);
        C6496s.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return C2465Q.c(((BitmapDrawable) drawable).getBitmap());
    }
}

package Ya;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import fb.C4981b;
import p1.C2387c;

public abstract class a {
    public static int a(int i10, int i11) {
        return C2387c.p(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int b(Context context, int i10, int i11) {
        TypedValue a10 = C4981b.a(context, i10);
        if (a10 != null) {
            return a10.data;
        }
        return i11;
    }

    public static int c(Context context, int i10, String str) {
        return C4981b.c(context, i10, str);
    }

    public static int d(View view, int i10) {
        return C4981b.d(view, i10);
    }

    public static int e(View view, int i10, int i11) {
        return b(view.getContext(), i10, i11);
    }

    public static boolean f(int i10) {
        if (i10 == 0 || C2387c.g(i10) <= 0.5d) {
            return false;
        }
        return true;
    }

    public static int g(int i10, int i11) {
        return C2387c.k(i11, i10);
    }

    public static int h(int i10, int i11, float f10) {
        return g(i10, C2387c.p(i11, Math.round(((float) Color.alpha(i11)) * f10)));
    }

    public static int i(View view, int i10, int i11, float f10) {
        return h(d(view, i10), d(view, i11), f10);
    }
}

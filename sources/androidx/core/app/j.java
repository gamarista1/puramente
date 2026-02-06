package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import u1.i;

public abstract class j {

    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static i a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return i.b(e.b(context));
        }
        Object b10 = b(context);
        if (b10 != null) {
            return i.j(a.a(b10));
        }
        return i.e();
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }
}

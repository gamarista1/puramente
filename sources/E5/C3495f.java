package e5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.d;
import androidx.core.content.c;
import j.C2115a;
import o1.h;

/* renamed from: e5.f  reason: case insensitive filesystem */
public abstract class C3495f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f43342a = true;

    public static Drawable a(Context context, int i10, Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, int i10) {
        return c(context, context2, i10, (Resources.Theme) null);
    }

    private static Drawable c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f43342a) {
                return e(context2, i10, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f43342a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return c.getDrawable(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable d(Context context, int i10, Resources.Theme theme) {
        return h.f(context.getResources(), i10, theme);
    }

    private static Drawable e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            d dVar = new d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C2115a.b(context, i10);
    }
}

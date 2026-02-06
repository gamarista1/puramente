package o4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.core.content.c;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import j.C2115a;
import o1.h;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o4.d  reason: case insensitive filesystem */
public abstract class C3881d {
    public static final Drawable a(Context context, int i10) {
        Drawable b10 = C2115a.b(context, i10);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable f10 = h.f(resources, i10, theme);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final C1790m c(Context context) {
        while (!(context instanceof C1798v)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((C1798v) context).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        if (c.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}

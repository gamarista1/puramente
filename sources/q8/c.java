package q8;

import Sg.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.h;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47785b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f47786c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Map f47787a = new HashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f47786c;
        }

        private a() {
        }
    }

    private c() {
    }

    private final int b(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        this.f47787a.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final c d() {
        return f47785b.a();
    }

    public final synchronized void c() {
        this.f47787a.clear();
    }

    public final Drawable e(Context context, String str) {
        C6496s.h(context, "context");
        int f10 = f(context, str);
        if (f10 > 0) {
            return h.f(context.getResources(), f10, (Resources.Theme) null);
        }
        return null;
    }

    public final int f(Context context, String str) {
        int i10;
        C6496s.h(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "toLowerCase(...)");
        String D10 = p.D(lowerCase, "-", "_", false, 4, (Object) null);
        try {
            return Integer.parseInt(D10);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                Integer num = (Integer) this.f47787a.get(D10);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = b(context, D10);
                }
                return i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Uri g(Context context, String str) {
        C6496s.h(context, "context");
        int f10 = f(context, str);
        if (f10 > 0) {
            Uri build = new Uri.Builder().scheme("res").path(String.valueOf(f10)).build();
            C6496s.e(build);
            return build;
        }
        Uri uri = Uri.EMPTY;
        C6496s.e(uri);
        return uri;
    }
}

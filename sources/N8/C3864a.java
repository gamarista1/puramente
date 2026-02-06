package n8;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.C6496s;

/* renamed from: n8.a  reason: case insensitive filesystem */
public final class C3864a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3864a f46923a = new C3864a();

    private C3864a() {
    }

    public static final Object a(Context context, Class cls) {
        Context baseContext;
        C6496s.h(cls, "clazz");
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}

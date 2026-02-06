package Of;

import android.support.v4.media.session.c;
import kotlin.jvm.internal.C6496s;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    private static final G f64443a = new G("InvalidModuleNotifier");

    public static final void a(H h10) {
        C6496s.h(h10, "<this>");
        c.a(h10.C0(f64443a));
        throw new B("Accessing invalid module descriptor " + h10);
    }
}

package E5;

import com.facebook.I;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.W;
import t7.C4049a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30639a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30640b;

    /* renamed from: c  reason: collision with root package name */
    private static Set f30641c = new HashSet();

    private b() {
    }

    public static final void a() {
        Class<b> cls = b.class;
        if (!C4049a.d(cls)) {
            try {
                f30639a.c();
                Collection collection = f30641c;
                if (collection == null) {
                    return;
                }
                if (!collection.isEmpty()) {
                    f30640b = true;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final boolean b(String str) {
        Class<b> cls = b.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(str, "eventName");
            if (!f30640b) {
                return false;
            }
            return f30641c.contains(str);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final void c() {
        HashSet m10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null && (m10 = W.m(u10.c())) != null) {
                    f30641c = m10;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}

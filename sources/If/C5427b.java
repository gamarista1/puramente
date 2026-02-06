package If;

import kotlin.jvm.internal.C6496s;
import lf.v;
import lf.w;
import yf.C6798l;

/* renamed from: If.b  reason: case insensitive filesystem */
public abstract class C5427b {
    static {
        Object obj;
        try {
            v.a aVar = v.f71841b;
            obj = v.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (v.h(obj)) {
            Class cls = (Class) obj;
            obj = Boolean.TRUE;
        }
        Object b10 = v.b(obj);
        Boolean bool = Boolean.FALSE;
        if (v.g(b10)) {
            b10 = bool;
        }
        ((Boolean) b10).booleanValue();
    }

    public static final C5425a a(C6798l lVar) {
        C6496s.h(lVar, "compute");
        return new C5441i(lVar);
    }
}

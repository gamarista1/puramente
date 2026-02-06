package Zg;

import Rg.k;
import Ug.I0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f67007a;

    /* renamed from: b  reason: collision with root package name */
    public static final I0 f67008b;

    static {
        v vVar = new v();
        f67007a = vVar;
        H.f("kotlinx.coroutines.fast.service.loader", true);
        f67008b = vVar.a();
    }

    private v() {
    }

    private final I0 a() {
        Object obj;
        Class<u> cls = u.class;
        try {
            List G10 = k.G(k.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = G10.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c10 = ((u) obj).c();
                    do {
                        Object next = it.next();
                        int c11 = ((u) next).c();
                        if (c10 < c11) {
                            obj = next;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            u uVar = (u) obj;
            if (uVar != null) {
                I0 e10 = w.e(uVar, G10);
                if (e10 != null) {
                    return e10;
                }
            }
            w.b((Throwable) null, (String) null, 3, (Object) null);
            return null;
        } catch (Throwable th2) {
            w.b(th2, (String) null, 2, (Object) null);
            return null;
        }
    }
}

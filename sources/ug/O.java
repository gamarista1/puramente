package Ug;

import Zg.C5722k;
import lf.v;
import lf.w;
import qf.C6658d;

public abstract class O {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(C6658d dVar) {
        Object obj;
        if (dVar instanceof C5722k) {
            return dVar.toString();
        }
        try {
            v.a aVar = v.f71841b;
            obj = v.b(dVar + '@' + b(dVar));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        Throwable e10 = v.e(obj);
        String str = obj;
        if (e10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}

package Ug;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.v;
import lf.w;
import qf.C6658d;
import yf.C6798l;

public abstract class E {
    public static final Object a(Object obj, C6658d dVar) {
        if (!(obj instanceof B)) {
            return v.b(obj);
        }
        v.a aVar = v.f71841b;
        return v.b(w.a(((B) obj).f65278a));
    }

    public static final Object b(Object obj, C5582n nVar) {
        Throwable e10 = v.e(obj);
        if (e10 == null) {
            return obj;
        }
        return new B(e10, false, 2, (DefaultConstructorMarker) null);
    }

    public static final Object c(Object obj, C6798l lVar) {
        Throwable e10 = v.e(obj);
        if (e10 != null) {
            return new B(e10, false, 2, (DefaultConstructorMarker) null);
        }
        if (lVar != null) {
            return new C(obj, lVar);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, C6798l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}

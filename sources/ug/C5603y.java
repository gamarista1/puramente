package Ug;

import lf.v;

/* renamed from: Ug.y  reason: case insensitive filesystem */
public abstract class C5603y {
    public static final C5599w a(C5600w0 w0Var) {
        return new C5601x(w0Var);
    }

    public static /* synthetic */ C5599w b(C5600w0 w0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w0Var = null;
        }
        return a(w0Var);
    }

    public static final boolean c(C5599w wVar, Object obj) {
        Throwable e10 = v.e(obj);
        if (e10 == null) {
            return wVar.j0(obj);
        }
        return wVar.f(e10);
    }
}

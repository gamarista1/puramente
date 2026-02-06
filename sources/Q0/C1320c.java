package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.c  reason: case insensitive filesystem */
public abstract class C1320c {
    public static final A a(z zVar, y yVar) {
        return new A(zVar, yVar);
    }

    public static final y b(y yVar, y yVar2, float f10) {
        if (yVar.c() == yVar2.c()) {
            return yVar;
        }
        return new y(((C1325h) D.d(C1325h.d(yVar.b()), C1325h.d(yVar2.b()), f10)).j(), ((Boolean) D.d(Boolean.valueOf(yVar.c()), Boolean.valueOf(yVar2.c()), f10)).booleanValue(), (DefaultConstructorMarker) null);
    }

    public static final z c(z zVar, z zVar2, float f10) {
        return zVar;
    }
}

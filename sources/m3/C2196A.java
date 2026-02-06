package m3;

import kotlin.jvm.internal.C6496s;

/* renamed from: m3.A  reason: case insensitive filesystem */
public abstract class C2196A {
    public static final boolean a(C2213l lVar, C2213l lVar2, C2220t tVar) {
        C6496s.h(lVar, "<this>");
        C6496s.h(lVar2, "previous");
        C6496s.h(tVar, "loadType");
        if (lVar.a() > lVar2.a()) {
            return true;
        }
        if (lVar.a() < lVar2.a()) {
            return false;
        }
        return C2215n.a(lVar.b(), lVar2.b(), tVar);
    }
}

package m3;

import kotlin.jvm.internal.C6496s;
import m3.Z;

/* renamed from: m3.n  reason: case insensitive filesystem */
public abstract class C2215n {
    public static final boolean a(Z z10, Z z11, C2220t tVar) {
        C6496s.h(z10, "<this>");
        C6496s.h(tVar, "loadType");
        if (z11 == null) {
            return true;
        }
        if ((z11 instanceof Z.b) && (z10 instanceof Z.a)) {
            return true;
        }
        if ((!(z10 instanceof Z.b) || !(z11 instanceof Z.a)) && (z10.a() != z11.a() || z10.b() != z11.b() || z11.e(tVar) > z10.e(tVar))) {
            return true;
        }
        return false;
    }
}

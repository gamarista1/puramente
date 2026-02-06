package mh;

import hh.C5998a;
import ih.f;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6504C;
import lf.C6506E;
import lf.C6508G;
import lf.C6511J;
import lh.j;

public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f72180a = mf.Y.j(C5998a.G(C6506E.f71797b).getDescriptor(), C5998a.H(C6508G.f71802b).getDescriptor(), C5998a.F(C6504C.f71792b).getDescriptor(), C5998a.I(C6511J.f71808b).getDescriptor());

    public static final boolean a(f fVar) {
        C6496s.h(fVar, "<this>");
        if (!fVar.isInline() || !C6496s.c(fVar, j.p())) {
            return false;
        }
        return true;
    }

    public static final boolean b(f fVar) {
        C6496s.h(fVar, "<this>");
        if (!fVar.isInline() || !f72180a.contains(fVar)) {
            return false;
        }
        return true;
    }
}

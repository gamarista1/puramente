package gh;

import Ff.d;
import kh.C6452g0;
import kh.C6454h0;
import kh.q0;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

/* renamed from: gh.n  reason: case insensitive filesystem */
abstract /* synthetic */ class C5990n {
    public static final C5978b a(d dVar) {
        C6496s.h(dVar, "<this>");
        C5978b c10 = C5988l.c(dVar);
        if (c10 != null) {
            return c10;
        }
        C6454h0.e(dVar);
        throw new C6527k();
    }

    public static final C5978b b(d dVar) {
        C6496s.h(dVar, "<this>");
        C5978b b10 = C6452g0.b(dVar);
        if (b10 == null) {
            return q0.b(dVar);
        }
        return b10;
    }
}

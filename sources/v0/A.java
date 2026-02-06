package V0;

import android.graphics.Typeface;
import kotlin.jvm.internal.C6496s;

final class A implements x {
    private final Typeface c(String str, p pVar, int i10) {
        if (n.f(i10, n.f8200b.b()) && C6496s.c(pVar, p.f8210b.c()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int c10 = C1423d.c(pVar, i10);
        if (str == null || str.length() == 0) {
            return Typeface.defaultFromStyle(c10);
        }
        return Typeface.create(str, c10);
    }

    private final Typeface d(String str, p pVar, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface c10 = c(str, pVar, i10);
        if (C6496s.c(c10, Typeface.create(Typeface.DEFAULT, C1423d.c(pVar, i10))) || C6496s.c(c10, c((String) null, pVar, i10))) {
            return null;
        }
        return c10;
    }

    public Typeface a(p pVar, int i10) {
        return c((String) null, pVar, i10);
    }

    public Typeface b(t tVar, p pVar, int i10) {
        Typeface d10 = d(B.b(tVar.d(), pVar), pVar, i10);
        if (d10 == null) {
            return c(tVar.d(), pVar, i10);
        }
        return d10;
    }
}

package V0;

import V0.n;
import android.graphics.Typeface;
import kotlin.jvm.internal.C6496s;

final class z implements x {
    private final Typeface c(String str, p pVar, int i10) {
        Typeface typeface;
        n.a aVar = n.f8200b;
        if (n.f(i10, aVar.b()) && C6496s.c(pVar, p.f8210b.c()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        return Typeface.create(typeface, pVar.m(), n.f(i10, aVar.a()));
    }

    public Typeface a(p pVar, int i10) {
        return c((String) null, pVar, i10);
    }

    public Typeface b(t tVar, p pVar, int i10) {
        return c(tVar.d(), pVar, i10);
    }
}

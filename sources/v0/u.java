package V0;

import V0.F;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final x f8235a = B.a();

    public F a(D d10, v vVar, C6798l lVar, C6798l lVar2) {
        boolean z10;
        Typeface typeface;
        h c10 = d10.c();
        if (c10 == null) {
            z10 = true;
        } else {
            z10 = c10 instanceof C1425f;
        }
        if (z10) {
            typeface = this.f8235a.a(d10.e(), d10.d());
        } else if (!(c10 instanceof t)) {
            return null;
        } else {
            typeface = this.f8235a.b((t) d10.c(), d10.e(), d10.d());
        }
        return new F.a(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}

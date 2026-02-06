package ag;

import Of.C5487e;
import eg.C5830g;
import kotlin.jvm.internal.C6496s;
import wg.C6767c;

public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public C6767c f67088a;

    public C5487e a(C5830g gVar) {
        C6496s.h(gVar, "javaClass");
        return b().b(gVar);
    }

    public final C6767c b() {
        C6767c cVar = this.f67088a;
        if (cVar != null) {
            return cVar;
        }
        C6496s.v("resolver");
        return null;
    }

    public final void c(C6767c cVar) {
        C6496s.h(cVar, "<set-?>");
        this.f67088a = cVar;
    }
}

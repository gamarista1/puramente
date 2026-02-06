package fg;

import Pf.h;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;

/* renamed from: fg.f  reason: case insensitive filesystem */
final class C5906f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final c f67634a;

    public C5906f(c cVar) {
        C6496s.h(cVar, "fqNameToMatch");
        this.f67634a = cVar;
    }

    /* renamed from: a */
    public C5904e i(c cVar) {
        C6496s.h(cVar, "fqName");
        if (C6496s.c(cVar, this.f67634a)) {
            return C5904e.f67632a;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return C6565s.n().iterator();
    }

    public boolean n0(c cVar) {
        return h.b.b(this, cVar);
    }
}

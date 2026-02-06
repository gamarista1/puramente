package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.e;
import qf.g;

public abstract class d extends a {
    private final g _context;
    private transient C6658d<Object> intercepted;

    public d(C6658d dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        C6496s.e(gVar);
        return gVar;
    }

    public final C6658d<Object> intercepted() {
        C6658d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().b(e.f72642c0);
            if (eVar == null || (dVar = eVar.V(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C6658d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b b10 = getContext().b(e.f72642c0);
            C6496s.e(b10);
            ((e) b10).Q(dVar);
        }
        this.intercepted = c.f71744a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(C6658d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}

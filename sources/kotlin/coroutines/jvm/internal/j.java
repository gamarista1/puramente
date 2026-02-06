package kotlin.coroutines.jvm.internal;

import qf.C6658d;
import qf.g;
import qf.h;

public abstract class j extends a {
    public j(C6658d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != h.f72645a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public g getContext() {
        return h.f72645a;
    }
}

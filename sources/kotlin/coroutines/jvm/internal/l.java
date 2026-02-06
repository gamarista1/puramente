package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C6492n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import qf.C6658d;

public abstract class l extends d implements C6492n {
    private final int arity;

    public l(int i10, C6658d dVar) {
        super(dVar);
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String k10 = O.k(this);
        C6496s.g(k10, "renderLambdaToString(...)");
        return k10;
    }
}

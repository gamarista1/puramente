package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C6492n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import qf.C6658d;

public abstract class k extends j implements C6492n {

    /* renamed from: a  reason: collision with root package name */
    private final int f71751a;

    public k(int i10, C6658d dVar) {
        super(dVar);
        this.f71751a = i10;
    }

    public int getArity() {
        return this.f71751a;
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

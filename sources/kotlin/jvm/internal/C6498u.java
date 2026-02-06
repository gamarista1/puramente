package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.u  reason: case insensitive filesystem */
public abstract class C6498u implements C6492n, Serializable {
    private final int arity;

    public C6498u(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String l10 = O.l(this);
        C6496s.g(l10, "renderLambdaToString(...)");
        return l10;
    }
}

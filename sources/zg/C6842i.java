package zg;

import Fg.S;

/* renamed from: zg.i  reason: case insensitive filesystem */
public class C6842i extends C6834a {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6842i(S s10) {
        this(s10, (C6840g) null);
        if (s10 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C6842i(S s10, C6840g gVar) {
        super(s10, gVar);
        if (s10 == null) {
            b(1);
        }
    }
}

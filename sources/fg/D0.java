package Fg;

import Gg.g;

public class D0 extends C0 {

    /* renamed from: a  reason: collision with root package name */
    private final N0 f62921a;

    /* renamed from: b  reason: collision with root package name */
    private final S f62922b;

    public D0(N0 n02, S s10) {
        if (n02 == null) {
            c(0);
        }
        if (s10 == null) {
            c(1);
        }
        this.f62921a = n02;
        this.f62922b = s10;
    }

    private static /* synthetic */ void c(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 4 || i10 == 5) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 4 || i10 == 5) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (!(i10 == 4 || i10 == 5)) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public boolean a() {
        return false;
    }

    public N0 b() {
        N0 n02 = this.f62921a;
        if (n02 == null) {
            c(4);
        }
        return n02;
    }

    public S getType() {
        S s10 = this.f62922b;
        if (s10 == null) {
            c(5);
        }
        return s10;
    }

    public B0 n(g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new D0(this.f62921a, gVar.h(this.f62922b));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public D0(S s10) {
        this(N0.INVARIANT, s10);
        if (s10 == null) {
            c(2);
        }
    }
}

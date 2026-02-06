package Rf;

import Eg.n;
import Fg.N0;
import Of.C5495m;
import Of.h0;
import Of.k0;
import Pf.h;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import ng.f;

/* renamed from: Rf.b  reason: case insensitive filesystem */
public abstract class C5513b extends C5519h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5513b(n nVar, C5495m mVar, h hVar, f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(nVar, mVar, hVar, fVar, n02, z10, i10, h0Var, k0Var);
        if (nVar == null) {
            i0(0);
        }
        if (mVar == null) {
            i0(1);
        }
        if (hVar == null) {
            i0(2);
        }
        if (fVar == null) {
            i0(3);
        }
        if (n02 == null) {
            i0(4);
        }
        if (h0Var == null) {
            i0(5);
        }
        if (k0Var == null) {
            i0(6);
        }
    }

    private static /* synthetic */ void i0(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        String str;
        String str2 = "";
        if (x()) {
            str = "reified ";
        } else {
            str = str2;
        }
        if (n() != N0.INVARIANT) {
            str2 = n() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        return String.format("%s%s%s", new Object[]{str, str2, getName()});
    }
}

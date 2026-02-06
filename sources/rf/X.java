package Rf;

import Fg.S;
import Of.C5495m;
import Of.c0;
import Of.h0;
import Of.u0;
import Pf.h;
import java.util.Collections;
import java.util.List;
import ng.f;

public abstract class X extends C5525n implements u0 {

    /* renamed from: e  reason: collision with root package name */
    protected S f64824e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X(C5495m mVar, h hVar, f fVar, S s10, h0 h0Var) {
        super(mVar, hVar, fVar, h0Var);
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (fVar == null) {
            i0(2);
        }
        if (h0Var == null) {
            i0(3);
        }
        this.f64824e = s10;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public void H0(S s10) {
        this.f64824e = s10;
    }

    public c0 M() {
        return null;
    }

    public c0 P() {
        return null;
    }

    public S getReturnType() {
        S type = getType();
        if (type == null) {
            i0(10);
        }
        return type;
    }

    public S getType() {
        S s10 = this.f64824e;
        if (s10 == null) {
            i0(4);
        }
        return s10;
    }

    public List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(8);
        }
        return emptyList;
    }

    public boolean h0() {
        return false;
    }

    public List k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(6);
        }
        return emptyList;
    }
}

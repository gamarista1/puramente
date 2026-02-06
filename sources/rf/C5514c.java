package Rf;

import Fg.G0;
import Fg.N0;
import Fg.S;
import Of.C5487e;
import Of.C5497o;
import Of.C5501t;
import Of.C5502u;
import Of.W;
import Of.c0;
import Of.h0;
import Pf.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ng.f;
import zg.C6842i;

/* renamed from: Rf.c  reason: case insensitive filesystem */
public abstract class C5514c extends C5524m implements c0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5514c(h hVar) {
        super(hVar, ng.h.f72311i);
        if (hVar == null) {
            i0(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public c0 M() {
        return null;
    }

    public c0 P() {
        return null;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.d(this, obj);
    }

    public Collection e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            i0(8);
        }
        return emptySet;
    }

    public S getReturnType() {
        return getType();
    }

    public S getType() {
        S type = getValue().getType();
        if (type == null) {
            i0(6);
        }
        return type;
    }

    public List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(5);
        }
        return emptyList;
    }

    public C5502u getVisibility() {
        C5502u uVar = C5501t.f64510f;
        if (uVar == null) {
            i0(9);
        }
        return uVar;
    }

    public boolean h0() {
        return false;
    }

    public h0 i() {
        h0 h0Var = h0.f64497a;
        if (h0Var == null) {
            i0(11);
        }
        return h0Var;
    }

    public List k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(7);
        }
        return emptyList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5514c(h hVar, f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            i0(1);
        }
        if (fVar == null) {
            i0(2);
        }
    }

    public c0 c(G0 g02) {
        S s10;
        if (g02 == null) {
            i0(3);
        }
        if (g02.k()) {
            return this;
        }
        if (b() instanceof C5487e) {
            s10 = g02.p(getType(), N0.OUT_VARIANCE);
        } else {
            s10 = g02.p(getType(), N0.INVARIANT);
        }
        if (s10 == null) {
            return null;
        }
        if (s10 == getType()) {
            return this;
        }
        return new N(b(), new C6842i(s10), getAnnotations());
    }

    /* renamed from: F0 */
    public W a() {
        return this;
    }
}

package Fg;

import Kg.d;
import Of.C5490h;
import Of.C5495m;
import Of.h0;
import Of.m0;
import Rf.U;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class C {
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i10 != 4) {
            th2 = new IllegalArgumentException(format);
        } else {
            th2 = new IllegalStateException(format);
        }
        throw th2;
    }

    public static G0 b(List list, E0 e02, C5495m mVar, List list2) {
        if (list == null) {
            a(0);
        }
        if (e02 == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        G0 c10 = c(list, e02, mVar, list2, (boolean[]) null);
        if (c10 != null) {
            return c10;
        }
        throw new AssertionError("Substitution failed");
    }

    public static G0 c(List list, E0 e02, C5495m mVar, List list2, boolean[] zArr) {
        G0 g02;
        E0 e03 = e02;
        List list3 = list2;
        if (list == null) {
            a(5);
        }
        if (e03 == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list3 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            U P02 = U.P0(mVar, m0Var.getAnnotations(), m0Var.x(), m0Var.n(), m0Var.getName(), i10, h0.f64497a, m0Var.N());
            hashMap.put(m0Var.l(), new D0(P02.p()));
            hashMap2.put(m0Var, P02);
            list3.add(P02);
            i10++;
        }
        w0 j10 = w0.j(hashMap);
        G0 h10 = G0.h(e03, j10);
        G0 h11 = G0.h(e02.h(), j10);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            m0 m0Var2 = (m0) it2.next();
            U u10 = (U) hashMap2.get(m0Var2);
            for (S s10 : m0Var2.getUpperBounds()) {
                C5490h o10 = s10.N0().o();
                if (!(o10 instanceof m0) || !d.p((m0) o10)) {
                    g02 = h11;
                } else {
                    g02 = h10;
                }
                S p10 = g02.p(s10, N0.OUT_VARIANCE);
                if (p10 == null) {
                    return null;
                }
                if (!(p10 == s10 || zArr == null)) {
                    zArr[0] = true;
                }
                u10.M0(p10);
            }
            u10.V0();
        }
        return h10;
    }
}

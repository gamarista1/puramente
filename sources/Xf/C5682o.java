package Xf;

import Lf.d;
import Lf.e;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.C5504w;
import Of.Z;
import rg.C6691i;

/* renamed from: Xf.o  reason: case insensitive filesystem */
public abstract class C5682o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(C5484b bVar) {
        C5504w w02;
        if (bVar == null) {
            a(3);
        }
        if (!(bVar instanceof Z) || (w02 = ((Z) bVar).w0()) == null || !w02.getAnnotations().n0(H.f66258b)) {
            return bVar.getAnnotations().n0(H.f66258b);
        }
        return true;
    }

    public static boolean c(C5495m mVar) {
        if (mVar == null) {
            a(1);
        }
        if (!C6691i.x(mVar) || !C6691i.w(mVar.b()) || d((C5487e) mVar)) {
            return false;
        }
        return true;
    }

    public static boolean d(C5487e eVar) {
        if (eVar == null) {
            a(2);
        }
        return e.a(d.f63868a, eVar);
    }

    public static boolean e(Z z10) {
        if (z10 == null) {
            a(0);
        }
        if (z10.h() == C5484b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(z10.b())) {
            return true;
        }
        if (!C6691i.x(z10.b()) || !b(z10)) {
            return false;
        }
        return true;
    }
}

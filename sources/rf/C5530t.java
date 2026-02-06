package Rf;

import Of.C5487e;
import Of.C5495m;
import Pf.h;
import zg.C6838e;
import zg.C6840g;

/* renamed from: Rf.t  reason: case insensitive filesystem */
public class C5530t extends C5514c {

    /* renamed from: c  reason: collision with root package name */
    private final C5487e f64945c;

    /* renamed from: d  reason: collision with root package name */
    private final C6838e f64946d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5530t(C5487e eVar) {
        super(h.f64602L.b());
        if (eVar == null) {
            i0(0);
        }
        this.f64945c = eVar;
        this.f64946d = new C6838e(eVar, (C6838e) null);
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 1 || i10 == 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 1 || i10 == 2) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public C5495m b() {
        C5487e eVar = this.f64945c;
        if (eVar == null) {
            i0(2);
        }
        return eVar;
    }

    public C6840g getValue() {
        C6838e eVar = this.f64946d;
        if (eVar == null) {
            i0(1);
        }
        return eVar;
    }

    public String toString() {
        return "class " + this.f64945c.getName() + "::this";
    }
}

package Rf;

import Of.C5495m;
import Pf.h;
import ng.f;
import zg.C6840g;

public class N extends C5514c {

    /* renamed from: c  reason: collision with root package name */
    private final C5495m f64800c;

    /* renamed from: d  reason: collision with root package name */
    private C6840g f64801d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N(C5495m mVar, C6840g gVar, h hVar) {
        this(mVar, gVar, hVar, ng.h.f72311i);
        if (mVar == null) {
            i0(0);
        }
        if (gVar == null) {
            i0(1);
        }
        if (hVar == null) {
            i0(2);
        }
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 7 || i10 == 8) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 7 || i10 == 8) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 7 || i10 == 8) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public C5495m b() {
        C5495m mVar = this.f64800c;
        if (mVar == null) {
            i0(8);
        }
        return mVar;
    }

    public C6840g getValue() {
        C6840g gVar = this.f64801d;
        if (gVar == null) {
            i0(7);
        }
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N(C5495m mVar, C6840g gVar, h hVar, f fVar) {
        super(hVar, fVar);
        if (mVar == null) {
            i0(3);
        }
        if (gVar == null) {
            i0(4);
        }
        if (hVar == null) {
            i0(5);
        }
        if (fVar == null) {
            i0(6);
        }
        this.f64800c = mVar;
        this.f64801d = gVar;
    }
}

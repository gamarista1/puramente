package Rf;

import Of.C5495m;
import Of.C5496n;
import Of.C5498p;
import Of.h0;
import Pf.h;
import ng.f;

/* renamed from: Rf.n  reason: case insensitive filesystem */
public abstract class C5525n extends C5524m implements C5496n {

    /* renamed from: c  reason: collision with root package name */
    private final C5495m f64873c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f64874d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5525n(C5495m mVar, h hVar, f fVar, h0 h0Var) {
        super(hVar, fVar);
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
        this.f64873c = mVar;
        this.f64874d = h0Var;
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            i11 = 2;
        } else {
            i11 = 3;
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 4 || i10 == 5 || i10 == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* renamed from: F0 */
    public C5498p a() {
        C5498p pVar = (C5498p) super.a();
        if (pVar == null) {
            i0(4);
        }
        return pVar;
    }

    public C5495m b() {
        C5495m mVar = this.f64873c;
        if (mVar == null) {
            i0(5);
        }
        return mVar;
    }

    public h0 i() {
        h0 h0Var = this.f64874d;
        if (h0Var == null) {
            i0(6);
        }
        return h0Var;
    }
}

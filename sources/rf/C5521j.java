package Rf;

import Eg.n;
import Of.C5495m;
import Of.h0;
import ng.f;

/* renamed from: Rf.j  reason: case insensitive filesystem */
public abstract class C5521j extends C5512a {

    /* renamed from: f  reason: collision with root package name */
    private final C5495m f64861f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f64862g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f64863h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5521j(n nVar, C5495m mVar, f fVar, h0 h0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            F0(0);
        }
        if (mVar == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (h0Var == null) {
            F0(3);
        }
        this.f64861f = mVar;
        this.f64862g = h0Var;
        this.f64863h = z10;
    }

    private static /* synthetic */ void F0(int i10) {
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
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 4 || i10 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public C5495m b() {
        C5495m mVar = this.f64861f;
        if (mVar == null) {
            F0(4);
        }
        return mVar;
    }

    public h0 i() {
        h0 h0Var = this.f64862g;
        if (h0Var == null) {
            F0(5);
        }
        return h0Var;
    }

    public boolean isExternal() {
        return this.f64863h;
    }
}

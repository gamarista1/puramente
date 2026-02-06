package Rf;

import Eg.j;
import Fg.S;
import Of.C5495m;
import Of.h0;
import Pf.h;
import ng.f;
import tg.g;
import yf.C6787a;

public abstract class Y extends X {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f64825f;

    /* renamed from: g  reason: collision with root package name */
    protected j f64826g;

    /* renamed from: h  reason: collision with root package name */
    protected C6787a f64827h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y(C5495m mVar, h hVar, f fVar, S s10, boolean z10, h0 h0Var) {
        super(mVar, hVar, fVar, s10, h0Var);
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
        this.f64825f = z10;
    }

    private static /* synthetic */ void i0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(j jVar, C6787a aVar) {
        if (aVar == null) {
            i0(5);
        }
        this.f64827h = aVar;
        if (jVar == null) {
            jVar = (j) aVar.invoke();
        }
        this.f64826g = jVar;
    }

    public void L0(C6787a aVar) {
        if (aVar == null) {
            i0(4);
        }
        K0((j) null, aVar);
    }

    public boolean O() {
        return this.f64825f;
    }

    public g q0() {
        j jVar = this.f64826g;
        if (jVar != null) {
            return (g) jVar.invoke();
        }
        return null;
    }
}

package If;

import Of.C5507z;
import Of.Z;
import Rf.C5526o;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

/* renamed from: If.j  reason: case insensitive filesystem */
public class C5443j extends C5526o {

    /* renamed from: a  reason: collision with root package name */
    private final C5432d0 f63694a;

    public C5443j(C5432d0 d0Var) {
        C6496s.h(d0Var, "container");
        this.f63694a = d0Var;
    }

    /* renamed from: p */
    public A f(C5507z zVar, C6514M m10) {
        C6496s.h(zVar, "descriptor");
        C6496s.h(m10, "data");
        return new C5442i0(this.f63694a, zVar);
    }

    /* renamed from: q */
    public A l(Z z10, C6514M m10) {
        int i10;
        C6496s.h(z10, "descriptor");
        C6496s.h(m10, "data");
        int i11 = 0;
        if (z10.M() != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z10.P() != null) {
            i11 = 1;
        }
        int i12 = i10 + i11;
        if (z10.O()) {
            if (i12 == 0) {
                return new C5446k0(this.f63694a, z10);
            }
            if (i12 == 1) {
                return new C5450m0(this.f63694a, z10);
            }
            if (i12 == 2) {
                return new C5454o0(this.f63694a, z10);
            }
        } else if (i12 == 0) {
            return new B0(this.f63694a, z10);
        } else {
            if (i12 == 1) {
                return new E0(this.f63694a, z10);
            }
            if (i12 == 2) {
                return new H0(this.f63694a, z10);
            }
        }
        throw new Y0("Unsupported property: " + z10);
    }
}

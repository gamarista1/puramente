package If;

import Ff.d;
import Ff.e;
import Ff.f;
import Ff.g;
import Ff.i;
import Ff.j;
import Ff.m;
import Ff.n;
import Ff.o;
import Ff.p;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.C6484f;
import kotlin.jvm.internal.C6486h;
import kotlin.jvm.internal.C6492n;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.C6500w;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.y;

public class b1 extends P {
    private static C5432d0 l(C6484f fVar) {
        f owner = fVar.getOwner();
        if (owner instanceof C5432d0) {
            return (C5432d0) owner;
        }
        return C5445k.f63698d;
    }

    public g a(C6493o oVar) {
        return new C5442i0(l(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    public d b(Class cls) {
        return C5439h.m(cls);
    }

    public f c(Class cls, String str) {
        return C5439h.n(cls);
    }

    public i d(C6500w wVar) {
        return new C5446k0(l(wVar), wVar.getName(), wVar.getSignature(), wVar.getBoundReceiver());
    }

    public j e(y yVar) {
        return new C5450m0(l(yVar), yVar.getName(), yVar.getSignature(), yVar.getBoundReceiver());
    }

    public m f(C c10) {
        return new B0(l(c10), c10.getName(), c10.getSignature(), c10.getBoundReceiver());
    }

    public n g(E e10) {
        return new E0(l(e10), e10.getName(), e10.getSignature(), e10.getBoundReceiver());
    }

    public o h(G g10) {
        return new H0(l(g10), g10.getName(), g10.getSignature());
    }

    public String i(C6492n nVar) {
        C5442i0 c10;
        g a10 = Hf.d.a(nVar);
        if (a10 == null || (c10 = j1.c(a10)) == null) {
            return super.i(nVar);
        }
        return e1.f63668a.h(c10.V());
    }

    public String j(C6498u uVar) {
        return i(uVar);
    }

    public p k(e eVar, List list, boolean z10) {
        if (eVar instanceof C6486h) {
            return C5439h.k(((C6486h) eVar).f(), list, z10);
        }
        return Gf.f.b(eVar, list, z10, Collections.emptyList());
    }
}

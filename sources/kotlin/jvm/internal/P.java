package kotlin.jvm.internal;

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
import java.util.List;

public class P {
    public d b(Class cls) {
        return new C6487i(cls);
    }

    public f c(Class cls, String str) {
        return new B(cls, str);
    }

    public String i(C6492n nVar) {
        String obj = nVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String j(C6498u uVar) {
        return i(uVar);
    }

    public p k(e eVar, List list, boolean z10) {
        return new X(eVar, list, z10);
    }

    public g a(C6493o oVar) {
        return oVar;
    }

    public i d(C6500w wVar) {
        return wVar;
    }

    public j e(y yVar) {
        return yVar;
    }

    public m f(C c10) {
        return c10;
    }

    public n g(E e10) {
        return e10;
    }

    public o h(G g10) {
        return g10;
    }
}

package Mg;

import Fg.S;
import Kg.d;
import Lf.n;
import Mg.f;
import Of.C5507z;
import Of.t0;
import kotlin.jvm.internal.C6496s;
import vg.C6755e;

final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final j f64158a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final String f64159b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    public boolean a(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        t0 t0Var = (t0) zVar.k().get(1);
        n.b bVar = n.f63907k;
        C6496s.e(t0Var);
        S a10 = bVar.a(C6755e.s(t0Var));
        if (a10 == null) {
            return false;
        }
        S type = t0Var.getType();
        C6496s.g(type, "getType(...)");
        return d.w(a10, d.A(type));
    }

    public String b(C5507z zVar) {
        return f.a.a(this, zVar);
    }

    public String getDescription() {
        return f64159b;
    }
}

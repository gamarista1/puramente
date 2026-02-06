package S;

import Q.b;
import c1.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.C2544x0;
import r0.h2;
import r0.i2;
import r0.j2;
import x0.C2891d;
import x0.C2893f;
import x0.o;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static C2891d f5819a;

    public static final C2891d a(b.a aVar) {
        C2891d dVar = f5819a;
        if (dVar != null) {
            C6496s.e(dVar);
            return dVar;
        }
        C2891d.a aVar2 = r1;
        C2891d.a aVar3 = new C2891d.a("Filled.Check", h.j(24.0f), h.j(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a10 = o.a();
        h2 h2Var = r0;
        h2 h2Var2 = new h2(C2544x0.f25560b.a(), (DefaultConstructorMarker) null);
        int a11 = i2.f25529a.a();
        int a12 = j2.f25533a.a();
        C2893f fVar = new C2893f();
        fVar.i(9.0f, 16.17f);
        fVar.g(4.83f, 12.0f);
        fVar.h(-1.42f, 1.41f);
        fVar.g(9.0f, 19.0f);
        fVar.g(21.0f, 7.0f);
        fVar.h(-1.41f, -1.41f);
        fVar.a();
        C2891d f10 = C2891d.a.d(aVar2, fVar.d(), a10, "", h2Var, 1.0f, (C2514n0) null, 1.0f, 1.0f, a11, a12, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f5819a = f10;
        C6496s.e(f10);
        return f10;
    }
}

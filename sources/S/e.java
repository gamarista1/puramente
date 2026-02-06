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

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static C2891d f5821a;

    public static final C2891d a(b.a aVar) {
        C2891d dVar = f5821a;
        if (dVar != null) {
            C6496s.e(dVar);
            return dVar;
        }
        C2891d.a aVar2 = r1;
        C2891d.a aVar3 = new C2891d.a("Filled.Search", h.j(24.0f), h.j(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a10 = o.a();
        h2 h2Var = r0;
        h2 h2Var2 = new h2(C2544x0.f25560b.a(), (DefaultConstructorMarker) null);
        int a11 = i2.f25529a.a();
        int a12 = j2.f25533a.a();
        C2893f fVar = new C2893f();
        fVar.i(15.5f, 14.0f);
        fVar.f(-0.79f);
        fVar.h(-0.28f, -0.27f);
        C2893f fVar2 = fVar;
        fVar2.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        fVar2.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        fVar.j(3.0f, 5.91f, 3.0f, 9.5f);
        fVar.j(5.91f, 16.0f, 9.5f, 16.0f);
        fVar.c(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        fVar.h(0.27f, 0.28f);
        fVar.m(0.79f);
        fVar.h(5.0f, 4.99f);
        fVar.g(20.49f, 19.0f);
        fVar.h(-4.99f, -5.0f);
        fVar.a();
        fVar.i(9.5f, 14.0f);
        fVar.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        fVar.j(7.01f, 5.0f, 9.5f, 5.0f);
        fVar.j(14.0f, 7.01f, 14.0f, 9.5f);
        fVar.j(11.99f, 14.0f, 9.5f, 14.0f);
        fVar.a();
        C2891d f10 = C2891d.a.d(aVar2, fVar.d(), a10, "", h2Var, 1.0f, (C2514n0) null, 1.0f, 1.0f, a11, a12, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f5821a = f10;
        C6496s.e(f10);
        return f10;
    }
}

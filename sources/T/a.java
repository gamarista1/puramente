package T;

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

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static C2891d f5908a;

    public static final C2891d a(b.C0130b bVar) {
        C2891d dVar = f5908a;
        if (dVar != null) {
            C6496s.e(dVar);
            return dVar;
        }
        C2891d.a aVar = r1;
        C2891d.a aVar2 = new C2891d.a("Outlined.Edit", h.j(24.0f), h.j(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a10 = o.a();
        h2 h2Var = r0;
        h2 h2Var2 = new h2(C2544x0.f25560b.a(), (DefaultConstructorMarker) null);
        int a11 = i2.f25529a.a();
        int a12 = j2.f25533a.a();
        C2893f fVar = new C2893f();
        fVar.i(14.06f, 9.02f);
        fVar.h(0.92f, 0.92f);
        fVar.g(5.92f, 19.0f);
        fVar.g(5.0f, 19.0f);
        fVar.m(-0.92f);
        fVar.h(9.06f, -9.06f);
        fVar.i(17.66f, 3.0f);
        fVar.c(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        fVar.h(-1.83f, 1.83f);
        fVar.h(3.75f, 3.75f);
        fVar.h(1.83f, -1.83f);
        fVar.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        fVar.h(-2.34f, -2.34f);
        fVar.c(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        fVar.a();
        fVar.i(14.06f, 6.19f);
        fVar.g(3.0f, 17.25f);
        fVar.g(3.0f, 21.0f);
        fVar.f(3.75f);
        fVar.g(17.81f, 9.94f);
        fVar.h(-3.75f, -3.75f);
        fVar.a();
        C2891d f10 = C2891d.a.d(aVar, fVar.d(), a10, "", h2Var, 1.0f, (C2514n0) null, 1.0f, 1.0f, a11, a12, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f5908a = f10;
        C6496s.e(f10);
        return f10;
    }
}

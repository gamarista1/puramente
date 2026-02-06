package io.intercom.android.sdk.survey.ui.components.icons;

import Q.b;
import c1.h;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lx0/d;", "_launch", "Lx0/d;", "LQ/b$a;", "getLaunch", "(LQ/b$a;)Lx0/d;", "Launch", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LaunchKt {
    private static C2891d _launch;

    public static final C2891d getLaunch(b.a aVar) {
        C6496s.h(aVar, "<this>");
        C2891d dVar = _launch;
        if (dVar != null) {
            C6496s.e(dVar);
            return dVar;
        }
        C2891d.a aVar2 = r1;
        C2891d.a aVar3 = new C2891d.a("Filled.Launch", h.j(24.0f), h.j(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a10 = o.a();
        h2 h2Var = r0;
        h2 h2Var2 = new h2(C2544x0.f25560b.a(), (DefaultConstructorMarker) null);
        int a11 = i2.f25529a.a();
        int a12 = j2.f25533a.a();
        C2893f fVar = new C2893f();
        fVar.i(19.0f, 19.0f);
        fVar.e(5.0f);
        fVar.l(5.0f);
        fVar.f(7.0f);
        fVar.l(3.0f);
        fVar.e(5.0f);
        C2893f fVar2 = fVar;
        fVar2.c(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar.m(14.0f);
        fVar2.c(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        fVar.f(14.0f);
        fVar2.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar.m(-7.0f);
        fVar.f(-2.0f);
        fVar.m(7.0f);
        fVar.a();
        fVar.i(14.0f, 3.0f);
        fVar.m(2.0f);
        fVar.f(3.59f);
        fVar.h(-9.83f, 9.83f);
        fVar.h(1.41f, 1.41f);
        fVar.g(19.0f, 6.41f);
        fVar.l(10.0f);
        fVar.f(2.0f);
        fVar.l(3.0f);
        fVar.f(-7.0f);
        fVar.a();
        C2891d f10 = C2891d.a.d(aVar2, fVar.d(), a10, "", h2Var, 1.0f, (C2514n0) null, 1.0f, 1.0f, a11, a12, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        _launch = f10;
        C6496s.e(f10);
        return f10;
    }
}

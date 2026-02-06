package yg;

import Of.C5490h;
import Wf.b;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import ng.f;
import yf.C6798l;

/* renamed from: yg.a  reason: case insensitive filesystem */
public abstract class C6802a implements C6812k {
    public Set a() {
        return i().a();
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return i().b(fVar, bVar);
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return i().c(fVar, bVar);
    }

    public Set d() {
        return i().d();
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return i().e(fVar, bVar);
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return i().f(dVar, lVar);
    }

    public Set g() {
        return i().g();
    }

    public final C6812k h() {
        if (!(i() instanceof C6802a)) {
            return i();
        }
        C6812k i10 = i();
        C6496s.f(i10, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C6802a) i10).h();
    }

    /* access modifiers changed from: protected */
    public abstract C6812k i();
}

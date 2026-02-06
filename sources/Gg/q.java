package Gg;

import Fg.C5371g;
import Fg.M0;
import Fg.S;
import Fg.u0;
import Gg.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rg.C6697o;

public final class q implements p {

    /* renamed from: c  reason: collision with root package name */
    private final g f63201c;

    /* renamed from: d  reason: collision with root package name */
    private final f f63202d;

    /* renamed from: e  reason: collision with root package name */
    private final C6697o f63203e;

    public q(g gVar, f fVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        C6496s.h(fVar, "kotlinTypePreparator");
        this.f63201c = gVar;
        this.f63202d = fVar;
        C6697o m10 = C6697o.m(d());
        C6496s.g(m10, "createWithTypeRefiner(...)");
        this.f63203e = m10;
    }

    public C6697o a() {
        return this.f63203e;
    }

    public boolean b(S s10, S s11) {
        C6496s.h(s10, "a");
        C6496s.h(s11, "b");
        return e(C5399a.b(false, false, (b) null, f(), d(), 6, (Object) null), s10.Q0(), s11.Q0());
    }

    public boolean c(S s10, S s11) {
        C6496s.h(s10, "subtype");
        C6496s.h(s11, "supertype");
        return g(C5399a.b(true, false, (b) null, f(), d(), 6, (Object) null), s10.Q0(), s11.Q0());
    }

    public g d() {
        return this.f63201c;
    }

    public final boolean e(u0 u0Var, M0 m02, M0 m03) {
        C6496s.h(u0Var, "<this>");
        C6496s.h(m02, "a");
        C6496s.h(m03, "b");
        return C5371g.f63009a.m(u0Var, m02, m03);
    }

    public f f() {
        return this.f63202d;
    }

    public final boolean g(u0 u0Var, M0 m02, M0 m03) {
        C6496s.h(u0Var, "<this>");
        C6496s.h(m02, "subType");
        C6496s.h(m03, "superType");
        return C5371g.v(C5371g.f63009a, u0Var, m02, m03, false, 8, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f63179a : fVar);
    }
}

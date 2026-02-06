package kh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.S;
import lf.C6511J;

public final class N0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final N0 f71617a = new N0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71618b = F.a("kotlin.UShort", C5998a.D(S.f71762a));

    private N0() {
    }

    public short a(e eVar) {
        C6496s.h(eVar, "decoder");
        return C6511J.b(eVar.l(getDescriptor()).t());
    }

    public void b(jh.f fVar, short s10) {
        C6496s.h(fVar, "encoder");
        fVar.j(getDescriptor()).s(s10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return C6511J.a(a(eVar));
    }

    public f getDescriptor() {
        return f71618b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((C6511J) obj).i());
    }
}

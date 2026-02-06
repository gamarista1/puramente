package kh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6499v;
import lf.C6508G;

public final class K0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final K0 f71611a = new K0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71612b = F.a("kotlin.ULong", C5998a.C(C6499v.f71791a));

    private K0() {
    }

    public long a(e eVar) {
        C6496s.h(eVar, "decoder");
        return C6508G.b(eVar.l(getDescriptor()).m());
    }

    public void b(jh.f fVar, long j10) {
        C6496s.h(fVar, "encoder");
        fVar.j(getDescriptor()).n(j10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return C6508G.a(a(eVar));
    }

    public f getDescriptor() {
        return f71612b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((C6508G) obj).j());
    }
}

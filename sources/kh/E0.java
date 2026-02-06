package kh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6483e;
import kotlin.jvm.internal.C6496s;
import lf.C6504C;

public final class E0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final E0 f71593a = new E0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71594b = F.a("kotlin.UByte", C5998a.x(C6483e.f71777a));

    private E0() {
    }

    public byte a(e eVar) {
        C6496s.h(eVar, "decoder");
        return C6504C.b(eVar.l(getDescriptor()).H());
    }

    public void b(jh.f fVar, byte b10) {
        C6496s.h(fVar, "encoder");
        fVar.j(getDescriptor()).h(b10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return C6504C.a(a(eVar));
    }

    public f getDescriptor() {
        return f71594b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((C6504C) obj).i());
    }
}

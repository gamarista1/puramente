package kh;

import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.r;
import lf.C6506E;

public final class H0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f71602a = new H0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71603b = F.a("kotlin.UInt", C5998a.B(r.f71790a));

    private H0() {
    }

    public int a(e eVar) {
        C6496s.h(eVar, "decoder");
        return C6506E.b(eVar.l(getDescriptor()).h());
    }

    public void b(jh.f fVar, int i10) {
        C6496s.h(fVar, "encoder");
        fVar.j(getDescriptor()).D(i10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return C6506E.a(a(eVar));
    }

    public f getDescriptor() {
        return f71603b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((C6506E) obj).i());
    }
}

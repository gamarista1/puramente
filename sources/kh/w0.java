package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

public final class w0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f71719a = new w0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71720b = new p0("kotlin.Short", e.h.f68481a);

    private w0() {
    }

    /* renamed from: a */
    public Short deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Short.valueOf(eVar.t());
    }

    public void b(jh.f fVar, short s10) {
        C6496s.h(fVar, "encoder");
        fVar.s(s10);
    }

    public f getDescriptor() {
        return f71720b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}

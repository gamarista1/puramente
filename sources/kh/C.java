package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

public final class C implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C f71587a = new C();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71588b = new p0("kotlin.Float", e.C1020e.f68478a);

    private C() {
    }

    /* renamed from: a */
    public Float deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Float.valueOf(eVar.u());
    }

    public void b(jh.f fVar, float f10) {
        C6496s.h(fVar, "encoder");
        fVar.x(f10);
    }

    public f getDescriptor() {
        return f71588b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}

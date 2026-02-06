package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

public final class I implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final I f71604a = new I();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71605b = new p0("kotlin.Int", e.f.f68479a);

    private I() {
    }

    /* renamed from: a */
    public Integer deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Integer.valueOf(eVar.h());
    }

    public void b(jh.f fVar, int i10) {
        C6496s.h(fVar, "encoder");
        fVar.D(i10);
    }

    public f getDescriptor() {
        return f71605b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}

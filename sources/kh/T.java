package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

public final class T implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final T f71627a = new T();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71628b = new p0("kotlin.Long", e.g.f68480a);

    private T() {
    }

    /* renamed from: a */
    public Long deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Long.valueOf(eVar.m());
    }

    public void b(jh.f fVar, long j10) {
        C6496s.h(fVar, "encoder");
        fVar.n(j10);
    }

    public f getDescriptor() {
        return f71628b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}

package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.u  reason: case insensitive filesystem */
public final class C6473u implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6473u f71706a = new C6473u();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71707b = new p0("kotlin.Double", e.d.f68477a);

    private C6473u() {
    }

    /* renamed from: a */
    public Double deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Double.valueOf(eVar.w());
    }

    public void b(jh.f fVar, double d10) {
        C6496s.h(fVar, "encoder");
        fVar.f(d10);
    }

    public f getDescriptor() {
        return f71707b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}

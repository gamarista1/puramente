package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.i  reason: case insensitive filesystem */
public final class C6455i implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6455i f71663a = new C6455i();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71664b = new p0("kotlin.Boolean", e.a.f68474a);

    private C6455i() {
    }

    /* renamed from: a */
    public Boolean deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Boolean.valueOf(eVar.y());
    }

    public void b(jh.f fVar, boolean z10) {
        C6496s.h(fVar, "encoder");
        fVar.u(z10);
    }

    public f getDescriptor() {
        return f71664b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}

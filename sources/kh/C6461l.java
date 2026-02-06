package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.l  reason: case insensitive filesystem */
public final class C6461l implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6461l f71684a = new C6461l();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71685b = new p0("kotlin.Byte", e.b.f68475a);

    private C6461l() {
    }

    /* renamed from: a */
    public Byte deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Byte.valueOf(eVar.H());
    }

    public void b(jh.f fVar, byte b10) {
        C6496s.h(fVar, "encoder");
        fVar.h(b10);
    }

    public f getDescriptor() {
        return f71685b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}

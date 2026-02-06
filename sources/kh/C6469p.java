package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.p  reason: case insensitive filesystem */
public final class C6469p implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6469p f71692a = new C6469p();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71693b = new p0("kotlin.Char", e.c.f68476a);

    private C6469p() {
    }

    /* renamed from: a */
    public Character deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return Character.valueOf(eVar.z());
    }

    public void b(jh.f fVar, char c10) {
        C6496s.h(fVar, "encoder");
        fVar.y(c10);
    }

    public f getDescriptor() {
        return f71693b;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}

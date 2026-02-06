package kh;

import gh.C5978b;
import gh.C5986j;
import ih.f;
import jh.e;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.c0  reason: case insensitive filesystem */
public final class C6444c0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6444c0 f71645a = new C6444c0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71646b = C6442b0.f71642a;

    private C6444c0() {
    }

    /* renamed from: a */
    public Void deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        throw new C5986j("'kotlin.Nothing' does not have instances");
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, Void voidR) {
        C6496s.h(fVar, "encoder");
        C6496s.h(voidR, "value");
        throw new C5986j("'kotlin.Nothing' cannot be serialized");
    }

    public f getDescriptor() {
        return f71646b;
    }
}

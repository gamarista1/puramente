package kh;

import gh.C5978b;
import jh.e;
import jh.f;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class O0 implements C5978b {

    /* renamed from: b  reason: collision with root package name */
    public static final O0 f71620b = new O0();

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C6448e0 f71621a = new C6448e0("kotlin.Unit", C6514M.f71813a);

    private O0() {
    }

    public void a(e eVar) {
        C6496s.h(eVar, "decoder");
        this.f71621a.deserialize(eVar);
    }

    /* renamed from: b */
    public void serialize(f fVar, C6514M m10) {
        C6496s.h(fVar, "encoder");
        C6496s.h(m10, "value");
        this.f71621a.serialize(fVar, m10);
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        a(eVar);
        return C6514M.f71813a;
    }

    public ih.f getDescriptor() {
        return this.f71621a.getDescriptor();
    }
}

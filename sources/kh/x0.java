package kh;

import gh.C5978b;
import ih.e;
import ih.f;
import kotlin.jvm.internal.C6496s;

public final class x0 implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f71726a = new x0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f71727b = new p0("kotlin.String", e.i.f68482a);

    private x0() {
    }

    /* renamed from: a */
    public String deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return eVar.B();
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, String str) {
        C6496s.h(fVar, "encoder");
        C6496s.h(str, "value");
        fVar.F(str);
    }

    public f getDescriptor() {
        return f71727b;
    }
}

package lh;

import gh.C5978b;
import ih.f;
import ih.i;
import ih.j;
import jh.e;
import kotlin.jvm.internal.C6496s;
import mh.B;
import yf.C6798l;

public final class u implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final u f72010a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final f f72011b = i.d("kotlinx.serialization.json.JsonNull", j.b.f68505a, new f[0], (C6798l) null, 8, (Object) null);

    private u() {
    }

    /* renamed from: a */
    public t deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        l.g(eVar);
        if (!eVar.D()) {
            eVar.j();
            return t.INSTANCE;
        }
        throw new B("Expected 'null' literal");
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, t tVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(tVar, "value");
        l.h(fVar);
        fVar.r();
    }

    public f getDescriptor() {
        return f72011b;
    }
}

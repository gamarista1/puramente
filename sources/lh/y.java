package lh;

import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mh.F;
import yf.C6798l;

public final class y implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final y f72019a = new y();

    /* renamed from: b  reason: collision with root package name */
    private static final f f72020b = i.d("kotlinx.serialization.json.JsonPrimitive", e.i.f68482a, new f[0], (C6798l) null, 8, (Object) null);

    private y() {
    }

    /* renamed from: a */
    public x deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        i g10 = l.d(eVar).g();
        if (g10 instanceof x) {
            return (x) g10;
        }
        throw F.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + O.b(g10.getClass()), g10.toString());
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, x xVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(xVar, "value");
        l.h(fVar);
        if (xVar instanceof t) {
            fVar.m(u.f72010a, t.INSTANCE);
        } else {
            fVar.m(q.f72005a, (p) xVar);
        }
    }

    public f getDescriptor() {
        return f72020b;
    }
}

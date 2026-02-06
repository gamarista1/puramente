package lh;

import Sg.p;
import gh.C5978b;
import hh.C5998a;
import ih.e;
import ih.f;
import ih.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6508G;
import mh.F;

final class q implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    public static final q f72005a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final f f72006b = i.a("kotlinx.serialization.json.JsonLiteral", e.i.f68482a);

    private q() {
    }

    /* renamed from: a */
    public p deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        i g10 = l.d(eVar).g();
        if (g10 instanceof p) {
            return (p) g10;
        }
        throw F.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + O.b(g10.getClass()), g10.toString());
    }

    /* renamed from: b */
    public void serialize(jh.f fVar, p pVar) {
        C6496s.h(fVar, "encoder");
        C6496s.h(pVar, "value");
        l.h(fVar);
        if (pVar.b()) {
            fVar.F(pVar.a());
        } else if (pVar.g() != null) {
            fVar.j(pVar.g()).F(pVar.a());
        } else {
            Long o10 = p.o(pVar.a());
            if (o10 != null) {
                fVar.n(o10.longValue());
                return;
            }
            C6508G h10 = Sg.F.h(pVar.a());
            if (h10 != null) {
                fVar.j(C5998a.H(C6508G.f71802b).getDescriptor()).n(h10.j());
                return;
            }
            Double j10 = p.j(pVar.a());
            if (j10 != null) {
                fVar.f(j10.doubleValue());
                return;
            }
            Boolean f12 = p.f1(pVar.a());
            if (f12 != null) {
                fVar.u(f12.booleanValue());
            } else {
                fVar.F(pVar.a());
            }
        }
    }

    public f getDescriptor() {
        return f72006b;
    }
}

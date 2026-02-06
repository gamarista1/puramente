package Yf;

import Fg.S;
import Hg.k;
import Hg.l;
import Lf.o;
import Of.H;
import Of.t0;
import Pf.q;
import Pf.r;
import com.amazon.a.a.m.c;
import eg.C5825b;
import eg.C5836m;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import mf.Y;
import ng.b;
import tg.C6736b;
import tg.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f66750a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f66751b = O.l(C6502A.a(c.f37301f, EnumSet.noneOf(r.class)), C6502A.a("TYPE", EnumSet.of(r.CLASS, r.FILE)), C6502A.a("ANNOTATION_TYPE", EnumSet.of(r.ANNOTATION_CLASS)), C6502A.a("TYPE_PARAMETER", EnumSet.of(r.TYPE_PARAMETER)), C6502A.a("FIELD", EnumSet.of(r.FIELD)), C6502A.a("LOCAL_VARIABLE", EnumSet.of(r.LOCAL_VARIABLE)), C6502A.a("PARAMETER", EnumSet.of(r.VALUE_PARAMETER)), C6502A.a("CONSTRUCTOR", EnumSet.of(r.CONSTRUCTOR)), C6502A.a("METHOD", EnumSet.of(r.FUNCTION, r.PROPERTY_GETTER, r.PROPERTY_SETTER)), C6502A.a("TYPE_USE", EnumSet.of(r.TYPE)));

    /* renamed from: c  reason: collision with root package name */
    private static final Map f66752c = O.l(C6502A.a("RUNTIME", q.RUNTIME), C6502A.a("CLASS", q.BINARY), C6502A.a("SOURCE", q.SOURCE));

    private f() {
    }

    /* access modifiers changed from: private */
    public static final S e(H h10) {
        S type;
        C6496s.h(h10, "module");
        t0 b10 = a.b(d.f66744a.d(), h10.m().o(o.a.f63968H));
        if (b10 == null || (type = b10.getType()) == null) {
            return l.d(k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
        }
        return type;
    }

    public final g b(C5825b bVar) {
        C5836m mVar;
        String str;
        if (bVar instanceof C5836m) {
            mVar = (C5836m) bVar;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        Map map = f66752c;
        ng.f e10 = mVar.e();
        if (e10 != null) {
            str = e10.b();
        } else {
            str = null;
        }
        q qVar = (q) map.get(str);
        if (qVar == null) {
            return null;
        }
        b c10 = b.f72283d.c(o.a.f63974K);
        ng.f i10 = ng.f.i(qVar.name());
        C6496s.g(i10, "identifier(...)");
        return new tg.k(c10, i10);
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) f66751b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        return Y.e();
    }

    public final g d(List list) {
        String str;
        C6496s.h(list, "arguments");
        ArrayList<C5836m> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof C5836m) {
                arrayList.add(next);
            }
        }
        ArrayList<r> arrayList2 = new ArrayList<>();
        for (C5836m e10 : arrayList) {
            f fVar = f66750a;
            ng.f e11 = e10.e();
            if (e11 != null) {
                str = e11.b();
            } else {
                str = null;
            }
            C6565s.D(arrayList2, fVar.c(str));
        }
        ArrayList arrayList3 = new ArrayList(C6565s.y(arrayList2, 10));
        for (r name : arrayList2) {
            b c10 = b.f72283d.c(o.a.f63972J);
            ng.f i10 = ng.f.i(name.name());
            C6496s.g(i10, "identifier(...)");
            arrayList3.add(new tg.k(c10, i10));
        }
        return new C6736b(arrayList3, e.f66749a);
    }
}

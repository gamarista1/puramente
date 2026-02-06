package Of;

import Jg.j;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6535s;
import mf.C6565s;
import ng.f;
import yf.C6798l;

public abstract class r0 {
    public /* synthetic */ r0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(f fVar);

    public final r0 b(C6798l lVar) {
        C6496s.h(lVar, "transform");
        if (this instanceof A) {
            A a10 = (A) this;
            return new A(a10.c(), (j) lVar.invoke(a10.d()));
        } else if (this instanceof I) {
            Iterable<Pair> c10 = ((I) this).c();
            ArrayList arrayList = new ArrayList(C6565s.y(c10, 10));
            for (Pair pair : c10) {
                arrayList.add(C6502A.a((f) pair.a(), lVar.invoke((j) pair.b())));
            }
            return new I(arrayList);
        } else {
            throw new C6535s();
        }
    }

    private r0() {
    }
}

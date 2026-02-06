package Nf;

import Fg.C5366d0;
import Fg.w0;
import Kg.d;
import Of.C5487e;
import Of.m0;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;

public abstract class y {
    public static final w0 a(C5487e eVar, C5487e eVar2) {
        C6496s.h(eVar, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(eVar2, "to");
        eVar.q().size();
        eVar2.q().size();
        w0.a aVar = w0.f63074c;
        List q10 = eVar.q();
        C6496s.g(q10, "getDeclaredTypeParameters(...)");
        Iterable<m0> iterable = q10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (m0 l10 : iterable) {
            arrayList.add(l10.l());
        }
        List q11 = eVar2.q();
        C6496s.g(q11, "getDeclaredTypeParameters(...)");
        Iterable<m0> iterable2 = q11;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
        for (m0 p10 : iterable2) {
            C5366d0 p11 = p10.p();
            C6496s.g(p11, "getDefaultType(...)");
            arrayList2.add(d.d(p11));
        }
        return w0.a.e(aVar, O.w(C6565s.n1(arrayList, arrayList2)), false, 2, (Object) null);
    }
}

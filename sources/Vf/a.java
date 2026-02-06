package Vf;

import Of.C5487e;
import Of.N;
import Wf.b;
import Wf.c;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.jvm.internal.C6496s;
import ng.f;

public abstract class a {
    public static final void a(c cVar, b bVar, C5487e eVar, f fVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(bVar, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(eVar, "scopeOwner");
        C6496s.h(fVar, "name");
        if (cVar != c.a.f65944a) {
            bVar.a();
        }
    }

    public static final void b(c cVar, b bVar, N n10, f fVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(bVar, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(n10, "scopeOwner");
        C6496s.h(fVar, "name");
        String b10 = n10.f().b();
        C6496s.g(b10, "asString(...)");
        String b11 = fVar.b();
        C6496s.g(b11, "asString(...)");
        c(cVar, bVar, b10, b11);
    }

    public static final void c(c cVar, b bVar, String str, String str2) {
        C6496s.h(cVar, "<this>");
        C6496s.h(bVar, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(str, "packageFqName");
        C6496s.h(str2, "name");
        if (cVar != c.a.f65944a) {
            bVar.a();
        }
    }
}

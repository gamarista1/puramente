package lh;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class o {
    public static final C6538b a(C6538b bVar, C6798l lVar) {
        C6496s.h(bVar, TicketDetailDestinationKt.LAUNCHED_FROM);
        C6496s.h(lVar, "builderAction");
        e eVar = new e(bVar);
        lVar.invoke(eVar);
        return new n(eVar.a(), eVar.b());
    }

    public static /* synthetic */ C6538b b(C6538b bVar, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = C6538b.f71951d;
        }
        return a(bVar, lVar);
    }
}

package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.events.BackendStoredEvent;
import gh.C5978b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lh.e;
import nh.C6621b;
import nh.f;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llh/e;", "Llf/M;", "invoke", "(Llh/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsManager$Companion$json$1 extends C6498u implements C6798l {
    public static final EventsManager$Companion$json$1 INSTANCE = new EventsManager$Companion$json$1();

    EventsManager$Companion$json$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return C6514M.f71813a;
    }

    public final void invoke(e eVar) {
        C6496s.h(eVar, "$this$Json");
        f fVar = new f();
        C6621b bVar = new C6621b(O.b(BackendStoredEvent.class), (C5978b) null);
        bVar.b(O.b(BackendStoredEvent.CustomerCenter.class), BackendStoredEvent.CustomerCenter.Companion.serializer());
        bVar.b(O.b(BackendStoredEvent.Paywalls.class), BackendStoredEvent.Paywalls.Companion.serializer());
        bVar.a(fVar);
        eVar.h(fVar.f());
        eVar.e(false);
    }
}

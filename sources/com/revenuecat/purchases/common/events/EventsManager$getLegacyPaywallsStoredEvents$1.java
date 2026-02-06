package com.revenuecat.purchases.common.events;

import Rg.h;
import Rg.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRg/h;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "sequence", "Llf/M;", "invoke", "(LRg/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsManager$getLegacyPaywallsStoredEvents$1 extends C6498u implements C6798l {
    final /* synthetic */ N $events;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventsManager$getLegacyPaywallsStoredEvents$1(N n10) {
        super(1);
        this.$events = n10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h) obj);
        return C6514M.f71813a;
    }

    public final void invoke(h hVar) {
        C6496s.h(hVar, "sequence");
        this.$events.f71759a = k.G(k.D(hVar, 50));
    }
}

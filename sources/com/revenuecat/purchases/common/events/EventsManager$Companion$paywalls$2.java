package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class EventsManager$Companion$paywalls$2 extends C6494p implements C6798l {
    EventsManager$Companion$paywalls$2(Object obj) {
        super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
    }

    public final PaywallStoredEvent invoke(String str) {
        C6496s.h(str, "p0");
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(str);
    }
}

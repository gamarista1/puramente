package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class EventsManager$Companion$paywalls$1 extends C6494p implements C6798l {
    public static final EventsManager$Companion$paywalls$1 INSTANCE = new EventsManager$Companion$paywalls$1();

    EventsManager$Companion$paywalls$1() {
        super(1, PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    public final String invoke(PaywallStoredEvent paywallStoredEvent) {
        C6496s.h(paywallStoredEvent, "p0");
        return paywallStoredEvent.toString();
    }
}

package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lh.C6538b;

@C5985i
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "", "userID", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toBackendEvent", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "()Ljava/lang/String;", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component2", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getEvent", "Ljava/lang/String;", "getUserID", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6538b.a json = C6538b.f71951d;
    private final PaywallEvent event;
    private final String userID;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent$Companion;", "", "<init>", "()V", "", "string", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lgh/b;", "serializer", "()Lgh/b;", "Llh/b$a;", "json", "Llh/b$a;", "getJson", "()Llh/b$a;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaywallStoredEvent fromString(String str) {
            C6496s.h(str, "string");
            C6538b.a json = getJson();
            json.a();
            return (PaywallStoredEvent) json.b(PaywallStoredEvent.Companion.serializer(), str);
        }

        public final C6538b.a getJson() {
            return PaywallStoredEvent.json;
        }

        public final C5978b serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PaywallStoredEvent(int i10, PaywallEvent paywallEvent, String str, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i10 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self(PaywallStoredEvent paywallStoredEvent, d dVar, f fVar) {
        dVar.B(fVar, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        dVar.t(fVar, 1, paywallStoredEvent.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent paywallEvent, String str) {
        C6496s.h(paywallEvent, "event");
        C6496s.h(str, "userID");
        return new PaywallStoredEvent(paywallEvent, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return C6496s.c(this.event, paywallStoredEvent.event) && C6496s.c(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.userID.hashCode();
    }

    public final BackendEvent.Paywalls toBackendEvent() {
        String uuid = this.event.getCreationData().getId().toString();
        C6496s.g(uuid, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String uuid2 = this.event.getData().getSessionIdentifier().toString();
        C6496s.g(uuid2, "event.data.sessionIdentifier.toString()");
        return new BackendEvent.Paywalls(uuid, 1, value, str, uuid2, this.event.getData().getOfferingIdentifier(), this.event.getData().getPaywallRevision(), this.event.getCreationData().getDate().getTime(), this.event.getData().getDisplayMode(), this.event.getData().getDarkMode(), this.event.getData().getLocaleIdentifier());
    }

    public String toString() {
        C6538b.a aVar = json;
        aVar.a();
        return aVar.c(Companion.serializer(), this);
    }

    public PaywallStoredEvent(PaywallEvent paywallEvent, String str) {
        C6496s.h(paywallEvent, "event");
        C6496s.h(str, "userID");
        this.event = paywallEvent;
        this.userID = str;
    }
}

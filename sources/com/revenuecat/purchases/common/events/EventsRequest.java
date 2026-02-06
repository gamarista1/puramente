package com.revenuecat.purchases.common.events;

import gh.C5978b;
import gh.C5985i;
import java.util.ArrayList;
import java.util.List;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÀ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest;", "", "", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "events", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Ljh/d;Lih/f;)V", "component1$purchases_defaultsRelease", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/revenuecat/purchases/common/events/EventsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents$purchases_defaultsRelease", "getCacheKey", "cacheKey", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventsRequest {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {new C6449f(BackendEvent.Companion.serializer())};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<BackendEvent> events;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return EventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ EventsRequest(int i10, List list, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, EventsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public static /* synthetic */ EventsRequest copy$default(EventsRequest eventsRequest, List<BackendEvent> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = eventsRequest.events;
        }
        return eventsRequest.copy(list);
    }

    public final List<BackendEvent> component1$purchases_defaultsRelease() {
        return this.events;
    }

    public final EventsRequest copy(List<? extends BackendEvent> list) {
        C6496s.h(list, "events");
        return new EventsRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventsRequest) && C6496s.c(this.events, ((EventsRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        Iterable<BackendEvent> iterable = this.events;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (BackendEvent hashCode : iterable) {
            arrayList.add(String.valueOf(hashCode.hashCode()));
        }
        return arrayList;
    }

    public final List<BackendEvent> getEvents$purchases_defaultsRelease() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "EventsRequest(events=" + this.events + ')';
    }

    public EventsRequest(List<? extends BackendEvent> list) {
        C6496s.h(list, "events");
        this.events = list;
    }
}

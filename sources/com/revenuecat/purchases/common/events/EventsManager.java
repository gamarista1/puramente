package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lh.C6538b;
import lh.o;
import mf.C6565s;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 12\u00020\u0001:\u00011Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00126\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0011\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010 \u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010+RD\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0011\u0012\u0004\u0012\u00020\u00100\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u001e\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00138B@BX\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00138B@BX\u000e¢\u0006\u0006\n\u0004\b0\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager;", "", "Ljava/util/UUID;", "appSessionID", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "Lkotlin/Function0;", "Llf/M;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "postEvents", "<init>", "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lyf/q;)V", "flushLegacyEvents", "()V", "", "getStoredEvents", "()Ljava/util/List;", "getLegacyPaywallsStoredEvents", "Lcom/revenuecat/purchases/common/Delay;", "delay", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;Lyf/a;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "flushEvents", "appSessionID$1", "Ljava/util/UUID;", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lyf/q;", "<set-?>", "flushInProgress", "Z", "legacyFlushTriggered", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventsManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    private static final int FLUSH_COUNT = 50;
    private static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    /* access modifiers changed from: private */
    public static final UUID appSessionID;
    /* access modifiers changed from: private */
    public static final C6538b json = o.b((C6538b) null, EventsManager$Companion$json$1.INSTANCE, 1, (Object) null);
    /* access modifiers changed from: private */
    public final UUID appSessionID$1;
    private final Dispatcher eventsDispatcher;
    /* access modifiers changed from: private */
    public final EventsFileHelper<BackendStoredEvent> fileHelper;
    /* access modifiers changed from: private */
    public boolean flushInProgress;
    /* access modifiers changed from: private */
    public final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper;
    /* access modifiers changed from: private */
    public boolean legacyFlushTriggered;
    /* access modifiers changed from: private */
    public final q postEvents;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "backendEvents", "(Lcom/revenuecat/purchases/common/FileHelper;)Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "paywalls", "Llh/b;", "json", "Llh/b;", "getJson$annotations", "Ljava/util/UUID;", "appSessionID", "Ljava/util/UUID;", "getAppSessionID$purchases_defaultsRelease", "()Ljava/util/UUID;", "", "EVENTS_FILE_PATH_NEW", "Ljava/lang/String;", "", "FLUSH_COUNT", "I", "PAYWALL_EVENTS_FILE_PATH", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        public final EventsFileHelper<BackendStoredEvent> backendEvents(FileHelper fileHelper) {
            C6496s.h(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.EVENTS_FILE_PATH_NEW, EventsManager$Companion$backendEvents$1.INSTANCE, EventsManager$Companion$backendEvents$2.INSTANCE);
        }

        public final UUID getAppSessionID$purchases_defaultsRelease() {
            return EventsManager.appSessionID;
        }

        public final EventsFileHelper<PaywallStoredEvent> paywalls(FileHelper fileHelper) {
            C6496s.h(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.PAYWALL_EVENTS_FILE_PATH, EventsManager$Companion$paywalls$1.INSTANCE, new EventsManager$Companion$paywalls$2(PaywallStoredEvent.Companion));
        }

        private Companion() {
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        C6496s.g(randomUUID, "randomUUID()");
        appSessionID = randomUUID;
    }

    public EventsManager(UUID uuid, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, EventsFileHelper<BackendStoredEvent> eventsFileHelper2, IdentityManager identityManager2, Dispatcher dispatcher, q qVar) {
        C6496s.h(uuid, "appSessionID");
        C6496s.h(eventsFileHelper, "legacyEventsFileHelper");
        C6496s.h(eventsFileHelper2, "fileHelper");
        C6496s.h(identityManager2, "identityManager");
        C6496s.h(dispatcher, "eventsDispatcher");
        C6496s.h(qVar, "postEvents");
        this.appSessionID$1 = uuid;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = eventsFileHelper2;
        this.identityManager = identityManager2;
        this.eventsDispatcher = dispatcher;
        this.postEvents = qVar;
    }

    private final void enqueue(Delay delay, C6787a aVar) {
        this.eventsDispatcher.enqueue(new a(aVar), delay);
    }

    static /* synthetic */ void enqueue$default(EventsManager eventsManager, Delay delay, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.NONE;
        }
        eventsManager.enqueue(delay, aVar);
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$command");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final void flushLegacyEvents() {
        enqueue$default(this, (Delay) null, new EventsManager$flushLegacyEvents$1(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final List<PaywallStoredEvent> getLegacyPaywallsStoredEvents() {
        N n10 = new N();
        n10.f71759a = C6565s.n();
        this.legacyEventsFileHelper.readFile(new EventsManager$getLegacyPaywallsStoredEvents$1(n10));
        return (List) n10.f71759a;
    }

    /* access modifiers changed from: private */
    public final List<BackendStoredEvent> getStoredEvents() {
        N n10 = new N();
        n10.f71759a = C6565s.n();
        this.fileHelper.readFile(new EventsManager$getStoredEvents$1(n10));
        return (List) n10.f71759a;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, (Delay) null, new EventsManager$flushEvents$1(this), 1, (Object) null);
    }

    public final synchronized void track(FeatureEvent featureEvent) {
        C6496s.h(featureEvent, "event");
        enqueue$default(this, (Delay) null, new EventsManager$track$1(featureEvent, this), 1, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager2, Dispatcher dispatcher, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? appSessionID : uuid, eventsFileHelper, eventsFileHelper2, identityManager2, dispatcher, qVar);
    }
}

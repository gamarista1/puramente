package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsManager$flushLegacyEvents$1 extends C6498u implements C6787a {
    final /* synthetic */ EventsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventsManager$flushLegacyEvents$1(EventsManager eventsManager) {
        super(0);
        this.this$0 = eventsManager;
    }

    public final void invoke() {
        final List access$getLegacyPaywallsStoredEvents = this.this$0.getLegacyPaywallsStoredEvents();
        List l02 = C6565s.l0(access$getLegacyPaywallsStoredEvents);
        Iterable<PaywallStoredEvent> iterable = l02;
        ArrayList<BackendStoredEvent.Paywalls> arrayList = new ArrayList<>(C6565s.y(iterable, 10));
        for (PaywallStoredEvent backendEvent : iterable) {
            arrayList.add(new BackendStoredEvent.Paywalls(backendEvent.toBackendEvent()));
        }
        if (l02.isEmpty()) {
            LogUtilsKt.verboseLog("No legacy events to sync. Skipping legacy flush.");
            return;
        }
        LogUtilsKt.verboseLog("Legacy event flush: posting " + arrayList.size() + " events.");
        q access$getPostEvents$p = this.this$0.postEvents;
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (BackendStoredEvent.Paywalls backendEvent2 : arrayList) {
            arrayList2.add(BackendStoredEventKt.toBackendEvent(backendEvent2));
        }
        EventsRequest eventsRequest = new EventsRequest(arrayList2);
        final EventsManager eventsManager = this.this$0;
        AnonymousClass2 r22 = new C6787a() {
            public final void invoke() {
                LogUtilsKt.verboseLog("Legacy event flush: success.");
                final EventsManager eventsManager = eventsManager;
                final List<PaywallStoredEvent> list = access$getLegacyPaywallsStoredEvents;
                EventsManager.enqueue$default(eventsManager, (Delay) null, new C6787a() {
                    public final void invoke() {
                        eventsManager.legacyEventsFileHelper.clear(list.size());
                    }
                }, 1, (Object) null);
            }
        };
        final EventsManager eventsManager2 = this.this$0;
        access$getPostEvents$p.invoke(eventsRequest, r22, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError, final boolean z10) {
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                LogUtilsKt.errorLog$default("Legacy event flush error: " + purchasesError + '.', (Throwable) null, 2, (Object) null);
                final EventsManager eventsManager = eventsManager2;
                final List<PaywallStoredEvent> list = access$getLegacyPaywallsStoredEvents;
                EventsManager.enqueue$default(eventsManager, (Delay) null, new C6787a() {
                    public final void invoke() {
                        if (z10) {
                            eventsManager.legacyEventsFileHelper.clear(list.size());
                        }
                    }
                }, 1, (Object) null);
            }
        });
    }
}

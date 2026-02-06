package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.LogUtilsKt;
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
final class EventsManager$flushEvents$1 extends C6498u implements C6787a {
    final /* synthetic */ EventsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventsManager$flushEvents$1(EventsManager eventsManager) {
        super(0);
        this.this$0 = eventsManager;
    }

    public final void invoke() {
        if (this.this$0.flushInProgress) {
            LogUtilsKt.debugLog("Flush already in progress.");
            return;
        }
        this.this$0.flushInProgress = true;
        if (!this.this$0.legacyFlushTriggered) {
            this.this$0.legacyFlushTriggered = true;
            this.this$0.flushLegacyEvents();
        }
        final List access$getStoredEvents = this.this$0.getStoredEvents();
        List l02 = C6565s.l0(access$getStoredEvents);
        if (l02.isEmpty()) {
            LogUtilsKt.verboseLog("No new events to sync.");
            this.this$0.flushInProgress = false;
            return;
        }
        LogUtilsKt.verboseLog("New event flush: posting " + l02.size() + " events.");
        q access$getPostEvents$p = this.this$0.postEvents;
        Iterable<BackendStoredEvent> iterable = l02;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (BackendStoredEvent backendEvent : iterable) {
            arrayList.add(BackendStoredEventKt.toBackendEvent(backendEvent));
        }
        EventsRequest eventsRequest = new EventsRequest(arrayList);
        final EventsManager eventsManager = this.this$0;
        AnonymousClass2 r32 = new C6787a() {
            public final void invoke() {
                LogUtilsKt.verboseLog("New event flush: success.");
                final EventsManager eventsManager = eventsManager;
                final List<BackendStoredEvent> list = access$getStoredEvents;
                EventsManager.enqueue$default(eventsManager, (Delay) null, new C6787a() {
                    public final void invoke() {
                        eventsManager.fileHelper.clear(list.size());
                        eventsManager.flushInProgress = false;
                    }
                }, 1, (Object) null);
            }
        };
        final EventsManager eventsManager2 = this.this$0;
        access$getPostEvents$p.invoke(eventsRequest, r32, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError, final boolean z10) {
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                LogUtilsKt.errorLog$default("New event flush error: " + purchasesError + '.', (Throwable) null, 2, (Object) null);
                final EventsManager eventsManager = eventsManager2;
                final List<BackendStoredEvent> list = access$getStoredEvents;
                EventsManager.enqueue$default(eventsManager, (Delay) null, new C6787a() {
                    public final void invoke() {
                        if (z10) {
                            eventsManager.fileHelper.clear(list.size());
                        }
                        eventsManager.flushInProgress = false;
                    }
                }, 1, (Object) null);
            }
        });
    }
}

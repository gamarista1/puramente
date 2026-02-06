package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsManager$track$1 extends C6498u implements C6787a {
    final /* synthetic */ FeatureEvent $event;
    final /* synthetic */ EventsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventsManager$track$1(FeatureEvent featureEvent, EventsManager eventsManager) {
        super(0);
        this.$event = featureEvent;
        this.this$0 = eventsManager;
    }

    public final void invoke() {
        BackendStoredEvent backendStoredEvent;
        LogUtilsKt.debugLog("Tracking event: " + this.$event);
        FeatureEvent featureEvent = this.$event;
        if (featureEvent instanceof PaywallEvent) {
            backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((PaywallEvent) featureEvent, this.this$0.identityManager.getCurrentAppUserID());
        } else if (featureEvent instanceof CustomerCenterImpressionEvent) {
            String currentAppUserID = this.this$0.identityManager.getCurrentAppUserID();
            String uuid = this.this$0.appSessionID$1.toString();
            C6496s.g(uuid, "appSessionID.toString()");
            backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterImpressionEvent) featureEvent, currentAppUserID, uuid);
        } else if (featureEvent instanceof CustomerCenterSurveyOptionChosenEvent) {
            String currentAppUserID2 = this.this$0.identityManager.getCurrentAppUserID();
            String uuid2 = this.this$0.appSessionID$1.toString();
            C6496s.g(uuid2, "appSessionID.toString()");
            backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterSurveyOptionChosenEvent) featureEvent, currentAppUserID2, uuid2);
        } else {
            backendStoredEvent = null;
        }
        if (backendStoredEvent != null) {
            this.this$0.fileHelper.appendEvent(backendStoredEvent);
            return;
        }
        LogUtilsKt.debugLog("Backend event not implemented for: " + this.$event);
    }
}

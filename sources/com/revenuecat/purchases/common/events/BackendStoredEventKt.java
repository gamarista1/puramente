package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"toBackendEvent", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "toBackendStoredEvent", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;", "appUserID", "", "appSessionID", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendStoredEventKt {
    public static final BackendEvent toBackendEvent(BackendStoredEvent backendStoredEvent) {
        C6496s.h(backendStoredEvent, "<this>");
        if (backendStoredEvent instanceof BackendStoredEvent.Paywalls) {
            return ((BackendStoredEvent.Paywalls) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.CustomerCenter) {
            return ((BackendStoredEvent.CustomerCenter) backendStoredEvent).getEvent();
        }
        throw new C6535s();
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(PaywallEvent paywallEvent, String str) {
        PaywallEvent paywallEvent2 = paywallEvent;
        C6496s.h(paywallEvent, "<this>");
        String str2 = str;
        C6496s.h(str2, "appUserID");
        String uuid = paywallEvent.getCreationData().getId().toString();
        C6496s.g(uuid, "creationData.id.toString()");
        String value = paywallEvent.getType().getValue();
        String uuid2 = paywallEvent.getData().getSessionIdentifier().toString();
        C6496s.g(uuid2, "data.sessionIdentifier.toString()");
        return new BackendStoredEvent.Paywalls(new BackendEvent.Paywalls(uuid, 1, value, str2, uuid2, paywallEvent.getData().getOfferingIdentifier(), paywallEvent.getData().getPaywallRevision(), paywallEvent.getCreationData().getDate().getTime(), paywallEvent.getData().getDisplayMode(), paywallEvent.getData().getDarkMode(), paywallEvent.getData().getLocaleIdentifier()));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterImpressionEvent customerCenterImpressionEvent, String str, String str2) {
        C6496s.h(customerCenterImpressionEvent, "<this>");
        String str3 = str;
        C6496s.h(str3, "appUserID");
        String str4 = str2;
        C6496s.h(str4, "appSessionID");
        String uuid = customerCenterImpressionEvent.getCreationData().getId().toString();
        C6496s.g(uuid, "creationData.id.toString()");
        BackendEvent.CustomerCenter customerCenter = r1;
        BackendEvent.CustomerCenter customerCenter2 = new BackendEvent.CustomerCenter(uuid, customerCenterImpressionEvent.getData().getRevisionID(), customerCenterImpressionEvent.getData().getType(), str3, str4, customerCenterImpressionEvent.getData().getTimestamp().getTime(), customerCenterImpressionEvent.getData().getDarkMode(), customerCenterImpressionEvent.getData().getLocale(), customerCenterImpressionEvent.getData().getDisplayMode(), (CustomerCenterConfigData.HelpPath.PathType) null, (String) null, (String) null, (String) null);
        return new BackendStoredEvent.CustomerCenter(customerCenter);
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent, String str, String str2) {
        C6496s.h(customerCenterSurveyOptionChosenEvent, "<this>");
        String str3 = str;
        C6496s.h(str3, "appUserID");
        String str4 = str2;
        C6496s.h(str4, "appSessionID");
        String uuid = customerCenterSurveyOptionChosenEvent.getCreationData().getId().toString();
        C6496s.g(uuid, "creationData.id.toString()");
        BackendEvent.CustomerCenter customerCenter = r1;
        BackendEvent.CustomerCenter customerCenter2 = new BackendEvent.CustomerCenter(uuid, customerCenterSurveyOptionChosenEvent.getData().getRevisionID(), customerCenterSurveyOptionChosenEvent.getData().getType(), str3, str4, customerCenterSurveyOptionChosenEvent.getData().getTimestamp().getTime(), customerCenterSurveyOptionChosenEvent.getData().getDarkMode(), customerCenterSurveyOptionChosenEvent.getData().getLocale(), customerCenterSurveyOptionChosenEvent.getData().getDisplayMode(), customerCenterSurveyOptionChosenEvent.getData().getPath(), customerCenterSurveyOptionChosenEvent.getData().getUrl(), customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionID(), customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionTitleKey());
        return new BackendStoredEvent.CustomerCenter(customerCenter);
    }
}

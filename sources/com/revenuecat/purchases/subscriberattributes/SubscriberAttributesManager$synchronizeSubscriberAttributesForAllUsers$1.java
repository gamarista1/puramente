package com.revenuecat.purchases.subscriberattributes;

import Sg.p;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1 extends C6498u implements C6787a {
    final /* synthetic */ C6787a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1(SubscriberAttributesManager subscriberAttributesManager, C6787a aVar, String str) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$completion = aVar;
        this.$currentAppUserID = str;
    }

    public final void invoke() {
        Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : unsyncedSubscriberAttributes.entrySet()) {
            if (!p.d0((String) next.getKey())) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
            C6787a aVar = this.$completion;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        int size = linkedHashMap.size();
        L l10 = new L();
        SubscriberAttributesManager subscriberAttributesManager = this.this$0;
        String str = this.$currentAppUserID;
        C6787a aVar2 = this.$completion;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            SubscriberAttributesPoster backend = subscriberAttributesManager.getBackend();
            SubscriberAttributesManager subscriberAttributesManager2 = subscriberAttributesManager;
            String str3 = str2;
            Map map2 = map;
            SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 = r2;
            String str4 = str;
            Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
            Iterator it2 = it;
            SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$12 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(subscriberAttributesManager2, str3, map2, str, l10, aVar2, size);
            backend.postSubscriberAttributes(backendMap, str2, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(subscriberAttributesManager2, str3, map2, l10, aVar2, size));
            str = str4;
            it = it2;
        }
    }
}

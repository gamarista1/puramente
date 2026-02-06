package com.revenuecat.purchases.subscriberattributes;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$collectDeviceIdentifiers$1 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$collectDeviceIdentifiers$1(SubscriberAttributesManager subscriberAttributesManager, String str) {
        super(1);
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, String>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, String> map) {
        C6496s.h(map, "deviceIdentifiers");
        this.this$0.setAttributes(map, this.$appUserID);
    }
}

package com.revenuecat.purchases.subscriberattributes;

import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1 extends C6498u implements C6787a {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ C6798l $completion;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1(C6798l lVar, SubscriberAttributesManager subscriberAttributesManager, String str) {
        super(0);
        this.$completion = lVar;
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str;
    }

    public final void invoke() {
        this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
    }
}

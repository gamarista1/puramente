package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import mf.C6565s;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends C6498u implements C6787a {
    final /* synthetic */ C6787a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ L $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, L l10, C6787a aVar, int i10) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = l10;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i10;
    }

    public final void invoke() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, C6565s.n());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        String format = String.format(AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, Arrays.copyOf(new Object[]{this.$syncingAppUserID}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        if (!C6496s.c(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
        L l10 = this.$currentSyncedAttributeCount;
        int i10 = l10.f71757a + 1;
        l10.f71757a = i10;
        C6787a aVar = this.$completion;
        if (aVar != null && i10 == this.$unsyncedStoredAttributesCount) {
            aVar.invoke();
        }
    }
}

package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "didBackendGetAttributes", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends C6498u implements q {
    final /* synthetic */ C6787a $completion;
    final /* synthetic */ L $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, L l10, C6787a aVar, int i10) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = l10;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue(), (List<SubscriberAttributeError>) (List) obj3);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10, List<SubscriberAttributeError> list) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        C6496s.h(list, "attributeErrors");
        if (z10) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, list);
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        String format = String.format(AttributionStrings.ATTRIBUTES_SYNC_ERROR, Arrays.copyOf(new Object[]{this.$syncingAppUserID, purchasesError}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        L l10 = this.$currentSyncedAttributeCount;
        int i10 = l10.f71757a + 1;
        l10.f71757a = i10;
        C6787a aVar = this.$completion;
        if (aVar != null && i10 == this.$unsyncedStoredAttributesCount) {
            aVar.invoke();
        }
    }
}

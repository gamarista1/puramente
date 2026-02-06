package com.revenuecat.purchases;

import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import io.branch.rnbranch.RNBranchModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6798l;
import yf.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postReceiptAndSubscriberAttributes$1 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ String $marketplace;
    final /* synthetic */ q $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ PaywallEvent $presentedPaywall;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ ReceiptInfo $receiptInfo;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postReceiptAndSubscriberAttributes$1(PostReceiptHelper postReceiptHelper, String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallEvent paywallEvent, C6798l lVar, q qVar) {
        super(1);
        this.this$0 = postReceiptHelper;
        this.$purchaseToken = str;
        this.$appUserID = str2;
        this.$isRestore = z10;
        this.$receiptInfo = receiptInfo;
        this.$storeUserID = str3;
        this.$marketplace = str4;
        this.$initiationSource = postReceiptInitiationSource;
        this.$presentedPaywall = paywallEvent;
        this.$onSuccess = lVar;
        this.$onError = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, SubscriberAttribute>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, SubscriberAttribute> map) {
        final Map<String, SubscriberAttribute> map2 = map;
        C6496s.h(map2, "unsyncedSubscriberAttributesByKey");
        Backend access$getBackend$p = this.this$0.backend;
        String str = this.$purchaseToken;
        String str2 = this.$appUserID;
        boolean z10 = this.$isRestore;
        boolean access$getFinishTransactions = this.this$0.getFinishTransactions();
        Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
        ReceiptInfo receiptInfo = this.$receiptInfo;
        String str3 = this.$storeUserID;
        String str4 = this.$marketplace;
        PostReceiptInitiationSource postReceiptInitiationSource = this.$initiationSource;
        PaywallEvent paywallEvent = this.$presentedPaywall;
        PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsRelease = paywallEvent != null ? paywallEvent.toPaywallPostReceiptData$purchases_defaultsRelease() : null;
        final PostReceiptHelper postReceiptHelper = this.this$0;
        final String str5 = this.$appUserID;
        final C6798l lVar = this.$onSuccess;
        AnonymousClass1 r42 = new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PostReceiptResponse) obj);
                return C6514M.f71813a;
            }

            public final void invoke(PostReceiptResponse postReceiptResponse) {
                C6496s.h(postReceiptResponse, "postReceiptResponse");
                postReceiptHelper.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                postReceiptHelper.subscriberAttributesManager.markAsSynced(str5, map2, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                postReceiptHelper.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                lVar.invoke(postReceiptResponse);
            }
        };
        final PaywallEvent paywallEvent2 = this.$presentedPaywall;
        final PostReceiptHelper postReceiptHelper2 = this.this$0;
        String str6 = this.$appUserID;
        PostReceiptInitiationSource postReceiptInitiationSource2 = postReceiptInitiationSource;
        final q qVar = this.$onError;
        AnonymousClass1 r20 = r42;
        final String str7 = str6;
        final Map<String, SubscriberAttribute> map3 = map;
        access$getBackend$p.postReceiptData(str, str2, z10, access$getFinishTransactions, backendMap, receiptInfo, str3, str4, postReceiptInitiationSource2, paywallPostReceiptData$purchases_defaultsRelease, r20, new q() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                C6496s.h(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
                PaywallEvent paywallEvent = paywallEvent2;
                if (paywallEvent != null) {
                    postReceiptHelper2.paywallPresentedCache.cachePresentedPaywall(paywallEvent);
                }
                if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    postReceiptHelper2.subscriberAttributesManager.markAsSynced(str7, map3, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                qVar.invoke(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            }
        });
    }
}

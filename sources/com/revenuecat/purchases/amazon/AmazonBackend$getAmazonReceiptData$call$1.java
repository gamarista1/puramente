package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;
import yf.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBackend$getAmazonReceiptData$call$1 extends C6498u implements C6787a {
    final /* synthetic */ List<String> $cacheKey;
    final /* synthetic */ String $receiptId;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ AmazonBackend this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    public final void invoke() {
        BackendHelper access$getBackendHelper$p = this.this$0.backendHelper;
        Endpoint.GetAmazonReceipt getAmazonReceipt = new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId);
        Delay delay = Delay.NONE;
        final AmazonBackend amazonBackend = this.this$0;
        final List<String> list = this.$cacheKey;
        AnonymousClass1 r62 = new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError) {
                List<Pair> remove;
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                AmazonBackend amazonBackend = amazonBackend;
                List<String> list = list;
                synchronized (amazonBackend) {
                    remove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
                }
                if (remove != null) {
                    for (Pair b10 : remove) {
                        ((C6798l) b10.b()).invoke(purchasesError);
                    }
                }
            }
        };
        final AmazonBackend amazonBackend2 = this.this$0;
        final List<String> list2 = this.$cacheKey;
        access$getBackendHelper$p.performRequest(getAmazonReceipt, (Map<String, ? extends Object>) null, (List<Pair<String, String>>) null, delay, r62, new q() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) {
                List<Pair> remove;
                C6496s.h(jSONObject, "body");
                AmazonBackend amazonBackend = amazonBackend2;
                List<String> list = list2;
                synchronized (amazonBackend) {
                    remove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
                }
                if (remove != null) {
                    for (Pair pair : remove) {
                        C6798l lVar = (C6798l) pair.a();
                        C6798l lVar2 = (C6798l) pair.b();
                        if (purchasesError != null) {
                            lVar2.invoke(purchasesError);
                        } else {
                            lVar.invoke(jSONObject);
                        }
                    }
                }
            }
        });
    }
}

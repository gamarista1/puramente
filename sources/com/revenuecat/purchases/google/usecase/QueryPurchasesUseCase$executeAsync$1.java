package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3194a;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class QueryPurchasesUseCase$executeAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ QueryPurchasesUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueryPurchasesUseCase$executeAsync$1(QueryPurchasesUseCase queryPurchasesUseCase) {
        super(1);
        this.this$0 = queryPurchasesUseCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6496s.h(aVar, "$this$invoke");
        final QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
        queryPurchasesUseCase.querySubscriptions(new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, StoreTransaction>) (Map) obj);
                return C6514M.f71813a;
            }

            public final void invoke(final Map<String, StoreTransaction> map) {
                C6496s.h(map, "activeSubs");
                final QueryPurchasesUseCase queryPurchasesUseCase = queryPurchasesUseCase;
                queryPurchasesUseCase.queryInApps(new C6798l() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Map<String, StoreTransaction>) (Map) obj);
                        return C6514M.f71813a;
                    }

                    public final void invoke(Map<String, StoreTransaction> map) {
                        C6496s.h(map, "unconsumedInApps");
                        queryPurchasesUseCase.onOk((Map<String, StoreTransaction>) O.p(map, map));
                    }
                }, queryPurchasesUseCase.getOnError());
            }
        }, this.this$0.getOnError());
    }
}

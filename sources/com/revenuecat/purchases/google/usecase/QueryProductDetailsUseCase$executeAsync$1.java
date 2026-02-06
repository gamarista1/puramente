package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3202i;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class QueryProductDetailsUseCase$executeAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ Set<String> $nonEmptyProductIds;
    final /* synthetic */ QueryProductDetailsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueryProductDetailsUseCase$executeAsync$1(QueryProductDetailsUseCase queryProductDetailsUseCase, Set<String> set) {
        super(1);
        this.this$0 = queryProductDetailsUseCase;
        this.$nonEmptyProductIds = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6496s.h(aVar, "$this$invoke");
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(this.this$0.useCaseParams.getProductType());
        if (googleProductType == null) {
            googleProductType = "inapp";
        }
        C3202i buildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
        QueryProductDetailsUseCase queryProductDetailsUseCase = this.this$0;
        queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(aVar, googleProductType, buildQueryProductDetailsParams, new e(queryProductDetailsUseCase));
    }
}

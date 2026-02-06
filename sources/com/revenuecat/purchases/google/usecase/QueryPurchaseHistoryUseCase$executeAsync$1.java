package com.revenuecat.purchases.google.usecase;

import J4.C3048n;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Llf/M;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class QueryPurchaseHistoryUseCase$executeAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ QueryPurchaseHistoryUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueryPurchaseHistoryUseCase$executeAsync$1(QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase) {
        super(1);
        this.this$0 = queryPurchaseHistoryUseCase;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, C3198e eVar, List list) {
        C6496s.h(atomicBoolean, "$hasResponded");
        C6496s.h(queryPurchaseHistoryUseCase, "this$0");
        C6496s.h(date, "$requestStartTime");
        C6496s.h(eVar, "billingResult");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return;
        }
        queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCase.useCaseParams.getProductType(), eVar, date);
        BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, eVar, list, (C6798l) null, (C6798l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3194a) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3194a aVar) {
        C6514M m10;
        C6496s.h(aVar, "$this$invoke");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Date now = this.this$0.useCaseParams.getDateProvider().getNow();
        C3048n buildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(this.this$0.useCaseParams.getProductType());
        if (buildQueryPurchaseHistoryParams != null) {
            aVar.j(buildQueryPurchaseHistoryParams, new f(atomicBoolean, this.this$0, now));
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = this.this$0;
            String format = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
            C3198e a10 = C3198e.c().c(5).a();
            C6496s.g(a10, "newBuilder()\n           …                 .build()");
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, a10, (Object) null, (C6798l) null, (C6798l) null, 12, (Object) null);
        }
    }
}

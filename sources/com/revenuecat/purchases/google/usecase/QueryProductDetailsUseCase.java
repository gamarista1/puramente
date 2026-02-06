package com.revenuecat.purchases.google.usecase;

import J4.C3044j;
import Tg.a;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.android.billingclient.api.C3201h;
import com.android.billingclient.api.C3202i;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0006\u0012*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b.\u0010-R/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/android/billingclient/api/h;", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Llf/M;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "billingClient", "", "productType", "Lcom/android/billingclient/api/i;", "params", "LJ4/j;", "listener", "queryProductDetailsAsyncEnsuringOneResponse", "(Lcom/android/billingclient/api/a;Ljava/lang/String;Lcom/android/billingclient/api/i;LJ4/j;)V", "Lcom/android/billingclient/api/e;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lyf/l;", "getOnReceive", "()Lyf/l;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends C3201h>> {
    private final C6798l onError;
    private final C6798l onReceive;
    /* access modifiers changed from: private */
    public final QueryProductDetailsUseCaseParams useCaseParams;
    private final C6798l withConnectedClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(queryProductDetailsUseCaseParams, lVar2, pVar);
        C6496s.h(queryProductDetailsUseCaseParams, "useCaseParams");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryProductDetailsUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(C3194a aVar, String str, C3202i iVar, C3044j jVar) {
        aVar.i(iVar, new d(new AtomicBoolean(false), this, str, this.useCaseParams.getDateProvider().getNow(), jVar));
    }

    /* access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, String str, Date date, C3044j jVar, C3198e eVar, List list) {
        C6496s.h(atomicBoolean, "$hasResponded");
        C6496s.h(queryProductDetailsUseCase, "this$0");
        C6496s.h(str, "$productType");
        C6496s.h(date, "$requestStartTime");
        C6496s.h(jVar, "$listener");
        C6496s.h(eVar, "billingResult");
        C6496s.h(list, "productDetailsList");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return;
        }
        queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(str, eVar, date);
        jVar.a(eVar, list);
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String str, C3198e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int b10 = eVar.b();
            String a10 = eVar.a();
            C6496s.g(a10, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m54trackGoogleQueryProductDetailsRequestWn2Vu4Y(str, b10, a10, DurationExtensionsKt.between(a.f65168b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    public void executeAsync() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.useCaseParams.getProductIds()) {
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        Set j12 = C6565s.j1(arrayList);
        if (j12.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            this.onReceive.invoke(C6565s.n());
            return;
        }
        this.withConnectedClient.invoke(new QueryProductDetailsUseCase$executeAsync$1(this, j12));
    }

    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final C6798l getOnError() {
        return this.onError;
    }

    public final C6798l getOnReceive() {
        return this.onReceive;
    }

    public final C6798l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(List<C3201h> list) {
        C6496s.h(list, MetricTracker.Action.RECEIVED);
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{C6565s.x0(this.useCaseParams.getProductIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        LogIntent logIntent2 = LogIntent.PURCHASE;
        String format2 = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{C6565s.x0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, QueryProductDetailsUseCase$onOk$1.INSTANCE, 31, (Object) null)}, 1));
        C6496s.g(format2, "format(this, *args)");
        LogWrapperKt.log(logIntent2, format2);
        List<C3201h> list2 = !list.isEmpty() ? list : null;
        if (list2 != null) {
            for (C3201h hVar : list2) {
                LogIntent logIntent3 = LogIntent.PURCHASE;
                String format3 = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{hVar.d(), hVar}, 2));
                C6496s.g(format3, "format(this, *args)");
                LogWrapperKt.log(logIntent3, format3);
            }
        }
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(list));
    }
}

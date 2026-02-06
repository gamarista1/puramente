package com.revenuecat.purchases.google.usecase;

import Ef.m;
import J4.C3046l;
import J4.o;
import Tg.a;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b/\u0010.R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b0\u0010.R\u0014\u00103\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "billingClient", "productType", "LJ4/o;", "queryParams", "LJ4/l;", "listener", "queryPurchasesAsyncWithTrackingEnsuringOneResponse", "(Lcom/android/billingclient/api/a;Ljava/lang/String;LJ4/o;LJ4/l;)V", "Lcom/android/billingclient/api/e;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchasesRequestIfNeeded", "(Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/Date;)V", "", "Lcom/android/billingclient/api/Purchase;", "toMapOfGooglePurchaseWrapper", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "Lyf/l;", "getOnSuccess", "()Lyf/l;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final C6798l onError;
    private final C6798l onSuccess;
    /* access modifiers changed from: private */
    public final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final C6798l withConnectedClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(queryPurchasesByTypeUseCaseParams, lVar2, pVar);
        C6496s.h(queryPurchasesByTypeUseCaseParams, "useCaseParams");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesByTypeUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(C3194a aVar, String str, o oVar, C3046l lVar) {
        aVar.k(oVar, new g(new AtomicBoolean(false), this, str, this.useCaseParams.getDateProvider().getNow(), lVar));
    }

    /* access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, C3046l lVar, C3198e eVar, List list) {
        C6496s.h(atomicBoolean, "$hasResponded");
        C6496s.h(queryPurchasesByTypeUseCase, "this$0");
        C6496s.h(str, "$productType");
        C6496s.h(date, "$requestStartTime");
        C6496s.h(lVar, "$listener");
        C6496s.h(eVar, "billingResult");
        C6496s.h(list, "purchases");
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(eVar.b())}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return;
        }
        queryPurchasesByTypeUseCase.trackGoogleQueryPurchasesRequestIfNeeded(str, eVar, date);
        lVar.a(eVar, list);
    }

    /* access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        Iterable<Purchase> iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (Purchase purchase : iterable) {
            String f10 = purchase.f();
            C6496s.g(f10, "purchase.purchaseToken");
            Pair a10 = C6502A.a(UtilsKt.sha1(f10), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), (PresentedOfferingContext) null, (String) null, (GoogleReplacementMode) null, 14, (Object) null));
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, C3198e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int b10 = eVar.b();
            String a10 = eVar.a();
            C6496s.g(a10, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m56trackGoogleQueryPurchasesRequestWn2Vu4Y(str, b10, a10, DurationExtensionsKt.between(a.f65168b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new QueryPurchasesByTypeUseCase$executeAsync$1(this));
    }

    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final C6798l getOnError() {
        return this.onError;
    }

    public final C6798l getOnSuccess() {
        return this.onSuccess;
    }

    public final C6798l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(Map<String, StoreTransaction> map) {
        C6496s.h(map, MetricTracker.Action.RECEIVED);
        this.onSuccess.invoke(map);
    }
}

package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.models.StoreTransaction;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\u00020\b2\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001a\u001a\u00020\b2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "onQueryInAppsSuccess", "onQueryInAppsError", "queryInApps", "(Lyf/l;Lyf/l;)V", "onQuerySubscriptionsSuccess", "onQuerySubscriptionsError", "querySubscriptions", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "Lyf/l;", "getOnSuccess", "()Lyf/l;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final C6798l onError;
    private final C6798l onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final C6798l withConnectedClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(queryPurchasesUseCaseParams, lVar2, pVar);
        C6496s.h(queryPurchasesUseCaseParams, "useCaseParams");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* access modifiers changed from: private */
    public final void queryInApps(C6798l lVar, C6798l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void querySubscriptions(C6798l lVar, C6798l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0, 1, (Object) null);
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new QueryPurchasesUseCase$executeAsync$1(this));
    }

    public String getErrorMessage() {
        return "Error when querying purchases";
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

package com.revenuecat.purchases.google.usecase;

import Tg.a;
import com.android.billingclient.api.C3198e;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0006\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R)\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010$R\u0014\u0010)\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Llf/M;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "", "productType", "Lcom/android/billingclient/api/e;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchaseHistoryRequestIfNeeded", "(Ljava/lang/String;Lcom/android/billingclient/api/e;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "Lyf/l;", "getOnReceive", "()Lyf/l;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final C6798l onError;
    private final C6798l onReceive;
    /* access modifiers changed from: private */
    public final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final C6798l withConnectedClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(queryPurchaseHistoryUseCaseParams, lVar2, pVar);
        C6496s.h(queryPurchaseHistoryUseCaseParams, "useCaseParams");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchaseHistoryUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    /* access modifiers changed from: private */
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, C3198e eVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int b10 = eVar.b();
            String a10 = eVar.a();
            C6496s.g(a10, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m55trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(str, b10, a10, DurationExtensionsKt.between(a.f65168b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new QueryPurchaseHistoryUseCase$executeAsync$1(this));
    }

    public String getErrorMessage() {
        return "Error receiving purchase history";
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

    public void onOk(List<? extends PurchaseHistoryRecord> list) {
        Collection collection = list;
        C6514M m10 = null;
        List<? extends PurchaseHistoryRecord> list2 = (collection == null || collection.isEmpty()) ? null : list;
        if (list2 != null) {
            for (PurchaseHistoryRecord humanReadableDescription : list2) {
                LogIntent logIntent = LogIntent.RC_PURCHASE_SUCCESS;
                String format = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription(humanReadableDescription)}, 1));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(logIntent, format);
            }
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        C6798l lVar = this.onReceive;
        if (list == null) {
            list = C6565s.n();
        }
        lVar.invoke(list);
    }
}

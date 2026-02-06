package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yf.q;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/common/BackendHelper$performRequest$1", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackendHelper$performRequest$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map<String, Object> $body;
    final /* synthetic */ Endpoint $endpoint;
    final /* synthetic */ q $onCompleted;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ List<Pair<String, String>> $postFieldsToSign;
    final /* synthetic */ BackendHelper this$0;

    BackendHelper$performRequest$1(BackendHelper backendHelper, Endpoint endpoint, Map<String, ? extends Object> map, List<Pair<String, String>> list, C6798l lVar, q qVar) {
        this.this$0 = backendHelper;
        this.$endpoint = endpoint;
        this.$body = map;
        this.$postFieldsToSign = list;
        this.$onError = lVar;
        this.$onCompleted = qVar;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), this.$endpoint, this.$body, this.$postFieldsToSign, this.this$0.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, (Object) null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        PurchasesError purchasesError;
        C6496s.h(hTTPResult, "result");
        if (!BackendHelperKt.isSuccessful(hTTPResult)) {
            purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
            LogUtilsKt.errorLog(purchasesError);
        } else {
            purchasesError = null;
        }
        this.$onCompleted.invoke(purchasesError, Integer.valueOf(hTTPResult.getResponseCode()), hTTPResult.getBody());
    }

    public void onError(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onError.invoke(purchasesError);
    }
}

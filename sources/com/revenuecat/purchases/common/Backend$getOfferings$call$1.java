package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import org.json.JSONException;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/common/Backend$getOfferings$call$1", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend$getOfferings$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ BackgroundAwareCallbackCacheKey $cacheKey;
    final /* synthetic */ Endpoint.GetOfferings $endpoint;
    final /* synthetic */ Backend this$0;

    Backend$getOfferings$call$1(Backend backend, Endpoint.GetOfferings getOfferings, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey) {
        this.this$0 = backend;
        this.$endpoint = getOfferings;
        this.$cacheKey = backgroundAwareCallbackCacheKey;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), this.$endpoint, (Map) null, (List) null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, (Object) null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<Pair> remove;
        C6496s.h(hTTPResult, "result");
        Backend backend = this.this$0;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = this.$cacheKey;
        synchronized (backend) {
            remove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (remove != null) {
            for (Pair pair : remove) {
                C6798l lVar = (C6798l) pair.a();
                p pVar = (p) pair.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    try {
                        lVar.invoke(hTTPResult.getBody());
                    } catch (JSONException e10) {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e10);
                        LogUtilsKt.errorLog(purchasesError);
                        pVar.invoke(purchasesError, Boolean.FALSE);
                    }
                } else {
                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError2);
                    pVar.invoke(purchasesError2, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List<Pair> remove;
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        Backend backend = this.this$0;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = this.$cacheKey;
        synchronized (backend) {
            remove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (remove != null) {
            for (Pair b10 : remove) {
                ((p) b10.b()).invoke(purchasesError, Boolean.FALSE);
            }
        }
    }
}

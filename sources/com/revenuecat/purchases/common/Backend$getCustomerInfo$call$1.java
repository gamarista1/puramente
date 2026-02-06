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

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/common/Backend$getCustomerInfo$call$1", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "result", "Llf/M;", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend$getCustomerInfo$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ BackgroundAwareCallbackCacheKey $cacheKey;
    final /* synthetic */ Endpoint.GetCustomerInfo $endpoint;
    final /* synthetic */ Backend this$0;

    Backend$getCustomerInfo$call$1(Backend backend, Endpoint.GetCustomerInfo getCustomerInfo, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey) {
        this.this$0 = backend;
        this.$endpoint = getCustomerInfo;
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
            remove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (remove != null) {
            for (Pair pair : remove) {
                C6798l lVar = (C6798l) pair.a();
                p pVar = (p) pair.b();
                try {
                    if (BackendHelperKt.isSuccessful(hTTPResult)) {
                        lVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult));
                    } else {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                        LogUtilsKt.errorLog(purchasesError);
                        pVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                    }
                } catch (JSONException e10) {
                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e10);
                    LogUtilsKt.errorLog(purchasesError2);
                    pVar.invoke(purchasesError2, Boolean.FALSE);
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
            remove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (remove != null) {
            for (Pair b10 : remove) {
                ((p) b10.b()).invoke(purchasesError, Boolean.FALSE);
            }
        }
    }
}

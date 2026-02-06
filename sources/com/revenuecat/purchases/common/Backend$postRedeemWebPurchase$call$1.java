package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/common/Backend$postRedeemWebPurchase$call$1", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend$postRedeemWebPurchase$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ Endpoint.PostRedeemWebPurchase $endpoint;
    final /* synthetic */ String $path;
    final /* synthetic */ Backend this$0;

    Backend$postRedeemWebPurchase$call$1(Backend backend, Endpoint.PostRedeemWebPurchase postRedeemWebPurchase, Map<String, String> map, String str) {
        this.this$0 = backend;
        this.$endpoint = postRedeemWebPurchase;
        this.$body = map;
        this.$path = str;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), this.$endpoint, this.$body, (List) null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, (Object) null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<C6798l> remove;
        String str;
        C6496s.h(hTTPResult, "result");
        Backend backend = this.this$0;
        String str2 = this.$path;
        synchronized (backend) {
            remove = backend.getRedeemWebPurchaseCallbacks().remove(str2);
        }
        if (remove != null) {
            for (C6798l lVar : remove) {
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    lVar.invoke(new RedeemWebPurchaseListener.Result.Success(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult)));
                } else {
                    Integer backendErrorCode = hTTPResult.getBackendErrorCode();
                    int value = BackendErrorCode.BackendInvalidWebRedemptionToken.getValue();
                    if (backendErrorCode != null && backendErrorCode.intValue() == value) {
                        lVar.invoke(RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE);
                    } else {
                        int value2 = BackendErrorCode.BackendExpiredWebRedemptionToken.getValue();
                        if (backendErrorCode != null && backendErrorCode.intValue() == value2) {
                            JSONObject body = hTTPResult.getBody();
                            JSONObject optJSONObject = body.optJSONObject("purchase_redemption_error_info");
                            if (optJSONObject != null) {
                                str = optJSONObject.optString("obfuscated_email");
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                LogUtilsKt.errorLog$default("Error parsing expired redemption token response: " + body, (Throwable) null, 2, (Object) null);
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult)));
                            } else {
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Expired(str));
                            }
                        } else {
                            int value3 = BackendErrorCode.BackendPurchaseBelongsToOtherUser.getValue();
                            if (backendErrorCode != null && backendErrorCode.intValue() == value3) {
                                lVar.invoke(RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE);
                            } else {
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult)));
                            }
                        }
                    }
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List<C6798l> remove;
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        Backend backend = this.this$0;
        String str = this.$path;
        synchronized (backend) {
            remove = backend.getRedeemWebPurchaseCallbacks().remove(str);
        }
        if (remove != null) {
            for (C6798l invoke : remove) {
                invoke.invoke(new RedeemWebPurchaseListener.Result.Error(purchasesError));
            }
        }
    }
}

package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/common/Backend$logIn$call$1", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend$logIn$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<String> $cacheKey;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ Backend this$0;

    Backend$logIn$call$1(String str, String str2, Backend backend, List<String> list) {
        this.$appUserID = str;
        this.$newAppUserID = str2;
        this.this$0 = backend;
        this.$cacheKey = list;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, O.l(C6502A.a("app_user_id", this.$appUserID), C6502A.a("new_app_user_id", this.$newAppUserID)), C6565s.q(C6502A.a("app_user_id", this.$appUserID), C6502A.a("new_app_user_id", this.$newAppUserID)), this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), false, 32, (Object) null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<Pair> remove;
        boolean z10;
        C6496s.h(hTTPResult, "result");
        if (BackendHelperKt.isSuccessful(hTTPResult)) {
            Backend backend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (backend) {
                remove = backend.getIdentifyCallbacks().remove(list);
            }
            if (remove != null) {
                for (Pair pair : remove) {
                    p pVar = (p) pair.a();
                    C6798l lVar = (C6798l) pair.b();
                    if (hTTPResult.getResponseCode() == 201) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hTTPResult.getBody().length() > 0) {
                        pVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult), Boolean.valueOf(z10));
                    } else {
                        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, (String) null, 2, (DefaultConstructorMarker) null);
                        LogUtilsKt.errorLog(purchasesError);
                        lVar.invoke(purchasesError);
                    }
                }
                return;
            }
            return;
        }
        PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
        LogUtilsKt.errorLog(purchasesError2);
        onError(purchasesError2);
    }

    public void onError(PurchasesError purchasesError) {
        List<Pair> remove;
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        Backend backend = this.this$0;
        List<String> list = this.$cacheKey;
        synchronized (backend) {
            remove = backend.getIdentifyCallbacks().remove(list);
        }
        if (remove != null) {
            for (Pair b10 : remove) {
                ((C6798l) b10.b()).invoke(purchasesError);
            }
        }
    }
}

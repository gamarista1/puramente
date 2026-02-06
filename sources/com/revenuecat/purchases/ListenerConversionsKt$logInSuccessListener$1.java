package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.LogInCallback;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/ListenerConversionsKt$logInSuccessListener$1", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Llf/M;", "onReceived", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsKt$logInSuccessListener$1 implements LogInCallback {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ p $onSuccess;

    ListenerConversionsKt$logInSuccessListener$1(p pVar, C6798l lVar) {
        this.$onSuccess = pVar;
        this.$onError = lVar;
    }

    public void onError(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        C6798l lVar = this.$onError;
        if (lVar != null) {
            C6514M m10 = (C6514M) lVar.invoke(purchasesError);
        }
    }

    public void onReceived(CustomerInfo customerInfo, boolean z10) {
        C6496s.h(customerInfo, "customerInfo");
        p pVar = this.$onSuccess;
        if (pVar != null) {
            C6514M m10 = (C6514M) pVar.invoke(customerInfo, Boolean.valueOf(z10));
        }
    }
}

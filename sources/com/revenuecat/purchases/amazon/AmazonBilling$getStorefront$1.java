package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$getStorefront$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$getStorefront$1(AmazonBilling amazonBilling, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            UserDataResponseListener access$getUserDataHandler$p = this.this$0.userDataHandler;
            final AmazonBilling amazonBilling = this.this$0;
            final C6798l lVar = this.$onSuccess;
            final C6798l lVar2 = this.$onError;
            AnonymousClass1 r02 = new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserData) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(UserData userData) {
                    C6496s.h(userData, "userData");
                    String marketplace = userData.getMarketplace();
                    if (marketplace == null) {
                        lVar2.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                    } else {
                        lVar.invoke(marketplace);
                    }
                }
            };
            final C6798l lVar3 = this.$onError;
            access$getUserDataHandler$p.getUserData(r02, new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(PurchasesError purchasesError) {
                    C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                    String format = String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{purchasesError}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
                    lVar3.invoke(purchasesError);
                }
            });
            return;
        }
        String format = String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        this.$onError.invoke(purchasesError);
    }
}

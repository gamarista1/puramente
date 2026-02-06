package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerInfoHelper$getCustomerInfoFetchOnly$2 extends C6498u implements p {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ CustomerInfoHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfoHelper$getCustomerInfoFetchOnly$2(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.this$0 = customerInfoHelper;
        this.$appUserID = str;
        this.$callback = receiveCustomerInfoCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(final PurchasesError purchasesError, boolean z10) {
        C6496s.h(purchasesError, "backendError");
        String format = String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        this.this$0.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
        if (this.this$0.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z10, this.$appUserID)) {
            OfflineEntitlementsManager access$getOfflineEntitlementsManager$p = this.this$0.offlineEntitlementsManager;
            String str = this.$appUserID;
            final CustomerInfoHelper customerInfoHelper = this.this$0;
            final ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            AnonymousClass1 r12 = new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CustomerInfo) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(final CustomerInfo customerInfo) {
                    C6496s.h(customerInfo, "offlineComputedCustomerInfo");
                    customerInfoHelper.customerInfoUpdateHandler.notifyListeners(customerInfo);
                    CustomerInfoHelper customerInfoHelper = customerInfoHelper;
                    final ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback;
                    customerInfoHelper.dispatch(new C6787a() {
                        public final void invoke() {
                            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback;
                            if (receiveCustomerInfoCallback != null) {
                                receiveCustomerInfoCallback.onReceived(customerInfo);
                            }
                        }
                    });
                }
            };
            final CustomerInfoHelper customerInfoHelper2 = this.this$0;
            final ReceiveCustomerInfoCallback receiveCustomerInfoCallback2 = this.$callback;
            access$getOfflineEntitlementsManager$p.calculateAndCacheOfflineCustomerInfo(str, r12, new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(PurchasesError purchasesError) {
                    C6496s.h(purchasesError, "it");
                    CustomerInfoHelper customerInfoHelper = customerInfoHelper2;
                    final ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback2;
                    final PurchasesError purchasesError2 = purchasesError;
                    customerInfoHelper.dispatch(new C6787a() {
                        public final void invoke() {
                            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback;
                            if (receiveCustomerInfoCallback != null) {
                                receiveCustomerInfoCallback.onError(purchasesError2);
                            }
                        }
                    });
                }
            });
            return;
        }
        CustomerInfoHelper customerInfoHelper3 = this.this$0;
        final ReceiveCustomerInfoCallback receiveCustomerInfoCallback3 = this.$callback;
        customerInfoHelper3.dispatch(new C6787a() {
            public final void invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback3;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                }
            }
        });
    }
}

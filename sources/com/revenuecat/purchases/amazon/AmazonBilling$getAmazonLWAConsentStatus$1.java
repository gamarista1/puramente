package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
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
import lf.C6535s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$getAmazonLWAConsentStatus$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$getAmazonLWAConsentStatus$1(AmazonBilling amazonBilling, C6798l lVar, C6798l lVar2) {
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

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                    static {
                        /*
                            com.amazon.device.iap.model.LWAConsentStatus[] r0 = com.amazon.device.iap.model.LWAConsentStatus.values()
                            int r0 = r0.length
                            int[] r0 = new int[r0]
                            com.amazon.device.iap.model.LWAConsentStatus r1 = com.amazon.device.iap.model.LWAConsentStatus.CONSENTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                            r2 = 1
                            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                        L_0x0010:
                            com.amazon.device.iap.model.LWAConsentStatus r1 = com.amazon.device.iap.model.LWAConsentStatus.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                            r2 = 2
                            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                        L_0x0019:
                            $EnumSwitchMapping$0 = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.AmazonBilling$getAmazonLWAConsentStatus$1.AnonymousClass1.WhenMappings.<clinit>():void");
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserData) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(UserData userData) {
                    AmazonLWAConsentStatus amazonLWAConsentStatus;
                    C6496s.h(userData, "userData");
                    LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                    if (lWAConsentStatus == null) {
                        lVar2.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_LWA_CONSENT_STATUS_NULL_STORE_PROBLEM));
                        return;
                    }
                    C6798l lVar = lVar;
                    int i10 = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                    if (i10 == 1) {
                        amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                    } else if (i10 == 2) {
                        amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                    } else {
                        throw new C6535s();
                    }
                    lVar.invoke(amazonLWAConsentStatus);
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
                    String format = String.format(BillingStrings.BILLING_AMAZON_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
                    lVar3.invoke(purchasesError);
                }
            });
            return;
        }
        String format = String.format(BillingStrings.BILLING_CONNECTION_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        this.$onError.invoke(purchasesError);
    }
}

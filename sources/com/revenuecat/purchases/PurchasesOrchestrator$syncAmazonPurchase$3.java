package com.revenuecat.purchases;

import Sg.p;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.PurchaseStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "normalizedProductID", "Llf/M;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$syncAmazonPurchase$3 extends C6498u implements C6798l {
    final /* synthetic */ String $amazonUserID;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ String $isoCurrencyCode;
    final /* synthetic */ Double $price;
    final /* synthetic */ String $receiptID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$syncAmazonPurchase$3(Double d10, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
        super(1);
        this.$price = d10;
        this.$isoCurrencyCode = str;
        this.this$0 = purchasesOrchestrator;
        this.$receiptID = str2;
        this.$amazonUserID = str3;
        this.$appUserID = str4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C6514M.f71813a;
    }

    public final void invoke(String str) {
        C6496s.h(str, "normalizedProductID");
        List e10 = C6565s.e(str);
        Double d10 = this.$price;
        Double d11 = (d10 == null || d10.doubleValue() == 0.0d) ? null : d10;
        String str2 = this.$isoCurrencyCode;
        ReceiptInfo receiptInfo = new ReceiptInfo(e10, (PresentedOfferingContext) null, (String) null, (StoreProduct) null, d11, (str2 == null || p.d0(str2)) ? null : str2, (ReplacementMode) null, 78, (DefaultConstructorMarker) null);
        PostReceiptHelper access$getPostReceiptHelper$p = this.this$0.postReceiptHelper;
        String str3 = this.$receiptID;
        String str4 = this.$amazonUserID;
        boolean allowSharingPlayStoreAccount = this.this$0.getAllowSharingPlayStoreAccount();
        String str5 = this.$appUserID;
        PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
        final String str6 = this.$receiptID;
        final String str7 = this.$amazonUserID;
        AnonymousClass1 r12 = new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C6514M.f71813a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                C6496s.h(customerInfo, "it");
                String format = String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{str6, str7}, 2));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(LogIntent.PURCHASE, format);
            }
        };
        final String str8 = this.$receiptID;
        final String str9 = this.$amazonUserID;
        access$getPostReceiptHelper$p.postTokenWithoutConsuming(str3, str4, receiptInfo, allowSharingPlayStoreAccount, str5, (String) null, postReceiptInitiationSource, r12, new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C6514M.f71813a;
            }

            public final void invoke(PurchasesError purchasesError) {
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                String format = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{str8, str9, purchasesError}, 3));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(LogIntent.RC_ERROR, format);
            }
        });
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SyncPurchasesHelper$syncPurchases$1 extends C6498u implements C6798l {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SyncPurchasesHelper$syncPurchases$1(SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$isRestore = z11;
        this.$onSuccess = lVar;
        this.$onError = lVar2;
    }

    /* access modifiers changed from: private */
    public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, C6798l lVar, C6798l lVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
        if (!C6496s.c(storeTransaction, storeTransaction2)) {
            return;
        }
        if (list.isEmpty()) {
            LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
            syncPurchasesHelper.retrieveCustomerInfo(str, z10, z11, lVar, lVar2);
            return;
        }
        String format = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        lVar2.invoke(C6565s.o0(list));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<StoreTransaction>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<StoreTransaction> list) {
        List<StoreTransaction> list2 = list;
        C6496s.h(list2, "allPurchases");
        if (!list2.isEmpty()) {
            StoreTransaction storeTransaction = (StoreTransaction) C6565s.z0(list);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = this.this$0;
            boolean z10 = this.$isRestore;
            String str = this.$appUserID;
            boolean z11 = this.$appInBackground;
            C6798l lVar = this.$onSuccess;
            C6798l lVar2 = this.$onError;
            for (StoreTransaction storeTransaction2 : list2) {
                ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), (PresentedOfferingContext) null, (String) null, (StoreProduct) null, (Double) null, (String) null, (ReplacementMode) null, 126, (DefaultConstructorMarker) null);
                PostReceiptHelper access$getPostReceiptHelper$p = syncPurchasesHelper.postReceiptHelper;
                String purchaseToken = storeTransaction2.getPurchaseToken();
                String storeUserID = storeTransaction2.getStoreUserID();
                String marketplace = storeTransaction2.getMarketplace();
                PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
                StoreTransaction storeTransaction3 = storeTransaction2;
                SyncPurchasesHelper syncPurchasesHelper2 = syncPurchasesHelper;
                String str2 = str;
                C6798l lVar3 = lVar2;
                boolean z12 = z11;
                C6798l lVar4 = lVar;
                boolean z13 = z10;
                boolean z14 = z11;
                C6798l lVar5 = lVar4;
                String str3 = str;
                C6798l lVar6 = lVar3;
                SyncPurchasesHelper$syncPurchases$1$1$1 syncPurchasesHelper$syncPurchases$1$1$1 = new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction3, storeTransaction, arrayList, syncPurchasesHelper2, str2, z12, z13, lVar5, lVar6);
                String str4 = str3;
                access$getPostReceiptHelper$p.postTokenWithoutConsuming(purchaseToken, storeUserID, receiptInfo, z10, str4, marketplace, postReceiptInitiationSource, syncPurchasesHelper$syncPurchases$1$1$1, new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction3, arrayList, storeTransaction, syncPurchasesHelper2, str4, z14, z13, lVar5, lVar6));
                lVar2 = lVar3;
                lVar = lVar4;
                z11 = z14;
                str = str3;
            }
            return;
        }
        this.this$0.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
    }
}

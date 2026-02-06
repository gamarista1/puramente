package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"finishTransactions", "", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getFinishTransactions", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchasesAreCompletedByKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.revenuecat.purchases.PurchasesAreCompletedBy[] r0 = com.revenuecat.purchases.PurchasesAreCompletedBy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesAreCompletedByKt.WhenMappings.<clinit>():void");
        }
    }

    public static final boolean getFinishTransactions(PurchasesAreCompletedBy purchasesAreCompletedBy) {
        C6496s.h(purchasesAreCompletedBy, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new C6535s();
    }
}

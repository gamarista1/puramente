package com.revenuecat.purchases;

import Sg.p;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0019J\b\u0010/\u001a\u00020\u0003H\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010-\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001f¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/SubscriptionInfo;", "", "productIdentifier", "", "requestDate", "Ljava/util/Date;", "response", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "(Ljava/lang/String;Ljava/util/Date;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;)V", "purchaseDate", "originalPurchaseDate", "expiresDate", "store", "Lcom/revenuecat/purchases/Store;", "unsubscribeDetectedAt", "isSandbox", "", "billingIssuesDetectedAt", "gracePeriodExpiresDate", "ownershipType", "Lcom/revenuecat/purchases/OwnershipType;", "periodType", "Lcom/revenuecat/purchases/PeriodType;", "refundedAt", "storeTransactionId", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "getBillingIssuesDetectedAt", "()Ljava/util/Date;", "getExpiresDate", "getGracePeriodExpiresDate", "isActive", "()Z", "getOriginalPurchaseDate", "getOwnershipType", "()Lcom/revenuecat/purchases/OwnershipType;", "getPeriodType", "()Lcom/revenuecat/purchases/PeriodType;", "getProductIdentifier", "()Ljava/lang/String;", "getPurchaseDate", "getRefundedAt", "getStore", "()Lcom/revenuecat/purchases/Store;", "getStoreTransactionId", "getUnsubscribeDetectedAt", "willRenew", "getWillRenew", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionInfo {
    private final Date billingIssuesDetectedAt;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isActive;
    private final boolean isSandbox;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Date requestDate;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;
    private final boolean willRenew;

    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store2, Date date4, boolean z10, Date date5, Date date6, OwnershipType ownershipType2, PeriodType periodType2, Date date7, String str2, Date date8) {
        String str3 = str;
        Date date9 = date;
        Store store3 = store2;
        OwnershipType ownershipType3 = ownershipType2;
        PeriodType periodType3 = periodType2;
        Date date10 = date8;
        C6496s.h(str3, "productIdentifier");
        C6496s.h(date9, b.f37459Q);
        C6496s.h(store3, ProductResponseJsonKeys.STORE);
        C6496s.h(ownershipType3, "ownershipType");
        C6496s.h(periodType3, "periodType");
        C6496s.h(date10, "requestDate");
        this.productIdentifier = str3;
        this.purchaseDate = date9;
        this.originalPurchaseDate = date2;
        this.expiresDate = date3;
        this.store = store3;
        this.unsubscribeDetectedAt = date4;
        this.isSandbox = z10;
        this.billingIssuesDetectedAt = date5;
        this.gracePeriodExpiresDate = date6;
        this.ownershipType = ownershipType3;
        this.periodType = periodType3;
        this.refundedAt = date7;
        this.storeTransactionId = str2;
        this.requestDate = date10;
        this.isActive = DateHelper.Companion.m127isDateActiveSxA4cEA$default(DateHelper.Companion, date3, date8, 0, 4, (Object) null).isActive();
        this.willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store2, date3, date4, date5, periodType3);
    }

    public final Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Date getRefundedAt() {
        return this.refundedAt;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return p.f("\n            SubscriptionInfo {\n                purchaseDate: " + this.purchaseDate + ",\n                originalPurchaseDate: " + this.originalPurchaseDate + ",\n                expiresDate: " + this.expiresDate + ",\n                store: " + this.store + ",\n                isSandbox: " + this.isSandbox + ",\n                unsubscribeDetectedAt: " + this.unsubscribeDetectedAt + ",\n                billingIssuesDetectedAt: " + this.billingIssuesDetectedAt + ",\n                gracePeriodExpiresDate: " + this.gracePeriodExpiresDate + ",\n                ownershipType: " + this.ownershipType + ",\n                periodType: " + this.periodType + ",\n                refundedAt: " + this.refundedAt + ",\n                storeTransactionId: " + this.storeTransactionId + ",\n                isActive: " + this.isActive + ",\n                willRenew: " + this.willRenew + "\n            }\n        ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store2, Date date4, boolean z10, Date date5, Date date6, OwnershipType ownershipType2, PeriodType periodType2, Date date7, String str2, Date date8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, date2, date3, store2, date4, z10, date5, date6, (i10 & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType2, periodType2, date7, str2, date8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscriptionInfo(java.lang.String r17, java.util.Date r18, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse r19) {
        /*
            r16 = this;
            java.lang.String r0 = "productIdentifier"
            r2 = r17
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "requestDate"
            r15 = r18
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "response"
            r1 = r19
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.util.Date r3 = r19.getPurchaseDate()
            java.util.Date r4 = r19.getOriginalPurchaseDate()
            java.util.Date r5 = r19.getExpiresDate()
            com.revenuecat.purchases.Store r6 = r19.getStore()
            boolean r8 = r19.isSandbox()
            java.util.Date r7 = r19.getUnsubscribeDetectedAt()
            java.util.Date r9 = r19.getBillingIssuesDetectedAt()
            java.util.Date r10 = r19.getGracePeriodExpiresDate()
            com.revenuecat.purchases.OwnershipType r11 = r19.getOwnershipType()
            com.revenuecat.purchases.PeriodType r12 = r19.getPeriodType()
            java.util.Date r13 = r19.getRefundedAt()
            java.lang.String r14 = r19.getStoreTransactionId()
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.SubscriptionInfo.<init>(java.lang.String, java.util.Date, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse):void");
    }
}

package com.revenuecat.purchases.common.responses;

import Sg.p;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.util.Date;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 H2\u00020\u0001:\u0002IHBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B©\u0001\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b\t\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010)\u001a\u0004\b5\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010%\u0012\u0004\b8\u0010)\u001a\u0004\b7\u0010'R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b:\u0010)\u001a\u0004\b9\u0010'R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010)\u001a\u0004\b<\u0010=R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\bB\u0010)\u001a\u0004\b@\u0010AR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010%\u0012\u0004\bD\u0010)\u001a\u0004\bC\u0010'R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010E\u0012\u0004\bG\u0010)\u001a\u0004\bF\u0010$¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "", "Ljava/util/Date;", "purchaseDate", "originalPurchaseDate", "expiresDate", "Lcom/revenuecat/purchases/Store;", "store", "", "isSandbox", "unsubscribeDetectedAt", "billingIssuesDetectedAt", "gracePeriodExpiresDate", "Lcom/revenuecat/purchases/OwnershipType;", "ownershipType", "Lcom/revenuecat/purchases/PeriodType;", "periodType", "refundedAt", "", "storeTransactionId", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;Ljh/d;Lih/f;)V", "toString", "()Ljava/lang/String;", "Ljava/util/Date;", "getPurchaseDate", "()Ljava/util/Date;", "getPurchaseDate$annotations", "()V", "getOriginalPurchaseDate", "getOriginalPurchaseDate$annotations", "getExpiresDate", "getExpiresDate$annotations", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "getStore$annotations", "Z", "()Z", "isSandbox$annotations", "getUnsubscribeDetectedAt", "getUnsubscribeDetectedAt$annotations", "getBillingIssuesDetectedAt", "getBillingIssuesDetectedAt$annotations", "getGracePeriodExpiresDate", "getGracePeriodExpiresDate$annotations", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "()Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType$annotations", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "()Lcom/revenuecat/purchases/PeriodType;", "getPeriodType$annotations", "getRefundedAt", "getRefundedAt$annotations", "Ljava/lang/String;", "getStoreTransactionId", "getStoreTransactionId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionInfoResponse {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, Store.Companion.serializer(), null, null, null, null, OwnershipType.Companion.serializer(), PeriodType.Companion.serializer(), null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Date billingIssuesDetectedAt;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isSandbox;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return SubscriptionInfoResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ SubscriptionInfoResponse(int i10, @C5985i(with = ISO8601DateSerializer.class) Date date, @C5985i(with = ISO8601DateSerializer.class) Date date2, @C5985i(with = ISO8601DateSerializer.class) Date date3, Store store2, boolean z10, @C5985i(with = ISO8601DateSerializer.class) Date date4, @C5985i(with = ISO8601DateSerializer.class) Date date5, @C5985i(with = ISO8601DateSerializer.class) Date date6, OwnershipType ownershipType2, PeriodType periodType2, @C5985i(with = ISO8601DateSerializer.class) Date date7, String str, t0 t0Var) {
        if (3839 != (i10 & 3839)) {
            C6456i0.a(i10, 3839, SubscriptionInfoResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.purchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expiresDate = date3;
        this.store = store2;
        this.isSandbox = z10;
        this.unsubscribeDetectedAt = date4;
        this.billingIssuesDetectedAt = date5;
        this.gracePeriodExpiresDate = date6;
        if ((i10 & 256) == 0) {
            this.ownershipType = OwnershipType.UNKNOWN;
        } else {
            this.ownershipType = ownershipType2;
        }
        this.periodType = periodType2;
        this.refundedAt = date7;
        this.storeTransactionId = str;
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getBillingIssuesDetectedAt$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getExpiresDate$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getGracePeriodExpiresDate$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getOriginalPurchaseDate$annotations() {
    }

    public static /* synthetic */ void getOwnershipType$annotations() {
    }

    public static /* synthetic */ void getPeriodType$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getPurchaseDate$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getRefundedAt$annotations() {
    }

    public static /* synthetic */ void getStore$annotations() {
    }

    public static /* synthetic */ void getStoreTransactionId$annotations() {
    }

    @C5985i(with = ISO8601DateSerializer.class)
    public static /* synthetic */ void getUnsubscribeDetectedAt$annotations() {
    }

    public static /* synthetic */ void isSandbox$annotations() {
    }

    public static final /* synthetic */ void write$Self(SubscriptionInfoResponse subscriptionInfoResponse, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        dVar.B(fVar, 0, iSO8601DateSerializer, subscriptionInfoResponse.purchaseDate);
        dVar.p(fVar, 1, iSO8601DateSerializer, subscriptionInfoResponse.originalPurchaseDate);
        dVar.p(fVar, 2, iSO8601DateSerializer, subscriptionInfoResponse.expiresDate);
        dVar.B(fVar, 3, bVarArr[3], subscriptionInfoResponse.store);
        dVar.A(fVar, 4, subscriptionInfoResponse.isSandbox);
        dVar.p(fVar, 5, iSO8601DateSerializer, subscriptionInfoResponse.unsubscribeDetectedAt);
        dVar.p(fVar, 6, iSO8601DateSerializer, subscriptionInfoResponse.billingIssuesDetectedAt);
        dVar.p(fVar, 7, iSO8601DateSerializer, subscriptionInfoResponse.gracePeriodExpiresDate);
        if (dVar.q(fVar, 8) || subscriptionInfoResponse.ownershipType != OwnershipType.UNKNOWN) {
            dVar.B(fVar, 8, bVarArr[8], subscriptionInfoResponse.ownershipType);
        }
        dVar.B(fVar, 9, bVarArr[9], subscriptionInfoResponse.periodType);
        dVar.p(fVar, 10, iSO8601DateSerializer, subscriptionInfoResponse.refundedAt);
        dVar.p(fVar, 11, x0.f71726a, subscriptionInfoResponse.storeTransactionId);
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

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return p.f("\n            SubscriptionInfo {\n                purchaseDate: " + this.purchaseDate + ",\n                originalPurchaseDate: " + this.originalPurchaseDate + ",\n                expiresDate: " + this.expiresDate + ",\n                store: " + this.store + ",\n                isSandbox: " + this.isSandbox + ",\n                unsubscribeDetectedAt: " + this.unsubscribeDetectedAt + ",\n                billingIssuesDetectedAt: " + this.billingIssuesDetectedAt + ",\n                gracePeriodExpiresDate: " + this.gracePeriodExpiresDate + ",\n                ownershipType: " + this.ownershipType + ",\n                periodType: " + this.periodType + ",\n                refundedAt: " + this.refundedAt + ",\n                storeTransactionId: " + this.storeTransactionId + ",\n            }\n        ");
    }

    public SubscriptionInfoResponse(Date date, Date date2, Date date3, Store store2, boolean z10, Date date4, Date date5, Date date6, OwnershipType ownershipType2, PeriodType periodType2, Date date7, String str) {
        C6496s.h(date, b.f37459Q);
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        C6496s.h(ownershipType2, "ownershipType");
        C6496s.h(periodType2, "periodType");
        this.purchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expiresDate = date3;
        this.store = store2;
        this.isSandbox = z10;
        this.unsubscribeDetectedAt = date4;
        this.billingIssuesDetectedAt = date5;
        this.gracePeriodExpiresDate = date6;
        this.ownershipType = ownershipType2;
        this.periodType = periodType2;
        this.refundedAt = date7;
        this.storeTransactionId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubscriptionInfoResponse(Date date, Date date2, Date date3, Store store2, boolean z10, Date date4, Date date5, Date date6, OwnershipType ownershipType2, PeriodType periodType2, Date date7, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, date2, date3, store2, z10, date4, date5, date6, (i10 & 256) != 0 ? OwnershipType.UNKNOWN : ownershipType2, periodType2, date7, str);
    }
}

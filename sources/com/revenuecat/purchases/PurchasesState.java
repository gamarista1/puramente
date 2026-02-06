package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/PurchasesState;", "", "allowSharingPlayStoreAccount", "", "purchaseCallbacksByProductId", "", "", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "deprecatedProductChangeCallback", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "appInBackground", "firstTimeInForeground", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)V", "getAllowSharingPlayStoreAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppInBackground", "()Z", "getDeprecatedProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getFirstTimeInForeground", "getPurchaseCallbacksByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)Lcom/revenuecat/purchases/PurchasesState;", "equals", "other", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map<String, PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this((Boolean) null, (Map) null, (ProductChangeCallback) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map<String, PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i10 & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        Map<String, PurchaseCallback> map2 = map;
        if ((i10 & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i10 & 8) != 0) {
            z10 = purchasesState.appInBackground;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map2, productChangeCallback2, z12, z11);
    }

    public final Boolean component1() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    public final ProductChangeCallback component3() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final boolean component5() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        C6496s.h(map, "purchaseCallbacksByProductId");
        return new PurchasesState(bool, map, productChangeCallback, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) obj;
        return C6496s.c(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && C6496s.c(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && C6496s.c(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int i10 = 0;
        int hashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.purchaseCallbacksByProductId.hashCode()) * 31;
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        if (productChangeCallback != null) {
            i10 = productChangeCallback.hashCode();
        }
        int i11 = (hashCode + i10) * 31;
        boolean z10 = this.appInBackground;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i12 = (i11 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.firstTimeInForeground;
        if (!z12) {
            z11 = z12;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "PurchasesState(allowSharingPlayStoreAccount=" + this.allowSharingPlayStoreAccount + ", purchaseCallbacksByProductId=" + this.purchaseCallbacksByProductId + ", deprecatedProductChangeCallback=" + this.deprecatedProductChangeCallback + ", appInBackground=" + this.appInBackground + ", firstTimeInForeground=" + this.firstTimeInForeground + ')';
    }

    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        C6496s.h(map, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = map;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z10;
        this.firstTimeInForeground = z11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PurchasesState(java.lang.Boolean r4, java.util.Map r5, com.revenuecat.purchases.interfaces.ProductChangeCallback r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0010
            java.util.Map r5 = mf.O.i()
        L_0x0010:
            r1 = r5
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r0 = r6
        L_0x0017:
            r4 = r9 & 8
            r5 = 1
            if (r4 == 0) goto L_0x001e
            r2 = r5
            goto L_0x001f
        L_0x001e:
            r2 = r7
        L_0x001f:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            r9 = r5
            goto L_0x0026
        L_0x0025:
            r9 = r8
        L_0x0026:
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesState.<init>(java.lang.Boolean, java.util.Map, com.revenuecat.purchases.interfaces.ProductChangeCallback, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

package com.revenuecat.purchases.google.usecase;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "appInBackground", "", "(Z)V", "getAppInBackground", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetBillingConfigUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z10) {
        this.appInBackground = z10;
    }

    public static /* synthetic */ GetBillingConfigUseCaseParams copy$default(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = getBillingConfigUseCaseParams.appInBackground;
        }
        return getBillingConfigUseCaseParams.copy(z10);
    }

    public final boolean component1() {
        return this.appInBackground;
    }

    public final GetBillingConfigUseCaseParams copy(boolean z10) {
        return new GetBillingConfigUseCaseParams(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBillingConfigUseCaseParams) && this.appInBackground == ((GetBillingConfigUseCaseParams) obj).appInBackground;
    }

    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        boolean z10 = this.appInBackground;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return "GetBillingConfigUseCaseParams(appInBackground=" + this.appInBackground + ')';
    }
}

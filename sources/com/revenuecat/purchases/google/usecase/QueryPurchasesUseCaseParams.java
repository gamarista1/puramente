package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;

    public QueryPurchasesUseCaseParams(DateProvider dateProvider2, DiagnosticsTracker diagnosticsTracker, boolean z10) {
        C6496s.h(dateProvider2, "dateProvider");
        this.dateProvider = dateProvider2;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z10;
    }

    public static /* synthetic */ QueryPurchasesUseCaseParams copy$default(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, DateProvider dateProvider2, DiagnosticsTracker diagnosticsTracker, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateProvider2 = queryPurchasesUseCaseParams.dateProvider;
        }
        if ((i10 & 2) != 0) {
            diagnosticsTracker = queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i10 & 4) != 0) {
            z10 = queryPurchasesUseCaseParams.appInBackground;
        }
        return queryPurchasesUseCaseParams.copy(dateProvider2, diagnosticsTracker, z10);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final boolean component3() {
        return this.appInBackground;
    }

    public final QueryPurchasesUseCaseParams copy(DateProvider dateProvider2, DiagnosticsTracker diagnosticsTracker, boolean z10) {
        C6496s.h(dateProvider2, "dateProvider");
        return new QueryPurchasesUseCaseParams(dateProvider2, diagnosticsTracker, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchasesUseCaseParams)) {
            return false;
        }
        QueryPurchasesUseCaseParams queryPurchasesUseCaseParams = (QueryPurchasesUseCaseParams) obj;
        return C6496s.c(this.dateProvider, queryPurchasesUseCaseParams.dateProvider) && C6496s.c(this.diagnosticsTrackerIfEnabled, queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesUseCaseParams.appInBackground;
    }

    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public int hashCode() {
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int hashCode2 = (hashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31;
        boolean z10 = this.appInBackground;
        if (z10) {
            z10 = true;
        }
        return hashCode2 + (z10 ? 1 : 0);
    }

    public String toString() {
        return "QueryPurchasesUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", appInBackground=" + this.appInBackground + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryPurchasesUseCaseParams(DateProvider dateProvider2, DiagnosticsTracker diagnosticsTracker, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultDateProvider() : dateProvider2, diagnosticsTracker, z10);
    }
}

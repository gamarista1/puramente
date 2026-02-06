package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3196c;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.BillingStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR/\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lcom/android/billingclient/api/c;", "Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lkotlin/Function1;", "Llf/M;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "executeAsync", "()V", "received", "onOk", "(Lcom/android/billingclient/api/c;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lyf/l;", "getOnReceive", "()Lyf/l;", "getOnError", "getWithConnectedClient", "", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetBillingConfigUseCase extends BillingClientUseCase<C3196c> {
    private final DeviceCache deviceCache;
    private final C6798l onError;
    private final C6798l onReceive;
    private final C6798l withConnectedClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, DeviceCache deviceCache2, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(getBillingConfigUseCaseParams, lVar2, pVar);
        C6496s.h(getBillingConfigUseCaseParams, "useCaseParams");
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.deviceCache = deviceCache2;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new GetBillingConfigUseCase$executeAsync$1(this));
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final C6798l getOnError() {
        return this.onError;
    }

    public final C6798l getOnReceive() {
        return this.onReceive;
    }

    public final C6798l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(C3196c cVar) {
        if (cVar == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache2 = this.deviceCache;
        String a10 = cVar.a();
        C6496s.g(a10, "received.countryCode");
        deviceCache2.setStorefront(a10);
        this.onReceive.invoke(cVar);
    }
}

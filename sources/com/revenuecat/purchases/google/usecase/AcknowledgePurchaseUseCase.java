package com.revenuecat.purchases.google.usecase;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0005\u0012*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR/\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8TX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Llf/M;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lcom/android/billingclient/api/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;Lyf/l;Lyf/l;Lyf/l;Lyf/p;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/google/usecase/AcknowledgePurchaseUseCaseParams;", "Lyf/l;", "getOnReceive", "()Lyf/l;", "getOnError", "getWithConnectedClient", "", "getBackoffForNetworkErrors", "()Z", "backoffForNetworkErrors", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AcknowledgePurchaseUseCase extends BillingClientUseCase<String> {
    private final C6798l onError;
    private final C6798l onReceive;
    /* access modifiers changed from: private */
    public final AcknowledgePurchaseUseCaseParams useCaseParams;
    private final C6798l withConnectedClient;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.revenuecat.purchases.PostReceiptInitiationSource[] r0 = com.revenuecat.purchases.PostReceiptInitiationSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.PostReceiptInitiationSource r1 = com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.PostReceiptInitiationSource r1 = com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.PostReceiptInitiationSource r1 = com.revenuecat.purchases.PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseUseCase(AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams, C6798l lVar, C6798l lVar2, C6798l lVar3, p pVar) {
        super(acknowledgePurchaseUseCaseParams, lVar2, pVar);
        C6496s.h(acknowledgePurchaseUseCaseParams, "useCaseParams");
        C6496s.h(lVar, "onReceive");
        C6496s.h(lVar2, "onError");
        C6496s.h(lVar3, "withConnectedClient");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = acknowledgePurchaseUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new AcknowledgePurchaseUseCase$executeAsync$1(this));
    }

    /* access modifiers changed from: protected */
    public boolean getBackoffForNetworkErrors() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new C6535s();
    }

    public String getErrorMessage() {
        return "Error acknowledging purchase";
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

    public void onOk(String str) {
        C6496s.h(str, MetricTracker.Action.RECEIVED);
        this.onReceive.invoke(str);
    }
}

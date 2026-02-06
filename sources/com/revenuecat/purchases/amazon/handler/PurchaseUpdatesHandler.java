package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJK\u0010\u0015\u001a\u00020\b2\"\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\\\u0010 \u001aJ\u0012\u0004\u0012\u00020\u001d\u0012@\u0012>\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t0\u001ej\u0002`\u001f0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseUpdatesHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;)V", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lyf/l;Ljava/lang/String;)V", "Lkotlin/Function2;", "", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesSuccessCallback;", "onSuccess", "onError", "queryPurchases", "(Lyf/p;Lyf/l;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "response", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "", "Lcom/amazon/device/iap/model/RequestId;", "Lkotlin/Pair;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesCallbacks;", "requests", "Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseUpdatesHandler implements PurchaseUpdatesResponseListener {
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, Pair<p, C6798l>> requests = new LinkedHashMap();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus[] r0 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler.WhenMappings.<clinit>():void");
        }
    }

    public PurchaseUpdatesHandler(PurchasingServiceProvider purchasingServiceProvider2) {
        C6496s.h(purchasingServiceProvider2, "purchasingServiceProvider");
        this.purchasingServiceProvider = purchasingServiceProvider2;
    }

    private final void invokeWithStoreProblem(C6798l lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        com.revenuecat.purchases.common.LogUtilsKt.errorLog("Exception in onPurchaseUpdatesResponse", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse r7) {
        /*
            r6 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            com.revenuecat.purchases.common.LogIntent r0 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = "Retrieved productData: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch:{ Exception -> 0x005c }
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x005c }
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x005c }
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)     // Catch:{ Exception -> 0x005c }
            com.amazon.device.iap.model.RequestId r0 = r7.getRequestId()     // Catch:{ Exception -> 0x005c }
            monitor-enter(r6)     // Catch:{ Exception -> 0x005c }
            java.util.Map<com.amazon.device.iap.model.RequestId, kotlin.Pair<yf.p, yf.l>> r1 = r6.requests     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0080 }
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch:{ all -> 0x0080 }
            monitor-exit(r6)     // Catch:{ Exception -> 0x005c }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r0.a()     // Catch:{ Exception -> 0x005c }
            yf.p r1 = (yf.p) r1     // Catch:{ Exception -> 0x005c }
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x005c }
            yf.l r0 = (yf.C6798l) r0     // Catch:{ Exception -> 0x005c }
            com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r2 = r7.getRequestStatus()     // Catch:{ Exception -> 0x005c }
            r4 = -1
            if (r2 != 0) goto L_0x0043
            r2 = r4
            goto L_0x004b
        L_0x0043:
            int[] r5 = com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x005c }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x005c }
            r2 = r5[r2]     // Catch:{ Exception -> 0x005c }
        L_0x004b:
            if (r2 == r4) goto L_0x007a
            if (r2 == r3) goto L_0x0064
            r7 = 2
            if (r2 == r7) goto L_0x005e
            r7 = 3
            if (r2 == r7) goto L_0x0056
            goto L_0x007f
        L_0x0056:
            java.lang.String r7 = "Failed to get purchase updates. Call is not supported."
            r6.invokeWithStoreProblem(r0, r7)     // Catch:{ Exception -> 0x005c }
            goto L_0x007f
        L_0x005c:
            r7 = move-exception
            goto L_0x0083
        L_0x005e:
            java.lang.String r7 = "Failed to get purchase updates."
            r6.invokeWithStoreProblem(r0, r7)     // Catch:{ Exception -> 0x005c }
            goto L_0x007f
        L_0x0064:
            java.util.List r0 = r7.getReceipts()     // Catch:{ Exception -> 0x005c }
            java.lang.String r2 = "response.receipts"
            kotlin.jvm.internal.C6496s.g(r0, r2)     // Catch:{ Exception -> 0x005c }
            com.amazon.device.iap.model.UserData r7 = r7.getUserData()     // Catch:{ Exception -> 0x005c }
            java.lang.String r2 = "response.userData"
            kotlin.jvm.internal.C6496s.g(r7, r2)     // Catch:{ Exception -> 0x005c }
            r1.invoke(r0, r7)     // Catch:{ Exception -> 0x005c }
            goto L_0x007f
        L_0x007a:
            java.lang.String r7 = "Failed to get purchase updates. There was an Amazon store problem."
            r6.invokeWithStoreProblem(r0, r7)     // Catch:{ Exception -> 0x005c }
        L_0x007f:
            return
        L_0x0080:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x005c }
            throw r7     // Catch:{ Exception -> 0x005c }
        L_0x0083:
            java.lang.String r0 = "Exception in onPurchaseUpdatesResponse"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r0, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler.onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse):void");
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    public void queryPurchases(p pVar, C6798l lVar) {
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, C6502A.a(pVar, lVar));
            C6514M m10 = C6514M.f71813a;
        }
    }
}

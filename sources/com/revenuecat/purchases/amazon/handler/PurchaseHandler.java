package com.revenuecat.purchases.amazon.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b!\u0010 J#\u0010\"\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\"\u0010 J#\u0010#\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b#\u0010 J#\u0010$\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b$\u0010 J]\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102RJ\u00105\u001a8\u0012\u0004\u0012\u000203\u0012.\u0012,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013040/8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00102¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/content/Context;", "applicationContext", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/content/Context;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Llf/M;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "startProxyActivity", "(Landroid/os/Handler;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lyf/p;Lyf/l;)V", "com/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1", "createRequestIdResultReceiver", "(Landroid/os/Handler;Lcom/revenuecat/purchases/models/StoreProduct;Lyf/p;Lyf/l;)Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1;", "receipt", "userData", "onSuccessfulPurchase", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lyf/p;)V", "onUnknownError", "(Lyf/l;)V", "onNotSupported", "onAlreadyPurchased", "onInvalidSku", "onFailed", "", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lyf/p;Lyf/l;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "response", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/content/Context;", "", "Lcom/revenuecat/purchases/ProductType;", "productTypes", "Ljava/util/Map;", "Lcom/amazon/device/iap/model/RequestId;", "Lkotlin/Pair;", "purchaseCallbacks", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    /* access modifiers changed from: private */
    public final Map<String, ProductType> productTypes = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<RequestId, Pair<p, C6798l>> purchaseCallbacks = new LinkedHashMap();
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus[] r0 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.INVALID_SKU     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.ALREADY_PURCHASED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.amazon.device.iap.model.PurchaseResponse$RequestStatus r1 = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.PurchaseHandler.WhenMappings.<clinit>():void");
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider2, Context context) {
        C6496s.h(purchasingServiceProvider2, "purchasingServiceProvider");
        C6496s.h(context, "applicationContext");
        this.purchasingServiceProvider = purchasingServiceProvider2;
        this.applicationContext = context;
    }

    private final PurchaseHandler$createRequestIdResultReceiver$1 createRequestIdResultReceiver(Handler handler, StoreProduct storeProduct, p pVar, C6798l lVar) {
        return new PurchaseHandler$createRequestIdResultReceiver$1(handler, this, pVar, lVar, storeProduct);
    }

    private final void onAlreadyPurchased(C6798l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, AmazonStrings.ERROR_PURCHASE_ALREADY_OWNED));
    }

    private final void onFailed(C6798l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, AmazonStrings.ERROR_PURCHASE_FAILED));
    }

    private final void onInvalidSku(C6798l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, AmazonStrings.ERROR_PURCHASE_INVALID_SKU));
    }

    private final void onNotSupported(C6798l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_NOT_SUPPORTED));
    }

    private final void onSuccessfulPurchase(Receipt receipt, UserData userData, p pVar) {
        pVar.invoke(receipt, userData);
    }

    private final void onUnknownError(C6798l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_UNKNOWN));
    }

    private final void startProxyActivity(Handler handler, Activity activity, StoreProduct storeProduct, p pVar, C6798l lVar) {
        activity.startActivity(ProxyAmazonBillingActivity.Companion.newStartIntent(activity, createRequestIdResultReceiver(handler, storeProduct, pVar, lVar), storeProduct.getId(), this.purchasingServiceProvider));
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        com.revenuecat.purchases.common.LogUtilsKt.errorLog("Exception in onPurchaseResponse", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse r6) {
        /*
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            com.revenuecat.purchases.common.LogIntent r0 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "Purchase request finished: \n %s"
            org.json.JSONObject r2 = r6.toJSON()     // Catch:{ Exception -> 0x007a }
            r3 = 1
            java.lang.String r2 = r2.toString(r3)     // Catch:{ Exception -> 0x007a }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x007a }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x007a }
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)     // Catch:{ Exception -> 0x007a }
            com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver$Companion r0 = com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.Companion     // Catch:{ Exception -> 0x007a }
            android.content.Context r1 = r5.applicationContext     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = "applicationContext.packageName"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x007a }
            android.content.Intent r0 = r0.newPurchaseFinishedIntent(r1)     // Catch:{ Exception -> 0x007a }
            android.content.Context r1 = r5.applicationContext     // Catch:{ Exception -> 0x007a }
            r1.sendBroadcast(r0)     // Catch:{ Exception -> 0x007a }
            com.amazon.device.iap.model.RequestId r0 = r6.getRequestId()     // Catch:{ Exception -> 0x007a }
            monitor-enter(r5)     // Catch:{ Exception -> 0x007a }
            java.util.Map<com.amazon.device.iap.model.RequestId, kotlin.Pair<yf.p, yf.l>> r1 = r5.purchaseCallbacks     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x00a2 }
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch:{ all -> 0x00a2 }
            monitor-exit(r5)     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r0.a()     // Catch:{ Exception -> 0x007a }
            yf.p r1 = (yf.p) r1     // Catch:{ Exception -> 0x007a }
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x007a }
            yf.l r0 = (yf.C6798l) r0     // Catch:{ Exception -> 0x007a }
            com.amazon.device.iap.model.PurchaseResponse$RequestStatus r2 = r6.getRequestStatus()     // Catch:{ Exception -> 0x007a }
            if (r2 != 0) goto L_0x0060
            r2 = -1
            goto L_0x0068
        L_0x0060:
            int[] r4 = com.revenuecat.purchases.amazon.handler.PurchaseHandler.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x007a }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x007a }
            r2 = r4[r2]     // Catch:{ Exception -> 0x007a }
        L_0x0068:
            if (r2 == r3) goto L_0x008c
            r6 = 2
            if (r2 == r6) goto L_0x0088
            r6 = 3
            if (r2 == r6) goto L_0x0084
            r6 = 4
            if (r2 == r6) goto L_0x0080
            r6 = 5
            if (r2 == r6) goto L_0x007c
            r5.onUnknownError(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a1
        L_0x007a:
            r6 = move-exception
            goto L_0x00a5
        L_0x007c:
            r5.onNotSupported(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a1
        L_0x0080:
            r5.onAlreadyPurchased(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a1
        L_0x0084:
            r5.onInvalidSku(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a1
        L_0x0088:
            r5.onFailed(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x00a1
        L_0x008c:
            com.amazon.device.iap.model.Receipt r0 = r6.getReceipt()     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = "response.receipt"
            kotlin.jvm.internal.C6496s.g(r0, r2)     // Catch:{ Exception -> 0x007a }
            com.amazon.device.iap.model.UserData r6 = r6.getUserData()     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = "response.userData"
            kotlin.jvm.internal.C6496s.g(r6, r2)     // Catch:{ Exception -> 0x007a }
            r5.onSuccessfulPurchase(r0, r6, r1)     // Catch:{ Exception -> 0x007a }
        L_0x00a1:
            return
        L_0x00a2:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x007a }
            throw r6     // Catch:{ Exception -> 0x007a }
        L_0x00a5:
            java.lang.String r0 = "Exception in onPurchaseResponse"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r0, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.PurchaseHandler.onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse):void");
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        PurchaseResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p pVar, C6798l lVar) {
        C6496s.h(handler, "mainHandler");
        C6496s.h(activity, "activity");
        C6496s.h(str, "appUserID");
        C6496s.h(storeProduct, "storeProduct");
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        LogIntent logIntent = LogIntent.PURCHASE;
        String format = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{storeProduct.getId()}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        startProxyActivity(handler, activity, storeProduct, pVar, lVar);
    }
}

package com.revenuecat.purchases.amazon.handler;

import android.os.Handler;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.StoreProductConversionsKt;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\b\b\u0000\u0018\u0000 12\u00020\u0001:\u000212B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\t2\u001c\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\rj\u0002`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"JS\u0010%\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\f\u001a\u00020\t2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\rH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0+8BX\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0+8@X\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;)V", "", "", "Lcom/amazon/device/iap/model/Product;", "productData", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Llf/M;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "handleSuccessfulProductDataResponse", "(Ljava/util/Map;Ljava/lang/String;Lyf/l;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "response", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "handleUnsuccessfulProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;Lyf/l;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToProductDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "skus", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lyf/l;Lyf/l;)V", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "", "productDataRequests", "Ljava/util/Map;", "productDataCache", "getProductDataCache$purchases_defaultsRelease", "()Ljava/util/Map;", "Companion", "Request", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductDataHandler implements ProductDataResponseListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long GET_PRODUCT_DATA_TIMEOUT_MILLIS = 10000;
    private final Handler mainHandler;
    private final Map<String, Product> productDataCache = new LinkedHashMap();
    private final Map<RequestId, Request> productDataRequests = new LinkedHashMap();
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Companion;", "", "()V", "GET_PRODUCT_DATA_TIMEOUT_MILLIS", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015Jd\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001e\b\u0002\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0013R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "", "", "skuList", "marketplace", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Llf/M;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "<init>", "(Ljava/util/List;Ljava/lang/String;Lyf/l;Lyf/l;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lyf/l;", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSkuList", "Ljava/lang/String;", "getMarketplace", "Lyf/l;", "getOnReceive", "getOnError", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Request {
        private final String marketplace;
        private final C6798l onError;
        private final C6798l onReceive;
        private final List<String> skuList;

        public Request(List<String> list, String str, C6798l lVar, C6798l lVar2) {
            C6496s.h(list, "skuList");
            C6496s.h(str, b.f37490m);
            C6496s.h(lVar, "onReceive");
            C6496s.h(lVar2, "onError");
            this.skuList = list;
            this.marketplace = str;
            this.onReceive = lVar;
            this.onError = lVar2;
        }

        public static /* synthetic */ Request copy$default(Request request, List<String> list, String str, C6798l lVar, C6798l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = request.skuList;
            }
            if ((i10 & 2) != 0) {
                str = request.marketplace;
            }
            if ((i10 & 4) != 0) {
                lVar = request.onReceive;
            }
            if ((i10 & 8) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(list, str, lVar, lVar2);
        }

        public final List<String> component1() {
            return this.skuList;
        }

        public final String component2() {
            return this.marketplace;
        }

        public final C6798l component3() {
            return this.onReceive;
        }

        public final C6798l component4() {
            return this.onError;
        }

        public final Request copy(List<String> list, String str, C6798l lVar, C6798l lVar2) {
            C6496s.h(list, "skuList");
            C6496s.h(str, b.f37490m);
            C6496s.h(lVar, "onReceive");
            C6496s.h(lVar2, "onError");
            return new Request(list, str, lVar, lVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return C6496s.c(this.skuList, request.skuList) && C6496s.c(this.marketplace, request.marketplace) && C6496s.c(this.onReceive, request.onReceive) && C6496s.c(this.onError, request.onError);
        }

        public final String getMarketplace() {
            return this.marketplace;
        }

        public final C6798l getOnError() {
            return this.onError;
        }

        public final C6798l getOnReceive() {
            return this.onReceive;
        }

        public final List<String> getSkuList() {
            return this.skuList;
        }

        public int hashCode() {
            return (((((this.skuList.hashCode() * 31) + this.marketplace.hashCode()) * 31) + this.onReceive.hashCode()) * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(skuList=" + this.skuList + ", marketplace=" + this.marketplace + ", onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public ProductDataHandler(PurchasingServiceProvider purchasingServiceProvider2, Handler handler) {
        C6496s.h(purchasingServiceProvider2, "purchasingServiceProvider");
        C6496s.h(handler, "mainHandler");
        this.purchasingServiceProvider = purchasingServiceProvider2;
        this.mainHandler = handler;
    }

    private final void addTimeoutToProductDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new a(this, requestId), 10000);
    }

    /* access modifiers changed from: private */
    public static final void addTimeoutToProductDataRequest$lambda$6(ProductDataHandler productDataHandler, RequestId requestId) {
        C6496s.h(productDataHandler, "this$0");
        C6496s.h(requestId, "$requestId");
        Request request = productDataHandler.getRequest(requestId);
        if (request != null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format(AmazonStrings.ERROR_TIMEOUT_GETTING_PRODUCT_DATA, Arrays.copyOf(new Object[]{request.getSkuList().toString()}, 1));
            C6496s.g(format, "format(this, *args)");
            request.getOnError().invoke(new PurchasesError(purchasesErrorCode, format));
        }
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.productDataRequests.remove(requestId);
    }

    private final void handleSuccessfulProductDataResponse(Map<String, Product> map, String str, C6798l lVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{map}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        if (map.isEmpty()) {
            LogWrapperKt.log(logIntent, AmazonStrings.RETRIEVED_PRODUCT_DATA_EMPTY);
        }
        ArrayList arrayList = new ArrayList();
        for (Product storeProduct : map.values()) {
            StoreProduct storeProduct2 = StoreProductConversionsKt.toStoreProduct(storeProduct, str);
            if (storeProduct2 != null) {
                arrayList.add(storeProduct2);
            }
        }
        lVar.invoke(arrayList);
    }

    private final void handleUnsuccessfulProductDataResponse(ProductDataResponse productDataResponse, C6798l lVar) {
        String str;
        if (productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.NOT_SUPPORTED) {
            str = "Couldn't fetch product data, since it's not supported.";
        } else {
            str = "Error when fetching product data.";
        }
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    public void getProductData(Set<String> set, String str, C6798l lVar, C6798l lVar2) {
        Map y10;
        Set<String> set2 = set;
        String str2 = str;
        C6798l lVar3 = lVar;
        C6798l lVar4 = lVar2;
        C6496s.h(set2, b.f37457O);
        C6496s.h(str2, b.f37490m);
        C6496s.h(lVar3, "onReceive");
        C6496s.h(lVar4, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        Iterable iterable = set2;
        String format = String.format(AmazonStrings.REQUESTING_PRODUCTS, Arrays.copyOf(new Object[]{C6565s.x0(iterable, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        synchronized (this) {
            y10 = O.y(this.productDataCache);
        }
        if (y10.keySet().containsAll(set2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : y10.entrySet()) {
                if (set2.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            handleSuccessfulProductDataResponse(linkedHashMap, str2, lVar3);
            return;
        }
        RequestId productData = this.purchasingServiceProvider.getProductData(set2);
        Request request = new Request(C6565s.e1(iterable), str2, lVar3, lVar4);
        synchronized (this) {
            this.productDataRequests.put(productData, request);
            addTimeoutToProductDataRequest(productData);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final synchronized Map<String, Product> getProductDataCache$purchases_defaultsRelease() {
        return this.productDataCache;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        com.revenuecat.purchases.common.LogUtilsKt.errorLog("Exception in onProductDataResponse", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse r5) {
        /*
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            com.revenuecat.purchases.common.LogIntent r0 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = "Products request finished with result %s"
            com.amazon.device.iap.model.ProductDataResponse$RequestStatus r2 = r5.getRequestStatus()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = r2.name()     // Catch:{ Exception -> 0x0052 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0052 }
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x0052 }
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)     // Catch:{ Exception -> 0x0052 }
            java.util.Set r1 = r5.getUnavailableSkus()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = "response.unavailableSkus"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x0052 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0052 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0052 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = "Unavailable products: %s"
            java.util.Set r2 = r5.getUnavailableSkus()     // Catch:{ Exception -> 0x0052 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0052 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x0052 }
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r5 = move-exception
            goto L_0x009e
        L_0x0054:
            com.amazon.device.iap.model.RequestId r0 = r5.getRequestId()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = "requestId"
            kotlin.jvm.internal.C6496s.g(r0, r1)     // Catch:{ Exception -> 0x0052 }
            com.revenuecat.purchases.amazon.handler.ProductDataHandler$Request r0 = r4.getRequest(r0)     // Catch:{ Exception -> 0x0052 }
            if (r0 != 0) goto L_0x0064
            return
        L_0x0064:
            com.amazon.device.iap.model.ProductDataResponse$RequestStatus r1 = r5.getRequestStatus()     // Catch:{ Exception -> 0x0052 }
            com.amazon.device.iap.model.ProductDataResponse$RequestStatus r2 = com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL     // Catch:{ Exception -> 0x0052 }
            if (r1 != r2) goto L_0x0096
            monitor-enter(r4)     // Catch:{ Exception -> 0x0052 }
            java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> r1 = r4.productDataCache     // Catch:{ all -> 0x0093 }
            java.util.Map r2 = r5.getProductData()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "response.productData"
            kotlin.jvm.internal.C6496s.g(r2, r3)     // Catch:{ all -> 0x0093 }
            r1.putAll(r2)     // Catch:{ all -> 0x0093 }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0052 }
            java.util.Map r5 = r5.getProductData()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = "response.productData"
            kotlin.jvm.internal.C6496s.g(r5, r1)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = r0.getMarketplace()     // Catch:{ Exception -> 0x0052 }
            yf.l r0 = r0.getOnReceive()     // Catch:{ Exception -> 0x0052 }
            r4.handleSuccessfulProductDataResponse(r5, r1, r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x009d
        L_0x0093:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0052 }
            throw r5     // Catch:{ Exception -> 0x0052 }
        L_0x0096:
            yf.l r0 = r0.getOnError()     // Catch:{ Exception -> 0x0052 }
            r4.handleUnsuccessfulProductDataResponse(r5, r0)     // Catch:{ Exception -> 0x0052 }
        L_0x009d:
            return
        L_0x009e:
            java.lang.String r0 = "Exception in onProductDataResponse"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r0, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.ProductDataHandler.onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse):void");
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        ProductDataResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }
}

package com.revenuecat.purchases.amazon.handler;

import android.os.Handler;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.DefaultTimestampProvider;
import com.revenuecat.purchases.utils.TimestampProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u000f*\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010\"\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190'8BX\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n8B@BX\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010-8B@BX\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "timestampProvider", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;Lcom/revenuecat/purchases/utils/TimestampProvider;)V", "Lcom/amazon/device/iap/model/UserData;", "getCachedUserDataIfAvailable", "()Lcom/amazon/device/iap/model/UserData;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lyf/l;Ljava/lang/String;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToUserDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "onSuccess", "onError", "getUserData", "(Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "", "requests", "Ljava/util/Map;", "<set-?>", "userDataCache", "Lcom/amazon/device/iap/model/UserData;", "", "lastUserDataRequestTimestamp", "Ljava/lang/Long;", "Companion", "Request", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserDataHandler implements UserDataResponseListener {
    private static final long CACHE_EXPIRATION_TIME_MILLIS = 300000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long GET_USER_DATA_TIMEOUT_MILLIS = 10000;
    private Long lastUserDataRequestTimestamp;
    private final Handler mainHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, Request> requests;
    private final TimestampProvider timestampProvider;
    private UserData userDataCache;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Companion;", "", "()V", "CACHE_EXPIRATION_TIME_MILLIS", "", "GET_USER_DATA_TIMEOUT_MILLIS", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ@\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "Llf/M;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "<init>", "(Lyf/l;Lyf/l;)V", "component1", "()Lyf/l;", "component2", "copy", "(Lyf/l;Lyf/l;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyf/l;", "getOnReceive", "getOnError", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Request {
        private final C6798l onError;
        private final C6798l onReceive;

        public Request(C6798l lVar, C6798l lVar2) {
            C6496s.h(lVar, "onReceive");
            C6496s.h(lVar2, "onError");
            this.onReceive = lVar;
            this.onError = lVar2;
        }

        public static /* synthetic */ Request copy$default(Request request, C6798l lVar, C6798l lVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = request.onReceive;
            }
            if ((i10 & 2) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(lVar, lVar2);
        }

        public final C6798l component1() {
            return this.onReceive;
        }

        public final C6798l component2() {
            return this.onError;
        }

        public final Request copy(C6798l lVar, C6798l lVar2) {
            C6496s.h(lVar, "onReceive");
            C6496s.h(lVar2, "onError");
            return new Request(lVar, lVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return C6496s.c(this.onReceive, request.onReceive) && C6496s.c(this.onError, request.onError);
        }

        public final C6798l getOnError() {
            return this.onError;
        }

        public final C6798l getOnReceive() {
            return this.onReceive;
        }

        public int hashCode() {
            return (this.onReceive.hashCode() * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.amazon.device.iap.model.UserDataResponse$RequestStatus[] r0 = com.amazon.device.iap.model.UserDataResponse.RequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amazon.device.iap.model.UserDataResponse$RequestStatus r1 = com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.amazon.device.iap.model.UserDataResponse$RequestStatus r1 = com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.amazon.device.iap.model.UserDataResponse$RequestStatus r1 = com.amazon.device.iap.model.UserDataResponse.RequestStatus.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.UserDataHandler.WhenMappings.<clinit>():void");
        }
    }

    public UserDataHandler(PurchasingServiceProvider purchasingServiceProvider2, Handler handler, TimestampProvider timestampProvider2) {
        C6496s.h(purchasingServiceProvider2, "purchasingServiceProvider");
        C6496s.h(handler, "mainHandler");
        C6496s.h(timestampProvider2, "timestampProvider");
        this.purchasingServiceProvider = purchasingServiceProvider2;
        this.mainHandler = handler;
        this.timestampProvider = timestampProvider2;
        this.requests = new LinkedHashMap();
    }

    private final void addTimeoutToUserDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new b(this, requestId), 10000);
    }

    /* access modifiers changed from: private */
    public static final void addTimeoutToUserDataRequest$lambda$5(UserDataHandler userDataHandler, RequestId requestId) {
        C6496s.h(userDataHandler, "this$0");
        C6496s.h(requestId, "$requestId");
        Request request = userDataHandler.getRequest(requestId);
        if (request != null) {
            request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, AmazonStrings.ERROR_TIMEOUT_GETTING_USER_DATA));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized com.amazon.device.iap.model.UserData getCachedUserDataIfAvailable() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.amazon.device.iap.model.UserData r0 = r5.userDataCache     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            java.lang.Long r1 = r5.lastUserDataRequestTimestamp     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            long r1 = r1.longValue()     // Catch:{ all -> 0x001d }
            com.revenuecat.purchases.utils.TimestampProvider r3 = r5.timestampProvider     // Catch:{ all -> 0x001d }
            long r3 = r3.getCurrentTimeMillis()     // Catch:{ all -> 0x001d }
            long r3 = r3 - r1
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x001f
            monitor-exit(r5)
            return r0
        L_0x001d:
            r0 = move-exception
            goto L_0x0022
        L_0x001f:
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x0022:
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.UserDataHandler.getCachedUserDataIfAvailable():com.amazon.device.iap.model.UserData");
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.requests.remove(requestId);
    }

    private final void invokeWithStoreProblem(C6798l lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    public void getUserData(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        UserData cachedUserDataIfAvailable = getCachedUserDataIfAvailable();
        if (cachedUserDataIfAvailable != null) {
            LogWrapperKt.log(LogIntent.DEBUG, AmazonStrings.USER_DATA_REQUEST_FROM_CACHE);
            lVar.invoke(cachedUserDataIfAvailable);
            return;
        }
        RequestId userData = this.purchasingServiceProvider.getUserData();
        Request request = new Request(lVar, lVar2);
        synchronized (this) {
            this.requests.put(userData, request);
            addTimeoutToUserDataRequest(userData);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        UserDataResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        com.revenuecat.purchases.common.LogUtilsKt.errorLog("Exception in onUserDataResponse", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse r5) {
        /*
            r4 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            com.revenuecat.purchases.common.LogIntent r0 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = "User data request finished with result %s"
            com.amazon.device.iap.model.UserDataResponse$RequestStatus r2 = r5.getRequestStatus()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = r2.name()     // Catch:{ Exception -> 0x0058 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0058 }
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)     // Catch:{ Exception -> 0x0058 }
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)     // Catch:{ Exception -> 0x0058 }
            com.amazon.device.iap.model.RequestId r0 = r5.getRequestId()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = "response.requestId"
            kotlin.jvm.internal.C6496s.g(r0, r1)     // Catch:{ Exception -> 0x0058 }
            com.revenuecat.purchases.amazon.handler.UserDataHandler$Request r0 = r4.getRequest(r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 != 0) goto L_0x0036
            return
        L_0x0036:
            com.amazon.device.iap.model.UserDataResponse$RequestStatus r1 = r5.getRequestStatus()     // Catch:{ Exception -> 0x0058 }
            if (r1 != 0) goto L_0x003e
            r1 = -1
            goto L_0x0046
        L_0x003e:
            int[] r2 = com.revenuecat.purchases.amazon.handler.UserDataHandler.WhenMappings.$EnumSwitchMapping$0     // Catch:{ Exception -> 0x0058 }
            int r1 = r1.ordinal()     // Catch:{ Exception -> 0x0058 }
            r1 = r2[r1]     // Catch:{ Exception -> 0x0058 }
        L_0x0046:
            if (r1 == r3) goto L_0x006e
            r5 = 2
            if (r1 == r5) goto L_0x0064
            r5 = 3
            if (r1 == r5) goto L_0x005a
            yf.l r5 = r0.getOnError()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = "Failed to get user data. There was an Amazon store problem."
            r4.invokeWithStoreProblem(r5, r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0094
        L_0x0058:
            r5 = move-exception
            goto L_0x0098
        L_0x005a:
            yf.l r5 = r0.getOnError()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = "Failed to get user data. Call is not supported."
            r4.invokeWithStoreProblem(r5, r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0094
        L_0x0064:
            yf.l r5 = r0.getOnError()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = "Failed to get user data. Make sure sandbox mode is enabled if using App Tester. https://rev.cat/enter-amazon-sandbox"
            r4.invokeWithStoreProblem(r5, r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0094
        L_0x006e:
            monitor-enter(r4)     // Catch:{ Exception -> 0x0058 }
            com.revenuecat.purchases.utils.TimestampProvider r1 = r4.timestampProvider     // Catch:{ all -> 0x0095 }
            long r1 = r1.getCurrentTimeMillis()     // Catch:{ all -> 0x0095 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0095 }
            r4.lastUserDataRequestTimestamp = r1     // Catch:{ all -> 0x0095 }
            com.amazon.device.iap.model.UserData r1 = r5.getUserData()     // Catch:{ all -> 0x0095 }
            r4.userDataCache = r1     // Catch:{ all -> 0x0095 }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0058 }
            yf.l r0 = r0.getOnReceive()     // Catch:{ Exception -> 0x0058 }
            com.amazon.device.iap.model.UserData r5 = r5.getUserData()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = "response.userData"
            kotlin.jvm.internal.C6496s.g(r5, r1)     // Catch:{ Exception -> 0x0058 }
            r0.invoke(r5)     // Catch:{ Exception -> 0x0058 }
        L_0x0094:
            return
        L_0x0095:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0058 }
            throw r5     // Catch:{ Exception -> 0x0058 }
        L_0x0098:
            java.lang.String r0 = "Exception in onUserDataResponse"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r0, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.handler.UserDataHandler.onUserDataResponse(com.amazon.device.iap.model.UserDataResponse):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserDataHandler(PurchasingServiceProvider purchasingServiceProvider2, Handler handler, TimestampProvider timestampProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchasingServiceProvider2, handler, (i10 & 4) != 0 ? new DefaultTimestampProvider() : timestampProvider2);
    }
}

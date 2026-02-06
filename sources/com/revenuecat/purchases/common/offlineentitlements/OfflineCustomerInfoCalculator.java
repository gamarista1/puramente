package com.revenuecat.purchases.common.offlineentitlements;

import Qc.a;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ=\u0010\"\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "purchasedProductsFetcher", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "appUserID", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Lcom/revenuecat/purchases/CustomerInfo;", "buildCustomerInfoUsingListOfPurchases", "(Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/CustomerInfo;", "kotlin.jvm.PlatformType", "determineManagementURL", "()Ljava/lang/Object;", "calculateOriginalPurchaseDate", "(Ljava/util/List;)Ljava/lang/String;", "Lorg/json/JSONObject;", "generateSubscriptions", "(Ljava/util/List;)Lorg/json/JSONObject;", "generateEntitlementsResponse", "Lkotlin/Function1;", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "computeOfflineCustomerInfo", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfflineCustomerInfoCalculator {
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    /* access modifiers changed from: private */
    public final DiagnosticsTracker diagnosticsTracker;
    private final PurchasedProductsFetcher purchasedProductsFetcher;

    public OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher2, AppConfig appConfig2, DiagnosticsTracker diagnosticsTracker2, DateProvider dateProvider2) {
        C6496s.h(purchasedProductsFetcher2, "purchasedProductsFetcher");
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(dateProvider2, "dateProvider");
        this.purchasedProductsFetcher = purchasedProductsFetcher2;
        this.appConfig = appConfig2;
        this.diagnosticsTracker = diagnosticsTracker2;
        this.dateProvider = dateProvider2;
    }

    /* access modifiers changed from: private */
    public final CustomerInfo buildCustomerInfoUsingListOfPurchases(String str, List<PurchasedProduct> list) {
        JSONObject jSONObject = new JSONObject();
        Date now = this.dateProvider.getNow();
        String format = Iso8601Utils.format(now);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE, format);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE_MS, now.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID, str);
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APPLICATION_VERSION, "1.0");
        jSONObject2.put(CustomerInfoResponseJsonKeys.ENTITLEMENTS, generateEntitlementsResponse(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.FIRST_SEEN, format);
        jSONObject2.put("original_purchase_date", calculateOriginalPurchaseDate(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
        jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, generateSubscriptions(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.MANAGEMENT_URL, determineManagementURL());
        C6514M m10 = C6514M.f71813a;
        jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
        return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, now, VerificationResult.VERIFIED_ON_DEVICE);
    }

    private final String calculateOriginalPurchaseDate(List<PurchasedProduct> list) {
        Long l10;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            l10 = null;
        } else {
            l10 = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
                if (l10.compareTo(valueOf) > 0) {
                    l10 = valueOf;
                }
            }
        }
        if (l10 != null) {
            return a.b(new Date(l10.longValue()));
        }
        return null;
    }

    private final Object determineManagementURL() {
        if (this.appConfig.getStore() == Store.PLAY_STORE) {
            return Constants.GOOGLE_PLAY_MANAGEMENT_URL;
        }
        return JSONObject.NULL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject generateEntitlementsResponse(java.util.List<com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct> r14) {
        /*
            r13 = this;
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x000b:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r14.next()
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r1 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r1
            java.util.List r2 = r1.getEntitlements()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = mf.C6565s.y(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            kotlin.Pair r4 = lf.C6502A.a(r4, r1)
            r3.add(r4)
            goto L_0x002c
        L_0x0040:
            mf.C6565s.D(r0, r3)
            goto L_0x000b
        L_0x0044:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.c()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r14.get(r2)
            if (r3 != 0) goto L_0x006d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r14.put(r2, r3)
        L_0x006d:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r1.d()
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r1 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r1
            r3.add(r1)
            goto L_0x004d
        L_0x0079:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r14.size()
            int r1 = mf.O.e(r1)
            r0.<init>(r1)
            java.util.Set r14 = r14.entrySet()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0090:
            boolean r1 = r14.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0102
            java.lang.Object r1 = r14.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x00b5
            goto L_0x00f3
        L_0x00b5:
            java.lang.Object r2 = r4.next()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x00c0
            goto L_0x00f3
        L_0x00c0:
            r5 = r2
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r5 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r5
            java.util.Date r5 = r5.getExpiresDate()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r5 == 0) goto L_0x00d3
            long r8 = r5.getTime()
            goto L_0x00d4
        L_0x00d3:
            r8 = r6
        L_0x00d4:
            java.lang.Object r5 = r4.next()
            r10 = r5
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r10 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r10
            java.util.Date r10 = r10.getExpiresDate()
            if (r10 == 0) goto L_0x00e6
            long r10 = r10.getTime()
            goto L_0x00e7
        L_0x00e6:
            r10 = r6
        L_0x00e7:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x00ed
            r2 = r5
            r8 = r10
        L_0x00ed:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x00d4
        L_0x00f3:
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r2 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r2
            if (r2 != 0) goto L_0x00fe
            java.lang.Object r1 = mf.C6565s.o0(r1)
            r2 = r1
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r2 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r2
        L_0x00fe:
            r0.put(r3, r2)
            goto L_0x0090
        L_0x0102:
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x010f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct r1 = (com.revenuecat.purchases.common.offlineentitlements.PurchasedProduct) r1
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.util.Date r5 = r1.getExpiresDate()
            if (r5 == 0) goto L_0x0137
            java.lang.String r5 = com.revenuecat.purchases.utils.Iso8601Utils.format(r5)
            goto L_0x0138
        L_0x0137:
            r5 = r2
        L_0x0138:
            java.lang.String r6 = "expires_date"
            r4.put(r6, r5)
            java.lang.String r5 = "product_identifier"
            java.lang.String r6 = r1.getProductIdentifier()
            r4.put(r5, r6)
            java.util.Date r5 = new java.util.Date
            com.revenuecat.purchases.models.StoreTransaction r6 = r1.getStoreTransaction()
            long r6 = r6.getPurchaseTime()
            r5.<init>(r6)
            java.lang.String r6 = "purchase_date"
            java.lang.String r5 = com.revenuecat.purchases.utils.Iso8601Utils.format(r5)
            r4.put(r6, r5)
            java.lang.String r1 = r1.getBasePlanId()
            if (r1 == 0) goto L_0x0167
            java.lang.String r5 = "product_plan_identifier"
            r4.put(r5, r1)
        L_0x0167:
            r14.put(r3, r4)
            goto L_0x010f
        L_0x016b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator.generateEntitlementsResponse(java.util.List):org.json.JSONObject");
    }

    private final JSONObject generateSubscriptions(List<PurchasedProduct> list) {
        String format;
        JSONObject jSONObject = new JSONObject();
        for (PurchasedProduct purchasedProduct : list) {
            String productIdentifier = purchasedProduct.getProductIdentifier();
            JSONObject jSONObject2 = new JSONObject();
            Object obj = JSONObject.NULL;
            jSONObject2.put(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, obj);
            jSONObject2.put(ProductResponseJsonKeys.IS_SANDBOX, false);
            Date date = new Date(purchasedProduct.getStoreTransaction().getPurchaseTime());
            jSONObject2.put("original_purchase_date", Iso8601Utils.format(date));
            jSONObject2.put("purchase_date", Iso8601Utils.format(date));
            String name = this.appConfig.getStore().name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.STORE, lowerCase);
            jSONObject2.put(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, obj);
            jSONObject2.put("product_plan_identifier", purchasedProduct.getBasePlanId());
            Date expiresDate = purchasedProduct.getExpiresDate();
            if (!(expiresDate == null || (format = Iso8601Utils.format(expiresDate)) == null)) {
                obj = format;
            }
            jSONObject2.put("expires_date", obj);
            String lowerCase2 = "NORMAL".toLowerCase(locale);
            C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.PERIOD_TYPE, lowerCase2);
            C6514M m10 = C6514M.f71813a;
            jSONObject.put(productIdentifier, jSONObject2);
        }
        return jSONObject;
    }

    public final void computeOfflineCustomerInfo(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        this.purchasedProductsFetcher.queryActiveProducts(str, new OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1(this, lVar2, str, lVar), new OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2(this, lVar2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher2, AppConfig appConfig2, DiagnosticsTracker diagnosticsTracker2, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(purchasedProductsFetcher2, appConfig2, diagnosticsTracker2, (i10 & 8) != 0 ? new DefaultDateProvider() : dateProvider2);
    }
}

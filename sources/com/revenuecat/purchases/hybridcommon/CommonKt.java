package com.revenuecat.purchases.hybridcommon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lf.C6521e;
import lf.C6535s;
import mf.C6565s;
import mf.O;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\b\u001a+\u0010\u0013\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001ao\u0010 \u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001d2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b \u0010!\u001a[\u0010#\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\t2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$\u001ae\u0010&\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001d2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'\u001a\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010*\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\b\u001a\u001d\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010.\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b.\u0010\b\u001a\u0017\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0000H\u0007¢\u0006\u0004\b0\u0010\u0004\u001a\u0015\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\t¢\u0006\u0004\b2\u00103\u001a-\u00106\u001a\u00020\u00022\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d\u0012\u0004\u0012\u00020\u000204¢\u0006\u0004\b6\u00107\u001a\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b8\u0010\b\u001a\u0017\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b:\u00103\u001a\u000f\u0010;\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b;\u0010)\u001a\u0015\u0010<\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b<\u0010\b\u001a\r\u0010=\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>\u001a\u0015\u0010=\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b=\u0010\b\u001a\r\u0010?\u001a\u00020\u0000¢\u0006\u0004\b?\u0010@\u001a\u0015\u0010B\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\t¢\u0006\u0004\bB\u00103\u001a3\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\bD\u0010E\u001a\r\u0010F\u001a\u00020\u0002¢\u0006\u0004\bF\u0010>\u001a1\u0010K\u001a\u00020\u00022\u0006\u0010H\u001a\u00020G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000J¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010M\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000J¢\u0006\u0004\bM\u0010N\u001a+\u0010Q\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010\u000fH\u0007¢\u0006\u0004\bQ\u0010R\u001a\u0001\u0010^\u001a\u00020\u00022\u0006\u0010H\u001a\u00020G2\u0006\u0010S\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\u0006\u0010U\u001a\u00020T2\b\b\u0002\u0010W\u001a\u00020V2\b\b\u0002\u0010Y\u001a\u00020X2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b^\u0010_\u001a\r\u0010a\u001a\u00020`¢\u0006\u0004\ba\u0010b\u001a\u0015\u0010d\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\t¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010f\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bf\u0010-\u001a\u0013\u0010h\u001a\u00020\t*\u00020gH\u0002¢\u0006\u0004\bh\u0010i\u001a\u0015\u0010k\u001a\u0004\u0018\u00010j*\u00020\tH\u0002¢\u0006\u0004\bk\u0010l\u001a\u0015\u0010n\u001a\u0004\u0018\u00010m*\u00020\tH\u0002¢\u0006\u0004\bn\u0010o\u001a\u0017\u0010q\u001a\u00020p2\u0006\u0010\u0011\u001a\u00020\tH\u0001¢\u0006\u0004\bq\u0010r\u001a\u001b\u0010u\u001a\u0004\u0018\u00010t2\b\u0010s\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bu\u0010v\u001a)\u0010y\u001a\u0014\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020w2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\by\u0010z\u001a+\u0010}\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010{\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00020w2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b}\u0010z\u001a\u0017\u0010\u001a\u00020\u00022\u0006\u0010~\u001a\u00020\tH\u0000¢\u0006\u0004\b\u00103\u001a\u0019\u0010\u0001\u001a\u00020\u00022\u0006\u0010~\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0001\u00103\u001a'\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0000¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u001a2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"", "allowSharingAppStoreAccount", "Llf/M;", "setAllowSharingAppStoreAccount", "(Z)V", "Lcom/revenuecat/purchases/hybridcommon/OnResult;", "onResult", "getOfferings", "(Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "", "placementIdentifier", "Lcom/revenuecat/purchases/hybridcommon/OnNullableResult;", "getCurrentOfferingForPlacement", "(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnNullableResult;)V", "syncAttributesAndOfferingsIfNeeded", "", "productIDs", "type", "Lcom/revenuecat/purchases/hybridcommon/OnResultList;", "getProductInfo", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnResultList;)V", "Landroid/app/Activity;", "activity", "productIdentifier", "googleBasePlanId", "googleOldProductId", "", "googleReplacementModeInt", "googleIsPersonalizedPrice", "", "", "presentedOfferingContext", "purchaseProduct", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "packageIdentifier", "purchasePackage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "optionIdentifier", "purchaseSubscriptionOption", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "getAppUserID", "()Ljava/lang/String;", "restorePurchases", "appUserID", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/OnResult;)V", "logOut", "enabled", "setDebugLogsEnabled", "level", "setLogLevel", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "callback", "setLogHandler", "(Lyf/l;)V", "setLogHandlerWithOnResult", "proxyURLString", "setProxyURLString", "getProxyURLString", "getCustomerInfo", "syncPurchases", "()V", "isAnonymous", "()Z", "purchasesAreCompletedBy", "setPurchasesAreCompletedBy", "productIdentifiers", "checkTrialOrIntroductoryPriceEligibility", "(Ljava/util/List;)Ljava/util/Map;", "invalidateCustomerInfoCache", "Landroid/content/Context;", "context", "features", "Lcom/revenuecat/purchases/hybridcommon/OnResultAny;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/hybridcommon/OnResultAny;)V", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/hybridcommon/OnResultAny;)V", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "apiKey", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/Store;", "store", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "shouldShowInAppMessagesAutomatically", "verificationMode", "pendingTransactionsForPrepaidPlansEnabled", "diagnosticsEnabled", "configure", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/PlatformInfo;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/DangerousSettings;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "getPromotionalOffer", "()Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "urlString", "isWebPurchaseRedemptionURL", "(Ljava/lang/String;)Z", "redeemWebPurchase", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "toResultName", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)Ljava/lang/String;", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "toWebPurchaseRedemption", "(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "toPurchasesAreCompletedBy", "(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "Lcom/revenuecat/purchases/ProductType;", "mapStringToProductType", "(Ljava/lang/String;)Lcom/revenuecat/purchases/ProductType;", "replacementModeInt", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "getPurchaseErrorFunction", "(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lyf/p;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "getPurchaseCompletedFunction", "message", "warnLog", "errorLog", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "toPresentedOfferingContext", "(Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "value", "convertToInt", "(Ljava/lang/Object;)Ljava/lang/Integer;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CommonKt {
    public static final void canMakePayments(Context context, List<Integer> list, OnResultAny<Boolean> onResultAny) {
        C6496s.h(context, "context");
        C6496s.h(list, "features");
        C6496s.h(onResultAny, "onResult");
        ArrayList arrayList = new ArrayList();
        try {
            BillingFeature[] values = BillingFeature.values();
            Iterable<Number> iterable = list;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
            for (Number intValue : iterable) {
                arrayList2.add(values[intValue.intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.Companion.canMakePayments(context, arrayList, new b(onResultAny));
        } catch (IndexOutOfBoundsException unused) {
            onResultAny.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), (Map) null, 1, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void canMakePayments$lambda$3(OnResultAny onResultAny, Boolean bool) {
        C6496s.h(onResultAny, "$onResult");
        C6496s.g(bool, "it");
        onResultAny.onReceived(bool);
    }

    public static final Map<String, Map<String, Object>> checkTrialOrIntroductoryPriceEligibility(List<String> list) {
        C6496s.h(list, "productIdentifiers");
        Iterable<String> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (String a10 : iterable) {
            arrayList.add(C6502A.a(a10, O.l(C6502A.a("status", 0), C6502A.a(b.f37480c, "Status indeterminate."))));
        }
        return O.w(arrayList);
    }

    public static final void configure(Context context, String str, String str2, PlatformInfo platformInfo) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        configure$default(context, str, str2, (String) null, platformInfo2, (Store) null, (DangerousSettings) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, 2024, (Object) null);
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, int i10, Object obj) {
        String str5;
        Store store2;
        DangerousSettings dangerousSettings2;
        Boolean bool4;
        String str6;
        Boolean bool5;
        Boolean bool6;
        int i11 = i10;
        if ((i11 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i11 & 32) != 0) {
            store2 = Store.PLAY_STORE;
        } else {
            store2 = store;
        }
        if ((i11 & 64) != 0) {
            dangerousSettings2 = new DangerousSettings(true);
        } else {
            dangerousSettings2 = dangerousSettings;
        }
        if ((i11 & 128) != 0) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i11 & 256) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i11 & 512) != 0) {
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i11 & 1024) != 0) {
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        configure(context, str, str2, str5, platformInfo, store2, dangerousSettings2, bool4, str6, bool5, bool6);
    }

    public static final Integer convertToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        return null;
    }

    public static final void errorLog(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", str);
        }
    }

    public static final void getAmazonLWAConsentStatus(OnResultAny<Boolean> onResultAny) {
        C6496s.h(onResultAny, "onResult");
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(Purchases.Companion.getSharedInstance(), new CommonKt$getAmazonLWAConsentStatus$1(onResultAny), new CommonKt$getAmazonLWAConsentStatus$2(onResultAny));
    }

    public static final String getAppUserID() {
        return Purchases.Companion.getSharedInstance().getAppUserID();
    }

    public static final void getCurrentOfferingForPlacement(String str, OnNullableResult onNullableResult) {
        C6496s.h(str, "placementIdentifier");
        C6496s.h(onNullableResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new CommonKt$getCurrentOfferingForPlacement$1(onNullableResult), new CommonKt$getCurrentOfferingForPlacement$2(str, onNullableResult));
    }

    public static final void getCustomerInfo(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new CommonKt$getCustomerInfo$1(onResult), new CommonKt$getCustomerInfo$2(onResult));
    }

    public static final GoogleReplacementMode getGoogleReplacementMode(Integer num) {
        GoogleReplacementMode googleReplacementMode = null;
        if (num != null) {
            int intValue = num.intValue();
            GoogleReplacementMode[] values = GoogleReplacementMode.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                GoogleReplacementMode googleReplacementMode2 = values[i10];
                if (googleReplacementMode2.getPlayBillingClientMode() == intValue) {
                    googleReplacementMode = googleReplacementMode2;
                    break;
                }
                i10++;
            }
            if (googleReplacementMode == null) {
                throw new InvalidReplacementModeException();
            }
        }
        return googleReplacementMode;
    }

    public static final void getOfferings(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new CommonKt$getOfferings$1(onResult), new CommonKt$getOfferings$2(onResult));
    }

    public static final void getProductInfo(List<String> list, String str, OnResultList onResultList) {
        C6496s.h(list, "productIDs");
        C6496s.h(str, "type");
        C6496s.h(onResultList, "onResult");
        CommonKt$getProductInfo$onError$1 commonKt$getProductInfo$onError$1 = new CommonKt$getProductInfo$onError$1(onResultList);
        CommonKt$getProductInfo$onReceived$1 commonKt$getProductInfo$onReceived$1 = new CommonKt$getProductInfo$onReceived$1(onResultList);
        ProductType mapStringToProductType = mapStringToProductType(str);
        ProductType productType = ProductType.SUBS;
        if (mapStringToProductType == productType) {
            ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), list, productType, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), list, ProductType.INAPP, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        }
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", O.i());
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.Companion.getProxyURL());
    }

    /* access modifiers changed from: private */
    public static final p getPurchaseCompletedFunction(OnResult onResult) {
        return new CommonKt$getPurchaseCompletedFunction$1(onResult);
    }

    /* access modifiers changed from: private */
    public static final p getPurchaseErrorFunction(OnResult onResult) {
        return new CommonKt$getPurchaseErrorFunction$1(onResult);
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.Companion.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final boolean isAnonymous() {
        return Purchases.Companion.getSharedInstance().isAnonymous();
    }

    public static final boolean isWebPurchaseRedemptionURL(String str) {
        C6496s.h(str, "urlString");
        if (toWebPurchaseRedemption(str) != null) {
            return true;
        }
        return false;
    }

    public static final void logIn(String str, OnResult onResult) {
        C6496s.h(str, "appUserID");
        C6496s.h(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.Companion.getSharedInstance(), str, new CommonKt$logIn$1(onResult), new CommonKt$logIn$2(onResult));
    }

    public static final void logOut(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.Companion.getSharedInstance(), new CommonKt$logOut$1(onResult), new CommonKt$logOut$2(onResult));
    }

    public static final ProductType mapStringToProductType(String str) {
        MappedProductCategory mappedProductCategory;
        C6496s.h(str, "type");
        MappedProductCategory[] values = MappedProductCategory.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = values[i10];
            if (Sg.p.v(mappedProductCategory.getValue(), str, true)) {
                break;
            }
            i10++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C6496s.c(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (C6496s.c(lowerCase, "inapp")) {
            return ProductType.INAPP;
        }
        warnLog("Unrecognized product type: " + str + "... Defaulting to INAPP");
        return ProductType.INAPP;
    }

    public static final void purchasePackage(Activity activity, String str, Map<String, ? extends Object> map, String str2, Integer num, Boolean bool, OnResult onResult) {
        OnResult onResult2 = onResult;
        String str3 = str;
        C6496s.h(str, "packageIdentifier");
        Map<String, ? extends Object> map2 = map;
        C6496s.h(map, "presentedOfferingContext");
        C6496s.h(onResult2, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new CommonKt$purchasePackage$1(onResult2), new CommonKt$purchasePackage$2(map, onResult, activity, str2, googleReplacementMode, bool, str));
            } else {
                onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), (Map) null, 1, (Object) null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchasePackage."), (Map) null, 1, (Object) null));
        }
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        OnResult onResult2 = onResult;
        String str5 = str;
        C6496s.h(str, "productIdentifier");
        C6496s.h(str2, "type");
        C6496s.h(onResult2, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            ProductType mapStringToProductType = mapStringToProductType(str2);
            if (activity != null) {
                CommonKt$purchaseProduct$onReceiveStoreProducts$1 commonKt$purchaseProduct$onReceiveStoreProducts$1 = new CommonKt$purchaseProduct$onReceiveStoreProducts$1(activity, map, str4, googleReplacementMode, bool, onResult, str, mapStringToProductType, str3);
                ProductType productType = ProductType.SUBS;
                if (mapStringToProductType == productType) {
                    ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), C6565s.e((String) C6565s.o0(Sg.p.F0(str, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null))), productType, new CommonKt$purchaseProduct$1(onResult2), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                } else {
                    ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), C6565s.e(str), ProductType.INAPP, new CommonKt$purchaseProduct$2(onResult2), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                }
            } else {
                onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), (Map) null, 1, (Object) null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseProduct."), (Map) null, 1, (Object) null));
        }
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        OnResult onResult2 = onResult;
        String str4 = str;
        C6496s.h(str, "productIdentifier");
        String str5 = str2;
        C6496s.h(str2, "optionIdentifier");
        C6496s.h(onResult2, "onResult");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.getSharedInstance().getStore() != Store.PLAY_STORE) {
            onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store."), (Map) null, 1, (Object) null));
            return;
        }
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getProductsWith(companion.getSharedInstance(), C6565s.e(str), ProductType.SUBS, new CommonKt$purchaseSubscriptionOption$1(onResult2), new CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(activity, map, str3, bool, onResult, str, str2, googleReplacementMode));
                return;
            }
            onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), (Map) null, 1, (Object) null));
        } catch (InvalidReplacementModeException unused) {
            onResult2.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseSubscriptionOption."), (Map) null, 1, (Object) null));
        }
    }

    public static final void redeemWebPurchase(String str, OnResult onResult) {
        C6496s.h(str, "urlString");
        C6496s.h(onResult, "onResult");
        WebPurchaseRedemption webPurchaseRedemption = toWebPurchaseRedemption(str);
        if (webPurchaseRedemption == null) {
            onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Invalid URL for web purchase redemption", O.i()));
        } else {
            Purchases.Companion.getSharedInstance().redeemWebPurchase(webPurchaseRedemption, new a(onResult));
        }
    }

    /* access modifiers changed from: private */
    public static final void redeemWebPurchase$lambda$11(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        C6496s.h(onResult, "$onResult");
        C6496s.h(result, "result");
        Map n10 = O.n(C6502A.a("result", toResultName(result)));
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            n10.put("customerInfo", CustomerInfoMapperKt.map(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo()));
        } else if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            n10.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, PurchasesErrorKt.map$default(((RedeemWebPurchaseListener.Result.Error) result).getError(), (Map) null, 1, (Object) null));
        } else if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            n10.put("obfuscatedEmail", ((RedeemWebPurchaseListener.Result.Expired) result).getObfuscatedEmail());
        } else if (!C6496s.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            C6496s.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE);
        }
        onResult.onReceived(n10);
    }

    public static final void restorePurchases(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.Companion.getSharedInstance(), new CommonKt$restorePurchases$1(onResult), new CommonKt$restorePurchases$2(onResult));
    }

    @C6521e
    public static final void setAllowSharingAppStoreAccount(boolean z10) {
        Purchases.Companion.getSharedInstance().setAllowSharingPlayStoreAccount(z10);
    }

    @C6521e
    public static final void setDebugLogsEnabled(boolean z10) {
        Purchases.Companion.setDebugLogsEnabled(z10);
    }

    public static final void setLogHandler(C6798l lVar) {
        C6496s.h(lVar, "callback");
        Purchases.Companion.setLogHandler(new LogHandlerWithMapping(lVar));
    }

    public static final void setLogHandlerWithOnResult(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        setLogHandler(new CommonKt$setLogHandlerWithOnResult$1(onResult));
    }

    public static final void setLogLevel(String str) {
        C6496s.h(str, "level");
        try {
            Purchases.Companion.setLogLevel(LogLevel.valueOf(str));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + str);
        }
    }

    public static final void setProxyURLString(String str) {
        URL url;
        Purchases.Companion companion = Purchases.Companion;
        if (str != null) {
            url = new URL(str);
        } else {
            url = null;
        }
        companion.setProxyURL(url);
    }

    public static final void setPurchasesAreCompletedBy(String str) {
        C6496s.h(str, "purchasesAreCompletedBy");
        PurchasesAreCompletedBy purchasesAreCompletedBy = toPurchasesAreCompletedBy(str);
        if (purchasesAreCompletedBy != null) {
            Purchases.Companion.getSharedInstance().setPurchasesAreCompletedBy(purchasesAreCompletedBy);
        }
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, (List) null, 2, (Object) null);
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    public static final void syncAttributesAndOfferingsIfNeeded(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(Purchases.Companion.getSharedInstance(), new CommonKt$syncAttributesAndOfferingsIfNeeded$1(onResult), new CommonKt$syncAttributesAndOfferingsIfNeeded$2(onResult));
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.Companion.getSharedInstance(), (SyncPurchasesCallback) null, 1, (Object) null);
    }

    public static final PresentedOfferingContext toPresentedOfferingContext(Map<String, ? extends Object> map) {
        String str;
        String str2;
        Map map2;
        String str3;
        C6496s.h(map, "<this>");
        Object obj = map.get("offeringIdentifier");
        PresentedOfferingContext.TargetingContext targetingContext = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = map.get("targetingContext");
        if (obj3 instanceof Map) {
            map2 = (Map) obj3;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            Integer convertToInt = convertToInt(map2.get("revision"));
            Object obj4 = map2.get("ruleId");
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            } else {
                str3 = null;
            }
            if (!(convertToInt == null || str3 == null)) {
                targetingContext = new PresentedOfferingContext.TargetingContext(convertToInt.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    private static final PurchasesAreCompletedBy toPurchasesAreCompletedBy(String str) {
        try {
            return PurchasesAreCompletedBy.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static final String toResultName(RedeemWebPurchaseListener.Result result) {
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            return "SUCCESS";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            return "ERROR";
        }
        if (C6496s.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            return "PURCHASE_BELONGS_TO_OTHER_USER";
        }
        if (C6496s.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
            return "INVALID_TOKEN";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            return "EXPIRED";
        }
        throw new C6535s();
    }

    private static final WebPurchaseRedemption toWebPurchaseRedemption(String str) {
        try {
            return Purchases.Companion.parseAsWebPurchaseRedemption(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th2) {
            errorLog("Error parsing WebPurchaseRedemption from URL: " + str + ". Error: " + th2);
            return null;
        }
    }

    public static final void warnLog(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", str);
        }
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        configure$default(context, str, str2, str3, platformInfo2, (Store) null, (DangerousSettings) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, 2016, (Object) null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.Companion.getSharedInstance(), activity, (List) null, 2, (Object) null);
        } else {
            Purchases.Companion.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static final void syncPurchases(OnResult onResult) {
        C6496s.h(onResult, "onResult");
        ListenerConversionsKt.syncPurchasesWith(Purchases.Companion.getSharedInstance(), new CommonKt$syncPurchases$1(onResult), new CommonKt$syncPurchases$2(onResult));
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        Store store2 = store;
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        configure$default(context, str, str2, str3, platformInfo2, store2, (DangerousSettings) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, 1984, (Object) null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        Store store2 = store;
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        DangerousSettings dangerousSettings2 = dangerousSettings;
        C6496s.h(dangerousSettings2, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo2, store2, dangerousSettings2, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, 1920, (Object) null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        Store store2 = store;
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        DangerousSettings dangerousSettings2 = dangerousSettings;
        C6496s.h(dangerousSettings2, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo2, store2, dangerousSettings2, bool, (String) null, (Boolean) null, (Boolean) null, 1792, (Object) null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        Store store2 = store;
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        DangerousSettings dangerousSettings2 = dangerousSettings;
        C6496s.h(dangerousSettings2, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo2, store2, dangerousSettings2, bool, str4, (Boolean) null, (Boolean) null, 1536, (Object) null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2) {
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        PlatformInfo platformInfo2 = platformInfo;
        C6496s.h(platformInfo2, "platformInfo");
        Store store2 = store;
        C6496s.h(store2, ProductResponseJsonKeys.STORE);
        DangerousSettings dangerousSettings2 = dangerousSettings;
        C6496s.h(dangerousSettings2, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo2, store2, dangerousSettings2, bool, str4, bool2, (Boolean) null, 1024, (Object) null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3) {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        C6496s.h(context, "context");
        C6496s.h(str, "apiKey");
        C6496s.h(platformInfo, "platformInfo");
        C6496s.h(store, ProductResponseJsonKeys.STORE);
        C6496s.h(dangerousSettings, "dangerousSettings");
        Purchases.Companion.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder dangerousSettings2 = new PurchasesConfiguration.Builder(context, str).appUserID(str2).store(store).dangerousSettings(dangerousSettings);
        if (!(str3 == null || (purchasesAreCompletedBy = toPurchasesAreCompletedBy(str3)) == null)) {
            dangerousSettings2.purchasesAreCompletedBy(purchasesAreCompletedBy);
        }
        if (bool != null) {
            dangerousSettings2.showInAppMessagesAutomatically(bool.booleanValue());
        }
        if (str4 != null) {
            try {
                dangerousSettings2.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str4));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str4 + '.');
                C6514M m10 = C6514M.f71813a;
            }
        }
        if (bool2 != null) {
            dangerousSettings2.pendingTransactionsForPrepaidPlansEnabled(bool2.booleanValue());
        }
        if (bool3 != null) {
            dangerousSettings2.diagnosticsEnabled(bool3.booleanValue());
        }
        Purchases.Companion.configure(dangerousSettings2.build());
    }
}

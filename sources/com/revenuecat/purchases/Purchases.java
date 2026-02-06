package com.revenuecat.purchases;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.deeplinks.DeepLinkParser;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.utils.DefaultIsDebugBuildProvider;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6513L;
import lf.C6521e;
import lf.C6535s;
import mf.C6565s;
import mf.Y;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¶\u00012\u00020\u0001:\u0002¶\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0019\u001a\u00020!¢\u0006\u0004\b\"\u0010#J/\u0010\"\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020!¢\u0006\u0004\b\"\u0010&J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020)¢\u0006\u0004\b*\u0010+J'\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020)H\u0007¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020)H\u0007¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u000206¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b=\u00108J\r\u0010>\u001a\u00020\u0006¢\u0006\u0004\b>\u0010\bJ\u0015\u0010?\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u000206¢\u0006\u0004\b?\u00108J\u001d\u0010?\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0019\u001a\u000206¢\u0006\u0004\b?\u0010BJ\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\bJ'\u0010F\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u001fH\u0007¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0006¢\u0006\u0004\bH\u0010\bJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020MH\u0000¢\u0006\u0004\bN\u0010OJ#\u0010S\u001a\u00020\u00062\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0Q¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00062\b\u0010U\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bY\u0010WJ\u0017\u0010[\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b[\u0010WJ\u0017\u0010]\u001a\u00020\u00062\b\u0010\\\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b]\u0010WJ\u0017\u0010_\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b_\u0010WJ\u0017\u0010a\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\ba\u0010WJ\u0017\u0010c\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bc\u0010WJ\u0017\u0010e\u001a\u00020\u00062\b\u0010d\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\be\u0010WJ\u0017\u0010g\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bg\u0010WJ\u0017\u0010i\u001a\u00020\u00062\b\u0010h\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bi\u0010WJ\r\u0010j\u001a\u00020\u0006¢\u0006\u0004\bj\u0010\bJ\u0017\u0010l\u001a\u00020\u00062\b\u0010k\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bl\u0010WJ\u0017\u0010n\u001a\u00020\u00062\b\u0010m\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bn\u0010WJ\u0017\u0010p\u001a\u00020\u00062\b\u0010o\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bp\u0010WJ\u0017\u0010r\u001a\u00020\u00062\b\u0010q\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\br\u0010WJ\u0017\u0010t\u001a\u00020\u00062\b\u0010s\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bt\u0010WJ\u0017\u0010v\u001a\u00020\u00062\b\u0010u\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bv\u0010WJ\u0017\u0010x\u001a\u00020\u00062\b\u0010w\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bx\u0010WJ\u0017\u0010z\u001a\u00020\u00062\b\u0010y\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bz\u0010WJ\u0017\u0010|\u001a\u00020\u00062\b\u0010{\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b|\u0010WJ\u0017\u0010~\u001a\u00020\u00062\b\u0010}\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b~\u0010WJ\u0019\u0010\u0001\u001a\u00020\u00062\b\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0005\b\u0001\u0010WJ\u001a\u0010\u0001\u001a\u00020\u00062\t\u0010\u0001\u001a\u0004\u0018\u00010\u000e¢\u0006\u0005\b\u0001\u0010WJ'\u0010\u0001\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0019\u001a\u00020!H\u0007¢\u0006\u0005\b\u0001\u0010#J'\u0010\u0001\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0019\u001a\u00020!H\u0007¢\u0006\u0005\b\u0001\u0010#J\u0019\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0019\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u000b\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00018F@FX\u000e¢\u0006\u0017\u0012\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00018F@FX\u000e¢\u0006\u0017\u0012\u0005\b\u0001\u0010\b\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R,\u0010¥\u0001\u001a\u00030 \u00012\b\u0010\u0001\u001a\u00030 \u00018F@FX\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u0014\u0010¨\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b©\u0001\u0010§\u0001R0\u0010°\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010«\u00018F@FX\u000e¢\u0006\u0010\u001a\u0006\b¬\u0001\u0010­\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u0015\u0010±\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b±\u0001\u0010\u0001R\u0015\u0010µ\u0001\u001a\u00030²\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001¨\u0006·\u0001"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "purchasesOrchestrator", "<init>", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V", "Llf/M;", "onAppBackgrounded", "()V", "onAppForegrounded", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "listener", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncObserverModeAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "syncAmazonPurchase", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "callback", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "", "productIds", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "purchaseProduct", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackage", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfigData$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V", "getCustomerCenterConfigData", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "tenjinAnalyticsInstallationID", "setTenjinAnalyticsInstallationID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "kochavaDeviceID", "setKochavaDeviceID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "getSubscriptionSkus", "getNonSubscriptionSkus", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatus", "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "redeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getPurchasesOrchestrator$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesOrchestrator;", "", "value", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "getFinishTransactions$annotations", "finishTransactions", "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "getAllowSharingPlayStoreAccount$annotations", "allowSharingPlayStoreAccount", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "getCurrentConfiguration", "()Lcom/revenuecat/purchases/PurchasesConfiguration;", "currentConfiguration", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "purchasesAreCompletedBy", "getAppUserID", "()Ljava/lang/String;", "appUserID", "getStorefrontCountryCode", "storefrontCountryCode", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "store", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Purchases implements LifecycleDelegate {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static /* synthetic */ Purchases backingFieldSharedInstance;
    /* access modifiers changed from: private */
    public static final String frameworkVersion = "8.12.2";
    private final PurchasesOrchestrator purchasesOrchestrator;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@FX\u000e¢\u0006\u0012\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010)\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178F@FX\u000e¢\u0006\u0012\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00100\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020*8F@FX\u000e¢\u0006\u0012\u0012\u0004\b/\u0010\u0003\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00107\u001a\u0002012\u0006\u0010\u001d\u001a\u0002018F@FX\u000e¢\u0006\u0012\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010=\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e8F@AX\u000e¢\u0006\u0012\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010>\u001a\u00020\t8\u0006XD¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010\u0003\u001a\u0004\b@\u0010AR.\u0010I\u001a\u0004\u0018\u00010C2\b\u0010\u001d\u001a\u0004\u0018\u00010C8F@FX\u000e¢\u0006\u0012\u0012\u0004\bH\u0010\u0003\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010J\u001a\u00020\u00178FX\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0003\u001a\u0004\bJ\u0010%R$\u0010L\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u00109\"\u0004\bO\u0010;¨\u0006P"}, d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "parseAsWebPurchaseRedemption", "(Landroid/content/Intent;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "", "string", "(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/Purchases;", "configure", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)Lcom/revenuecat/purchases/Purchases;", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Llf/M;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "value", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "getPlatformInfo$annotations", "platformInfo", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "getDebugLogsEnabled$annotations", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "getLogLevel$annotations", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "getLogHandler$annotations", "logHandler", "getSharedInstance", "()Lcom/revenuecat/purchases/Purchases;", "setSharedInstance$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Purchases;)V", "getSharedInstance$annotations", "sharedInstance", "frameworkVersion", "Ljava/lang/String;", "getFrameworkVersion", "()Ljava/lang/String;", "getFrameworkVersion$annotations", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "getProxyURL$annotations", "proxyURL", "isConfigured", "isConfigured$annotations", "backingFieldSharedInstance", "Lcom/revenuecat/purchases/Purchases;", "getBackingFieldSharedInstance$purchases_defaultsRelease", "setBackingFieldSharedInstance$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = C6565s.n();
            }
            companion.canMakePayments(context, list, callback);
        }

        @C6521e
        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            C6496s.h(context, "context");
            C6496s.h(callback, "callback");
            canMakePayments$default(this, context, (List) null, callback, 2, (Object) null);
        }

        public final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
            PurchasesConfiguration purchasesConfiguration2;
            PurchasesOrchestrator purchasesOrchestrator$purchases_defaultsRelease;
            C6496s.h(purchasesConfiguration, "configuration");
            if (isConfigured()) {
                Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
                if (backingFieldSharedInstance$purchases_defaultsRelease == null || (purchasesOrchestrator$purchases_defaultsRelease = backingFieldSharedInstance$purchases_defaultsRelease.getPurchasesOrchestrator$purchases_defaultsRelease()) == null) {
                    purchasesConfiguration2 = null;
                } else {
                    purchasesConfiguration2 = purchasesOrchestrator$purchases_defaultsRelease.getCurrentConfiguration();
                }
                if (C6496s.c(purchasesConfiguration2, purchasesConfiguration)) {
                    LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS_WITH_SAME_CONFIG);
                    return getSharedInstance();
                }
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            Purchases createPurchases$default = PurchasesFactory.createPurchases$default(new PurchasesFactory(new DefaultIsDebugBuildProvider(purchasesConfiguration.getContext()), (APIKeyValidator) null, 2, (DefaultConstructorMarker) null), purchasesConfiguration, getPlatformInfo(), getProxyURL(), (BillingAbstract) null, false, false, false, 120, (Object) null);
            Purchases.Companion.setSharedInstance$purchases_defaultsRelease(createPurchases$default);
            return createPurchases$default;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_defaultsRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return PurchasesOrchestrator.Companion.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.Companion.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.Companion.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.Companion.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.Companion.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                return backingFieldSharedInstance$purchases_defaultsRelease;
            }
            throw new C6513L(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            if (getBackingFieldSharedInstance$purchases_defaultsRelease() != null) {
                return true;
            }
            return false;
        }

        public final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
            C6496s.h(intent, "intent");
            Uri data = intent.getData();
            if (data == null) {
                return null;
            }
            return DeepLinkParser.INSTANCE.parseWebPurchaseRedemption(data);
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            PurchasesOrchestrator.Companion.setDebugLogsEnabled(z10);
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            C6496s.h(logHandler, "value");
            PurchasesOrchestrator.Companion.setLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            C6496s.h(logLevel, "value");
            PurchasesOrchestrator.Companion.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            C6496s.h(platformInfo, "value");
            PurchasesOrchestrator.Companion.setPlatformInfo(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.Companion.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            C6496s.h(purchases, "value");
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                backingFieldSharedInstance$purchases_defaultsRelease.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsRelease(purchases);
        }

        private Companion() {
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            C6496s.h(context, "context");
            C6496s.h(list, "features");
            C6496s.h(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator$purchases_defaultsRelease().getAppConfig().getStore() != Store.PLAY_STORE) {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
                return;
            }
            PurchasesOrchestrator.Companion.canMakePayments(context, list, callback);
        }

        public final WebPurchaseRedemption parseAsWebPurchaseRedemption(String str) {
            C6496s.h(str, "string");
            try {
                Uri parse = Uri.parse(str);
                DeepLinkParser deepLinkParser = DeepLinkParser.INSTANCE;
                C6496s.g(parse, "uri");
                return deepLinkParser.parseWebPurchaseRedemption(parse);
            } catch (Throwable th2) {
                LogUtilsKt.errorLog("Error parsing URL: " + str, th2);
                return null;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.revenuecat.purchases.PurchasesAreCompletedBy[] r0 = com.revenuecat.purchases.PurchasesAreCompletedBy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.Purchases.WhenMappings.<clinit>():void");
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator2) {
        C6496s.h(purchasesOrchestrator2, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator2;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return Companion.configure(purchasesConfiguration);
    }

    @C6521e
    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    public static final boolean getDebugLogsEnabled() {
        return Companion.getDebugLogsEnabled();
    }

    @C6521e
    public static /* synthetic */ void getFinishTransactions$annotations() {
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        LogHandler logHandler;
        synchronized (Purchases.class) {
            logHandler = Companion.getLogHandler();
        }
        return logHandler;
    }

    public static final LogLevel getLogLevel() {
        return Companion.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    public static final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
        return Companion.parseAsWebPurchaseRedemption(intent);
    }

    public static final void setDebugLogsEnabled(boolean z10) {
        Companion.setDebugLogsEnabled(z10);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        synchronized (Purchases.class) {
            Companion.setLogHandler(logHandler);
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        Companion.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        Companion.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    public static final void setSharedInstance$purchases_defaultsRelease(Purchases purchases) {
        Companion.setSharedInstance$purchases_defaultsRelease(purchases);
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = C6565s.e(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(Purchases purchases, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        C6496s.h(getAmazonLWAConsentStatusCallback, "callback");
        this.purchasesOrchestrator.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusCallback);
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.purchasesOrchestrator.getCurrentConfiguration();
    }

    public final void getCustomerCenterConfigData$purchases_defaultsRelease(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        C6496s.h(getCustomerCenterConfigCallback, "callback");
        this.purchasesOrchestrator.getCustomerCenterConfig(getCustomerCenterConfigCallback);
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(CacheFetchPolicy.Companion.m26default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    @C6521e
    public final void getNonSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        C6496s.h(list, "productIds");
        C6496s.h(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(C6565s.j1(list), Y.d(ProductType.INAPP), getStoreProductsCallback);
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback) {
        C6496s.h(receiveOfferingsCallback, "listener");
        PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, receiveOfferingsCallback, false, 2, (Object) null);
    }

    public final void getProducts(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        C6496s.h(list, "productIds");
        C6496s.h(getStoreProductsCallback, "callback");
        getProducts(list, (ProductType) null, getStoreProductsCallback);
    }

    public final synchronized PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        try {
            if (this.purchasesOrchestrator.getFinishTransactions()) {
                purchasesAreCompletedBy = PurchasesAreCompletedBy.REVENUECAT;
            } else {
                purchasesAreCompletedBy = PurchasesAreCompletedBy.MY_APP;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return purchasesAreCompletedBy;
    }

    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator$purchases_defaultsRelease() {
        return this.purchasesOrchestrator;
    }

    public final Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final synchronized String getStorefrontCountryCode() {
        return this.purchasesOrchestrator.getStorefrontCountryCode();
    }

    @C6521e
    public final void getSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        C6496s.h(list, "productIds");
        C6496s.h(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(C6565s.j1(list), Y.d(ProductType.SUBS), getStoreProductsCallback);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(String str) {
        C6496s.h(str, "newAppUserID");
        logIn$default(this, str, (LogInCallback) null, 2, (Object) null);
    }

    public final void logOut() {
        logOut$default(this, (ReceiveCustomerInfoCallback) null, 1, (Object) null);
    }

    @C6521e
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @C6521e
    public void onAppForegrounded() {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        C6496s.h(purchaseParams, "purchaseParams");
        C6496s.h(purchaseCallback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, purchaseCallback);
    }

    @C6521e
    public final void purchasePackage(Activity activity, Package packageR, PurchaseCallback purchaseCallback) {
        C6496s.h(activity, "activity");
        C6496s.h(packageR, "packageToPurchase");
        C6496s.h(purchaseCallback, "listener");
        this.purchasesOrchestrator.startPurchase(activity, packageR.getProduct().getPurchasingData(), packageR.getPresentedOfferingContext(), (Boolean) null, purchaseCallback);
    }

    @C6521e
    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback purchaseCallback) {
        C6496s.h(activity, "activity");
        C6496s.h(storeProduct, "storeProduct");
        C6496s.h(purchaseCallback, "callback");
        this.purchasesOrchestrator.startPurchase(activity, storeProduct.getPurchasingData(), (PresentedOfferingContext) null, (Boolean) null, purchaseCallback);
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        C6496s.h(webPurchaseRedemption, "webPurchaseRedemption");
        C6496s.h(redeemWebPurchaseListener, "listener");
        this.purchasesOrchestrator.redeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.restorePurchases(receiveCustomerInfoCallback);
    }

    public final void setAd(String str) {
        this.purchasesOrchestrator.setAd(str);
    }

    public final void setAdGroup(String str) {
        this.purchasesOrchestrator.setAdGroup(str);
    }

    public final void setAdjustID(String str) {
        this.purchasesOrchestrator.setAdjustID(str);
    }

    public final void setAirshipChannelID(String str) {
        this.purchasesOrchestrator.setAirshipChannelID(str);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z10);
    }

    public final void setAppsflyerID(String str) {
        this.purchasesOrchestrator.setAppsflyerID(str);
    }

    public final void setAttributes(Map<String, String> map) {
        C6496s.h(map, "attributes");
        this.purchasesOrchestrator.setAttributes(map);
    }

    public final void setCampaign(String str) {
        this.purchasesOrchestrator.setCampaign(str);
    }

    public final void setCleverTapID(String str) {
        this.purchasesOrchestrator.setCleverTapID(str);
    }

    public final void setCreative(String str) {
        this.purchasesOrchestrator.setCreative(str);
    }

    public final void setDisplayName(String str) {
        this.purchasesOrchestrator.setDisplayName(str);
    }

    public final void setEmail(String str) {
        this.purchasesOrchestrator.setEmail(str);
    }

    public final void setFBAnonymousID(String str) {
        this.purchasesOrchestrator.setFBAnonymousID(str);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.purchasesOrchestrator.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String str) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(str);
    }

    public final void setKeyword(String str) {
        this.purchasesOrchestrator.setKeyword(str);
    }

    public final void setKochavaDeviceID(String str) {
        this.purchasesOrchestrator.setKochavaDeviceID(str);
    }

    public final void setMediaSource(String str) {
        this.purchasesOrchestrator.setMediaSource(str);
    }

    public final void setMixpanelDistinctID(String str) {
        this.purchasesOrchestrator.setMixpanelDistinctID(str);
    }

    public final void setMparticleID(String str) {
        this.purchasesOrchestrator.setMparticleID(str);
    }

    public final void setOnesignalID(String str) {
        this.purchasesOrchestrator.setOnesignalID(str);
    }

    public final void setOnesignalUserID(String str) {
        this.purchasesOrchestrator.setOnesignalUserID(str);
    }

    public final void setPhoneNumber(String str) {
        this.purchasesOrchestrator.setPhoneNumber(str);
    }

    public final synchronized void setPurchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
        try {
            C6496s.h(purchasesAreCompletedBy, "value");
            PurchasesOrchestrator purchasesOrchestrator2 = this.purchasesOrchestrator;
            int i10 = WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    z10 = false;
                } else {
                    throw new C6535s();
                }
            }
            purchasesOrchestrator2.setFinishTransactions(z10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void setPushToken(String str) {
        this.purchasesOrchestrator.setPushToken(str);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        this.purchasesOrchestrator.setTenjinAnalyticsInstallationID(str);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        C6496s.h(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, (List) null, 2, (Object) null);
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        C6496s.h(str, "productID");
        C6496s.h(str2, "receiptID");
        C6496s.h(str3, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(str, str2, str3, str4, d10);
    }

    public final void syncAttributesAndOfferingsIfNeeded(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        C6496s.h(syncAttributesAndOfferingsCallback, "callback");
        this.purchasesOrchestrator.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsCallback);
    }

    @C6521e
    public final void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        C6496s.h(str, "productID");
        C6496s.h(str2, "receiptID");
        C6496s.h(str3, "amazonUserID");
        syncAmazonPurchase(str, str2, str3, str4, d10);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, (SyncPurchasesCallback) null, 1, (Object) null);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final /* synthetic */ void track(FeatureEvent featureEvent) {
        C6496s.h(featureEvent, "event");
        this.purchasesOrchestrator.track(featureEvent);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public static final WebPurchaseRedemption parseAsWebPurchaseRedemption(String str) {
        return Companion.parseAsWebPurchaseRedemption(str);
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(cacheFetchPolicy, "fetchPolicy");
        C6496s.h(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(cacheFetchPolicy, receiveCustomerInfoCallback);
    }

    public final void getProducts(List<String> list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        C6496s.h(list, "productIds");
        C6496s.h(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        C6496s.h(str, "newAppUserID");
        this.purchasesOrchestrator.logIn(str, logInCallback);
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        C6496s.h(activity, "activity");
        C6496s.h(list, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, list);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }
}

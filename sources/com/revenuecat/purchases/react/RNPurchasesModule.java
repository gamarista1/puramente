package com.revenuecat.purchases.react;

import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import com.revenuecat.purchases.hybridcommon.OnNullableResult;
import com.revenuecat.purchases.hybridcommon.OnResult;
import com.revenuecat.purchases.hybridcommon.OnResultAny;
import com.revenuecat.purchases.hybridcommon.OnResultList;
import com.revenuecat.purchases.hybridcommon.SubscriberAttributesKt;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.InAppMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lf.C6513L;
import lf.C6514M;

public class RNPurchasesModule extends ReactContextBaseJavaModule implements UpdatedCustomerInfoListener {
    private static final String CUSTOMER_INFO_UPDATED = "Purchases-CustomerInfoUpdated";
    private static final String LOG_HANDLER_EVENT = "Purchases-LogHandlerEvent";
    public static final String PLATFORM_NAME = "react-native";
    public static final String PLUGIN_VERSION = "8.6.2";
    private final ReactApplicationContext reactContext;

    public RNPurchasesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private OnNullableResult getOnNullableResult(final Promise promise) {
        return new OnNullableResult() {
            public void onError(ErrorContainer errorContainer) {
                Promise promise = promise;
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }

            public void onReceived(Map<String, ?> map) {
                if (map != null) {
                    promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(map));
                } else {
                    promise.resolve((Object) null);
                }
            }
        };
    }

    private OnResult getOnResult(final Promise promise) {
        return new OnResult() {
            public void onError(ErrorContainer errorContainer) {
                Promise promise = promise;
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }

            public void onReceived(Map<String, ?> map) {
                promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(map));
            }
        };
    }

    private static GoogleUpgradeInfo getUpgradeInfo(ReadableMap readableMap) {
        Integer num;
        String str;
        String str2 = null;
        if (readableMap != null) {
            if (readableMap.hasKey("oldProductIdentifier")) {
                str = readableMap.getString("oldProductIdentifier");
            } else {
                str = null;
            }
            if (readableMap.hasKey(b.f37489l)) {
                num = Integer.valueOf(readableMap.getInt(b.f37489l));
            } else {
                num = null;
            }
            if (str != null) {
                str2 = str;
            } else if (readableMap.hasKey("oldSKU")) {
                str2 = readableMap.getString("oldSKU");
            }
        } else {
            num = null;
        }
        return new GoogleUpgradeInfo(str2, num);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$setLogHandler$0(Map map) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(LOG_HANDLER_EVENT, RNPurchasesConverters.convertMapToWriteableMap(map));
        return null;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void canMakePayments(ReadableArray readableArray, final Promise promise) {
        ArrayList arrayList = new ArrayList();
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                arrayList.add(Integer.valueOf(readableArray.getInt(i10)));
            }
        }
        CommonKt.canMakePayments(this.reactContext, arrayList, new OnResultAny<Boolean>() {
            public void onError(ErrorContainer errorContainer) {
                Promise promise = promise;
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }

            public void onReceived(Boolean bool) {
                promise.resolve(bool);
            }
        });
    }

    @ReactMethod
    public void checkTrialOrIntroductoryPriceEligibility(ReadableArray readableArray, Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(readableArray.getString(i10));
        }
        promise.resolve(RNPurchasesConverters.convertMapToWriteableMap(CommonKt.checkTrialOrIntroductoryPriceEligibility(arrayList)));
    }

    @ReactMethod
    public void collectDeviceIdentifiers() {
        SubscriberAttributesKt.collectDeviceIdentifiers();
    }

    @ReactMethod
    public void getAppUserID(Promise promise) {
        promise.resolve(CommonKt.getAppUserID());
    }

    @ReactMethod
    public void getCurrentOfferingForPlacement(String str, Promise promise) {
        CommonKt.getCurrentOfferingForPlacement(str, getOnNullableResult(promise));
    }

    @ReactMethod
    public void getCustomerInfo(Promise promise) {
        CommonKt.getCustomerInfo(getOnResult(promise));
    }

    public String getName() {
        return "RNPurchases";
    }

    @ReactMethod
    public void getOfferings(Promise promise) {
        CommonKt.getOfferings(getOnResult(promise));
    }

    @ReactMethod
    public void getProductInfo(ReadableArray readableArray, String str, final Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(readableArray.getString(i10));
        }
        CommonKt.getProductInfo(arrayList, str, new OnResultList() {
            public void onError(ErrorContainer errorContainer) {
                Promise promise = promise;
                promise.reject(errorContainer.getCode() + "", errorContainer.getMessage(), RNPurchasesConverters.convertMapToWriteableMap(errorContainer.getInfo()));
            }

            public void onReceived(List<Map<String, ?>> list) {
                WritableArray createArray = Arguments.createArray();
                for (Map<String, ?> convertMapToWriteableMap : list) {
                    createArray.pushMap(RNPurchasesConverters.convertMapToWriteableMap(convertMapToWriteableMap));
                }
                promise.resolve(createArray);
            }
        });
    }

    @ReactMethod
    public void invalidateCustomerInfoCache() {
        CommonKt.invalidateCustomerInfoCache();
    }

    @ReactMethod
    public void isAnonymous(Promise promise) {
        promise.resolve(Boolean.valueOf(CommonKt.isAnonymous()));
    }

    @ReactMethod
    public void isConfigured(Promise promise) {
        promise.resolve(Boolean.valueOf(Purchases.isConfigured()));
    }

    @ReactMethod
    public void isWebPurchaseRedemptionURL(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(CommonKt.isWebPurchaseRedemptionURL(str)));
    }

    @ReactMethod
    public void logIn(String str, Promise promise) {
        CommonKt.logIn(str, getOnResult(promise));
    }

    @ReactMethod
    public void logOut(Promise promise) {
        CommonKt.logOut(getOnResult(promise));
    }

    public void onCatalystInstanceDestroy() {
        try {
            Purchases.getSharedInstance().close();
        } catch (C6513L unused) {
        }
    }

    public void onReceived(CustomerInfo customerInfo) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CUSTOMER_INFO_UPDATED, RNPurchasesConverters.convertMapToWriteableMap(CustomerInfoMapperKt.map(customerInfo)));
    }

    @ReactMethod
    public void purchasePackage(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, ReadableMap readableMap3, Promise promise) {
        Boolean bool;
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap2);
        if (readableMap3 == null || !readableMap3.hasKey("isPersonalizedPrice")) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readableMap3.getBoolean("isPersonalizedPrice"));
        }
        Boolean bool2 = bool;
        String str3 = str;
        CommonKt.purchasePackage(getCurrentActivity(), str3, readableMap.toHashMap(), upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), bool2, getOnResult(promise));
    }

    @ReactMethod
    public void purchaseProduct(String str, ReadableMap readableMap, String str2, String str3, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise) {
        Boolean bool;
        ReadableMap readableMap4 = readableMap2;
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap);
        HashMap<String, Object> hashMap = null;
        if (readableMap4 == null || !readableMap4.hasKey("isPersonalizedPrice")) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readableMap4.getBoolean("isPersonalizedPrice"));
        }
        if (readableMap3 != null) {
            hashMap = readableMap3.toHashMap();
        }
        CommonKt.purchaseProduct(getCurrentActivity(), str, str2, (String) null, upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), bool, hashMap, getOnResult(promise));
    }

    @ReactMethod
    public void purchaseSubscriptionOption(String str, String str2, ReadableMap readableMap, String str3, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise) {
        Boolean bool;
        GoogleUpgradeInfo upgradeInfo = getUpgradeInfo(readableMap);
        HashMap<String, Object> hashMap = null;
        if (readableMap2 == null || !readableMap2.hasKey("isPersonalizedPrice")) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readableMap2.getBoolean("isPersonalizedPrice"));
        }
        if (readableMap3 != null) {
            hashMap = readableMap3.toHashMap();
        }
        CommonKt.purchaseSubscriptionOption(getCurrentActivity(), str, str2, upgradeInfo.getOldProductIdentifier(), upgradeInfo.getProrationMode(), bool, hashMap, getOnResult(promise));
    }

    @ReactMethod
    public void redeemWebPurchase(String str, Promise promise) {
        CommonKt.redeemWebPurchase(str, getOnResult(promise));
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void restorePurchases(Promise promise) {
        CommonKt.restorePurchases(getOnResult(promise));
    }

    @ReactMethod
    public void setAd(String str) {
        SubscriberAttributesKt.setAd(str);
    }

    @ReactMethod
    public void setAdGroup(String str) {
        SubscriberAttributesKt.setAdGroup(str);
    }

    @ReactMethod
    public void setAdjustID(String str) {
        SubscriberAttributesKt.setAdjustID(str);
    }

    @ReactMethod
    public void setAirshipChannelID(String str) {
        SubscriberAttributesKt.setAirshipChannelID(str);
    }

    @ReactMethod
    public void setAllowSharingStoreAccount(boolean z10) {
        CommonKt.setAllowSharingAppStoreAccount(z10);
    }

    @ReactMethod
    public void setAppsflyerID(String str) {
        SubscriberAttributesKt.setAppsflyerID(str);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap) {
        SubscriberAttributesKt.setAttributes(readableMap.toHashMap());
    }

    @ReactMethod
    public void setCampaign(String str) {
        SubscriberAttributesKt.setCampaign(str);
    }

    @ReactMethod
    public void setCleverTapID(String str) {
        SubscriberAttributesKt.setCleverTapID(str);
    }

    @ReactMethod
    public void setCreative(String str) {
        SubscriberAttributesKt.setCreative(str);
    }

    @Deprecated
    @ReactMethod
    public void setDebugLogsEnabled(boolean z10) {
        CommonKt.setDebugLogsEnabled(z10);
    }

    @ReactMethod
    public void setDisplayName(String str) {
        SubscriberAttributesKt.setDisplayName(str);
    }

    @ReactMethod
    public void setEmail(String str) {
        SubscriberAttributesKt.setEmail(str);
    }

    @ReactMethod
    public void setFBAnonymousID(String str) {
        SubscriberAttributesKt.setFBAnonymousID(str);
    }

    @ReactMethod
    public void setFirebaseAppInstanceID(String str) {
        SubscriberAttributesKt.setFirebaseAppInstanceID(str);
    }

    @ReactMethod
    public void setKeyword(String str) {
        SubscriberAttributesKt.setKeyword(str);
    }

    @ReactMethod
    public void setKochavaDeviceID(String str) {
        SubscriberAttributesKt.setKochavaDeviceID(str);
    }

    @ReactMethod
    public void setLogHandler() {
        CommonKt.setLogHandler(new a(this));
    }

    @ReactMethod
    public void setLogLevel(String str) {
        CommonKt.setLogLevel(str);
    }

    @ReactMethod
    public void setMediaSource(String str) {
        SubscriberAttributesKt.setMediaSource(str);
    }

    @ReactMethod
    public void setMixpanelDistinctID(String str) {
        SubscriberAttributesKt.setMixpanelDistinctID(str);
    }

    @ReactMethod
    public void setMparticleID(String str) {
        SubscriberAttributesKt.setMparticleID(str);
    }

    @ReactMethod
    public void setOnesignalID(String str) {
        SubscriberAttributesKt.setOnesignalID(str);
    }

    @ReactMethod
    public void setPhoneNumber(String str) {
        SubscriberAttributesKt.setPhoneNumber(str);
    }

    @ReactMethod
    public void setProxyURLString(String str, Promise promise) {
        CommonKt.setProxyURLString(str);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setPushToken(String str) {
        SubscriberAttributesKt.setPushToken(str);
    }

    @ReactMethod
    public void setTenjinAnalyticsInstallationID(String str) {
        SubscriberAttributesKt.setTenjinAnalyticsInstallationID(str);
    }

    @ReactMethod
    public void setupPurchases(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, String str6, boolean z12, boolean z13) {
        PlatformInfo platformInfo = new PlatformInfo(PLATFORM_NAME, PLUGIN_VERSION);
        Store store = Store.PLAY_STORE;
        if (z10) {
            store = Store.AMAZON;
        }
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        CommonKt.configure(this.reactContext, str7, str8, str9, platformInfo, store, new DangerousSettings(), Boolean.valueOf(z11), str6, Boolean.valueOf(z12), Boolean.valueOf(z13));
        Purchases.getSharedInstance().setUpdatedCustomerInfoListener(this);
    }

    @ReactMethod
    public void showInAppMessages(ReadableArray readableArray, Promise promise) {
        InAppMessageType inAppMessageType;
        if (readableArray == null) {
            CommonKt.showInAppMessagesIfNeeded(getCurrentActivity());
        } else {
            ArrayList arrayList = new ArrayList();
            InAppMessageType[] values = InAppMessageType.values();
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                int i11 = readableArray.getInt(i10);
                if (i11 < values.length) {
                    inAppMessageType = values[i11];
                } else {
                    inAppMessageType = null;
                }
                if (inAppMessageType != null) {
                    arrayList.add(inAppMessageType);
                } else {
                    Log.e("RNPurchases", "Invalid in-app message type: " + i11);
                }
            }
            CommonKt.showInAppMessagesIfNeeded(getCurrentActivity(), arrayList);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d10, Promise promise) {
        Purchases.getSharedInstance().syncAmazonPurchase(str, str2, str3, str4, d10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void syncAttributesAndOfferingsIfNeeded(Promise promise) {
        CommonKt.syncAttributesAndOfferingsIfNeeded(getOnResult(promise));
    }

    @Deprecated
    @ReactMethod
    public void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d10, Promise promise) {
        syncAmazonPurchase(str, str2, str3, str4, d10, promise);
    }

    @ReactMethod
    public void syncPurchases() {
        CommonKt.syncPurchases();
    }
}

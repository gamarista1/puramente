package com.adjust.nativemodule;

import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.AdjustAdRevenue;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustDeeplink;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustTestOptions;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.Constants;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAmazonAdIdReadListener;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;

public class Adjust extends ReactContextBaseJavaModule implements OnAttributionChangedListener, OnEventTrackingSucceededListener, OnEventTrackingFailedListener, OnSessionTrackingSucceededListener, OnSessionTrackingFailedListener, OnDeferredDeeplinkResponseListener {
    private static String TAG = "AdjustBridge";
    private boolean isAttributionCallbackImplemented;
    private boolean isDeferredDeeplinkCallbackImplemented;
    private boolean isDeferredDeeplinkOpeningEnabled = true;
    private boolean isEventTrackingFailedCallbackImplemented;
    private boolean isEventTrackingSucceededCallbackImplemented;
    private boolean isSessionTrackingFailedCallbackImplemented;
    private boolean isSessionTrackingSucceededCallbackImplemented;

    class a implements OnLastDeeplinkReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36776a;

        a(Callback callback) {
            this.f36776a = callback;
        }

        public void onLastDeeplinkRead(Uri uri) {
            String str;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = "";
            }
            this.f36776a.invoke(str);
        }
    }

    class b implements OnAdidReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36778a;

        b(Callback callback) {
            this.f36778a = callback;
        }

        public void onAdidRead(String str) {
            this.f36778a.invoke(str);
        }
    }

    class c implements OnGoogleAdIdReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36780a;

        c(Callback callback) {
            this.f36780a = callback;
        }

        public void onGoogleAdIdRead(String str) {
            this.f36780a.invoke(str);
        }
    }

    class d implements OnAmazonAdIdReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36782a;

        d(Callback callback) {
            this.f36782a = callback;
        }

        public void onAmazonAdIdRead(String str) {
            this.f36782a.invoke(str);
        }
    }

    class e implements OnAttributionReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36784a;

        e(Callback callback) {
            this.f36784a = callback;
        }

        public void onAttributionRead(AdjustAttribution adjustAttribution) {
            this.f36784a.invoke(a.a(adjustAttribution));
        }
    }

    class f implements OnIsEnabledListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36786a;

        f(Callback callback) {
            this.f36786a = callback;
        }

        public void onIsEnabledRead(boolean z10) {
            this.f36786a.invoke(Boolean.valueOf(z10));
        }
    }

    class g implements OnSdkVersionReadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36789b;

        g(Callback callback, String str) {
            this.f36788a = callback;
            this.f36789b = str;
        }

        public void onSdkVersionRead(String str) {
            if (str == null) {
                this.f36788a.invoke("");
                return;
            }
            Callback callback = this.f36788a;
            callback.invoke(this.f36789b + "@" + str);
        }
    }

    class h implements OnPurchaseVerificationFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36791a;

        h(Callback callback) {
            this.f36791a = callback;
        }

        public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            String str;
            if (this.f36791a != null) {
                WritableMap createMap = Arguments.createMap();
                if (adjustPurchaseVerificationResult == null) {
                    this.f36791a.invoke(createMap);
                    return;
                }
                String str2 = "";
                if (adjustPurchaseVerificationResult.getVerificationStatus() != null) {
                    str = adjustPurchaseVerificationResult.getVerificationStatus();
                } else {
                    str = str2;
                }
                createMap.putString("verificationStatus", str);
                createMap.putString("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
                if (adjustPurchaseVerificationResult.getMessage() != null) {
                    str2 = adjustPurchaseVerificationResult.getMessage();
                }
                createMap.putString(MetricTracker.Object.MESSAGE, str2);
                this.f36791a.invoke(createMap);
            }
        }
    }

    class i implements OnPurchaseVerificationFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36793a;

        i(Callback callback) {
            this.f36793a = callback;
        }

        public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            String str;
            if (this.f36793a != null) {
                WritableMap createMap = Arguments.createMap();
                if (adjustPurchaseVerificationResult == null) {
                    this.f36793a.invoke(createMap);
                    return;
                }
                String str2 = "";
                if (adjustPurchaseVerificationResult.getVerificationStatus() != null) {
                    str = adjustPurchaseVerificationResult.getVerificationStatus();
                } else {
                    str = str2;
                }
                createMap.putString("verificationStatus", str);
                createMap.putString("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
                if (adjustPurchaseVerificationResult.getMessage() != null) {
                    str2 = adjustPurchaseVerificationResult.getMessage();
                }
                createMap.putString(MetricTracker.Object.MESSAGE, str2);
                this.f36793a.invoke(createMap);
            }
        }
    }

    class j implements OnDeeplinkResolvedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f36795a;

        j(Callback callback) {
            this.f36795a = callback;
        }

        public void onDeeplinkResolved(String str) {
            this.f36795a.invoke(str);
        }
    }

    public Adjust(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private boolean checkKey(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return false;
        }
        return true;
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addGlobalCallbackParameter(String str, String str2) {
        com.adjust.sdk.Adjust.addGlobalCallbackParameter(str, str2);
    }

    @ReactMethod
    public void addGlobalPartnerParameter(String str, String str2) {
        com.adjust.sdk.Adjust.addGlobalPartnerParameter(str, str2);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void disable() {
        com.adjust.sdk.Adjust.disable();
    }

    @ReactMethod
    public void enable() {
        com.adjust.sdk.Adjust.enable();
    }

    @ReactMethod
    public void gdprForgetMe() {
        com.adjust.sdk.Adjust.gdprForgetMe(getReactApplicationContext());
    }

    @ReactMethod
    public void getAdid(Callback callback) {
        com.adjust.sdk.Adjust.getAdid(new b(callback));
    }

    @ReactMethod
    public void getAmazonAdId(Callback callback) {
        com.adjust.sdk.Adjust.getAmazonAdId(getReactApplicationContext(), new d(callback));
    }

    @ReactMethod
    public void getAttribution(Callback callback) {
        com.adjust.sdk.Adjust.getAttribution(new e(callback));
    }

    @ReactMethod
    public void getGoogleAdId(Callback callback) {
        com.adjust.sdk.Adjust.getGoogleAdId(getReactApplicationContext(), new c(callback));
    }

    @ReactMethod
    public void getLastDeeplink(Callback callback) {
        com.adjust.sdk.Adjust.getLastDeeplink(getReactApplicationContext(), new a(callback));
    }

    public String getName() {
        return Constants.LOGTAG;
    }

    @ReactMethod
    public void getSdkVersion(String str, Callback callback) {
        com.adjust.sdk.Adjust.getSdkVersion(new g(callback, str));
    }

    @ReactMethod
    public void initSdk(ReadableMap readableMap) {
        boolean z10;
        String str;
        List g10;
        if (readableMap != null) {
            if (!checkKey(readableMap, "logLevel") || !readableMap.getString("logLevel").equals("SUPPRESS")) {
                z10 = false;
            } else {
                z10 = true;
            }
            String str2 = null;
            if (checkKey(readableMap, "appToken")) {
                str = readableMap.getString("appToken");
            } else {
                str = null;
            }
            if (checkKey(readableMap, "environment")) {
                str2 = readableMap.getString("environment");
            }
            AdjustConfig adjustConfig = new AdjustConfig(getReactApplicationContext(), str, str2, z10);
            if (checkKey(readableMap, "logLevel")) {
                String string = readableMap.getString("logLevel");
                if (string.equals("VERBOSE")) {
                    adjustConfig.setLogLevel(LogLevel.VERBOSE);
                } else if (string.equals("DEBUG")) {
                    adjustConfig.setLogLevel(LogLevel.DEBUG);
                } else if (string.equals("INFO")) {
                    adjustConfig.setLogLevel(LogLevel.INFO);
                } else if (string.equals("WARN")) {
                    adjustConfig.setLogLevel(LogLevel.WARN);
                } else if (string.equals("ERROR")) {
                    adjustConfig.setLogLevel(LogLevel.ERROR);
                } else if (string.equals("ASSERT")) {
                    adjustConfig.setLogLevel(LogLevel.ASSERT);
                } else if (string.equals("SUPPRESS")) {
                    adjustConfig.setLogLevel(LogLevel.SUPPRESS);
                } else {
                    adjustConfig.setLogLevel(LogLevel.INFO);
                }
            }
            if (checkKey(readableMap, "sdkPrefix")) {
                adjustConfig.setSdkPrefix(readableMap.getString("sdkPrefix"));
            }
            if (checkKey(readableMap, "processName")) {
                adjustConfig.setProcessName(readableMap.getString("processName"));
            }
            if (checkKey(readableMap, "defaultTracker")) {
                adjustConfig.setDefaultTracker(readableMap.getString("defaultTracker"));
            }
            if (checkKey(readableMap, "externalDeviceId")) {
                adjustConfig.setExternalDeviceId(readableMap.getString("externalDeviceId"));
            }
            if (checkKey(readableMap, "urlStrategyDomains") && checkKey(readableMap, "useSubdomains") && checkKey(readableMap, "isDataResidency") && (g10 = a.g(readableMap.getArray("urlStrategyDomains"))) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < g10.size(); i10++) {
                    arrayList.add(g10.get(i10).toString());
                }
                adjustConfig.setUrlStrategy(arrayList, readableMap.getBoolean("useSubdomains"), readableMap.getBoolean("isDataResidency"));
            }
            if (checkKey(readableMap, "preinstallFilePath")) {
                adjustConfig.setPreinstallFilePath(readableMap.getString("preinstallFilePath"));
            }
            if (checkKey(readableMap, "fbAppId")) {
                adjustConfig.setFbAppId(readableMap.getString("fbAppId"));
            }
            if (checkKey(readableMap, "isSendingInBackgroundEnabled") && readableMap.getBoolean("isSendingInBackgroundEnabled")) {
                adjustConfig.enableSendingInBackground();
            }
            if (checkKey(readableMap, "isPreinstallTrackingEnabled") && readableMap.getBoolean("isPreinstallTrackingEnabled")) {
                adjustConfig.enablePreinstallTracking();
            }
            if (checkKey(readableMap, "isCostDataInAttributionEnabled") && readableMap.getBoolean("isCostDataInAttributionEnabled")) {
                adjustConfig.enableCostDataInAttribution();
            }
            if (checkKey(readableMap, "isPlayStoreKidsComplianceEnabled") && readableMap.getBoolean("isPlayStoreKidsComplianceEnabled")) {
                adjustConfig.enablePlayStoreKidsCompliance();
            }
            if (checkKey(readableMap, "isDeferredDeeplinkOpeningEnabled")) {
                this.isDeferredDeeplinkOpeningEnabled = readableMap.getBoolean("isDeferredDeeplinkOpeningEnabled");
            }
            if (checkKey(readableMap, "isCoppaComplianceEnabled") && readableMap.getBoolean("isCoppaComplianceEnabled")) {
                adjustConfig.enableCoppaCompliance();
            }
            if (checkKey(readableMap, "isDeviceIdsReadingOnceEnabled") && readableMap.getBoolean("isDeviceIdsReadingOnceEnabled")) {
                adjustConfig.enableDeviceIdsReadingOnce();
            }
            if (checkKey(readableMap, "eventDeduplicationIdsMaxSize")) {
                adjustConfig.setEventDeduplicationIdsMaxSize(Integer.valueOf(readableMap.getInt("eventDeduplicationIdsMaxSize")));
            }
            if (this.isAttributionCallbackImplemented) {
                adjustConfig.setOnAttributionChangedListener(this);
            }
            if (this.isEventTrackingSucceededCallbackImplemented) {
                adjustConfig.setOnEventTrackingSucceededListener(this);
            }
            if (this.isEventTrackingFailedCallbackImplemented) {
                adjustConfig.setOnEventTrackingFailedListener(this);
            }
            if (this.isSessionTrackingSucceededCallbackImplemented) {
                adjustConfig.setOnSessionTrackingSucceededListener(this);
            }
            if (this.isSessionTrackingFailedCallbackImplemented) {
                adjustConfig.setOnSessionTrackingFailedListener(this);
            }
            if (this.isDeferredDeeplinkCallbackImplemented) {
                adjustConfig.setOnDeferredDeeplinkResponseListener(this);
            }
            com.adjust.sdk.Adjust.initSdk(adjustConfig);
        }
    }

    @ReactMethod
    public void isEnabled(Callback callback) {
        com.adjust.sdk.Adjust.isEnabled(getReactApplicationContext(), new f(callback));
    }

    public boolean launchReceivedDeeplink(Uri uri) {
        sendEvent(getReactApplicationContext(), "adjust_deferredDeeplinkReceived", a.b(uri));
        return this.isDeferredDeeplinkOpeningEnabled;
    }

    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        sendEvent(getReactApplicationContext(), "adjust_attributionChanged", a.a(adjustAttribution));
    }

    public void onEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingFailed", a.c(adjustEventFailure));
    }

    public void onEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingSucceeded", a.d(adjustEventSuccess));
    }

    @ReactMethod
    public void onPause() {
        com.adjust.sdk.Adjust.onPause();
    }

    @ReactMethod
    public void onResume() {
        com.adjust.sdk.Adjust.onResume();
    }

    public void onSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingFailed", a.e(adjustSessionFailure));
    }

    public void onSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingSucceeded", a.f(adjustSessionSuccess));
    }

    @ReactMethod
    public void processAndResolveDeeplink(ReadableMap readableMap, Callback callback) {
        String str;
        if (readableMap != null) {
            if (checkKey(readableMap, Constants.DEEPLINK)) {
                str = readableMap.getString(Constants.DEEPLINK);
            } else {
                str = null;
            }
            com.adjust.sdk.Adjust.processAndResolveDeeplink(new AdjustDeeplink(Uri.parse(str)), getReactApplicationContext(), new j(callback));
        }
    }

    @ReactMethod
    public void processDeeplink(ReadableMap readableMap) {
        String str;
        if (readableMap != null) {
            if (checkKey(readableMap, Constants.DEEPLINK)) {
                str = readableMap.getString(Constants.DEEPLINK);
            } else {
                str = null;
            }
            com.adjust.sdk.Adjust.processDeeplink(new AdjustDeeplink(Uri.parse(str)), getReactApplicationContext());
        }
    }

    @ReactMethod
    public void removeGlobalCallbackParameter(String str) {
        com.adjust.sdk.Adjust.removeGlobalCallbackParameter(str);
    }

    @ReactMethod
    public void removeGlobalCallbackParameters() {
        com.adjust.sdk.Adjust.removeGlobalCallbackParameters();
    }

    @ReactMethod
    public void removeGlobalPartnerParameter(String str) {
        com.adjust.sdk.Adjust.removeGlobalPartnerParameter(str);
    }

    @ReactMethod
    public void removeGlobalPartnerParameters() {
        com.adjust.sdk.Adjust.removeGlobalPartnerParameters();
    }

    @ReactMethod
    public void removeListeners(double d10) {
    }

    @ReactMethod
    public void setAttributionCallbackImplemented() {
        this.isAttributionCallbackImplemented = true;
    }

    @ReactMethod
    public void setDeferredDeeplinkCallbackImplemented() {
        this.isDeferredDeeplinkCallbackImplemented = true;
    }

    @ReactMethod
    public void setEventTrackingFailedCallbackImplemented() {
        this.isEventTrackingFailedCallbackImplemented = true;
    }

    @ReactMethod
    public void setEventTrackingSucceededCallbackImplemented() {
        this.isEventTrackingSucceededCallbackImplemented = true;
    }

    @ReactMethod
    public void setPushToken(String str) {
        com.adjust.sdk.Adjust.setPushToken(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setSessionTrackingFailedCallbackImplemented() {
        this.isSessionTrackingFailedCallbackImplemented = true;
    }

    @ReactMethod
    public void setSessionTrackingSucceededCallbackImplemented() {
        this.isSessionTrackingSucceededCallbackImplemented = true;
    }

    @ReactMethod
    public void setTestOptions(ReadableMap readableMap) {
        if (readableMap != null) {
            AdjustTestOptions adjustTestOptions = new AdjustTestOptions();
            if (checkKey(readableMap, "baseUrl")) {
                adjustTestOptions.baseUrl = readableMap.getString("baseUrl");
            }
            if (checkKey(readableMap, "gdprUrl")) {
                adjustTestOptions.gdprUrl = readableMap.getString("gdprUrl");
            }
            if (checkKey(readableMap, "subscriptionUrl")) {
                adjustTestOptions.subscriptionUrl = readableMap.getString("subscriptionUrl");
            }
            if (checkKey(readableMap, "purchaseVerificationUrl")) {
                adjustTestOptions.purchaseVerificationUrl = readableMap.getString("purchaseVerificationUrl");
            }
            if (checkKey(readableMap, "basePath")) {
                adjustTestOptions.basePath = readableMap.getString("basePath");
            }
            if (checkKey(readableMap, "gdprPath")) {
                adjustTestOptions.gdprPath = readableMap.getString("gdprPath");
            }
            if (checkKey(readableMap, "subscriptionPath")) {
                adjustTestOptions.subscriptionPath = readableMap.getString("subscriptionPath");
            }
            if (checkKey(readableMap, "purchaseVerificationPath")) {
                adjustTestOptions.purchaseVerificationPath = readableMap.getString("purchaseVerificationPath");
            }
            if (checkKey(readableMap, "timerIntervalInMilliseconds")) {
                try {
                    adjustTestOptions.timerIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("timerIntervalInMilliseconds")));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "timerStartInMilliseconds")) {
                try {
                    adjustTestOptions.timerStartInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("timerStartInMilliseconds")));
                } catch (NumberFormatException e11) {
                    e11.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "sessionIntervalInMilliseconds")) {
                try {
                    adjustTestOptions.sessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("sessionIntervalInMilliseconds")));
                } catch (NumberFormatException e12) {
                    e12.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "subsessionIntervalInMilliseconds")) {
                try {
                    adjustTestOptions.subsessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("subsessionIntervalInMilliseconds")));
                } catch (NumberFormatException e13) {
                    e13.printStackTrace();
                    Log.d(TAG, "Can't format number");
                }
            }
            if (checkKey(readableMap, "noBackoffWait")) {
                adjustTestOptions.noBackoffWait = Boolean.valueOf(readableMap.getBoolean("noBackoffWait"));
            }
            if (checkKey(readableMap, "teardown")) {
                adjustTestOptions.teardown = Boolean.valueOf(readableMap.getBoolean("teardown"));
            }
            if (checkKey(readableMap, "deleteState") && readableMap.getBoolean("deleteState")) {
                adjustTestOptions.context = getReactApplicationContext();
            }
            if (checkKey(readableMap, "ignoreSystemLifecycleBootstrap")) {
                adjustTestOptions.ignoreSystemLifecycleBootstrap = Boolean.valueOf(readableMap.getBoolean("ignoreSystemLifecycleBootstrap"));
            }
            com.adjust.sdk.Adjust.setTestOptions(adjustTestOptions);
        }
    }

    @ReactMethod
    public void switchBackToOnlineMode() {
        com.adjust.sdk.Adjust.switchBackToOnlineMode();
    }

    @ReactMethod
    public void switchToOfflineMode() {
        com.adjust.sdk.Adjust.switchToOfflineMode();
    }

    @ReactMethod
    public void teardown() {
        this.isAttributionCallbackImplemented = false;
        this.isEventTrackingSucceededCallbackImplemented = false;
        this.isEventTrackingFailedCallbackImplemented = false;
        this.isSessionTrackingSucceededCallbackImplemented = false;
        this.isSessionTrackingFailedCallbackImplemented = false;
        this.isDeferredDeeplinkCallbackImplemented = false;
    }

    @ReactMethod
    public void trackAdRevenue(ReadableMap readableMap) {
        String str;
        List g10;
        List g11;
        String string;
        String string2;
        String string3;
        if (readableMap != null) {
            if (checkKey(readableMap, "source")) {
                str = readableMap.getString("source");
            } else {
                str = null;
            }
            AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(str);
            if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f37469a)) {
                adjustAdRevenue.setRevenue(Double.valueOf(readableMap.getDouble("revenue")), readableMap.getString(com.amazon.a.a.o.b.f37469a));
            }
            if (checkKey(readableMap, "adImpressionsCount")) {
                adjustAdRevenue.setAdImpressionsCount(Integer.valueOf(readableMap.getInt("adImpressionsCount")));
            }
            if (checkKey(readableMap, "adRevenueNetwork") && (string3 = readableMap.getString("adRevenueNetwork")) != null) {
                adjustAdRevenue.setAdRevenueNetwork(string3);
            }
            if (checkKey(readableMap, "adRevenueUnit") && (string2 = readableMap.getString("adRevenueUnit")) != null) {
                adjustAdRevenue.setAdRevenueUnit(string2);
            }
            if (checkKey(readableMap, "adRevenuePlacement") && (string = readableMap.getString("adRevenuePlacement")) != null) {
                adjustAdRevenue.setAdRevenuePlacement(string);
            }
            if (checkKey(readableMap, "callbackParameters") && (g11 = a.g(readableMap.getArray("callbackParameters"))) != null) {
                for (int i10 = 0; i10 < g11.size(); i10 += 2) {
                    adjustAdRevenue.addCallbackParameter(g11.get(i10).toString(), g11.get(i10 + 1).toString());
                }
            }
            if (checkKey(readableMap, "partnerParameters") && (g10 = a.g(readableMap.getArray("partnerParameters"))) != null) {
                for (int i11 = 0; i11 < g10.size(); i11 += 2) {
                    adjustAdRevenue.addPartnerParameter(g10.get(i11).toString(), g10.get(i11 + 1).toString());
                }
            }
            com.adjust.sdk.Adjust.trackAdRevenue(adjustAdRevenue);
        }
    }

    @ReactMethod
    public void trackEvent(ReadableMap readableMap) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        List g10;
        List g11;
        if (readableMap != null) {
            if (checkKey(readableMap, "eventToken")) {
                str = readableMap.getString("eventToken");
            } else {
                str = null;
            }
            AdjustEvent adjustEvent = new AdjustEvent(str);
            if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f37469a)) {
                adjustEvent.setRevenue(readableMap.getDouble("revenue"), readableMap.getString(com.amazon.a.a.o.b.f37469a));
            }
            if (checkKey(readableMap, "callbackParameters") && (g11 = a.g(readableMap.getArray("callbackParameters"))) != null) {
                for (int i10 = 0; i10 < g11.size(); i10 += 2) {
                    adjustEvent.addCallbackParameter(g11.get(i10).toString(), g11.get(i10 + 1).toString());
                }
            }
            if (checkKey(readableMap, "partnerParameters") && (g10 = a.g(readableMap.getArray("partnerParameters"))) != null) {
                for (int i11 = 0; i11 < g10.size(); i11 += 2) {
                    adjustEvent.addPartnerParameter(g10.get(i11).toString(), g10.get(i11 + 1).toString());
                }
            }
            if (checkKey(readableMap, "transactionId") && (string5 = readableMap.getString("transactionId")) != null) {
                adjustEvent.setOrderId(string5);
            }
            if (checkKey(readableMap, "callbackId") && (string4 = readableMap.getString("callbackId")) != null) {
                adjustEvent.setCallbackId(string4);
            }
            if (checkKey(readableMap, "productId") && (string3 = readableMap.getString("productId")) != null) {
                adjustEvent.setProductId(string3);
            }
            if (checkKey(readableMap, "purchaseToken") && (string2 = readableMap.getString("purchaseToken")) != null) {
                adjustEvent.setPurchaseToken(string2);
            }
            if (checkKey(readableMap, "deduplicationId") && (string = readableMap.getString("deduplicationId")) != null) {
                adjustEvent.setDeduplicationId(string);
            }
            com.adjust.sdk.Adjust.trackEvent(adjustEvent);
        }
    }

    @ReactMethod
    public void trackMeasurementConsent(boolean z10) {
        com.adjust.sdk.Adjust.trackMeasurementConsent(z10);
    }

    @ReactMethod
    public void trackPlayStoreSubscription(ReadableMap readableMap) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        List g10;
        List g11;
        if (readableMap != null) {
            if (checkKey(readableMap, com.amazon.a.a.o.b.f37501x)) {
                i10 = readableMap.getInt(com.amazon.a.a.o.b.f37501x);
            } else {
                i10 = -1;
            }
            String str5 = null;
            if (checkKey(readableMap, com.amazon.a.a.o.b.f37469a)) {
                str = readableMap.getString(com.amazon.a.a.o.b.f37469a);
            } else {
                str = null;
            }
            if (checkKey(readableMap, "sku")) {
                str2 = readableMap.getString("sku");
            } else {
                str2 = null;
            }
            if (checkKey(readableMap, "orderId")) {
                str3 = readableMap.getString("orderId");
            } else {
                str3 = null;
            }
            if (checkKey(readableMap, "signature")) {
                str4 = readableMap.getString("signature");
            } else {
                str4 = null;
            }
            if (checkKey(readableMap, "purchaseToken")) {
                str5 = readableMap.getString("purchaseToken");
            }
            AdjustPlayStoreSubscription adjustPlayStoreSubscription = new AdjustPlayStoreSubscription((long) i10, str, str2, str3, str4, str5);
            if (checkKey(readableMap, "purchaseTime")) {
                adjustPlayStoreSubscription.setPurchaseTime((long) readableMap.getInt("purchaseTime"));
            }
            if (checkKey(readableMap, "callbackParameters") && (g11 = a.g(readableMap.getArray("callbackParameters"))) != null) {
                for (int i11 = 0; i11 < g11.size(); i11 += 2) {
                    adjustPlayStoreSubscription.addCallbackParameter(g11.get(i11).toString(), g11.get(i11 + 1).toString());
                }
            }
            if (checkKey(readableMap, "partnerParameters") && (g10 = a.g(readableMap.getArray("partnerParameters"))) != null) {
                for (int i12 = 0; i12 < g10.size(); i12 += 2) {
                    adjustPlayStoreSubscription.addPartnerParameter(g10.get(i12).toString(), g10.get(i12 + 1).toString());
                }
            }
            com.adjust.sdk.Adjust.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }

    @ReactMethod
    public void trackThirdPartySharing(ReadableMap readableMap) {
        Boolean bool;
        List g10;
        List g11;
        if (readableMap != null) {
            if (checkKey(readableMap, "isEnabled")) {
                bool = Boolean.valueOf(readableMap.getBoolean("isEnabled"));
            } else {
                bool = null;
            }
            AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing(bool);
            if (checkKey(readableMap, "granularOptions") && (g11 = a.g(readableMap.getArray("granularOptions"))) != null) {
                for (int i10 = 0; i10 < g11.size(); i10 += 3) {
                    adjustThirdPartySharing.addGranularOption(g11.get(i10).toString(), g11.get(i10 + 1).toString(), g11.get(i10 + 2).toString());
                }
            }
            if (checkKey(readableMap, "partnerSharingSettings") && (g10 = a.g(readableMap.getArray("partnerSharingSettings"))) != null) {
                for (int i11 = 0; i11 < g10.size(); i11 += 3) {
                    adjustThirdPartySharing.addPartnerSharingSetting(g10.get(i11).toString(), g10.get(i11 + 1).toString(), Boolean.parseBoolean(g10.get(i11 + 2).toString()));
                }
            }
            com.adjust.sdk.Adjust.trackThirdPartySharing(adjustThirdPartySharing);
        }
    }

    @ReactMethod
    public void verifyAndTrackPlayStorePurchase(ReadableMap readableMap, Callback callback) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        List g10;
        List g11;
        if (readableMap != null) {
            if (checkKey(readableMap, "eventToken")) {
                str = readableMap.getString("eventToken");
            } else {
                str = null;
            }
            AdjustEvent adjustEvent = new AdjustEvent(str);
            if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f37469a)) {
                adjustEvent.setRevenue(readableMap.getDouble("revenue"), readableMap.getString(com.amazon.a.a.o.b.f37469a));
            }
            if (checkKey(readableMap, "callbackParameters") && (g11 = a.g(readableMap.getArray("callbackParameters"))) != null) {
                for (int i10 = 0; i10 < g11.size(); i10 += 2) {
                    adjustEvent.addCallbackParameter(g11.get(i10).toString(), g11.get(i10 + 1).toString());
                }
            }
            if (checkKey(readableMap, "partnerParameters") && (g10 = a.g(readableMap.getArray("partnerParameters"))) != null) {
                for (int i11 = 0; i11 < g10.size(); i11 += 2) {
                    adjustEvent.addPartnerParameter(g10.get(i11).toString(), g10.get(i11 + 1).toString());
                }
            }
            if (checkKey(readableMap, "transactionId") && (string5 = readableMap.getString("transactionId")) != null) {
                adjustEvent.setOrderId(string5);
            }
            if (checkKey(readableMap, "callbackId") && (string4 = readableMap.getString("callbackId")) != null) {
                adjustEvent.setCallbackId(string4);
            }
            if (checkKey(readableMap, "productId") && (string3 = readableMap.getString("productId")) != null) {
                adjustEvent.setProductId(string3);
            }
            if (checkKey(readableMap, "purchaseToken") && (string2 = readableMap.getString("purchaseToken")) != null) {
                adjustEvent.setPurchaseToken(string2);
            }
            if (checkKey(readableMap, "deduplicationId") && (string = readableMap.getString("deduplicationId")) != null) {
                adjustEvent.setDeduplicationId(string);
            }
            com.adjust.sdk.Adjust.verifyAndTrackPlayStorePurchase(adjustEvent, new i(callback));
        }
    }

    @ReactMethod
    public void verifyPlayStorePurchase(ReadableMap readableMap, Callback callback) {
        String str;
        if (readableMap != null) {
            String str2 = null;
            if (checkKey(readableMap, "productId")) {
                str = readableMap.getString("productId");
            } else {
                str = null;
            }
            if (checkKey(readableMap, "purchaseToken")) {
                str2 = readableMap.getString("purchaseToken");
            }
            com.adjust.sdk.Adjust.verifyPlayStorePurchase(new AdjustPlayStorePurchase(str, str2), new h(callback));
        }
    }
}

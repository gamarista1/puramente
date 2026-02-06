package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Base64;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.Random;
import rh.C;
import rh.E;
import rh.w;

class HeaderInterceptor implements w {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bn,bs,ca,cs,da,de,de-form,el,es,et,fa-IR,fi,fr,hi,he,hr,hu,id,it,ja,ko,lt,lv,mn,ms,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,sw,th,tr,uk,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final String flutterVersion;
    private final Random random;
    private final String reactNativeVersion;
    private final String userLocale;
    private final String versionName;

    HeaderInterceptor(String str, String str2, String str3, String str4, AppIdentity appIdentity2, String str5, String str6, Random random2) {
        this.cordovaVersion = str;
        this.reactNativeVersion = str2;
        this.flutterVersion = str3;
        this.versionName = str4;
        this.appIdentity = appIdentity2;
        this.userLocale = str5;
        this.appVersion = str6;
        this.random = random2;
    }

    public static HeaderInterceptor create(Context context, AppIdentity appIdentity2) {
        return new HeaderInterceptor(context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.CORDOVA_VERSION, ""), context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, ""), "", BuildConfig.VERSION_NAME, appIdentity2, UserLocaleUtilKt.getUserLocaleString(context), DeviceUtils.getAppVersion(context), new Random());
    }

    private String getBasicAuth() {
        String str = this.appIdentity.appId() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.appIdentity.apiKey();
        return "Basic " + Base64.encodeToString(str.getBytes(), 2);
    }

    public static void setCordovaVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.CORDOVA_VERSION, str).apply();
    }

    public static void setReactNativeVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, str).apply();
    }

    public E intercept(w.a aVar) {
        C.a e10 = aVar.request().i().e(CONTENT_TYPE_KEY, CONTENT_TYPE_VALUE).e(AUTHORIZATION, getBasicAuth()).e(IDEMPOTENCY_KEY, Long.toHexString(this.random.nextLong()));
        C.a e11 = e10.e(INTERCOM_AGENT, "intercom-android-sdk/" + this.versionName).e(ACCEPT_LANGUAGE, this.userLocale).e(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST).e(HOST_APP_VERSION_KEY, this.appVersion);
        if (!this.cordovaVersion.isEmpty()) {
            e11.e(INTERCOM_AGENT_WRAPPER, "intercom-sdk-cordova/" + this.cordovaVersion);
        }
        if (!this.reactNativeVersion.isEmpty()) {
            e11.e(INTERCOM_AGENT_WRAPPER, "intercom-sdk-react-native/" + this.reactNativeVersion);
        }
        if (!this.flutterVersion.isEmpty()) {
            e11.e(INTERCOM_AGENT_WRAPPER, "intercom-sdk-flutter/" + this.flutterVersion);
        }
        return aVar.a(e11.b());
    }
}

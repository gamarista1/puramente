package com.facebook.reactnative.androidsdk;

import Q7.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.models.AttributeType;
import io.jsonwebtoken.Header;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o7.C3886b;
import t5.C4039p;

@a(name = "FBAppEventsLogger")
public class FBAppEventsLoggerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBAppEventsLogger";
    private C4039p mAppEventLogger;
    private C3886b mAttributionIdentifiers;
    private ReactApplicationContext mReactContext;

    public FBAppEventsLoggerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private String getNullableString(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getString(str);
        }
        return null;
    }

    @ReactMethod
    public void clearUserID() {
        C4039p.a();
    }

    @ReactMethod
    public void flush() {
        this.mAppEventLogger.b();
    }

    @ReactMethod
    public void getAdvertiserID(Promise promise) {
        try {
            promise.resolve(this.mAttributionIdentifiers.h());
        } catch (Exception e10) {
            promise.reject("E_ADVERTISER_ID_ERROR", "Can not get advertiserID", (Throwable) e10);
        }
    }

    @ReactMethod
    public void getAnonymousID(Promise promise) {
        try {
            promise.resolve(C4039p.c(this.mReactContext));
        } catch (Exception e10) {
            promise.reject("E_ANONYMOUS_ID_ERROR", "Can not get anonymousID", (Throwable) e10);
        }
    }

    @ReactMethod
    public void getAttributionID(Promise promise) {
        try {
            promise.resolve(this.mAttributionIdentifiers.j());
        } catch (Exception e10) {
            promise.reject("E_ATTRIBUTION_ID_ERROR", "Can not get attributionID", (Throwable) e10);
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AchievedLevel", "fb_mobile_level_achieved");
        hashMap2.put("AdClick", "AdClick");
        hashMap2.put("AdImpression", "AdImpression");
        hashMap2.put("AddedPaymentInfo", "fb_mobile_add_payment_info");
        hashMap2.put("AddedToCart", "fb_mobile_add_to_cart");
        hashMap2.put("AddedToWishlist", "fb_mobile_add_to_wishlist");
        hashMap2.put("CompletedRegistration", "fb_mobile_complete_registration");
        hashMap2.put("CompletedTutorial", "fb_mobile_tutorial_completion");
        hashMap2.put("Contact", "Contact");
        hashMap2.put("CustomizeProduct", "CustomizeProduct");
        hashMap2.put("Donate", "Donate");
        hashMap2.put("FindLocation", "FindLocation");
        hashMap2.put("InitiatedCheckout", "fb_mobile_initiated_checkout");
        hashMap2.put("Purchased", "fb_mobile_purchase");
        hashMap2.put("Rated", "fb_mobile_rate");
        hashMap2.put("Searched", "fb_mobile_search");
        hashMap2.put("SpentCredits", "fb_mobile_spent_credits");
        hashMap2.put("Schedule", "Schedule");
        hashMap2.put("StartTrial", "StartTrial");
        hashMap2.put("SubmitApplication", "SubmitApplication");
        hashMap2.put("Subscribe", "Subscribe");
        hashMap2.put("UnlockedAchievement", "fb_mobile_achievement_unlocked");
        hashMap2.put("ViewedContent", "fb_mobile_content_view");
        hashMap.put("AppEvents", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AddType", "ad_type");
        hashMap3.put("Content", "fb_content");
        hashMap3.put("ContentID", "fb_content_id");
        hashMap3.put("ContentType", "fb_content_type");
        hashMap3.put("Currency", "fb_currency");
        hashMap3.put("Description", "fb_description");
        hashMap3.put("Level", "fb_level");
        hashMap3.put("NumItems", "fb_num_items");
        hashMap3.put("MaxRatingValue", "fb_max_rating_value");
        hashMap3.put("OrderId", "fb_order_id");
        hashMap3.put("PaymentInfoAvailable", "fb_payment_info_available");
        hashMap3.put("RegistrationMethod", "fb_registration_method");
        hashMap3.put("SearchString", "fb_search_string");
        hashMap3.put("Success", "fb_success");
        hashMap3.put("ValueNo", "0");
        hashMap3.put("ValueYes", "1");
        hashMap.put("AppEventParams", hashMap3);
        return hashMap;
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserID() {
        return C4039p.d();
    }

    public void initialize() {
        this.mAppEventLogger = C4039p.j(this.mReactContext);
        this.mAttributionIdentifiers = C3886b.k(this.mReactContext);
    }

    @ReactMethod
    public void logEvent(String str, double d10, ReadableMap readableMap) {
        this.mAppEventLogger.e(str, d10, Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logProductItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d10, String str8, String str9, String str10, String str11, ReadableMap readableMap) {
        C4039p pVar = this.mAppEventLogger;
        Locale locale = Locale.ROOT;
        pVar.g(str, C4039p.c.valueOf(str2.toUpperCase(locale)), C4039p.d.valueOf(str3.toUpperCase(locale)), str4, str5, str6, str7, BigDecimal.valueOf(d10), Currency.getInstance(str8), str9, str10, str11, Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logPurchase(double d10, String str, ReadableMap readableMap) {
        this.mAppEventLogger.h(BigDecimal.valueOf(d10), Currency.getInstance(str), Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logPushNotificationOpen(ReadableMap readableMap) {
        this.mAppEventLogger.i(Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void setFlushBehavior(String str) {
        C4039p.k(C4039p.b.valueOf(str.toUpperCase(Locale.ROOT)));
    }

    @ReactMethod
    public void setPushNotificationsRegistrationId(String str) {
        C4039p.l(str);
    }

    @ReactMethod
    public void setUserData(ReadableMap readableMap) {
        C4039p.m(getNullableString(readableMap, "email"), getNullableString(readableMap, "firstName"), getNullableString(readableMap, "lastName"), getNullableString(readableMap, AttributeType.PHONE), getNullableString(readableMap, "dateOfBirth"), getNullableString(readableMap, "gender"), getNullableString(readableMap, "city"), getNullableString(readableMap, "state"), getNullableString(readableMap, Header.COMPRESSION_ALGORITHM), getNullableString(readableMap, "country"));
    }

    @ReactMethod
    public void setUserID(String str) {
        C4039p.n(str);
    }
}

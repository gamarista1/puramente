package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.amazon.device.simplesignin.a.a.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.AuthToken;
import io.intercom.android.sdk.AuthTokenKt;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.user.DeviceData;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.p;

public class Api {
    private static final String AUTH_TOKENS = "auth_tokens";
    private static final String CAROUSEL_AUTOMATIC = "shown_automatically";
    private static final String CAROUSEL_CREATED_VIA = "created_via";
    private static final String CAROUSEL_PROGRAMMATIC = "triggered_from_code";
    private static final String CAROUSEL_VISIBLE = "carousel_visible";
    private static final String DEVICE_DATA = "device_data";
    private static final String DEVICE_IDENTIFIER = "device_identifier";
    private static final String DEVICE_TOKEN = "device_token";
    private static final String HMAC = "hmac";
    private static final String INSTANCE_ID = "instance_id";
    private static final String JWT = "intercom_user_jwt";
    private static final String NEW_SESSION = "new_session";
    private static final String SCREEN_ID = "screen_id";
    private static final String SENT_FROM_BACKGROUND = "sent_from_background";
    /* access modifiers changed from: private */
    public static final Twig TWIG = LumberMill.getLogger();
    private static final String USER = "user";
    private static final String USER_ATTRIBUTES = "user_attributes";
    private final C6703A apiHttpClient;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    final CallbackHolder callbacks;
    private final Context context;
    /* access modifiers changed from: private */
    public final IntercomDataLayer dataLayer;
    private final int defaultOkHttpMaxRequests;
    private final C6673f emptyCallback = new C6673f() {
        public void onFailure(C6671d<Void> dVar, Throwable th2) {
        }

        public void onResponse(C6671d<Void> dVar, F<Void> f10) {
        }
    };
    final C6703A httpClient = new C6703A();
    private final MessengerApi messengerApi;
    /* access modifiers changed from: private */
    public OpsMetricTracker opsMetricTracker;
    private final RateLimiter rateLimiter;
    final UserIdentity userIdentity;

    public Api(Context context2, AppIdentity appIdentity2, UserIdentity userIdentity2, C6703A a10, MessengerApi messengerApi2, CallbackHolder callbackHolder, RateLimiter rateLimiter2, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker2, IntercomDataLayer intercomDataLayer) {
        this.context = context2;
        this.appIdentity = appIdentity2;
        this.userIdentity = userIdentity2;
        this.messengerApi = messengerApi2;
        this.callbacks = callbackHolder;
        this.rateLimiter = rateLimiter2;
        this.appConfigProvider = provider;
        this.opsMetricTracker = opsMetricTracker2;
        this.dataLayer = intercomDataLayer;
        this.apiHttpClient = a10;
        this.defaultOkHttpMaxRequests = a10.q().h();
        updateMaxRequests();
    }

    private void addCarouselCreatedViaParam(Map<String, Object> map, boolean z10) {
        String str;
        if (z10) {
            str = CAROUSEL_PROGRAMMATIC;
        } else {
            str = CAROUSEL_AUTOMATIC;
        }
        map.put(CAROUSEL_CREATED_VIA, str);
    }

    private Map<String, Object> generateUpdateUserParams(UserUpdateRequest userUpdateRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put(DEVICE_DATA, DeviceData.generateDeviceData(this.context));
        hashMap.put(NEW_SESSION, Boolean.valueOf(userUpdateRequest.isNewSession()));
        hashMap.put(SENT_FROM_BACKGROUND, Boolean.valueOf(userUpdateRequest.isSentFromBackground()));
        hashMap.put(USER_ATTRIBUTES, userUpdateRequest.getAttributes());
        hashMap.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(hashMap);
        return hashMap;
    }

    private boolean isCarouselVisible() {
        return !Carousel.NULL.equals(((OverlayState) this.dataLayer.getOverlayState().getValue()).getCarousel());
    }

    protected static boolean isUserNotFound(ErrorObject errorObject, Map map) {
        if (errorObject.hasErrorBody() && errorObject.getStatusCode() == 404 && map != null && map.get(UserIdentity.INTERCOM_ID) != null && map.size() > 1) {
            try {
                if (new JSONObject(errorObject.getErrorBody()).getJSONArray("errors").getJSONObject(0).getString("code").equals("not_found")) {
                    return true;
                }
            } catch (Exception unused) {
                TWIG.internal("Could not parse error response");
            }
        }
        return false;
    }

    private void logBackgroundDisabledError() {
        TWIG.e("Your request was not sent because the app is in the background. Please contact Intercom to enable background requests.", new Object[0]);
    }

    private boolean shouldStopBackgroundRequest(boolean z10) {
        if (!z10 || !this.appConfigProvider.get().isBackgroundRequestsDisabled()) {
            return false;
        }
        return true;
    }

    private Map<String, Object> statsSystemParams(String str, String str2) {
        Map<String, Object> statsSystemParams = statsSystemParams(str);
        statsSystemParams.put(SCREEN_ID, str2);
        return statsSystemParams;
    }

    public void addConversationRatingRemark(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("remark", str2);
        addSecureHash(hashMap);
        this.messengerApi.addConversationRatingRemark(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("adding remark to conversation"));
    }

    public void addSecureHash(Map<String, Object> map) {
        map.put(DEVICE_IDENTIFIER, DeviceIdentifierHolderKt.getDeviceIdentifier(this.context));
        String jwt = this.userIdentity.getJwt();
        if (!TextUtils.isEmpty(jwt)) {
            map.put(JWT, jwt);
            return;
        }
        String hmac = this.userIdentity.getHmac();
        if (!TextUtils.isEmpty(hmac)) {
            map.put(HMAC, hmac);
        }
    }

    public Map<String, Object> baseNewConversationParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }

    public Map<String, Object> createBaseReplyParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("type", "user");
        hashMap.put("message_type", "comment");
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }

    public void fetchCarouselByEntityId(String str) {
        Map<String, Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 44);
        addSecureHash(map);
        this.messengerApi.getCarousel(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<CarouselResponse.Builder>() {
            /* access modifiers changed from: protected */
            public void onSuccess(CarouselResponse.Builder builder) {
                Api.this.dataLayer.updateCarousel(builder.build().carousel().build());
            }
        });
    }

    public void fetchProgrammaticCarousel(String str, C6673f fVar) {
        Map<String, Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getProgrammaticCarousel(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(fVar);
    }

    public void fetchSheet(HashMap<String, Object> hashMap, C6673f fVar) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap2);
        hashMap2.putAll(hashMap);
        this.messengerApi.getSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap2)).enqueue(fVar);
    }

    public void fetchSurveyByEntityId(String str) {
        Map<String, Object> map = this.userIdentity.toMap();
        map.put("entity_id", str);
        map.put("entity_type", 85);
        addSecureHash(map);
        this.messengerApi.getSurvey(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<FetchSurveyRequest>() {
            /* access modifiers changed from: protected */
            public void onSuccess(FetchSurveyRequest fetchSurveyRequest) {
                Api.this.dataLayer.updateSurveyData(fetchSurveyRequest.getSurvey());
            }
        });
    }

    public void getLink(String str, C6673f fVar) {
        Map<String, Object> map = this.userIdentity.toMap();
        addSecureHash(map);
        this.messengerApi.getLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(fVar);
    }

    public void getUnreadConversations() {
        Map<String, Object> map = this.userIdentity.toMap();
        map.put("per_page", "20");
        addSecureHash(map);
        this.messengerApi.getUnreadConversations(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(this.callbacks.unreadCallback());
    }

    public void getVideo(String str, C6709f fVar) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.a(new C.a().l(str).b()), fVar);
    }

    public void hitTrackingUrl(String str) {
        FirebasePerfOkHttpClient.enqueue(this.httpClient.a(new C.a().l(str).b()), new C6709f() {
            public void onFailure(C6708e eVar, IOException iOException) {
                Api.TWIG.internal("Tracking Url", "Failed tracking url request");
            }

            public void onResponse(C6708e eVar, E e10) {
                Api.TWIG.internal("Tracking Url", a.f38020s);
                e10.a().close();
            }
        });
    }

    public boolean isIdle() {
        if (this.apiHttpClient.q().l() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isSynchronous() {
        if (this.apiHttpClient.q().h() == 1) {
            return true;
        }
        return false;
    }

    public void logEvent(String str, Map<String, ?> map) {
        if (this.rateLimiter.isLimited()) {
            this.rateLimiter.logError();
            return;
        }
        boolean isBackgrounded = ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded();
        if (shouldStopBackgroundRequest(isBackgrounded)) {
            logBackgroundDisabledError();
            return;
        }
        this.rateLimiter.recordRequest();
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        if (!map.isEmpty()) {
            hashMap.put("metadata", map);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event", hashMap);
        hashMap2.put(SENT_FROM_BACKGROUND, Boolean.valueOf(isBackgrounded));
        hashMap2.put("user", this.userIdentity.toMap());
        hashMap2.put(CAROUSEL_VISIBLE, Boolean.valueOf(isCarouselVisible()));
        addSecureHash(hashMap2);
        this.messengerApi.logEvent(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap2)).enqueue(this.callbacks.logEventCallback());
    }

    public void markCarouselActionButtonTapped(String str, String str2, boolean z10) {
        Map<String, Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z10);
        this.messengerApi.markCarouselActionButtonTapped(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsCompleted(String str, boolean z10) {
        Map<String, Object> statsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(statsSystemParams, z10);
        this.messengerApi.markCarouselAsCompleted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsDismissed(String str, boolean z10) {
        Map<String, Object> statsSystemParams = statsSystemParams(str);
        addCarouselCreatedViaParam(statsSystemParams, z10);
        this.messengerApi.markCarouselAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markCarouselScreenViewed(String str, String str2, boolean z10) {
        Map<String, Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z10);
        this.messengerApi.markCarouselScreenViewed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markConversationAsDismissed(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("conversation_ids", new String[]{str});
        addSecureHash(hashMap);
        this.messengerApi.markAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void markConversationAsRead(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        this.messengerApi.markAsRead(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void markPermissionGranted(String str, String str2, boolean z10) {
        Map<String, Object> statsSystemParams = statsSystemParams(str, str2);
        addCarouselCreatedViaParam(statsSystemParams, z10);
        this.messengerApi.markPermissionGranted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams)).enqueue(this.emptyCallback);
    }

    public void markPushAsOpened(String str) {
        this.messengerApi.markPushAsOpened(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(statsSystemParams(str))).enqueue(this.emptyCallback);
    }

    public void rateConversation(String str, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("rating_index", Integer.valueOf(i10));
        addSecureHash(hashMap);
        this.messengerApi.rateConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("conversation rating"));
    }

    public void reactToConversation(String str, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("reaction_index", Integer.valueOf(i10));
        addSecureHash(hashMap);
        this.messengerApi.reactToConversation(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to conversation"));
    }

    public void reactToLink(String str, String str2, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("article_content_id", str2);
        hashMap.put("reaction_index", Integer.valueOf(i10));
        hashMap.put("allow_auto_responses", Boolean.valueOf(z10));
        addSecureHash(hashMap);
        this.messengerApi.reactToLink(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to link"));
    }

    public void recordInteractions(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("interactions", strArr);
        addSecureHash(hashMap);
        this.messengerApi.recordInteractions(str, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void removeDeviceToken(String str, UserIdentity userIdentity2) {
        HashMap hashMap = new HashMap();
        if (userIdentity2.isSoftReset()) {
            hashMap.put("user", userIdentity2.softUserIdentityToMap());
        } else {
            hashMap.put("user", userIdentity2.toMap());
        }
        hashMap.put(DEVICE_TOKEN, str);
        addSecureHash(hashMap);
        this.messengerApi.deleteDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    /* access modifiers changed from: package-private */
    public void retriableUpdateUser(Map<String, Object> map, IntercomStatusCallback intercomStatusCallback) {
        retriableUpdateUser(map, this.userIdentity.getFingerprint(), intercomStatusCallback);
    }

    public void sendErrorReport(ErrorReport errorReport) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put("error_report", errorReport);
        addSecureHash(hashMap);
        this.messengerApi.reportError(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("report error"));
    }

    public void sendMetrics(List<MetricObject> list, List<OpsMetricObject> list2, C6673f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("metrics", list);
        hashMap.put("op_metrics", list2);
        this.messengerApi.sendMetrics(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(fVar);
    }

    public void setAuthTokens(List<AuthToken> list, final IntercomStatusCallback intercomStatusCallback) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        if (!list.isEmpty()) {
            hashMap.put("auth_tokens", AuthTokenKt.toMap(list));
        }
        this.messengerApi.setAuthToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(new C6673f() {
            public void onFailure(C6671d<Void> dVar, Throwable th2) {
                new Handler(Looper.getMainLooper()).post(new c(intercomStatusCallback));
            }

            public void onResponse(C6671d<Void> dVar, F<Void> f10) {
                if (f10.e()) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    IntercomStatusCallback intercomStatusCallback = intercomStatusCallback;
                    Objects.requireNonNull(intercomStatusCallback);
                    handler.post(new a(intercomStatusCallback));
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new d(intercomStatusCallback, new ErrorObject((Throwable) null, f10)));
            }
        });
    }

    public void setDeviceToken(String str) {
        Map<String, Object> generateDeviceData = DeviceData.generateDeviceData(this.context);
        generateDeviceData.put(DEVICE_TOKEN, str);
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        hashMap.put(DEVICE_DATA, generateDeviceData);
        addSecureHash(hashMap);
        this.messengerApi.setDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void setIdleCallback(Runnable runnable) {
        this.apiHttpClient.q().m(runnable);
    }

    public void submitSheet(String str, Map<String, Object> map, C6673f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        hashMap.put("uri", str);
        hashMap.put("sheet_values", map);
        this.messengerApi.submitSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(fVar);
    }

    public void updateMaxRequests() {
        int i10;
        if (this.userIdentity.hasIntercomId()) {
            i10 = this.defaultOkHttpMaxRequests;
        } else {
            i10 = 1;
        }
        p q10 = this.apiHttpClient.q();
        if (q10.h() != i10) {
            q10.n(i10);
        }
    }

    public void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        if (!userUpdateRequest.isInternalUpdate()) {
            if (this.rateLimiter.isLimited()) {
                this.rateLimiter.logError();
                intercomStatusCallback.onFailure(new IntercomError(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, "rate limit reached"));
                return;
            } else if (shouldStopBackgroundRequest(userUpdateRequest.isSentFromBackground())) {
                logBackgroundDisabledError();
                intercomStatusCallback.onFailure(new IntercomError(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, "Background requests are disabled"));
                return;
            } else {
                this.rateLimiter.recordRequest();
            }
        }
        retriableUpdateUser(generateUpdateUserParams(userUpdateRequest), intercomStatusCallback);
    }

    /* access modifiers changed from: private */
    public void retriableUpdateUser(final Map<String, Object> map, final String str, final IntercomStatusCallback intercomStatusCallback) {
        this.messengerApi.updateUser(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map)).enqueue(new BaseCallback<UpdateUserResponse.Builder>() {
            /* access modifiers changed from: package-private */
            public void logFailure(String str, ErrorObject errorObject) {
                super.logFailure("Failed to register or update user", errorObject);
            }

            public void onError(ErrorObject errorObject) {
                Map map = (Map) map.get("user");
                if (Api.isUserNotFound(errorObject, map)) {
                    map.remove(UserIdentity.INTERCOM_ID);
                    map.put("user", map);
                    Api.this.retriableUpdateUser(map, str, intercomStatusCallback);
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new b(intercomStatusCallback, errorObject, ErrorStringExtractorKt.extractErrorString(errorObject)));
            }

            public void onSuccess(UpdateUserResponse.Builder builder) {
                Handler handler = new Handler(Looper.getMainLooper());
                IntercomStatusCallback intercomStatusCallback = intercomStatusCallback;
                Objects.requireNonNull(intercomStatusCallback);
                handler.post(new a(intercomStatusCallback));
                if (str.equals(Api.this.userIdentity.getFingerprint())) {
                    Api.TWIG.i("Successfully registered or updated user", new Object[0]);
                    Api.this.callbacks.unreadCallback().onSuccess(builder);
                    UpdateUserResponse build = builder.build();
                    Api.this.dataLayer.updateTeamPresence(build.getTeamPresence());
                    Api.this.dataLayer.updateCarousel(build.getCarousel());
                    Api.this.dataLayer.updateBotIntro(build.getBotIntro());
                    Api.this.dataLayer.updateSurveyData(build.getSurveyData());
                    Api.this.dataLayer.updateBotBehaviourId(build.getBotBehaviourId());
                    Api.this.opsMetricTracker.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.TIME_TO_COMPLETE_PING);
                }
            }
        });
    }

    private Map<String, Object> statsSystemParams(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(INSTANCE_ID, str);
        hashMap.put("user", this.userIdentity.toMap());
        addSecureHash(hashMap);
        return hashMap;
    }
}

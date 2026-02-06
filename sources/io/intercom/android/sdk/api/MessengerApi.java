package io.intercom.android.sdk.api;

import gi.a;
import gi.o;
import gi.p;
import gi.s;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import java.util.Map;
import kotlin.Metadata;
import qf.C6658d;
import retrofit2.C6671d;
import rh.D;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\rJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0007J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u0016J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0007J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0010J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0016J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0007J)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\rJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010\rJ*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010\u0010J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010\u0016J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010\u0016J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0007J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010\u0016J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b+\u0010\u0016J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\u0016J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010\u0016J)\u00100\u001a\b\u0012\u0004\u0012\u00020/0\n2\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b0\u0010\rJ)\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b1\u0010\rJ \u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u0010\u0007J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b4\u0010\u0016J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b6\u0010\u0016J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b7\u0010\u0016J \u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b9\u0010\u0007J \u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010\u0007J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010\u0016J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b<\u0010\u0016J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\u0016J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b>\u0010\u0016J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b?\u0010\u0016J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\u0016J)\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\n2\b\b\u0001\u0010A\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bC\u0010\rJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010\u0016J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010\u0016¨\u0006G"}, d2 = {"Lio/intercom/android/sdk/api/MessengerApi;", "", "Lrh/D;", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "startNewConversationSuspend", "(Lrh/D;Lqf/d;)Ljava/lang/Object;", "", "conversationId", "Lretrofit2/d;", "Ljava/lang/Void;", "reactToConversation", "(Ljava/lang/String;Lrh/D;)Lretrofit2/d;", "Lio/intercom/android/sdk/models/Conversation;", "submitFormSuspend", "(Ljava/lang/String;Lrh/D;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/models/Part$Builder;", "replyToConversationSuspend", "markAsRead", "markAsReadSuspend", "markAsDismissed", "(Lrh/D;)Lretrofit2/d;", "recordInteractions", "Lio/intercom/android/sdk/models/ConversationsResponse$Builder;", "getConversationsSuspend", "Lio/intercom/android/sdk/models/UsersResponse$Builder;", "getUnreadConversations", "getUnreadConversationsSuspended", "getConversationSuspend", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "openMessenger", "openMessengerSuspended", "rateConversation", "addConversationRatingRemark", "addConversationQuickReplySuspend", "Lio/intercom/android/sdk/models/UpdateUserResponse$Builder;", "updateUser", "Lio/intercom/android/sdk/models/LogEventResponse$Builder;", "logEvent", "Lio/intercom/android/sdk/models/Upload$Builder;", "getUploadFileUrlSuspended", "setDeviceToken", "deleteDeviceToken", "setAuthToken", "sendMetrics", "articleId", "Lio/intercom/android/sdk/models/LinkResponse$Builder;", "getLink", "reactToLink", "Lio/intercom/android/sdk/models/GifResponse;", "getGifsSuspended", "reportError", "Lio/intercom/android/sdk/models/Sheet$Builder;", "getSheet", "submitSheet", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "getHomeCardsV2Suspend", "triggerInboundConversationSuspend", "markPushAsOpened", "markCarouselAsDismissed", "markCarouselAsCompleted", "markCarouselScreenViewed", "markPermissionGranted", "markCarouselActionButtonTapped", "carouselId", "Lio/intercom/android/sdk/models/carousel/CarouselResponse$Builder;", "getProgrammaticCarousel", "getCarousel", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "getSurvey", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MessengerApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String str, D d10, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    d10 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null);
                }
                return messengerApi.getConversationSuspend(str, d10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationSuspend");
        }

        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, D d10, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    d10 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null);
                }
                return messengerApi.getConversationsSuspend(d10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, D d10, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    d10 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null);
                }
                return messengerApi.getHomeCardsV2Suspend(d10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, D d10, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    d10 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null);
                }
                return messengerApi.getUnreadConversationsSuspended(d10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, D d10, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    d10 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null);
                }
                return messengerApi.openMessengerSuspended(d10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
        }
    }

    @o("conversations/{conversationId}/quick_reply")
    Object addConversationQuickReplySuspend(@s("conversationId") String str, @a D d10, C6658d<? super NetworkResponse<Part.Builder>> dVar);

    @o("conversations/{conversationId}/remark")
    C6671d<Void> addConversationRatingRemark(@s("conversationId") String str, @a D d10);

    @p("device_tokens")
    C6671d<Void> deleteDeviceToken(@a D d10);

    @o("content/fetch_carousel")
    C6671d<CarouselResponse.Builder> getCarousel(@a D d10);

    @o("conversations/{conversationId}")
    Object getConversationSuspend(@s("conversationId") String str, @a D d10, C6658d<? super NetworkResponse<Conversation>> dVar);

    @o("conversations/inbox")
    Object getConversationsSuspend(@a D d10, C6658d<? super NetworkResponse<ConversationsResponse.Builder>> dVar);

    @o("gifs")
    Object getGifsSuspended(@a D d10, C6658d<? super NetworkResponse<? extends GifResponse>> dVar);

    @o("home")
    Object getHomeCardsV2Suspend(@a D d10, C6658d<? super NetworkResponse<HomeV2Response>> dVar);

    @o("articles/{articleId}")
    C6671d<LinkResponse.Builder> getLink(@s("articleId") String str, @a D d10);

    @o("carousels/{carouselId}/fetch")
    C6671d<CarouselResponse.Builder> getProgrammaticCarousel(@s("carouselId") String str, @a D d10);

    @o("sheets/open")
    C6671d<Sheet.Builder> getSheet(@a D d10);

    @o("content/fetch_survey")
    C6671d<FetchSurveyRequest> getSurvey(@a D d10);

    @o("conversations/unread")
    C6671d<UsersResponse.Builder> getUnreadConversations(@a D d10);

    @o("conversations/unread")
    Object getUnreadConversationsSuspended(@a D d10, C6658d<? super NetworkResponse<? extends UsersResponse.Builder>> dVar);

    @o("uploads")
    Object getUploadFileUrlSuspended(@a D d10, C6658d<? super NetworkResponse<Upload.Builder>> dVar);

    @o("events")
    C6671d<LogEventResponse.Builder> logEvent(@a D d10);

    @o("conversations/dismiss")
    C6671d<Void> markAsDismissed(@a D d10);

    @o("conversations/{conversationId}/read")
    C6671d<Void> markAsRead(@s("conversationId") String str, @a D d10);

    @o("conversations/{conversationId}/read")
    Object markAsReadSuspend(@s("conversationId") String str, @a D d10, C6658d<? super NetworkResponse<Void>> dVar);

    @o("stats_system/carousel_button_action_tapped")
    C6671d<Void> markCarouselActionButtonTapped(@a D d10);

    @o("stats_system/carousel_completed")
    C6671d<Void> markCarouselAsCompleted(@a D d10);

    @o("stats_system/carousel_dismissed")
    C6671d<Void> markCarouselAsDismissed(@a D d10);

    @o("stats_system/carousel_screen_viewed")
    C6671d<Void> markCarouselScreenViewed(@a D d10);

    @o("stats_system/carousel_permission_granted")
    C6671d<Void> markPermissionGranted(@a D d10);

    @o("stats_system/push_opened")
    C6671d<Void> markPushAsOpened(@a D d10);

    @o("open")
    C6671d<OpenMessengerResponse> openMessenger(@a D d10);

    @o("open")
    Object openMessengerSuspended(@a D d10, C6658d<? super NetworkResponse<OpenMessengerResponse>> dVar);

    @o("conversations/{conversationId}/rate")
    C6671d<Void> rateConversation(@s("conversationId") String str, @a D d10);

    @o("conversations/{conversationId}/react")
    C6671d<Void> reactToConversation(@s("conversationId") String str, @a D d10);

    @o("articles/{articleId}/react")
    C6671d<Void> reactToLink(@s("articleId") String str, @a D d10);

    @o("conversations/{conversationId}/record_interactions")
    C6671d<Void> recordInteractions(@s("conversationId") String str, @a D d10);

    @o("conversations/{conversationId}/reply")
    Object replyToConversationSuspend(@s("conversationId") String str, @a D d10, C6658d<? super NetworkResponse<Part.Builder>> dVar);

    @o("error_reports")
    C6671d<Void> reportError(@a D d10);

    @o("metrics")
    C6671d<Void> sendMetrics(@a D d10);

    @o("user_auth_tokens")
    C6671d<Void> setAuthToken(@a D d10);

    @o("device_tokens")
    C6671d<Void> setDeviceToken(@a D d10);

    @o("conversations")
    Object startNewConversationSuspend(@a D d10, C6658d<? super NetworkResponse<ConversationResponse.Builder>> dVar);

    @o("conversations/{conversationId}/form")
    Object submitFormSuspend(@s("conversationId") String str, @a D d10, C6658d<? super NetworkResponse<Conversation>> dVar);

    @o("sheets/submit")
    C6671d<Void> submitSheet(@a D d10);

    @o("custom_bots/trigger_inbound_conversation")
    Object triggerInboundConversationSuspend(@a D d10, C6658d<? super NetworkResponse<Conversation>> dVar);

    @o("users")
    C6671d<UpdateUserResponse.Builder> updateUser(@a D d10);
}

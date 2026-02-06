package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.UsersResponse;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;

class CallbackHolder {
    /* access modifiers changed from: private */
    public static final Twig TWIG = LumberMill.getLogger();
    final IntercomDataLayer dataLayer;
    /* access modifiers changed from: private */
    public final UnreadConversationsTracker unreadConversationsTracker;
    /* access modifiers changed from: private */
    public final UserIdentity userIdentity;

    CallbackHolder(IntercomDataLayer intercomDataLayer, UserIdentity userIdentity2, UnreadConversationsTracker unreadConversationsTracker2) {
        this.dataLayer = intercomDataLayer;
        this.userIdentity = userIdentity2;
        this.unreadConversationsTracker = unreadConversationsTracker2;
    }

    /* access modifiers changed from: package-private */
    public BaseCallback<LogEventResponse.Builder> logEventCallback() {
        return new BaseCallback<LogEventResponse.Builder>() {
            public void onSuccess(LogEventResponse.Builder builder) {
                LogEventResponse build = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(build));
                CallbackHolder.this.unreadConversationsTracker.track(build);
                CallbackHolder.this.userIdentity.update(build.getUser());
                CallbackHolder.this.dataLayer.updateConfig(build.getConfig());
                CallbackHolder.this.dataLayer.updateCarousel(build.getCarousel());
                CallbackHolder.this.dataLayer.updateOverlayConversations(build.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(build.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }

    /* access modifiers changed from: package-private */
    public C6673f loggingCallback(final String str) {
        return new C6673f() {
            public void onFailure(C6671d<Void> dVar, Throwable th2) {
                Twig access$200 = CallbackHolder.TWIG;
                access$200.internal(str + " failure");
            }

            public void onResponse(C6671d<Void> dVar, F<Void> f10) {
                Twig access$200 = CallbackHolder.TWIG;
                access$200.internal(str + " success");
            }
        };
    }

    /* access modifiers changed from: package-private */
    public BaseCallback<UsersResponse.Builder> unreadCallback() {
        return new BaseCallback<UsersResponse.Builder>() {
            public void onSuccess(UsersResponse.Builder builder) {
                UsersResponse build = builder.build();
                CallbackHolder.this.dataLayer.emitEvent(new IntercomEvent.BaseResponseReceived(build));
                CallbackHolder.this.unreadConversationsTracker.track(build);
                CallbackHolder.this.userIdentity.update(build.getUser());
                CallbackHolder.this.dataLayer.updateConfig(build.getConfig());
                CallbackHolder.this.dataLayer.updateOverlayConversations(build.getUnreadConversations().getConversations());
                CallbackHolder.this.dataLayer.updateUnreadConversationIds(build.getUnreadConversations().getUnreadConversationIds());
            }
        };
    }
}

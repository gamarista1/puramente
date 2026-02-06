package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent;", "", "<init>", "()V", "NewConversation", "CardUpdated", "BaseResponseReceived", "SoftReset", "AppEnteredForeground", "ActivityReadyForViewAttachment", "ActivityPaused", "ActivityStopped", "AppEnteredBackground", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityPaused;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityReadyForViewAttachment;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityStopped;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredBackground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredForeground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$BaseResponseReceived;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$CardUpdated;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$NewConversation;", "Lio/intercom/android/sdk/m5/data/IntercomEvent$SoftReset;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class IntercomEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityPaused;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityPaused extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityPaused(Activity activity2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(activity2, "activity");
            this.activity = activity2;
        }

        public static /* synthetic */ ActivityPaused copy$default(ActivityPaused activityPaused, Activity activity2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity2 = activityPaused.activity;
            }
            return activityPaused.copy(activity2);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityPaused copy(Activity activity2) {
            C6496s.h(activity2, "activity");
            return new ActivityPaused(activity2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityPaused) && C6496s.c(this.activity, ((ActivityPaused) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityPaused(activity=" + this.activity + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityReadyForViewAttachment;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityReadyForViewAttachment extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityReadyForViewAttachment(Activity activity2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(activity2, "activity");
            this.activity = activity2;
        }

        public static /* synthetic */ ActivityReadyForViewAttachment copy$default(ActivityReadyForViewAttachment activityReadyForViewAttachment, Activity activity2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity2 = activityReadyForViewAttachment.activity;
            }
            return activityReadyForViewAttachment.copy(activity2);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityReadyForViewAttachment copy(Activity activity2) {
            C6496s.h(activity2, "activity");
            return new ActivityReadyForViewAttachment(activity2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityReadyForViewAttachment) && C6496s.c(this.activity, ((ActivityReadyForViewAttachment) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityReadyForViewAttachment(activity=" + this.activity + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$ActivityStopped;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityStopped extends IntercomEvent {
        public static final int $stable = 8;
        private final Activity activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityStopped(Activity activity2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(activity2, "activity");
            this.activity = activity2;
        }

        public static /* synthetic */ ActivityStopped copy$default(ActivityStopped activityStopped, Activity activity2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity2 = activityStopped.activity;
            }
            return activityStopped.copy(activity2);
        }

        public final Activity component1() {
            return this.activity;
        }

        public final ActivityStopped copy(Activity activity2) {
            C6496s.h(activity2, "activity");
            return new ActivityStopped(activity2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityStopped) && C6496s.c(this.activity, ((ActivityStopped) obj).activity);
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "ActivityStopped(activity=" + this.activity + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredBackground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppEnteredBackground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredBackground(long j10) {
            super((DefaultConstructorMarker) null);
            this.timestamp = j10;
        }

        public static /* synthetic */ AppEnteredBackground copy$default(AppEnteredBackground appEnteredBackground, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = appEnteredBackground.timestamp;
            }
            return appEnteredBackground.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final AppEnteredBackground copy(long j10) {
            return new AppEnteredBackground(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredBackground) && this.timestamp == ((AppEnteredBackground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "AppEnteredBackground(timestamp=" + this.timestamp + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$AppEnteredForeground;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppEnteredForeground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredForeground(long j10) {
            super((DefaultConstructorMarker) null);
            this.timestamp = j10;
        }

        public static /* synthetic */ AppEnteredForeground copy$default(AppEnteredForeground appEnteredForeground, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = appEnteredForeground.timestamp;
            }
            return appEnteredForeground.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final AppEnteredForeground copy(long j10) {
            return new AppEnteredForeground(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredForeground) && this.timestamp == ((AppEnteredForeground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "AppEnteredForeground(timestamp=" + this.timestamp + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$BaseResponseReceived;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "baseResponse", "Lio/intercom/android/sdk/models/BaseResponse;", "<init>", "(Lio/intercom/android/sdk/models/BaseResponse;)V", "getBaseResponse", "()Lio/intercom/android/sdk/models/BaseResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BaseResponseReceived extends IntercomEvent {
        public static final int $stable = 8;
        private final BaseResponse baseResponse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BaseResponseReceived(BaseResponse baseResponse2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(baseResponse2, "baseResponse");
            this.baseResponse = baseResponse2;
        }

        public static /* synthetic */ BaseResponseReceived copy$default(BaseResponseReceived baseResponseReceived, BaseResponse baseResponse2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                baseResponse2 = baseResponseReceived.baseResponse;
            }
            return baseResponseReceived.copy(baseResponse2);
        }

        public final BaseResponse component1() {
            return this.baseResponse;
        }

        public final BaseResponseReceived copy(BaseResponse baseResponse2) {
            C6496s.h(baseResponse2, "baseResponse");
            return new BaseResponseReceived(baseResponse2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaseResponseReceived) && C6496s.c(this.baseResponse, ((BaseResponseReceived) obj).baseResponse);
        }

        public final BaseResponse getBaseResponse() {
            return this.baseResponse;
        }

        public int hashCode() {
            return this.baseResponse.hashCode();
        }

        public String toString() {
            return "BaseResponseReceived(baseResponse=" + this.baseResponse + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$CardUpdated;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardUpdated extends IntercomEvent {
        public static final int $stable = 0;
        public static final CardUpdated INSTANCE = new CardUpdated();

        private CardUpdated() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$NewConversation;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "<init>", "(Lio/intercom/android/sdk/models/Conversation;)V", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewConversation extends IntercomEvent {
        public static final int $stable = 8;
        private final Conversation conversation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NewConversation(Conversation conversation2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(conversation2, "conversation");
            this.conversation = conversation2;
        }

        public static /* synthetic */ NewConversation copy$default(NewConversation newConversation, Conversation conversation2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversation2 = newConversation.conversation;
            }
            return newConversation.copy(conversation2);
        }

        public final Conversation component1() {
            return this.conversation;
        }

        public final NewConversation copy(Conversation conversation2) {
            C6496s.h(conversation2, "conversation");
            return new NewConversation(conversation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversation) && C6496s.c(this.conversation, ((NewConversation) obj).conversation);
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NewConversation(conversation=" + this.conversation + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomEvent$SoftReset;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SoftReset extends IntercomEvent {
        public static final int $stable = 0;
        public static final SoftReset INSTANCE = new SoftReset();

        private SoftReset() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ IntercomEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntercomEvent() {
    }
}

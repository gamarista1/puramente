package io.intercom.android.sdk.push;

import android.os.Bundle;
import com.amazon.a.a.o.b;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;

@AutoValue
public abstract class PushPayload {
    private static final String MESSAGE_TYPE = "message";
    private static final String PUSH_ONLY = "push_only";

    public static PushPayload create(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            return create(Bundle.EMPTY);
        }
        return new AutoValue_PushPayload(stringOrEmpty(bundle2, CreateTicketDestinationKt.CONVERSATION_ID), stringOrEmpty(bundle2, "message"), stringOrEmpty(bundle2, "body"), stringOrEmpty(bundle2, "author_name"), stringOrEmpty(bundle2, "image_url"), stringOrEmpty(bundle2, "content_image_url"), stringOrEmpty(bundle2, "app_name"), stringOrEmpty(bundle2, "receiver"), stringOrEmpty(bundle2, "conversation_part_type"), stringOrEmpty(bundle2, "intercom_push_type"), stringOrEmpty(bundle2, "uri"), stringOrEmpty(bundle2, "push_only_conv_id"), stringOrEmpty(bundle2, "instance_id"), stringOrEmpty(bundle2, b.f37461S), bundle2.getInt("intercom_priority_type", 1));
    }

    private static String stringOrEmpty(Bundle bundle, String str) {
        return bundle.getString(str, "");
    }

    public abstract String getAppName();

    public abstract String getAuthorName();

    public abstract String getBody();

    public abstract String getContentImageUrl();

    public abstract String getConversationId();

    public abstract String getConversationPartType();

    public abstract String getImageUrl();

    public abstract String getInstanceId();

    public abstract String getIntercomPushType();

    public abstract String getMessage();

    public abstract int getPriority();

    public abstract String getPushOnlyConversationId();

    public abstract String getReceiver();

    public abstract String getTitle();

    public abstract String getUri();

    /* access modifiers changed from: package-private */
    public boolean isFirstPart() {
        return "message".equals(getConversationPartType());
    }

    /* access modifiers changed from: package-private */
    public boolean isIntercomPush() {
        if (getIntercomPushType().isEmpty() || !Intercom.PUSH_RECEIVER.equals(getReceiver())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPushOnly() {
        return PUSH_ONLY.equals(getIntercomPushType());
    }

    /* access modifiers changed from: package-private */
    public String messageOrBody() {
        if (getMessage().isEmpty()) {
            return getBody();
        }
        return getMessage();
    }
}

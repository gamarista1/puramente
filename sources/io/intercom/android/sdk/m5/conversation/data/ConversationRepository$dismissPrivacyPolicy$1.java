package io.intercom.android.sdk.m5.conversation.data;

import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/intercom/android/sdk/m5/conversation/data/ConversationRepository$dismissPrivacyPolicy$1", "Lio/intercom/android/sdk/IntercomStatusCallback;", "Llf/M;", "onSuccess", "()V", "Lio/intercom/android/sdk/IntercomError;", "intercomError", "onFailure", "(Lio/intercom/android/sdk/IntercomError;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationRepository$dismissPrivacyPolicy$1 implements IntercomStatusCallback {
    ConversationRepository$dismissPrivacyPolicy$1() {
    }

    public void onFailure(IntercomError intercomError) {
        C6496s.h(intercomError, "intercomError");
    }

    public void onSuccess() {
    }
}

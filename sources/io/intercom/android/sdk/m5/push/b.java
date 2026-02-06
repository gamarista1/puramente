package io.intercom.android.sdk.m5.push;

import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import yf.C6798l;

public final /* synthetic */ class b implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomPushConversation f70021a;

    public /* synthetic */ b(IntercomPushConversation intercomPushConversation) {
        this.f70021a = intercomPushConversation;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(IntercomNotificationHandler.updateConversations$lambda$6(this.f70021a, (IntercomPushConversation) obj));
    }
}

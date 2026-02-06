package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import yf.p;

public final /* synthetic */ class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f70022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntercomPushData.ConversationPushData f70023b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TimeProvider f70024c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f70025d;

    public /* synthetic */ c(Context context, IntercomPushData.ConversationPushData conversationPushData, TimeProvider timeProvider, boolean z10) {
        this.f70022a = context;
        this.f70023b = conversationPushData;
        this.f70024c = timeProvider;
        this.f70025d = z10;
    }

    public final Object invoke(Object obj, Object obj2) {
        return IntercomNotificationHandler.processConversationPushNotification$lambda$4(this.f70022a, this.f70023b, this.f70024c, this.f70025d, (Bitmap) obj, (Bitmap) obj2);
    }
}

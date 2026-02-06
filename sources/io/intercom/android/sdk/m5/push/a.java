package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import yf.p;

public final /* synthetic */ class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f70019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntercomPushData.DeepLinkPushData f70020b;

    public /* synthetic */ a(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData) {
        this.f70019a = context;
        this.f70020b = deepLinkPushData;
    }

    public final Object invoke(Object obj, Object obj2) {
        return IntercomNotificationHandler.processDeepLinkPushNotification$lambda$0(this.f70019a, this.f70020b, (Bitmap) obj, (Bitmap) obj2);
    }
}

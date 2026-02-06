package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.o;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"buildDeepLinkNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "deepLinkPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "contentBitmap", "Landroid/graphics/Bitmap;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkStylePushUIKt {
    public static final Notification buildDeepLinkNotification(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap) {
        C6496s.h(context, "context");
        C6496s.h(deepLinkPushData, "deepLinkPushData");
        o.f createBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, deepLinkPushData.getContentTitle(), deepLinkPushData.getContentText(), NotificationChannel.ACTIONS_CHANNEL);
        if (bitmap != null) {
            createBaseNotificationBuilder.H(new o.c().i(bitmap).h((Bitmap) null).j(deepLinkPushData.getContentTitle()).k(deepLinkPushData.getContentText()));
            createBaseNotificationBuilder.u(bitmap);
        } else {
            createBaseNotificationBuilder.H(new o.d().i(deepLinkPushData.getContentTitle()).h(deepLinkPushData.getContentText()));
        }
        Notification c10 = createBaseNotificationBuilder.m(ConversationDeepLinkRouterKt.buildIntentForDeepLinkScreen(context, deepLinkPushData.getUri(), deepLinkPushData.getInstanceId())).c();
        C6496s.g(c10, "build(...)");
        return c10;
    }
}

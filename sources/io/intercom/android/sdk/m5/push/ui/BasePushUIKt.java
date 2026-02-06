package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import androidx.core.app.o;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "", "contentTitle", "contentText", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "notificationChannel", "Landroidx/core/app/o$f;", "createBaseNotificationBuilder", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/push/NotificationChannel;)Landroidx/core/app/o$f;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BasePushUIKt {
    public static final o.f createBaseNotificationBuilder(Context context, String str, String str2, NotificationChannel notificationChannel) {
        C6496s.h(context, "context");
        C6496s.h(str, "contentTitle");
        C6496s.h(str2, "contentText");
        C6496s.h(notificationChannel, "notificationChannel");
        o.f f10 = new o.f(context, notificationChannel.getChannelName()).o(str).n(str2).F(R.drawable.intercom_push_icon).f(true);
        C6496s.g(f10, "setAutoCancel(...)");
        return f10;
    }
}

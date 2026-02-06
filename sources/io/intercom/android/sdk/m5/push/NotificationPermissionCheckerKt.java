package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.r;
import androidx.core.content.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "context", "", "notificationId", "Landroid/app/Notification;", "notification", "Llf/M;", "showNotification", "(Landroid/content/Context;ILandroid/app/Notification;)V", "", "notifications", "showNotifications", "(Landroid/content/Context;Ljava/util/Map;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(Context context, int i10, Notification notification) {
        C6496s.h(context, "context");
        C6496s.h(notification, "notification");
        showNotifications(context, O.f(C6502A.a(Integer.valueOf(i10), notification)));
    }

    public static final void showNotifications(Context context, Map<Integer, ? extends Notification> map) {
        C6496s.h(context, "context");
        C6496s.h(map, "notifications");
        r f10 = r.f(context);
        if (Build.VERSION.SDK_INT < 33 || c.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            for (Map.Entry next : map.entrySet()) {
                f10.h(((Number) next.getKey()).intValue(), (Notification) next.getValue());
            }
        }
    }
}

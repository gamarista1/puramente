package androidx.media.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

abstract class b {
    @SuppressLint({"MissingPermission"})
    static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i10, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i10, pendingIntent);
        }
        return mediaStyle;
    }
}

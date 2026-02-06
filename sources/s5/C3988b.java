package s5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import o1.h;

/* renamed from: s5.b  reason: case insensitive filesystem */
class C3988b {

    /* renamed from: b  reason: collision with root package name */
    private static Bundle f48057b;

    /* renamed from: a  reason: collision with root package name */
    private Context f48058a;

    public C3988b(Context context) {
        this.f48058a = context;
        if (f48057b == null) {
            try {
                f48057b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                Log.e(RNPushNotification.LOG_TAG, "Error reading application meta, falling back to defaults");
                f48057b = new Bundle();
            }
        }
    }

    private String c(String str, String str2) {
        try {
            String string = f48057b.getString(str);
            if (string == null || string.length() <= 0) {
                return str2;
            }
            return string;
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + str + " in manifest. Falling back to default");
        }
    }

    public int a() {
        try {
            return h.d(this.f48058a.getResources(), f48057b.getInt("com.dieam.reactnativepushnotification.notification_color"), (Resources.Theme) null);
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.notification_color in manifest. Falling back to default");
            return -1;
        }
    }

    public String b() {
        try {
            return c("com.dieam.reactnativepushnotification.default_notification_channel_id", c("com.google.firebase.messaging.default_notification_channel_id", "fcm_fallback_notification_channel"));
        } catch (Exception unused) {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find com.dieam.reactnativepushnotification.default_notification_channel_id in manifest. Falling back to default");
            return "fcm_fallback_notification_channel";
        }
    }
}

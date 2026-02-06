package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.o;
import androidx.core.content.c;
import java.util.concurrent.atomic.AtomicInteger;
import s5.i;

/* renamed from: com.google.firebase.messaging.d  reason: case insensitive filesystem */
public abstract class C4823d {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f57504a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final o.f f57505a;

        /* renamed from: b  reason: collision with root package name */
        public final String f57506b;

        /* renamed from: c  reason: collision with root package name */
        public final int f57507c;

        a(o.f fVar, String str, int i10) {
            this.f57505a = fVar;
            this.f57506b = str;
            this.f57507c = i10;
        }
    }

    private static PendingIntent a(Context context, N n10, String str, PackageManager packageManager) {
        Intent f10 = f(str, n10, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(n10.y());
        if (q(n10)) {
            f10.putExtra("gcm.n.analytics_data", n10.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, N n10) {
        if (!q(n10)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(n10.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, N n10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        o.f fVar = new o.f(context2, str);
        String n11 = n10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n11)) {
            fVar.o(n11);
        }
        String n12 = n10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n12)) {
            fVar.n(n12);
            fVar.H(new o.d().h(n12));
        }
        fVar.F(m(packageManager, resources, packageName, n10.p("gcm.n.icon"), bundle));
        Uri n13 = n(packageName, n10, resources);
        if (n13 != null) {
            fVar.G(n13);
        }
        fVar.m(a(context, n10, packageName, packageManager));
        PendingIntent b10 = b(context, context2, n10);
        if (b10 != null) {
            fVar.q(b10);
        }
        Integer h10 = h(context2, n10.p("gcm.n.color"), bundle);
        if (h10 != null) {
            fVar.j(h10.intValue());
        }
        fVar.f(!n10.a("gcm.n.sticky"));
        fVar.w(n10.a("gcm.n.local_only"));
        String p10 = n10.p("gcm.n.ticker");
        if (p10 != null) {
            fVar.J(p10);
        }
        Integer m10 = n10.m();
        if (m10 != null) {
            fVar.A(m10.intValue());
        }
        Integer r10 = n10.r();
        if (r10 != null) {
            fVar.N(r10.intValue());
        }
        Integer l10 = n10.l();
        if (l10 != null) {
            fVar.x(l10.intValue());
        }
        Long j10 = n10.j("gcm.n.event_time");
        if (j10 != null) {
            fVar.D(true);
            fVar.O(j10.longValue());
        }
        long[] q10 = n10.q();
        if (q10 != null) {
            fVar.M(q10);
        }
        int[] e10 = n10.e();
        if (e10 != null) {
            fVar.v(e10[0], e10[1], e10[2]);
        }
        fVar.p(i(n10));
        return new a(fVar, o(n10), 0);
    }

    static a e(Context context, N n10) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, n10, k(context, n10.k(), j10), j10);
    }

    private static Intent f(String str, N n10, PackageManager packageManager) {
        String p10 = n10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = n10.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f57504a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(c.getColor(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static int i(N n10) {
        boolean a10 = n10.a("gcm.n.default_sound");
        if (n10.a("gcm.n.default_vibrate_timings")) {
            a10 |= true;
        }
        return n10.a("gcm.n.default_light_settings") ? a10 | true ? 1 : 0 : a10 ? 1 : 0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(i.a("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, N n10, Resources resources) {
        String o10 = n10.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if ("default".equals(o10) || resources.getIdentifier(o10, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o10);
    }

    private static String o(N n10) {
        String p10 = n10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C4822c.a(resources.getDrawable(i10, (Resources.Theme) null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(N n10) {
        return n10.a("google.c.a.e");
    }
}

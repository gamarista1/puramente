package s5;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationPublisher;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import s5.t;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private Context f48059a;

    /* renamed from: b  reason: collision with root package name */
    private C3988b f48060b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f48061c;

    class a implements t.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f48062a;

        a(Bundle bundle) {
            this.f48062a = bundle;
        }

        public void a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            s.this.y(this.f48062a, bitmap, bitmap2, bitmap3);
        }
    }

    public s(Application application) {
        this.f48059a = application;
        this.f48060b = new C3988b(application);
        this.f48061c = application.getSharedPreferences("rn_push_notification", 0);
    }

    private boolean e(NotificationManager notificationManager, String str, String str2, String str3, Uri uri, int i10, long[] jArr) {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return false;
        }
        NotificationChannel a10 = notificationManager.getNotificationChannel(str);
        if ((a10 != null || str2 == null || str3 == null) && (a10 == null || ((str2 == null || str2.equals(a10.getName())) && (str3 == null || str3.equals(a10.getDescription()))))) {
            return false;
        }
        NotificationChannel a11 = i.a(str, str2, i10);
        a11.setDescription(str3);
        a11.enableLights(true);
        if (jArr != null) {
            z10 = true;
        }
        a11.enableVibration(z10);
        a11.setVibrationPattern(jArr);
        if (uri != null) {
            a11.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
        } else {
            a11.setSound((Uri) null, (AudioAttributes) null);
        }
        notificationManager.createNotificationChannel(a11);
        return true;
    }

    private AlarmManager k() {
        return (AlarmManager) this.f48059a.getSystemService("alarm");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 3
            r3 = 2
            switch(r0) {
                case -1074026988: goto L_0x0033;
                case 99228: goto L_0x0029;
                case 3208676: goto L_0x001f;
                case 3645428: goto L_0x0015;
                case 104080000: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x003d
        L_0x000b:
            java.lang.String r0 = "month"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = 0
            goto L_0x003e
        L_0x0015:
            java.lang.String r0 = "week"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r1
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "hour"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r3
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "day"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = 4
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "minute"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r2
            goto L_0x003e
        L_0x003d:
            r5 = -1
        L_0x003e:
            if (r5 == 0) goto L_0x004f
            if (r5 == r1) goto L_0x004e
            if (r5 == r3) goto L_0x004b
            if (r5 == r2) goto L_0x0048
            r5 = 5
            return r5
        L_0x0048:
            r5 = 12
            return r5
        L_0x004b:
            r5 = 10
            return r5
        L_0x004e:
            return r2
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.s.n(java.lang.String):int");
    }

    private Uri p(String str) {
        int i10;
        if (str == null || "default".equalsIgnoreCase(str)) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (this.f48059a.getResources().getIdentifier(str, "raw", this.f48059a.getPackageName()) != 0) {
            i10 = this.f48059a.getResources().getIdentifier(str, "raw", this.f48059a.getPackageName());
        } else {
            i10 = this.f48059a.getResources().getIdentifier(str.substring(0, str.lastIndexOf(46)), "raw", this.f48059a.getPackageName());
        }
        return Uri.parse("android.resource://" + this.f48059a.getPackageName() + "/" + i10);
    }

    private NotificationManager t() {
        return (NotificationManager) this.f48059a.getSystemService("notification");
    }

    private void u(Bundle bundle) {
        long j10;
        int i10;
        String string = bundle.getString("repeatType");
        long j11 = (long) bundle.getDouble("repeatTime");
        if (string != null) {
            long j12 = (long) bundle.getDouble("fireDate");
            if (!Arrays.asList(new String[]{com.amazon.a.a.h.a.f37179b, "month", "week", "day", "hour", "minute"}).contains(string)) {
                Log.w(RNPushNotification.LOG_TAG, String.format("Invalid repeatType specified as %s", new Object[]{string}));
            } else if (!com.amazon.a.a.h.a.f37179b.equals(string) || j11 > 0) {
                if (com.amazon.a.a.h.a.f37179b.equals(string)) {
                    j10 = j12 + j11;
                } else {
                    int n10 = n(string);
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(j12);
                    if (j11 > 0) {
                        i10 = (int) j11;
                    } else {
                        i10 = 1;
                    }
                    instance.add(n10, i10);
                    j10 = instance.getTimeInMillis();
                }
                if (j10 != 0) {
                    Log.d(RNPushNotification.LOG_TAG, String.format("Repeating notification with id %s at time %s", new Object[]{bundle.getString("id"), Long.toString(j10)}));
                    bundle.putDouble("fireDate", (double) j10);
                    v(bundle);
                }
            } else {
                Log.w(RNPushNotification.LOG_TAG, "repeatType specified as time but no repeatTime has been mentioned");
            }
        }
    }

    private PendingIntent z(Bundle bundle) {
        try {
            int parseInt = Integer.parseInt(bundle.getString("id"));
            Intent intent = new Intent(this.f48059a, RNPushNotificationPublisher.class);
            intent.putExtra("notificationId", parseInt);
            intent.putExtras(bundle);
            return PendingIntent.getBroadcast(this.f48059a, parseInt, intent, 201326592);
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID", e10);
            return null;
        }
    }

    public void a() {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling all notifications");
        for (String b10 : this.f48061c.getAll().keySet()) {
            b(b10);
        }
    }

    public void b(String str) {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling notification: " + str);
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        PendingIntent z10 = z(bundle);
        if (z10 != null) {
            k().cancel(z10);
        }
        if (this.f48061c.contains(str)) {
            SharedPreferences.Editor edit = this.f48061c.edit();
            edit.remove(str);
            edit.apply();
        } else {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find notification " + str);
        }
        try {
            t().cancel(Integer.parseInt(str));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID " + str, e10);
        }
    }

    public boolean c(String str) {
        NotificationManager t10;
        NotificationChannel a10;
        if (Build.VERSION.SDK_INT >= 26 && (t10 = t()) != null && (a10 = t10.getNotificationChannel(str)) != null && a10.getImportance() == 0) {
            return true;
        }
        return false;
    }

    public boolean d(String str) {
        NotificationManager t10;
        if (Build.VERSION.SDK_INT < 26 || (t10 = t()) == null || t10.getNotificationChannel(str) == null) {
            return false;
        }
        return true;
    }

    public void f(ReadableArray readableArray) {
        NotificationManager t10 = t();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            Log.i(RNPushNotification.LOG_TAG, "Removing notification with id " + string);
            t10.cancel(Integer.parseInt(string));
        }
    }

    public void g(String str, int i10) {
        Log.i(RNPushNotification.LOG_TAG, "Clearing notification: " + i10);
        NotificationManager t10 = t();
        if (str != null) {
            t10.cancel(str, i10);
        } else {
            t10.cancel(i10);
        }
    }

    public void h() {
        Log.i(RNPushNotification.LOG_TAG, "Clearing alerts from the notification centre");
        t().cancelAll();
    }

    public boolean i(ReadableMap readableMap) {
        String str;
        boolean z10;
        String str2;
        int i10;
        Uri uri;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        String string = readableMap.getString("channelId");
        String string2 = readableMap.getString("channelName");
        if (readableMap.hasKey("channelDescription")) {
            str = readableMap.getString("channelDescription");
        } else {
            str = "";
        }
        String str3 = str;
        if (!readableMap.hasKey("playSound") || readableMap.getBoolean("playSound")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (readableMap.hasKey("soundName")) {
            str2 = readableMap.getString("soundName");
        } else {
            str2 = "default";
        }
        if (readableMap.hasKey("importance")) {
            i10 = readableMap.getInt("importance");
        } else {
            i10 = 4;
        }
        int i11 = i10;
        long[] jArr = (!readableMap.hasKey("vibrate") || !readableMap.getBoolean("vibrate")) ? null : new long[]{0, 300};
        NotificationManager t10 = t();
        if (z10) {
            uri = p(str2);
        } else {
            uri = null;
        }
        return e(t10, string, string2, str3, uri, i11, jArr);
    }

    public void j(String str) {
        NotificationManager t10;
        if (Build.VERSION.SDK_INT >= 26 && (t10 = t()) != null) {
            t10.deleteNotificationChannel(str);
        }
    }

    public WritableArray l() {
        WritableArray createArray = Arguments.createArray();
        StatusBarNotification[] activeNotifications = t().getActiveNotifications();
        Log.i(RNPushNotification.LOG_TAG, "Found " + activeNotifications.length + " delivered notifications");
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("identifier", "" + statusBarNotification.getId());
            createMap.putString(b.f37461S, bundle.getString("android.title"));
            createMap.putString("body", bundle.getString("android.text"));
            createMap.putString("tag", statusBarNotification.getTag());
            createMap.putString("group", notification.getGroup());
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public Class m() {
        try {
            return Class.forName(this.f48059a.getPackageManager().getLaunchIntentForPackage(this.f48059a.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public WritableArray o() {
        WritableArray createArray = Arguments.createArray();
        for (Map.Entry value : this.f48061c.getAll().entrySet()) {
            try {
                C3987a a10 = C3987a.a(value.getValue().toString());
                WritableMap createMap = Arguments.createMap();
                createMap.putString(b.f37461S, a10.h());
                createMap.putString(MetricTracker.Object.MESSAGE, a10.d());
                createMap.putString(AttributeType.NUMBER, a10.e());
                createMap.putDouble(AttributeType.DATE, a10.b());
                createMap.putString("id", a10.c());
                createMap.putString("repeatInterval", a10.f());
                createMap.putString("soundName", a10.g());
                createMap.putString("data", a10.i());
                createArray.pushMap(createMap);
            } catch (JSONException e10) {
                Log.e(RNPushNotification.LOG_TAG, e10.getMessage());
            }
        }
        return createArray;
    }

    public void q(Bundle bundle) {
        try {
            Intent intent = new Intent(this.f48059a, Class.forName(this.f48059a.getPackageManager().getLaunchIntentForPackage(this.f48059a.getPackageName()).getComponent().getClassName()));
            if (bundle != null) {
                intent.putExtra("notification", bundle);
            }
            intent.addFlags(268435456);
            this.f48059a.startActivity(intent);
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Class not found", e10);
        }
    }

    public boolean r() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f48059a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.processName.equals(this.f48059a.getPackageName()) && next.importance == 100 && next.pkgList.length > 0) {
                return true;
            }
        }
        return false;
    }

    public List s() {
        NotificationManager t10;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 26 || (t10 = t()) == null) {
            return arrayList;
        }
        for (Object a10 : t10.getNotificationChannels()) {
            arrayList.add(g.a(a10).getId());
        }
        return arrayList;
    }

    public void v(Bundle bundle) {
        if (m() == null) {
            Log.e(RNPushNotification.LOG_TAG, "No activity class found for the scheduled notification");
        } else if (bundle.getString(MetricTracker.Object.MESSAGE) == null) {
            Log.e(RNPushNotification.LOG_TAG, "No message specified for the scheduled notification");
        } else if (bundle.getString("id") == null) {
            Log.e(RNPushNotification.LOG_TAG, "No notification ID specified for the scheduled notification");
        } else if (bundle.getDouble("fireDate") == 0.0d) {
            Log.e(RNPushNotification.LOG_TAG, "No date specified for the scheduled notification");
        } else {
            C3987a aVar = new C3987a(bundle);
            String c10 = aVar.c();
            Log.d(RNPushNotification.LOG_TAG, "Storing push notification with id " + c10);
            SharedPreferences.Editor edit = this.f48061c.edit();
            edit.putString(c10, aVar.k().toString());
            edit.apply();
            if (!this.f48061c.contains(c10)) {
                Log.e(RNPushNotification.LOG_TAG, "Failed to save " + c10);
            }
            w(bundle);
        }
    }

    public void w(Bundle bundle) {
        long j10 = (long) bundle.getDouble("fireDate");
        boolean z10 = bundle.getBoolean("allowWhileIdle");
        PendingIntent z11 = z(bundle);
        if (z11 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && !k().canScheduleExactAlarms()) {
                return;
            }
            if (i10 < 31 || k().canScheduleExactAlarms()) {
                Log.d(RNPushNotification.LOG_TAG, String.format("Setting a notification with id %s at time %s", new Object[]{bundle.getString("id"), Long.toString(j10)}));
                if (z10) {
                    k().setExactAndAllowWhileIdle(0, j10, z11);
                } else {
                    k().setExact(0, j10, z11);
                }
            }
        }
    }

    public void x(Bundle bundle) {
        t tVar = new t(new a(bundle));
        tVar.h(this.f48059a, bundle.getString("largeIconUrl"));
        tVar.d(this.f48059a, bundle.getString("bigLargeIconUrl"));
        tVar.f(this.f48059a, bundle.getString("bigPictureUrl"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        if (r4 == 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        if (r4 == 1) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r4 == 2) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r4 == 3) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        if (r4 == 4) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        r4 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01bc A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01cf A[SYNTHETIC, Splitter:B:108:0x01cf] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e7 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f5 A[SYNTHETIC, Splitter:B:121:0x01f5] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0203 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0231 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0243 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0248 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x027b A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02c6 A[SYNTHETIC, Splitter:B:164:0x02c6] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02d0 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02e8 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x031a A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0322 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0348 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x034b A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x037b A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x039f A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03bc A[Catch:{ JSONException -> 0x03c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03d6 A[Catch:{ Exception -> 0x0417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x049e A[Catch:{ Exception -> 0x0417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ca A[Catch:{ Exception -> 0x0417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04d2 A[Catch:{ Exception -> 0x0417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x012e A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0192 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019e A[Catch:{ Exception -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(android.os.Bundle r30, android.graphics.Bitmap r31, android.graphics.Bitmap r32, android.graphics.Bitmap r33) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r0 = r32
            java.lang.String r3 = "tag"
            java.lang.String r4 = "actions"
            java.lang.String r7 = "vibration"
            java.lang.String r11 = "vibrate"
            java.lang.String r12 = "playSound"
            java.lang.String r13 = "notification"
            java.lang.String r14 = "message"
            java.lang.String r15 = "ongoing"
            java.lang.String r5 = "groupSummary"
            java.lang.String r6 = "RNPushNotification"
            java.lang.Class r8 = r29.m()     // Catch:{ Exception -> 0x0026 }
            if (r8 != 0) goto L_0x002a
            java.lang.String r0 = "No activity class found for the notification"
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x0026 }
            return
        L_0x0026:
            r0 = move-exception
            r10 = r6
            goto L_0x04d9
        L_0x002a:
            java.lang.String r18 = r2.getString(r14)     // Catch:{ Exception -> 0x0026 }
            if (r18 != 0) goto L_0x0045
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r0.<init>()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = "Ignore this message if you sent data-only notification. Cannot send to notification centre because there is no 'message' field in: "
            r0.append(r3)     // Catch:{ Exception -> 0x0026 }
            r0.append(r2)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0026 }
            android.util.Log.d(r6, r0)     // Catch:{ Exception -> 0x0026 }
            return
        L_0x0045:
            java.lang.String r9 = "id"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x0026 }
            if (r9 != 0) goto L_0x0053
            java.lang.String r0 = "No notification ID specified for the notification"
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x0026 }
            return
        L_0x0053:
            android.content.Context r10 = r1.f48059a     // Catch:{ Exception -> 0x0026 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0026 }
            r19 = r3
            android.content.Context r3 = r1.f48059a     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0026 }
            r20 = r6
            java.lang.String r6 = "title"
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0082 }
            if (r6 != 0) goto L_0x0087
            android.content.Context r6 = r1.f48059a     // Catch:{ Exception -> 0x0082 }
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch:{ Exception -> 0x0082 }
            r21 = r4
            android.content.Context r4 = r1.f48059a     // Catch:{ Exception -> 0x0082 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x0082 }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r0 = move-exception
            r10 = r20
            goto L_0x04d9
        L_0x0087:
            r21 = r4
        L_0x0089:
            java.lang.String r4 = "priority"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0082 }
            r22 = r7
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x0082 }
            int r23 = r4.hashCode()     // Catch:{ Exception -> 0x0082 }
            switch(r23) {
                case 107348: goto L_0x00c7;
                case 107876: goto L_0x00bd;
                case 108114: goto L_0x00b3;
                case 3202466: goto L_0x00a9;
                case 1544803905: goto L_0x009f;
                default: goto L_0x009e;
            }     // Catch:{ Exception -> 0x0082 }
        L_0x009e:
            goto L_0x00d1
        L_0x009f:
            java.lang.String r7 = "default"
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00d1
            r4 = 4
            goto L_0x00d2
        L_0x00a9:
            java.lang.String r7 = "high"
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00d1
            r4 = 1
            goto L_0x00d2
        L_0x00b3:
            java.lang.String r7 = "min"
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00d1
            r4 = 3
            goto L_0x00d2
        L_0x00bd:
            java.lang.String r7 = "max"
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00d1
            r4 = 0
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r7 = "low"
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x00d1
            r4 = 2
            goto L_0x00d2
        L_0x00d1:
            r4 = -1
        L_0x00d2:
            if (r4 == 0) goto L_0x00e8
            r7 = 1
            if (r4 == r7) goto L_0x00e0
            r7 = 2
            if (r4 == r7) goto L_0x00e6
            r7 = 3
            if (r4 == r7) goto L_0x00e4
            r7 = 4
            if (r4 == r7) goto L_0x00e2
        L_0x00e0:
            r4 = 1
            goto L_0x00e9
        L_0x00e2:
            r4 = 0
            goto L_0x00e9
        L_0x00e4:
            r4 = -2
            goto L_0x00e9
        L_0x00e6:
            r4 = -1
            goto L_0x00e9
        L_0x00e8:
            r4 = 2
        L_0x00e9:
            java.lang.String r7 = "visibility"
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Exception -> 0x0082 }
            if (r7 == 0) goto L_0x013a
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Exception -> 0x0082 }
            r23 = r11
            int r11 = r7.hashCode()     // Catch:{ Exception -> 0x0082 }
            r24 = r9
            r9 = -977423767(0xffffffffc5bdb269, float:-6070.3013)
            if (r11 == r9) goto L_0x0121
            r9 = -906277200(0xffffffffc9fb4eb0, float:-2058710.0)
            if (r11 == r9) goto L_0x0117
            r9 = -314497661(0xffffffffed412583, float:-3.7359972E27)
            if (r11 == r9) goto L_0x010d
            goto L_0x012b
        L_0x010d:
            java.lang.String r9 = "private"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x0082 }
            if (r7 == 0) goto L_0x012b
            r7 = 0
            goto L_0x012c
        L_0x0117:
            java.lang.String r9 = "secret"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x0082 }
            if (r7 == 0) goto L_0x012b
            r7 = 2
            goto L_0x012c
        L_0x0121:
            java.lang.String r9 = "public"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x0082 }
            if (r7 == 0) goto L_0x012b
            r7 = 1
            goto L_0x012c
        L_0x012b:
            r7 = -1
        L_0x012c:
            if (r7 == 0) goto L_0x0134
            r9 = 1
            if (r7 == r9) goto L_0x0138
            r9 = 2
            if (r7 == r9) goto L_0x0136
        L_0x0134:
            r7 = 0
            goto L_0x013f
        L_0x0136:
            r7 = -1
            goto L_0x013f
        L_0x0138:
            r7 = 1
            goto L_0x013f
        L_0x013a:
            r24 = r9
            r23 = r11
            goto L_0x0134
        L_0x013f:
            java.lang.String r9 = "channelId"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x0082 }
            if (r9 != 0) goto L_0x014d
            s5.b r9 = r1.f48060b     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = r9.b()     // Catch:{ Exception -> 0x0082 }
        L_0x014d:
            androidx.core.app.o$f r11 = new androidx.core.app.o$f     // Catch:{ Exception -> 0x0082 }
            r25 = r15
            android.content.Context r15 = r1.f48059a     // Catch:{ Exception -> 0x0082 }
            r11.<init>(r15, r9)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r11 = r11.o(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r15 = "ticker"
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r11 = r11.J(r15)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r7 = r11.N(r7)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r4 = r7.A(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = "autoCancel"
            r11 = 1
            boolean r7 = r2.getBoolean(r7, r11)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r4 = r4.f(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = "onlyAlertOnce"
            r11 = 0
            boolean r7 = r2.getBoolean(r7, r11)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$f r4 = r4.z(r7)     // Catch:{ Exception -> 0x0082 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = "showWhen"
            r15 = 1
            boolean r11 = r2.getBoolean(r11, r15)     // Catch:{ Exception -> 0x0082 }
            r4.D(r11)     // Catch:{ Exception -> 0x0082 }
            r11 = 26
            if (r7 < r11) goto L_0x0196
            r15 = 4
            r4.p(r15)     // Catch:{ Exception -> 0x0082 }
        L_0x0196:
            java.lang.String r15 = "group"
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0082 }
            if (r15 == 0) goto L_0x01a1
            r4.s(r15)     // Catch:{ Exception -> 0x0082 }
        L_0x01a1:
            boolean r15 = r2.containsKey(r5)     // Catch:{ Exception -> 0x0082 }
            if (r15 != 0) goto L_0x01ad
            boolean r15 = r2.getBoolean(r5)     // Catch:{ Exception -> 0x0082 }
            if (r15 == 0) goto L_0x01b4
        L_0x01ad:
            boolean r5 = r2.getBoolean(r5)     // Catch:{ Exception -> 0x0082 }
            r4.t(r5)     // Catch:{ Exception -> 0x0082 }
        L_0x01b4:
            java.lang.String r5 = "number"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0082 }
            if (r5 == 0) goto L_0x01c3
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0082 }
            r4.x(r5)     // Catch:{ Exception -> 0x0082 }
        L_0x01c3:
            java.lang.String r5 = "smallIcon"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r15 = "drawable"
            java.lang.String r11 = "mipmap"
            if (r5 == 0) goto L_0x01e5
            boolean r26 = r5.isEmpty()     // Catch:{ Exception -> 0x0082 }
            if (r26 != 0) goto L_0x01e5
            int r26 = r10.getIdentifier(r5, r15, r3)     // Catch:{ Exception -> 0x0082 }
            if (r26 != 0) goto L_0x01e2
            int r5 = r10.getIdentifier(r5, r11, r3)     // Catch:{ Exception -> 0x0082 }
        L_0x01df:
            r26 = r9
            goto L_0x01f1
        L_0x01e2:
            r5 = r26
            goto L_0x01df
        L_0x01e5:
            if (r5 != 0) goto L_0x01ee
            java.lang.String r5 = "ic_notification"
            int r5 = r10.getIdentifier(r5, r11, r3)     // Catch:{ Exception -> 0x0082 }
            goto L_0x01df
        L_0x01ee:
            r26 = r9
            r5 = 0
        L_0x01f1:
            java.lang.String r9 = "ic_launcher"
            if (r5 != 0) goto L_0x01fe
            int r5 = r10.getIdentifier(r9, r11, r3)     // Catch:{ Exception -> 0x0082 }
            if (r5 != 0) goto L_0x01fe
            r5 = 17301659(0x108009b, float:2.497969E-38)
        L_0x01fe:
            r4.F(r5)     // Catch:{ Exception -> 0x0082 }
            if (r31 != 0) goto L_0x022d
            java.lang.String r5 = "largeIcon"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0082 }
            if (r5 == 0) goto L_0x021e
            boolean r27 = r5.isEmpty()     // Catch:{ Exception -> 0x0082 }
            if (r27 != 0) goto L_0x021e
            int r9 = r10.getIdentifier(r5, r15, r3)     // Catch:{ Exception -> 0x0082 }
            if (r9 != 0) goto L_0x021c
            int r5 = r10.getIdentifier(r5, r11, r3)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0226
        L_0x021c:
            r5 = r9
            goto L_0x0226
        L_0x021e:
            if (r5 != 0) goto L_0x0225
            int r5 = r10.getIdentifier(r9, r11, r3)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0226
        L_0x0225:
            r5 = 0
        L_0x0226:
            if (r5 == 0) goto L_0x022d
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r10, r5)     // Catch:{ Exception -> 0x0082 }
            goto L_0x022f
        L_0x022d:
            r5 = r31
        L_0x022f:
            if (r5 == 0) goto L_0x0234
            r4.u(r5)     // Catch:{ Exception -> 0x0082 }
        L_0x0234:
            java.lang.String r5 = r2.getString(r14)     // Catch:{ Exception -> 0x0082 }
            r4.n(r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = "subText"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x0246
            r4.I(r9)     // Catch:{ Exception -> 0x0082 }
        L_0x0246:
            if (r0 == 0) goto L_0x027b
            if (r33 != 0) goto L_0x0263
            java.lang.String r9 = "bigLargeIcon"
            java.lang.String r9 = r2.getString(r9)     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x0263
            boolean r14 = r9.isEmpty()     // Catch:{ Exception -> 0x0082 }
            if (r14 != 0) goto L_0x0263
            int r9 = r10.getIdentifier(r9, r11, r3)     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x0263
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeResource(r10, r9)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0265
        L_0x0263:
            r9 = r33
        L_0x0265:
            androidx.core.app.o$c r10 = new androidx.core.app.o$c     // Catch:{ Exception -> 0x0082 }
            r10.<init>()     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$c r0 = r10.i(r0)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$c r0 = r0.j(r6)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$c r0 = r0.k(r5)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$c r0 = r0.h(r9)     // Catch:{ Exception -> 0x0082 }
            goto L_0x029b
        L_0x027b:
            java.lang.String r0 = "bigText"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0082 }
            if (r0 != 0) goto L_0x028d
            androidx.core.app.o$d r0 = new androidx.core.app.o$d     // Catch:{ Exception -> 0x0082 }
            r0.<init>()     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$d r0 = r0.h(r5)     // Catch:{ Exception -> 0x0082 }
            goto L_0x029b
        L_0x028d:
            r5 = 0
            android.text.Spanned r0 = w1.b.a(r0, r5)     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$d r5 = new androidx.core.app.o$d     // Catch:{ Exception -> 0x0082 }
            r5.<init>()     // Catch:{ Exception -> 0x0082 }
            androidx.core.app.o$d r0 = r5.h(r0)     // Catch:{ Exception -> 0x0082 }
        L_0x029b:
            r4.H(r0)     // Catch:{ Exception -> 0x0082 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0082 }
            android.content.Context r0 = r1.f48059a     // Catch:{ Exception -> 0x0082 }
            r5.<init>(r0, r8)     // Catch:{ Exception -> 0x0082 }
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r5.addFlags(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "foreground"
            boolean r8 = r29.r()     // Catch:{ Exception -> 0x0082 }
            r2.putBoolean(r0, r8)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "userInteraction"
            r8 = 1
            r2.putBoolean(r0, r8)     // Catch:{ Exception -> 0x0082 }
            r5.putExtra(r13, r2)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "messageId"
            java.lang.String r8 = r2.getString(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = "message_id"
            if (r8 == 0) goto L_0x02c9
            r5.putExtra(r9, r8)     // Catch:{ Exception -> 0x0082 }
        L_0x02c9:
            boolean r0 = r2.containsKey(r12)     // Catch:{ Exception -> 0x0082 }
            r10 = 0
            if (r0 == 0) goto L_0x02d9
            boolean r0 = r2.getBoolean(r12)     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x02d7
            goto L_0x02d9
        L_0x02d7:
            r0 = r10
            goto L_0x02e6
        L_0x02d9:
            java.lang.String r0 = "soundName"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0082 }
            android.net.Uri r0 = r1.p(r0)     // Catch:{ Exception -> 0x0082 }
            r4.G(r0)     // Catch:{ Exception -> 0x0082 }
        L_0x02e6:
            if (r0 == 0) goto L_0x02f0
            r0 = 26
            if (r7 < r0) goto L_0x02ed
            goto L_0x02f0
        L_0x02ed:
            r0 = r25
            goto L_0x02f4
        L_0x02f0:
            r4.G(r10)     // Catch:{ Exception -> 0x0082 }
            goto L_0x02ed
        L_0x02f4:
            boolean r11 = r2.containsKey(r0)     // Catch:{ Exception -> 0x0082 }
            if (r11 != 0) goto L_0x0300
            boolean r11 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x0082 }
            if (r11 == 0) goto L_0x0307
        L_0x0300:
            boolean r0 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x0082 }
            r4.y(r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0307:
            java.lang.String r0 = "call"
            r4.h(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "color"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0082 }
            s5.b r11 = r1.f48060b     // Catch:{ Exception -> 0x0082 }
            int r11 = r11.a()     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0322
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0082 }
            r4.j(r0)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0328
        L_0x0322:
            r0 = -1
            if (r11 == r0) goto L_0x0328
            r4.j(r11)     // Catch:{ Exception -> 0x0082 }
        L_0x0328:
            int r11 = java.lang.Integer.parseInt(r24)     // Catch:{ Exception -> 0x0082 }
            android.content.Context r0 = r1.f48059a     // Catch:{ Exception -> 0x0082 }
            r12 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r11, r5, r12)     // Catch:{ Exception -> 0x0082 }
            android.app.NotificationManager r14 = r29.t()     // Catch:{ Exception -> 0x0082 }
            r15 = r23
            boolean r23 = r2.containsKey(r15)     // Catch:{ Exception -> 0x0082 }
            r27 = 0
            if (r23 == 0) goto L_0x0348
            boolean r15 = r2.getBoolean(r15)     // Catch:{ Exception -> 0x0082 }
            if (r15 == 0) goto L_0x034b
        L_0x0348:
            r15 = r22
            goto L_0x0350
        L_0x034b:
            r32 = r11
        L_0x034d:
            r10 = 26
            goto L_0x0379
        L_0x0350:
            boolean r22 = r2.containsKey(r15)     // Catch:{ Exception -> 0x0082 }
            if (r22 == 0) goto L_0x035e
            r32 = r11
            double r10 = r2.getDouble(r15)     // Catch:{ Exception -> 0x0082 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0082 }
            goto L_0x0362
        L_0x035e:
            r32 = r11
            r10 = 300(0x12c, double:1.48E-321)
        L_0x0362:
            int r15 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r15 != 0) goto L_0x036a
            r10 = 2
            r16 = 300(0x12c, double:1.48E-321)
            goto L_0x036d
        L_0x036a:
            r16 = r10
            r10 = 2
        L_0x036d:
            long[] r10 = new long[r10]     // Catch:{ Exception -> 0x0082 }
            r11 = 0
            r10[r11] = r27     // Catch:{ Exception -> 0x0082 }
            r11 = 1
            r10[r11] = r16     // Catch:{ Exception -> 0x0082 }
            r4.M(r10)     // Catch:{ Exception -> 0x0082 }
            goto L_0x034d
        L_0x0379:
            if (r7 < r10) goto L_0x0394
            java.lang.String r7 = "shortcutId"
            java.lang.String r7 = r2.getString(r7)     // Catch:{ Exception -> 0x0082 }
            if (r7 == 0) goto L_0x0386
            r4.B(r7)     // Catch:{ Exception -> 0x0082 }
        L_0x0386:
            java.lang.String r7 = "timeoutAfter"
            double r10 = r2.getDouble(r7)     // Catch:{ Exception -> 0x0082 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0082 }
            int r7 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r7 < 0) goto L_0x0394
            r4.K(r10)     // Catch:{ Exception -> 0x0082 }
        L_0x0394:
            java.lang.String r7 = "when"
            double r10 = r2.getDouble(r7)     // Catch:{ Exception -> 0x0082 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0082 }
            int r7 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r7 < 0) goto L_0x03a2
            r4.O(r10)     // Catch:{ Exception -> 0x0082 }
        L_0x03a2:
            java.lang.String r7 = "usesChronometer"
            r10 = 0
            boolean r7 = r2.getBoolean(r7, r10)     // Catch:{ Exception -> 0x0082 }
            r4.L(r7)     // Catch:{ Exception -> 0x0082 }
            r7 = r26
            r4.i(r7)     // Catch:{ Exception -> 0x0082 }
            r4.m(r0)     // Catch:{ Exception -> 0x0082 }
            r0 = r21
            java.lang.String r7 = r2.getString(r0)     // Catch:{ JSONException -> 0x03c6 }
            if (r7 == 0) goto L_0x03c8
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x03c6 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x03c6 }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x03c6 }
            goto L_0x03c9
        L_0x03c6:
            r0 = move-exception
            goto L_0x03cc
        L_0x03c8:
            r7 = 0
        L_0x03c9:
            r10 = r20
            goto L_0x03d4
        L_0x03cc:
            java.lang.String r7 = "Exception while converting actions to JSON object."
            r10 = r20
            android.util.Log.e(r10, r7, r0)     // Catch:{ Exception -> 0x0417 }
            r7 = 0
        L_0x03d4:
            if (r7 == 0) goto L_0x0491
            r11 = 0
        L_0x03d7:
            int r0 = r7.length()     // Catch:{ Exception -> 0x0417 }
            if (r11 >= r0) goto L_0x0491
            java.lang.String r0 = r7.getString(r11)     // Catch:{ JSONException -> 0x0475 }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x0417 }
            android.content.Context r12 = r1.f48059a     // Catch:{ Exception -> 0x0417 }
            java.lang.Class<com.dieam.reactnativepushnotification.modules.RNPushNotificationActions> r6 = com.dieam.reactnativepushnotification.modules.RNPushNotificationActions.class
            r15.<init>(r12, r6)     // Catch:{ Exception -> 0x0417 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0417 }
            r6.<init>()     // Catch:{ Exception -> 0x0417 }
            r6.append(r3)     // Catch:{ Exception -> 0x0417 }
            java.lang.String r12 = ".ACTION_"
            r6.append(r12)     // Catch:{ Exception -> 0x0417 }
            r6.append(r11)     // Catch:{ Exception -> 0x0417 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0417 }
            r15.setAction(r6)     // Catch:{ Exception -> 0x0417 }
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r15.addFlags(r6)     // Catch:{ Exception -> 0x0417 }
            java.lang.String r12 = "action"
            r2.putString(r12, r0)     // Catch:{ Exception -> 0x0417 }
            r15.putExtra(r13, r2)     // Catch:{ Exception -> 0x0417 }
            r15.setPackage(r3)     // Catch:{ Exception -> 0x0417 }
            if (r8 == 0) goto L_0x041a
            r5.putExtra(r9, r8)     // Catch:{ Exception -> 0x0417 }
            goto L_0x041a
        L_0x0417:
            r0 = move-exception
            goto L_0x04d9
        L_0x041a:
            android.content.Context r12 = r1.f48059a     // Catch:{ Exception -> 0x0417 }
            r6 = r32
            r17 = r3
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r12, r6, r15, r3)     // Catch:{ Exception -> 0x0417 }
            java.lang.String r15 = "ReplyInput"
            boolean r15 = r0.equals(r15)     // Catch:{ Exception -> 0x0417 }
            if (r15 == 0) goto L_0x0464
            androidx.core.app.w$d r0 = new androidx.core.app.w$d     // Catch:{ Exception -> 0x0417 }
            java.lang.String r15 = "key_text_reply"
            r0.<init>(r15)     // Catch:{ Exception -> 0x0417 }
            java.lang.String r15 = "reply_placeholder_text"
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.w$d r0 = r0.b(r15)     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.w r0 = r0.a()     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.o$b$a r15 = new androidx.core.app.o$b$a     // Catch:{ Exception -> 0x0417 }
            java.lang.String r3 = "reply_button_text"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0417 }
            r32 = r5
            r5 = 0
            r15.<init>((int) r5, (java.lang.CharSequence) r3, (android.app.PendingIntent) r12)     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.o$b$a r0 = r15.a(r0)     // Catch:{ Exception -> 0x0417 }
            r3 = 1
            androidx.core.app.o$b$a r0 = r0.d(r3)     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.o$b r0 = r0.b()     // Catch:{ Exception -> 0x0417 }
            r4.b(r0)     // Catch:{ Exception -> 0x0417 }
            r3 = 1
            r5 = 0
            goto L_0x0484
        L_0x0464:
            r32 = r5
            androidx.core.app.o$b$a r3 = new androidx.core.app.o$b$a     // Catch:{ Exception -> 0x0417 }
            r5 = 0
            r3.<init>((int) r5, (java.lang.CharSequence) r0, (android.app.PendingIntent) r12)     // Catch:{ Exception -> 0x0417 }
            androidx.core.app.o$b r0 = r3.b()     // Catch:{ Exception -> 0x0417 }
            r4.b(r0)     // Catch:{ Exception -> 0x0417 }
        L_0x0473:
            r3 = 1
            goto L_0x0484
        L_0x0475:
            r0 = move-exception
            r6 = r32
            r17 = r3
            r32 = r5
            r5 = 0
            r3 = r0
            java.lang.String r0 = "Exception while getting action from actionsArray."
            android.util.Log.e(r10, r0, r3)     // Catch:{ Exception -> 0x0417 }
            goto L_0x0473
        L_0x0484:
            int r11 = r11 + r3
            r5 = r32
            r32 = r6
            r3 = r17
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r12 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x03d7
        L_0x0491:
            r6 = r32
            android.content.SharedPreferences r0 = r1.f48061c     // Catch:{ Exception -> 0x0417 }
            r3 = r24
            r5 = 0
            java.lang.String r0 = r0.getString(r3, r5)     // Catch:{ Exception -> 0x0417 }
            if (r0 == 0) goto L_0x04aa
            android.content.SharedPreferences r0 = r1.f48061c     // Catch:{ Exception -> 0x0417 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0417 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0417 }
            r0.apply()     // Catch:{ Exception -> 0x0417 }
        L_0x04aa:
            boolean r0 = r29.r()     // Catch:{ Exception -> 0x0417 }
            if (r0 == 0) goto L_0x04b8
            java.lang.String r0 = "ignoreInForeground"
            boolean r0 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x0417 }
            if (r0 != 0) goto L_0x04d5
        L_0x04b8:
            android.app.Notification r0 = r4.c()     // Catch:{ Exception -> 0x0417 }
            int r3 = r0.defaults     // Catch:{ Exception -> 0x0417 }
            r4 = 4
            r3 = r3 | r4
            r0.defaults = r3     // Catch:{ Exception -> 0x0417 }
            r3 = r19
            boolean r4 = r2.containsKey(r3)     // Catch:{ Exception -> 0x0417 }
            if (r4 == 0) goto L_0x04d2
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0417 }
            r14.notify(r3, r6, r0)     // Catch:{ Exception -> 0x0417 }
            goto L_0x04d5
        L_0x04d2:
            r14.notify(r6, r0)     // Catch:{ Exception -> 0x0417 }
        L_0x04d5:
            r29.u(r30)     // Catch:{ Exception -> 0x0417 }
            goto L_0x04de
        L_0x04d9:
            java.lang.String r2 = "failed to send push notification"
            android.util.Log.e(r10, r2, r0)
        L_0x04de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.s.y(android.os.Bundle, android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }
}

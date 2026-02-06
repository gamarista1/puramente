package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import x1.g;

public class n {

    /* renamed from: a  reason: collision with root package name */
    final String f15777a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f15778b;

    /* renamed from: c  reason: collision with root package name */
    int f15779c;

    /* renamed from: d  reason: collision with root package name */
    String f15780d;

    /* renamed from: e  reason: collision with root package name */
    String f15781e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15782f = true;

    /* renamed from: g  reason: collision with root package name */
    Uri f15783g = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* renamed from: h  reason: collision with root package name */
    AudioAttributes f15784h;

    /* renamed from: i  reason: collision with root package name */
    boolean f15785i;

    /* renamed from: j  reason: collision with root package name */
    int f15786j = 0;

    /* renamed from: k  reason: collision with root package name */
    boolean f15787k;

    /* renamed from: l  reason: collision with root package name */
    long[] f15788l;

    /* renamed from: m  reason: collision with root package name */
    String f15789m;

    /* renamed from: n  reason: collision with root package name */
    String f15790n;

    static class a {
        static NotificationChannel a(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        static void b(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        static void c(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        static void d(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void e(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void f(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        static void g(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        static void h(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void i(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }
    }

    static class b {
        static void a(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final n f15791a;

        public c(String str, int i10) {
            this.f15791a = new n(str, i10);
        }

        public n a() {
            return this.f15791a;
        }

        public c b(String str) {
            this.f15791a.f15780d = str;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.f15791a.f15778b = charSequence;
            return this;
        }
    }

    n(String str, int i10) {
        this.f15777a = (String) g.f(str);
        this.f15779c = i10;
        this.f15784h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public NotificationChannel a() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel a10 = a.a(this.f15777a, this.f15778b, this.f15779c);
        a.d(a10, this.f15780d);
        a.e(a10, this.f15781e);
        a.g(a10, this.f15782f);
        a.h(a10, this.f15783g, this.f15784h);
        a.b(a10, this.f15785i);
        a.f(a10, this.f15786j);
        a.i(a10, this.f15788l);
        a.c(a10, this.f15787k);
        if (!(i10 < 30 || (str = this.f15789m) == null || (str2 = this.f15790n) == null)) {
            b.a(a10, str, str2);
        }
        return a10;
    }
}

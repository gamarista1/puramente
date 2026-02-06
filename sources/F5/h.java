package F5;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.I;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import o7.W;
import t7.C4049a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f30763a = new h();

    private h() {
    }

    public static final String c() {
        Context l10 = I.l();
        try {
            String str = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0).versionName;
            C6496s.g(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View d(Activity activity) {
        Class<h> cls = h.class;
        if (C4049a.d(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (Sg.p.J(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = Sg.p.J(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L_0x0073
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = Sg.p.J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = Sg.p.O(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = Sg.p.O(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = Sg.p.O(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = Sg.p.O(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            boolean r0 = Sg.p.J(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            boolean r0 = Sg.p.J(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
        L_0x006b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.C6496s.c(r6, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.h.e():boolean");
    }

    public static final double f(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(W.B()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final void a() {
    }

    public static final void b() {
    }
}

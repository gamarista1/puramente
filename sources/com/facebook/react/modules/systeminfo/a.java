package com.facebook.react.modules.systeminfo;

import Sg.p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.react.C3368n;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import lf.C6502A;
import mf.O;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41124a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f41125b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static String f41126c;

    private a() {
    }

    public static final String a(int i10) {
        return "adb reverse tcp:" + i10 + " tcp:" + i10;
    }

    public static final String b(Context context) {
        C6496s.h(context, "context");
        return a(f41124a.c(context));
    }

    private final int c(Context context) {
        return context.getResources().getInteger(C3368n.f41130a);
    }

    public static final String d() {
        if (f41124a.j()) {
            String str = Build.MODEL;
            C6496s.e(str);
            return str;
        }
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        int i10 = Build.VERSION.SDK_INT;
        return str2 + " - " + str3 + " - API " + i10;
    }

    public static final Map e(Context context) {
        String str;
        String str2;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            str2 = context.getPackageName();
            if (i10 == 0) {
                str = applicationInfo.nonLocalizedLabel.toString();
            } else {
                str = context.getString(i10);
                C6496s.e(str);
            }
        } else {
            str2 = null;
            str = null;
        }
        return O.l(C6502A.a("appDisplayName", str), C6502A.a("appIdentifier", str2), C6502A.a("platform", "android"), C6502A.a("deviceName", Build.MODEL), C6502A.a("reactNativeVersion", f41124a.g()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC, Splitter:B:35:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079 A[SYNTHETIC, Splitter:B:45:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String f() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = f41126c     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x000d
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x000a }
            monitor-exit(r7)
            return r0
        L_0x000a:
            r0 = move-exception
            goto L_0x0082
        L_0x000d:
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0058, all -> 0x0053 }
            java.lang.String r2 = "/system/bin/getprop"
            java.lang.String r3 = "metro.host"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ Exception -> 0x0058, all -> 0x0053 }
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0053 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r0 = ""
        L_0x0034:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0047 }
            if (r3 == 0) goto L_0x003c
            r0 = r3
            goto L_0x0034
        L_0x003c:
            f41126c = r0     // Catch:{ Exception -> 0x0047 }
            r2.close()     // Catch:{ all -> 0x000a }
        L_0x0041:
            r1.destroy()     // Catch:{ all -> 0x000a }
            goto L_0x006f
        L_0x0045:
            r0 = move-exception
            goto L_0x0077
        L_0x0047:
            r0 = move-exception
            goto L_0x005c
        L_0x0049:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x0077
        L_0x004e:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x005c
        L_0x0053:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x0077
        L_0x0058:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x005c:
            java.lang.String r3 = f41125b     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = "Failed to query for metro.host prop:"
            U5.a.J(r3, r4, r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = ""
            f41126c = r0     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ all -> 0x000a }
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            goto L_0x0041
        L_0x006f:
            java.lang.String r0 = f41126c     // Catch:{ all -> 0x000a }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = ""
        L_0x0075:
            monitor-exit(r7)
            return r0
        L_0x0077:
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ all -> 0x000a }
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.destroy()     // Catch:{ all -> 0x000a }
        L_0x0081:
            throw r0     // Catch:{ all -> 0x000a }
        L_0x0082:
            monitor-exit(r7)     // Catch:{ all -> 0x000a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.a.f():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r0 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String g() {
        /*
            r6 = this;
            java.util.Map r0 = com.facebook.react.modules.systeminfo.b.f41127a
            java.lang.String r1 = "major"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r2 = "minor"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r3 = "patch"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r4 = "prerelease"
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            if (r0 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r0 = ""
        L_0x0031:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "."
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.a.g():java.lang.String");
    }

    public static final String h(Context context) {
        C6496s.h(context, "context");
        a aVar = f41124a;
        return aVar.i(aVar.c(context));
    }

    private final String i(int i10) {
        String str;
        if (f().length() > 0) {
            str = f();
        } else if (j()) {
            str = "10.0.3.2";
        } else if (k()) {
            str = "10.0.2.2";
        } else {
            str = "localhost";
        }
        U u10 = U.f71764a;
        String format = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }

    private final boolean j() {
        String str = Build.FINGERPRINT;
        C6496s.g(str, "FINGERPRINT");
        return p.O(str, "vbox", false, 2, (Object) null);
    }

    private final boolean k() {
        String str = Build.FINGERPRINT;
        C6496s.g(str, "FINGERPRINT");
        if (!p.O(str, "generic", false, 2, (Object) null)) {
            C6496s.g(str, "FINGERPRINT");
            if (p.J(str, "google/sdk_gphone", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        return true;
    }
}

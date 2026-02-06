package com.google.android.gms.common;

import Ea.i;
import Ea.n;
import Ea.q;
import Ga.C4293e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.models.Participant;
import java.util.concurrent.atomic.AtomicBoolean;
import ya.C5288e;
import ya.C5289f;
import ya.C5290g;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f54103a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f54104b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f54105c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f54106d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f54107e = new AtomicBoolean();

    public static void a(Context context, int i10) {
        int h10 = b.f().h(context, i10);
        if (h10 != 0) {
            Intent b10 = b.f().b(context, h10, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + h10);
            if (b10 == null) {
                throw new C5288e(h10);
            }
            throw new C5289f(h10, "Google Play Services not available", b10);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String c(int i10) {
        return ConnectionResult.u0(i10);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!f54106d) {
            try {
                PackageInfo e10 = C4293e.a(context).e("com.google.android.gms", 64);
                C5290g.a(context);
                if (e10 == null || C5290g.e(e10, false) || !C5290g.e(e10, true)) {
                    f54105c = false;
                } else {
                    f54105c = true;
                }
                f54106d = true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e11);
                f54106d = true;
            } catch (Throwable th2) {
                f54106d = true;
                throw th2;
            }
        }
        if (f54105c || !i.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = ya.C5291h.f62281a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f54107e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = com.google.android.gms.common.internal.h0.a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f54103a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = Ea.i.d(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = Ea.i.f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            com.google.android.gms.common.internal.C4536s.a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007b
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007c
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = r7
            goto L_0x0132
        L_0x007b:
            r8 = 0
        L_0x007c:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0125 }
            ya.C5290g.a(r10)
            boolean r10 = ya.C5290g.e(r9, r3)
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x0099:
            if (r1 == 0) goto L_0x00b2
            com.google.android.gms.common.internal.C4536s.l(r8)
            boolean r10 = ya.C5290g.e(r8, r3)
            if (r10 != 0) goto L_0x00b2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b2:
            if (r1 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d2:
            int r10 = r9.versionCode
            int r10 = Ea.s.a(r10)
            int r1 = Ea.s.a(r11)
            if (r10 >= r1) goto L_0x0106
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0132
        L_0x0106:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011e
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x010f }
            goto L_0x011e
        L_0x010f:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0132
        L_0x011e:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0124
            r3 = 3
            goto L_0x0132
        L_0x0124:
            return r4
        L_0x0125:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0132:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.d.g(android.content.Context, int):int");
    }

    public static boolean h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        if (!n.c()) {
            return false;
        }
        Object systemService = context.getSystemService(Participant.USER_TYPE);
        C4536s.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !b.f37475af.equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    public static boolean j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static boolean k(Context context, int i10, String str) {
        return q.b(context, i10, str);
    }

    static boolean l(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (n.f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled || i(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}

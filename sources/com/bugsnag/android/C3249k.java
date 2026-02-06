package com.bugsnag.android;

import K4.k;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.v;
import lf.w;

/* renamed from: com.bugsnag.android.k  reason: case insensitive filesystem */
public final class C3249k {

    /* renamed from: p  reason: collision with root package name */
    public static final a f38738p = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final long f38739q = SystemClock.elapsedRealtime();

    /* renamed from: a  reason: collision with root package name */
    private final PackageManager f38740a;

    /* renamed from: b  reason: collision with root package name */
    private final k f38741b;

    /* renamed from: c  reason: collision with root package name */
    private final C3266p1 f38742c;

    /* renamed from: d  reason: collision with root package name */
    private final ActivityManager f38743d;

    /* renamed from: e  reason: collision with root package name */
    private final Q0 f38744e;

    /* renamed from: f  reason: collision with root package name */
    private final W0 f38745f;

    /* renamed from: g  reason: collision with root package name */
    private String f38746g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38747h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f38748i = j();

    /* renamed from: j  reason: collision with root package name */
    private String f38749j;

    /* renamed from: k  reason: collision with root package name */
    private final String f38750k = g();

    /* renamed from: l  reason: collision with root package name */
    private final String f38751l = c();

    /* renamed from: m  reason: collision with root package name */
    private final String f38752m;

    /* renamed from: n  reason: collision with root package name */
    private final String f38753n;

    /* renamed from: o  reason: collision with root package name */
    private final String f38754o;

    /* renamed from: com.bugsnag.android.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return SystemClock.elapsedRealtime() - b();
        }

        public final long b() {
            return C3249k.f38739q;
        }

        private a() {
        }
    }

    public C3249k(Context context, PackageManager packageManager, k kVar, C3266p1 p1Var, ActivityManager activityManager, Q0 q02, W0 w02) {
        this.f38740a = packageManager;
        this.f38741b = kVar;
        this.f38742c = p1Var;
        this.f38743d = activityManager;
        this.f38744e = q02;
        this.f38745f = w02;
        this.f38747h = context.getPackageName();
        this.f38752m = kVar.C();
        String d10 = kVar.d();
        if (d10 == null) {
            PackageInfo x10 = kVar.x();
            if (x10 == null) {
                d10 = null;
            } else {
                d10 = x10.versionName;
            }
        }
        this.f38753n = d10;
        this.f38754o = h();
    }

    private final String c() {
        Object obj;
        String str;
        String str2 = null;
        try {
            v.a aVar = v.f71841b;
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            } else {
                Object invoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", (Class[]) null).invoke((Object) null, (Object[]) null);
                if (invoke != null) {
                    str = (String) invoke;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            obj = v.b(str);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            str2 = obj;
        }
        return str2;
    }

    private final String g() {
        ApplicationInfo b10 = this.f38741b.b();
        PackageManager packageManager = this.f38740a;
        if (packageManager == null || b10 == null) {
            return null;
        }
        return packageManager.getApplicationLabel(b10).toString();
    }

    private final String i() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.pid == 0) {
                return null;
            }
            int i10 = runningAppProcessInfo.importance;
            if (i10 == 1) {
                return "provider in use";
            }
            if (i10 == 2) {
                return "service in use";
            }
            switch (i10) {
                case 100:
                    return "foreground";
                case 125:
                    return "foreground service";
                case 130:
                case 230:
                    return "perceptible";
                case 150:
                case 325:
                    return "top sleeping";
                case 170:
                case 350:
                    return "can't save state";
                case 200:
                    return "visible";
                case 300:
                    return "service";
                case 400:
                    return "cached/background";
                case 500:
                    return "empty";
                case 1000:
                    return "gone";
                default:
                    return "unknown importance (" + runningAppProcessInfo.importance + ')';
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final Boolean j() {
        ActivityManager activityManager = this.f38743d;
        if (activityManager == null || Build.VERSION.SDK_INT < 28 || !activityManager.isBackgroundRestricted()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final void k(Map map) {
        Runtime runtime = Runtime.getRuntime();
        long j10 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        map.put("memoryUsage", Long.valueOf(j10 - freeMemory));
        map.put("totalMemory", Long.valueOf(j10));
        map.put("freeMemory", Long.valueOf(freeMemory));
        map.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        map.put("installerPackage", this.f38754o);
    }

    public final Long b(Boolean bool) {
        long j10;
        if (bool == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f38742c.j();
        if (!bool.booleanValue() || j11 == 0) {
            j10 = 0;
        } else {
            j10 = elapsedRealtime - j11;
        }
        if (j10 > 0) {
            return Long.valueOf(j10);
        }
        return 0L;
    }

    public final C3234f d() {
        return new C3234f(this.f38741b, this.f38749j, this.f38747h, this.f38752m, this.f38753n, this.f38746g);
    }

    public final C3258n e() {
        boolean k10 = this.f38742c.k();
        return new C3258n(this.f38741b, this.f38749j, this.f38747h, this.f38752m, this.f38753n, this.f38746g, Long.valueOf(f38738p.a()), b(Boolean.valueOf(k10)), Boolean.valueOf(k10), Boolean.valueOf(this.f38744e.d()));
    }

    public final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f38750k);
        hashMap.put("activeScreen", this.f38742c.h());
        hashMap.put("lowMemory", Boolean.valueOf(this.f38745f.f()));
        hashMap.put("memoryTrimLevel", this.f38745f.e());
        hashMap.put("processImportance", i());
        k(hashMap);
        Boolean bool = this.f38748i;
        if (bool != null) {
            hashMap.put("backgroundWorkRestricted", bool);
        }
        String str = this.f38751l;
        if (str != null) {
            hashMap.put("processName", str);
        }
        return hashMap;
    }

    public final String h() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                PackageManager packageManager = this.f38740a;
                if (packageManager == null) {
                    return null;
                }
                InstallSourceInfo a10 = packageManager.getInstallSourceInfo(this.f38747h);
                if (a10 == null) {
                    return null;
                }
                return a10.getInstallingPackageName();
            }
            PackageManager packageManager2 = this.f38740a;
            if (packageManager2 == null) {
                return null;
            }
            return packageManager2.getInstallerPackageName(this.f38747h);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void l(String str) {
        this.f38749j = str;
    }

    public final void m(String str) {
        this.f38746g = str;
    }
}

package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    private static final String f37111A = "deviceDisplay";

    /* renamed from: B  reason: collision with root package name */
    private static final String f37112B = "deviceBrand";

    /* renamed from: C  reason: collision with root package name */
    private static final String f37113C = "deviceBoard";

    /* renamed from: D  reason: collision with root package name */
    private static final String f37114D = "androidVersion";

    /* renamed from: E  reason: collision with root package name */
    private static final String f37115E = "deviceModel";

    /* renamed from: F  reason: collision with root package name */
    private static final String f37116F = "packageFilePath";

    /* renamed from: G  reason: collision with root package name */
    private static final String f37117G = "packageName";

    /* renamed from: H  reason: collision with root package name */
    private static final String f37118H = "packageVersionName";

    /* renamed from: a  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37119a = new com.amazon.a.a.o.c("CrashReport");

    /* renamed from: b  reason: collision with root package name */
    private static final long f37120b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final String f37121c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* renamed from: d  reason: collision with root package name */
    private static final String f37122d = "SHA1";

    /* renamed from: e  reason: collision with root package name */
    private static final String f37123e = "crashTime";

    /* renamed from: f  reason: collision with root package name */
    private static final String f37124f = "UTF-8";

    /* renamed from: g  reason: collision with root package name */
    private static final String f37125g = "crashId";

    /* renamed from: h  reason: collision with root package name */
    private static final String f37126h = "threadDump";

    /* renamed from: i  reason: collision with root package name */
    private static final String f37127i = "stackTrace";

    /* renamed from: j  reason: collision with root package name */
    private static final String f37128j = "threadAllocSize";

    /* renamed from: k  reason: collision with root package name */
    private static final String f37129k = "threadAllocCount";

    /* renamed from: l  reason: collision with root package name */
    private static final String f37130l = "nativeHeapFreeSize";

    /* renamed from: m  reason: collision with root package name */
    private static final String f37131m = "nativeHeapSize";

    /* renamed from: n  reason: collision with root package name */
    private static final String f37132n = "memLowThreshold";

    /* renamed from: o  reason: collision with root package name */
    private static final String f37133o = "memLowFlag";

    /* renamed from: p  reason: collision with root package name */
    private static final String f37134p = "availableInternalMemorySize";

    /* renamed from: q  reason: collision with root package name */
    private static final String f37135q = "totalInternalMemorySize";

    /* renamed from: r  reason: collision with root package name */
    private static final String f37136r = "deviceUser";

    /* renamed from: s  reason: collision with root package name */
    private static final String f37137s = "deviceType";

    /* renamed from: t  reason: collision with root package name */
    private static final String f37138t = "deviceTime";

    /* renamed from: u  reason: collision with root package name */
    private static final String f37139u = "deviceTags";

    /* renamed from: v  reason: collision with root package name */
    private static final String f37140v = "deviceProduct";

    /* renamed from: w  reason: collision with root package name */
    private static final String f37141w = "deviceManufacturer";

    /* renamed from: x  reason: collision with root package name */
    private static final String f37142x = "deviceId";

    /* renamed from: y  reason: collision with root package name */
    private static final String f37143y = "deviceHost";

    /* renamed from: z  reason: collision with root package name */
    private static final String f37144z = "deviceFingerPrint";

    /* renamed from: I  reason: collision with root package name */
    private final HashMap<String, String> f37145I = new LinkedHashMap();

    public c(Application application, Throwable th2) {
        try {
            a(application, th2);
        } catch (Throwable th3) {
            if (com.amazon.a.a.o.c.f37535b) {
                f37119a.b("Error collection crash report details", th3);
            }
        }
    }

    private void a(Application application, Throwable th2) {
        b();
        a(application);
        c(application);
        a(th2);
        e();
        f();
    }

    private void b() {
        this.f37145I.put(f37123e, new Date().toString());
    }

    private void c(Application application) {
        this.f37145I.put(f37115E, Build.MODEL);
        this.f37145I.put(f37114D, Build.VERSION.RELEASE);
        this.f37145I.put(f37113C, Build.BOARD);
        this.f37145I.put(f37112B, Build.BRAND);
        this.f37145I.put(f37111A, Build.DISPLAY);
        this.f37145I.put(f37144z, Build.FINGERPRINT);
        this.f37145I.put(f37143y, Build.HOST);
        this.f37145I.put(f37142x, Build.ID);
        this.f37145I.put(f37141w, Build.MANUFACTURER);
        this.f37145I.put(f37140v, Build.PRODUCT);
        this.f37145I.put(f37139u, Build.TAGS);
        this.f37145I.put(f37138t, Long.toString(Build.TIME));
        this.f37145I.put(f37137s, Build.TYPE);
        this.f37145I.put(f37136r, Build.USER);
        this.f37145I.put(f37135q, Long.toString(d()));
        this.f37145I.put(f37134p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f37145I.put(f37133o, Boolean.toString(memoryInfo.lowMemory));
            this.f37145I.put(f37132n, Long.toString(memoryInfo.threshold));
        }
        this.f37145I.put(f37131m, Long.toString(Debug.getNativeHeapSize()));
        this.f37145I.put(f37130l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f37145I.put(f37129k, Long.toString((long) Debug.getThreadAllocCount()));
        this.f37145I.put(f37128j, Long.toString((long) Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void e() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            sb2.append("Thread : " + thread.getId());
            if (!e.a(thread.getName())) {
                sb2.append("/" + thread.getName());
            }
            sb2.append("\n");
            sb2.append("isAlive : " + thread.isAlive() + "\n");
            sb2.append("isInterrupted : " + thread.isInterrupted() + "\n");
            sb2.append("isDaemon : " + thread.isDaemon() + "\n");
            for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
                sb2.append("\tat " + stackTraceElementArr[i10] + "\n");
            }
            sb2.append("\n\n");
        }
        this.f37145I.put(f37126h, sb2.toString());
    }

    private void f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f37145I.get(f37117G));
            sb2.append(this.f37145I.get(f37118H));
            sb2.append(this.f37145I.get(f37114D));
            String str = this.f37145I.get(f37127i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f37121c).matcher(str);
                while (matcher.find()) {
                    sb2.append(matcher.group());
                }
            }
            this.f37145I.put(f37125g, new BigInteger(MessageDigest.getInstance(f37122d).digest(sb2.toString().getBytes("UTF-8"))).abs().toString(16));
        } catch (Exception e10) {
            if (com.amazon.a.a.o.c.f37535b) {
                f37119a.b("Error capturing crash id", e10);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (!com.amazon.a.a.o.c.f37535b) {
                return null;
            }
            f37119a.b("Unable to fetch package info", e10);
            return null;
        }
    }

    private void a(Application application) {
        PackageInfo b10 = b(application);
        if (b10 != null) {
            this.f37145I.put(f37118H, b10.versionName);
            this.f37145I.put(f37117G, b10.packageName);
            this.f37145I.put(f37116F, application.getFilesDir().getAbsolutePath());
        }
    }

    private void a(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        sb2.append(stringWriter.toString());
        sb2.append("\n");
        Throwable cause = th2.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb2.append(stringWriter.toString());
            cause = cause.getCause();
            sb2.append("\n\n");
        }
        printWriter.close();
        this.f37145I.put(f37127i, sb2.toString());
    }

    public Map<String, String> a() {
        return this.f37145I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}

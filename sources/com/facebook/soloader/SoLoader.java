package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import com.revenuecat.purchases.common.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w8.C4145a;
import w8.C4147c;
import y8.C4220f;
import y8.C4222h;
import y8.C4223i;

public class SoLoader {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f42493a = true;

    /* renamed from: b  reason: collision with root package name */
    static x f42494b;

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f42495c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    static Context f42496d = null;

    /* renamed from: e  reason: collision with root package name */
    private static volatile E[] f42497e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f42498f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private static C4223i f42499g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final Set f42500h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i  reason: collision with root package name */
    private static final Map f42501i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private static final Set f42502j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k  reason: collision with root package name */
    private static final Map f42503k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f42504l = true;

    /* renamed from: m  reason: collision with root package name */
    private static int f42505m;

    /* renamed from: n  reason: collision with root package name */
    private static int f42506n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static l f42507o = null;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th2);
        }
    }

    private static int A() {
        int i10;
        ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i11 = f42505m;
            if ((i11 & 2) != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i11 & 256) != 0) {
                i10 |= 4;
            }
            if ((i11 & 128) == 0) {
                i10 |= 8;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i10;
        } catch (Throwable th2) {
            f42495c.writeLock().unlock();
            throw th2;
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static C4222h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, C4222h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
        reentrantReadWriteLock.writeLock().lock();
        if (hVar == null) {
            try {
                hVar = j();
                if (hVar == null) {
                    p.g("SoLoader", "No recovery strategy");
                    throw unsatisfiedLinkError;
                }
            } catch (v e10) {
                p.c("SoLoader", "Base APK not found during recovery", e10);
                throw e10;
            } catch (Exception e11) {
                p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                throw unsatisfiedLinkError;
            } catch (Throwable th2) {
                f42495c.writeLock().unlock();
                throw th2;
            }
        }
        if (D(unsatisfiedLinkError, hVar)) {
            f42498f.getAndIncrement();
            reentrantReadWriteLock.writeLock().unlock();
            return hVar;
        }
        reentrantReadWriteLock.writeLock().unlock();
        p.g("SoLoader", "Failed to recover");
        throw unsatisfiedLinkError;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        x8.C4178b.g(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean D(java.lang.UnsatisfiedLinkError r1, y8.C4222h r2) {
        /*
            x8.C4178b.h(r2)
            com.facebook.soloader.E[] r0 = f42497e     // Catch:{ all -> 0x000e }
            boolean r1 = r2.a(r1, r0)     // Catch:{ all -> 0x000e }
            r2 = 0
            x8.C4178b.g(r2)
            return r1
        L_0x000e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r2 = move-exception
            x8.C4178b.g(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.D(java.lang.UnsatisfiedLinkError, y8.h):boolean");
    }

    private static void a(ArrayList arrayList, int i10) {
        C3450a aVar = new C3450a(f42496d, i10);
        p.a("SoLoader", "Adding application source: " + aVar.toString());
        arrayList.add(0, aVar);
    }

    private static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f42505m & 8) == 0) {
            arrayList.add(0, new C3452c(context, "lib-main", !z10));
        }
    }

    private static void c(Context context, ArrayList arrayList) {
        C3453d dVar = new C3453d(context);
        p.a("SoLoader", "validating/adding directApk source: " + dVar.toString());
        if (dVar.o()) {
            arrayList.add(0, dVar);
        }
    }

    private static void d(ArrayList arrayList) {
        String str;
        if (SysUtil.k()) {
            str = "/system/lib64:/vendor/lib64";
        } else {
            str = "/system/lib:/vendor/lib";
        }
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C3455f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f42497e != null) {
                reentrantReadWriteLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f42493a) {
                    if (str2 != null) {
                        Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                    }
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock.readLock().lock();
                    for (E x10 : f42497e) {
                        if (x(x10, str, i10, threadPolicy)) {
                            if (f42493a) {
                                if (str2 != null) {
                                    Api18TraceUtils.b();
                                }
                                Api18TraceUtils.b();
                            }
                            if (z10) {
                                StrictMode.setThreadPolicy(threadPolicy);
                                return;
                            }
                            return;
                        }
                    }
                    throw B.b(str, f42496d, f42497e);
                } catch (IOException e10) {
                    C c10 = new C(str, e10.toString());
                    c10.initCause(e10);
                    throw c10;
                } catch (Throwable th2) {
                    if (f42493a) {
                        if (str2 != null) {
                            Api18TraceUtils.b();
                        }
                        Api18TraceUtils.b();
                    }
                    if (z10) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    throw th2;
                }
            } else {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
        } finally {
            f42495c.readLock().unlock();
        }
    }

    private static int h(Context context) {
        int i10 = f42506n;
        if (i10 != 0) {
            return i10;
        }
        int i11 = 1;
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i12 = applicationInfo.flags;
        if ((i12 & 1) != 0) {
            if ((i12 & 128) != 0) {
                i11 = 3;
            } else {
                i11 = 2;
            }
        }
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i11);
        return i11;
    }

    private static int i() {
        int i10 = f42506n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) {
        k(context, i10, (x) null);
    }

    private static synchronized C4222h j() {
        C4222h hVar;
        synchronized (SoLoader.class) {
            C4223i iVar = f42499g;
            if (iVar == null) {
                hVar = null;
            } else {
                hVar = iVar.get();
            }
        }
        return hVar;
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean o10 = o(context);
            f42504l = o10;
            if (o10) {
                int h10 = h(context);
                f42506n = h10;
                if ((i10 & 128) == 0 && SysUtil.l(context, h10)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                C4145a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                C4145a.b(new C4147c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th2;
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f42507o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, (x) null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f42497e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f42497e != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f42497e = new E[0];
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th2) {
                f42495c.writeLock().unlock();
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean o(android.content.Context r5) {
        /*
            com.facebook.soloader.l r0 = f42507o
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            java.lang.String r2 = r5.getPackageName()     // Catch:{ Exception -> 0x001a }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x0018 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r2, r3)     // Catch:{ Exception -> 0x0018 }
            android.os.Bundle r0 = r5.metaData     // Catch:{ Exception -> 0x0018 }
            goto L_0x0037
        L_0x0018:
            r5 = move-exception
            goto L_0x001c
        L_0x001a:
            r5 = move-exception
            r2 = r0
        L_0x001c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected issue with package manager ("
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SoLoader"
            com.facebook.soloader.p.h(r3, r2, r5)
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            java.lang.String r5 = "com.facebook.soloader.enabled"
            boolean r5 = r0.getBoolean(r5, r1)
            if (r5 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.o(android.content.Context):boolean");
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        synchronized (SoLoader.class) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                    } else {
                        context = applicationContext;
                    }
                    f42496d = context;
                    f42499g = new C4220f(context, B(i10));
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            if (xVar == null && f42494b != null) {
                return;
            }
            if (xVar != null) {
                f42494b = xVar;
            } else {
                f42494b = new o(new y());
            }
        }
    }

    private static void q(Context context, int i10) {
        boolean z10;
        boolean z11;
        if (f42497e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f42497e != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f42505m = i10;
                ArrayList arrayList = new ArrayList();
                boolean z12 = true;
                if ((i10 & 512) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i10 & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    e(context, arrayList);
                } else if (z11) {
                    d(arrayList);
                    arrayList.add(0, new C3454e("base"));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f42506n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & 4096) == 0) {
                                z12 = false;
                            }
                            b(context, arrayList, z12);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int A10 = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length > 0) {
                        p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                        boolean z13 = f42493a;
                        if (z13) {
                            Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                        }
                        eArr[i11].e(A10);
                        if (z13) {
                            Api18TraceUtils.b();
                        }
                        length = i11;
                    } else {
                        f42497e = eArr;
                        f42498f.getAndIncrement();
                        p.d("SoLoader", "init finish: " + f42497e.length + " SO sources prepared");
                        f42495c.writeLock().unlock();
                        return;
                    }
                }
            } catch (Throwable th2) {
                f42495c.writeLock().unlock();
                throw th2;
            }
        }
    }

    public static boolean r() {
        boolean z10 = true;
        if (f42497e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f42497e == null) {
                z10 = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th2) {
            f42495c.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        x8.C4178b.c(r1, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void s(java.lang.String r1, int r2, android.os.StrictMode.ThreadPolicy r3) {
        /*
            x8.C4178b.d(r1, r2)
            r2 = r2 | 1
            r0 = 0
            boolean r1 = w(r1, r0, r0, r2, r3)     // Catch:{ all -> 0x000e }
            x8.C4178b.c(r0, r1)
            return
        L_0x000e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r2 = move-exception
            r3 = 0
            x8.C4178b.c(r1, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.s(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    public static boolean t(String str) {
        if (f42504l) {
            return u(str, 0);
        }
        return C4145a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean z10 = z(str);
        if (z10 != null) {
            return z10.booleanValue();
        }
        if (!f42504l) {
            return C4145a.d(str);
        }
        if (f42506n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        C4222h hVar = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVar = C(str, e10, hVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0164, code lost:
        com.facebook.soloader.Api18TraceUtils.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0167, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0168, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0169, code lost:
        r2.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0172, code lost:
        return !r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0175, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0179, code lost:
        f42495c.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0182, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r2 = f42495c;
        r2.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r3 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (r0.contains(r9) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (r11 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        r2.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        if (r3 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.facebook.soloader.p.a("SoLoader", "About to load: " + r9);
        g(r9, r10, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.facebook.soloader.p.a("SoLoader", "Loaded: " + r9);
        r0.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b2, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b3, code lost:
        r10 = r9.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if (r10 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d0, code lost:
        throw new com.facebook.soloader.SoLoader.a(r9, r10.substring(r10.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        if ((r12 & 16) != 0) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        if (r11 == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00de, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (f42502j.contains(r10) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ed, code lost:
        r11 = f42493a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ef, code lost:
        if (r11 == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f3, code lost:
        if (f42507o != null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f5, code lost:
        com.facebook.soloader.Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", r10, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        com.facebook.soloader.p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + r10 + ", which was merged into " + r9);
        r12 = f42507o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011c, code lost:
        if (r12 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011e, code lost:
        r12.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0122, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0124, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0126, code lost:
        com.facebook.soloader.r.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0129, code lost:
        f42502j.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x012e, code lost:
        if (r11 == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0132, code lost:
        if (f42507o != null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0134, code lost:
        com.facebook.soloader.Api18TraceUtils.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015b, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r10 + "', which has been merged into '" + r9 + "'.  See comment for details.", r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean w(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set r0 = f42502j
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.util.Set r0 = f42500h
            boolean r2 = r0.contains(r9)
            if (r2 == 0) goto L_0x001b
            if (r11 != 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
            monitor-enter(r2)
            boolean r3 = r0.contains(r9)     // Catch:{ all -> 0x0029 }
            r4 = 1
            if (r3 == 0) goto L_0x002e
            if (r11 != 0) goto L_0x002c
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0029:
            r9 = move-exception
            goto L_0x0183
        L_0x002c:
            r3 = r4
            goto L_0x002f
        L_0x002e:
            r3 = r1
        L_0x002f:
            java.util.Map r5 = f42501i     // Catch:{ all -> 0x0029 }
            boolean r6 = r5.containsKey(r9)     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x003c
            java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x003c:
            java.lang.Object r6 = new java.lang.Object     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0029 }
            r5 = r6
        L_0x0045:
            java.util.Map r6 = f42503k     // Catch:{ all -> 0x0029 }
            boolean r7 = r6.containsKey(r10)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0052
            java.lang.Object r6 = r6.get(r10)     // Catch:{ all -> 0x0029 }
            goto L_0x005b
        L_0x0052:
            java.lang.Object r7 = new java.lang.Object     // Catch:{ all -> 0x0029 }
            r7.<init>()     // Catch:{ all -> 0x0029 }
            r6.put(r10, r7)     // Catch:{ all -> 0x0029 }
            r6 = r7
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = f42495c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r2.readLock()
            r7.lock()
            monitor-enter(r5)     // Catch:{ all -> 0x0175 }
            if (r3 != 0) goto L_0x00d2
            boolean r7 = r0.contains(r9)     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x007d
            if (r11 != 0) goto L_0x007c
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r2.readLock()
            r9.unlock()
            return r1
        L_0x0079:
            r9 = move-exception
            goto L_0x0177
        L_0x007c:
            r3 = r4
        L_0x007d:
            if (r3 != 0) goto L_0x00d2
            java.lang.String r1 = "SoLoader"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            r7.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.String r8 = "About to load: "
            r7.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            r7.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            com.facebook.soloader.p.a(r1, r7)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            g(r9, r10, r12, r13)     // Catch:{ UnsatisfiedLinkError -> 0x00b2 }
            java.lang.String r13 = "SoLoader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = "Loaded: "
            r1.append(r7)     // Catch:{ all -> 0x0079 }
            r1.append(r9)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            com.facebook.soloader.p.a(r13, r1)     // Catch:{ all -> 0x0079 }
            r0.add(r9)     // Catch:{ all -> 0x0079 }
            goto L_0x00d2
        L_0x00b2:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x00d1
            java.lang.String r11 = "unexpected e_machine:"
            boolean r11 = r10.contains(r11)     // Catch:{ all -> 0x0079 }
            if (r11 == 0) goto L_0x00d1
            java.lang.String r11 = "unexpected e_machine:"
            int r11 = r10.lastIndexOf(r11)     // Catch:{ all -> 0x0079 }
            java.lang.String r10 = r10.substring(r11)     // Catch:{ all -> 0x0079 }
            com.facebook.soloader.SoLoader$a r11 = new com.facebook.soloader.SoLoader$a     // Catch:{ all -> 0x0079 }
            r11.<init>(r9, r10)     // Catch:{ all -> 0x0079 }
            throw r11     // Catch:{ all -> 0x0079 }
        L_0x00d1:
            throw r9     // Catch:{ all -> 0x0079 }
        L_0x00d2:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            monitor-enter(r6)     // Catch:{ all -> 0x0175 }
            r12 = r12 & 16
            if (r12 != 0) goto L_0x0168
            if (r11 == 0) goto L_0x0168
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x00ea }
            if (r11 != 0) goto L_0x00ed
            java.util.Set r11 = f42502j     // Catch:{ all -> 0x00ea }
            boolean r11 = r11.contains(r10)     // Catch:{ all -> 0x00ea }
            if (r11 == 0) goto L_0x00ed
            goto L_0x0168
        L_0x00ea:
            r9 = move-exception
            goto L_0x0173
        L_0x00ed:
            boolean r11 = f42493a     // Catch:{ all -> 0x00ea }
            if (r11 == 0) goto L_0x00fc
            com.facebook.soloader.l r12 = f42507o     // Catch:{ all -> 0x00ea }
            if (r12 != 0) goto L_0x00fc
            java.lang.String r12 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r13 = "]"
            com.facebook.soloader.Api18TraceUtils.a(r12, r10, r13)     // Catch:{ all -> 0x00ea }
        L_0x00fc:
            java.lang.String r12 = "SoLoader"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r13.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            java.lang.String r0 = "About to invoke JNI_OnLoad for merged library "
            r13.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r13.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            java.lang.String r0 = ", which was merged into "
            r13.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r13.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            java.lang.String r13 = r13.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            com.facebook.soloader.p.a(r12, r13)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            com.facebook.soloader.l r12 = f42507o     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            if (r12 == 0) goto L_0x0126
            r12.a(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            goto L_0x0129
        L_0x0122:
            r9 = move-exception
            goto L_0x015c
        L_0x0124:
            r11 = move-exception
            goto L_0x0138
        L_0x0126:
            com.facebook.soloader.r.a(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
        L_0x0129:
            java.util.Set r12 = f42502j     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r12.add(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            if (r11 == 0) goto L_0x0168
            com.facebook.soloader.l r9 = f42507o     // Catch:{ all -> 0x00ea }
            if (r9 != 0) goto L_0x0168
            com.facebook.soloader.Api18TraceUtils.b()     // Catch:{ all -> 0x00ea }
            goto L_0x0168
        L_0x0138:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r13.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r13.append(r0)     // Catch:{ all -> 0x0122 }
            r13.append(r10)     // Catch:{ all -> 0x0122 }
            java.lang.String r10 = "', which has been merged into '"
            r13.append(r10)     // Catch:{ all -> 0x0122 }
            r13.append(r9)     // Catch:{ all -> 0x0122 }
            java.lang.String r9 = "'.  See comment for details."
            r13.append(r9)     // Catch:{ all -> 0x0122 }
            java.lang.String r9 = r13.toString()     // Catch:{ all -> 0x0122 }
            r12.<init>(r9, r11)     // Catch:{ all -> 0x0122 }
            throw r12     // Catch:{ all -> 0x0122 }
        L_0x015c:
            boolean r10 = f42493a     // Catch:{ all -> 0x00ea }
            if (r10 == 0) goto L_0x0167
            com.facebook.soloader.l r10 = f42507o     // Catch:{ all -> 0x00ea }
            if (r10 != 0) goto L_0x0167
            com.facebook.soloader.Api18TraceUtils.b()     // Catch:{ all -> 0x00ea }
        L_0x0167:
            throw r9     // Catch:{ all -> 0x00ea }
        L_0x0168:
            monitor-exit(r6)     // Catch:{ all -> 0x00ea }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r2.readLock()
            r9.unlock()
            r9 = r3 ^ 1
            return r9
        L_0x0173:
            monitor-exit(r6)     // Catch:{ all -> 0x00ea }
            throw r9     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r9 = move-exception
            goto L_0x0179
        L_0x0177:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ all -> 0x0175 }
        L_0x0179:
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = f42495c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.unlock()
            throw r9
        L_0x0183:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.w(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        x8.C4178b.k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean x(com.facebook.soloader.E r0, java.lang.String r1, int r2, android.os.StrictMode.ThreadPolicy r3) {
        /*
            x8.C4178b.l(r0)
            int r0 = r0.d(r1, r2, r3)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            x8.C4178b.k(r1)
            return r0
        L_0x0011:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r1 = move-exception
            x8.C4178b.k(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.x(com.facebook.soloader.E, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        x8.C4178b.e(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean y(java.lang.String r3, int r4) {
        /*
            com.facebook.soloader.l r0 = f42507o
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.b(r3)
            goto L_0x000d
        L_0x0009:
            java.lang.String r0 = com.facebook.soloader.r.b(r3)
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r1 = r0
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            x8.C4178b.f(r3, r0, r4)
            java.lang.String r1 = java.lang.System.mapLibraryName(r1)     // Catch:{ all -> 0x0022 }
            r2 = 0
            boolean r3 = v(r1, r3, r0, r4, r2)     // Catch:{ all -> 0x0022 }
            x8.C4178b.e(r2, r3)
            return r3
        L_0x0022:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            r0 = 0
            x8.C4178b.e(r3, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.y(java.lang.String, int):boolean");
    }

    private static Boolean z(String str) {
        Boolean valueOf;
        if (f42497e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f42495c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f42497e == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    f();
                } else {
                    synchronized (SoLoader.class) {
                        boolean contains = f42500h.contains(str);
                        boolean z10 = !contains;
                        if (!contains) {
                            System.loadLibrary(str);
                        }
                        valueOf = Boolean.valueOf(z10);
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return valueOf;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f42495c.readLock().unlock();
            throw th2;
        }
    }
}

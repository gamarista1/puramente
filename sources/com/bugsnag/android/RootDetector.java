package com.bugsnag.android;

import Sg.C5538a;
import Sg.m;
import Sg.p;
import java.io.File;
import java.io.Reader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.v;
import lf.w;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0018B5\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH ¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "", "Lcom/bugsnag/android/X;", "deviceBuildInfo", "", "", "rootBinaryLocations", "Ljava/io/File;", "buildProps", "Lcom/bugsnag/android/S0;", "logger", "<init>", "(Lcom/bugsnag/android/X;Ljava/util/List;Ljava/io/File;Lcom/bugsnag/android/S0;)V", "", "d", "()Z", "performNativeRootChecks", "Ljava/io/Reader;", "f", "(Ljava/io/Reader;)Z", "h", "g", "b", "c", "a", "Ljava/lang/ProcessBuilder;", "processBuilder", "e", "(Ljava/lang/ProcessBuilder;)Z", "Lcom/bugsnag/android/X;", "Ljava/util/List;", "Ljava/io/File;", "Lcom/bugsnag/android/S0;", "Z", "libraryLoaded", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RootDetector {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38583f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final File f38584g = new File("/system/build.prop");

    /* renamed from: h  reason: collision with root package name */
    private static final List f38585h = C6565s.q("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");

    /* renamed from: a  reason: collision with root package name */
    private final X f38586a;

    /* renamed from: b  reason: collision with root package name */
    private final List f38587b;

    /* renamed from: c  reason: collision with root package name */
    private final File f38588c;

    /* renamed from: d  reason: collision with root package name */
    private final S0 f38589d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f38590e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38591a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            return new m("\\s").e(str, "");
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f38592a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            boolean z10 = false;
            if (p.J(str, "ro.debuggable=[1]", false, 2, (Object) null) || p.J(str, "ro.secure=[0]", false, 2, (Object) null)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public RootDetector(X x10, List list, File file, S0 s02) {
        this.f38586a = x10;
        this.f38587b = list;
        this.f38588c = file;
        this.f38589d = s02;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.f38590e = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private final boolean d() {
        return e(new ProcessBuilder(new String[0]));
    }

    private final boolean f(Reader reader) {
        int read;
        do {
            read = reader.read();
            if (read == -1) {
                return false;
            }
        } while (C5538a.c((char) read));
        return true;
    }

    private final boolean h() {
        if (this.f38590e) {
            return performNativeRootChecks();
        }
        return false;
    }

    private final native boolean performNativeRootChecks();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        wf.C6763c.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r3 = this;
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0030 }
            java.io.File r0 = r3.f38588c     // Catch:{ all -> 0x0030 }
            java.nio.charset.Charset r1 = Sg.C5541d.f65029b     // Catch:{ all -> 0x0030 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0030 }
            r2.<init>(r0)     // Catch:{ all -> 0x0030 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0030 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0030 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0030 }
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0030 }
            Rg.h r0 = wf.t.c(r1)     // Catch:{ all -> 0x0032 }
            com.bugsnag.android.RootDetector$b r2 = com.bugsnag.android.RootDetector.b.f38591a     // Catch:{ all -> 0x0032 }
            Rg.h r0 = Rg.k.x(r0, r2)     // Catch:{ all -> 0x0032 }
            com.bugsnag.android.RootDetector$c r2 = com.bugsnag.android.RootDetector.c.f38592a     // Catch:{ all -> 0x0032 }
            Rg.h r0 = Rg.k.o(r0, r2)     // Catch:{ all -> 0x0032 }
            boolean r0 = Rg.k.k(r0)     // Catch:{ all -> 0x0032 }
            r2 = 0
            wf.C6763c.a(r1, r2)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r0 = move-exception
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            wf.C6763c.a(r1, r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0030 }
        L_0x0039:
            lf.v$a r1 = lf.v.f71841b
            java.lang.Object r0 = lf.w.a(r0)
            lf.v.b(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.RootDetector.a():boolean");
    }

    public final boolean b() {
        String i10 = this.f38586a.i();
        if (i10 != null && p.O(i10, "test-keys", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        try {
            v.a aVar = v.f71841b;
            for (String file : this.f38587b) {
                if (new File(file).exists()) {
                    return true;
                }
            }
            v.b(C6514M.f71813a);
            return false;
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            v.b(w.a(th2));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        wf.C6763c.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.ProcessBuilder r6) {
        /*
            r5 = this;
            java.lang.String r0 = "which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = mf.C6565s.q(r0)
            r6.command(r0)
            r0 = 0
            java.lang.Process r6 = r6.start()     // Catch:{ IOException -> 0x0047, all -> 0x003c }
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.nio.charset.Charset r2 = Sg.C5541d.f65029b     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r3.<init>(r1, r2)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            boolean r2 = r5.f(r1)     // Catch:{ all -> 0x0035 }
            wf.C6763c.a(r1, r0)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r6.destroy()
            goto L_0x004e
        L_0x0031:
            r0 = move-exception
            goto L_0x0040
        L_0x0033:
            r0 = r6
            goto L_0x0047
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            wf.C6763c.a(r1, r0)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            throw r2     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
        L_0x003c:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0040:
            if (r6 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r6.destroy()
        L_0x0046:
            throw r0
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            r0.destroy()
        L_0x004d:
            r2 = 0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.RootDetector.e(java.lang.ProcessBuilder):boolean");
    }

    public final boolean g() {
        try {
            if (b() || d() || a() || c() || h()) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            this.f38589d.b("Root detection failed", th2);
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootDetector(X x10, List list, File file, S0 s02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? X.f38629j.a() : x10, (i10 & 2) != 0 ? f38585h : list, (i10 & 4) != 0 ? f38584g : file, s02);
    }
}

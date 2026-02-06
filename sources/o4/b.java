package O4;

import android.os.Build;
import android.os.StrictMode;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f33315a;

    /* renamed from: b  reason: collision with root package name */
    private final File f33316b;

    /* renamed from: c  reason: collision with root package name */
    private final File f33317c;

    /* renamed from: d  reason: collision with root package name */
    private final File f33318d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33319e;

    /* renamed from: f  reason: collision with root package name */
    private long f33320f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f33321g;

    /* renamed from: h  reason: collision with root package name */
    private long f33322h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Writer f33323i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap f33324j = new LinkedHashMap(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f33325k;

    /* renamed from: l  reason: collision with root package name */
    private long f33326l = 0;

    /* renamed from: m  reason: collision with root package name */
    final ThreadPoolExecutor f33327m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0544b((a) null));

    /* renamed from: n  reason: collision with root package name */
    private final Callable f33328n = new a();

    class a implements Callable {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                O4.b r0 = O4.b.this
                monitor-enter(r0)
                O4.b r1 = O4.b.this     // Catch:{ all -> 0x000e }
                java.io.Writer r1 = r1.f33323i     // Catch:{ all -> 0x000e }
                r2 = 0
                if (r1 != 0) goto L_0x0010
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x000e:
                r1 = move-exception
                goto L_0x002a
            L_0x0010:
                O4.b r1 = O4.b.this     // Catch:{ all -> 0x000e }
                r1.E0()     // Catch:{ all -> 0x000e }
                O4.b r1 = O4.b.this     // Catch:{ all -> 0x000e }
                boolean r1 = r1.f0()     // Catch:{ all -> 0x000e }
                if (r1 == 0) goto L_0x0028
                O4.b r1 = O4.b.this     // Catch:{ all -> 0x000e }
                r1.t0()     // Catch:{ all -> 0x000e }
                O4.b r1 = O4.b.this     // Catch:{ all -> 0x000e }
                r3 = 0
                int unused = r1.f33325k = r3     // Catch:{ all -> 0x000e }
            L_0x0028:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: O4.b.a.call():java.lang.Void");
        }
    }

    /* renamed from: O4.b$b  reason: collision with other inner class name */
    private static final class C0544b implements ThreadFactory {
        private C0544b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C0544b(a aVar) {
            this();
        }
    }

    public final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final d f33330a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f33331b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f33332c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.F(this, false);
        }

        public void b() {
            if (!this.f33332c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() {
            b.this.F(this, true);
            this.f33332c = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (b.this) {
                try {
                    if (this.f33330a.f33339f == this) {
                        if (!this.f33330a.f33338e) {
                            this.f33331b[i10] = true;
                        }
                        k10 = this.f33330a.k(i10);
                        b.this.f33315a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k10;
        }

        private c(d dVar) {
            this.f33330a = dVar;
            this.f33331b = dVar.f33338e ? null : new boolean[b.this.f33321g];
        }
    }

    private final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f33334a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long[] f33335b;

        /* renamed from: c  reason: collision with root package name */
        File[] f33336c;

        /* renamed from: d  reason: collision with root package name */
        File[] f33337d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f33338e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f33339f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f33340g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == b.this.f33321g) {
                int i10 = 0;
                while (i10 < strArr.length) {
                    try {
                        this.f33335b[i10] = Long.parseLong(strArr[i10]);
                        i10++;
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i10) {
            return this.f33336c[i10];
        }

        public File k(int i10) {
            return this.f33337d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f33335b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f33334a = str;
            this.f33335b = new long[b.this.f33321g];
            this.f33336c = new File[b.this.f33321g];
            this.f33337d = new File[b.this.f33321g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f33321g; i10++) {
                sb2.append(i10);
                this.f33336c[i10] = new File(b.this.f33315a, sb2.toString());
                sb2.append(".tmp");
                this.f33337d[i10] = new File(b.this.f33315a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f33342a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33343b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f33344c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f33345d;

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f33345d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f33342a = str;
            this.f33343b = j10;
            this.f33345d = fileArr;
            this.f33344c = jArr;
        }
    }

    private b(File file, int i10, int i11, long j10) {
        File file2 = file;
        this.f33315a = file2;
        this.f33319e = i10;
        this.f33316b = new File(file2, "journal");
        this.f33317c = new File(file2, "journal.tmp");
        this.f33318d = new File(file2, "journal.bkp");
        this.f33321g = i11;
        this.f33320f = j10;
    }

    private static void B0(File file, File file2, boolean z10) {
        if (z10) {
            M(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void E(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public void E0() {
        while (this.f33322h > this.f33320f) {
            x0((String) ((Map.Entry) this.f33324j.entrySet().iterator().next()).getKey());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void F(O4.b.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            O4.b$d r0 = r10.f33330a     // Catch:{ all -> 0x0030 }
            O4.b$c r1 = r0.f33339f     // Catch:{ all -> 0x0030 }
            if (r1 != r10) goto L_0x010b
            r1 = 0
            if (r11 == 0) goto L_0x0050
            boolean r2 = r0.f33338e     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0050
            r2 = r1
        L_0x0015:
            int r3 = r9.f33321g     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0050
            boolean[] r3 = r10.f33331b     // Catch:{ all -> 0x0030 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0036
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x0030 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x0033
            r10.a()     // Catch:{ all -> 0x0030 }
            monitor-exit(r9)
            return
        L_0x0030:
            r10 = move-exception
            goto L_0x0111
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0036:
            r10.a()     // Catch:{ all -> 0x0030 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r11.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0030 }
            r11.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0030 }
            r10.<init>(r11)     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0050:
            int r10 = r9.f33321g     // Catch:{ all -> 0x0030 }
            if (r1 >= r10) goto L_0x0084
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x007e
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0081
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0030 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f33335b     // Catch:{ all -> 0x0030 }
            r3 = r10[r1]     // Catch:{ all -> 0x0030 }
            long r5 = r2.length()     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f33335b     // Catch:{ all -> 0x0030 }
            r10[r1] = r5     // Catch:{ all -> 0x0030 }
            long r7 = r9.f33322h     // Catch:{ all -> 0x0030 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f33322h = r7     // Catch:{ all -> 0x0030 }
            goto L_0x0081
        L_0x007e:
            M(r10)     // Catch:{ all -> 0x0030 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0084:
            int r10 = r9.f33325k     // Catch:{ all -> 0x0030 }
            r1 = 1
            int r10 = r10 + r1
            r9.f33325k = r10     // Catch:{ all -> 0x0030 }
            r10 = 0
            O4.b.c unused = r0.f33339f = r10     // Catch:{ all -> 0x0030 }
            boolean r10 = r0.f33338e     // Catch:{ all -> 0x0030 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00cc
            boolean unused = r0.f33338e = r1     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.f33334a     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x00ef
            long r10 = r9.f33326l     // Catch:{ all -> 0x0030 }
            r1 = 1
            long r1 = r1 + r10
            r9.f33326l = r1     // Catch:{ all -> 0x0030 }
            long unused = r0.f33340g = r10     // Catch:{ all -> 0x0030 }
            goto L_0x00ef
        L_0x00cc:
            java.util.LinkedHashMap r10 = r9.f33324j     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f33334a     // Catch:{ all -> 0x0030 }
            r10.remove(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f33334a     // Catch:{ all -> 0x0030 }
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
        L_0x00ef:
            java.io.Writer r10 = r9.f33323i     // Catch:{ all -> 0x0030 }
            U(r10)     // Catch:{ all -> 0x0030 }
            long r10 = r9.f33322h     // Catch:{ all -> 0x0030 }
            long r0 = r9.f33320f     // Catch:{ all -> 0x0030 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0102
            boolean r10 = r9.f0()     // Catch:{ all -> 0x0030 }
            if (r10 == 0) goto L_0x0109
        L_0x0102:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f33327m     // Catch:{ all -> 0x0030 }
            java.util.concurrent.Callable r11 = r9.f33328n     // Catch:{ all -> 0x0030 }
            r10.submit(r11)     // Catch:{ all -> 0x0030 }
        L_0x0109:
            monitor-exit(r9)
            return
        L_0x010b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            r10.<init>()     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0111:
            monitor-exit(r9)     // Catch:{ all -> 0x0030 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.F(O4.b$c, boolean):void");
    }

    private static void M(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized O4.b.c T(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.y()     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap r0 = r5.f33324j     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x001e }
            O4.b$d r0 = (O4.b.d) r0     // Catch:{ all -> 0x001e }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f33340g     // Catch:{ all -> 0x001e }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
            goto L_0x0020
        L_0x001e:
            r6 = move-exception
            goto L_0x0060
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            O4.b$d r0 = new O4.b$d     // Catch:{ all -> 0x001e }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap r7 = r5.f33324j     // Catch:{ all -> 0x001e }
            r7.put(r6, r0)     // Catch:{ all -> 0x001e }
            goto L_0x0037
        L_0x002f:
            O4.b$c r7 = r0.f33339f     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            O4.b$c r7 = new O4.b$c     // Catch:{ all -> 0x001e }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x001e }
            O4.b.c unused = r0.f33339f = r7     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f33323i     // Catch:{ all -> 0x001e }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f33323i     // Catch:{ all -> 0x001e }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f33323i     // Catch:{ all -> 0x001e }
            r8.append(r6)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f33323i     // Catch:{ all -> 0x001e }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f33323i     // Catch:{ all -> 0x001e }
            U(r6)     // Catch:{ all -> 0x001e }
            monitor-exit(r5)
            return r7
        L_0x0060:
            monitor-exit(r5)     // Catch:{ all -> 0x001e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.T(java.lang.String, long):O4.b$c");
    }

    private static void U(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public boolean f0() {
        int i10 = this.f33325k;
        if (i10 < 2000 || i10 < this.f33324j.size()) {
            return false;
        }
        return true;
    }

    public static b g0(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    B0(file2, file3, false);
                }
            }
            b bVar = new b(file, i10, i11, j10);
            if (bVar.f33316b.exists()) {
                try {
                    bVar.j0();
                    bVar.h0();
                    return bVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    bVar.I();
                }
            }
            file.mkdirs();
            b bVar2 = new b(file, i10, i11, j10);
            bVar2.t0();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void h0() {
        M(this.f33317c);
        Iterator it = this.f33324j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f33339f == null) {
                while (i10 < this.f33321g) {
                    this.f33322h += dVar.f33335b[i10];
                    i10++;
                }
            } else {
                c unused = dVar.f33339f = null;
                while (i10 < this.f33321g) {
                    M(dVar.j(i10));
                    M(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.f33325k = r0 - r9.f33324j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r1.f() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r9.f33323i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f33316b, true), O4.d.f33353a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0061 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0061=Splitter:B:17:0x0061, B:24:0x008e=Splitter:B:24:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            O4.c r1 = new O4.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f33316b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = O4.d.f33353a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.n()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r1.n()     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r1.n()     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r1.n()     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r1.n()     // Catch:{ all -> 0x005f }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            int r7 = r9.f33319e     // Catch:{ all -> 0x005f }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x005f }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            int r4 = r9.f33321g     // Catch:{ all -> 0x005f }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x005f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.n()     // Catch:{ EOFException -> 0x0061 }
            r9.o0(r2)     // Catch:{ EOFException -> 0x0061 }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            r0 = move-exception
            goto L_0x00bc
        L_0x0061:
            java.util.LinkedHashMap r2 = r9.f33324j     // Catch:{ all -> 0x005f }
            int r2 = r2.size()     // Catch:{ all -> 0x005f }
            int r0 = r0 - r2
            r9.f33325k = r0     // Catch:{ all -> 0x005f }
            boolean r0 = r1.f()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0074
            r9.t0()     // Catch:{ all -> 0x005f }
            goto L_0x008a
        L_0x0074:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x005f }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x005f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005f }
            java.io.File r4 = r9.f33316b     // Catch:{ all -> 0x005f }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
            java.nio.charset.Charset r4 = O4.d.f33353a     // Catch:{ all -> 0x005f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            r9.f33323i = r0     // Catch:{ all -> 0x005f }
        L_0x008a:
            O4.d.a(r1)
            return
        L_0x008e:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r7.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005f }
            r7.append(r2)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r3)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r5)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005f }
            r4.<init>(r0)     // Catch:{ all -> 0x005f }
            throw r4     // Catch:{ all -> 0x005f }
        L_0x00bc:
            O4.d.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.j0():void");
    }

    private void o0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f33324j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = (d) this.f33324j.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (a) null);
                this.f33324j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                boolean unused = dVar.f33338e = true;
                c unused2 = dVar.f33339f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f33339f = new c(this, dVar, (a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void t0() {
        BufferedWriter bufferedWriter;
        try {
            Writer writer = this.f33323i;
            if (writer != null) {
                E(writer);
            }
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f33317c), d.f33353a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f33319e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f33321g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f33324j.values()) {
                if (dVar.f33339f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f33334a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f33334a + dVar.l() + 10);
                }
            }
            E(bufferedWriter);
            if (this.f33316b.exists()) {
                B0(this.f33316b, this.f33318d, true);
            }
            B0(this.f33317c, this.f33316b, false);
            this.f33318d.delete();
            this.f33323i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f33316b, true), d.f33353a));
        } catch (Throwable th2) {
            E(bufferedWriter);
            throw th2;
        } finally {
        }
    }

    private void y() {
        if (this.f33323i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void I() {
        close();
        d.b(this.f33315a);
    }

    public c Q(String str) {
        return T(str, -1);
    }

    public synchronized e V(String str) {
        y();
        d dVar = (d) this.f33324j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f33338e) {
            return null;
        }
        for (File exists : dVar.f33336c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f33325k++;
        this.f33323i.append("READ");
        this.f33323i.append(' ');
        this.f33323i.append(str);
        this.f33323i.append(10);
        if (f0()) {
            this.f33327m.submit(this.f33328n);
        }
        return new e(this, str, dVar.f33340g, dVar.f33336c, dVar.f33335b, (a) null);
    }

    public synchronized void close() {
        try {
            if (this.f33323i != null) {
                Iterator it = new ArrayList(this.f33324j.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f33339f != null) {
                        dVar.f33339f.a();
                    }
                }
                E0();
                E(this.f33323i);
                this.f33323i = null;
            }
        } finally {
            while (true) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean x0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.y()     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap r0 = r7.f33324j     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0043 }
            O4.b$d r0 = (O4.b.d) r0     // Catch:{ all -> 0x0043 }
            r1 = 0
            if (r0 == 0) goto L_0x008f
            O4.b$c r2 = r0.f33339f     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0017
            goto L_0x008f
        L_0x0017:
            int r2 = r7.f33321g     // Catch:{ all -> 0x0043 }
            if (r1 >= r2) goto L_0x005b
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0043 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0045
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0043 }
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0043 }
            r8.<init>(r0)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            goto L_0x0091
        L_0x0045:
            long r2 = r7.f33322h     // Catch:{ all -> 0x0043 }
            long[] r4 = r0.f33335b     // Catch:{ all -> 0x0043 }
            r5 = r4[r1]     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r5
            r7.f33322h = r2     // Catch:{ all -> 0x0043 }
            long[] r2 = r0.f33335b     // Catch:{ all -> 0x0043 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0043 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x005b:
            int r0 = r7.f33325k     // Catch:{ all -> 0x0043 }
            r1 = 1
            int r0 = r0 + r1
            r7.f33325k = r0     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f33323i     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f33323i     // Catch:{ all -> 0x0043 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f33323i     // Catch:{ all -> 0x0043 }
            r0.append(r8)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f33323i     // Catch:{ all -> 0x0043 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap r0 = r7.f33324j     // Catch:{ all -> 0x0043 }
            r0.remove(r8)     // Catch:{ all -> 0x0043 }
            boolean r8 = r7.f0()     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x008d
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f33327m     // Catch:{ all -> 0x0043 }
            java.util.concurrent.Callable r0 = r7.f33328n     // Catch:{ all -> 0x0043 }
            r8.submit(r0)     // Catch:{ all -> 0x0043 }
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.x0(java.lang.String):boolean");
    }
}

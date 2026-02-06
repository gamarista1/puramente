package com.google.firebase.remoteconfig.internal;

import Dc.c;
import Dc.o;
import Dc.p;
import Ea.C4278a;
import Ea.e;
import Ea.h;
import Ea.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jc.C5046e;
import org.json.JSONObject;
import ub.C5230g;

public class t {

    /* renamed from: q  reason: collision with root package name */
    static final int[] f57917q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f57918r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Set f57919a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57920b;

    /* renamed from: c  reason: collision with root package name */
    private int f57921c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57922d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57923e;

    /* renamed from: f  reason: collision with root package name */
    private final int f57924f = 8;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f57925g;

    /* renamed from: h  reason: collision with root package name */
    private final m f57926h;

    /* renamed from: i  reason: collision with root package name */
    private final C5230g f57927i;

    /* renamed from: j  reason: collision with root package name */
    private final C5046e f57928j;

    /* renamed from: k  reason: collision with root package name */
    f f57929k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f57930l;

    /* renamed from: m  reason: collision with root package name */
    private final String f57931m;

    /* renamed from: n  reason: collision with root package name */
    private final Random f57932n;

    /* renamed from: o  reason: collision with root package name */
    private final e f57933o;

    /* renamed from: p  reason: collision with root package name */
    private final p f57934p;

    class a implements Runnable {
        a() {
        }

        public void run() {
            t.this.e();
        }
    }

    public t(C5230g gVar, C5046e eVar, m mVar, f fVar, Context context, String str, Set set, p pVar, ScheduledExecutorService scheduledExecutorService) {
        this.f57919a = set;
        this.f57920b = false;
        this.f57925g = scheduledExecutorService;
        this.f57932n = new Random();
        this.f57921c = Math.max(8 - pVar.i().b(), 1);
        this.f57933o = h.c();
        this.f57927i = gVar;
        this.f57926h = mVar;
        this.f57928j = eVar;
        this.f57929k = fVar;
        this.f57930l = context;
        this.f57931m = str;
        this.f57934p = pVar;
        this.f57922d = false;
        this.f57923e = false;
    }

    private void D(Date date) {
        int b10 = this.f57934p.i().b() + 1;
        this.f57934p.p(b10, new Date(date.getTime() + m(b10)));
    }

    private synchronized boolean f() {
        boolean z10;
        if (this.f57919a.isEmpty() || this.f57920b || this.f57922d || this.f57923e) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.f57927i.r().c()));
        hashMap.put("namespace", this.f57931m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f57926h.r()));
        hashMap.put("appId", this.f57927i.r().c());
        hashMap.put(com.amazon.a.a.o.b.f37451I, "22.0.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* access modifiers changed from: private */
    public synchronized void j() {
        this.f57922d = true;
    }

    private static String k(String str) {
        Matcher matcher = f57918r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.f57930l;
            byte[] a10 = C4278a.a(context, context.getPackageName());
            if (a10 != null) {
                return j.c(a10, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f57930l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f57930l.getPackageName());
            return null;
        }
    }

    private long m(int i10) {
        int[] iArr = f57917q;
        int length = iArr.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i10 - 1]);
        return (millis / 2) + ((long) this.f57932n.nextInt((int) millis));
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{k(this.f57927i.r().c()), str});
    }

    private URL o() {
        try {
            return new URL(n(this.f57931m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.google.android.gms.tasks.Task q(com.google.android.gms.tasks.Task r10, com.google.android.gms.tasks.Task r11) {
        /*
            r9 = this;
            java.lang.String r11 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            r0 = 403(0x193, float:5.65E-43)
            r1 = 1
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r4 = 0
            boolean r5 = r10.isSuccessful()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            if (r5 == 0) goto L_0x008b
            r9.y(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Object r10 = r10.getResult()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            int r5 = r10.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            if (r5 != r2) goto L_0x0037
            r9.v()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.p r7 = r9.f57934p     // Catch:{ IOException -> 0x0035 }
            r7.k()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.b r7 = r9.B(r10)     // Catch:{ IOException -> 0x0035 }
            r7.i()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0037
        L_0x0032:
            r4 = move-exception
            goto L_0x00f0
        L_0x0035:
            r5 = move-exception
            goto L_0x0095
        L_0x0037:
            r9.g(r10)
            r9.y(r3)
            boolean r1 = r9.p(r5)
            if (r1 == 0) goto L_0x0051
            java.util.Date r3 = new java.util.Date
            Ea.e r7 = r9.f57933o
            long r7 = r7.currentTimeMillis()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0051:
            if (r1 != 0) goto L_0x0074
            if (r5 != r2) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            if (r5 != r0) goto L_0x0068
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0068:
            Dc.s r10 = new Dc.s
            Dc.p$a r0 = Dc.p.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r5, (java.lang.String) r11, (Dc.p.a) r0)
        L_0x006f:
            r9.u(r10)
            goto L_0x00eb
        L_0x0074:
            r9.w()
            goto L_0x00eb
        L_0x0079:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x00f0
        L_0x007e:
            r5 = move-exception
            r6 = r4
            goto L_0x0095
        L_0x0081:
            r10 = move-exception
            r6 = r4
            r4 = r10
            r10 = r6
            goto L_0x00f0
        L_0x0087:
            r5 = move-exception
            r10 = r4
            r6 = r10
            goto L_0x0095
        L_0x008b:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Exception r10 = r10.getException()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            r5.<init>(r10)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            throw r5     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
        L_0x0095:
            java.lang.String r7 = "FirebaseRemoteConfig"
            java.lang.String r8 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r7, r8, r5)     // Catch:{ all -> 0x0032 }
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x00b0
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00c0
            java.util.Date r3 = new java.util.Date
            Ea.e r5 = r9.f57933o
            long r7 = r5.currentTimeMillis()
            r3.<init>(r7)
            r9.D(r3)
        L_0x00c0:
            if (r1 != 0) goto L_0x0074
            int r1 = r6.intValue()
            if (r1 != r2) goto L_0x00c9
            goto L_0x0074
        L_0x00c9:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x00df
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x00df:
            Dc.s r10 = new Dc.s
            int r0 = r6.intValue()
            Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (Dc.p.a) r1)
            goto L_0x006f
        L_0x00eb:
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forResult(r4)
            return r10
        L_0x00f0:
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x0104
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r1 = r3
        L_0x0104:
            if (r1 == 0) goto L_0x0114
            java.util.Date r3 = new java.util.Date
            Ea.e r5 = r9.f57933o
            long r7 = r5.currentTimeMillis()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0114:
            if (r1 != 0) goto L_0x0141
            int r1 = r6.intValue()
            if (r1 == r2) goto L_0x0141
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x0132
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0132:
            Dc.s r10 = new Dc.s
            int r0 = r6.intValue()
            Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (Dc.p.a) r1)
            r9.u(r10)
            goto L_0x0144
        L_0x0141:
            r9.w()
        L_0x0144:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.t.q(com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task r(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new o("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new o("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) task2.getResult(), ((g) task.getResult()).b());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.forException(new o("Failed to open HTTP stream connection", (Throwable) e10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void s(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f57921c     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0020
            int r0 = r0 + -1
            r3.f57921c = r0     // Catch:{ all -> 0x001e }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f57925g     // Catch:{ all -> 0x001e }
            com.google.firebase.remoteconfig.internal.t$a r1 = new com.google.firebase.remoteconfig.internal.t$a     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001e }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x001e }
            goto L_0x0030
        L_0x001e:
            r4 = move-exception
            goto L_0x0032
        L_0x0020:
            boolean r4 = r3.f57923e     // Catch:{ all -> 0x001e }
            if (r4 != 0) goto L_0x0030
            Dc.o r4 = new Dc.o     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            Dc.p$a r0 = Dc.p.a.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x001e }
            r4.<init>((java.lang.String) r5, (Dc.p.a) r0)     // Catch:{ all -> 0x001e }
            r3.u(r4)     // Catch:{ all -> 0x001e }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.t.s(long):void");
    }

    private String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public synchronized void u(p pVar) {
        for (c b10 : this.f57919a) {
            b10.b(pVar);
        }
    }

    private synchronized void v() {
        this.f57921c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f57927i.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f57930l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", com.amazon.a.a.o.b.f37475af);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z10) {
        this.f57920b = z10;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized b B(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new b(httpURLConnection2, this.f57926h, this.f57929k, this.f57919a, new b(), this.f57925g);
    }

    public void C() {
        s(0);
    }

    public void e() {
        if (f()) {
            if (new Date(this.f57933o.currentTimeMillis()).before(this.f57934p.i().a())) {
                w();
                return;
            }
            Task h10 = h();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{h10}).continueWith(this.f57925g, new r(this, h10));
        }
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public Task h() {
        Task a10 = this.f57928j.a(false);
        Task id2 = this.f57928j.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{a10, id2}).continueWithTask(this.f57925g, new s(this, a10, id2));
    }

    public synchronized void w() {
        s(Math.max(0, this.f57934p.i().a().getTime() - new Date(this.f57933o.currentTimeMillis()).getTime()));
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        this.f57923e = z10;
    }

    class b implements c {
        b() {
        }

        public void b(p pVar) {
            t.this.j();
            t.this.u(pVar);
        }

        public void a(Dc.b bVar) {
        }
    }
}

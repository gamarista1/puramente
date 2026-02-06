package com.google.firebase.remoteconfig.internal;

import Dc.c;
import Dc.o;
import Dc.p;
import Dc.s;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set f57812a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f57813b;

    /* renamed from: c  reason: collision with root package name */
    private final m f57814c;

    /* renamed from: d  reason: collision with root package name */
    private final f f57815d;

    /* renamed from: e  reason: collision with root package name */
    private final c f57816e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f57817f;

    /* renamed from: g  reason: collision with root package name */
    private final Random f57818g = new Random();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f57819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f57820b;

        a(int i10, long j10) {
            this.f57819a = i10;
            this.f57820b = j10;
        }

        public void run() {
            b.this.d(this.f57819a, this.f57820b);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set set, c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f57813b = httpURLConnection;
        this.f57814c = mVar;
        this.f57815d = fVar;
        this.f57812a = set;
        this.f57816e = cVar;
        this.f57817f = scheduledExecutorService;
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            k(new s("Unable to fetch the latest version of the template.", p.a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f57817f.schedule(new a(i10, j10), (long) this.f57818g.nextInt(4), TimeUnit.SECONDS);
    }

    private synchronized void c(Dc.b bVar) {
        for (c a10 : this.f57812a) {
            a10.a(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        boolean z10 = false;
        if (aVar.d() != null) {
            if (aVar.d().k() >= j10) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (aVar.f() == 1) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r9.f57816e.b(new Dc.s("The server is temporarily unavailable. Try again in a few minutes.", Dc.p.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (g() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r6 = r9.f57814c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r4 <= r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        b(3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L_0x0012:
            r4 = r3
        L_0x0013:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L_0x0096
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x0013
        L_0x003b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x005b }
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            boolean r4 = r5.getBoolean(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            Dc.c r4 = r9.f57816e     // Catch:{ JSONException -> 0x005b }
            Dc.s r5 = new Dc.s     // Catch:{ JSONException -> 0x005b }
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            Dc.p$a r7 = Dc.p.a.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x005b }
            r5.<init>((java.lang.String) r6, (Dc.p.a) r7)     // Catch:{ JSONException -> 0x005b }
            r4.b(r5)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0096
        L_0x005b:
            r4 = move-exception
            goto L_0x007d
        L_0x005d:
            boolean r4 = r9.g()     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0064
            goto L_0x0096
        L_0x0064:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0012
            com.google.firebase.remoteconfig.internal.m r4 = r9.f57814c     // Catch:{ JSONException -> 0x005b }
            long r6 = r4.r()     // Catch:{ JSONException -> 0x005b }
            long r4 = r5.getLong(r0)     // Catch:{ JSONException -> 0x005b }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0012
            r6 = 3
            r9.b(r6, r4)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0012
        L_0x007d:
            Dc.o r5 = new Dc.o
            java.lang.Throwable r6 = r4.getCause()
            Dc.p$a r7 = Dc.p.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L_0x0012
        L_0x0096:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.b.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f57812a.isEmpty();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task h(Task task, Task task2, long j10, int i10, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new o("Failed to auto-fetch config update.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new o("Failed to get activated config for auto-fetch", (Throwable) task2.getException()));
        }
        m.a aVar = (m.a) task.getResult();
        g gVar = (g) task2.getResult();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i10, j10);
            return Tasks.forResult(null);
        } else if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        } else {
            if (gVar == null) {
                gVar = g.l().a();
            }
            Set f10 = gVar.f(aVar.d());
            if (f10.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return Tasks.forResult(null);
            }
            c(Dc.b.a(f10));
            return Tasks.forResult(null);
        }
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(p pVar) {
        for (c b10 : this.f57812a) {
            b10.b(pVar);
        }
    }

    public synchronized Task d(int i10, long j10) {
        int i11;
        Task n10;
        Task e10;
        i11 = i10 - 1;
        n10 = this.f57814c.n(m.b.REALTIME, 3 - i11);
        e10 = this.f57815d.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{n10, e10}).continueWithTask(this.f57817f, new a(this, n10, e10, j10, i11));
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f57813b;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            } catch (Throwable th2) {
                this.f57813b.disconnect();
                throw th2;
            }
            this.f57813b.disconnect();
        }
    }
}

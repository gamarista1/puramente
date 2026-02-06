package com.bugsnag.android;

import K4.q;
import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class O implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final H f38560a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38561b;

    public O(H h10, S0 s02) {
        this.f38560a = h10;
        this.f38561b = s02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        wf.C6763c.a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        wf.C6763c.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d(int r6, java.net.HttpURLConnection r7, com.bugsnag.android.V r8) {
        /*
            r5 = this;
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0036 }
            com.bugsnag.android.S0 r0 = r5.f38561b     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "Request completed with code "
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = ", message: "
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = r7.getResponseMessage()     // Catch:{ all -> 0x0036 }
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = ", headers: "
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.util.Map r6 = r7.getHeaderFields()     // Catch:{ all -> 0x0036 }
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0036 }
            r0.d(r6)     // Catch:{ all -> 0x0036 }
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x0036 }
            lf.v.b(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0040
        L_0x0036:
            r6 = move-exception
            lf.v$a r0 = lf.v.f71841b
            java.lang.Object r6 = lf.w.a(r6)
            lf.v.b(r6)
        L_0x0040:
            r6 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.InputStream r1 = r7.getInputStream()     // Catch:{ all -> 0x006d }
            java.nio.charset.Charset r2 = Sg.C5541d.f65029b     // Catch:{ all -> 0x006d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x006d }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x006d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x006d }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x006d }
            com.bugsnag.android.S0 r2 = r5.f38561b     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Received request response: "
            java.lang.String r4 = wf.t.d(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = kotlin.jvm.internal.C6496s.o(r3, r4)     // Catch:{ all -> 0x006f }
            r2.g(r3)     // Catch:{ all -> 0x006f }
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x006f }
            wf.C6763c.a(r1, r6)     // Catch:{ all -> 0x006d }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x006d }
            lf.v.b(r1)     // Catch:{ all -> 0x006d }
            goto L_0x007f
        L_0x006d:
            r1 = move-exception
            goto L_0x0076
        L_0x006f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r3 = move-exception
            wf.C6763c.a(r1, r2)     // Catch:{ all -> 0x006d }
            throw r3     // Catch:{ all -> 0x006d }
        L_0x0076:
            lf.v$a r2 = lf.v.f71841b
            java.lang.Object r1 = lf.w.a(r1)
            lf.v.b(r1)
        L_0x007f:
            com.bugsnag.android.V r1 = com.bugsnag.android.V.DELIVERED     // Catch:{ all -> 0x00a8 }
            if (r8 == r1) goto L_0x00b1
            java.io.InputStream r7 = r7.getErrorStream()     // Catch:{ all -> 0x00a8 }
            java.nio.charset.Charset r8 = Sg.C5541d.f65029b     // Catch:{ all -> 0x00a8 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a8 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x00a8 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x00a8 }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x00a8 }
            com.bugsnag.android.S0 r8 = r5.f38561b     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "Request error details: "
            java.lang.String r1 = wf.t.d(r7)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = kotlin.jvm.internal.C6496s.o(r0, r1)     // Catch:{ all -> 0x00aa }
            r8.e(r0)     // Catch:{ all -> 0x00aa }
            lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x00aa }
            wf.C6763c.a(r7, r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x00b1
        L_0x00a8:
            r6 = move-exception
            goto L_0x00b7
        L_0x00aa:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            wf.C6763c.a(r7, r6)     // Catch:{ all -> 0x00a8 }
            throw r8     // Catch:{ all -> 0x00a8 }
        L_0x00b1:
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x00a8 }
            lf.v.b(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x00c0
        L_0x00b7:
            lf.v$a r7 = lf.v.f71841b
            java.lang.Object r6 = lf.w.a(r6)
            lf.v.b(r6)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.O.d(int, java.net.HttpURLConnection, com.bugsnag.android.V):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        wf.C6763c.a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.net.HttpURLConnection e(java.net.URL r2, byte[] r3, java.lang.String r4, java.util.Map r5) {
        /*
            r1 = this;
            java.net.URLConnection r2 = r2.openConnection()
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)
            java.net.URLConnection r2 = (java.net.URLConnection) r2
            if (r2 == 0) goto L_0x0059
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 1
            r2.setDoOutput(r0)
            int r0 = r3.length
            r2.setFixedLengthStreamingMode(r0)
            if (r4 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            java.lang.String r0 = "Bugsnag-Integrity"
            r2.addRequestProperty(r0, r4)
        L_0x001e:
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0026:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0026
            r2.addRequestProperty(r0, r5)
            goto L_0x0026
        L_0x0044:
            java.io.OutputStream r4 = r2.getOutputStream()
            r4.write(r3)     // Catch:{ all -> 0x0052 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0052 }
            r3 = 0
            wf.C6763c.a(r4, r3)
            return r2
        L_0x0052:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            wf.C6763c.a(r4, r2)
            throw r3
        L_0x0059:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.O.e(java.net.URL, byte[], java.lang.String, java.util.Map):java.net.HttpURLConnection");
    }

    public V a(C3254l1 l1Var, U u10) {
        V c10 = c(u10.a(), q.f32402a.g(l1Var), l1Var.f(), u10.b());
        this.f38561b.d(C6496s.o("Session API request finished with status ", c10));
        return c10;
    }

    public V b(C3271s0 s0Var, U u10) {
        V c10 = c(u10.a(), C3271s0.i(s0Var, 0, 1, (Object) null).a(), s0Var.e(), u10.b());
        this.f38561b.d(C6496s.o("Error API request finished with status ", c10));
        return c10;
    }

    public final V c(String str, byte[] bArr, String str2, Map map) {
        TrafficStats.setThreadStatsTag(1);
        H h10 = this.f38560a;
        if (h10 != null && !h10.b()) {
            return V.UNDELIVERED;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = e(new URL(str), bArr, str2, map);
            int responseCode = httpURLConnection.getResponseCode();
            V a10 = V.f38608a.a(responseCode);
            d(responseCode, httpURLConnection, a10);
            httpURLConnection.disconnect();
            return a10;
        } catch (OutOfMemoryError e10) {
            this.f38561b.b("Encountered OOM delivering payload, falling back to persist on disk", e10);
            V v10 = V.UNDELIVERED;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return v10;
        } catch (IOException e11) {
            this.f38561b.b("IOException encountered in request", e11);
            V v11 = V.UNDELIVERED;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return v11;
        } catch (Exception e12) {
            this.f38561b.b("Unexpected error delivering payload", e12);
            V v12 = V.FAILURE;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return v12;
        } catch (Throwable th2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }
}

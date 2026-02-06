package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.d2  reason: case insensitive filesystem */
final class C4593d2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f55034a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f55035b;

    /* renamed from: c  reason: collision with root package name */
    private final C4586c2 f55036c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55037d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f55038e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Y1 f55039f;

    public C4593d2(Y1 y12, String str, URL url, byte[] bArr, Map map, C4586c2 c2Var) {
        this.f55039f = y12;
        C4536s.f(str);
        C4536s.l(url);
        C4536s.l(c2Var);
        this.f55034a = url;
        this.f55035b = bArr;
        this.f55036c = c2Var;
        this.f55037d = str;
        this.f55038e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[SYNTHETIC, Splitter:B:52:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[SYNTHETIC, Splitter:B:61:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.Y1 r1 = r13.f55039f
            r1.g()
            r1 = 0
            r2 = 0
            java.net.URL r3 = r13.f55034a     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            com.google.android.gms.internal.measurement.zzcq r4 = com.google.android.gms.internal.measurement.zzcq.zza()     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            java.lang.String r5 = "client-measurement"
            java.net.URLConnection r3 = r4.zza(r3, r5)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            if (r4 == 0) goto L_0x00f8
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            r3.setDefaultUseCaches(r2)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            r4 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r4)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            r3.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            java.util.Map r5 = r13.f55038e     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            if (r5 == 0) goto L_0x0065
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
        L_0x003d:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            if (r6 == 0) goto L_0x0065
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r3.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            goto L_0x003d
        L_0x0059:
            r4 = move-exception
            r10 = r1
        L_0x005b:
            r7 = r2
            r2 = r4
            goto L_0x0100
        L_0x005f:
            r4 = move-exception
            r10 = r1
        L_0x0061:
            r7 = r2
        L_0x0062:
            r8 = r4
            goto L_0x0136
        L_0x0065:
            byte[] r5 = r13.f55035b     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            if (r5 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.Y1 r5 = r13.f55039f     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            com.google.android.gms.measurement.internal.x5 r5 = r5.j()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            byte[] r6 = r13.f55035b     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            byte[] r5 = r5.d0(r6)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            com.google.android.gms.measurement.internal.Y1 r6 = r13.f55039f     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            com.google.android.gms.measurement.internal.X1 r6 = r6.F()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r6.b(r7, r8)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r3.setDoOutput(r4)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r4, r6)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            int r4 = r5.length     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r3.connect()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            r4.write(r5)     // Catch:{ IOException -> 0x00ac, all -> 0x00a5 }
            r4.close()     // Catch:{ IOException -> 0x00ac, all -> 0x00a5 }
            goto L_0x00b3
        L_0x00a5:
            r5 = move-exception
            r10 = r1
            r7 = r2
            r1 = r4
            r2 = r5
            goto L_0x0100
        L_0x00ac:
            r5 = move-exception
            r10 = r1
            r7 = r2
            r1 = r4
            r8 = r5
            goto L_0x0136
        L_0x00b3:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x005f, all -> 0x0059 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00e9, all -> 0x00e4 }
            com.google.android.gms.measurement.internal.Y1 r2 = r13.f55039f     // Catch:{ IOException -> 0x00df, all -> 0x00da }
            byte[] r10 = com.google.android.gms.measurement.internal.Y1.u(r3)     // Catch:{ IOException -> 0x00df, all -> 0x00da }
            r3.disconnect()
            com.google.android.gms.measurement.internal.Y1 r0 = r13.f55039f
            com.google.android.gms.measurement.internal.z2 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.b2 r1 = new com.google.android.gms.measurement.internal.b2
            java.lang.String r6 = r13.f55037d
            com.google.android.gms.measurement.internal.c2 r7 = r13.f55036c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.y(r1)
            return
        L_0x00da:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x0100
        L_0x00df:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x0062
        L_0x00e4:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x0100
        L_0x00e9:
            r4 = move-exception
            r10 = r1
            r7 = r8
            goto L_0x0062
        L_0x00ee:
            r4 = move-exception
            r3 = r1
            r10 = r3
            goto L_0x005b
        L_0x00f3:
            r4 = move-exception
            r3 = r1
            r10 = r3
            goto L_0x0061
        L_0x00f8:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
            throw r3     // Catch:{ IOException -> 0x00f3, all -> 0x00ee }
        L_0x0100:
            if (r1 == 0) goto L_0x011a
            r1.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x011a
        L_0x0106:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Y1 r4 = r13.f55039f
            com.google.android.gms.measurement.internal.V1 r4 = r4.zzj()
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()
            java.lang.String r5 = r13.f55037d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.V1.q(r5)
            r4.c(r0, r5, r1)
        L_0x011a:
            if (r3 == 0) goto L_0x011f
            r3.disconnect()
        L_0x011f:
            com.google.android.gms.measurement.internal.Y1 r0 = r13.f55039f
            com.google.android.gms.measurement.internal.z2 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.b2 r1 = new com.google.android.gms.measurement.internal.b2
            java.lang.String r5 = r13.f55037d
            com.google.android.gms.measurement.internal.c2 r6 = r13.f55036c
            r9 = 0
            r11 = 0
            r8 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.y(r1)
            throw r2
        L_0x0136:
            if (r1 == 0) goto L_0x0150
            r1.close()     // Catch:{ IOException -> 0x013c }
            goto L_0x0150
        L_0x013c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Y1 r2 = r13.f55039f
            com.google.android.gms.measurement.internal.V1 r2 = r2.zzj()
            com.google.android.gms.measurement.internal.X1 r2 = r2.B()
            java.lang.String r4 = r13.f55037d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r4)
            r2.c(r0, r4, r1)
        L_0x0150:
            if (r3 == 0) goto L_0x0155
            r3.disconnect()
        L_0x0155:
            com.google.android.gms.measurement.internal.Y1 r0 = r13.f55039f
            com.google.android.gms.measurement.internal.z2 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.b2 r1 = new com.google.android.gms.measurement.internal.b2
            java.lang.String r5 = r13.f55037d
            com.google.android.gms.measurement.internal.c2 r6 = r13.f55036c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4593d2.run():void");
    }
}

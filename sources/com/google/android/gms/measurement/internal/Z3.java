package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import java.net.URL;
import java.util.Map;

final class Z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f54990a;

    /* renamed from: b  reason: collision with root package name */
    private final C4574a4 f54991b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54992c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f54993d = null;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Y3 f54994e;

    public Z3(Y3 y32, String str, URL url, byte[] bArr, Map map, C4574a4 a4Var) {
        this.f54994e = y32;
        C4536s.f(str);
        C4536s.l(url);
        C4536s.l(a4Var);
        this.f54990a = url;
        this.f54991b = a4Var;
        this.f54992c = str;
    }

    private final void b(int i10, Exception exc, byte[] bArr, Map map) {
        this.f54994e.zzl().y(new C4588c4(this, i10, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f54991b.a(this.f54992c, i10, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.Y3 r0 = r5.f54994e
            r0.g()
            r0 = 0
            r1 = 0
            java.net.URL r2 = r5.f54990a     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            com.google.android.gms.internal.measurement.zzcq r3 = com.google.android.gms.internal.measurement.zzcq.zza()     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            java.lang.String r4 = "client-measurement"
            java.net.URLConnection r2 = r3.zza(r2, r4)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            boolean r3 = r2 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            if (r3 == 0) goto L_0x0056
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r2.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r3 = 61000(0xee48, float:8.5479E-41)
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r2.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r3 = 1
            r2.setDoInput(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.android.gms.measurement.internal.Y3 r4 = r5.f54994e     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            byte[] r4 = com.google.android.gms.measurement.internal.Y3.q(r2)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2.disconnect()
            r5.b(r1, r0, r4, r3)
            return
        L_0x0044:
            r4 = move-exception
            goto L_0x005e
        L_0x0046:
            r4 = move-exception
            goto L_0x0067
        L_0x0048:
            r4 = move-exception
            r3 = r0
            goto L_0x005e
        L_0x004b:
            r4 = move-exception
            r3 = r0
            goto L_0x0067
        L_0x004e:
            r4 = move-exception
            r2 = r0
            r3 = r2
            goto L_0x005e
        L_0x0052:
            r4 = move-exception
            r2 = r0
            r3 = r2
            goto L_0x0067
        L_0x0056:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            throw r2     // Catch:{ IOException -> 0x0052, all -> 0x004e }
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.disconnect()
        L_0x0063:
            r5.b(r1, r0, r0, r3)
            throw r4
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.disconnect()
        L_0x006c:
            r5.b(r1, r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Z3.run():void");
    }
}

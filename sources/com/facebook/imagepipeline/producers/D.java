package com.facebook.imagepipeline.producers;

import T5.i;
import a6.C3136b;
import android.net.Uri;
import b6.f;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class D extends C3298d {

    /* renamed from: a  reason: collision with root package name */
    private int f39795a;

    /* renamed from: b  reason: collision with root package name */
    private String f39796b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f39797c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f39798d;

    /* renamed from: e  reason: collision with root package name */
    private final C3136b f39799e;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f39800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ X.a f39801b;

        a(c cVar, X.a aVar) {
            this.f39800a = cVar;
            this.f39801b = aVar;
        }

        public void run() {
            D.this.j(this.f39800a, this.f39801b);
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Future f39803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ X.a f39804b;

        b(Future future, X.a aVar) {
            this.f39803a = future;
            this.f39804b = aVar;
        }

        public void b() {
            if (this.f39803a.cancel(false)) {
                this.f39804b.b();
            }
        }
    }

    public static class c extends C {
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public long f39806f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f39807g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public long f39808h;

        public c(C3308n nVar, e0 e0Var) {
            super(nVar, e0Var);
        }
    }

    public D(int i10) {
        this((String) null, (Map) null, RealtimeSinceBootClock.get());
        this.f39795a = i10;
    }

    private HttpURLConnection g(Uri uri, int i10) {
        Uri uri2;
        String str;
        HttpURLConnection o10 = o(uri);
        String str2 = this.f39796b;
        if (str2 != null) {
            o10.setRequestProperty("User-Agent", str2);
        }
        Map map = this.f39797c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                o10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        o10.setConnectTimeout(this.f39795a);
        int responseCode = o10.getResponseCode();
        if (m(responseCode)) {
            return o10;
        }
        if (l(responseCode)) {
            String headerField = o10.getHeaderField("Location");
            o10.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i10 > 0 && uri2 != null && !i.a(uri2.getScheme(), scheme)) {
                return g(uri2, i10 - 1);
            }
            if (i10 == 0) {
                str = h("URL %s follows too many redirects", uri.toString());
            } else {
                str = h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(str);
        }
        o10.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(f.p(uri).openConnection()));
    }

    /* renamed from: f */
    public c e(C3308n nVar, e0 e0Var) {
        return new c(nVar, e0Var);
    }

    /* renamed from: i */
    public void a(c cVar, X.a aVar) {
        cVar.f39806f = this.f39799e.now();
        cVar.b().b(new b(this.f39798d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* access modifiers changed from: package-private */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v7 ?
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.collectCodeVars(ProcessVariables.java:122)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:45)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[SYNTHETIC, Splitter:B:22:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040 A[SYNTHETIC, Splitter:B:27:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public void j(com.facebook.imagepipeline.producers.D.c r5, com.facebook.imagepipeline.producers.X.a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.g()     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r2 = 5
            java.net.HttpURLConnection r1 = r4.g(r1, r2)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            a6.b r2 = r4.f39799e     // Catch:{ IOException -> 0x0020 }
            long r2 = r2.now()     // Catch:{ IOException -> 0x0020 }
            r5.f39807g = r2     // Catch:{ IOException -> 0x0020 }
            if (r1 == 0) goto L_0x0022
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x0020 }
            r5 = -1
            r6.c(r0, r5)     // Catch:{ IOException -> 0x0020 }
            goto L_0x0022
        L_0x001e:
            r5 = move-exception
            goto L_0x003e
        L_0x0020:
            r5 = move-exception
            goto L_0x0032
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            if (r1 == 0) goto L_0x003d
        L_0x0029:
            r1.disconnect()
            goto L_0x003d
        L_0x002d:
            r5 = move-exception
            r1 = r0
            goto L_0x003e
        L_0x0030:
            r5 = move-exception
            r1 = r0
        L_0x0032:
            r6.a(r5)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            if (r1 == 0) goto L_0x003d
            goto L_0x0029
        L_0x003d:
            return
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.disconnect()
        L_0x0048:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.D.j(com.facebook.imagepipeline.producers.D$c, com.facebook.imagepipeline.producers.X$a):void");
    }

    /* renamed from: k */
    public Map d(c cVar, int i10) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f39807g - cVar.f39806f));
        hashMap.put("fetch_time", Long.toString(cVar.f39808h - cVar.f39807g));
        hashMap.put("total_time", Long.toString(cVar.f39808h - cVar.f39806f));
        hashMap.put("image_size", Integer.toString(i10));
        return hashMap;
    }

    /* renamed from: n */
    public void b(c cVar, int i10) {
        cVar.f39808h = this.f39799e.now();
    }

    D(String str, Map map, C3136b bVar) {
        this.f39798d = Executors.newFixedThreadPool(3);
        this.f39799e = bVar;
        this.f39797c = map;
        this.f39796b = str;
    }
}

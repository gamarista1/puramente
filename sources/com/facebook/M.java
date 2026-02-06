package com.facebook;

import Sg.C5541d;
import Sg.p;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.facebook.Q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import mf.C6559l;
import o7.G;
import o7.J;
import o7.P;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class M {

    /* renamed from: n  reason: collision with root package name */
    public static final c f39311n = new c((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final String f39312o = M.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final String f39313p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static String f39314q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f39315r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static volatile String f39316s;

    /* renamed from: a  reason: collision with root package name */
    private C3286a f39317a;

    /* renamed from: b  reason: collision with root package name */
    private String f39318b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f39319c;

    /* renamed from: d  reason: collision with root package name */
    private String f39320d;

    /* renamed from: e  reason: collision with root package name */
    private String f39321e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39322f;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f39323g;

    /* renamed from: h  reason: collision with root package name */
    private Object f39324h;

    /* renamed from: i  reason: collision with root package name */
    private String f39325i;

    /* renamed from: j  reason: collision with root package name */
    private b f39326j;

    /* renamed from: k  reason: collision with root package name */
    private T f39327k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f39328l;

    /* renamed from: m  reason: collision with root package name */
    private String f39329m;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final M f39330a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f39331b;

        public a(M m10, Object obj) {
            C6496s.h(m10, "request");
            this.f39330a = m10;
            this.f39331b = obj;
        }

        public final M a() {
            return this.f39330a;
        }

        public final Object b() {
            return this.f39331b;
        }
    }

    public interface b {
        void a(S s10);
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C6496s.g(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void D(org.json.JSONObject r10, java.lang.String r11, com.facebook.M.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r3 = r11
                int r0 = Sg.p.b0(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = Sg.p.b0(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L_0x0023
                r3 = -1
                if (r11 == r3) goto L_0x0021
                if (r0 >= r11) goto L_0x0023
            L_0x0021:
                r11 = r1
                goto L_0x0024
            L_0x0023:
                r11 = r2
            L_0x0024:
                java.util.Iterator r0 = r10.keys()
            L_0x0028:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L_0x0044
                java.lang.String r5 = "image"
                boolean r5 = Sg.p.v(r3, r5, r1)
                if (r5 == 0) goto L_0x0044
                r5 = r1
                goto L_0x0045
            L_0x0044:
                r5 = r2
            L_0x0045:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C6496s.g(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C6496s.g(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L_0x0028
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.M.c.D(org.json.JSONObject, java.lang.String, com.facebook.M$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                C6496s.f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        U u10 = U.f71764a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C6496s.g(format, "format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C6496s.g(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z10);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    C6496s.g(optString, "jsonObject.optString(\"id\")");
                    E(str, optString, eVar, z10);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C6496s.g(optString2, "jsonObject.optString(\"url\")");
                    E(str, optString2, eVar, z10);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    C6496s.g(jSONObject2, "jsonObject.toString()");
                    E(str, jSONObject2, eVar, z10);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                C6496s.f(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    U u11 = U.f71764a;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    C6496s.g(format2, "format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i10);
                    C6496s.g(opt2, "jsonArray.opt(i)");
                    E(format2, opt2, eVar, z10);
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                eVar.a(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                C6496s.f(obj, "null cannot be cast to non-null type java.util.Date");
                String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C6496s.g(format3, "iso8601DateFormat.format(date)");
                eVar.a(str, format3);
            } else {
                String str2 = M.f39312o;
                W.l0(str2, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
            }
        }

        private final void F(Q q10, J j10, int i10, URL url, OutputStream outputStream, boolean z10) {
            g gVar = new g(outputStream, j10, z10);
            if (i10 == 1) {
                M r10 = q10.get(0);
                HashMap hashMap = new HashMap();
                for (String next : r10.u().keySet()) {
                    Object obj = r10.u().get(next);
                    if (v(obj)) {
                        C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                        hashMap.put(next, new a(r10, obj));
                    }
                }
                if (j10 != null) {
                    j10.b("  Parameters:\n");
                }
                J(r10.u(), gVar, r10);
                if (j10 != null) {
                    j10.b("  Attachments:\n");
                }
                I(hashMap, gVar);
                JSONObject q11 = r10.q();
                if (q11 != null) {
                    String path = url.getPath();
                    C6496s.g(path, "url.path");
                    D(q11, path, gVar);
                    return;
                }
                return;
            }
            String p10 = p(q10);
            if (p10.length() != 0) {
                gVar.a("batch_app_id", p10);
                HashMap hashMap2 = new HashMap();
                K(gVar, q10, hashMap2);
                if (j10 != null) {
                    j10.b("  Attachments:\n");
                }
                I(hashMap2, gVar);
                return;
            }
            throw new C3459v("App ID was not specified at the request or Settings.");
        }

        /* access modifiers changed from: private */
        public static final void H(ArrayList arrayList, Q q10) {
            C6496s.h(arrayList, "$callbacks");
            C6496s.h(q10, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                C6496s.g(obj, "pair.second");
                ((b) pair.first).a((S) obj);
            }
            for (Q.a a10 : q10.x()) {
                a10.a(q10);
            }
        }

        private final void I(Map map, g gVar) {
            for (Map.Entry entry : map.entrySet()) {
                if (M.f39311n.v(((a) entry.getValue()).b())) {
                    gVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, g gVar, M m10) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (w(obj)) {
                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                    gVar.j(next, obj, m10);
                }
            }
        }

        private final void K(g gVar, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((M) it.next()).C(jSONArray, map);
            }
            gVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (z10) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", q());
        }

        private final HttpURLConnection g(URL url) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            C6496s.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(Q q10) {
            String t10 = q10.t();
            if (t10 != null && !q10.isEmpty()) {
                return t10;
            }
            Iterator it = q10.iterator();
            while (it.hasNext()) {
                C3286a m10 = ((M) it.next()).m();
                if (m10 != null) {
                    return m10.c();
                }
            }
            String c10 = M.f39314q;
            if (c10 == null || c10.length() <= 0) {
                return I.m();
            }
            return c10;
        }

        private final String q() {
            U u10 = U.f71764a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{M.f39313p}, 1));
            C6496s.g(format, "format(format, *args)");
            return format;
        }

        private final String r() {
            if (M.f39316s == null) {
                U u10 = U.f71764a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.1.3"}, 2));
                C6496s.g(format, "format(format, *args)");
                M.f39316s = format;
                String a10 = G.a();
                if (!W.e0(a10)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{M.f39316s, a10}, 2));
                    C6496s.g(format2, "format(locale, format, *args)");
                    M.f39316s = format2;
                }
            }
            return M.f39316s;
        }

        private final boolean s(Q q10) {
            for (Q.a aVar : q10.x()) {
            }
            Iterator it = q10.iterator();
            while (it.hasNext()) {
                ((M) it.next()).o();
            }
            return false;
        }

        private final boolean t(Q q10) {
            Iterator it = q10.iterator();
            while (it.hasNext()) {
                M m10 = (M) it.next();
                Iterator<String> it2 = m10.u().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (v(m10.u().get(it2.next()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            Matcher matcher = M.f39315r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C6496s.g(str, "matcher.group(1)");
            }
            if (p.J(str, "me/", false, 2, (Object) null) || p.J(str, "/me/", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean v(Object obj) {
            if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean w(Object obj) {
            if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public static final void z(d dVar, S s10) {
            C6496s.h(s10, "response");
            if (dVar != null) {
                dVar.a(s10.c(), s10);
            }
        }

        public final M A(C3286a aVar, String str, JSONObject jSONObject, b bVar) {
            M m10 = new M(aVar, str, (Bundle) null, T.POST, bVar, (String) null, 32, (DefaultConstructorMarker) null);
            m10.G(jSONObject);
            return m10;
        }

        public final M B(C3286a aVar, String str, Bundle bundle, b bVar) {
            return new M(aVar, str, bundle, T.POST, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }

        public final void G(Q q10, List list) {
            C6496s.h(q10, "requests");
            C6496s.h(list, "responses");
            int size = q10.size();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                M r10 = q10.get(i10);
                if (r10.o() != null) {
                    arrayList.add(new Pair(r10.o(), list.get(i10)));
                }
            }
            if (arrayList.size() > 0) {
                N n10 = new N(arrayList, q10);
                Handler v10 = q10.v();
                if (v10 != null) {
                    v10.post(n10);
                } else {
                    n10.run();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.facebook.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.facebook.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.facebook.b0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void L(com.facebook.Q r14, java.net.HttpURLConnection r15) {
            /*
                r13 = this;
                java.lang.String r0 = "requests"
                kotlin.jvm.internal.C6496s.h(r14, r0)
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.C6496s.h(r15, r0)
                o7.J r0 = new o7.J
                com.facebook.V r1 = com.facebook.V.REQUESTS
                java.lang.String r2 = "Request"
                r0.<init>(r1, r2)
                int r10 = r14.size()
                boolean r11 = r13.t(r14)
                r1 = 0
                r2 = 1
                if (r10 != r2) goto L_0x0029
                r3 = 0
                com.facebook.M r3 = r14.get(r3)
                com.facebook.T r3 = r3.t()
                goto L_0x002a
            L_0x0029:
                r3 = r1
            L_0x002a:
                if (r3 != 0) goto L_0x002e
                com.facebook.T r3 = com.facebook.T.POST
            L_0x002e:
                java.lang.String r4 = r3.name()
                r15.setRequestMethod(r4)
                r13.M(r15, r11)
                java.net.URL r12 = r15.getURL()
                java.lang.String r4 = "Request:\n"
                r0.b(r4)
                java.lang.String r4 = "Id"
                java.lang.String r5 = r14.z()
                r0.d(r4, r5)
                java.lang.String r4 = "url"
                kotlin.jvm.internal.C6496s.g(r12, r4)
                java.lang.String r4 = "URL"
                r0.d(r4, r12)
                java.lang.String r4 = r15.getRequestMethod()
                java.lang.String r5 = "connection.requestMethod"
                kotlin.jvm.internal.C6496s.g(r4, r5)
                java.lang.String r5 = "Method"
                r0.d(r5, r4)
                java.lang.String r4 = "User-Agent"
                java.lang.String r5 = r15.getRequestProperty(r4)
                java.lang.String r6 = "connection.getRequestProperty(\"User-Agent\")"
                kotlin.jvm.internal.C6496s.g(r5, r6)
                r0.d(r4, r5)
                java.lang.String r4 = "Content-Type"
                java.lang.String r5 = r15.getRequestProperty(r4)
                java.lang.String r6 = "connection.getRequestProperty(\"Content-Type\")"
                kotlin.jvm.internal.C6496s.g(r5, r6)
                r0.d(r4, r5)
                int r4 = r14.D()
                r15.setConnectTimeout(r4)
                int r4 = r14.D()
                r15.setReadTimeout(r4)
                com.facebook.T r4 = com.facebook.T.POST
                if (r3 != r4) goto L_0x00f0
                r15.setDoOutput(r2)
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00d4 }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x00d4 }
                r2.<init>(r15)     // Catch:{ all -> 0x00d4 }
                if (r11 == 0) goto L_0x00a8
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00a5 }
                r15.<init>(r2)     // Catch:{ all -> 0x00a5 }
                r1 = r15
                goto L_0x00a9
            L_0x00a5:
                r14 = move-exception
                r1 = r2
                goto L_0x00ea
            L_0x00a8:
                r1 = r2
            L_0x00a9:
                boolean r15 = r13.s(r14)     // Catch:{ all -> 0x00d4 }
                if (r15 == 0) goto L_0x00d6
                com.facebook.a0 r15 = new com.facebook.a0     // Catch:{ all -> 0x00d4 }
                android.os.Handler r2 = r14.v()     // Catch:{ all -> 0x00d4 }
                r15.<init>(r2)     // Catch:{ all -> 0x00d4 }
                r5 = 0
                r3 = r13
                r4 = r14
                r6 = r10
                r7 = r12
                r8 = r15
                r9 = r11
                r3.F(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d4 }
                int r2 = r15.f()     // Catch:{ all -> 0x00d4 }
                java.util.Map r6 = r15.n()     // Catch:{ all -> 0x00d4 }
                com.facebook.b0 r15 = new com.facebook.b0     // Catch:{ all -> 0x00d4 }
                long r7 = (long) r2     // Catch:{ all -> 0x00d4 }
                r3 = r15
                r4 = r1
                r5 = r14
                r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x00d4 }
                goto L_0x00d7
            L_0x00d4:
                r14 = move-exception
                goto L_0x00ea
            L_0x00d6:
                r15 = r1
            L_0x00d7:
                r1 = r13
                r2 = r14
                r3 = r0
                r4 = r10
                r5 = r12
                r6 = r15
                r7 = r11
                r1.F(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e8 }
                r15.close()
                r0.e()
                return
            L_0x00e8:
                r14 = move-exception
                r1 = r15
            L_0x00ea:
                if (r1 == 0) goto L_0x00ef
                r1.close()
            L_0x00ef:
                throw r14
            L_0x00f0:
                r0.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.M.c.L(com.facebook.Q, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(Q q10) {
            URL url;
            C6496s.h(q10, "requests");
            O(q10);
            try {
                if (q10.size() == 1) {
                    url = new URL(q10.get(0).x());
                } else {
                    url = new URL(P.h());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(url);
                    L(q10, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    W.r(httpURLConnection);
                    throw new C3459v("could not construct request body", e10);
                } catch (JSONException e11) {
                    W.r(httpURLConnection);
                    throw new C3459v("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new C3459v("could not construct URL for request", e12);
            }
        }

        public final void O(Q q10) {
            C6496s.h(q10, "requests");
            Iterator it = q10.iterator();
            while (it.hasNext()) {
                M m10 = (M) it.next();
                if (T.GET == m10.t() && W.e0(m10.u().getString("fields"))) {
                    J.a aVar = J.f47112e;
                    V v10 = V.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GET requests for /");
                    String r10 = m10.r();
                    if (r10 == null) {
                        r10 = "";
                    }
                    sb2.append(r10);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    aVar.a(v10, 5, "Request", sb2.toString());
                }
            }
        }

        public final S h(M m10) {
            C6496s.h(m10, "request");
            List k10 = k(m10);
            if (k10.size() == 1) {
                return (S) k10.get(0);
            }
            throw new C3459v("invalid state: expected a single response");
        }

        public final List i(Q q10) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            C6496s.h(q10, "requests");
            X.l(q10, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(q10);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                W.r(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    list = o(httpURLConnection, q10);
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection2 = httpURLConnection;
                    W.r(httpURLConnection2);
                    throw th;
                }
            } else {
                List a10 = S.f39355i.a(q10.A(), (HttpURLConnection) null, new C3459v((Throwable) exc));
                G(q10, a10);
                list = a10;
            }
            W.r(httpURLConnection);
            return list;
        }

        public final List j(Collection collection) {
            C6496s.h(collection, "requests");
            return i(new Q(collection));
        }

        public final List k(M... mArr) {
            C6496s.h(mArr, "requests");
            return j(C6559l.n1(mArr));
        }

        public final P l(Q q10) {
            C6496s.h(q10, "requests");
            X.l(q10, "requests");
            P p10 = new P(q10);
            p10.executeOnExecutor(I.t(), new Void[0]);
            return p10;
        }

        public final P m(Collection collection) {
            C6496s.h(collection, "requests");
            return l(new Q(collection));
        }

        public final P n(M... mArr) {
            C6496s.h(mArr, "requests");
            return m(C6559l.n1(mArr));
        }

        public final List o(HttpURLConnection httpURLConnection, Q q10) {
            C6496s.h(httpURLConnection, "connection");
            C6496s.h(q10, "requests");
            List f10 = S.f39355i.f(httpURLConnection, q10);
            W.r(httpURLConnection);
            int size = q10.size();
            if (size == f10.size()) {
                G(q10, f10);
                C3292g.f39489f.e().h();
                return f10;
            }
            U u10 = U.f71764a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f10.size()), Integer.valueOf(size)}, 2));
            C6496s.g(format, "format(locale, format, *args)");
            throw new C3459v(format);
        }

        public final M x(C3286a aVar, String str, b bVar) {
            return new M(aVar, str, (Bundle) null, (T) null, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }

        public final M y(C3286a aVar, d dVar) {
            return new M(aVar, "me", (Bundle) null, (T) null, new O(dVar), (String) null, 32, (DefaultConstructorMarker) null);
        }

        private c() {
        }
    }

    public interface d {
        void a(JSONObject jSONObject, S s10);
    }

    private interface e {
        void a(String str, String str2);
    }

    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final b f39332c = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f39333a;

        /* renamed from: b  reason: collision with root package name */
        private final Parcelable f39334b;

        public static final class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "source");
                return new f(parcel, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ f(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final Parcelable a() {
            return this.f39334b;
        }

        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.f39333a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "out");
            parcel.writeString(this.f39333a);
            parcel.writeParcelable(this.f39334b, i10);
        }

        public f(Parcelable parcelable, String str) {
            this.f39333a = str;
            this.f39334b = parcelable;
        }

        private f(Parcel parcel) {
            this.f39333a = parcel.readString();
            this.f39334b = parcel.readParcelable(I.l().getClassLoader());
        }
    }

    private static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f39335a;

        /* renamed from: b  reason: collision with root package name */
        private final J f39336b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f39337c = true;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f39338d;

        public g(OutputStream outputStream, J j10, boolean z10) {
            C6496s.h(outputStream, "outputStream");
            this.f39335a = outputStream;
            this.f39336b = j10;
            this.f39338d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, String str2) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(str2, "value");
            f(str, (String) null, (String) null);
            i("%s", str2);
            k();
            J j10 = this.f39336b;
            if (j10 != null) {
                j10.d("    " + str, str2);
            }
        }

        public final void c(String str, Object... objArr) {
            C6496s.h(str, "format");
            C6496s.h(objArr, "args");
            if (!this.f39338d) {
                if (this.f39337c) {
                    OutputStream outputStream = this.f39335a;
                    Charset charset = C5541d.f65029b;
                    byte[] bytes = "--".getBytes(charset);
                    C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f39335a;
                    byte[] bytes2 = M.f39313p.getBytes(charset);
                    C6496s.g(bytes2, "this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.f39335a;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    C6496s.g(bytes3, "this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.f39337c = false;
                }
                OutputStream outputStream4 = this.f39335a;
                U u10 = U.f71764a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                C6496s.g(format, "format(format, *args)");
                byte[] bytes4 = format.getBytes(C5541d.f65029b);
                C6496s.g(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.f39335a;
            U u11 = U.f71764a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            C6496s.g(format2, "format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, Constants.ENCODING);
            C6496s.g(encode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(C5541d.f65029b);
            C6496s.g(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(bitmap, "bitmap");
            f(str, str, ClipboardModule.MIMETYPE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f39335a);
            i("", new Object[0]);
            k();
            J j10 = this.f39336b;
            if (j10 != null) {
                j10.d("    " + str, "<Image>");
            }
        }

        public final void e(String str, byte[] bArr) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(bArr, "bytes");
            f(str, str, "content/unknown");
            this.f39335a.write(bArr);
            i("", new Object[0]);
            k();
            J j10 = this.f39336b;
            if (j10 != null) {
                U u10 = U.f71764a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                j10.d("    " + str, format);
            }
        }

        public final void f(String str, String str2, String str3) {
            if (!this.f39338d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f39335a;
            U u10 = U.f71764a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format, "format(format, *args)");
            byte[] bytes = format.getBytes(C5541d.f65029b);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String str, Uri uri, String str2) {
            int i10;
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.f39335a instanceof a0) {
                ((a0) this.f39335a).b(W.A(uri));
                i10 = 0;
            } else {
                i10 = W.q(I.l().getContentResolver().openInputStream(uri), this.f39335a);
            }
            i("", new Object[0]);
            k();
            J j10 = this.f39336b;
            if (j10 != null) {
                U u10 = U.f71764a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                j10.d("    " + str, format);
            }
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i10;
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.f39335a;
            if (outputStream instanceof a0) {
                ((a0) outputStream).b(parcelFileDescriptor.getStatSize());
                i10 = 0;
            } else {
                i10 = W.q(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f39335a);
            }
            i("", new Object[0]);
            k();
            J j10 = this.f39336b;
            if (j10 != null) {
                U u10 = U.f71764a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                j10.d("    " + str, format);
            }
        }

        public final void i(String str, Object... objArr) {
            C6496s.h(str, "format");
            C6496s.h(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f39338d) {
                c("\r\n", new Object[0]);
            }
        }

        public final void j(String str, Object obj, M m10) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            OutputStream outputStream = this.f39335a;
            if (outputStream instanceof c0) {
                C6496s.f(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((c0) outputStream).a(m10);
            }
            c cVar = M.f39311n;
            if (cVar.w(obj)) {
                a(str, cVar.C(obj));
            } else if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof f) {
                f fVar = (f) obj;
                Parcelable a10 = fVar.a();
                String mimeType = fVar.getMimeType();
                if (a10 instanceof ParcelFileDescriptor) {
                    h(str, (ParcelFileDescriptor) a10, mimeType);
                } else if (a10 instanceof Uri) {
                    g(str, (Uri) a10, mimeType);
                } else {
                    throw b();
                }
            } else {
                throw b();
            }
        }

        public final void k() {
            if (!this.f39338d) {
                i("--%s", M.f39313p);
                return;
            }
            OutputStream outputStream = this.f39335a;
            byte[] bytes = "&".getBytes(C5541d.f65029b);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection collection) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(jSONArray, "requestJsonArray");
            C6496s.h(collection, "requests");
            OutputStream outputStream = this.f39335a;
            if (!(outputStream instanceof c0)) {
                String jSONArray2 = jSONArray.toString();
                C6496s.g(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
                return;
            }
            C6496s.f(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            c0 c0Var = (c0) outputStream;
            f(str, (String) null, (String) null);
            c("[", new Object[0]);
            Iterator it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                c0Var.a((M) it.next());
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            J j10 = this.f39336b;
            if (j10 != null) {
                String jSONArray3 = jSONArray.toString();
                C6496s.g(jSONArray3, "requestJsonArray.toString()");
                j10.d("    " + str, jSONArray3);
            }
        }
    }

    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f39339a;

        h(ArrayList arrayList) {
            this.f39339a = arrayList;
        }

        public void a(String str, String str2) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(str2, "value");
            ArrayList arrayList = this.f39339a;
            U u10 = U.f71764a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, Constants.ENCODING)}, 2));
            C6496s.g(format, "format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C6496s.g(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < nextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "buffer.toString()");
        f39313p = sb3;
    }

    public M() {
        this((C3286a) null, (String) null, (Bundle) null, (T) null, (b) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    private final boolean A() {
        if (!C6496s.c(I.x(), "instagram.com")) {
            return true;
        }
        return !z();
    }

    public static final M B(C3286a aVar, String str, JSONObject jSONObject, b bVar) {
        return f39311n.A(aVar, str, jSONObject, bVar);
    }

    /* access modifiers changed from: private */
    public final void C(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f39320d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f39322f);
        }
        String str2 = this.f39321e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v10 = v();
        jSONObject.put("relative_url", v10);
        jSONObject.put("method", this.f39327k);
        C3286a aVar = this.f39317a;
        if (aVar != null) {
            J.f47112e.d(aVar.n());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f39323g.keySet()) {
            Object obj = this.f39323g.get(str3);
            if (f39311n.v(obj)) {
                U u10 = U.f71764a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                C6496s.g(format, "format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(com.amazon.a.a.o.b.f.f37529a, arrayList));
        }
        JSONObject jSONObject2 = this.f39319c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f39311n.D(jSONObject2, v10, new h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean M() {
        boolean z10;
        String n10 = n();
        if (n10 != null) {
            z10 = p.O(n10, com.amazon.a.a.o.b.f.f37531c, false, 2, (Object) null);
        } else {
            z10 = false;
        }
        if (n10 != null && p.J(n10, "IG", false, 2, (Object) null) && !z10 && z()) {
            return true;
        }
        if (A() || z10) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void b(b bVar, S s10) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        C6496s.h(s10, "response");
        JSONObject c10 = s10.c();
        if (c10 != null) {
            jSONObject = c10.optJSONObject("__debug__");
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONArray = jSONObject.optJSONArray("messages");
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    str = optJSONObject.optString(MetricTracker.Object.MESSAGE);
                } else {
                    str = null;
                }
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString("type");
                } else {
                    str2 = null;
                }
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString(ActionType.LINK);
                } else {
                    str3 = null;
                }
                if (!(str == null || str2 == null)) {
                    V v10 = V.GRAPH_API_DEBUG_INFO;
                    if (C6496s.c(str2, "warning")) {
                        v10 = V.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!W.e0(str3)) {
                        str = str + " Link: " + str3;
                    }
                    J.a aVar = J.f47112e;
                    String str4 = f39312o;
                    C6496s.g(str4, "TAG");
                    aVar.b(v10, str4, str);
                }
            }
        }
        if (bVar != null) {
            bVar.a(s10);
        }
    }

    private final void i() {
        Bundle bundle = this.f39323g;
        if (M()) {
            bundle.putString("access_token", p());
        } else {
            String n10 = n();
            if (n10 != null) {
                bundle.putString("access_token", n10);
            }
        }
        if (!bundle.containsKey("access_token") && W.e0(I.r())) {
            Log.w(f39312o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (I.I(V.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(com.amazon.a.a.o.b.ar, "info");
        } else if (I.I(V.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(com.amazon.a.a.o.b.ar, "warning");
        }
    }

    private final String j(String str, boolean z10) {
        if (!z10 && this.f39327k == T.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f39323g.keySet()) {
            Object obj = this.f39323g.get(next);
            if (obj == null) {
                obj = "";
            }
            c cVar = f39311n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(next, cVar.C(obj).toString());
            } else if (this.f39327k != T.GET) {
                U u10 = U.f71764a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C6496s.g(builder, "uriBuilder.toString()");
        return builder;
    }

    private final String n() {
        C3286a aVar = this.f39317a;
        if (aVar != null) {
            if (!this.f39323g.containsKey("access_token")) {
                String n10 = aVar.n();
                J.f47112e.d(n10);
                return n10;
            }
        } else if (!this.f39323g.containsKey("access_token")) {
            return p();
        }
        return this.f39323g.getString("access_token");
    }

    private final String p() {
        String m10 = I.m();
        String r10 = I.r();
        if (m10.length() <= 0 || r10.length() <= 0) {
            W.l0(f39312o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return m10 + '|' + r10;
    }

    private final String s() {
        if (f39315r.matcher(this.f39318b).matches()) {
            return this.f39318b;
        }
        U u10 = U.f71764a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f39325i, this.f39318b}, 2));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    private final String y(String str) {
        if (!A()) {
            str = P.f();
        }
        U u10 = U.f71764a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    private final boolean z() {
        if (this.f39318b == null) {
            return false;
        }
        String str = "^/?" + I.m() + "/?.*";
        if (this.f39328l || Pattern.matches(str, this.f39318b) || Pattern.matches("^/?app/?.*", this.f39318b)) {
            return true;
        }
        return false;
    }

    public final void D(C3286a aVar) {
        this.f39317a = aVar;
    }

    public final void E(b bVar) {
        if (I.I(V.GRAPH_API_DEBUG_INFO) || I.I(V.GRAPH_API_DEBUG_WARNING)) {
            this.f39326j = new L(bVar);
        } else {
            this.f39326j = bVar;
        }
    }

    public final void F(boolean z10) {
        this.f39328l = z10;
    }

    public final void G(JSONObject jSONObject) {
        this.f39319c = jSONObject;
    }

    public final void H(String str) {
        this.f39318b = str;
    }

    public final void I(T t10) {
        if (this.f39329m == null || t10 == T.GET) {
            if (t10 == null) {
                t10 = T.GET;
            }
            this.f39327k = t10;
            return;
        }
        throw new C3459v("Can't change HTTP method on request with overridden URL.");
    }

    public final void J(Bundle bundle) {
        C6496s.h(bundle, "<set-?>");
        this.f39323g = bundle;
    }

    public final void K(Object obj) {
        this.f39324h = obj;
    }

    public final void L(String str) {
        this.f39325i = str;
    }

    public final S k() {
        return f39311n.h(this);
    }

    public final P l() {
        return f39311n.n(this);
    }

    public final C3286a m() {
        return this.f39317a;
    }

    public final b o() {
        return this.f39326j;
    }

    public final JSONObject q() {
        return this.f39319c;
    }

    public final String r() {
        return this.f39318b;
    }

    public final T t() {
        return this.f39327k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f39317a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f39318b);
        sb2.append(", graphObject: ");
        sb2.append(this.f39319c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f39327k);
        sb2.append(", parameters: ");
        sb2.append(this.f39323g);
        sb2.append("}");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb3;
    }

    public final Bundle u() {
        return this.f39323g;
    }

    public final String v() {
        if (this.f39329m == null) {
            String y10 = y(P.h());
            i();
            Uri parse = Uri.parse(j(y10, true));
            U u10 = U.f71764a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            C6496s.g(format, "format(format, *args)");
            return format;
        }
        throw new C3459v("Can't override URL for a batch request");
    }

    public final Object w() {
        return this.f39324h;
    }

    public final String x() {
        String str;
        String str2 = this.f39329m;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.f39318b;
        if (this.f39327k != T.POST || str3 == null || !p.u(str3, "/videos", false, 2, (Object) null)) {
            str = P.i(I.x());
        } else {
            str = P.j();
        }
        String y10 = y(str);
        i();
        return j(y10, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ M(com.facebook.C3286a r6, java.lang.String r7, android.os.Bundle r8, com.facebook.T r9, com.facebook.M.b r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.M.<init>(com.facebook.a, java.lang.String, android.os.Bundle, com.facebook.T, com.facebook.M$b, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public M(C3286a aVar, String str, Bundle bundle, T t10, b bVar, String str2) {
        this.f39322f = true;
        this.f39317a = aVar;
        this.f39318b = str;
        this.f39325i = str2;
        E(bVar);
        I(t10);
        if (bundle != null) {
            this.f39323g = new Bundle(bundle);
        } else {
            this.f39323g = new Bundle();
        }
        if (this.f39325i == null) {
            this.f39325i = I.w();
        }
    }
}

package v5;

import Ef.i;
import com.facebook.M;
import com.facebook.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6513L;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import mf.Y;
import o7.J;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import yf.p;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f48750a = new g();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet f48751b = Y.f(200, 202);

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet f48752c = Y.f(503, 504, 429);

    /* renamed from: d  reason: collision with root package name */
    public static a f48753d;

    /* renamed from: e  reason: collision with root package name */
    public static List f48754e;

    /* renamed from: f  reason: collision with root package name */
    private static int f48755f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f48756a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48757b;

        /* renamed from: c  reason: collision with root package name */
        private final String f48758c;

        public a(String str, String str2, String str3) {
            C6496s.h(str, "datasetID");
            C6496s.h(str2, "cloudBridgeURL");
            C6496s.h(str3, "accessKey");
            this.f48756a = str;
            this.f48757b = str2;
            this.f48758c = str3;
        }

        public final String a() {
            return this.f48758c;
        }

        public final String b() {
            return this.f48757b;
        }

        public final String c() {
            return this.f48756a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f48756a, aVar.f48756a) && C6496s.c(this.f48757b, aVar.f48757b) && C6496s.c(this.f48758c, aVar.f48758c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f48756a.hashCode() * 31) + this.f48757b.hashCode()) * 31) + this.f48758c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f48756a + ", cloudBridgeURL=" + this.f48757b + ", accessKey=" + this.f48758c + ')';
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f48759a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(2);
            this.f48759a = list;
        }

        /* access modifiers changed from: private */
        public static final void c(Integer num, List list) {
            C6496s.h(list, "$processedEvents");
            if (!C6565s.e0(g.f48751b, num)) {
                g.f48750a.g(num, list, 5);
            }
        }

        public final void b(String str, Integer num) {
            W.F0(new h(num, this.f48759a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (Integer) obj2);
            return C6514M.f71813a;
        }
    }

    private g() {
    }

    public static final void d(String str, String str2, String str3) {
        C6496s.h(str, "datasetID");
        C6496s.h(str2, "url");
        C6496s.h(str3, "accessKey");
        J.f47112e.c(V.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        g gVar = f48750a;
        gVar.i(new a(str, str2, str3));
        gVar.j(new ArrayList());
    }

    private final List k(M m10) {
        JSONObject q10 = m10.q();
        if (q10 == null) {
            return null;
        }
        Map B10 = O.B(W.o(q10));
        Object w10 = m10.w();
        C6496s.f(w10, "null cannot be cast to non-null type kotlin.Any");
        B10.put("custom_events", w10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : B10.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(B10.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        J.f47112e.c(V.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f48727a.e(B10);
    }

    public static final void l(M m10) {
        C6496s.h(m10, "request");
        W.F0(new f(m10));
    }

    /* access modifiers changed from: private */
    public static final void m(M m10) {
        List list;
        C6496s.h(m10, "$request");
        String r10 = m10.r();
        if (r10 != null) {
            list = Sg.p.F0(r10, new String[]{"/"}, false, 0, 6, (Object) null);
        } else {
            list = null;
        }
        if (list == null || list.size() != 2) {
            J.f47112e.c(V.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", m10);
            return;
        }
        try {
            g gVar = f48750a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List k10 = gVar.k(m10);
            if (k10 != null) {
                gVar.c(k10);
                int min = Math.min(gVar.f().size(), 10);
                List S02 = C6565s.S0(gVar.f(), new i(0, min - 1));
                gVar.f().subList(0, min).clear();
                JSONArray jSONArray = new JSONArray(S02);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("data", jSONArray);
                linkedHashMap.put("accessKey", gVar.e().a());
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                J.a aVar = J.f47112e;
                V v10 = V.APP_EVENTS;
                String jSONObject2 = jSONObject.toString(2);
                C6496s.g(jSONObject2, "jsonBodyStr.toString(2)");
                aVar.c(v10, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, m10, jSONObject2);
                gVar.h(str, "POST", jSONObject.toString(), O.f(C6502A.a("Content-Type", "application/json")), 60000, new b(S02));
            }
        } catch (C6513L e10) {
            J.f47112e.c(V.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List list) {
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() - 1000);
        if (max > 0) {
            List g02 = C6565s.g0(f(), max);
            C6496s.f(g02, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            j(kotlin.jvm.internal.V.c(g02));
        }
    }

    public final a e() {
        a aVar = f48753d;
        if (aVar != null) {
            return aVar;
        }
        C6496s.v("credentials");
        return null;
    }

    public final List f() {
        List list = f48754e;
        if (list != null) {
            return list;
        }
        C6496s.v("transformedEvents");
        return null;
    }

    public final void g(Integer num, List list, int i10) {
        C6496s.h(list, "processedEvents");
        if (!C6565s.e0(f48752c, num)) {
            return;
        }
        if (f48755f >= i10) {
            f().clear();
            f48755f = 0;
            return;
        }
        f().addAll(0, list);
        f48755f++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8 A[Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.Map r9, int r10, yf.p r11) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "CAPITransformerWebRequests"
            java.lang.String r2 = "urlStr"
            kotlin.jvm.internal.C6496s.h(r6, r2)
            java.lang.String r2 = "requestMethod"
            kotlin.jvm.internal.C6496s.h(r7, r2)
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r3.<init>(r6)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.net.URLConnection r6 = r3.openConnection()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Object r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r6)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.C6496s.f(r6, r3)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r6.setRequestMethod(r7)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r9 == 0) goto L_0x0052
            java.util.Set r7 = r9.keySet()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r7 == 0) goto L_0x0052
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
        L_0x0036:
            boolean r3 = r7.hasNext()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r7.next()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Object r4 = r9.get(r3)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r6.setRequestProperty(r3, r4)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            goto L_0x0036
        L_0x004c:
            r6 = move-exception
            goto L_0x00fa
        L_0x004f:
            r6 = move-exception
            goto L_0x010c
        L_0x0052:
            java.lang.String r7 = r6.getRequestMethod()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r9 = "POST"
            boolean r7 = r7.equals(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r7 != 0) goto L_0x006d
            java.lang.String r7 = r6.getRequestMethod()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r9 = "PUT"
            boolean r7 = r7.equals(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r7 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r7 = 0
            goto L_0x006e
        L_0x006d:
            r7 = 1
        L_0x006e:
            r6.setDoOutput(r7)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r6.setConnectTimeout(r10)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.OutputStream r9 = r6.getOutputStream()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r7.<init>(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.BufferedWriter r9 = new java.io.BufferedWriter     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r10.<init>(r7, r0)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r9.<init>(r10)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r9.write(r8)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r9.flush()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r9.close()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r7.close()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r7.<init>()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.util.HashSet r8 = f48751b     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            int r9 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            boolean r8 = r8.contains(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r8 == 0) goto L_0x00ce
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.io.InputStream r10 = r6.getInputStream()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r9.<init>(r10, r0)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r8.<init>(r9)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
        L_0x00b6:
            java.lang.String r9 = r8.readLine()     // Catch:{ all -> 0x00c0 }
            if (r9 == 0) goto L_0x00c2
            r7.append(r9)     // Catch:{ all -> 0x00c0 }
            goto L_0x00b6
        L_0x00c0:
            r6 = move-exception
            goto L_0x00c8
        L_0x00c2:
            lf.M r9 = lf.C6514M.f71813a     // Catch:{ all -> 0x00c0 }
            wf.C6763c.a(r8, r2)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            goto L_0x00ce
        L_0x00c8:
            throw r6     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r7 = move-exception
            wf.C6763c.a(r8, r6)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            throw r7     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
        L_0x00ce:
            java.lang.String r7 = r7.toString()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r8 = "connResponseSB.toString()"
            kotlin.jvm.internal.C6496s.g(r7, r8)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            o7.J$a r8 = o7.J.f47112e     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            com.facebook.V r9 = com.facebook.V.APP_EVENTS     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.String r10 = "\nResponse Received: \n%s\n%s"
            int r0 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r8.c(r9, r1, r10, r0)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            if (r11 == 0) goto L_0x0128
            int r6 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            r11.invoke(r7, r6)     // Catch:{ UnknownHostException -> 0x004f, IOException -> 0x004c }
            goto L_0x0128
        L_0x00fa:
            o7.J$a r7 = o7.J.f47112e
            com.facebook.V r8 = com.facebook.V.DEVELOPER_ERRORS
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r9 = "Send to server failed: \n%s"
            r7.c(r8, r1, r9, r6)
            goto L_0x0128
        L_0x010c:
            o7.J$a r7 = o7.J.f47112e
            com.facebook.V r8 = com.facebook.V.APP_EVENTS
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r9 = "Connection failed, retrying: \n%s"
            r7.c(r8, r1, r9, r6)
            if (r11 == 0) goto L_0x0128
            r6 = 503(0x1f7, float:7.05E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.invoke(r2, r6)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.g.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, yf.p):void");
    }

    public final void i(a aVar) {
        C6496s.h(aVar, "<set-?>");
        f48753d = aVar;
    }

    public final void j(List list) {
        C6496s.h(list, "<set-?>");
        f48754e = list;
    }
}

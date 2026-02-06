package He;

import Fe.C3016e;
import Fe.C3023l;
import Fe.E;
import He.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final C3016e f31732a;

    /* renamed from: b  reason: collision with root package name */
    private int f31733b = -1;

    /* renamed from: c  reason: collision with root package name */
    private String f31734c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f31735d = "";

    /* renamed from: e  reason: collision with root package name */
    private E f31736e;

    /* renamed from: f  reason: collision with root package name */
    private int f31737f;

    public b(C3016e eVar) {
        this.f31732a = eVar;
        E G10 = E.G(eVar.M());
        this.f31736e = G10;
        this.f31737f = G10.W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        Fe.C3023l.b(j(r0, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0179, code lost:
        r3.disconnect();
        l();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:53:0x00ee, B:58:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a A[SYNTHETIC, Splitter:B:58:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a A[SYNTHETIC, Splitter:B:67:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a A[SYNTHETIC, Splitter:B:72:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015a A[SYNTHETIC, Splitter:B:81:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private He.a.b h(java.lang.String r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "?"
            Fe.e r1 = r8.f31732a
            android.content.Context r1 = r1.M()
            Fe.E r1 = Fe.E.G(r1)
            r2 = -113(0xffffffffffffff8f, float:NaN)
            r3 = 0
            int r4 = r1.c0()     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            int r5 = r1.u()     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            boolean r6 = r9.contains(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            if (r6 == 0) goto L_0x002f
            java.lang.String r0 = "&"
            goto L_0x002f
        L_0x0020:
            r9 = move-exception
            goto L_0x0177
        L_0x0023:
            r0 = move-exception
            goto L_0x00ee
        L_0x0026:
            r0 = move-exception
            goto L_0x00ff
        L_0x0029:
            r0 = move-exception
            goto L_0x0136
        L_0x002c:
            r0 = move-exception
            goto L_0x0166
        L_0x002f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r6.<init>()     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r6.append(r9)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r6.append(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.lang.String r0 = "retryNumber"
            r6.append(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.lang.String r0 = "="
            r6.append(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r6.append(r10)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.lang.String r0 = r6.toString()     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.net.URL r6 = new java.net.URL     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r6.<init>(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ SocketException -> 0x002c, SocketTimeoutException -> 0x0029, InterruptedIOException -> 0x0026, IOException -> 0x0023 }
            r0.setConnectTimeout(r5)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r0.setReadTimeout(r4)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            Fe.w r4 = Fe.C3033w.RequestId     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            java.lang.String r4 = r4.b()     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            java.lang.String r4 = r0.getHeaderField(r4)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            int r5 = r0.getResponseCode()     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L_0x00ad
            int r6 = r8.f31737f     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            if (r10 >= r6) goto L_0x00ad
            int r3 = r1.X()     // Catch:{ InterruptedException -> 0x0098 }
            long r3 = (long) r3     // Catch:{ InterruptedException -> 0x0098 }
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0098 }
            goto L_0x00a0
        L_0x0081:
            r9 = move-exception
            r3 = r0
            goto L_0x0177
        L_0x0085:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x00ee
        L_0x0089:
            r2 = move-exception
            r3 = r0
            r0 = r2
            goto L_0x00ff
        L_0x008e:
            r2 = move-exception
            r3 = r0
            r0 = r2
            goto L_0x0136
        L_0x0093:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x0166
        L_0x0098:
            r3 = move-exception
            java.lang.String r3 = r8.j(r3, r9, r10)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            Fe.C3023l.b(r3)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
        L_0x00a0:
            int r10 = r10 + 1
            He.a$b r9 = r8.h(r9, r10)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r0.disconnect()
            r8.l()
            return r9
        L_0x00ad:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x00c7
            java.io.InputStream r6 = r0.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00c5 }
            if (r6 == 0) goto L_0x00c7
            He.a$b r6 = new He.a$b     // Catch:{ FileNotFoundException -> 0x00c5 }
            java.io.InputStream r7 = r0.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00c5 }
            java.lang.String r7 = r8.k(r7)     // Catch:{ FileNotFoundException -> 0x00c5 }
            r6.<init>(r7, r5)     // Catch:{ FileNotFoundException -> 0x00c5 }
            goto L_0x00e1
        L_0x00c5:
            r6 = move-exception
            goto L_0x00d5
        L_0x00c7:
            He.a$b r6 = new He.a$b     // Catch:{ FileNotFoundException -> 0x00c5 }
            java.io.InputStream r7 = r0.getInputStream()     // Catch:{ FileNotFoundException -> 0x00c5 }
            java.lang.String r7 = r8.k(r7)     // Catch:{ FileNotFoundException -> 0x00c5 }
            r6.<init>(r7, r5)     // Catch:{ FileNotFoundException -> 0x00c5 }
            goto L_0x00e1
        L_0x00d5:
            java.lang.String r6 = r8.j(r6, r9, r10)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            Fe.C3023l.b(r6)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            He.a$b r6 = new He.a$b     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r6.<init>(r3, r5)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
        L_0x00e1:
            java.lang.String r3 = Ea.p.a(r4)     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r6.f31731c = r3     // Catch:{ SocketException -> 0x0093, SocketTimeoutException -> 0x008e, InterruptedIOException -> 0x0089, IOException -> 0x0085, all -> 0x0081 }
            r0.disconnect()
            r8.l()
            return r6
        L_0x00ee:
            java.lang.String r9 = r8.j(r0, r9, r10)     // Catch:{ all -> 0x0020 }
            Fe.C3023l.b(r9)     // Catch:{ all -> 0x0020 }
            He.a$a r9 = new He.a$a     // Catch:{ all -> 0x0020 }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x0020 }
            r9.<init>(r2, r10)     // Catch:{ all -> 0x0020 }
            throw r9     // Catch:{ all -> 0x0020 }
        L_0x00ff:
            java.lang.String r2 = r8.j(r0, r9, r10)     // Catch:{ all -> 0x0020 }
            Fe.C3023l.b(r2)     // Catch:{ all -> 0x0020 }
            int r2 = r8.f31737f     // Catch:{ all -> 0x0020 }
            if (r10 >= r2) goto L_0x012a
            int r0 = r1.X()     // Catch:{ InterruptedException -> 0x0113 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0113 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0113 }
            goto L_0x011b
        L_0x0113:
            r0 = move-exception
            java.lang.String r0 = r8.j(r0, r9, r10)     // Catch:{ all -> 0x0020 }
            Fe.C3023l.b(r0)     // Catch:{ all -> 0x0020 }
        L_0x011b:
            int r10 = r10 + 1
            He.a$b r9 = r8.h(r9, r10)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0129
            r3.disconnect()
            r8.l()
        L_0x0129:
            return r9
        L_0x012a:
            He.a$a r9 = new He.a$a     // Catch:{ all -> 0x0020 }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x0020 }
            r0 = -120(0xffffffffffffff88, float:NaN)
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0020 }
            throw r9     // Catch:{ all -> 0x0020 }
        L_0x0136:
            int r2 = r8.f31737f     // Catch:{ all -> 0x0020 }
            if (r10 >= r2) goto L_0x015a
            int r0 = r1.X()     // Catch:{ InterruptedException -> 0x0143 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0143 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0143 }
            goto L_0x014b
        L_0x0143:
            r0 = move-exception
            java.lang.String r0 = r8.j(r0, r9, r10)     // Catch:{ all -> 0x0020 }
            Fe.C3023l.b(r0)     // Catch:{ all -> 0x0020 }
        L_0x014b:
            int r10 = r10 + 1
            He.a$b r9 = r8.h(r9, r10)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0159
            r3.disconnect()
            r8.l()
        L_0x0159:
            return r9
        L_0x015a:
            He.a$a r9 = new He.a$a     // Catch:{ all -> 0x0020 }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x0020 }
            r0 = -111(0xffffffffffffff91, float:NaN)
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0020 }
            throw r9     // Catch:{ all -> 0x0020 }
        L_0x0166:
            java.lang.String r9 = r8.j(r0, r9, r10)     // Catch:{ all -> 0x0020 }
            Fe.C3023l.b(r9)     // Catch:{ all -> 0x0020 }
            He.a$a r9 = new He.a$a     // Catch:{ all -> 0x0020 }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x0020 }
            r9.<init>(r2, r10)     // Catch:{ all -> 0x0020 }
            throw r9     // Catch:{ all -> 0x0020 }
        L_0x0177:
            if (r3 == 0) goto L_0x017f
            r3.disconnect()
            r8.l()
        L_0x017f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: He.b.h(java.lang.String, int):He.a$b");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026f, code lost:
        throw new He.a.C0520a(-121, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0270, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0271, code lost:
        r2 = r0;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027f, code lost:
        throw new He.a.C0520a(-122, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        java.lang.Thread.sleep((long) r6.X());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0295, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0297, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        Fe.C3023l.b(j(r0, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a8, code lost:
        r10.disconnect();
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02af, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ba, code lost:
        throw new He.a.C0520a(-113, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02bc, code lost:
        r5 = r3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        java.lang.Thread.sleep((long) r6.X());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d6, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        Fe.C3023l.b(j(r0, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02de, code lost:
        r2 = i(r2, r5, r4 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e3, code lost:
        if (r10 != null) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e5, code lost:
        r10.disconnect();
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02eb, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ec, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f7, code lost:
        throw new He.a.C0520a(-120, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f9, code lost:
        r5 = r3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        java.lang.Thread.sleep((long) r6.X());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0312, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0314, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        Fe.C3023l.b(j(r0, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x031c, code lost:
        r2 = i(r2, r5, r4 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0321, code lost:
        if (r10 != null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0323, code lost:
        r10.disconnect();
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0329, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x032a, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0335, code lost:
        throw new He.a.C0520a(-111, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0338, code lost:
        r10.disconnect();
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        r2 = r0;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        r3 = r0;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        r3 = r0;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        r5 = r18;
        r3 = r0;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d1, code lost:
        r5 = r18;
        r3 = r0;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0236, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0237, code lost:
        r2 = r0;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023d, code lost:
        r10 = null;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0241, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0242, code lost:
        r10 = null;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025f, code lost:
        Fe.C3023l.b("Cannot make network request on main thread.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:96:0x0254, B:107:0x028b] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0274 A[Catch:{ InterruptedException -> 0x0295, all -> 0x0270 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b A[SYNTHETIC, Splitter:B:107:0x028b] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02af A[SYNTHETIC, Splitter:B:118:0x02af] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ca A[SYNTHETIC, Splitter:B:125:0x02ca] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ec A[SYNTHETIC, Splitter:B:136:0x02ec] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0308 A[SYNTHETIC, Splitter:B:143:0x0308] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x032a A[SYNTHETIC, Splitter:B:154:0x032a] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:27:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5 A[ExcHandler: Exception (r0v18 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:27:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba A[ExcHandler: IOException (r0v17 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:27:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0236 A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:6:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023c A[ExcHandler: Exception (r0v9 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0241 A[ExcHandler: IOException (r0v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:6:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x025f A[Catch:{ InterruptedException -> 0x0295, all -> 0x0270 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private He.a.b i(java.lang.String r17, org.json.JSONObject r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            java.lang.String r5 = "application/json"
            Fe.e r6 = r1.f31732a
            android.content.Context r6 = r6.M()
            Fe.E r6 = Fe.E.G(r6)
            int r7 = r6.c0()
            int r8 = r6.u()
            java.lang.String r9 = "retryNumber"
            r3.put(r9, r4)     // Catch:{ JSONException -> 0x0022 }
            goto L_0x0050
        L_0x0022:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Caught JSONException, retry number: "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = " "
            r10.append(r11)
            java.lang.String r11 = r9.getMessage()
            r10.append(r11)
            java.lang.String r11 = " stacktrace: "
            r10.append(r11)
            java.lang.String r9 = Fe.C3023l.j(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            Fe.C3023l.b(r9)
        L_0x0050:
            r9 = 1
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x02f8, InterruptedIOException -> 0x02bb, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            r12 = 26
            if (r11 < r12) goto L_0x0078
            r11 = 102(0x66, float:1.43E-43)
            android.net.TrafficStats.setThreadStatsTag(r11)     // Catch:{ SocketTimeoutException -> 0x0072, InterruptedIOException -> 0x006c, IOException -> 0x0067, Exception -> 0x0062, all -> 0x005d }
            goto L_0x0078
        L_0x005d:
            r0 = move-exception
            r2 = r0
            r10 = 0
            goto L_0x0336
        L_0x0062:
            r0 = move-exception
            r3 = r0
            r10 = 0
            goto L_0x0254
        L_0x0067:
            r0 = move-exception
            r3 = r0
            r10 = 0
            goto L_0x0280
        L_0x006c:
            r0 = move-exception
            r5 = r3
            r10 = 0
        L_0x006f:
            r3 = r0
            goto L_0x02bf
        L_0x0072:
            r0 = move-exception
            r5 = r3
            r10 = 0
        L_0x0075:
            r3 = r0
            goto L_0x02fd
        L_0x0078:
            java.net.URL r11 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            r11.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            java.lang.Object r11 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r11)     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            java.net.URLConnection r11 = (java.net.URLConnection) r11     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ SocketTimeoutException -> 0x024d, InterruptedIOException -> 0x0246, IOException -> 0x0241, Exception -> 0x023c, all -> 0x0236 }
            r11.setConnectTimeout(r8)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.setReadTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.setDoInput(r9)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.setDoOutput(r9)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            Fe.y r7 = Fe.y.QRCodeTag     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r8 = r7.b()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            boolean r8 = r2.contains(r8)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r12 = "Accept"
            java.lang.String r13 = "Content-Type"
            if (r8 == 0) goto L_0x00c7
            java.lang.String r5 = "application/x-www-form-urlencoded"
            r11.setRequestProperty(r13, r5)     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r5 = "image/*"
            r11.setRequestProperty(r12, r5)     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            goto L_0x00cd
        L_0x00b0:
            r0 = move-exception
            r2 = r0
            r10 = r11
            goto L_0x0336
        L_0x00b5:
            r0 = move-exception
            r3 = r0
            r10 = r11
            goto L_0x0254
        L_0x00ba:
            r0 = move-exception
            r3 = r0
            r10 = r11
            goto L_0x0280
        L_0x00bf:
            r0 = move-exception
            r5 = r3
            r10 = r11
            goto L_0x006f
        L_0x00c3:
            r0 = move-exception
            r5 = r3
            r10 = r11
            goto L_0x0075
        L_0x00c7:
            r11.setRequestProperty(r13, r5)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.setRequestProperty(r12, r5)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
        L_0x00cd:
            java.lang.String r5 = "POST"
            r11.setRequestMethod(r5)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.io.OutputStream r8 = r11.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r5.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r8 = r18.toString()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r5.write(r8)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r5.flush()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r5.close()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            Fe.w r5 = Fe.C3033w.RequestId     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r5 = r5.b()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r5 = r11.getHeaderField(r5)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r1.f31735d = r5     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            int r8 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r1.f31733b = r8     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r12 = r11.getResponseMessage()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r1.f31734c = r12     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r12.<init>()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r13 = "lastResponseMessage "
            r12.append(r13)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r13 = r1.f31734c     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r12.append(r13)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            java.lang.String r12 = r12.toString()     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            Fe.C3023l.a(r12)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r12 = 500(0x1f4, float:7.0E-43)
            if (r8 < r12) goto L_0x013d
            int r12 = r1.f31737f     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            if (r4 >= r12) goto L_0x013d
            int r5 = r6.X()     // Catch:{ InterruptedException -> 0x0127 }
            long r7 = (long) r5     // Catch:{ InterruptedException -> 0x0127 }
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x0127 }
            goto L_0x0130
        L_0x0127:
            r0 = move-exception
            r5 = r0
            java.lang.String r5 = r1.j(r5, r2, r4)     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            Fe.C3023l.b(r5)     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
        L_0x0130:
            int r4 = r4 + 1
            He.a$b r2 = r1.i(r2, r3, r4)     // Catch:{ SocketTimeoutException -> 0x00c3, InterruptedIOException -> 0x00bf, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.disconnect()
            r16.l()
            return r2
        L_0x013d:
            r12 = 200(0xc8, float:2.8E-43)
            java.lang.String r13 = "\nObject: "
            java.lang.String r14 = "\nRetry number: "
            java.lang.String r15 = "\nResponse Message: "
            java.lang.String r9 = "\nResponse Code: "
            if (r8 == r12) goto L_0x019c
            java.io.InputStream r12 = r11.getErrorStream()     // Catch:{ FileNotFoundException -> 0x0198 }
            if (r12 == 0) goto L_0x019c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r12 = "Branch Networking Error: \nURL: "
            r7.append(r12)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r2)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            int r9 = r1.f31733b     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r15)     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r9 = r1.f31734c     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r14)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r4)     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r9 = "\nFinal attempt: true\nrequestId: "
            r7.append(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r9 = r1.f31735d     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r13)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.append(r1)     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x0198 }
            Fe.C3023l.b(r7)     // Catch:{ FileNotFoundException -> 0x0198 }
            He.a$b r7 = new He.a$b     // Catch:{ FileNotFoundException -> 0x0198 }
            java.io.InputStream r9 = r11.getErrorStream()     // Catch:{ FileNotFoundException -> 0x0198 }
            java.lang.String r9 = r1.k(r9)     // Catch:{ FileNotFoundException -> 0x0198 }
            r7.<init>(r9, r8)     // Catch:{ FileNotFoundException -> 0x0198 }
            goto L_0x022d
        L_0x0198:
            r0 = move-exception
            r3 = r0
            goto L_0x0220
        L_0x019c:
            java.lang.String r7 = r7.b()     // Catch:{  }
            boolean r7 = r2.contains(r7)     // Catch:{  }
            if (r7 == 0) goto L_0x01d7
            java.io.InputStream r7 = r11.getInputStream()     // Catch:{  }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{  }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{  }
            r12.<init>()     // Catch:{  }
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
            r3 = 100
            r7.compress(r10, r3, r12)     // Catch:{  }
            byte[] r3 = r12.toByteArray()     // Catch:{  }
            r7 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r7)     // Catch:{  }
            He.a$b r7 = new He.a$b     // Catch:{  }
            r7.<init>(r3, r8)     // Catch:{  }
            goto L_0x01e5
        L_0x01c9:
            r0 = move-exception
            r5 = r18
            r3 = r0
            r10 = r11
            goto L_0x02bf
        L_0x01d0:
            r0 = move-exception
            r5 = r18
            r3 = r0
            r10 = r11
            goto L_0x02fd
        L_0x01d7:
            He.a$b r3 = new He.a$b     // Catch:{  }
            java.io.InputStream r7 = r11.getInputStream()     // Catch:{  }
            java.lang.String r7 = r1.k(r7)     // Catch:{  }
            r3.<init>(r7, r8)     // Catch:{  }
            r7 = r3
        L_0x01e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
            r3.<init>()     // Catch:{  }
            java.lang.String r10 = "Branch Networking Success\nURL: "
            r3.append(r10)     // Catch:{  }
            r3.append(r2)     // Catch:{  }
            r3.append(r9)     // Catch:{  }
            int r9 = r1.f31733b     // Catch:{  }
            r3.append(r9)     // Catch:{  }
            r3.append(r15)     // Catch:{  }
            java.lang.String r9 = r1.f31734c     // Catch:{  }
            r3.append(r9)     // Catch:{  }
            r3.append(r14)     // Catch:{  }
            r3.append(r4)     // Catch:{  }
            java.lang.String r9 = "\nrequestId: "
            r3.append(r9)     // Catch:{  }
            java.lang.String r9 = r1.f31735d     // Catch:{  }
            r3.append(r9)     // Catch:{  }
            r3.append(r13)     // Catch:{  }
            r3.append(r1)     // Catch:{  }
            java.lang.String r3 = r3.toString()     // Catch:{  }
            Fe.C3023l.l(r3)     // Catch:{  }
            goto L_0x022d
        L_0x0220:
            java.lang.String r3 = r1.j(r3, r2, r4)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            Fe.C3023l.b(r3)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            He.a$b r7 = new He.a$b     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r3 = 0
            r7.<init>(r3, r8)     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
        L_0x022d:
            r7.f31731c = r5     // Catch:{ SocketTimeoutException -> 0x01d0, InterruptedIOException -> 0x01c9, IOException -> 0x00ba, Exception -> 0x00b5, all -> 0x00b0 }
            r11.disconnect()
            r16.l()
            return r7
        L_0x0236:
            r0 = move-exception
            r3 = 0
            r2 = r0
            r10 = r3
            goto L_0x0336
        L_0x023c:
            r0 = move-exception
            r3 = 0
            r10 = r3
            r3 = r0
            goto L_0x0254
        L_0x0241:
            r0 = move-exception
            r3 = 0
            r10 = r3
            r3 = r0
            goto L_0x0280
        L_0x0246:
            r0 = move-exception
            r3 = 0
            r5 = r18
        L_0x024a:
            r10 = r3
            goto L_0x006f
        L_0x024d:
            r0 = move-exception
            r3 = 0
            r5 = r18
        L_0x0251:
            r10 = r3
            goto L_0x0075
        L_0x0254:
            java.lang.String r2 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r2)     // Catch:{ all -> 0x0270 }
            boolean r2 = r3 instanceof android.os.NetworkOnMainThreadException     // Catch:{ all -> 0x0270 }
            if (r2 == 0) goto L_0x0274
            java.lang.String r2 = "Cannot make network request on main thread."
            Fe.C3023l.b(r2)     // Catch:{ all -> 0x0270 }
            He.a$a r2 = new He.a$a     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            r4 = -121(0xffffffffffffff87, float:NaN)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0270 }
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            r2 = r0
            goto L_0x0336
        L_0x0274:
            He.a$a r2 = new He.a$a     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            r4 = -122(0xffffffffffffff86, float:NaN)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0270 }
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x0280:
            java.lang.String r5 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r5)     // Catch:{ all -> 0x0270 }
            int r5 = r1.f31737f     // Catch:{ all -> 0x0270 }
            if (r4 >= r5) goto L_0x02af
            int r3 = r6.X()     // Catch:{ InterruptedException -> 0x0295 }
            long r5 = (long) r3     // Catch:{ InterruptedException -> 0x0295 }
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x0295 }
        L_0x0293:
            r3 = 1
            goto L_0x029f
        L_0x0295:
            r0 = move-exception
            r3 = r0
            java.lang.String r3 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r3)     // Catch:{ all -> 0x0270 }
            goto L_0x0293
        L_0x029f:
            int r4 = r4 + r3
            r5 = r18
            He.a$b r2 = r1.i(r2, r5, r4)     // Catch:{ all -> 0x0270 }
            if (r10 == 0) goto L_0x02ae
            r10.disconnect()
            r16.l()
        L_0x02ae:
            return r2
        L_0x02af:
            He.a$a r2 = new He.a$a     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            r4 = -113(0xffffffffffffff8f, float:NaN)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0270 }
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x02bb:
            r0 = move-exception
            r5 = r3
            r3 = 0
            goto L_0x024a
        L_0x02bf:
            java.lang.String r7 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r7)     // Catch:{ all -> 0x0270 }
            int r7 = r1.f31737f     // Catch:{ all -> 0x0270 }
            if (r4 >= r7) goto L_0x02ec
            int r3 = r6.X()     // Catch:{ InterruptedException -> 0x02d4 }
            long r6 = (long) r3     // Catch:{ InterruptedException -> 0x02d4 }
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x02d4 }
        L_0x02d2:
            r3 = 1
            goto L_0x02de
        L_0x02d4:
            r0 = move-exception
            r3 = r0
            java.lang.String r3 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r3)     // Catch:{ all -> 0x0270 }
            goto L_0x02d2
        L_0x02de:
            int r4 = r4 + r3
            He.a$b r2 = r1.i(r2, r5, r4)     // Catch:{ all -> 0x0270 }
            if (r10 == 0) goto L_0x02eb
            r10.disconnect()
            r16.l()
        L_0x02eb:
            return r2
        L_0x02ec:
            He.a$a r2 = new He.a$a     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            r4 = -120(0xffffffffffffff88, float:NaN)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0270 }
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x02f8:
            r0 = move-exception
            r5 = r3
            r3 = 0
            goto L_0x0251
        L_0x02fd:
            java.lang.String r7 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r7)     // Catch:{ all -> 0x0270 }
            int r7 = r1.f31737f     // Catch:{ all -> 0x0270 }
            if (r4 >= r7) goto L_0x032a
            int r3 = r6.X()     // Catch:{ InterruptedException -> 0x0312 }
            long r6 = (long) r3     // Catch:{ InterruptedException -> 0x0312 }
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x0312 }
        L_0x0310:
            r3 = 1
            goto L_0x031c
        L_0x0312:
            r0 = move-exception
            r3 = r0
            java.lang.String r3 = r1.j(r3, r2, r4)     // Catch:{ all -> 0x0270 }
            Fe.C3023l.b(r3)     // Catch:{ all -> 0x0270 }
            goto L_0x0310
        L_0x031c:
            int r4 = r4 + r3
            He.a$b r2 = r1.i(r2, r5, r4)     // Catch:{ all -> 0x0270 }
            if (r10 == 0) goto L_0x0329
            r10.disconnect()
            r16.l()
        L_0x0329:
            return r2
        L_0x032a:
            He.a$a r2 = new He.a$a     // Catch:{ all -> 0x0270 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0270 }
            r4 = -111(0xffffffffffffff91, float:NaN)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0270 }
            throw r2     // Catch:{ all -> 0x0270 }
        L_0x0336:
            if (r10 == 0) goto L_0x033e
            r10.disconnect()
            r16.l()
        L_0x033e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: He.b.i(java.lang.String, org.json.JSONObject, int):He.a$b");
    }

    private String k(InputStream inputStream) {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                    } else {
                        bufferedReader.close();
                        return sb2.toString();
                    }
                }
            } catch (IOException e10) {
                C3023l.a(e10.getMessage());
            }
        }
        return null;
    }

    private void l() {
        this.f31735d = "";
        this.f31733b = -1;
        this.f31734c = "";
    }

    public a.b c(String str) {
        return h(str, 0);
    }

    public a.b d(String str, JSONObject jSONObject) {
        return i(str, jSONObject, 0);
    }

    /* access modifiers changed from: package-private */
    public String j(Exception exc, String str, int i10) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Branch Networking Error: \nURL: ");
        sb2.append(str);
        sb2.append("\nResponse Code: ");
        sb2.append(this.f31733b);
        sb2.append("\nResponse Message: ");
        sb2.append(this.f31734c);
        sb2.append("\nCaught exception type: ");
        sb2.append(exc.getClass().getCanonicalName());
        sb2.append("\nRetry number: ");
        sb2.append(i10);
        sb2.append("\nrequestId: ");
        sb2.append(this.f31735d);
        sb2.append("\nFinal attempt: ");
        if (i10 >= this.f31737f) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append("\nObject: ");
        sb2.append(this);
        sb2.append("\nException Message: ");
        sb2.append(exc.getMessage());
        sb2.append("\nStacktrace: ");
        sb2.append(C3023l.j(exc));
        return sb2.toString();
    }
}

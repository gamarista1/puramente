package Fe;

import android.content.Context;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class X {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static JSONObject f31010c;

    /* renamed from: d  reason: collision with root package name */
    private static X f31011d;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f31012a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f31013b;

    private static class b extends C3018g {

        /* renamed from: a  reason: collision with root package name */
        private final E f31014a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31015b;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
            if (r1 != null) goto L_0x0071;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.json.JSONObject doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                r8 = 0
                android.net.TrafficStats.setThreadStatsTag(r8)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                r0 = 0
                java.lang.String r1 = "%sdk/uriskiplist_v#.json"
                java.lang.String r2 = "%"
                java.lang.String r3 = Fe.E.t()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = Fe.X.f31010c     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x006f }
                r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x006f }
                int r0 = r1.getResponseCode()     // Catch:{ Exception -> 0x006f }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x0071
                java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x006f }
                if (r0 == 0) goto L_0x0071
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x006f }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x006f }
                java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x006f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x006f }
                r0.<init>(r2)     // Catch:{ Exception -> 0x006f }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x006f }
                java.lang.String r0 = r0.readLine()     // Catch:{ Exception -> 0x006f }
                r2.<init>(r0)     // Catch:{ Exception -> 0x006f }
                r8 = r2
                goto L_0x0071
            L_0x006c:
                r8 = move-exception
                r0 = r1
                goto L_0x0086
            L_0x006f:
                r0 = move-exception
                goto L_0x007b
            L_0x0071:
                r1.disconnect()
                goto L_0x0085
            L_0x0075:
                r8 = move-exception
                goto L_0x0086
            L_0x0077:
                r1 = move-exception
                r6 = r1
                r1 = r0
                r0 = r6
            L_0x007b:
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x006c }
                Fe.C3023l.a(r0)     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x0085
                goto L_0x0071
            L_0x0085:
                return r8
            L_0x0086:
                if (r0 == 0) goto L_0x008b
                r0.disconnect()
            L_0x008b:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Fe.X.b.doInBackground(java.lang.Void[]):org.json.JSONObject");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(JSONObject jSONObject) {
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt(DiagnosticsEntry.VERSION_KEY) > X.f31010c.optInt(DiagnosticsEntry.VERSION_KEY)) {
                JSONObject unused = X.f31010c = jSONObject;
                this.f31014a.b1("skip_url_format_key", X.f31010c.toString());
            }
        }

        private b(Context context) {
            this.f31015b = 1500;
            this.f31014a = E.G(context);
        }
    }

    private X(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.f31013b = jSONObject;
        try {
            jSONObject.putOpt(DiagnosticsEntry.VERSION_KEY, 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:((?!campaign_ids).)*$");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException e10) {
            C3023l.a(e10.getMessage());
        }
        f31010c = f(context);
        this.f31012a = new ArrayList();
    }

    public static X d(Context context) {
        if (f31011d == null) {
            f31011d = new X(context);
        }
        return f31011d;
    }

    private JSONObject f(Context context) {
        E G10 = E.G(context);
        JSONObject jSONObject = new JSONObject();
        String a02 = G10.a0("skip_url_format_key");
        if (TextUtils.isEmpty(a02) || "bnc_no_value".equals(a02)) {
            return this.f31013b;
        }
        try {
            return new JSONObject(a02);
        } catch (JSONException e10) {
            C3023l.a(e10.getMessage());
            return jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Context context) {
        try {
            new b(context).a(new Void[0]);
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public String e(String str) {
        String str2;
        try {
            JSONArray optJSONArray = f31010c.optJSONArray("uri_skip_list");
            if (optJSONArray != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= optJSONArray.length()) {
                        break;
                    }
                    try {
                        str2 = optJSONArray.getString(i10);
                        if (Pattern.compile(str2).matcher(str).find()) {
                            break;
                        }
                        i10++;
                    } catch (JSONException e10) {
                        C3023l.a(e10.getMessage());
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.f31012a.size() <= 0) {
                    return str;
                }
                Iterator it = this.f31012a.iterator();
                while (it.hasNext()) {
                    if (str.matches((String) it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused) {
            return str;
        }
    }
}

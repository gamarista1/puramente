package He;

import Fe.C3016e;
import Fe.C3023l;
import Fe.N;
import Fe.Q;
import Fe.y;
import com.amazon.a.a.o.b.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: He.a$a  reason: collision with other inner class name */
    public static class C0520a extends Exception {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f31727a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f31728b;

        public C0520a(int i10, String str) {
            this.f31727a = i10;
            this.f31728b = str;
        }
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f31729a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f31730b;

        /* renamed from: c  reason: collision with root package name */
        String f31731c;

        public b(String str, int i10) {
            this.f31729a = str;
            this.f31730b = i10;
        }
    }

    private boolean a(JSONObject jSONObject, String str) {
        C3023l.l("addCommonParams post: " + jSONObject + " key: " + str);
        try {
            if (!jSONObject.has(y.UserData.b())) {
                String b10 = y.SDK.b();
                jSONObject.put(b10, "android" + C3016e.e0());
            }
            if (str.equals("bnc_no_value")) {
                return false;
            }
            jSONObject.put(y.BranchKey.b(), str);
            return true;
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
            return false;
        }
    }

    private String b(JSONObject jSONObject) {
        JSONArray names;
        StringBuilder sb2 = new StringBuilder();
        if (!(jSONObject == null || (names = jSONObject.names()) == null)) {
            int length = names.length();
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                try {
                    String string = names.getString(i10);
                    if (z10) {
                        sb2.append("?");
                        z10 = false;
                    } else {
                        sb2.append("&");
                    }
                    String string2 = jSONObject.getString(string);
                    sb2.append(string);
                    sb2.append(f.f37530b);
                    sb2.append(string2);
                    i10++;
                } catch (JSONException e10) {
                    C3023l.m("Caught JSONException " + e10.getMessage());
                    return null;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Fe.Q g(He.a.b r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = r4.f31729a
            int r4 = r4.f31730b
            Fe.Q r1 = new Fe.Q
            java.lang.String r2 = ""
            r1.<init>(r5, r4, r6, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x002b
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4, r0}
            java.lang.String r6 = "Server returned: [%s] Status: [%d]; Data: %s"
            java.lang.String r4 = java.lang.String.format(r2, r6, r4)
            Fe.C3023l.l(r4)
            goto L_0x0038
        L_0x002b:
            java.lang.String r4 = "returned %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            java.lang.String r4 = java.lang.String.format(r4, r6)
            Fe.C3023l.l(r4)
        L_0x0038:
            if (r0 == 0) goto L_0x009b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0043 }
            r1.e(r4)     // Catch:{ JSONException -> 0x0043 }
            goto L_0x009b
        L_0x0043:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004c }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x004c }
            r1.e(r4)     // Catch:{ JSONException -> 0x004c }
            goto L_0x009b
        L_0x004c:
            r4 = move-exception
            Fe.y r6 = Fe.y.QRCodeTag
            java.lang.String r6 = r6.b()
            boolean r5 = r5.contains(r6)
            java.lang.String r6 = "Caught JSONException "
            if (r5 == 0) goto L_0x0085
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
            r4.<init>()     // Catch:{ JSONException -> 0x006d }
            Fe.y r5 = Fe.y.QRCodeResponseString     // Catch:{ JSONException -> 0x006d }
            java.lang.String r5 = r5.b()     // Catch:{ JSONException -> 0x006d }
            r4.put(r5, r0)     // Catch:{ JSONException -> 0x006d }
            r1.e(r4)     // Catch:{ JSONException -> 0x006d }
            goto L_0x009b
        L_0x006d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            Fe.C3023l.m(r4)
            goto L_0x009b
        L_0x0085:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            Fe.C3023l.m(r4)
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: He.a.g(He.a$b, java.lang.String, java.lang.String):Fe.Q");
    }

    public abstract b c(String str);

    public abstract b d(String str, JSONObject jSONObject);

    public final Q e(String str, JSONObject jSONObject, String str2, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!a(jSONObject, str3)) {
            return new Q(str2, -114, "", "Invalid key");
        }
        String str4 = str + b(jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        C3023l.l("getting " + str4);
        try {
            b c10 = c(str4);
            Q g10 = g(c10, str2, c10.f31731c);
            if (C3016e.X() != null) {
                C3016e.X().f31062i.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return g10;
        } catch (C0520a e10) {
            Q q10 = new Q(str2, e10.f31727a, "", e10.f31728b);
            if (C3016e.X() != null) {
                C3016e.X().f31062i.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return q10;
        } catch (Throwable th2) {
            if (C3016e.X() != null) {
                C3016e.X().f31062i.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th2;
        }
    }

    public final Q f(JSONObject jSONObject, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!a(jSONObject, str3)) {
            return new Q(str2, -114, "", "Failed to set common parameters, body: " + jSONObject + " key: " + str3);
        }
        C3023l.l("posting to " + str);
        C3023l.l("Post value = " + jSONObject.toString());
        try {
            b d10 = d(str, jSONObject);
            Q g10 = g(d10, str2, d10.f31731c);
            if (C3016e.X() != null) {
                N n10 = C3016e.X().f31062i;
                n10.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return g10;
        } catch (C0520a e10) {
            int a10 = e10.f31727a;
            Q q10 = new Q(str2, a10, "", "Failed network request. " + e10.f31728b);
            if (C3016e.X() != null) {
                N n11 = C3016e.X().f31062i;
                n11.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return q10;
        } catch (Throwable th2) {
            if (C3016e.X() != null) {
                N n12 = C3016e.X().f31062i;
                n12.b(str2 + "-" + y.Branch_Round_Trip_Time.b(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th2;
        }
    }
}

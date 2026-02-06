package K5;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C3459v;
import com.facebook.I;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final String f32415g = "K5.a";

    /* renamed from: a  reason: collision with root package name */
    private String f32416a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f32417b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f32418c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f32419d;

    /* renamed from: e  reason: collision with root package name */
    private String f32420e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f32421f;

    /* renamed from: K5.a$a  reason: collision with other inner class name */
    class C0528a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f32422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f32424c;

        C0528a(Context context, String str, b bVar) {
            this.f32422a = context;
            this.f32423b = str;
            this.f32424c = bVar;
        }

        public void run() {
            if (!C4049a.d(this)) {
                try {
                    a.e(this.f32422a, this.f32423b, this.f32424c);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    public interface b {
        void a(a aVar);
    }

    private a() {
    }

    private static a b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(DiagnosticsEntry.VERSION_KEY);
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                a aVar = new a();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                aVar.f32418c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    aVar.f32416a = aVar.f32418c.getString("ref");
                } else if (aVar.f32418c.has("referer_data")) {
                    JSONObject jSONObject3 = aVar.f32418c.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        aVar.f32416a = jSONObject3.getString("fb_ref");
                    }
                }
                if (aVar.f32418c.has("target_url")) {
                    Uri parse = Uri.parse(aVar.f32418c.getString("target_url"));
                    aVar.f32417b = parse;
                    aVar.f32421f = f(parse);
                }
                if (aVar.f32418c.has("extras")) {
                    JSONObject jSONObject4 = aVar.f32418c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            aVar.f32420e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                aVar.f32419d = h(aVar.f32418c);
                return aVar;
            }
        } catch (JSONException e10) {
            W.m0(f32415g, "Unable to parse AppLink JSON", e10);
        } catch (C3459v e11) {
            W.m0(f32415g, "Unable to parse AppLink JSON", e11);
        }
        return null;
    }

    public static void c(Context context, b bVar) {
        d(context, (String) null, bVar);
    }

    public static void d(Context context, String str, b bVar) {
        X.m(context, "context");
        X.m(bVar, "completionHandler");
        if (str == null) {
            str = W.K(context);
        }
        X.m(str, "applicationId");
        I.t().execute(new C0528a(context.getApplicationContext(), str, bVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        o7.W.l0(f32415g, "Unable to put tap time in AppLinkData.arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        o7.W.l0(f32415g, "Unable to put app link class name in AppLinkData.arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        o7.W.l0(f32415g, "Unable to put app link URL in AppLinkData.arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        o7.W.l0(f32415g, "Unable to fetch deferred applink from server");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(android.content.Context r7, java.lang.String r8, K5.a.b r9) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "DEFERRED_APP_LINK"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ca }
            o7.b r1 = o7.C3886b.k(r7)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r2 = t5.C4039p.c(r7)     // Catch:{ JSONException -> 0x00ca }
            boolean r3 = com.facebook.I.z(r7)     // Catch:{ JSONException -> 0x00ca }
            o7.W.G0(r0, r1, r2, r3, r7)     // Catch:{ JSONException -> 0x00ca }
            android.content.Context r1 = com.facebook.I.l()     // Catch:{ JSONException -> 0x00ca }
            o7.W.H0(r0, r1)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r1 = "application_package_name"
            java.lang.String r7 = r7.getPackageName()     // Catch:{ JSONException -> 0x00ca }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r7 = "%s/activities"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r7 = java.lang.String.format(r7, r8)
            r8 = 0
            com.facebook.M r7 = com.facebook.M.B(r8, r7, r0, r8)     // Catch:{ Exception -> 0x00bf }
            com.facebook.S r7 = r7.k()     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r7 = r7.c()     // Catch:{ Exception -> 0x00bf }
            if (r7 == 0) goto L_0x00c6
            java.lang.String r0 = "applink_args"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = "click_time"
            r2 = -1
            long r4 = r7.optLong(r1, r2)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = "applink_class"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "applink_url"
            java.lang.String r7 = r7.optString(r6)     // Catch:{ Exception -> 0x00bf }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00bf }
            if (r6 != 0) goto L_0x00c6
            K5.a r8 = b(r0)     // Catch:{ Exception -> 0x00bf }
            if (r8 == 0) goto L_0x00c6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            org.json.JSONObject r0 = r8.f32418c     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
            if (r0 == 0) goto L_0x0077
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x0083 }
        L_0x0077:
            android.os.Bundle r0 = r8.f32419d     // Catch:{ JSONException -> 0x0083 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r3 = java.lang.Long.toString(r4)     // Catch:{ JSONException -> 0x0083 }
            r0.putString(r2, r3)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x008a
        L_0x0083:
            java.lang.String r0 = f32415g     // Catch:{ Exception -> 0x00bf }
            java.lang.String r2 = "Unable to put tap time in AppLinkData.arguments"
            o7.W.l0(r0, r2)     // Catch:{ Exception -> 0x00bf }
        L_0x008a:
            if (r1 == 0) goto L_0x00a4
            org.json.JSONObject r0 = r8.f32418c     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
            if (r0 == 0) goto L_0x0095
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x009d }
        L_0x0095:
            android.os.Bundle r0 = r8.f32419d     // Catch:{ JSONException -> 0x009d }
            if (r0 == 0) goto L_0x00a4
            r0.putString(r2, r1)     // Catch:{ JSONException -> 0x009d }
            goto L_0x00a4
        L_0x009d:
            java.lang.String r0 = f32415g     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = "Unable to put app link class name in AppLinkData.arguments"
            o7.W.l0(r0, r1)     // Catch:{ Exception -> 0x00bf }
        L_0x00a4:
            if (r7 == 0) goto L_0x00c6
            org.json.JSONObject r0 = r8.f32418c     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r1 = "com.facebook.platform.APPLINK_NATIVE_URL"
            if (r0 == 0) goto L_0x00af
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00af:
            android.os.Bundle r0 = r8.f32419d     // Catch:{ JSONException -> 0x00b7 }
            if (r0 == 0) goto L_0x00c6
            r0.putString(r1, r7)     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            java.lang.String r7 = f32415g     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = "Unable to put app link URL in AppLinkData.arguments"
            o7.W.l0(r7, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c6
        L_0x00bf:
            java.lang.String r7 = f32415g
            java.lang.String r0 = "Unable to fetch deferred applink from server"
            o7.W.l0(r7, r0)
        L_0x00c6:
            r9.a(r8)
            return
        L_0x00ca:
            r7 = move-exception
            com.facebook.v r8 = new com.facebook.v
            java.lang.String r9 = "An error occurred while preparing deferred app link"
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.e(android.content.Context, java.lang.String, K5.a$b):void");
    }

    private static JSONObject f(Uri uri) {
        Class<a> cls = a.class;
        if (C4049a.d(cls) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private static Bundle h(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, h((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i10 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            bundleArr[i10] = h(jSONArray.getJSONObject(i10));
                            i10++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            strArr[i10] = jSONArray.get(i10).toString();
                            i10++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new C3459v("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public Uri g() {
        return this.f32417b;
    }
}

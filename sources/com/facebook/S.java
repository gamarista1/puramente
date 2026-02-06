package com.facebook;

import android.util.Log;
import com.facebook.C3286a;
import io.branch.rnbranch.RNBranchModule;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import mf.C6565s;
import o7.J;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class S {

    /* renamed from: i  reason: collision with root package name */
    public static final a f39355i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f39356j = S.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final M f39357a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f39358b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39359c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f39360d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONArray f39361e;

    /* renamed from: f  reason: collision with root package name */
    private final C3462y f39362f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f39363g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONArray f39364h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final S b(M m10, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                C3462y a10 = C3462y.f42569o.a(jSONObject, obj2, httpURLConnection);
                if (a10 != null) {
                    Log.e(S.f39356j, a10.toString());
                    if (a10.c() == 190 && W.a0(m10.m())) {
                        if (a10.l() != 493) {
                            C3286a.f39402l.i((C3286a) null);
                        } else {
                            C3286a.c cVar = C3286a.f39402l;
                            C3286a e10 = cVar.e();
                            if (e10 != null && !e10.p()) {
                                cVar.d();
                            }
                        }
                    }
                    return new S(m10, httpURLConnection, a10);
                }
                Object P10 = W.P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (P10 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) P10;
                    return new S(m10, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (P10 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) P10;
                    return new S(m10, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    obj = JSONObject.NULL;
                    C6496s.g(obj, "NULL");
                }
            }
            if (obj == JSONObject.NULL) {
                return new S(m10, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new C3459v("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List c(java.net.HttpURLConnection r9, java.util.List r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L_0x0053
                java.lang.Object r2 = r10.get(r3)
                com.facebook.M r2 = (com.facebook.M) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                r4.<init>()     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                if (r9 == 0) goto L_0x0028
                int r5 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                goto L_0x002a
            L_0x0024:
                r4 = move-exception
                goto L_0x0038
            L_0x0026:
                r4 = move-exception
                goto L_0x0046
            L_0x0028:
                r5 = 200(0xc8, float:2.8E-43)
            L_0x002a:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                r5.<init>()     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                r5.put(r4)     // Catch:{ JSONException -> 0x0026, IOException -> 0x0024 }
                goto L_0x0054
            L_0x0038:
                com.facebook.S r5 = new com.facebook.S
                com.facebook.y r6 = new com.facebook.y
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
                goto L_0x0053
            L_0x0046:
                com.facebook.S r5 = new com.facebook.S
                com.facebook.y r6 = new com.facebook.y
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
            L_0x0053:
                r5 = r11
            L_0x0054:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto L_0x00a4
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto L_0x00a4
                int r0 = r2.length()
            L_0x0065:
                if (r3 >= r0) goto L_0x00a3
                java.lang.Object r2 = r10.get(r3)
                com.facebook.M r2 = (com.facebook.M) r2
                r4 = r5
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ JSONException -> 0x0083, v -> 0x0081 }
                java.lang.Object r4 = r4.get(r3)     // Catch:{ JSONException -> 0x0083, v -> 0x0081 }
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.C6496s.g(r4, r6)     // Catch:{ JSONException -> 0x0083, v -> 0x0081 }
                com.facebook.S r4 = r8.b(r2, r9, r4, r11)     // Catch:{ JSONException -> 0x0083, v -> 0x0081 }
                r1.add(r4)     // Catch:{ JSONException -> 0x0083, v -> 0x0081 }
                goto L_0x00a0
            L_0x0081:
                r4 = move-exception
                goto L_0x0085
            L_0x0083:
                r4 = move-exception
                goto L_0x0093
            L_0x0085:
                com.facebook.S r6 = new com.facebook.S
                com.facebook.y r7 = new com.facebook.y
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r6.<init>(r2, r9, r7)
                r1.add(r6)
                goto L_0x00a0
            L_0x0093:
                com.facebook.S r6 = new com.facebook.S
                com.facebook.y r7 = new com.facebook.y
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r6.<init>(r2, r9, r7)
                r1.add(r6)
            L_0x00a0:
                int r3 = r3 + 1
                goto L_0x0065
            L_0x00a3:
                return r1
            L_0x00a4:
                com.facebook.v r9 = new com.facebook.v
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>((java.lang.String) r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.S.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List a(List list, HttpURLConnection httpURLConnection, C3459v vVar) {
            C6496s.h(list, "requests");
            Iterable<M> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (M s10 : iterable) {
                arrayList.add(new S(s10, httpURLConnection, new C3462y(httpURLConnection, (Exception) vVar)));
            }
            return arrayList;
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, Q q10) {
            C6496s.h(q10, "requests");
            String w02 = W.w0(inputStream);
            J.f47112e.c(V.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(w02.length()), w02);
            return e(w02, httpURLConnection, q10);
        }

        public final List e(String str, HttpURLConnection httpURLConnection, Q q10) {
            C6496s.h(str, "responseString");
            C6496s.h(q10, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            C6496s.g(nextValue, "resultObject");
            List c10 = c(httpURLConnection, q10, nextValue);
            J.f47112e.c(V.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", q10.z(), Integer.valueOf(str.length()), c10);
            return c10;
        }

        public final List f(HttpURLConnection httpURLConnection, Q q10) {
            List list;
            C6496s.h(httpURLConnection, "connection");
            C6496s.h(q10, "requests");
            InputStream inputStream = null;
            try {
                if (I.F()) {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        inputStream = httpURLConnection.getErrorStream();
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    list = d(inputStream, httpURLConnection, q10);
                    W.j(inputStream);
                    return list;
                }
                Log.e(S.f39356j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new C3459v("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } catch (C3459v e10) {
                J.f47112e.c(V.REQUESTS, "Response", "Response <Error>: %s", e10);
                list = a(q10, httpURLConnection, e10);
            } catch (Exception e11) {
                J.f47112e.c(V.REQUESTS, "Response", "Response <Error>: %s", e11);
                list = a(q10, httpURLConnection, new C3459v((Throwable) e11));
            } catch (Throwable th2) {
                W.j((Closeable) null);
                throw th2;
            }
        }

        private a() {
        }
    }

    public S(M m10, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, C3462y yVar) {
        C6496s.h(m10, "request");
        this.f39357a = m10;
        this.f39358b = httpURLConnection;
        this.f39359c = str;
        this.f39360d = jSONObject;
        this.f39361e = jSONArray;
        this.f39362f = yVar;
        this.f39363g = jSONObject;
        this.f39364h = jSONArray;
    }

    public final C3462y b() {
        return this.f39362f;
    }

    public final JSONObject c() {
        return this.f39360d;
    }

    public final JSONObject d() {
        return this.f39363g;
    }

    public String toString() {
        String str;
        int i10;
        try {
            U u10 = U.f71764a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f39358b;
            if (httpURLConnection != null) {
                i10 = httpURLConnection.getResponseCode();
            } else {
                i10 = 200;
            }
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            C6496s.g(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response: " + " responseCode: " + str + ", graphObject: " + this.f39360d + ", error: " + this.f39362f + "}";
        C6496s.g(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public S(M m10, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(m10, httpURLConnection, str, jSONObject, (JSONArray) null, (C3462y) null);
        C6496s.h(m10, "request");
        C6496s.h(str, "rawResponse");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public S(M m10, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(m10, httpURLConnection, str, (JSONObject) null, jSONArray, (C3462y) null);
        C6496s.h(m10, "request");
        C6496s.h(str, "rawResponse");
        C6496s.h(jSONArray, "graphObjects");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public S(M m10, HttpURLConnection httpURLConnection, C3462y yVar) {
        this(m10, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, yVar);
        C6496s.h(m10, "request");
        C6496s.h(yVar, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
    }
}

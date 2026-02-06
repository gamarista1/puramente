package y7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import t7.C4049a;
import y7.C4214u;

/* renamed from: y7.A  reason: case insensitive filesystem */
public final class C4192A {

    /* renamed from: d  reason: collision with root package name */
    public static final a f49571d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final ScheduledExecutorService f49572e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a  reason: collision with root package name */
    private final String f49573a;

    /* renamed from: b  reason: collision with root package name */
    private final C4021N f49574b;

    /* renamed from: c  reason: collision with root package name */
    private String f49575c;

    /* renamed from: y7.A$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }

        private a() {
        }
    }

    public C4192A(Context context, String str) {
        PackageInfo packageInfo;
        C6496s.h(context, "context");
        C6496s.h(str, "applicationId");
        this.f49573a = str;
        this.f49574b = new C4021N(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f49575c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void g(String str) {
        if (!C4049a.d(this)) {
            try {
                f49572e.schedule(new z(this, f49571d.b(str)), 5, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(C4192A a10, Bundle bundle) {
        Class<C4192A> cls = C4192A.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(a10, "this$0");
                C6496s.h(bundle, "$bundle");
                a10.f49574b.g("fb_mobile_login_heartbeat", bundle);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static /* synthetic */ void k(C4192A a10, String str, String str2, String str3, int i10, Object obj) {
        Class<C4192A> cls = C4192A.class;
        if (!C4049a.d(cls)) {
            if ((i10 & 4) != 0) {
                str3 = "";
            }
            try {
                a10.j(str, str2, str3);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final String b() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f49573a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final void c(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (!C4049a.d(this)) {
            try {
                Bundle a10 = f49571d.b(str);
                if (str3 != null) {
                    a10.putString("2_result", str3);
                }
                if (str4 != null) {
                    a10.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    a10.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    a10.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a10.putString("3_method", str2);
                this.f49574b.g(str6, a10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void d(String str, String str2, String str3) {
        if (!C4049a.d(this)) {
            try {
                Bundle a10 = f49571d.b(str);
                a10.putString("3_method", str2);
                this.f49574b.g(str3, a10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void e(String str, String str2, String str3) {
        if (!C4049a.d(this)) {
            try {
                Bundle a10 = f49571d.b(str);
                a10.putString("3_method", str2);
                this.f49574b.g(str3, a10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void f(String str, Map map, C4214u.f.a aVar, Map map2, Exception exc, String str2) {
        String str3;
        if (!C4049a.d(this)) {
            try {
                C6496s.h(map, "loggingExtras");
                Bundle a10 = f49571d.b(str);
                if (aVar != null) {
                    a10.putString("2_result", aVar.b());
                }
                JSONObject jSONObject = null;
                if (exc != null) {
                    str3 = exc.getMessage();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    a10.putString("5_error_message", exc.getMessage());
                }
                if (!map.isEmpty()) {
                    jSONObject = new JSONObject(map);
                }
                if (map2 != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map2.entrySet()) {
                            String str4 = (String) entry.getKey();
                            String str5 = (String) entry.getValue();
                            if (str4 != null) {
                                jSONObject.put(str4, str5);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    a10.putString("6_extras", jSONObject.toString());
                }
                this.f49574b.g(str2, a10);
                if (aVar == C4214u.f.a.SUCCESS) {
                    g(str);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.os.Bundle} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:4|5|6|7|(1:9)|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0082 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(y7.C4214u.e r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = t7.C4049a.d(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "pendingLoginRequest"
            kotlin.jvm.internal.C6496s.h(r6, r0)     // Catch:{ all -> 0x0064 }
            y7.A$a r0 = f49571d     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = r6.b()     // Catch:{ all -> 0x0064 }
            android.os.Bundle r0 = r0.b(r1)     // Catch:{ all -> 0x0064 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0082 }
            r1.<init>()     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "login_behavior"
            y7.t r3 = r6.j()     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "request_code"
            y7.u$c r3 = y7.C4214u.f49807m     // Catch:{ JSONException -> 0x0082 }
            int r3 = r3.b()     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "permissions"
            java.lang.String r3 = ","
            java.util.Set r4 = r6.o()     // Catch:{ JSONException -> 0x0082 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "default_audience"
            y7.e r3 = r6.g()     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "isReauthorize"
            boolean r3 = r6.v()     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = r5.f49575c     // Catch:{ JSONException -> 0x0082 }
            if (r2 == 0) goto L_0x0066
            java.lang.String r3 = "facebookVersion"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x0082 }
            goto L_0x0066
        L_0x0064:
            r6 = move-exception
            goto L_0x0088
        L_0x0066:
            y7.G r2 = r6.k()     // Catch:{ JSONException -> 0x0082 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = "target_app"
            y7.G r6 = r6.k()     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0082 }
            r1.put(r2, r6)     // Catch:{ JSONException -> 0x0082 }
        L_0x0079:
            java.lang.String r6 = "6_extras"
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0082 }
            r0.putString(r6, r1)     // Catch:{ JSONException -> 0x0082 }
        L_0x0082:
            t5.N r6 = r5.f49574b     // Catch:{ all -> 0x0064 }
            r6.g(r7, r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0088:
            t7.C4049a.b(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C4192A.i(y7.u$e, java.lang.String):void");
    }

    public final void j(String str, String str2, String str3) {
        if (!C4049a.d(this)) {
            try {
                Bundle a10 = f49571d.b("");
                a10.putString("2_result", C4214u.f.a.ERROR.b());
                a10.putString("5_error_message", str2);
                a10.putString("3_method", str3);
                this.f49574b.g(str, a10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}

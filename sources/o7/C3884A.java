package o7;

import F5.k;
import F5.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import mf.C6565s;
import o7.C3899o;
import o7.C3906w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.C2780Y;
import x5.C4169e;

/* renamed from: o7.A  reason: case insensitive filesystem */
public final class C3884A {

    /* renamed from: a  reason: collision with root package name */
    public static final C3884A f47082a = new C3884A();

    /* renamed from: b  reason: collision with root package name */
    private static final String f47083b = C3884A.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final List f47084c = C6565s.q("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')');

    /* renamed from: d  reason: collision with root package name */
    private static final Map f47085d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference f47086e = new AtomicReference(a.NOT_LOADED);

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentLinkedQueue f47087f = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f47088g;

    /* renamed from: h  reason: collision with root package name */
    private static JSONArray f47089h;

    /* renamed from: o7.A$a */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: o7.A$b */
    public interface b {
        void a();

        void b(C3906w wVar);
    }

    private C3884A() {
    }

    public static final void d(b bVar) {
        C6496s.h(bVar, "callback");
        f47087f.add(bVar);
        h();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f47084c);
        bundle.putString("fields", TextUtils.join(f.f37529a, arrayList));
        M x10 = M.f39311n.x((C3286a) null, "app", (M.b) null);
        x10.F(true);
        x10.J(bundle);
        JSONObject d10 = x10.k().d();
        if (d10 == null) {
            return new JSONObject();
        }
        return d10;
    }

    public static final C3906w f(String str) {
        if (str != null) {
            return (C3906w) f47085d.get(str);
        }
        return null;
    }

    public static final Map g() {
        JSONObject jSONObject;
        Context l10 = I.l();
        String m10 = I.m();
        U u10 = U.f71764a;
        String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
        C6496s.g(format, "format(format, *args)");
        String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, (String) null);
        if (!W.e0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    W.k0("FacebookSDK", e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return f47082a.p(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }

    public static final void h() {
        Context l10 = I.l();
        String m10 = I.m();
        if (W.e0(m10)) {
            f47086e.set(a.ERROR);
            f47082a.r();
        } else if (f47085d.containsKey(m10)) {
            f47086e.set(a.SUCCESS);
            f47082a.r();
        } else {
            AtomicReference atomicReference = f47086e;
            a aVar = a.NOT_LOADED;
            a aVar2 = a.LOADING;
            if (C2780Y.a(atomicReference, aVar, aVar2) || C2780Y.a(atomicReference, a.ERROR, aVar2)) {
                U u10 = U.f71764a;
                String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
                C6496s.g(format, "format(format, *args)");
                I.t().execute(new C3907x(l10, format, m10));
                return;
            }
            f47082a.r();
        }
    }

    /* access modifiers changed from: private */
    public static final void i(Context context, String str, String str2) {
        a aVar;
        JSONObject jSONObject;
        C6496s.h(context, "$context");
        C6496s.h(str, "$settingsKey");
        C6496s.h(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C3906w wVar = null;
        String string = sharedPreferences.getString(str, (String) null);
        if (!W.e0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    W.k0("FacebookSDK", e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    wVar = f47082a.j(str2, jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C3884A a10 = f47082a;
        JSONObject e11 = a10.e(str2);
        if (e11 != null) {
            a10.j(str2, e11);
            sharedPreferences.edit().putString(str, e11.toString()).apply();
        }
        if (wVar != null) {
            String u10 = wVar.u();
            if (!f47088g && u10 != null && u10.length() > 0) {
                f47088g = true;
                Log.w(f47083b, u10);
            }
        }
        C3905v.m(str2, true);
        k.h();
        AtomicReference atomicReference = f47086e;
        if (f47085d.containsKey(str2)) {
            aVar = a.SUCCESS;
        } else {
            aVar = a.ERROR;
        }
        atomicReference.set(aVar);
        a10.r();
    }

    private final List k(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (C6496s.c(jSONObject2.getString(SubscriberAttributeKt.JSON_NAME_KEY), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i11 = 0;
                while (i11 < length2) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (!C6496s.c(jSONObject3.getString(SubscriberAttributeKt.JSON_NAME_KEY), str)) {
                        i11++;
                    } else {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private final ArrayList l(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            try {
                jSONArray = jSONObject2.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return null;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
            String string = jSONObject3.getString(SubscriberAttributeKt.JSON_NAME_KEY);
            if (!C6496s.c(string, "prod_keys") || !z10) {
                if (!C6496s.c(string, "test_keys") || z10) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                        String string2 = jSONObject4.getString(SubscriberAttributeKt.JSON_NAME_KEY);
                        if (!C6496s.c(string2, "_valueToSum")) {
                            if (!C6496s.c(string2, "fb_currency")) {
                                JSONArray jSONArray3 = jSONObject4.getJSONArray("value");
                                ArrayList arrayList2 = new ArrayList();
                                int length3 = jSONArray3.length();
                                for (int i12 = 0; i12 < length3; i12++) {
                                    arrayList2.add(jSONArray3.getJSONObject(i12).getString("value"));
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(new Pair(string2, arrayList2));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ ArrayList m(C3884A a10, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a10.l(jSONObject, z10);
    }

    private final Long n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.optLong("iap_manual_and_auto_log_dedup_window_millis"));
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map o(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                C3906w.b.a aVar = C3906w.b.f47388e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                C6496s.g(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C3906w.b a10 = aVar.a(optJSONObject);
                if (a10 != null) {
                    String a11 = a10.a();
                    Map map = (Map) hashMap.get(a11);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a11, map);
                    }
                    map.put(a10.b(), a10);
                }
            }
        }
        return hashMap;
    }

    private final Map p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                W.k0("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                W.k0("FacebookSDK", e11);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private final JSONArray q(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void r() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference r0 = f47086e     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0042 }
            o7.A$a r0 = (o7.C3884A.a) r0     // Catch:{ all -> 0x0042 }
            o7.A$a r1 = o7.C3884A.a.NOT_LOADED     // Catch:{ all -> 0x0042 }
            if (r1 == r0) goto L_0x005f
            o7.A$a r1 = o7.C3884A.a.LOADING     // Catch:{ all -> 0x0042 }
            if (r1 != r0) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            java.lang.String r1 = com.facebook.I.m()     // Catch:{ all -> 0x0042 }
            java.util.Map r2 = f47085d     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0042 }
            o7.w r1 = (o7.C3906w) r1     // Catch:{ all -> 0x0042 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0042 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0042 }
            r2.<init>(r3)     // Catch:{ all -> 0x0042 }
            o7.A$a r3 = o7.C3884A.a.ERROR     // Catch:{ all -> 0x0042 }
            if (r3 != r0) goto L_0x0046
        L_0x002b:
            java.util.concurrent.ConcurrentLinkedQueue r0 = f47087f     // Catch:{ all -> 0x0042 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0044
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0042 }
            o7.A$b r0 = (o7.C3884A.b) r0     // Catch:{ all -> 0x0042 }
            o7.y r1 = new o7.y     // Catch:{ all -> 0x0042 }
            r1.<init>(r0)     // Catch:{ all -> 0x0042 }
            r2.post(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x002b
        L_0x0042:
            r0 = move-exception
            goto L_0x0061
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            java.util.concurrent.ConcurrentLinkedQueue r0 = f47087f     // Catch:{ all -> 0x0042 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0042 }
            o7.A$b r0 = (o7.C3884A.b) r0     // Catch:{ all -> 0x0042 }
            o7.z r3 = new o7.z     // Catch:{ all -> 0x0042 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0042 }
            r2.post(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C3884A.r():void");
    }

    /* access modifiers changed from: private */
    public static final void s(b bVar) {
        bVar.a();
    }

    /* access modifiers changed from: private */
    public static final void t(b bVar, C3906w wVar) {
        bVar.b(wVar);
    }

    public static final C3906w u(String str, boolean z10) {
        C6496s.h(str, "applicationId");
        if (!z10) {
            Map map = f47085d;
            if (map.containsKey(str)) {
                return (C3906w) map.get(str);
            }
        }
        C3884A a10 = f47082a;
        C3906w j10 = a10.j(str, a10.e(str));
        if (C6496s.c(str, I.m())) {
            f47086e.set(a.SUCCESS);
            a10.r();
        }
        return j10;
    }

    public final C3906w j(String str, JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str2;
        JSONObject jSONObject2 = jSONObject;
        C6496s.h(str, "applicationId");
        C6496s.h(jSONObject2, "settingsJSON");
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        C3899o.a aVar = C3899o.f47275g;
        C3899o a10 = aVar.a(optJSONArray);
        if (a10 == null) {
            a10 = aVar.b();
        }
        C3899o oVar = a10;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((optInt & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((optInt & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((optInt & 256) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((optInt & 16384) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f47089h = optJSONArray2;
        if (optJSONArray2 != null && G.b()) {
            if (optJSONArray2 != null) {
                str2 = optJSONArray2.toString();
            } else {
                str2 = null;
            }
            C4169e.c(str2);
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("app_events_config");
        boolean optBoolean = jSONObject2.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject2.optString("gdpv4_nux_content", "");
        String str3 = optString;
        C6496s.g(optString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject2.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject2.optInt("app_events_session_timeout", l.a());
        C3899o oVar2 = oVar;
        EnumSet a11 = Q.f47154b.a(jSONObject2.optLong("seamless_login"));
        JSONObject jSONObject3 = optJSONObject;
        Map o10 = o(jSONObject2.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject2.optString("smart_login_bookmark_icon_url");
        String str4 = optString2;
        C6496s.g(optString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject2.optString("smart_login_menu_icon_url");
        String str5 = optString3;
        C6496s.g(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject2.optString("sdk_update_message");
        C6496s.g(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C3906w wVar = r4;
        C3906w wVar2 = new C3906w(optBoolean, str3, optBoolean2, optInt2, a11, o10, z10, oVar2, str4, str5, z11, z12, optJSONArray2, optString4, z13, z14, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"), q(jSONObject2.optJSONObject("protected_mode_rules"), "standard_params"), q(jSONObject2.optJSONObject("protected_mode_rules"), "maca_rules"), p(jSONObject2), q(jSONObject2.optJSONObject("protected_mode_rules"), "blocklist_events"), q(jSONObject2.optJSONObject("protected_mode_rules"), "redacted_events"), q(jSONObject2.optJSONObject("protected_mode_rules"), "sensitive_params"), q(jSONObject2.optJSONObject("protected_mode_rules"), "standard_params_schema"), q(jSONObject2.optJSONObject("protected_mode_rules"), "standard_params_blocked"), k(jSONObject3, "fb_currency"), k(jSONObject3, "_valueToSum"), m(this, jSONObject3, false, 2, (Object) null), l(jSONObject3, true), n(jSONObject2.optJSONObject("app_events_config")));
        f47085d.put(str, wVar);
        return wVar;
    }
}

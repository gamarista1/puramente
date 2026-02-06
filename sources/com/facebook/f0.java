package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.M;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3886b;
import o7.C3906w;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import t7.C4049a;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f39460a = new f0();

    /* renamed from: b  reason: collision with root package name */
    private static final String f39461b = f0.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f39462c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f39463d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final a f39464e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f  reason: collision with root package name */
    private static final a f39465f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g  reason: collision with root package name */
    private static final a f39466g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h  reason: collision with root package name */
    private static final a f39467h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i  reason: collision with root package name */
    private static final a f39468i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j  reason: collision with root package name */
    private static SharedPreferences f39469j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f39470a;

        /* renamed from: b  reason: collision with root package name */
        private String f39471b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f39472c;

        /* renamed from: d  reason: collision with root package name */
        private long f39473d;

        public a(boolean z10, String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.f39470a = z10;
            this.f39471b = str;
        }

        public final boolean a() {
            return this.f39470a;
        }

        public final String b() {
            return this.f39471b;
        }

        public final long c() {
            return this.f39473d;
        }

        public final Boolean d() {
            return this.f39472c;
        }

        public final boolean e() {
            Boolean bool = this.f39472c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.f39470a;
        }

        public final void f(long j10) {
            this.f39473d = j10;
        }

        public final void g(Boolean bool) {
            this.f39472c = bool;
        }
    }

    private f0() {
    }

    private final boolean b() {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            Map g10 = C3884A.g();
            if (g10 != null) {
                if (!g10.isEmpty()) {
                    Boolean bool = (Boolean) g10.get("auto_log_app_events_enabled");
                    Boolean bool2 = (Boolean) g10.get("auto_log_app_events_default");
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    Boolean c10 = c();
                    if (c10 != null) {
                        return c10.booleanValue();
                    }
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return true;
                }
            }
            return f39465f.e();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final Boolean c() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Boolean q10 = q();
            if (q10 != null) {
                return q10;
            }
            Boolean l10 = l();
            if (l10 != null) {
                return l10;
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final boolean d() {
        Class<f0> cls = f0.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            f39460a.j();
            return f39466g.e();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean e() {
        Class<f0> cls = f0.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            f39460a.j();
            return f39464e.e();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean f() {
        Class<f0> cls = f0.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            f0 f0Var = f39460a;
            f0Var.j();
            return f0Var.b();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean g() {
        Class<f0> cls = f0.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            f39460a.j();
            return f39467h.e();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final void h() {
        if (!C4049a.d(this)) {
            try {
                a aVar = f39467h;
                r(aVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                    aVar.g((Boolean) null);
                    aVar.f(0);
                    if (f39463d.compareAndSet(false, true)) {
                        I.t().execute(new e0(currentTimeMillis));
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void i(long j10) {
        C3906w u10;
        String str;
        Class<f0> cls = f0.class;
        if (!C4049a.d(cls)) {
            try {
                if (f39466g.e() && (u10 = C3884A.u(I.m(), false)) != null && u10.d()) {
                    C3886b e10 = C3886b.f47182f.e(I.l());
                    if (e10 == null || e10.h() == null) {
                        str = null;
                    } else {
                        str = e10.h();
                    }
                    if (str != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", str);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        M x10 = M.f39311n.x((C3286a) null, "app", (M.b) null);
                        x10.J(bundle);
                        JSONObject c10 = x10.k().c();
                        if (c10 != null) {
                            a aVar = f39467h;
                            aVar.g(Boolean.valueOf(c10.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j10);
                            f39460a.v(aVar);
                        }
                    }
                }
                f39463d.set(false);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void j() {
        if (!C4049a.d(this)) {
            try {
                if (I.G() && f39462c.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    C6496s.g(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                    f39469j = sharedPreferences;
                    k(f39465f, f39466g, f39464e);
                    h();
                    p();
                    o();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void k(a... aVarArr) {
        if (!C4049a.d(this)) {
            try {
                for (a aVar : aVarArr) {
                    if (aVar == f39467h) {
                        h();
                    } else if (aVar.d() == null) {
                        r(aVar);
                        if (aVar.d() == null) {
                            m(aVar);
                        }
                    } else {
                        v(aVar);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final Boolean l() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            u();
            Context l10 = I.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            C6496s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                a aVar = f39465f;
                if (bundle.containsKey(aVar.b())) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            W.k0(f39461b, e10);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
        return null;
    }

    private final void m(a aVar) {
        if (!C4049a.d(this)) {
            try {
                u();
                Context l10 = I.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                C6496s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(aVar.b())) {
                    aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                W.k0(f39461b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void n() {
        Class<f0> cls = f0.class;
        if (!C4049a.d(cls)) {
            try {
                Context l10 = I.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                C6496s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    C4021N n10 = new C4021N(l10);
                    Bundle bundle2 = new Bundle();
                    if (!W.W()) {
                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        Log.w(f39461b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    n10.d("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void o() {
        int i10;
        int i11;
        if (!C4049a.d(this)) {
            try {
                if (f39462c.get() && I.G()) {
                    Context l10 = I.l();
                    int i12 = 0;
                    boolean e10 = f39464e.e() | ((f39465f.e() ? 1 : 0) << true) | ((f39466g.e() ? 1 : 0) << true) | ((f39468i.e() ? 1 : 0) << true);
                    SharedPreferences sharedPreferences = f39469j;
                    SharedPreferences sharedPreferences2 = null;
                    if (sharedPreferences == null) {
                        C6496s.v("userSettingPref");
                        sharedPreferences = null;
                    }
                    int i13 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i13 != e10) {
                        SharedPreferences sharedPreferences3 = f39469j;
                        if (sharedPreferences3 == null) {
                            C6496s.v("userSettingPref");
                        } else {
                            sharedPreferences2 = sharedPreferences3;
                        }
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", e10 ? 1 : 0).apply();
                        try {
                            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                            C6496s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                            if (applicationInfo.metaData != null) {
                                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                boolean[] zArr = {true, true, true, true};
                                i10 = 0;
                                i11 = 0;
                                while (i12 < 4) {
                                    try {
                                        i11 |= (applicationInfo.metaData.containsKey(strArr[i12]) ? 1 : 0) << i12;
                                        i10 |= (applicationInfo.metaData.getBoolean(strArr[i12], zArr[i12]) ? 1 : 0) << i12;
                                        i12++;
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i12 = i10;
                                        i10 = i12;
                                        i12 = i11;
                                        C4021N n10 = new C4021N(l10);
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("usage", i12);
                                        bundle.putInt("initial", i10);
                                        bundle.putInt("previous", i13);
                                        bundle.putInt("current", e10);
                                        n10.b(bundle);
                                    }
                                }
                                i12 = i11;
                                C4021N n102 = new C4021N(l10);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("usage", i12);
                                bundle2.putInt("initial", i10);
                                bundle2.putInt("previous", i13);
                                bundle2.putInt("current", e10);
                                n102.b(bundle2);
                            }
                            i10 = 0;
                            C4021N n1022 = new C4021N(l10);
                            Bundle bundle22 = new Bundle();
                            bundle22.putInt("usage", i12);
                            bundle22.putInt("initial", i10);
                            bundle22.putInt("previous", i13);
                            bundle22.putInt("current", e10);
                            n1022.b(bundle22);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i11 = 0;
                            i10 = i12;
                            i12 = i11;
                            C4021N n10222 = new C4021N(l10);
                            Bundle bundle222 = new Bundle();
                            bundle222.putInt("usage", i12);
                            bundle222.putInt("initial", i10);
                            bundle222.putInt("previous", i13);
                            bundle222.putInt("current", e10);
                            n10222.b(bundle222);
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void p() {
        if (!C4049a.d(this)) {
            try {
                Context l10 = I.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                C6496s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(f39461b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!d()) {
                        Log.w(f39461b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private static final Boolean q() {
        String str = "";
        Class<f0> cls = f0.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            f39460a.u();
            SharedPreferences sharedPreferences = f39469j;
            if (sharedPreferences == null) {
                C6496s.v("userSettingPref");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString(f39465f.b(), str);
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
            }
        } catch (JSONException e10) {
            W.k0(f39461b, e10);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
        return null;
    }

    private final void r(a aVar) {
        String str = "";
        if (!C4049a.d(this)) {
            try {
                u();
                SharedPreferences sharedPreferences = f39469j;
                if (sharedPreferences == null) {
                    C6496s.v("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(aVar.b(), str);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                W.k0(f39461b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void s(boolean z10) {
        Class<f0> cls = f0.class;
        if (!C4049a.d(cls)) {
            try {
                a aVar = f39466g;
                aVar.g(Boolean.valueOf(z10));
                aVar.f(System.currentTimeMillis());
                if (f39462c.get()) {
                    f39460a.v(aVar);
                } else {
                    f39460a.j();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void t(boolean z10) {
        Class<f0> cls = f0.class;
        if (!C4049a.d(cls)) {
            try {
                a aVar = f39465f;
                aVar.g(Boolean.valueOf(z10));
                aVar.f(System.currentTimeMillis());
                if (f39462c.get()) {
                    f39460a.v(aVar);
                } else {
                    f39460a.j();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void u() {
        if (!C4049a.d(this)) {
            try {
                if (!f39462c.get()) {
                    throw new J("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void v(a aVar) {
        if (!C4049a.d(this)) {
            try {
                u();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f39469j;
                if (sharedPreferences == null) {
                    C6496s.v("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                o();
            } catch (Exception e10) {
                W.k0(f39461b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}

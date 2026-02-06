package com.facebook;

import F5.i;
import H5.c;
import Sg.p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.M;
import com.facebook.W;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import lf.C6514M;
import mf.C6559l;
import mf.Y;
import o7.C3886b;
import o7.C3902s;
import o7.C3905v;
import o7.J;
import o7.P;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.g;
import t5.C4017J;
import t5.C4039p;
import t5.C4041s;
import t7.C4049a;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public static final I f39283a = new I();

    /* renamed from: b  reason: collision with root package name */
    private static final String f39284b = I.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet f39285c = Y.f(V.DEVELOPER_ERRORS);

    /* renamed from: d  reason: collision with root package name */
    private static Executor f39286d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f39287e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile String f39288f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile String f39289g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Boolean f39290h;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicLong f39291i = new AtomicLong(65536);

    /* renamed from: j  reason: collision with root package name */
    private static volatile boolean f39292j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f39293k;

    /* renamed from: l  reason: collision with root package name */
    private static o7.I f39294l;

    /* renamed from: m  reason: collision with root package name */
    private static Context f39295m;

    /* renamed from: n  reason: collision with root package name */
    private static int f39296n = 64206;

    /* renamed from: o  reason: collision with root package name */
    private static final ReentrantLock f39297o = new ReentrantLock();

    /* renamed from: p  reason: collision with root package name */
    private static String f39298p = P.a();

    /* renamed from: q  reason: collision with root package name */
    public static boolean f39299q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f39300r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f39301s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicBoolean f39302t = new AtomicBoolean(false);

    /* renamed from: u  reason: collision with root package name */
    private static volatile String f39303u = "instagram.com";

    /* renamed from: v  reason: collision with root package name */
    private static volatile String f39304v = "facebook.com";

    /* renamed from: w  reason: collision with root package name */
    private static a f39305w = new C3463z();

    /* renamed from: x  reason: collision with root package name */
    private static boolean f39306x;

    public interface a {
        M a(C3286a aVar, String str, JSONObject jSONObject, M.b bVar);
    }

    public interface b {
        void a();
    }

    private I() {
    }

    public static final long A() {
        X.o();
        return f39291i.get();
    }

    public static final String B() {
        return "18.1.3";
    }

    /* access modifiers changed from: private */
    public static final M C(C3286a aVar, String str, JSONObject jSONObject, M.b bVar) {
        return M.f39311n.A(aVar, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f39292j;
    }

    public static final boolean E(int i10) {
        int i11 = f39296n;
        if (i10 < i11 || i10 >= i11 + 100) {
            return false;
        }
        return true;
    }

    public static final synchronized boolean F() {
        boolean z10;
        synchronized (I.class) {
            z10 = f39306x;
        }
        return z10;
    }

    public static final boolean G() {
        return f39302t.get();
    }

    public static final boolean H() {
        return f39293k;
    }

    public static final boolean I(V v10) {
        boolean z10;
        C6496s.h(v10, "behavior");
        HashSet hashSet = f39285c;
        synchronized (hashSet) {
            if (!D() || !hashSet.contains(v10)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public static final void J(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                C6496s.g(applicationInfo, "try {\n                co…     return\n            }");
                if (applicationInfo.metaData != null) {
                    if (f39287e == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            C6496s.g(locale, "ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (p.J(lowerCase, "fb", false, 2, (Object) null)) {
                                String substring = str.substring(2);
                                C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
                                f39287e = substring;
                            } else {
                                f39287e = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new C3459v("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f39288f == null) {
                        f39288f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f39289g == null) {
                        f39289g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f39296n == 64206) {
                        f39296n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f39290h == null) {
                        f39290h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private final void K(Context context, String str) {
        if (!C4049a.d(this)) {
            try {
                C3886b e10 = C3886b.f47182f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j10 = sharedPreferences.getLong(str2, 0);
                JSONObject a10 = i.a(i.a.MOBILE_INSTALL_EVENT, e10, C4039p.f48255b.c(context), z(context), context);
                String l10 = C4041s.f48273c.l();
                if (l10 != null) {
                    a10.put(Constants.INSTALL_REFERRER, l10);
                }
                U u10 = U.f71764a;
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format, "format(format, *args)");
                M a11 = f39305w.a((C3286a) null, format, a10, (M.b) null);
                if (j10 == 0 && a11.k().b() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                    J.a aVar = J.f47112e;
                    V v10 = V.APP_EVENTS;
                    String str3 = f39284b;
                    C6496s.g(str3, "TAG");
                    aVar.b(v10, str3, "MOBILE_APP_INSTALL has been logged");
                }
            } catch (JSONException e11) {
                throw new C3459v("An error occurred while publishing install.", e11);
            } catch (Exception e12) {
                W.k0("Facebook-publish", e12);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void L(Context context, String str) {
        Class<I> cls = I.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(context, "context");
                C6496s.h(str, "applicationId");
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    if (!C3905v.d("app_events_killswitch", m(), false)) {
                        t().execute(new H(applicationContext, str));
                    }
                    if (C3902s.g(C3902s.b.OnDeviceEventProcessing) && c.d()) {
                        c.g(str, "com.facebook.sdk.attributionTracking");
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void M(Context context, String str) {
        C6496s.h(context, "$applicationContext");
        C6496s.h(str, "$applicationId");
        f39283a.K(context, str);
    }

    public static final synchronized void N(Context context) {
        synchronized (I.class) {
            C6496s.h(context, "applicationContext");
            O(context, (b) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void O(android.content.Context r4, com.facebook.I.b r5) {
        /*
            java.lang.Class<com.facebook.I> r0 = com.facebook.I.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C6496s.h(r4, r1)     // Catch:{ all -> 0x0016 }
            java.util.concurrent.atomic.AtomicBoolean r1 = f39302t     // Catch:{ all -> 0x0016 }
            boolean r2 = r1.get()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x0019
            r5.a()     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r4 = move-exception
            goto L_0x0118
        L_0x0019:
            monitor-exit(r0)
            return
        L_0x001b:
            r2 = 0
            o7.X.g(r4, r2)     // Catch:{ all -> 0x0016 }
            o7.X.i(r4, r2)     // Catch:{ all -> 0x0016 }
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "applicationContext.applicationContext"
            kotlin.jvm.internal.C6496s.g(r2, r3)     // Catch:{ all -> 0x0016 }
            f39295m = r2     // Catch:{ all -> 0x0016 }
            t5.p$a r2 = t5.C4039p.f48255b     // Catch:{ all -> 0x0016 }
            r2.c(r4)     // Catch:{ all -> 0x0016 }
            android.content.Context r4 = f39295m     // Catch:{ all -> 0x0016 }
            r2 = 0
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = "applicationContext"
            kotlin.jvm.internal.C6496s.v(r4)     // Catch:{ all -> 0x0016 }
            r4 = r2
        L_0x003d:
            J(r4)     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = f39287e     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0110
            int r4 = r4.length()     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0110
            java.lang.String r4 = f39289g     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0108
            int r4 = r4.length()     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0108
            r4 = 1
            r1.set(r4)     // Catch:{ all -> 0x0016 }
            boolean r4 = o()     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0061
            j()     // Catch:{ all -> 0x0016 }
        L_0x0061:
            android.content.Context r4 = f39295m     // Catch:{ all -> 0x0016 }
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = "applicationContext"
            kotlin.jvm.internal.C6496s.v(r4)     // Catch:{ all -> 0x0016 }
            r4 = r2
        L_0x006b:
            boolean r4 = r4 instanceof android.app.Application     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = com.facebook.f0.f()     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x0087
            android.content.Context r4 = f39295m     // Catch:{ all -> 0x0016 }
            if (r4 != 0) goto L_0x007f
            java.lang.String r4 = "applicationContext"
            kotlin.jvm.internal.C6496s.v(r4)     // Catch:{ all -> 0x0016 }
            r4 = r2
        L_0x007f:
            android.app.Application r4 = (android.app.Application) r4     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = f39287e     // Catch:{ all -> 0x0016 }
            F5.g.z(r4, r1)     // Catch:{ all -> 0x0016 }
            goto L_0x008a
        L_0x0087:
            D5.r.i()     // Catch:{ all -> 0x0016 }
        L_0x008a:
            F5.j$a r4 = F5.j.f30769b     // Catch:{ all -> 0x0016 }
            F5.j r4 = r4.a()     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x00a1
            android.content.Context r1 = f39295m     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C6496s.v(r1)     // Catch:{ all -> 0x0016 }
            r1 = r2
        L_0x009c:
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0016 }
            r4.i(r1)     // Catch:{ all -> 0x0016 }
        L_0x00a1:
            o7.C3884A.h()     // Catch:{ all -> 0x0016 }
            o7.M.E()     // Catch:{ all -> 0x0016 }
            o7.c$a r4 = o7.C3887c.f47222b     // Catch:{ all -> 0x0016 }
            android.content.Context r1 = f39295m     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C6496s.v(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x00b4
        L_0x00b3:
            r2 = r1
        L_0x00b4:
            r4.a(r2)     // Catch:{ all -> 0x0016 }
            o7.I r4 = new o7.I     // Catch:{ all -> 0x0016 }
            com.facebook.A r1 = new com.facebook.A     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            r4.<init>(r1)     // Catch:{ all -> 0x0016 }
            f39294l = r4     // Catch:{ all -> 0x0016 }
            o7.s$b r4 = o7.C3902s.b.Instrument     // Catch:{ all -> 0x0016 }
            com.facebook.B r1 = new com.facebook.B     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            o7.C3902s.a(r4, r1)     // Catch:{ all -> 0x0016 }
            o7.s$b r4 = o7.C3902s.b.AppEvents     // Catch:{ all -> 0x0016 }
            com.facebook.C r1 = new com.facebook.C     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            o7.C3902s.a(r4, r1)     // Catch:{ all -> 0x0016 }
            o7.s$b r4 = o7.C3902s.b.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x0016 }
            com.facebook.D r1 = new com.facebook.D     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            o7.C3902s.a(r4, r1)     // Catch:{ all -> 0x0016 }
            o7.s$b r4 = o7.C3902s.b.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x0016 }
            com.facebook.E r1 = new com.facebook.E     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            o7.C3902s.a(r4, r1)     // Catch:{ all -> 0x0016 }
            o7.s$b r4 = o7.C3902s.b.BypassAppSwitch     // Catch:{ all -> 0x0016 }
            com.facebook.F r1 = new com.facebook.F     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            o7.C3902s.a(r4, r1)     // Catch:{ all -> 0x0016 }
            java.util.concurrent.FutureTask r4 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0016 }
            com.facebook.G r1 = new com.facebook.G     // Catch:{ all -> 0x0016 }
            r1.<init>(r5)     // Catch:{ all -> 0x0016 }
            r4.<init>(r1)     // Catch:{ all -> 0x0016 }
            java.util.concurrent.Executor r5 = t()     // Catch:{ all -> 0x0016 }
            r5.execute(r4)     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            return
        L_0x0108:
            com.facebook.v r4 = new com.facebook.v     // Catch:{ all -> 0x0016 }
            java.lang.String r5 = "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."
            r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x0016 }
            throw r4     // Catch:{ all -> 0x0016 }
        L_0x0110:
            com.facebook.v r4 = new com.facebook.v     // Catch:{ all -> 0x0016 }
            java.lang.String r5 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x0016 }
            throw r4     // Catch:{ all -> 0x0016 }
        L_0x0118:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.I.O(android.content.Context, com.facebook.I$b):void");
    }

    /* access modifiers changed from: private */
    public static final File P() {
        Context context = f39295m;
        if (context == null) {
            C6496s.v("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    /* access modifiers changed from: private */
    public static final void Q(boolean z10) {
        if (z10) {
            g.d();
        }
    }

    /* access modifiers changed from: private */
    public static final void R(boolean z10) {
        if (z10) {
            C4017J.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void S(boolean z10) {
        if (z10) {
            f39299q = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void T(boolean z10) {
        if (z10) {
            f39300r = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void U(boolean z10) {
        if (z10) {
            f39301s = true;
        }
    }

    /* access modifiers changed from: private */
    public static final Void V(b bVar) {
        C3292g.f39489f.e().j();
        Y.f39393d.a().d();
        if (C3286a.f39402l.g()) {
            W.b bVar2 = W.f39382h;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        C4039p.a aVar = C4039p.f48255b;
        aVar.f(l(), f39287e);
        f0.n();
        Context applicationContext = l().getApplicationContext();
        C6496s.g(applicationContext, "getApplicationContext().applicationContext");
        aVar.g(applicationContext).b();
        return null;
    }

    public static final void W(boolean z10) {
        f0.s(z10);
    }

    public static final void X(String str) {
        C6496s.h(str, "applicationId");
        X.j(str, "applicationId");
        f39287e = str;
    }

    public static final void Y(String str) {
        f39288f = str;
    }

    public static final void Z(boolean z10) {
        f0.t(z10);
        if (z10) {
            Context l10 = l();
            C6496s.f(l10, "null cannot be cast to non-null type android.app.Application");
            F5.g.z((Application) l10, m());
        }
    }

    public static final void a0(String str) {
        f39289g = str;
    }

    public static final void b0(String[] strArr, int i10, int i11) {
        Class<I> cls = I.class;
        if (!C4049a.d(cls)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable th2) {
                    C4049a.b(th2, cls);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data_processing_options", new JSONArray(C6559l.n1(strArr)));
                jSONObject.put("data_processing_options_country", i10);
                jSONObject.put("data_processing_options_state", i11);
                Context context = f39295m;
                if (context == null) {
                    C6496s.v("applicationContext");
                    context = null;
                }
                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
            } catch (JSONException unused) {
            }
        }
    }

    public static final void c0(String str) {
        C6496s.h(str, "graphApiVersion");
        Log.w(f39284b, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (!o7.W.e0(str) && !C6496s.c(f39298p, str)) {
            f39298p = str;
        }
    }

    public static final void j() {
        f39306x = true;
    }

    public static final boolean k() {
        return f0.d();
    }

    public static final Context l() {
        X.o();
        Context context = f39295m;
        if (context != null) {
            return context;
        }
        C6496s.v("applicationContext");
        return null;
    }

    public static final String m() {
        X.o();
        String str = f39287e;
        if (str != null) {
            return str;
        }
        throw new C3459v("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        X.o();
        return f39288f;
    }

    public static final boolean o() {
        return f0.e();
    }

    public static final boolean p() {
        return f0.f();
    }

    public static final int q() {
        X.o();
        return f39296n;
    }

    public static final String r() {
        X.o();
        String str = f39289g;
        if (str != null) {
            return str;
        }
        throw new C3459v("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return f0.g();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f39297o;
        reentrantLock.lock();
        try {
            if (f39286d == null) {
                f39286d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C6514M m10 = C6514M.f71813a;
            reentrantLock.unlock();
            Executor executor = f39286d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String u() {
        return f39304v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        String str = f39284b;
        U u10 = U.f71764a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f39298p}, 1));
        C6496s.g(format, "format(format, *args)");
        o7.W.l0(str, format);
        return f39298p;
    }

    public static final String x() {
        String str;
        C3286a e10 = C3286a.f39402l.e();
        if (e10 != null) {
            str = e10.i();
        } else {
            str = null;
        }
        return o7.W.F(str);
    }

    public static final String y() {
        return f39303u;
    }

    public static final boolean z(Context context) {
        C6496s.h(context, "context");
        X.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}

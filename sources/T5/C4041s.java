package t5;

import B5.C;
import F5.g;
import H5.c;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.C3286a;
import com.facebook.C3459v;
import com.facebook.I;
import com.facebook.V;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o7.C3884A;
import o7.C3902s;
import o7.F;
import o7.J;
import o7.W;
import o7.X;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4039p;
import t7.C4049a;

/* renamed from: t5.s  reason: case insensitive filesystem */
public final class C4041s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f48273c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f48274d;

    /* renamed from: e  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f48275e;

    /* renamed from: f  reason: collision with root package name */
    private static C4039p.b f48276f = C4039p.b.AUTO;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f48277g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static String f48278h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f48279i;

    /* renamed from: j  reason: collision with root package name */
    private static String f48280j;

    /* renamed from: a  reason: collision with root package name */
    private final String f48281a;

    /* renamed from: b  reason: collision with root package name */
    private C4024a f48282b;

    /* renamed from: t5.s$a */
    public static final class a {

        /* renamed from: t5.s$a$a  reason: collision with other inner class name */
        public static final class C0729a implements F.a {
            C0729a() {
            }

            public void a(String str) {
                C4041s.f48273c.v(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void o(Context context, C4041s sVar) {
            C6496s.h(context, "$context");
            C6496s.h(sVar, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            for (int i11 = 0; i11 < 11; i11++) {
                String str = strArr[i11];
                String str2 = strArr2[i11];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i10 |= 1 << i11;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                sVar.s("fb_sdk_initialize", (Double) null, bundle);
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r3 = new t5.C4040q();
            r2 = t5.C4041s.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r2 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            r2.scheduleAtFixedRate(r3, 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
            throw new java.lang.IllegalStateException("Required value was null.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void p() {
            /*
                r9 = this;
                java.lang.Object r0 = t5.C4041s.e()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = t5.C4041s.b()     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0037 }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x0037 }
                t5.C4041s.i(r1)     // Catch:{ all -> 0x0037 }
                lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0037 }
                monitor-exit(r0)
                t5.q r3 = new t5.q
                r3.<init>()
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = t5.C4041s.b()
                if (r2 == 0) goto L_0x002f
                r6 = 86400(0x15180, double:4.26873E-319)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r4 = 0
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x002f:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
            L_0x0037:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.C4041s.a.p():void");
        }

        /* access modifiers changed from: private */
        public static final void q() {
            HashSet<String> hashSet = new HashSet<>();
            for (C4024a b10 : C4037n.p()) {
                hashSet.add(b10.b());
            }
            for (String u10 : hashSet) {
                C3884A.u(u10, true);
            }
        }

        /* access modifiers changed from: private */
        public final void r(C4028e eVar, C4024a aVar) {
            C4037n.g(aVar, eVar);
            if (C3902s.g(C3902s.b.OnDevicePostInstallEventProcessing) && c.d()) {
                c.e(aVar.b(), eVar);
            }
            if (C3902s.g(C3902s.b.GPSARATriggers)) {
                A5.c.f29378a.i(aVar.b(), eVar);
            }
            if (C3902s.g(C3902s.b.GPSPACAProcessing)) {
                C.f29817a.e(aVar.b(), eVar);
            }
            if (!eVar.b() && !C4041s.f()) {
                if (C6496s.c(eVar.f(), "fb_mobile_activate_app")) {
                    C4041s.g(true);
                } else {
                    J.f47112e.b(V.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        /* access modifiers changed from: private */
        public final void s(String str) {
            J.f47112e.b(V.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void f(Application application, String str) {
            C6496s.h(application, "application");
            if (I.G()) {
                C4027d.e();
                W.f();
                if (str == null) {
                    str = I.m();
                }
                I.L(application, str);
                g.z(application, str);
                if (C3902s.g(C3902s.b.GPSPACAProcessing)) {
                    C.f29817a.d(str, "fb_mobile_app_install");
                }
                if (C3902s.g(C3902s.b.GPSARATriggers)) {
                    A5.c.f29378a.i(str, new C4028e("unknown", "MOBILE_INSTALL_EVENT", (Double) null, (Bundle) null, false, g.p(), g.n(), (C4022O) null));
                    return;
                }
                return;
            }
            throw new C3459v("The Facebook sdk must be initialized before calling activateApp");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.Pair g(android.os.Bundle r17, t5.C4022O r18, boolean r19) {
            /*
                r16 = this;
                r6 = r17
                boolean r0 = F5.k.g()
                java.lang.String r7 = "0"
                java.lang.String r8 = "1"
                if (r0 == 0) goto L_0x000e
                r3 = r8
                goto L_0x000f
            L_0x000e:
                r3 = r7
            L_0x000f:
                t5.O$a r15 = t5.C4022O.f48174b
                t5.P r14 = t5.C4023P.IAPParameters
                java.lang.String r2 = "is_implicit_purchase_logging_enabled"
                r0 = r15
                r1 = r14
                r4 = r17
                r5 = r18
                kotlin.Pair r0 = r0.b(r1, r2, r3, r4, r5)
                java.lang.String r1 = "fb_iap_product_id"
                java.lang.Object r1 = r15.c(r14, r1, r6, r5)
                boolean r2 = r1 instanceof java.lang.String
                r3 = 0
                if (r2 == 0) goto L_0x002e
                java.lang.String r1 = (java.lang.String) r1
                r4 = r1
                goto L_0x002f
            L_0x002e:
                r4 = r3
            L_0x002f:
                if (r19 != 0) goto L_0x0064
                if (r6 == 0) goto L_0x0039
                java.lang.String r1 = "fb_content_id"
                java.lang.String r3 = r6.getString(r1)
            L_0x0039:
                if (r3 != 0) goto L_0x0064
                if (r4 == 0) goto L_0x0064
                java.lang.String r2 = "fb_content_id"
                r0 = r15
                r1 = r14
                r3 = r4
                r4 = r17
                r5 = r18
                kotlin.Pair r0 = r0.b(r1, r2, r3, r4, r5)
                java.lang.Object r1 = r0.c()
                r13 = r1
                android.os.Bundle r13 = (android.os.Bundle) r13
                java.lang.Object r0 = r0.d()
                t5.O r0 = (t5.C4022O) r0
                java.lang.String r11 = "android_dynamic_ads_content_id"
                java.lang.String r12 = "client_manual"
                r9 = r15
                r10 = r14
                r1 = r14
                r14 = r0
                kotlin.Pair r0 = r9.b(r10, r11, r12, r13, r14)
                goto L_0x0065
            L_0x0064:
                r1 = r14
            L_0x0065:
                java.lang.Object r2 = r0.c()
                r13 = r2
                android.os.Bundle r13 = (android.os.Bundle) r13
                java.lang.Object r0 = r0.d()
                r14 = r0
                t5.O r14 = (t5.C4022O) r14
                boolean r0 = com.facebook.f0.f()
                if (r0 == 0) goto L_0x007b
                r12 = r8
                goto L_0x007c
            L_0x007b:
                r12 = r7
            L_0x007c:
                java.lang.String r11 = "is_autolog_app_events_enabled"
                r9 = r15
                r10 = r1
                kotlin.Pair r0 = r9.b(r10, r11, r12, r13, r14)
                java.lang.Object r1 = r0.c()
                android.os.Bundle r1 = (android.os.Bundle) r1
                java.lang.Object r0 = r0.d()
                t5.O r0 = (t5.C4022O) r0
                kotlin.Pair r2 = new kotlin.Pair
                r2.<init>(r1, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.C4041s.a.g(android.os.Bundle, t5.O, boolean):kotlin.Pair");
        }

        public final void h() {
            if (k() != C4039p.b.EXPLICIT_ONLY) {
                C4037n.l(C4018K.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor i() {
            if (C4041s.b() == null) {
                p();
            }
            ScheduledThreadPoolExecutor b10 = C4041s.b();
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String j(Context context) {
            C6496s.h(context, "context");
            if (C4041s.a() == null) {
                synchronized (C4041s.e()) {
                    try {
                        if (C4041s.a() == null) {
                            C4041s.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null));
                            if (C4041s.a() == null) {
                                C4041s.h("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C4041s.a()).apply();
                            }
                        }
                        C6514M m10 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String a10 = C4041s.a();
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final C4039p.b k() {
            C4039p.b c10;
            synchronized (C4041s.e()) {
                c10 = C4041s.c();
            }
            return c10;
        }

        public final String l() {
            F.d(new C0729a());
            return I.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, (String) null);
        }

        public final String m() {
            String d10;
            synchronized (C4041s.e()) {
                d10 = C4041s.d();
            }
            return d10;
        }

        public final void n(Context context, String str) {
            C6496s.h(context, "context");
            if (I.p()) {
                C4041s sVar = new C4041s(context, str, (C3286a) null);
                ScheduledThreadPoolExecutor b10 = C4041s.b();
                if (b10 != null) {
                    b10.execute(new r(context, sVar));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final void t() {
            C4037n.s();
        }

        public final void u(C4039p.b bVar) {
            C6496s.h(bVar, "flushBehavior");
            synchronized (C4041s.e()) {
                C4041s.j(bVar);
                C6514M m10 = C6514M.f71813a;
            }
        }

        public final void v(String str) {
            SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString(Constants.INSTALL_REFERRER, str).apply();
            }
        }

        public final void w(String str) {
            synchronized (C4041s.e()) {
                try {
                    if (!W.K0(C4041s.d(), str)) {
                        C4041s.k(str);
                        C4041s sVar = new C4041s(I.l(), (String) null, (C3286a) null);
                        sVar.m("fb_mobile_obtain_push_token");
                        if (C4041s.f48273c.k() != C4039p.b.EXPLICIT_ONLY) {
                            sVar.l();
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    static {
        String canonicalName = C4041s.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f48274d = canonicalName;
    }

    public C4041s(String str, String str2, C3286a aVar) {
        C6496s.h(str, "activityName");
        X.o();
        this.f48281a = str;
        aVar = aVar == null ? C3286a.f39402l.e() : aVar;
        if (aVar == null || aVar.p() || (str2 != null && !C6496s.c(str2, aVar.c()))) {
            str2 = str2 == null ? W.K(I.l()) : str2;
            if (str2 != null) {
                this.f48282b = new C4024a((String) null, str2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            this.f48282b = new C4024a(aVar);
        }
        f48273c.p();
    }

    public static final /* synthetic */ String a() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48278h;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48275e;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ C4039p.b c() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48276f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48280j;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f48277g;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        Class<C4041s> cls = C4041s.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            return f48279i;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            try {
                f48279i = z10;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void h(String str) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            try {
                f48278h = str;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            try {
                f48275e = scheduledThreadPoolExecutor;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void j(C4039p.b bVar) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            try {
                f48276f = bVar;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void k(String str) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            try {
                f48280j = str;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static /* synthetic */ void q(C4041s sVar, String str, Double d10, Bundle bundle, boolean z10, UUID uuid, C4022O o10, int i10, Object obj) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            if ((i10 & 32) != 0) {
                o10 = null;
            }
            try {
                sVar.p(str, d10, bundle, z10, uuid, o10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static /* synthetic */ void x(C4041s sVar, BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, C4022O o10, int i10, Object obj) {
        Class<C4041s> cls = C4041s.class;
        if (!C4049a.d(cls)) {
            if ((i10 & 16) != 0) {
                o10 = null;
            }
            try {
                sVar.w(bigDecimal, currency, bundle, z10, o10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void l() {
        if (!C4049a.d(this)) {
            try {
                C4037n.l(C4018K.EXPLICIT);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void m(String str) {
        if (!C4049a.d(this)) {
            try {
                o(str, (Bundle) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void n(String str, double d10, Bundle bundle) {
        if (!C4049a.d(this)) {
            try {
                q(this, str, Double.valueOf(d10), bundle, false, g.n(), (C4022O) null, 32, (Object) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void o(String str, Bundle bundle) {
        if (!C4049a.d(this)) {
            try {
                q(this, str, (Double) null, bundle, false, g.n(), (C4022O) null, 32, (Object) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba A[SYNTHETIC, Splitter:B:41:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8 A[Catch:{ JSONException -> 0x00f1, v -> 0x00ef, all -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(java.lang.String r16, java.lang.Double r17, android.os.Bundle r18, boolean r19, java.util.UUID r20, t5.C4022O r21) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r18
            r7 = r19
            r3 = r21
            java.lang.String r4 = "fb_mobile_purchase"
            boolean r5 = t7.C4049a.d(r15)
            if (r5 == 0) goto L_0x0012
            return
        L_0x0012:
            if (r0 == 0) goto L_0x0142
            int r5 = r16.length()     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001c
            goto L_0x0142
        L_0x001c:
            r5 = 0
            if (r7 != 0) goto L_0x003c
            boolean r6 = F5.k.g()     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x003c
            boolean r6 = kotlin.jvm.internal.C6496s.c(r0, r4)     // Catch:{ all -> 0x003f }
            java.lang.String r8 = "StartTrial"
            java.lang.String r9 = "Subscribe"
            if (r6 != 0) goto L_0x0042
            boolean r6 = kotlin.jvm.internal.C6496s.c(r0, r9)     // Catch:{ all -> 0x003f }
            if (r6 != 0) goto L_0x0042
            boolean r6 = kotlin.jvm.internal.C6496s.c(r0, r8)     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r6 = r17
            goto L_0x00ac
        L_0x003f:
            r0 = move-exception
            goto L_0x013f
        L_0x0042:
            java.lang.String r6 = f48274d     // Catch:{ all -> 0x003f }
            java.lang.String r10 = "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events"
            android.util.Log.w(r6, r10)     // Catch:{ all -> 0x003f }
            o7.s$b r6 = o7.C3902s.b.AndroidManualImplicitPurchaseDedupe     // Catch:{ all -> 0x003f }
            boolean r6 = o7.C3902s.g(r6)     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x0057
            boolean r4 = kotlin.jvm.internal.C6496s.c(r0, r4)     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x006b
        L_0x0057:
            o7.s$b r4 = o7.C3902s.b.AndroidManualImplicitSubsDedupe     // Catch:{ all -> 0x003f }
            boolean r4 = o7.C3902s.g(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x003c
            boolean r4 = kotlin.jvm.internal.C6496s.c(r0, r9)     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x006b
            boolean r4 = kotlin.jvm.internal.C6496s.c(r0, r8)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x003c
        L_0x006b:
            D5.p r4 = D5.p.f30510a     // Catch:{ all -> 0x003f }
            r6 = r17
            java.lang.Double r8 = r4.g(r6, r2)     // Catch:{ all -> 0x003f }
            java.util.Currency r9 = r4.b(r2)     // Catch:{ all -> 0x003f }
            if (r8 == 0) goto L_0x00ac
            if (r9 == 0) goto L_0x00ac
            D5.a r10 = new D5.a     // Catch:{ all -> 0x003f }
            double r11 = r8.doubleValue()     // Catch:{ all -> 0x003f }
            r10.<init>(r0, r11, r9)     // Catch:{ all -> 0x003f }
            java.util.List r8 = mf.C6565s.e(r10)     // Catch:{ all -> 0x003f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            kotlin.Pair r11 = new kotlin.Pair     // Catch:{ all -> 0x003f }
            r11.<init>(r2, r3)     // Catch:{ all -> 0x003f }
            java.util.List r11 = mf.C6565s.e(r11)     // Catch:{ all -> 0x003f }
            android.os.Bundle r8 = D5.s.f(r8, r9, r5, r11)     // Catch:{ all -> 0x003f }
            kotlin.Pair r2 = r4.a(r8, r2, r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r3 = r2.a()     // Catch:{ all -> 0x003f }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x003f }
            t5.O r2 = (t5.C4022O) r2     // Catch:{ all -> 0x003f }
            r14 = r3
            r3 = r2
            r2 = r14
        L_0x00ac:
            java.lang.String r4 = "app_events_killswitch"
            java.lang.String r8 = com.facebook.I.m()     // Catch:{ all -> 0x003f }
            boolean r4 = o7.C3905v.d(r4, r8, r5)     // Catch:{ all -> 0x003f }
            java.lang.String r11 = "AppEvents"
            if (r4 == 0) goto L_0x00c8
            o7.J$a r2 = o7.J.f47112e     // Catch:{ all -> 0x003f }
            com.facebook.V r3 = com.facebook.V.APP_EVENTS     // Catch:{ all -> 0x003f }
            java.lang.String r4 = "KillSwitch is enabled and fail to log app event: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r16}     // Catch:{ all -> 0x003f }
            r2.c(r3, r11, r4, r0)     // Catch:{ all -> 0x003f }
            return
        L_0x00c8:
            boolean r4 = E5.b.b(r16)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x00cf
            return
        L_0x00cf:
            t5.s$a r12 = f48273c     // Catch:{ all -> 0x003f }
            kotlin.Pair r2 = r12.g(r2, r3, r7)     // Catch:{ all -> 0x003f }
            java.lang.Object r3 = r2.a()     // Catch:{ all -> 0x003f }
            r8 = r3
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x003f }
            r10 = r2
            t5.O r10 = (t5.C4022O) r10     // Catch:{ all -> 0x003f }
            E5.e r2 = E5.e.f30649a     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            boolean r2 = r2.g(r8)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            if (r2 != 0) goto L_0x00f3
            E5.g.c(r8, r0)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            goto L_0x011b
        L_0x00f1:
            r0 = move-exception
            goto L_0x012d
        L_0x00f3:
            E5.a.d(r8)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            E5.d.h(r8, r0)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            E5.h.g(r8)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            E5.e.f(r8)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            t5.e r13 = new t5.e     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            java.lang.String r3 = r1.f48281a     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            boolean r9 = F5.g.p()     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            r2 = r13
            r4 = r16
            r5 = r17
            r6 = r8
            r7 = r19
            r8 = r9
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            t5.a r0 = r1.f48282b     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            r12.r(r13, r0)     // Catch:{ JSONException -> 0x00f1, v -> 0x00ef }
            goto L_0x013e
        L_0x011b:
            o7.J$a r2 = o7.J.f47112e     // Catch:{ all -> 0x003f }
            com.facebook.V r3 = com.facebook.V.APP_EVENTS     // Catch:{ all -> 0x003f }
            java.lang.String r4 = "Invalid app event: %s"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x003f }
            r2.c(r3, r11, r4, r0)     // Catch:{ all -> 0x003f }
            goto L_0x013e
        L_0x012d:
            o7.J$a r2 = o7.J.f47112e     // Catch:{ all -> 0x003f }
            com.facebook.V r3 = com.facebook.V.APP_EVENTS     // Catch:{ all -> 0x003f }
            java.lang.String r4 = "JSON encoding for app event failed: '%s'"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x003f }
            r2.c(r3, r11, r4, r0)     // Catch:{ all -> 0x003f }
        L_0x013e:
            return
        L_0x013f:
            t7.C4049a.b(r0, r15)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4041s.p(java.lang.String, java.lang.Double, android.os.Bundle, boolean, java.util.UUID, t5.O):void");
    }

    public final void r(String str, String str2) {
        if (!C4049a.d(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                o(str, bundle);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void s(String str, Double d10, Bundle bundle) {
        if (!C4049a.d(this)) {
            try {
                q(this, str, d10, bundle, true, g.n(), (C4022O) null, 32, (Object) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void t(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, C4022O o10) {
        if (!C4049a.d(this)) {
            if (bigDecimal == null || currency == null) {
                W.l0(f48274d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            p(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, g.n(), o10);
        }
    }

    public final void u(String str, C4039p.c cVar, C4039p.d dVar, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (!C4049a.d(this)) {
            if (str == null) {
                try {
                    f48273c.s("itemID cannot be null");
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            } else if (cVar == null) {
                f48273c.s("availability cannot be null");
            } else if (dVar == null) {
                f48273c.s("condition cannot be null");
            } else if (str2 == null) {
                f48273c.s("description cannot be null");
            } else if (str3 == null) {
                f48273c.s("imageLink cannot be null");
            } else if (str4 == null) {
                f48273c.s("link cannot be null");
            } else if (str5 == null) {
                f48273c.s("title cannot be null");
            } else if (bigDecimal == null) {
                f48273c.s("priceAmount cannot be null");
            } else if (currency == null) {
                f48273c.s("currency cannot be null");
            } else if (str6 == null && str7 == null && str8 == null) {
                f48273c.s("Either gtin, mpn or brand is required");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("fb_product_item_id", str);
                bundle.putString("fb_product_availability", cVar.name());
                bundle.putString("fb_product_condition", dVar.name());
                bundle.putString("fb_product_description", str2);
                bundle.putString("fb_product_image_link", str3);
                bundle.putString("fb_product_link", str4);
                bundle.putString("fb_product_title", str5);
                bundle.putString("fb_product_price_amount", bigDecimal.setScale(3, 4).toString());
                bundle.putString("fb_product_price_currency", currency.getCurrencyCode());
                if (str6 != null) {
                    bundle.putString("fb_product_gtin", str6);
                }
                if (str7 != null) {
                    bundle.putString("fb_product_mpn", str7);
                }
                if (str8 != null) {
                    bundle.putString("fb_product_brand", str8);
                }
                o("fb_mobile_catalog_update", bundle);
                f48273c.h();
            }
        }
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C4049a.d(this)) {
            try {
                x(this, bigDecimal, currency, bundle, false, (C4022O) null, 16, (Object) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void w(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, C4022O o10) {
        if (!C4049a.d(this)) {
            if (bigDecimal == null) {
                try {
                    f48273c.s("purchaseAmount cannot be null");
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            } else if (currency == null) {
                f48273c.s("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                p("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, g.n(), o10);
                f48273c.h();
            }
        }
    }

    public final void y(BigDecimal bigDecimal, Currency currency, Bundle bundle, C4022O o10) {
        if (!C4049a.d(this)) {
            try {
                w(bigDecimal, currency, bundle, true, o10);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void z(Bundle bundle, String str) {
        String str2;
        if (!C4049a.d(this)) {
            try {
                C6496s.h(bundle, "payload");
                try {
                    String string = bundle.getString("fb_push_payload");
                    if (!W.e0(string)) {
                        str2 = new JSONObject(string).getString("campaign");
                        if (str2 == null) {
                            J.f47112e.b(V.DEVELOPER_ERRORS, f48274d, "Malformed payload specified for logging a push notification open.");
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("fb_push_campaign", str2);
                        if (str != null) {
                            bundle2.putString("fb_push_action", str);
                        }
                        o("fb_mobile_push_opened", bundle2);
                    }
                } catch (JSONException unused) {
                    str2 = null;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public C4041s(Context context, String str, C3286a aVar) {
        this(W.u(context), str, aVar);
    }
}

package Fe;

import Ce.a;
import Fe.C3023l;
import Fe.I;
import Fe.K;
import Fe.U;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import s.C2576d;

/* renamed from: Fe.e  reason: case insensitive filesystem */
public class C3016e {

    /* renamed from: A  reason: collision with root package name */
    private static boolean f31037A;

    /* renamed from: B  reason: collision with root package name */
    static boolean f31038B = false;

    /* renamed from: C  reason: collision with root package name */
    private static boolean f31039C = false;

    /* renamed from: D  reason: collision with root package name */
    static boolean f31040D;

    /* renamed from: E  reason: collision with root package name */
    static boolean f31041E = false;

    /* renamed from: F  reason: collision with root package name */
    private static C3016e f31042F;

    /* renamed from: G  reason: collision with root package name */
    private static boolean f31043G = false;

    /* renamed from: H  reason: collision with root package name */
    static boolean f31044H = false;

    /* renamed from: I  reason: collision with root package name */
    private static final String[] f31045I = {"extra_launch_uri", "branch_intent"};

    /* renamed from: J  reason: collision with root package name */
    public static String f31046J = null;

    /* renamed from: K  reason: collision with root package name */
    private static boolean f31047K = false;

    /* renamed from: L  reason: collision with root package name */
    private static String f31048L = null;

    /* renamed from: M  reason: collision with root package name */
    private static String f31049M = null;

    /* renamed from: w  reason: collision with root package name */
    private static final String f31050w;

    /* renamed from: x  reason: collision with root package name */
    private static final String f31051x;

    /* renamed from: y  reason: collision with root package name */
    static boolean f31052y;

    /* renamed from: z  reason: collision with root package name */
    public static String f31053z = "";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f31054a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public He.a f31055b;

    /* renamed from: c  reason: collision with root package name */
    final E f31056c;

    /* renamed from: d  reason: collision with root package name */
    private final C f31057d;

    /* renamed from: e  reason: collision with root package name */
    private final C3025n f31058e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f31059f;

    /* renamed from: g  reason: collision with root package name */
    private final C3027p f31060g;

    /* renamed from: h  reason: collision with root package name */
    private final C3019h f31061h;

    /* renamed from: i  reason: collision with root package name */
    public final N f31062i;

    /* renamed from: j  reason: collision with root package name */
    final ConcurrentHashMap f31063j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    private C2576d f31064k;

    /* renamed from: l  reason: collision with root package name */
    private k f31065l = k.PENDING;

    /* renamed from: m  reason: collision with root package name */
    n f31066m = n.UNINITIALISED;

    /* renamed from: n  reason: collision with root package name */
    public boolean f31067n = false;

    /* renamed from: o  reason: collision with root package name */
    private S f31068o;

    /* renamed from: p  reason: collision with root package name */
    WeakReference f31069p;

    /* renamed from: q  reason: collision with root package name */
    CountDownLatch f31070q = null;

    /* renamed from: r  reason: collision with root package name */
    CountDownLatch f31071r = null;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f31072s = false;

    /* renamed from: t  reason: collision with root package name */
    private C3017f f31073t;

    /* renamed from: u  reason: collision with root package name */
    private final W f31074u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public l f31075v;

    /* renamed from: Fe.e$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C3016e.this.G0();
        }
    }

    /* renamed from: Fe.e$b */
    class b implements U.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I f31077a;

        b(I i10) {
            this.f31077a = i10;
        }

        public void a() {
            this.f31077a.D(I.b.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            C3023l.l("INSTALL_REFERRER_FETCH_WAIT_LOCK removed");
            C3016e.this.f31062i.v("onInstallReferrersFinished");
        }
    }

    /* renamed from: Fe.e$c */
    class c implements U.e {
        c() {
        }

        public void a() {
            C3016e.this.f31062i.y(I.b.GAID_FETCH_WAIT_LOCK);
            C3016e.this.f31062i.v("onAdsParamsFetchFinished");
        }
    }

    /* renamed from: Fe.e$d */
    public interface d {
        void a(String str, C3020i iVar);
    }

    /* renamed from: Fe.e$e  reason: collision with other inner class name */
    public interface C0512e {
        void a();

        void b();

        void c(String str, String str2, C3020i iVar);

        void d(String str);
    }

    /* renamed from: Fe.e$f */
    public interface f {
        void a(String str, C3020i iVar);
    }

    /* renamed from: Fe.e$g */
    public interface g {
        void a(JSONObject jSONObject, C3020i iVar);
    }

    /* renamed from: Fe.e$h */
    public interface h {
    }

    /* renamed from: Fe.e$i */
    private class i extends AsyncTask {
        private i() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Q doInBackground(I... iArr) {
            He.a a10 = C3016e.this.f31055b;
            JSONObject l10 = iArr[0].l();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3016e.this.f31056c.f());
            B b10 = B.GetURL;
            sb2.append(b10.b());
            return a10.f(l10, sb2.toString(), b10.b(), C3016e.this.f31056c.r());
        }

        /* synthetic */ i(C3016e eVar, a aVar) {
            this();
        }
    }

    /* renamed from: Fe.e$j */
    public interface j {
    }

    /* renamed from: Fe.e$k */
    enum k {
        PENDING,
        READY
    }

    /* renamed from: Fe.e$l */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private g f31084a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31085b;

        /* renamed from: c  reason: collision with root package name */
        private int f31086c;

        /* renamed from: d  reason: collision with root package name */
        private Uri f31087d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f31088e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31089f;

        /* synthetic */ l(Activity activity, a aVar) {
            this(activity);
        }

        private void a(l lVar) {
            l unused = C3016e.X().f31075v = this;
            C3023l.l("Session initialization deferred until plugin invokes notifyNativeToInit()\nCaching Session Builder " + C3016e.X().f31075v + "\nuri: " + C3016e.X().f31075v.f31087d + "\ncallback: " + C3016e.X().f31075v.f31084a + "\nisReInitializing: " + C3016e.X().f31075v.f31089f + "\ndelay: " + C3016e.X().f31075v.f31086c + "\nisAutoInitialization: " + C3016e.X().f31075v.f31085b + "\nignoreIntent: " + C3016e.X().f31075v.f31088e);
        }

        public void b() {
            Intent intent;
            Uri uri;
            Uri uri2;
            C3023l.l("Beginning session initialization");
            C3023l.l("Session uri is " + this.f31087d);
            C3023l.l("Callback is " + this.f31084a);
            C3023l.l("Is auto init " + this.f31085b);
            C3023l.l("Will ignore intent " + this.f31088e);
            C3023l.l("Is reinitializing " + this.f31089f);
            if (C3016e.f31044H) {
                C3023l.l("Session init is deferred until signaled by plugin.");
                a(this);
                return;
            }
            C3016e X10 = C3016e.X();
            if (X10 == null) {
                C3023l.e("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
                return;
            }
            Boolean bool = this.f31088e;
            if (bool != null) {
                C3016e.m(bool.booleanValue());
            }
            Activity R10 = X10.R();
            if (R10 != null) {
                intent = R10.getIntent();
            } else {
                intent = null;
            }
            if (R10 != null) {
                uri = androidx.core.app.b.d(R10);
            } else {
                uri = null;
            }
            C3023l.l("Activity: " + R10);
            C3023l.l("Intent: " + intent);
            C3023l.l("Initial Referrer: " + uri);
            if (!(R10 == null || intent == null || uri == null)) {
                E.G(R10).K0(uri.toString());
            }
            Uri uri3 = this.f31087d;
            if (uri3 != null) {
                X10.C0(uri3, R10);
            } else if (this.f31089f && X10.q0(intent)) {
                if (intent != null) {
                    uri2 = intent.getData();
                } else {
                    uri2 = null;
                }
                X10.C0(uri2, R10);
            } else if (this.f31089f) {
                g gVar = this.f31084a;
                if (gVar != null) {
                    gVar.a((JSONObject) null, new C3020i("", -119));
                    return;
                }
                return;
            }
            C3023l.l("isInstantDeepLinkPossible " + X10.f31072s);
            if (X10.f31072s) {
                boolean unused = X10.f31072s = false;
                g gVar2 = this.f31084a;
                if (gVar2 != null) {
                    gVar2.a(X10.Z(), (C3020i) null);
                }
                C3016e.X().f31062i.b(y.InstantDeepLinkSession.b(), com.amazon.a.a.o.b.f37475af);
                X10.n();
                this.f31084a = null;
            }
            if (this.f31086c > 0) {
                C3016e.D(true);
            }
            L W10 = X10.W(this.f31084a, this.f31085b);
            C3023l.a("Creating " + W10 + " from init on thread " + Thread.currentThread().getName());
            X10.j0(W10, this.f31086c);
        }

        /* access modifiers changed from: package-private */
        public l c(boolean z10) {
            this.f31085b = z10;
            return this;
        }

        public void d() {
            this.f31089f = true;
            b();
        }

        public l e(g gVar) {
            C3023l.l("InitSessionBuilder setting BranchReferralInitListener withCallback with " + gVar);
            this.f31084a = gVar;
            return this;
        }

        public l f(Uri uri) {
            C3023l.l("InitSessionBuilder setting withData with " + uri);
            this.f31087d = uri;
            return this;
        }

        private l(Activity activity) {
            C3016e X10 = C3016e.X();
            if (activity == null) {
                return;
            }
            if (X10.R() == null || !X10.R().getLocalClassName().equals(activity.getLocalClassName())) {
                C3023l.l("currentActivityReference_ was " + X10.f31069p);
                X10.f31069p = new WeakReference(activity);
                C3023l.l("currentActivityReference_ is now set to " + X10.f31069p);
            }
        }
    }

    /* renamed from: Fe.e$m */
    public interface m {
        void a(boolean z10, C3020i iVar);
    }

    /* renamed from: Fe.e$n */
    enum n {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    /* renamed from: Fe.e$o */
    public interface o {
        void a(boolean z10, JSONObject jSONObject, C3020i iVar);
    }

    static {
        String str = "io.branch.sdk.android:library:" + e0();
        f31050w = str;
        f31051x = "!SDK-VERSION-STRING!:" + str;
    }

    private C3016e(Context context) {
        this.f31059f = context;
        this.f31056c = E.G(context);
        this.f31074u = new W(context);
        this.f31055b = new He.b(this);
        this.f31057d = new C(context);
        this.f31058e = new C3025n(context);
        this.f31060g = new C3027p(context);
        this.f31061h = new C3019h();
        this.f31062i = N.h(context);
    }

    public static void A(De.a aVar) {
        B(aVar, C3023l.a.VERBOSE);
    }

    public static void B(De.a aVar, C3023l.a aVar2) {
        C3023l.f(aVar);
        C3023l.h(aVar2);
        C3023l.g(true);
        C3023l.e(f31051x);
    }

    private boolean B0(String str, String str2) {
        String[] split = str.split("\\?")[0].split("/");
        String[] split2 = str2.split("\\?")[0].split("/");
        if (split.length != split2.length) {
            return false;
        }
        int i10 = 0;
        while (i10 < split.length && i10 < split2.length) {
            String str3 = split[i10];
            if (!str3.equals(split2[i10]) && !str3.contains("*")) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private void C() {
        n nVar = this.f31066m;
        n nVar2 = n.UNINITIALISED;
        if (nVar != nVar2) {
            Q0(nVar2);
        }
    }

    /* access modifiers changed from: private */
    public void C0(Uri uri, Activity activity) {
        boolean z10;
        Intent intent;
        C3023l.l("Read params uri: " + uri + " bypassCurrentActivityIntentState: " + f31039C + " intent state: " + this.f31065l);
        if (this.f31061h.e()) {
            if (this.f31065l == k.READY || !this.f31073t.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3023l.l("activityHasValidIntent: " + z10);
            if (activity != null) {
                intent = activity.getIntent();
            } else {
                intent = null;
            }
            boolean q02 = q0(intent);
            if (z10 && !q02) {
                J(uri, activity);
            }
        }
        if (f31039C) {
            this.f31065l = k.READY;
        }
        if (this.f31065l == k.READY) {
            H(uri, activity);
            I(activity);
            if (!F(activity) && !k0(activity) && !G(uri, activity)) {
                E(uri, activity);
            }
        }
    }

    public static void D(boolean z10) {
        f31040D = z10;
        C3016e X10 = X();
        if (X10 != null && z10) {
            X10.f31061h.i(true);
        }
    }

    private void E(Uri uri, Activity activity) {
        if (uri != null && activity != null) {
            String scheme = uri.getScheme();
            Intent intent = activity.getIntent();
            if (scheme != null && intent != null) {
                if ((scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(Constants.SCHEME)) && !TextUtils.isEmpty(uri.getHost()) && !o0(activity)) {
                    if (uri.toString().equalsIgnoreCase(X.d(this.f31059f).e(uri.toString()))) {
                        this.f31056c.w0(uri.toString());
                    }
                    intent.putExtra(C3034x.BranchLinkUsed.b(), true);
                    activity.setIntent(intent);
                }
            }
        }
    }

    public static void E0(String str, String str2) {
        f31049M = str;
        f31048L = str2;
    }

    private boolean F(Activity activity) {
        String str;
        C3023l.l("extractBranchLinkFromIntentExtra " + activity);
        if (activity == null) {
            return false;
        }
        try {
            if (activity.getIntent() == null || activity.getIntent().getExtras() == null || o0(activity)) {
                return false;
            }
            Object obj = activity.getIntent().getExtras().get(C3034x.BranchURI.b());
            if (obj instanceof String) {
                str = (String) obj;
            } else if (obj instanceof Uri) {
                str = ((Uri) obj).toString();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.f31056c.T0(str);
            Intent intent = activity.getIntent();
            intent.putExtra(C3034x.BranchLinkUsed.b(), true);
            activity.setIntent(intent);
            return true;
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
            return false;
        }
    }

    private boolean G(Uri uri, Activity activity) {
        String str;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    String queryParameter = uri.getQueryParameter(y.LinkClickID.b());
                    if (queryParameter == null) {
                        return false;
                    }
                    this.f31056c.R0(queryParameter);
                    String str2 = "link_click_id=" + queryParameter;
                    String uri2 = uri.toString();
                    if (str2.equals(uri.getQuery())) {
                        str = "\\?" + str2;
                    } else if (uri2.length() - str2.length() == uri2.indexOf(str2)) {
                        str = "&" + str2;
                    } else {
                        str = str2 + "&";
                    }
                    activity.getIntent().setData(Uri.parse(uri2.replaceFirst(str, "")));
                    activity.getIntent().putExtra(C3034x.BranchLinkUsed.b(), true);
                    return true;
                }
            } catch (Exception e10) {
                C3023l.a(e10.getMessage());
            }
        }
        return false;
    }

    private void H(Uri uri, Activity activity) {
        C3023l.l("extractExternalUriAndIntentExtras " + uri + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + activity);
        try {
            if (!o0(activity)) {
                String e10 = X.d(this.f31059f).e(uri.toString());
                this.f31056c.H0(e10);
                if (e10.equals(uri.toString())) {
                    Bundle extras = activity.getIntent().getExtras();
                    Set<String> keySet = extras.keySet();
                    if (!keySet.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : f31045I) {
                            if (keySet.contains(str)) {
                                jSONObject.put(str, extras.get(str));
                            }
                        }
                        if (jSONObject.length() > 0) {
                            this.f31056c.G0(jSONObject.toString());
                        }
                    }
                }
            }
        } catch (Exception e11) {
            C3023l.a(e11.getMessage());
        }
    }

    public static l H0(Activity activity) {
        return new l(activity, (a) null);
    }

    private void I(Activity activity) {
        C3023l.l("extractInitialReferrer " + activity);
        if (activity != null) {
            Uri d10 = androidx.core.app.b.d(activity);
            C3023l.l("Initial referrer: " + d10);
            if (d10 != null) {
                this.f31056c.K0(d10.toString());
            }
        }
    }

    public static void I0(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            E.p0(str);
            C3023l.l("setAPIUrl: Branch API URL was set to " + str);
            return;
        }
        C3023l.m("setAPIUrl: URL cannot be empty or null");
    }

    private void J(Uri uri, Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            Intent intent = activity.getIntent();
            if (uri != null) {
                try {
                    if (!o0(activity)) {
                        C3034x xVar = C3034x.BranchData;
                        if (!TextUtils.isEmpty(intent.getStringExtra(xVar.b()))) {
                            String stringExtra = intent.getStringExtra(xVar.b());
                            if (stringExtra != null) {
                                JSONObject jSONObject = new JSONObject(stringExtra);
                                jSONObject.put(y.Clicked_Branch_Link.b(), true);
                                this.f31056c.a1(jSONObject.toString());
                                this.f31072s = true;
                            }
                            intent.removeExtra(xVar.b());
                            activity.setIntent(intent);
                            return;
                        } else if (uri.isHierarchical() && Boolean.valueOf(uri.getQueryParameter(y.Instant.b())).booleanValue()) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (String next : uri.getQueryParameterNames()) {
                                jSONObject2.put(next, uri.getQueryParameter(next));
                            }
                            jSONObject2.put(y.Clicked_Branch_Link.b(), true);
                            this.f31056c.a1(jSONObject2.toString());
                            this.f31072s = true;
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (JSONException e10) {
                    C3023l.a(e10.getMessage());
                    return;
                }
            }
            if (!this.f31056c.F().equals("bnc_no_value")) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(y.IsFirstSession.b(), false);
                this.f31056c.a1(jSONObject3.toString());
                this.f31072s = true;
            }
        }
    }

    private void J0(Application application) {
        C3023l.l("setActivityLifeCycleObserver activityLifeCycleObserver: " + this.f31073t + " application: " + application);
        try {
            this.f31073t = new C3017f();
            C3023l.l("setActivityLifeCycleObserver set new activityLifeCycleObserver: " + this.f31073t + " application: " + application);
            application.unregisterActivityLifecycleCallbacks(this.f31073t);
            application.registerActivityLifecycleCallbacks(this.f31073t);
            f31043G = true;
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            f31043G = false;
            C3023l.l(new C3020i("", -108).b());
        }
    }

    private String L(J j10) {
        Q q10;
        String str = null;
        try {
            q10 = (Q) new i(this, (a) null).execute(new I[]{j10}).get((long) (this.f31056c.c0() + 2000), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            C3023l.a(e10.getMessage());
            q10 = null;
        }
        if (j10.W()) {
            str = j10.S();
        }
        if (q10 != null && q10.d() == 200) {
            try {
                str = q10.c().getString("url");
                if (j10.R() != null) {
                    this.f31063j.put(j10.R(), str);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return str;
    }

    public static synchronized C3016e N(Context context) {
        C3016e eVar;
        synchronized (C3016e.class) {
            try {
                if (f31042F == null) {
                    if (C3031u.g(context)) {
                        z();
                    }
                    w(C3031u.e(context));
                    C3031u.q(context);
                    C3031u.t(context);
                    C3031u.s(context);
                    C3031u.u(C3031u.a(context));
                    C3016e h02 = h0(context, C3031u.k(context));
                    f31042F = h02;
                    C3026o.c(h02, context);
                }
                eVar = f31042F;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    public static void N0(String str) {
        if (!TextUtils.isEmpty(str)) {
            E.f30847k = str;
            C3023l.l("setFBAppID to " + str);
            return;
        }
        C3023l.m("setFBAppID: fbAppID cannot be empty or null");
    }

    public static synchronized C3016e X() {
        C3016e eVar;
        synchronized (C3016e.class) {
            try {
                if (f31042F == null) {
                    C3023l.l("Branch instance is not created yet. Make sure you call getAutoInstance(Context).");
                }
                eVar = f31042F;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    static String b0() {
        return f31049M;
    }

    public static String c0() {
        return f31048L;
    }

    public static String e0() {
        return "5.19.0";
    }

    private static synchronized C3016e h0(Context context, String str) {
        synchronized (C3016e.class) {
            if (f31042F != null) {
                C3023l.m("Warning, attempted to reinitialize Branch SDK singleton!");
                C3016e eVar = f31042F;
                return eVar;
            }
            f31042F = new C3016e(context.getApplicationContext());
            if (TextUtils.isEmpty(str)) {
                C3023l.m("Warning: Please enter your branch_key in your project's Manifest file!");
                f31042F.f31056c.B0("bnc_no_value");
            } else {
                f31042F.f31056c.B0(str);
                if (!str.equals(C3031u.k(context))) {
                    f31042F.f31056c.C0("init_function");
                }
            }
            if (context instanceof Application) {
                f31042F.J0((Application) context);
            }
            C3016e eVar2 = f31042F;
            return eVar2;
        }
    }

    private void i0(I i10) {
        C3023l.l("initTasks " + i10);
        if (this.f31065l != k.READY && s0()) {
            i10.d(I.b.INTENT_PENDING_WAIT_LOCK);
            C3023l.l("Added INTENT_PENDING_WAIT_LOCK");
        }
        if (i10 instanceof O) {
            i10.d(I.b.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            C3023l.l("Added INSTALL_REFERRER_FETCH_WAIT_LOCK");
            this.f31057d.f().d(this.f31059f, new b(i10));
        }
        i10.d(I.b.GAID_FETCH_WAIT_LOCK);
        C3023l.l("Added GAID_FETCH_WAIT_LOCK");
        this.f31057d.f().a(this.f31059f, new c());
    }

    /* access modifiers changed from: private */
    public void j0(L l10, int i10) {
        Intent intent;
        C3023l.l("initializeSession " + l10 + " delay " + i10);
        if (this.f31056c.r() == null || this.f31056c.r().equalsIgnoreCase("bnc_no_value")) {
            Q0(n.UNINITIALISED);
            g gVar = l10.f30922m;
            if (gVar != null) {
                gVar.a((JSONObject) null, new C3020i("Trouble initializing Branch.", -114));
            }
            C3023l.m("Warning: Please enter your branch_key in your project's manifest");
            return;
        }
        if (C3031u.j()) {
            C3023l.m("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        if (i10 > 0) {
            l10.d(I.b.USER_SET_WAIT_LOCK);
            new Handler().postDelayed(new a(), (long) i10);
        }
        if (R() != null) {
            intent = R().getIntent();
        } else {
            intent = null;
        }
        boolean q02 = q0(intent);
        n V10 = V();
        C3023l.l("Intent: " + intent + " forceBranchSession: " + q02 + " initState: " + V10);
        if (V10 == n.UNINITIALISED || q02) {
            if (q02 && intent != null) {
                intent.removeExtra(C3034x.ForceNewBranchSession.b());
            }
            D0(l10, q02);
            return;
        }
        g gVar2 = l10.f30922m;
        if (gVar2 != null) {
            gVar2.a((JSONObject) null, new C3020i("Warning.", -118));
        }
    }

    private JSONObject k(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = this.f31054a;
                if (jSONObject2 != null) {
                    if (jSONObject2.length() > 0) {
                        C3023l.l("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
                    }
                    Iterator<String> keys = this.f31054a.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.f31054a.get(next));
                    }
                }
            } catch (Exception e10) {
                C3023l.a(e10.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean k0(Activity activity) {
        if (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) {
            return false;
        }
        return true;
    }

    public static boolean l() {
        return f31039C;
    }

    public static boolean l0() {
        return f31037A;
    }

    public static void m(boolean z10) {
        f31038B = z10;
    }

    private boolean o(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String has : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(com.amazon.a.a.o.b.f.f37529a)) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean o0(Activity activity) {
        boolean z10 = false;
        if (!(activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(C3034x.BranchLinkUsed.b(), false))) {
            z10 = true;
        }
        C3023l.l("isIntentParamsAlreadyConsumed " + z10);
        return z10;
    }

    private boolean p(JSONObject jSONObject, ActivityInfo activityInfo) {
        String str = null;
        try {
            y yVar = y.AndroidDeepLinkPath;
            if (jSONObject.has(yVar.b())) {
                str = jSONObject.getString(yVar.b());
            } else {
                y yVar2 = y.DeepLinkPath;
                if (jSONObject.has(yVar2.b())) {
                    str = jSONObject.getString(yVar2.b());
                }
            }
        } catch (JSONException e10) {
            C3023l.a(e10.getMessage());
        }
        if (!(activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null || str == null)) {
            for (String trim : activityInfo.metaData.getString("io.branch.sdk.auto_link_path").split(com.amazon.a.a.o.b.f.f37529a)) {
                if (B0(trim.trim(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p0() {
        return f31041E;
    }

    private boolean q(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra(C3034x.ForceNewBranchSession.b(), false);
        }
        return false;
    }

    private boolean r(Intent intent) {
        boolean z10;
        if (intent == null) {
            return false;
        }
        if (intent.getStringExtra(C3034x.BranchURI.b()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean booleanExtra = intent.getBooleanExtra(C3034x.BranchLinkUsed.b(), false);
        if (!z10 || booleanExtra) {
            return false;
        }
        return true;
    }

    public static boolean s0() {
        return !f31038B;
    }

    private void t0(String str, Activity activity) {
        u0(new C2576d.a().a(), str, activity);
    }

    private void u0(C2576d dVar, String str, Activity activity) {
        try {
            this.f31056c.e1(y.IN_APP_WEBVIEW.b());
            this.f31056c.d1(System.currentTimeMillis());
            dVar.a(activity, Uri.parse(str));
        } catch (Exception e10) {
            C3023l.b("launchCustomTabBrowser caught exception: " + e10);
        }
    }

    private JSONObject v(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(C3015d.a(str.getBytes(), 2)));
            } catch (JSONException e10) {
                e10.printStackTrace();
                return new JSONObject();
            }
        }
    }

    private void v0(String str) {
        try {
            this.f31056c.e1(y.EXTERNAL_BROWSER.b());
            this.f31056c.d1(System.currentTimeMillis());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            this.f31059f.startActivity(intent);
        } catch (Exception e10) {
            C3023l.b("launchExternalBrowser caught exception: " + e10);
        }
    }

    static void w(boolean z10) {
        C3023l.l("deferInitForPluginRuntime " + z10);
        f31044H = z10;
        if (z10) {
            D(true);
            if (X() != null) {
                X().f31061h.h(true);
            }
        }
    }

    public static void y0() {
        C3023l.l("notifyNativeToInit deferredSessionBuilder " + X().f31075v);
        n V10 = X().V();
        if (V10 == n.UNINITIALISED) {
            f31044H = false;
            if (X().f31075v != null) {
                X().f31075v.b();
                return;
            }
            return;
        }
        C3023l.l("notifyNativeToInit session is not uninitialized. Session state is " + V10);
    }

    public static void z() {
        B((De.a) null, C3023l.a.VERBOSE);
    }

    public void A0(JSONObject jSONObject) {
        String str;
        C3023l.l("openBrowserExperience JSONObject: " + String.valueOf(jSONObject));
        if (jSONObject == null) {
            try {
                C3023l.b("openBrowserExperience: jsonObject is null");
            } catch (Exception e10) {
                C3023l.b("openBrowserExperience caught exception: " + e10);
            }
        } else {
            y yVar = y.Enhanced_Web_Link_UX;
            String str2 = null;
            if (jSONObject.has(yVar.b())) {
                str = jSONObject.optString(yVar.b(), (String) null);
            } else {
                str = null;
            }
            y yVar2 = y.Web_Link_Redirect_URL;
            if (jSONObject.has(yVar2.b())) {
                str2 = jSONObject.optString(yVar2.b(), (String) null);
            }
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    boolean a10 = Ie.f.a("androidx.browser.customtabs.CustomTabsIntent");
                    if (!y.IN_APP_WEBVIEW.b().equals(str) || !a10) {
                        C3023l.l("customTabsImported " + a10);
                        C3023l.l("Opening in external browser.");
                        v0(str2);
                        return;
                    } else if (this.f31064k != null) {
                        C3023l.l("Using developer specified CustomTabs");
                        u0(this.f31064k, str2, R());
                        return;
                    } else {
                        C3023l.l("Using default CustomTabs");
                        t0(str2, R());
                        return;
                    }
                }
            }
            C3023l.b("openBrowserExperience: weblinkUrl is null or empty");
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(L l10, boolean z10) {
        C3023l.l("registerAppInit " + l10 + " forceBranchSession: " + z10);
        Q0(n.INITIALISING);
        L i10 = this.f31062i.i();
        C3023l.l("Ordering init calls");
        C3023l.l("Self init request: " + i10);
        this.f31062i.u();
        if (i10 == null || z10) {
            C3023l.l("Moving " + l10 + " to front of the queue or behind network-in-progress request");
            this.f31062i.p(l10);
        } else {
            C3023l.l("Retrieved " + i10 + " with callback " + i10.f30922m + " in queue currently");
            i10.f30922m = l10.f30922m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" now has callback ");
            sb2.append(l10.f30922m);
            C3023l.l(sb2.toString());
        }
        C3023l.l("Finished ordering init calls");
        this.f31062i.u();
        i0(l10);
        this.f31062i.v("registerAppInit");
    }

    public void F0(Ce.a aVar, a.d dVar) {
        if (this.f31059f != null) {
            new Ie.c(Ie.a.VIEW_ITEM).b(aVar).f(this.f31059f);
        }
    }

    public void G0() {
        this.f31062i.y(I.b.USER_SET_WAIT_LOCK);
        this.f31062i.v("removeSessionInitializationDelay");
    }

    /* access modifiers changed from: package-private */
    public String K(J j10) {
        if (j10.f30902i || j10.U(this.f31059f)) {
            return null;
        }
        if (this.f31063j.containsKey(j10.R())) {
            String str = (String) this.f31063j.get(j10.R());
            j10.X(str);
            return str;
        } else if (!j10.V()) {
            return L(j10);
        } else {
            this.f31062i.k(j10);
            return null;
        }
    }

    public void K0(C3032v vVar) {
        L0(vVar, (o) null);
    }

    public void L0(C3032v vVar, o oVar) {
        this.f31056c.D0(vVar);
        C3023l.l("Set Consumer Protection Preference to " + vVar);
        if (vVar == C3032v.NONE) {
            this.f31074u.b(this.f31059f, true, oVar);
        } else if (this.f31074u.c()) {
            this.f31074u.b(this.f31059f, false, oVar);
        }
    }

    public Context M() {
        return this.f31059f;
    }

    public void M0(boolean z10, boolean z11, boolean z12) {
        this.f31056c.F0(z10);
        this.f31056c.t0(z11);
        this.f31056c.u0(z12);
    }

    public C3027p O() {
        return this.f31060g;
    }

    public void O0(String str) {
        P0(str, (g) null);
    }

    public He.a P() {
        return this.f31055b;
    }

    public void P0(String str, g gVar) {
        if (str != null && !str.equals(this.f31056c.B())) {
            f31046J = str;
            this.f31056c.J0(str);
        }
        if (gVar != null) {
            gVar.a(U(), (C3020i) null);
        }
    }

    public C3019h Q() {
        return this.f31061h;
    }

    /* access modifiers changed from: package-private */
    public void Q0(n nVar) {
        this.f31066m = nVar;
    }

    /* access modifiers changed from: package-private */
    public Activity R() {
        WeakReference weakReference = this.f31069p;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public void R0(boolean z10) {
        this.f31072s = z10;
    }

    public JSONObject S() {
        JSONObject jSONObject = this.f31054a;
        if (jSONObject != null && jSONObject.length() > 0) {
            C3023l.l("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
        }
        return this.f31054a;
    }

    /* access modifiers changed from: package-private */
    public void S0(k kVar) {
        this.f31065l = kVar;
    }

    public C T() {
        return this.f31057d;
    }

    public C3016e T0(String str) {
        i(A.campaign.b(), str);
        return this;
    }

    public JSONObject U() {
        return k(v(this.f31056c.F()));
    }

    public C3016e U0(String str) {
        i(A.partner.b(), str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public n V() {
        return this.f31066m;
    }

    public void V0(String str, String str2) {
        this.f31056c.Y0(str, str2);
    }

    /* access modifiers changed from: package-private */
    public L W(g gVar, boolean z10) {
        if (this.f31062i.n()) {
            return new P(this.f31059f, gVar, z10);
        }
        return new O(this.f31059f, gVar, z10);
    }

    public void W0(Activity activity, Ce.a aVar, Ie.g gVar, f fVar, String str, String str2) {
        D.a().b(activity, aVar, gVar, fVar, str, str2);
    }

    /* access modifiers changed from: package-private */
    public void X0(C3028q qVar) {
        S s10 = this.f31068o;
        if (s10 != null) {
            s10.p(true);
        }
        S s11 = new S();
        this.f31068o = s11;
        s11.v(qVar);
    }

    public void Y(K.a aVar, int i10) {
        if (this.f31059f != null) {
            this.f31062i.k(new K(this.f31059f, B.GetLATD, aVar, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        N n10 = this.f31062i;
        if (n10 != null) {
            n10.t();
            this.f31062i.y(I.b.SDK_INIT_WAIT_LOCK);
            this.f31062i.v("unlockSDKInitWaitLock");
        }
    }

    public JSONObject Z() {
        return k(v(this.f31056c.Z()));
    }

    /* access modifiers changed from: package-private */
    public void Z0() {
        X.d(this.f31059f).c(this.f31059f);
    }

    public JSONObject a0() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f31071r = countDownLatch;
        try {
            if (this.f31066m != n.INITIALISED) {
                countDownLatch.await(2500, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
        JSONObject k10 = k(v(this.f31056c.Z()));
        this.f31071r = null;
        return k10;
    }

    /* access modifiers changed from: package-private */
    public E d0() {
        return this.f31056c;
    }

    /* access modifiers changed from: package-private */
    public S f0() {
        return this.f31068o;
    }

    public W g0() {
        return this.f31074u;
    }

    public void h(String str, String str2) {
        if (!this.f31074u.c()) {
            this.f31056c.f30853f.a(str, str2);
        }
    }

    public C3016e i(String str, String str2) {
        this.f31056c.a(str, str2);
        return this;
    }

    public void j(String str, String str2) {
        if (!this.f31074u.c()) {
            this.f31056c.f30853f.c(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m0() {
        return Boolean.parseBoolean((String) X().f31062i.f30931f.get(y.InstantDeepLinkSession.b()));
    }

    /* access modifiers changed from: package-private */
    public void n() {
        ActivityInfo activityInfo;
        Bundle bundle;
        JSONObject Z10 = Z();
        String str = null;
        try {
            y yVar = y.Clicked_Branch_Link;
            if (Z10.has(yVar.b())) {
                if (Z10.getBoolean(yVar.b())) {
                    if (Z10.length() > 0) {
                        Bundle bundle2 = this.f31059f.getPackageManager().getApplicationInfo(this.f31059f.getPackageName(), 128).metaData;
                        int i10 = 0;
                        if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                            ActivityInfo[] activityInfoArr = this.f31059f.getPackageManager().getPackageInfo(this.f31059f.getPackageName(), 129).activities;
                            int i11 = 1501;
                            if (activityInfoArr != null) {
                                int length = activityInfoArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    activityInfo = activityInfoArr[i10];
                                    if (activityInfo == null || (bundle = activityInfo.metaData) == null || ((bundle.getString("io.branch.sdk.auto_link_keys") == null && activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null) || (!o(Z10, activityInfo) && !p(Z10, activityInfo)))) {
                                        i10++;
                                    }
                                }
                                str = activityInfo.name;
                                i11 = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                            }
                            C3023l.l("deepLinkActivity " + str + " getCurrentActivity " + R());
                            if (str == null || R() == null) {
                                C3023l.l("No activity reference to launch deep linked activity");
                                return;
                            }
                            Activity R10 = R();
                            Intent intent = new Intent(R10, Class.forName(str));
                            intent.putExtra(C3034x.AutoDeepLinked.b(), com.amazon.a.a.o.b.f37475af);
                            intent.putExtra(y.ReferringData.b(), Z10.toString());
                            Iterator<String> keys = Z10.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                intent.putExtra(next, Z10.getString(next));
                            }
                            R10.startActivityForResult(intent, i11);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C3023l.l("Does not have Clicked_Branch_Link or Clicked_Branch_Link is false, returning");
        } catch (PackageManager.NameNotFoundException unused) {
            C3023l.m("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            C3023l.m("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + null);
        } catch (Exception unused3) {
        }
    }

    public boolean n0() {
        return this.f31072s;
    }

    /* access modifiers changed from: package-private */
    public boolean q0(Intent intent) {
        if (q(intent) || r(intent)) {
            return true;
        }
        return false;
    }

    public boolean r0() {
        return this.f31074u.c();
    }

    public void s() {
        this.f31056c.f30853f.e();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f31062i.e();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        s();
        C();
        this.f31056c.a1("bnc_no_value");
        this.f31056c.H0((String) null);
        this.f31074u.h(this.f31059f);
    }

    public void w0() {
        x0((m) null);
    }

    public void x(boolean z10) {
        y(z10, (o) null);
    }

    public void x0(m mVar) {
        this.f31056c.J0("bnc_no_value");
        this.f31056c.d();
        this.f31063j.clear();
        this.f31062i.e();
        if (mVar != null) {
            mVar.a(true, (C3020i) null);
        }
    }

    public void y(boolean z10, o oVar) {
        this.f31074u.b(this.f31059f, z10, oVar);
    }

    /* access modifiers changed from: package-private */
    public void z0(Activity activity) {
        C3023l.l("onIntentReady " + activity + " removing INTENT_PENDING_WAIT_LOCK");
        S0(k.READY);
        this.f31062i.y(I.b.INTENT_PENDING_WAIT_LOCK);
        if (!(activity.getIntent() == null || V() == n.INITIALISED)) {
            C0(activity.getIntent().getData(), activity);
        }
        this.f31062i.v("onIntentReady");
    }
}

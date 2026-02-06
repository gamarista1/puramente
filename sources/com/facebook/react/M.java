package com.facebook.react;

import C7.j;
import I7.c;
import I7.h;
import I7.i;
import U7.b;
import android.app.Activity;
import android.app.Application;
import com.facebook.react.V;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C3342i;
import com.facebook.react.devsupport.I;
import com.facebook.react.modules.systeminfo.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n7.C3863a;

public class M {

    /* renamed from: B  reason: collision with root package name */
    private static final String f40270B = "M";

    /* renamed from: A  reason: collision with root package name */
    private h f40271A = null;

    /* renamed from: a  reason: collision with root package name */
    private final List f40272a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private String f40273b;

    /* renamed from: c  reason: collision with root package name */
    private JSBundleLoader f40274c;

    /* renamed from: d  reason: collision with root package name */
    private String f40275d;

    /* renamed from: e  reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f40276e;

    /* renamed from: f  reason: collision with root package name */
    private Application f40277f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40278g;

    /* renamed from: h  reason: collision with root package name */
    private I f40279h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40280i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40281j;

    /* renamed from: k  reason: collision with root package name */
    private LifecycleState f40282k;

    /* renamed from: l  reason: collision with root package name */
    private JSExceptionHandler f40283l;

    /* renamed from: m  reason: collision with root package name */
    private Activity f40284m;

    /* renamed from: n  reason: collision with root package name */
    private b f40285n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f40286o;

    /* renamed from: p  reason: collision with root package name */
    private I7.b f40287p;

    /* renamed from: q  reason: collision with root package name */
    private JavaScriptExecutorFactory f40288q;

    /* renamed from: r  reason: collision with root package name */
    private int f40289r = 1;

    /* renamed from: s  reason: collision with root package name */
    private int f40290s = -1;

    /* renamed from: t  reason: collision with root package name */
    private UIManagerProvider f40291t;

    /* renamed from: u  reason: collision with root package name */
    private Map f40292u;

    /* renamed from: v  reason: collision with root package name */
    private V.a f40293v;

    /* renamed from: w  reason: collision with root package name */
    private j f40294w;

    /* renamed from: x  reason: collision with root package name */
    private c f40295x;

    /* renamed from: y  reason: collision with root package name */
    private C3362h f40296y = null;

    /* renamed from: z  reason: collision with root package name */
    private L7.b f40297z = null;

    M() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2.getMessage().contains("__cxa_bad_typeid") == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.facebook.react.jscexecutor.JSCExecutor.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        return new O7.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        U5.a.m(f40270B, "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.JavaScriptExecutorFactory c(java.lang.String r2, java.lang.String r3, android.content.Context r4) {
        /*
            r1 = this;
            com.facebook.react.J.L(r4)
            com.facebook.react.h r4 = r1.f40296y
            if (r4 != 0) goto L_0x0030
            com.facebook.hermes.reactexecutor.HermesExecutor.a()     // Catch:{ UnsatisfiedLinkError -> 0x0010 }
            com.facebook.hermes.reactexecutor.a r4 = new com.facebook.hermes.reactexecutor.a     // Catch:{ UnsatisfiedLinkError -> 0x0010 }
            r4.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0010 }
            return r4
        L_0x0010:
            com.facebook.react.jscexecutor.JSCExecutor.b()     // Catch:{ UnsatisfiedLinkError -> 0x0019 }
            O7.a r4 = new O7.a     // Catch:{ UnsatisfiedLinkError -> 0x0019 }
            r4.<init>(r2, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0019 }
            return r4
        L_0x0019:
            r2 = move-exception
            java.lang.String r3 = f40270B
            java.lang.String r4 = "Unable to load neither the Hermes nor the JSC native library. Your application is not built correctly and will fail to execute"
            U5.a.m(r3, r4)
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "__cxa_bad_typeid"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x002f
            r2 = 0
            return r2
        L_0x002f:
            throw r2
        L_0x0030:
            com.facebook.react.h r0 = com.facebook.react.C3362h.HERMES
            if (r4 != r0) goto L_0x003d
            com.facebook.hermes.reactexecutor.HermesExecutor.a()
            com.facebook.hermes.reactexecutor.a r2 = new com.facebook.hermes.reactexecutor.a
            r2.<init>()
            return r2
        L_0x003d:
            com.facebook.react.jscexecutor.JSCExecutor.b()
            O7.a r4 = new O7.a
            r4.<init>(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.M.c(java.lang.String, java.lang.String, android.content.Context):com.facebook.react.bridge.JavaScriptExecutorFactory");
    }

    public M a(P p10) {
        this.f40272a.add(p10);
        return this;
    }

    public J b() {
        boolean z10;
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        String str;
        C3863a.d(this.f40277f, "Application property has not been set with this builder");
        if (this.f40282k == LifecycleState.RESUMED) {
            C3863a.d(this.f40284m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z11 = true;
        if (!this.f40278g && this.f40273b == null && this.f40274c == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3863a.b(z10, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f40275d == null && this.f40273b == null && this.f40274c == null) {
            z11 = false;
        }
        C3863a.b(z11, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = this.f40277f.getPackageName();
        String d10 = a.d();
        Application application = this.f40277f;
        Activity activity = this.f40284m;
        b bVar = this.f40285n;
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = this.f40288q;
        if (javaScriptExecutorFactory2 == null) {
            javaScriptExecutorFactory = c(packageName, d10, application.getApplicationContext());
        } else {
            javaScriptExecutorFactory = javaScriptExecutorFactory2;
        }
        JSBundleLoader jSBundleLoader = this.f40274c;
        if (jSBundleLoader == null && (str = this.f40273b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f40277f, str, false);
        }
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        String str2 = this.f40275d;
        List list = this.f40272a;
        boolean z12 = this.f40278g;
        I i10 = this.f40279h;
        if (i10 == null) {
            i10 = new C3342i();
        }
        return new J(application, activity, bVar, javaScriptExecutorFactory, jSBundleLoader2, str2, list, z12, i10, this.f40280i, this.f40281j, this.f40276e, (LifecycleState) C3863a.d(this.f40282k, "Initial lifecycle state was not set"), this.f40283l, (i) null, this.f40286o, this.f40287p, this.f40289r, this.f40290s, this.f40291t, this.f40292u, this.f40293v, this.f40294w, this.f40295x, this.f40297z, this.f40271A);
    }

    public M d(Application application) {
        this.f40277f = application;
        return this;
    }

    public M e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f40273b = str2;
        this.f40274c = null;
        return this;
    }

    public M f(L7.b bVar) {
        this.f40297z = bVar;
        return this;
    }

    public M g(c cVar) {
        this.f40295x = cVar;
        return this;
    }

    public M h(I i10) {
        this.f40279h = i10;
        return this;
    }

    public M i(LifecycleState lifecycleState) {
        this.f40282k = lifecycleState;
        return this;
    }

    public M j(String str) {
        if (!str.startsWith("assets://")) {
            return k(JSBundleLoader.createFileLoader(str));
        }
        this.f40273b = str;
        this.f40274c = null;
        return this;
    }

    public M k(JSBundleLoader jSBundleLoader) {
        this.f40274c = jSBundleLoader;
        this.f40273b = null;
        return this;
    }

    public M l(C3362h hVar) {
        this.f40296y = hVar;
        return this;
    }

    public M m(JSExceptionHandler jSExceptionHandler) {
        this.f40283l = jSExceptionHandler;
        return this;
    }

    public M n(String str) {
        this.f40275d = str;
        return this;
    }

    public M o(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f40288q = javaScriptExecutorFactory;
        return this;
    }

    public M p(boolean z10) {
        this.f40286o = z10;
        return this;
    }

    public M q(h hVar) {
        this.f40271A = hVar;
        return this;
    }

    public M r(V.a aVar) {
        this.f40293v = aVar;
        return this;
    }

    public M t(boolean z10) {
        this.f40280i = z10;
        return this;
    }

    public M u(j jVar) {
        this.f40294w = jVar;
        return this;
    }

    public M v(UIManagerProvider uIManagerProvider) {
        this.f40291t = uIManagerProvider;
        return this;
    }

    public M w(boolean z10) {
        this.f40278g = z10;
        return this;
    }

    public M s(i iVar) {
        return this;
    }
}

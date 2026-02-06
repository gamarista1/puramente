package com.bugsnag.android;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J3\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u001fJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0003J\u001f\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b*\u0010%J-\u0010,\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00052\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004¢\u0006\u0004\b,\u0010-J+\u0010/\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\b2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000101¢\u0006\u0004\b3\u0010\nJ#\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u000fR\"\u0010U\u001a\u00020T8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\\\u0010]R0\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010\u0017¨\u0006c"}, d2 = {"Lcom/bugsnag/android/BugsnagReactNativePlugin;", "Lcom/bugsnag/android/i1;", "<init>", "()V", "", "", "", "env", "Llf/M;", "updateNotifierInfo", "(Ljava/util/Map;)V", "ignoreJavaScriptExceptions", "Lcom/bugsnag/android/A;", "client", "load", "(Lcom/bugsnag/android/A;)V", "unload", "configure", "(Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/Function1;", "Lcom/bugsnag/android/X0;", "cb", "registerForMessageEvents", "(Lyf/l;)V", "map", "leaveBreadcrumb", "startSession", "pauseSession", "resumeSession", "context", "updateContext", "(Ljava/lang/String;)V", "id", "updateCodeBundleId", "name", "variant", "addFeatureFlag", "(Ljava/lang/String;Ljava/lang/String;)V", "clearFeatureFlag", "clearFeatureFlags", "section", "key", "clearMetadata", "data", "addMetadata", "(Ljava/lang/String;Ljava/util/Map;)V", "email", "updateUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "payload", "dispatch", "", "unhandled", "getPayloadInfo", "(Z)Ljava/util/Map;", "Lcom/bugsnag/android/F;", "configSerializer", "Lcom/bugsnag/android/F;", "Lcom/bugsnag/android/m;", "appSerializer", "Lcom/bugsnag/android/m;", "Lcom/bugsnag/android/h0;", "deviceSerializer", "Lcom/bugsnag/android/h0;", "Lcom/bugsnag/android/r;", "breadcrumbSerializer", "Lcom/bugsnag/android/r;", "Lcom/bugsnag/android/F1;", "threadSerializer", "Lcom/bugsnag/android/F1;", "ignoreJsExceptionCallbackAdded", "Z", "Lcom/bugsnag/android/F0;", "internalHooks", "Lcom/bugsnag/android/F0;", "getInternalHooks$bugsnag_plugin_react_native_release", "()Lcom/bugsnag/android/F0;", "setInternalHooks$bugsnag_plugin_react_native_release", "(Lcom/bugsnag/android/F0;)V", "Lcom/bugsnag/android/A;", "getClient$bugsnag_plugin_react_native_release", "()Lcom/bugsnag/android/A;", "setClient$bugsnag_plugin_react_native_release", "Lcom/bugsnag/android/S0;", "logger", "Lcom/bugsnag/android/S0;", "getLogger", "()Lcom/bugsnag/android/S0;", "setLogger", "(Lcom/bugsnag/android/S0;)V", "Lcom/bugsnag/android/v;", "observerBridge", "Lcom/bugsnag/android/v;", "jsCallback", "Lyf/l;", "getJsCallback", "()Lyf/l;", "setJsCallback", "bugsnag-plugin-react-native_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BugsnagReactNativePlugin implements C3245i1 {
    private final C3255m appSerializer = new C3255m();
    private final r breadcrumbSerializer = new r();
    public A client;
    private final F configSerializer = new F();
    private final C3241h0 deviceSerializer = new C3241h0();
    private boolean ignoreJsExceptionCallbackAdded;
    public F0 internalHooks;
    private C6798l jsCallback;
    public S0 logger;
    private C3276v observerBridge;
    private final F1 threadSerializer = new F1();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BugsnagReactNativePlugin f38421a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BugsnagReactNativePlugin bugsnagReactNativePlugin) {
            super(1);
            this.f38421a = bugsnagReactNativePlugin;
        }

        public final void a(X0 x02) {
            C6798l jsCallback = this.f38421a.getJsCallback();
            if (jsCallback != null) {
                jsCallback.invoke(x02);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X0) obj);
            return C6514M.f71813a;
        }
    }

    private final void ignoreJavaScriptExceptions() {
        this.ignoreJsExceptionCallbackAdded = true;
        getClient$bugsnag_plugin_react_native_release().e(new C3280x());
    }

    /* access modifiers changed from: private */
    /* renamed from: ignoreJavaScriptExceptions$lambda-2  reason: not valid java name */
    public static final boolean m17ignoreJavaScriptExceptions$lambda2(C3262o0 o0Var) {
        return !C6496s.c(((C3250k0) o0Var.h().get(0)).b(), "com.facebook.react.common.JavascriptException");
    }

    private final void updateNotifierInfo(Map<String, ? extends Object> map) {
        String str = (String) map.get("reactNativeVersion");
        if (str != null) {
            getClient$bugsnag_plugin_react_native_release().f("reactNative", str);
        }
        String str2 = (String) map.get("engine");
        if (str2 != null) {
            getClient$bugsnag_plugin_react_native_release().f("reactNativeJsEngine", str2);
        }
        Object obj = map.get("notifierVersion");
        if (obj != null) {
            C3233e1 e1Var = getClient$bugsnag_plugin_react_native_release().f38386v;
            e1Var.f("Bugsnag React Native");
            e1Var.g("https://github.com/bugsnag/bugsnag-js");
            e1Var.h((String) obj);
            e1Var.e(C6565s.e(new C3233e1((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void addFeatureFlag(String str, String str2) {
        getClient$bugsnag_plugin_react_native_release().a(str, str2);
    }

    public final void addMetadata(String str, Map<String, ? extends Object> map) {
        if (map == null) {
            getClient$bugsnag_plugin_react_native_release().i(str);
        } else {
            getClient$bugsnag_plugin_react_native_release().c(str, map);
        }
    }

    public final void clearFeatureFlag(String str) {
        getClient$bugsnag_plugin_react_native_release().g(str);
    }

    public final void clearFeatureFlags() {
        getClient$bugsnag_plugin_react_native_release().h();
    }

    public final void clearMetadata(String str, String str2) {
        if (str2 == null) {
            getClient$bugsnag_plugin_react_native_release().i(str);
        } else {
            getClient$bugsnag_plugin_react_native_release().j(str, str2);
        }
    }

    public final Map<String, Object> configure(Map<String, ? extends Object> map) {
        if (map != null) {
            updateNotifierInfo(map);
            if (!this.ignoreJsExceptionCallbackAdded) {
                ignoreJavaScriptExceptions();
            }
            HashMap hashMap = new HashMap();
            this.configSerializer.a(hashMap, getClient$bugsnag_plugin_react_native_release().m());
            return hashMap;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void dispatch(Map<String, Object> map) {
        if (map != null) {
            C3262o0 a10 = new C3265p0(getClient$bugsnag_plugin_react_native_release(), getInternalHooks$bugsnag_plugin_react_native_release().e(getClient$bugsnag_plugin_react_native_release().m())).a(map);
            if (!a10.h().isEmpty()) {
                if (!getClient$bugsnag_plugin_react_native_release().f38365a.N(((C3250k0) a10.h().get(0)).b())) {
                    getClient$bugsnag_plugin_react_native_release().G(a10, (C3242h1) null);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final A getClient$bugsnag_plugin_react_native_release() {
        A a10 = this.client;
        if (a10 != null) {
            return a10;
        }
        C6496s.v("client");
        return null;
    }

    public final F0 getInternalHooks$bugsnag_plugin_react_native_release() {
        F0 f02 = this.internalHooks;
        if (f02 != null) {
            return f02;
        }
        C6496s.v("internalHooks");
        return null;
    }

    public final C6798l getJsCallback() {
        return this.jsCallback;
    }

    public final S0 getLogger() {
        S0 s02 = this.logger;
        if (s02 != null) {
            return s02;
        }
        C6496s.v("logger");
        return null;
    }

    public final Map<String, Object> getPayloadInfo(boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.appSerializer.a(linkedHashMap2, getInternalHooks$bugsnag_plugin_react_native_release().b());
        linkedHashMap.put("app", linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.deviceSerializer.a(linkedHashMap3, getInternalHooks$bugsnag_plugin_react_native_release().d());
        linkedHashMap.put("device", linkedHashMap3);
        Iterable<Breadcrumb> l10 = getClient$bugsnag_plugin_react_native_release().l();
        ArrayList arrayList = new ArrayList(C6565s.y(l10, 10));
        for (Breadcrumb a10 : l10) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            this.breadcrumbSerializer.a(linkedHashMap4, a10);
            arrayList.add(linkedHashMap4);
        }
        linkedHashMap.put("breadcrumbs", arrayList);
        Iterable<B1> f10 = getInternalHooks$bugsnag_plugin_react_native_release().f(z10);
        ArrayList arrayList2 = new ArrayList(C6565s.y(f10, 10));
        for (B1 a11 : f10) {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            this.threadSerializer.a(linkedHashMap5, a11);
            arrayList2.add(linkedHashMap5);
        }
        linkedHashMap.put("threads", arrayList2);
        linkedHashMap.put("appMetadata", getInternalHooks$bugsnag_plugin_react_native_release().a());
        linkedHashMap.put("deviceMetadata", getInternalHooks$bugsnag_plugin_react_native_release().c());
        return linkedHashMap;
    }

    public final void leaveBreadcrumb(Map<String, ? extends Object> map) {
        if (map != null) {
            Object obj = map.get(MetricTracker.Object.MESSAGE);
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = map.get("type");
                if (obj2 != null) {
                    String upperCase = ((String) obj2).toUpperCase(Locale.ROOT);
                    C6496s.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    BreadcrumbType valueOf = BreadcrumbType.valueOf(upperCase);
                    Object obj3 = map.get("metadata");
                    if (obj3 == null) {
                        obj3 = O.i();
                    }
                    getClient$bugsnag_plugin_react_native_release().B(str, (Map) obj3, valueOf);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void load(A a10) {
        setClient$bugsnag_plugin_react_native_release(a10);
        setLogger(a10.f38381q);
        setInternalHooks$bugsnag_plugin_react_native_release(new F0(a10));
        C3276v vVar = new C3276v(a10, new a(this));
        this.observerBridge = vVar;
        a10.d(vVar);
        a10.f38381q.d("Initialized React Native Plugin");
    }

    public final void pauseSession() {
        getClient$bugsnag_plugin_react_native_release().I();
    }

    public final void registerForMessageEvents(C6798l lVar) {
        this.jsCallback = lVar;
        getClient$bugsnag_plugin_react_native_release().a0();
    }

    public final void resumeSession() {
        getClient$bugsnag_plugin_react_native_release().P();
    }

    public final void setClient$bugsnag_plugin_react_native_release(A a10) {
        this.client = a10;
    }

    public final void setInternalHooks$bugsnag_plugin_react_native_release(F0 f02) {
        this.internalHooks = f02;
    }

    public final void setJsCallback(C6798l lVar) {
        this.jsCallback = lVar;
    }

    public final void setLogger(S0 s02) {
        this.logger = s02;
    }

    public final void startSession() {
        getClient$bugsnag_plugin_react_native_release().Z();
    }

    public void unload() {
    }

    public final void updateCodeBundleId(String str) {
        getClient$bugsnag_plugin_react_native_release().T(str);
    }

    public final void updateContext(String str) {
        getClient$bugsnag_plugin_react_native_release().U(str);
    }

    public final void updateUser(String str, String str2, String str3) {
        getClient$bugsnag_plugin_react_native_release().V(str, str2, str3);
    }
}

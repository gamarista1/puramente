package io.invertase.firebase.config;

import Dc.c;
import Dc.d;
import Dc.p;
import Dc.q;
import Ue.C5547b;
import Ue.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Task;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ub.C5230g;

public class ReactNativeFirebaseConfigModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Config";
    private static HashMap<String, d> mConfigUpdateRegistrations = new HashMap<>();
    private final m module;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71265a;

        a(String str) {
            this.f71265a = str;
        }

        public void a(Dc.b bVar) {
            g i10 = g.i();
            ArrayList arrayList = new ArrayList(bVar.b());
            HashMap hashMap = new HashMap();
            hashMap.put("appName", this.f71265a);
            hashMap.put("resultType", com.amazon.device.simplesignin.a.a.a.f38020s);
            hashMap.put("updatedKeys", arrayList);
            i10.o(new C5547b("on_config_updated", Arguments.makeNativeMap((Map<String, Object>) hashMap), this.f71265a));
        }

        public void b(p pVar) {
            g i10 = g.i();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("resultType", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            createMap.putString("appName", this.f71265a);
            int i11 = b.f71267a[pVar.a().ordinal()];
            if (i11 == 1) {
                createMap.putString("code", "config_update_stream_error");
            } else if (i11 == 2) {
                createMap.putString("code", "config_update_message_invalid");
            } else if (i11 == 3) {
                createMap.putString("code", "config_update_not_fetched");
            } else if (i11 == 4) {
                createMap.putString("code", "config_update_unavailable");
            } else if (i11 != 5) {
                createMap.putString("code", "internal");
            } else {
                createMap.putString("code", "unknown");
            }
            createMap.putString(MetricTracker.Object.MESSAGE, pVar.getMessage());
            createMap.putString("nativeErrorMessage", pVar.getMessage());
            i10.o(new C5547b("on_config_updated", createMap, this.f71265a));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f71267a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Dc.p$a[] r0 = Dc.p.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f71267a = r0
                Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f71267a     // Catch:{ NoSuchFieldError -> 0x001d }
                Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_MESSAGE_INVALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f71267a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_NOT_FETCHED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f71267a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Dc.p$a r1 = Dc.p.a.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f71267a     // Catch:{ NoSuchFieldError -> 0x003e }
                Dc.p$a r1 = Dc.p.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.config.ReactNativeFirebaseConfigModule.b.<clinit>():void");
        }
    }

    ReactNativeFirebaseConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new m(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$activate$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitialized$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants((Object) null));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetch$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchAndActivate$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reset$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigSettings$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaults$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaultsFromResource$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception != null && exception.getMessage().equals("resource_not_found")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resource_not_found", "The specified resource name was not found.");
        }
        ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
    }

    private void rejectPromiseWithConfigException(Promise promise, Exception exc) {
        if (exc == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Operation cannot be completed successfully, due to an unknown error.");
        } else if (exc.getCause() instanceof q) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "throttled", "fetch() operation cannot be completed successfully, due to throttling.", exc.getMessage());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "failure", "fetch() operation cannot be completed successfully.", exc.getMessage());
        }
    }

    private WritableMap resultWithConstants(Object obj) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("result", obj);
        hashMap.put("constants", this.module.p("[DEFAULT]"));
        return Arguments.makeNativeMap((Map<String, Object>) hashMap);
    }

    @ReactMethod
    public void activate(String str, Promise promise) {
        this.module.j(str).addOnCompleteListener(new b(this, promise));
    }

    @ReactMethod
    public void ensureInitialized(String str, Promise promise) {
        this.module.l(str).addOnCompleteListener(new g(this, promise));
    }

    @ReactMethod
    public void fetch(String str, double d10, Promise promise) {
        this.module.m(str, (long) d10).addOnCompleteListener(new e(this, promise));
    }

    @ReactMethod
    public void fetchAndActivate(String str, Promise promise) {
        this.module.n(str).addOnCompleteListener(new d(this, promise));
    }

    public Map<String, Object> getConstants() {
        return this.module.b();
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Iterator<Map.Entry<String, d>> it = mConfigUpdateRegistrations.entrySet().iterator();
        while (it.hasNext()) {
            ((d) it.next().getValue()).remove();
            it.remove();
        }
    }

    @ReactMethod
    public void onConfigUpdated(String str) {
        if (mConfigUpdateRegistrations.get(str) == null) {
            mConfigUpdateRegistrations.put(str, com.google.firebase.remoteconfig.a.r(C5230g.p(str)).k(new a(str)));
        }
    }

    @ReactMethod
    public void removeConfigUpdateRegistration(String str) {
        d dVar = mConfigUpdateRegistrations.get(str);
        if (dVar != null) {
            dVar.remove();
            mConfigUpdateRegistrations.remove(str);
        }
    }

    @ReactMethod
    public void reset(String str, Promise promise) {
        this.module.v(str).addOnCompleteListener(new a(this, promise));
    }

    @ReactMethod
    public void setConfigSettings(String str, ReadableMap readableMap, Promise promise) {
        this.module.w(str, Arguments.toBundle(readableMap)).addOnCompleteListener(new c(this, promise));
    }

    @ReactMethod
    public void setDefaults(String str, ReadableMap readableMap, Promise promise) {
        this.module.x(str, readableMap.toHashMap()).addOnCompleteListener(new f(this, promise));
    }

    @ReactMethod
    public void setDefaultsFromResource(String str, String str2, Promise promise) {
        this.module.y(str, str2).addOnCompleteListener(new h(this, promise));
    }
}

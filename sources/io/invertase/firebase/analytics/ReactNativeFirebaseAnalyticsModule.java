package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.Iterator;

public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final v module;

    ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new v(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAppInstanceId$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSessionId$4(Promise promise, Task task) {
        Double d10;
        if (task.isSuccessful()) {
            Long l10 = (Long) task.getResult();
            if (l10 != null) {
                d10 = Double.valueOf(l10.doubleValue());
            } else {
                d10 = null;
            }
            promise.resolve(d10);
            return;
        }
        ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$logEvent$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetAnalyticsData$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAnalyticsCollectionEnabled$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setConsent$10(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDefaultEventParameters$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSessionTimeoutDuration$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserId$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperties$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperty$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Bundle) {
                Bundle bundle2 = (Bundle) next;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(Promise promise) {
        this.module.p().addOnCompleteListener(new a(promise));
    }

    @ReactMethod
    public void getSessionId(Promise promise) {
        this.module.q().addOnCompleteListener(new f(promise));
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Promise promise) {
        this.module.A(str, toBundle(readableMap)).addOnCompleteListener(new e(promise));
    }

    @ReactMethod
    public void resetAnalyticsData(Promise promise) {
        this.module.B().addOnCompleteListener(new g(promise));
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, Promise promise) {
        this.module.C(bool).addOnCompleteListener(new d(promise));
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, Promise promise) {
        this.module.D(Arguments.toBundle(readableMap)).addOnCompleteListener(new c(promise));
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, Promise promise) {
        this.module.E(toBundle(readableMap)).addOnCompleteListener(new h(promise));
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d10, Promise promise) {
        this.module.F((long) d10).addOnCompleteListener(new j(promise));
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        this.module.G(str).addOnCompleteListener(new k(promise));
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, Promise promise) {
        this.module.H(Arguments.toBundle(readableMap)).addOnCompleteListener(new i(promise));
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, Promise promise) {
        this.module.I(str, str2).addOnCompleteListener(new b(promise));
    }
}

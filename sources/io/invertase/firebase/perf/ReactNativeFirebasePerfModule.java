package io.invertase.firebase.perf;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Map;

public class ReactNativeFirebasePerfModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Perf";
    private final q module;

    ReactNativeFirebasePerfModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new q(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPerformanceCollectionEnabled$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$startHttpMetric$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$startScreenTrace$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$startTrace$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopHttpMetric$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopScreenTrace$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopTrace$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public Map<String, Object> getConstants() {
        return this.module.b();
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.module.f();
    }

    @ReactMethod
    public void setPerformanceCollectionEnabled(Boolean bool, Promise promise) {
        this.module.u(bool).addOnCompleteListener(new d(promise));
    }

    @ReactMethod
    public void startHttpMetric(int i10, String str, String str2, Promise promise) {
        this.module.v(i10, str, str2).addOnCompleteListener(new f(promise));
    }

    @ReactMethod
    public void startScreenTrace(int i10, String str, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve((Object) null);
        } else {
            this.module.w(currentActivity, i10, str).addOnCompleteListener(new g(promise));
        }
    }

    @ReactMethod
    public void startTrace(int i10, String str, Promise promise) {
        this.module.x(i10, str).addOnCompleteListener(new b(promise));
    }

    @ReactMethod
    public void stopHttpMetric(int i10, ReadableMap readableMap, Promise promise) {
        this.module.y(i10, Arguments.toBundle(readableMap), Arguments.toBundle(readableMap.getMap("attributes"))).addOnCompleteListener(new c(promise));
    }

    @ReactMethod
    public void stopScreenTrace(int i10, Promise promise) {
        this.module.z(i10).addOnCompleteListener(new e(promise));
    }

    @ReactMethod
    public void stopTrace(int i10, ReadableMap readableMap, Promise promise) {
        this.module.A(i10, Arguments.toBundle(readableMap.getMap("metrics")), Arguments.toBundle(readableMap.getMap("attributes"))).addOnCompleteListener(new a(promise));
    }
}

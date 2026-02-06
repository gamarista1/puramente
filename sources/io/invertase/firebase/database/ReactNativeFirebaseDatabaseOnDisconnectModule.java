package io.invertase.firebase.database;

import Ue.C5546a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Map;

public class ReactNativeFirebaseDatabaseOnDisconnectModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseOnDisconnect";
    private final U module;

    ReactNativeFirebaseDatabaseOnDisconnectModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new U(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnectCancel$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnectRemove$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnectSet$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnectSetWithPriority$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnectUpdate$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    @ReactMethod
    public void onDisconnectCancel(String str, String str2, String str3, Promise promise) {
        this.module.g(str, str2, str3).addOnCompleteListener(new C6406e(promise));
    }

    @ReactMethod
    public void onDisconnectRemove(String str, String str2, String str3, Promise promise) {
        this.module.h(str, str2, str3).addOnCompleteListener(new C6409h(promise));
    }

    @ReactMethod
    public void onDisconnectSet(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        this.module.i(str, str2, str3, C5546a.g(readableMap).get("value")).addOnCompleteListener(new C6410i(promise));
    }

    @ReactMethod
    public void onDisconnectSetWithPriority(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        this.module.j(str, str2, str3, C5546a.g(readableMap).get("value"), C5546a.g(readableMap).get("priority")).addOnCompleteListener(new C6407f(promise));
    }

    @ReactMethod
    public void onDisconnectUpdate(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        this.module.k(str, str2, str3, (Map) C5546a.g(readableMap).get("values")).addOnCompleteListener(new C6408g(promise));
    }
}

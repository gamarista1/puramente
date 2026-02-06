package io.invertase.firebase.database;

import Ue.o;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;

public class ReactNativeFirebaseDatabaseModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Database";
    private final T module;

    ReactNativeFirebaseDatabaseModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new T(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$goOffline$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$goOnline$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    @ReactMethod
    public void goOffline(String str, String str2, Promise promise) {
        this.module.i(str, str2).addOnCompleteListener(new C6404c(promise));
    }

    @ReactMethod
    public void goOnline(String str, String str2, Promise promise) {
        this.module.j(str, str2).addOnCompleteListener(new C6405d(promise));
    }

    @ReactMethod
    public void setLoggingEnabled(String str, String str2, boolean z10) {
        o.e().h(O.f71336b, z10);
    }

    @ReactMethod
    public void setPersistenceCacheSizeBytes(String str, String str2, double d10) {
        o.e().i(O.f71337c, (long) d10);
    }

    @ReactMethod
    public void setPersistenceEnabled(String str, String str2, boolean z10) {
        o.e().h(O.f71335a, z10);
    }

    @ReactMethod
    public void useEmulator(String str, String str2, String str3, int i10) {
        P.a(str, str2, str3, i10);
    }
}

package io.invertase.firebase.database;

import Ue.C5546a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Map;
import java.util.concurrent.Executor;

public class ReactNativeFirebaseDatabaseReferenceModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseReference";
    private final a0 module;

    ReactNativeFirebaseDatabaseReferenceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new a0(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$remove$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            C6402a.j(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task lambda$set$1(String str, String str2, String str3, Object obj) {
        return this.module.r(str, str2, str3, obj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$set$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            C6402a.j(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPriority$10(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            C6402a.j(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task lambda$setWithPriority$7(String str, String str2, String str3, Map map) {
        return this.module.t(str, str2, str3, map.get("value"), map.get("priority"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setWithPriority$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            C6402a.j(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task lambda$update$4(String str, String str2, String str3, Object obj) {
        return this.module.u(str, str2, str3, (Map) obj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$update$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            C6402a.j(promise, task.getException());
        }
    }

    @ReactMethod
    public void remove(String str, String str2, String str3, Promise promise) {
        this.module.q(str, str2, str3).addOnCompleteListener((Executor) getTransactionalExecutor(), new C6426z(promise));
    }

    @ReactMethod
    public void set(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Tasks.call(getTransactionalExecutor(), new C6425y(readableMap)).onSuccessTask(new A(this, str, str2, str3)).addOnCompleteListener((Executor) getTransactionalExecutor(), new B(promise));
    }

    @ReactMethod
    public void setPriority(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        this.module.s(str, str2, str3, C5546a.g(readableMap).get("priority")).addOnCompleteListener((Executor) getTransactionalExecutor(), new C(promise));
    }

    @ReactMethod
    public void setWithPriority(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Tasks.call(getTransactionalExecutor(), new G(readableMap)).onSuccessTask(new H(this, str, str2, str3)).addOnCompleteListener((Executor) getTransactionalExecutor(), new I(promise));
    }

    @ReactMethod
    public void update(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Tasks.call(getTransactionalExecutor(), new D(readableMap)).onSuccessTask(new E(this, str, str2, str3)).addOnCompleteListener((Executor) getTransactionalExecutor(), new F(promise));
    }
}

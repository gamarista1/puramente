package io.invertase.firebase.storage;

import android.net.Uri;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.C4849e;
import com.google.firebase.storage.C4853i;
import com.google.firebase.storage.n;
import com.google.firebase.storage.o;
import com.revenuecat.purchases.common.Constants;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import ub.C5230g;

public class ReactNativeFirebaseStorageModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Storage";
    private static HashMap<String, String> emulatorConfigs = new HashMap<>();

    ReactNativeFirebaseStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private void dumpMetadata(n nVar) {
        PrintStream printStream = System.err;
        printStream.println("STORAGE dumping metadata contents");
        printStream.println("STORAGE - cacheControl " + nVar.s());
        printStream.println("STORAGE - contentDisposition " + nVar.t());
        printStream.println("STORAGE - contentEncoding " + nVar.u());
        printStream.println("STORAGE - contentLanguage " + nVar.v());
        printStream.println("STORAGE - contentType " + nVar.w());
        for (String str : nVar.z()) {
            PrintStream printStream2 = System.err;
            printStream2.println("STORAGE - customMetadata: '" + str + "' / '" + nVar.y(str) + "'");
        }
    }

    private String getBucketFromUrl(String str) {
        return str.substring(0, str.substring(5).indexOf("/") + 5);
    }

    private o getReferenceFromUrl(String str, String str2) {
        return C4849e.h(C5230g.p(str2), getBucketFromUrl(str)).q(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve((Object) null);
            return;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        a.g(promise, exception);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDownloadURL$1(Promise promise, Task task) {
        String str;
        if (task.isSuccessful()) {
            if (task.getResult() != null) {
                str = ((Uri) task.getResult()).toString();
            } else {
                str = null;
            }
            promise.resolve(str);
            return;
        }
        a.g(promise, task.getException());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMetadata$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(a.d((n) task.getResult()));
        } else {
            a.g(promise, task.getException());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$list$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            C4853i iVar = (C4853i) task.getResult();
            Objects.requireNonNull(iVar);
            promise.resolve(a.c(iVar));
            return;
        }
        a.g(promise, task.getException());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$listAll$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            C4853i iVar = (C4853i) task.getResult();
            Objects.requireNonNull(iVar);
            promise.resolve(a.c(iVar));
            return;
        }
        a.g(promise, task.getException());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateMetadata$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(a.d((n) task.getResult()));
            return;
        }
        task.getException().printStackTrace();
        a.g(promise, task.getException());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMetadata$6(ReadableMap readableMap, o oVar, Promise promise, Task task) {
        if (task.isSuccessful()) {
            oVar.E(a.a(readableMap, (Uri) null, (n) task.getResult())).addOnCompleteListener((Executor) getExecutor(), new n(promise));
        } else {
            a.g(promise, task.getException());
        }
    }

    @ReactMethod
    public void delete(String str, String str2, Promise promise) {
        try {
            getReferenceFromUrl(str2, str).e().addOnCompleteListener(new h(promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        if (C5230g.n(getReactApplicationContext()).size() > 0) {
            C4849e f10 = C4849e.f();
            hashMap.put("maxDownloadRetryTime", Long.valueOf(f10.k()));
            hashMap.put("maxOperationRetryTime", Long.valueOf(f10.l()));
            hashMap.put("maxUploadRetryTime", Long.valueOf(f10.m()));
        }
        return hashMap;
    }

    @ReactMethod
    public void getDownloadURL(String str, String str2, Promise promise) {
        try {
            getReferenceFromUrl(str2, str).i().addOnCompleteListener(new m(promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void getMetadata(String str, String str2, Promise promise) {
        try {
            getReferenceFromUrl(str2, str).m().addOnCompleteListener((Executor) getExecutor(), new i(promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void list(String str, String str2, ReadableMap readableMap, Promise promise) {
        Task task;
        try {
            o referenceFromUrl = getReferenceFromUrl(str2, str);
            int i10 = readableMap.getInt("maxResults");
            if (readableMap.hasKey("pageToken")) {
                String string = readableMap.getString("pageToken");
                Objects.requireNonNull(string);
                task = referenceFromUrl.y(i10, string);
            } else {
                task = referenceFromUrl.x(i10);
            }
            task.addOnCompleteListener((Executor) getExecutor(), new l(promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void listAll(String str, String str2, Promise promise) {
        try {
            getReferenceFromUrl(str2, str).z().addOnCompleteListener((Executor) getExecutor(), new k(promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    public void onCatalystInstanceDestroy() {
        p.e();
        super.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void putFile(String str, String str2, String str3, ReadableMap readableMap, int i10, Promise promise) {
        try {
            u uVar = new u(i10, getReferenceFromUrl(str2, str), str);
            uVar.r(getTransactionalExecutor(), str3, readableMap);
            uVar.q(getTransactionalExecutor(), promise);
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void putString(String str, String str2, String str3, String str4, ReadableMap readableMap, int i10, Promise promise) {
        try {
            u uVar = new u(i10, getReferenceFromUrl(str2, str), str);
            uVar.s(getTransactionalExecutor(), str3, str4, readableMap);
            uVar.q(getTransactionalExecutor(), promise);
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void setMaxDownloadRetryTime(String str, double d10, Promise promise) {
        C4849e.g(C5230g.p(str)).r((long) d10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setMaxOperationRetryTime(String str, double d10, Promise promise) {
        C4849e.g(C5230g.p(str)).s((long) d10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setMaxUploadRetryTime(String str, double d10, Promise promise) {
        C4849e.g(C5230g.p(str)).t((long) d10);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void setTaskStatus(String str, int i10, int i11, Promise promise) {
        if (i11 == 0) {
            promise.resolve(Boolean.valueOf(p.h(i10)));
        } else if (i11 == 1) {
            promise.resolve(Boolean.valueOf(p.j(i10)));
        } else if (i11 == 2) {
            promise.resolve(Boolean.valueOf(p.d(i10)));
        }
    }

    @ReactMethod
    public void updateMetadata(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            o referenceFromUrl = getReferenceFromUrl(str2, str);
            referenceFromUrl.m().addOnCompleteListener((Executor) getExecutor(), new j(this, readableMap, referenceFromUrl, promise));
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }

    @ReactMethod
    public void useEmulator(String str, String str2, int i10, String str3, Promise promise) {
        C4849e h10 = C4849e.h(C5230g.p(str), str3);
        String str4 = str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str3;
        if (emulatorConfigs.get(str4) == null) {
            h10.u(str2, i10);
            emulatorConfigs.put(str4, b.f37475af);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void writeToFile(String str, String str2, String str3, int i10, Promise promise) {
        if (!a.f()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-device-file-path", "The specified device file path is invalid or is restricted.");
            return;
        }
        try {
            f fVar = new f(i10, getReferenceFromUrl(str2, str), str);
            fVar.r(getTransactionalExecutor(), str3);
            fVar.q(getTransactionalExecutor(), promise);
        } catch (Exception e10) {
            a.g(promise, e10);
        }
    }
}

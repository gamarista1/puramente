package io.invertase.firebase.functions;

import Ue.C5546a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.o;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.IOException;
import java.util.concurrent.Executor;

public class ReactNativeFirebaseFunctionsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Functions";
    private final h module;

    ReactNativeFirebaseFunctionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new h(reactApplicationContext, SERVICE_NAME);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$httpsCallable$1(Promise promise, Exception exc) {
        String str;
        Object obj;
        String message = exc.getMessage();
        WritableMap createMap = Arguments.createMap();
        if (exc.getCause() instanceof o) {
            o oVar = (o) exc.getCause();
            obj = oVar.c();
            str = oVar.b().name();
            String message2 = oVar.getMessage();
            boolean contains = str.contains(o.a.DEADLINE_EXCEEDED.name());
            if (!(oVar.getCause() instanceof IOException) || contains) {
                message = message2;
            } else {
                o.a aVar = o.a.UNAVAILABLE;
                str = aVar.name();
                message = aVar.name();
            }
        } else {
            obj = null;
            str = "UNKNOWN";
        }
        C5546a.c("code", str, createMap);
        C5546a.c(MetricTracker.Object.MESSAGE, message, createMap);
        C5546a.c("details", obj, createMap);
        promise.reject(str, message, exc, createMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$httpsCallableFromUrl$3(Promise promise, Exception exc) {
        String str;
        Object obj;
        String message = exc.getMessage();
        WritableMap createMap = Arguments.createMap();
        if (exc.getCause() instanceof o) {
            o oVar = (o) exc.getCause();
            obj = oVar.c();
            str = oVar.b().name();
            String message2 = oVar.getMessage();
            boolean contains = str.contains(o.a.DEADLINE_EXCEEDED.name());
            if (!(oVar.getCause() instanceof IOException) || contains) {
                message = message2;
            } else {
                o.a aVar = o.a.UNAVAILABLE;
                str = aVar.name();
                message = aVar.name();
            }
        } else {
            obj = null;
            str = "UNKNOWN";
        }
        C5546a.c("code", str, createMap);
        C5546a.c(MetricTracker.Object.MESSAGE, message, createMap);
        C5546a.c("details", obj, createMap);
        promise.reject(str, message, exc, createMap);
    }

    @ReactMethod
    public void httpsCallable(String str, String str2, String str3, Integer num, String str4, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        Promise promise2 = promise;
        Task i10 = this.module.i(str, str2, str3, num, str4, readableMap.toHashMap().get("data"), readableMap2);
        i10.addOnSuccessListener((Executor) getExecutor(), new c(promise2));
        i10.addOnFailureListener((Executor) getExecutor(), (OnFailureListener) new d(promise2));
    }

    @ReactMethod
    public void httpsCallableFromUrl(String str, String str2, String str3, Integer num, String str4, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        Promise promise2 = promise;
        Task j10 = this.module.j(str, str2, str3, num, str4, readableMap.toHashMap().get("data"), readableMap2);
        j10.addOnSuccessListener((Executor) getExecutor(), new a(promise2));
        j10.addOnFailureListener((Executor) getExecutor(), (OnFailureListener) new b(promise2));
    }
}

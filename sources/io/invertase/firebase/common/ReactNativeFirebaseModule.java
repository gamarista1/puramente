package io.invertase.firebase.common;

import Ue.m;
import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule {
    private final a executorService = new a(getName());
    private String moduleName;

    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        if (readableMap != null) {
            createMap.putMap("resolver", readableMap);
        }
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithExceptionMap(Promise promise, Exception exc) {
        promise.reject((Throwable) exc, m.b(exc));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        return getReactApplicationContext();
    }

    public final ExecutorService getExecutor() {
        return this.executorService.b();
    }

    public String getName() {
        return "RNFB" + this.moduleName + "Module";
    }

    public final ExecutorService getTransactionalExecutor() {
        return this.executorService.f();
    }

    public void initialize() {
        super.initialize();
    }

    public void onCatalystInstanceDestroy() {
        this.executorService.j();
    }

    public final void removeEventListeningExecutor(String str) {
        this.executorService.i(this.executorService.d(true, str));
    }

    public final ExecutorService getTransactionalExecutor(String str) {
        return this.executorService.g(str);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        promise.reject(str, str2, createMap);
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        createMap.putString("nativeErrorMessage", str3);
        promise.reject(str, str2, createMap);
    }
}

package com.masteratul.exceptionhandler;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.Thread;

public class ReactNativeExceptionHandlerModule extends ReactContextBaseJavaModule {
    /* access modifiers changed from: private */
    public static Class errorIntentTargetClass = DefaultErrorScreen.class;
    private static a nativeExceptionHandler;
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public Callback callbackHolder;
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler originalHandler;
    private ReactApplicationContext reactContext;

    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f59160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59161b;

        a(boolean z10, boolean z11) {
            this.f59160a = z10;
            this.f59161b = z11;
        }

        public void uncaughtException(Thread thread, Throwable th2) {
            String stackTraceString = Log.getStackTraceString(th2);
            ReactNativeExceptionHandlerModule.this.callbackHolder.invoke(stackTraceString);
            ReactNativeExceptionHandlerModule.f();
            ReactNativeExceptionHandlerModule reactNativeExceptionHandlerModule = ReactNativeExceptionHandlerModule.this;
            reactNativeExceptionHandlerModule.activity = reactNativeExceptionHandlerModule.getCurrentActivity();
            Intent intent = new Intent();
            intent.setClass(ReactNativeExceptionHandlerModule.this.activity, ReactNativeExceptionHandlerModule.errorIntentTargetClass);
            intent.putExtra("stack_trace_string", stackTraceString);
            intent.setFlags(268435456);
            ReactNativeExceptionHandlerModule.this.activity.startActivity(intent);
            ReactNativeExceptionHandlerModule.this.activity.finish();
            if (this.f59160a && ReactNativeExceptionHandlerModule.this.originalHandler != null) {
                ReactNativeExceptionHandlerModule.this.originalHandler.uncaughtException(thread, th2);
            }
            if (this.f59161b) {
                System.exit(0);
            }
        }
    }

    public ReactNativeExceptionHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    static /* bridge */ /* synthetic */ a f() {
        return null;
    }

    public static void replaceErrorScreenActivityClass(Class cls) {
        errorIntentTargetClass = cls;
    }

    public static void setNativeExceptionHandler(a aVar) {
    }

    public String getName() {
        return "ReactNativeExceptionHandler";
    }

    @ReactMethod
    public void setHandlerforNativeException(boolean z10, boolean z11, Callback callback) {
        this.callbackHolder = callback;
        this.originalHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new a(z10, z11));
    }
}

package com.reactnativerestart;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.C3446x;
import com.facebook.react.J;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.jakewharton.processphoenix.ProcessPhoenix;

public class RestartModule extends ReactContextBaseJavaModule {
    private static final String REACT_APPLICATION_CLASS_NAME = "com.facebook.react.ReactApplication";
    private static final String REACT_NATIVE_HOST_CLASS_NAME = "com.facebook.react.ReactNativeHost";
    private static a mReactInstanceHolder;
    private LifecycleEventListener mLifecycleEventListener = null;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59454a;

        a(Activity activity) {
            this.f59454a = activity;
        }

        public void run() {
            this.f59454a.recreate();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f59456a;

        b(J j10) {
            this.f59456a = j10;
        }

        public void run() {
            try {
                this.f59456a.n0();
            } catch (Throwable unused) {
                RestartModule.this.loadBundleLegacy();
            }
        }
    }

    public RestartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    static J getReactInstanceManager() {
        return null;
    }

    private void loadBundle() {
        clearLifecycleEventListener();
        try {
            J resolveInstanceManager = resolveInstanceManager();
            if (resolveInstanceManager != null) {
                new Handler(Looper.getMainLooper()).post(new b(resolveInstanceManager));
            }
        } catch (Throwable unused) {
            loadBundleLegacy();
        }
    }

    /* access modifiers changed from: private */
    public void loadBundleLegacy() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(currentActivity));
        }
    }

    private J resolveInstanceManager() {
        J reactInstanceManager = getReactInstanceManager();
        if (reactInstanceManager != null) {
            return reactInstanceManager;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((C3446x) currentActivity.getApplication()).a().c();
    }

    @ReactMethod
    public void Restart() {
        ProcessPhoenix.b(getReactApplicationContext());
    }

    public String getName() {
        return "RNRestart";
    }

    @ReactMethod
    public void restart() {
        ProcessPhoenix.b(getReactApplicationContext());
    }
}

package com.sayem.keepawake;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class KCKeepAwake extends ReactContextBaseJavaModule {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59547a;

        a(Activity activity) {
            this.f59547a = activity;
        }

        public void run() {
            this.f59547a.getWindow().addFlags(128);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59549a;

        b(Activity activity) {
            this.f59549a = activity;
        }

        public void run() {
            this.f59549a.getWindow().clearFlags(128);
        }
    }

    public KCKeepAwake(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void activate() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(currentActivity));
        }
    }

    @ReactMethod
    public void deactivate() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(currentActivity));
        }
    }

    public String getName() {
        return "KCKeepAwake";
    }
}

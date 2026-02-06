package com.reactnativegooglesignin;

import android.util.Log;
import com.facebook.react.bridge.Promise;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private Promise f59433a;

    /* renamed from: b  reason: collision with root package name */
    private String f59434b;

    private void d(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    private void e() {
        this.f59433a = null;
        this.f59434b = null;
    }

    public String a() {
        return this.f59434b;
    }

    public void b(String str, String str2) {
        Promise promise = this.f59433a;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot reject promise because it's null");
            return;
        }
        e();
        promise.reject(str, str2);
    }

    public void c(String str, Throwable th2) {
        Promise promise = this.f59433a;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot reject promise because it's null");
            return;
        }
        e();
        promise.reject(str, th2.getLocalizedMessage(), th2);
    }

    public void f(Object obj) {
        Promise promise = this.f59433a;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot resolve promise because it's null");
            return;
        }
        e();
        promise.resolve(obj);
    }

    public void g(Promise promise, String str) {
        Promise promise2 = this.f59433a;
        if (promise2 != null) {
            d(promise2, str);
        }
        this.f59433a = promise;
        this.f59434b = str;
    }
}

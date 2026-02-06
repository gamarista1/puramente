package com.facebook.reactnative.androidsdk;

import com.facebook.C3459v;
import com.facebook.r;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;

public abstract class e implements r {

    /* renamed from: a  reason: collision with root package name */
    Promise f42385a;

    public e(Promise promise) {
        this.f42385a = promise;
    }

    public void a(C3459v vVar) {
        Promise promise = this.f42385a;
        if (promise != null) {
            promise.reject((Throwable) vVar);
            this.f42385a = null;
        }
    }

    public void onCancel() {
        if (this.f42385a != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("isCancelled", true);
            this.f42385a.resolve(createMap);
            this.f42385a = null;
        }
    }
}

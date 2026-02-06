package com.facebook.reactnative.androidsdk;

import android.app.Activity;
import com.facebook.C3286a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Locale;
import java.util.Set;
import y7.C4199e;
import y7.C4213t;
import y7.D;
import y7.F;

@Q7.a(name = "FBLoginManager")
public class FBLoginManagerModule extends FBSDKCallbackManagerBaseJavaModule {
    public static final String NAME = "FBLoginManager";

    private class a extends e {
        public a(Promise promise) {
            super(promise);
        }

        /* renamed from: b */
        public void onSuccess(F f10) {
            if (this.f42385a != null) {
                C3286a.s(f10.a());
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("isCancelled", false);
                createMap.putArray("grantedPermissions", FBLoginManagerModule.this.setToWritableArray(f10.c()));
                createMap.putArray("declinedPermissions", FBLoginManagerModule.this.setToWritableArray(f10.b()));
                this.f42385a.resolve(createMap);
                this.f42385a = null;
            }
        }
    }

    public FBLoginManagerModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext, aVar);
    }

    /* access modifiers changed from: private */
    public WritableArray setToWritableArray(Set<String> set) {
        WritableArray createArray = Arguments.createArray();
        for (String pushString : set) {
            createArray.pushString(pushString);
        }
        return createArray;
    }

    @ReactMethod
    public void getDefaultAudience(Promise promise) {
        promise.resolve(D.o().m().name().toLowerCase(Locale.ROOT));
    }

    @ReactMethod
    public void getLoginBehavior(Promise promise) {
        promise.resolve(D.o().p().name().toLowerCase(Locale.ROOT));
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void logInWithPermissions(ReadableArray readableArray, Promise promise) {
        D o10 = D.o();
        o10.C(getCallbackManager(), new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            o10.r(currentActivity, f.p(readableArray));
        }
    }

    @ReactMethod
    public void logOut() {
        D.o().x();
    }

    @ReactMethod
    public void reauthorizeDataAccess(Promise promise) {
        D o10 = D.o();
        o10.C(getCallbackManager(), new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            o10.B(currentActivity);
        }
    }

    @ReactMethod
    public void setDefaultAudience(String str) {
        D.o().G(C4199e.valueOf(str.toUpperCase(Locale.ROOT)));
    }

    @ReactMethod
    public void setLoginBehavior(String str) {
        D.o().J(C4213t.valueOf(str.toUpperCase(Locale.ROOT)));
    }
}

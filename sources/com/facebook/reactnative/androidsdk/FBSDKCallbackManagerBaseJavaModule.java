package com.facebook.reactnative.androidsdk;

import com.facebook.C3324n;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public abstract class FBSDKCallbackManagerBaseJavaModule extends ReactContextBaseJavaModule {
    private final a mActivityEventListener;

    protected FBSDKCallbackManagerBaseJavaModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext);
        this.mActivityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    /* access modifiers changed from: protected */
    public C3324n getCallbackManager() {
        return this.mActivityEventListener.a();
    }
}

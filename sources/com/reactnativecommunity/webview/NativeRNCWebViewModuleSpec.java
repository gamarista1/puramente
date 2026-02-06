package com.reactnativecommunity.webview;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRNCWebViewModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCWebViewModule";

    public NativeRNCWebViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void isFileUploadSupported(Promise promise);

    @a
    @ReactMethod
    public abstract void shouldStartLoadWithLockIdentifier(boolean z10, double d10);
}

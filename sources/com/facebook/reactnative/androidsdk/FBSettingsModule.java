package com.facebook.reactnative.androidsdk;

import Q7.a;
import com.facebook.I;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

@a(name = "FBSettings")
public class FBSettingsModule extends BaseJavaModule {
    public static final String NAME = "FBSettings";

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initializeSDK() {
        I.j();
    }

    @ReactMethod
    public void setAdvertiserIDCollectionEnabled(Boolean bool) {
        I.W(bool.booleanValue());
    }

    @ReactMethod
    public void setAppID(String str) {
        I.X(str);
    }

    @ReactMethod
    public void setAppName(String str) {
        I.Y(str);
    }

    @ReactMethod
    public void setAutoLogAppEventsEnabled(Boolean bool) {
        I.Z(bool.booleanValue());
    }

    @ReactMethod
    public void setClientToken(String str) {
        I.a0(str);
    }

    @ReactMethod
    public void setDataProcessingOptions(ReadableArray readableArray, int i10, int i11) {
        I.b0((String[]) f.p(readableArray).toArray(new String[0]), i10, i11);
    }

    @ReactMethod
    public void setGraphAPIVersion(String str) {
        I.c0(str);
    }
}

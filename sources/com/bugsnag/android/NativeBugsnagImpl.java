package com.bugsnag.android;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

public class NativeBugsnagImpl extends NativeBugsnagSpec {
    private final C3278w impl;

    public NativeBugsnagImpl(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new C3278w(reactApplicationContext);
    }

    public void addFeatureFlag(String str, String str2) {
        this.impl.a(str, str2);
    }

    public void addFeatureFlags(ReadableArray readableArray) {
        this.impl.b(readableArray);
    }

    public void addMetadata(String str, ReadableMap readableMap) {
        this.impl.c(str, readableMap);
    }

    public void clearFeatureFlag(String str) {
        this.impl.d(str);
    }

    public void clearFeatureFlags() {
        this.impl.e();
    }

    public void clearMetadata(String str, String str2) {
        this.impl.f(str, str2);
    }

    public WritableMap configure(ReadableMap readableMap) {
        return this.impl.g(readableMap);
    }

    public void configureAsync(ReadableMap readableMap, Promise promise) {
        this.impl.h(readableMap, promise);
    }

    public boolean dispatch(ReadableMap readableMap) {
        return this.impl.i(readableMap);
    }

    public void dispatchAsync(ReadableMap readableMap, Promise promise) {
        this.impl.j(readableMap, promise);
    }

    public String getName() {
        return NativeBugsnagSpec.NAME;
    }

    public WritableMap getPayloadInfo(ReadableMap readableMap) {
        return this.impl.l(readableMap);
    }

    public void getPayloadInfoAsync(ReadableMap readableMap, Promise promise) {
        this.impl.m(readableMap, promise);
    }

    public void leaveBreadcrumb(ReadableMap readableMap) {
        this.impl.n(readableMap);
    }

    public void pauseSession() {
        this.impl.p();
    }

    public void resumeSession() {
        this.impl.q();
    }

    public void resumeSessionOnStartup() {
        this.impl.r();
    }

    public void startSession() {
        this.impl.t();
    }

    public void updateCodeBundleId(String str) {
        this.impl.u(str);
    }

    public void updateContext(String str) {
        this.impl.v(str);
    }

    public void updateUser(String str, String str2, String str3) {
        this.impl.w(str, str2, str3);
    }
}

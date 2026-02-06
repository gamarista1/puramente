package com.facebook.react;

import com.facebook.react.V;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;

public final /* synthetic */ class T implements V.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3328a f40305a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f40306b;

    public /* synthetic */ T(C3328a aVar, ReactApplicationContext reactApplicationContext) {
        this.f40305a = aVar;
        this.f40306b = reactApplicationContext;
    }

    public final NativeModule getModule(String str) {
        return this.f40305a.getModule(str, this.f40306b);
    }
}

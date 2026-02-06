package com.facebook.react.runtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.e0;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.jvm.internal.C6496s;

public final class Z implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final ReactHostImpl f41277a;

    public Z(ReactHostImpl reactHostImpl) {
        C6496s.h(reactHostImpl, "delegate");
        this.f41277a = reactHostImpl;
    }

    public Activity a() {
        return this.f41277a.s0();
    }

    public JavaScriptExecutorFactory b() {
        throw new IllegalStateException("Not implemented for bridgeless mode");
    }

    public View c(String str) {
        C6496s.h(str, "appKey");
        Activity a10 = a();
        if (a10 == null || this.f41277a.K0(str)) {
            return null;
        }
        h0 f10 = h0.f(a10, str, new Bundle());
        C6496s.g(f10, "createWithView(...)");
        f10.c(this.f41277a);
        f10.start();
        return f10.a();
    }

    public void d(String str) {
        C6496s.h(str, "s");
        this.f41277a.d(str);
    }

    public void f(View view) {
        C6496s.h(view, "rootView");
    }

    public void h() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext i10 = this.f41277a.i();
        if (i10 != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) i10.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit("toggleElementInspector", (Object) null);
        }
    }
}

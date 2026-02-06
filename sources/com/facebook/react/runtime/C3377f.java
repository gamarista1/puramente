package com.facebook.react.runtime;

import com.facebook.react.V;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ReactNativeConfig;
import java.util.List;

/* renamed from: com.facebook.react.runtime.f  reason: case insensitive filesystem */
public interface C3377f {
    JSRuntimeFactory a();

    ReactNativeConfig b();

    JSBundleLoader c();

    String d();

    List e();

    void f(Exception exc);

    V.a g();

    BindingsInstaller getBindingsInstaller();
}

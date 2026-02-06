package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;

/* renamed from: com.facebook.react.uimanager.h0  reason: case insensitive filesystem */
public class C3415h0 extends ReactContext {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f41679a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41680b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41681c;

    public C3415h0(ReactApplicationContext reactApplicationContext, Context context, String str, int i10) {
        super(context);
        initializeFromOther(reactApplicationContext);
        this.f41679a = reactApplicationContext;
        this.f41680b = str;
        this.f41681c = i10;
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f41679a.addLifecycleEventListener(lifecycleEventListener);
    }

    public ReactApplicationContext b() {
        return this.f41679a;
    }

    public int c() {
        return this.f41681c;
    }

    public void destroy() {
        this.f41679a.destroy();
    }

    public CatalystInstance getCatalystInstance() {
        return this.f41679a.getCatalystInstance();
    }

    public Activity getCurrentActivity() {
        return this.f41679a.getCurrentActivity();
    }

    public UIManager getFabricUIManager() {
        return this.f41679a.getFabricUIManager();
    }

    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f41679a.getJSCallInvokerHolder();
    }

    public JavaScriptModule getJSModule(Class cls) {
        return this.f41679a.getJSModule(cls);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f41679a.getJavaScriptContextHolder();
    }

    public NativeModule getNativeModule(Class cls) {
        return this.f41679a.getNativeModule(cls);
    }

    public Collection getNativeModules() {
        return this.f41679a.getNativeModules();
    }

    public String getSourceURL() {
        return this.f41679a.getSourceURL();
    }

    public void handleException(Exception exc) {
        this.f41679a.handleException(exc);
    }

    public boolean hasActiveCatalystInstance() {
        return this.f41679a.hasActiveCatalystInstance();
    }

    public boolean hasActiveReactInstance() {
        return this.f41679a.hasActiveCatalystInstance();
    }

    public boolean hasCatalystInstance() {
        return this.f41679a.hasCatalystInstance();
    }

    public boolean hasCurrentActivity() {
        return this.f41679a.hasCurrentActivity();
    }

    public boolean hasNativeModule(Class cls) {
        return this.f41679a.hasNativeModule(cls);
    }

    public boolean hasReactInstance() {
        return this.f41679a.hasReactInstance();
    }

    public boolean isBridgeless() {
        return this.f41679a.isBridgeless();
    }

    public void registerSegment(int i10, String str, Callback callback) {
        this.f41679a.registerSegment(i10, str, callback);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f41679a.removeLifecycleEventListener(lifecycleEventListener);
    }

    public NativeModule getNativeModule(String str) {
        return this.f41679a.getNativeModule(str);
    }
}

package com.facebook.react.defaults;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.V;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.C3377f;
import com.facebook.react.runtime.JSRuntimeFactory;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R$\u0010*\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\b0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.¨\u00060"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/f;", "Lcom/facebook/react/fabric/ReactNativeConfig;", "b", "()Lcom/facebook/react/fabric/ReactNativeConfig;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Llf/M;", "f", "(Ljava/lang/Exception;)V", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/bridge/JSBundleLoader;", "Lcom/facebook/react/bridge/JSBundleLoader;", "c", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "Lcom/facebook/react/P;", "Ljava/util/List;", "e", "()Ljava/util/List;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/BindingsInstaller;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lcom/facebook/react/fabric/ReactNativeConfig;", "reactNativeConfig", "Lkotlin/Function1;", "g", "Lyf/l;", "exceptionHandler", "Lcom/facebook/react/V$a;", "h", "Lcom/facebook/react/V$a;", "()Lcom/facebook/react/V$a;", "turboModuleManagerDelegateBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class DefaultReactHostDelegate implements C3377f {

    /* renamed from: a  reason: collision with root package name */
    private final String f40627a;

    /* renamed from: b  reason: collision with root package name */
    private final JSBundleLoader f40628b;

    /* renamed from: c  reason: collision with root package name */
    private final List f40629c;

    /* renamed from: d  reason: collision with root package name */
    private final JSRuntimeFactory f40630d;

    /* renamed from: e  reason: collision with root package name */
    private final BindingsInstaller f40631e;

    /* renamed from: f  reason: collision with root package name */
    private final ReactNativeConfig f40632f;

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f40633g;

    /* renamed from: h  reason: collision with root package name */
    private final V.a f40634h;

    public JSRuntimeFactory a() {
        return this.f40630d;
    }

    public ReactNativeConfig b() {
        return this.f40632f;
    }

    public JSBundleLoader c() {
        return this.f40628b;
    }

    public String d() {
        return this.f40627a;
    }

    public List e() {
        return this.f40629c;
    }

    public void f(Exception exc) {
        C6496s.h(exc, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.f40633g.invoke(exc);
    }

    public V.a g() {
        return this.f40634h;
    }

    public BindingsInstaller getBindingsInstaller() {
        return this.f40631e;
    }
}

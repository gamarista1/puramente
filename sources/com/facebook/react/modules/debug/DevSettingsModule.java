package com.facebook.react.modules.debug;

import I7.e;
import Q7.a;
import com.amazon.a.a.o.b;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@a(name = "DevSettings")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/debug/DevSettingsModule;", "Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LI7/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LI7/e;)V", "Llf/M;", "reload", "()V", "", "reason", "reloadWithReason", "(Ljava/lang/String;)V", "onFastRefresh", "", "isHotLoadingEnabled", "setHotLoadingEnabled", "(Z)V", "isDebugginRemotelyEnabled", "setIsDebuggingRemotely", "isProfilingEnabled", "setProfilingEnabled", "toggleElementInspector", "title", "addMenuItem", "openDebugger", "enabled", "setIsShakeToShowDevMenuEnabled", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "LI7/e;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevSettingsModule extends NativeDevSettingsSpec {
    private final e devSupportManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, e eVar) {
        super(reactApplicationContext);
        C6496s.h(eVar, "devSupportManager");
        this.devSupportManager = eVar;
    }

    /* access modifiers changed from: private */
    public static final void addMenuItem$lambda$1(String str, DevSettingsModule devSettingsModule) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(b.f37461S, str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = devSettingsModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", createMap);
        }
    }

    /* access modifiers changed from: private */
    public static final void reload$lambda$0(DevSettingsModule devSettingsModule) {
        devSettingsModule.devSupportManager.z();
    }

    public void addListener(String str) {
        C6496s.h(str, "eventName");
    }

    public void addMenuItem(String str) {
        C6496s.h(str, b.f37461S);
        this.devSupportManager.t(str, new b(str, this));
    }

    public void onFastRefresh() {
    }

    public void openDebugger() {
        this.devSupportManager.F();
    }

    public void reload() {
        if (this.devSupportManager.o()) {
            UiThreadUtil.runOnUiThread(new c(this));
        }
    }

    public void reloadWithReason(String str) {
        C6496s.h(str, "reason");
        reload();
    }

    public void removeListeners(double d10) {
    }

    public void setHotLoadingEnabled(boolean z10) {
        this.devSupportManager.d(z10);
    }

    public void setIsDebuggingRemotely(boolean z10) {
        this.devSupportManager.k(z10);
    }

    public void setIsShakeToShowDevMenuEnabled(boolean z10) {
    }

    public void setProfilingEnabled(boolean z10) {
        this.devSupportManager.j(z10);
    }

    public void toggleElementInspector() {
        this.devSupportManager.h();
    }
}

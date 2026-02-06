package com.facebook.react.modules.debug;

import I7.e;
import Q7.a;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@a(name = "DevMenu")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/debug/DevMenuModule;", "Lcom/facebook/fbreact/specs/NativeDevMenuSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LI7/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LI7/e;)V", "Llf/M;", "show", "()V", "reload", "", "enableDebug", "debugRemotely", "(Z)V", "enabled", "setProfilingEnabled", "setHotLoadingEnabled", "LI7/e;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevMenuModule extends NativeDevMenuSpec {
    private final e devSupportManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevMenuModule(ReactApplicationContext reactApplicationContext, e eVar) {
        super(reactApplicationContext);
        C6496s.h(eVar, "devSupportManager");
        this.devSupportManager = eVar;
    }

    /* access modifiers changed from: private */
    public static final void reload$lambda$0(DevMenuModule devMenuModule) {
        devMenuModule.devSupportManager.z();
    }

    public void debugRemotely(boolean z10) {
        this.devSupportManager.k(z10);
    }

    public void reload() {
        if (this.devSupportManager.o()) {
            UiThreadUtil.runOnUiThread(new a(this));
        }
    }

    public void setHotLoadingEnabled(boolean z10) {
        this.devSupportManager.d(z10);
    }

    public void setProfilingEnabled(boolean z10) {
    }

    public void show() {
        if (this.devSupportManager.o()) {
            this.devSupportManager.D();
        }
    }
}

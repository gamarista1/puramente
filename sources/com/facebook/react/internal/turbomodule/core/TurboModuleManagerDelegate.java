package com.facebook.react.internal.turbomodule.core;

import B7.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Collections;
import java.util.List;

public abstract class TurboModuleManagerDelegate {
    @a
    private final HybridData mHybridData;

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    protected TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    public List<String> getEagerInitModuleNames() {
        return Collections.emptyList();
    }

    public NativeModule getLegacyModule(String str) {
        return null;
    }

    public abstract TurboModule getModule(String str);

    /* access modifiers changed from: protected */
    public abstract HybridData initHybrid();

    /* access modifiers changed from: protected */
    public synchronized void maybeLoadOtherSoLibraries() {
    }

    public boolean unstable_isLegacyModuleRegistered(String str) {
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(String str);

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return false;
    }

    protected TurboModuleManagerDelegate(HybridData hybridData) {
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }
}

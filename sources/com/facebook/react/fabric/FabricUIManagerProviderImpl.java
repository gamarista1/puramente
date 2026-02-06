package com.facebook.react.fabric;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.B0;
import z8.C4236a;

public class FabricUIManagerProviderImpl implements UIManagerProvider {
    private final ComponentFactory mComponentFactory;
    private final ReactNativeConfig mConfig;
    private final B0 mViewManagerRegistry;

    public FabricUIManagerProviderImpl(ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, B0 b02) {
        this.mComponentFactory = componentFactory;
        this.mConfig = reactNativeConfig;
        this.mViewManagerRegistry = b02;
    }

    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        C4236a.c(0, "FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        C4236a.c(0, "FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(reactApplicationContext, this.mViewManagerRegistry, eventBeatManager);
        C4236a.i(0);
        C4236a.c(0, "FabricUIManagerProviderImpl.registerBinding");
        FabricUIManagerBinding fabricUIManagerBinding = new FabricUIManagerBinding();
        CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance.getRuntimeExecutor();
        RuntimeScheduler runtimeScheduler = catalystInstance.getRuntimeScheduler();
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        fabricUIManagerBinding.register(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.mComponentFactory, this.mConfig);
        C4236a.i(0);
        C4236a.i(0);
        return fabricUIManager;
    }
}

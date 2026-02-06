package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.n0;

class ReaCompatibility {
    private FabricUIManager fabricUIManager;

    public ReaCompatibility(ReactApplicationContext reactApplicationContext) {
        this.fabricUIManager = (FabricUIManager) n0.g(reactApplicationContext, 2);
    }

    public void registerFabricEventListener(NodesManager nodesManager) {
        FabricUIManager fabricUIManager2 = this.fabricUIManager;
        if (fabricUIManager2 != null) {
            fabricUIManager2.getEventDispatcher().g(nodesManager);
        }
    }

    public void synchronouslyUpdateUIProps(int i10, ReadableMap readableMap) {
        this.fabricUIManager.synchronouslyUpdateViewOnUIThread(i10, readableMap);
    }
}

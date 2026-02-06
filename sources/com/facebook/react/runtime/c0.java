package com.facebook.react.runtime;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.q0;
import java.util.Map;

public final /* synthetic */ class c0 implements UIConstantsProviderBinding.DefaultEventTypesProvider {
    public final NativeMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, Object>) q0.d());
    }
}

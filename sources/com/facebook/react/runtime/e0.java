package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import java.util.Map;

public final /* synthetic */ class e0 implements UIConstantsProviderBinding.ConstantsProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactInstance f41302a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f41303b;

    public /* synthetic */ e0(ReactInstance reactInstance, Map map) {
        this.f41302a = reactInstance;
        this.f41303b = map;
    }

    public final NativeMap getConstants() {
        return this.f41302a.y(this.f41303b);
    }
}

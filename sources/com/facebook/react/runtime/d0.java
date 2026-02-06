package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import java.util.Map;

public final /* synthetic */ class d0 implements UIConstantsProviderBinding.ConstantsForViewManagerProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactInstance f41298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f41299b;

    public /* synthetic */ d0(ReactInstance reactInstance, Map map) {
        this.f41298a = reactInstance;
        this.f41299b = map;
    }

    public final NativeMap getConstantsForViewManager(String str) {
        return this.f41298a.x(this.f41299b, str);
    }
}

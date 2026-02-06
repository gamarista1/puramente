package com.facebook.react;

import com.facebook.react.V;
import com.facebook.react.bridge.NativeModule;
import java.util.Map;

public final /* synthetic */ class U implements V.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f40307a;

    public /* synthetic */ U(Map map) {
        this.f40307a = map;
    }

    public final NativeModule getModule(String str) {
        return (NativeModule) this.f40307a.get(str);
    }
}

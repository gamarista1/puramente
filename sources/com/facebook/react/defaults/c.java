package com.facebook.react.defaults;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;

public final /* synthetic */ class c implements UIManagerProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f40645a;

    public /* synthetic */ c(d dVar) {
        this.f40645a = dVar;
    }

    public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return d.j(this.f40645a, reactApplicationContext);
    }
}

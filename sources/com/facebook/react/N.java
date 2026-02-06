package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;

public final /* synthetic */ class N implements UIManagerProvider {
    public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return O.h(reactApplicationContext);
    }
}

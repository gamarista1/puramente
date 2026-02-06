package com.swmansion.reanimated;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;

public final /* synthetic */ class d implements UIManagerModule.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UIManager f59622a;

    public /* synthetic */ d(UIManager uIManager) {
        this.f59622a = uIManager;
    }

    public final String a(String str) {
        return this.f59622a.resolveCustomDirectEventName(str);
    }
}

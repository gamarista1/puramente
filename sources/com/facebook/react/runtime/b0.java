package com.facebook.react.runtime;

import com.facebook.react.uimanager.ComponentNameResolver;

public final /* synthetic */ class b0 implements ComponentNameResolver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactInstance f41293a;

    public /* synthetic */ b0(ReactInstance reactInstance) {
        this.f41293a = reactInstance;
    }

    public final String[] getComponentNames() {
        return this.f41293a.v();
    }
}

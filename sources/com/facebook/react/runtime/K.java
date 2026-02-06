package com.facebook.react.runtime;

import com.facebook.react.bridge.MemoryPressureListener;
import java.lang.ref.WeakReference;

public final /* synthetic */ class K implements MemoryPressureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WeakReference f41195b;

    public /* synthetic */ K(ReactHostImpl reactHostImpl, WeakReference weakReference) {
        this.f41194a = reactHostImpl;
        this.f41195b = weakReference;
    }

    public final void handleMemoryPressure(int i10) {
        this.f41194a.Q0(this.f41195b, i10);
    }
}

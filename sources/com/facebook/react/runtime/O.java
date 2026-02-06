package com.facebook.react.runtime;

import java.lang.ref.WeakReference;

public final /* synthetic */ class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f41202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f41203b;

    public /* synthetic */ O(WeakReference weakReference, int i10) {
        this.f41202a = weakReference;
        this.f41203b = i10;
    }

    public final void run() {
        ReactHostImpl.P0(this.f41202a, this.f41203b);
    }
}

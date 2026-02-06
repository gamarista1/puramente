package com.facebook.react.bridge;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f40573a;

    public /* synthetic */ h(CatalystInstanceImpl catalystInstanceImpl) {
        this.f40573a = catalystInstanceImpl;
    }

    public final void run() {
        this.f40573a.mNativeModuleRegistry.onBatchComplete();
    }
}

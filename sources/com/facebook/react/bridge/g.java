package com.facebook.react.bridge;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f40572a;

    public /* synthetic */ g(CatalystInstanceImpl catalystInstanceImpl) {
        this.f40572a = catalystInstanceImpl;
    }

    public final void run() {
        this.f40572a.lambda$decrementPendingJSCalls$5();
    }
}

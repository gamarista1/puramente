package com.facebook.react.bridge;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f40570a;

    public /* synthetic */ e(CatalystInstanceImpl catalystInstanceImpl) {
        this.f40570a = catalystInstanceImpl;
    }

    public final void run() {
        this.f40570a.lambda$incrementPendingJSCalls$4();
    }
}

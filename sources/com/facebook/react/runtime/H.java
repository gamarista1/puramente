package com.facebook.react.runtime;

import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;

public final /* synthetic */ class H implements QueueThreadExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f41192a;

    public /* synthetic */ H(ReactHostImpl reactHostImpl) {
        this.f41192a = reactHostImpl;
    }

    public final void handleException(Exception exc) {
        this.f41192a.G0(exc);
    }
}

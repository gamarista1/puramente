package com.facebook.react.bridge.queue;

import com.facebook.react.common.futures.SimpleSettableFuture;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SimpleSettableFuture f40579a;

    public /* synthetic */ b(SimpleSettableFuture simpleSettableFuture) {
        this.f40579a = simpleSettableFuture;
    }

    public final void run() {
        MessageQueueThreadImpl.lambda$startNewBackgroundThread$2(this.f40579a);
    }
}

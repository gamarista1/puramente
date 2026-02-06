package com.facebook.react.bridge.queue;

import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SimpleSettableFuture f40577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f40578b;

    public /* synthetic */ a(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        this.f40577a = simpleSettableFuture;
        this.f40578b = callable;
    }

    public final void run() {
        MessageQueueThreadImpl.lambda$callOnQueue$0(this.f40577a, this.f40578b);
    }
}

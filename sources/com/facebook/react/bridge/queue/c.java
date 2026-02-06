package com.facebook.react.bridge.queue;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MessageQueueThreadImpl f40580a;

    public /* synthetic */ c(MessageQueueThreadImpl messageQueueThreadImpl) {
        this.f40580a = messageQueueThreadImpl;
    }

    public final void run() {
        this.f40580a.lambda$resetPerfStats$1();
    }
}

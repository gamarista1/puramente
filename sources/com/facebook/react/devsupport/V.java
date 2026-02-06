package com.facebook.react.devsupport;

public final /* synthetic */ class V implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LogBoxModule f40750a;

    public /* synthetic */ V(LogBoxModule logBoxModule) {
        this.f40750a = logBoxModule;
    }

    public final void run() {
        LogBoxModule.invalidate$lambda$2(this.f40750a);
    }
}

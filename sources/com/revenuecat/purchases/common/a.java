package com.revenuecat.purchases.common;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Throwable f59476a;

    public /* synthetic */ a(Throwable th2) {
        this.f59476a = th2;
    }

    public final void run() {
        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(this.f59476a);
    }
}

package com.revenuecat.purchases.common.diagnostics;

import yf.C6787a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59480a;

    public /* synthetic */ b(C6787a aVar) {
        this.f59480a = aVar;
    }

    public final void run() {
        DiagnosticsTracker.enqueue$lambda$0(this.f59480a);
    }
}

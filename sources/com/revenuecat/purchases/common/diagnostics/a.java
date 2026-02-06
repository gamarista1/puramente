package com.revenuecat.purchases.common.diagnostics;

import yf.C6787a;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59479a;

    public /* synthetic */ a(C6787a aVar) {
        this.f59479a = aVar;
    }

    public final void run() {
        DiagnosticsSynchronizer.enqueue$lambda$0(this.f59479a);
    }
}

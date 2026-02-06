package com.revenuecat.purchases.common.events;

import yf.C6787a;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59483a;

    public /* synthetic */ a(C6787a aVar) {
        this.f59483a = aVar;
    }

    public final void run() {
        EventsManager.enqueue$lambda$0(this.f59483a);
    }
}

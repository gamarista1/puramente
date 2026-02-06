package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.RequestId;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserDataHandler f59468a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RequestId f59469b;

    public /* synthetic */ b(UserDataHandler userDataHandler, RequestId requestId) {
        this.f59468a = userDataHandler;
        this.f59469b = requestId;
    }

    public final void run() {
        UserDataHandler.addTimeoutToUserDataRequest$lambda$5(this.f59468a, this.f59469b);
    }
}

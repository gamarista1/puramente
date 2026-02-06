package com.revenuecat.purchases;

import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3198e f59535b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f59536c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C3194a f59537d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f59538e;

    public /* synthetic */ i(AtomicBoolean atomicBoolean, C3198e eVar, Callback callback, C3194a aVar, List list) {
        this.f59534a = atomicBoolean;
        this.f59535b = eVar;
        this.f59536c = callback;
        this.f59537d = aVar;
        this.f59538e = list;
    }

    public final void run() {
        PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1(this.f59534a, this.f59535b, this.f59536c, this.f59537d, this.f59538e);
    }
}

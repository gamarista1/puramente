package com.revenuecat.purchases;

import com.android.billingclient.api.C3194a;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3194a f59529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f59531c;

    public /* synthetic */ h(C3194a aVar, AtomicBoolean atomicBoolean, Callback callback) {
        this.f59529a = aVar;
        this.f59530b = atomicBoolean;
        this.f59531c = callback;
    }

    public final void run() {
        PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(this.f59529a, this.f59530b, this.f59531c);
    }
}

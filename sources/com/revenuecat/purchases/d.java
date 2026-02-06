package com.revenuecat.purchases;

import com.revenuecat.purchases.PurchasesFactory;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f59497a;

    public /* synthetic */ d(Runnable runnable) {
        this.f59497a = runnable;
    }

    public final void run() {
        PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(this.f59497a);
    }
}

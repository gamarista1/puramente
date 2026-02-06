package com.revenuecat.purchases.google.usecase;

import J4.C3045k;
import com.android.billingclient.api.C3198e;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class f implements C3045k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ QueryPurchaseHistoryUseCase f59521b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Date f59522c;

    public /* synthetic */ f(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date) {
        this.f59520a = atomicBoolean;
        this.f59521b = queryPurchaseHistoryUseCase;
        this.f59522c = date;
    }

    public final void a(C3198e eVar, List list) {
        QueryPurchaseHistoryUseCase$executeAsync$1.invoke$lambda$1$lambda$0(this.f59520a, this.f59521b, this.f59522c, eVar, list);
    }
}

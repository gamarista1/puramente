package com.revenuecat.purchases.google.usecase;

import J4.C3046l;
import com.android.billingclient.api.C3198e;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class g implements C3046l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59523a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ QueryPurchasesByTypeUseCase f59524b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f59525c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f59526d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C3046l f59527e;

    public /* synthetic */ g(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, C3046l lVar) {
        this.f59523a = atomicBoolean;
        this.f59524b = queryPurchasesByTypeUseCase;
        this.f59525c = str;
        this.f59526d = date;
        this.f59527e = lVar;
    }

    public final void a(C3198e eVar, List list) {
        QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(this.f59523a, this.f59524b, this.f59525c, this.f59526d, this.f59527e, eVar, list);
    }
}

package com.revenuecat.purchases.google.usecase;

import J4.C3044j;
import com.android.billingclient.api.C3198e;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class d implements C3044j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59514a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsUseCase f59515b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f59516c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f59517d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C3044j f59518e;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, String str, Date date, C3044j jVar) {
        this.f59514a = atomicBoolean;
        this.f59515b = queryProductDetailsUseCase;
        this.f59516c = str;
        this.f59517d = date;
        this.f59518e = jVar;
    }

    public final void a(C3198e eVar, List list) {
        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$3(this.f59514a, this.f59515b, this.f59516c, this.f59517d, this.f59518e, eVar, list);
    }
}

package com.revenuecat.purchases.google.usecase;

import J4.C3038d;
import com.android.billingclient.api.C3196c;
import com.android.billingclient.api.C3198e;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class c implements C3038d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f59512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GetBillingConfigUseCase f59513b;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.f59512a = atomicBoolean;
        this.f59513b = getBillingConfigUseCase;
    }

    public final void a(C3198e eVar, C3196c cVar) {
        GetBillingConfigUseCase$executeAsync$1.invoke$lambda$0(this.f59512a, this.f59513b, eVar, cVar);
    }
}

package com.revenuecat.purchases.common.offerings;

import java.util.List;
import java.util.Set;
import yf.C6798l;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f59484a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f59485b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ OfferingsFactory f59486c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6798l f59487d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6798l f59488e;

    public /* synthetic */ a(List list, Set set, OfferingsFactory offeringsFactory, C6798l lVar, C6798l lVar2) {
        this.f59484a = list;
        this.f59485b = set;
        this.f59486c = offeringsFactory;
        this.f59487d = lVar;
        this.f59488e = lVar2;
    }

    public final void run() {
        OfferingsFactory$getStoreProductsById$1.invoke$lambda$1(this.f59484a, this.f59485b, this.f59486c, this.f59487d, this.f59488e);
    }
}

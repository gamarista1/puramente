package com.revenuecat.purchases.common.offerings;

import java.util.List;
import java.util.Map;
import yf.C6798l;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f59489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f59490b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6798l f59491c;

    public /* synthetic */ b(Map map, List list, C6798l lVar) {
        this.f59489a = map;
        this.f59490b = list;
        this.f59491c = lVar;
    }

    public final void run() {
        OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(this.f59489a, this.f59490b, this.f59491c);
    }
}

package com.revenuecat.purchases;

import yf.C6798l;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PostPendingTransactionsHelper f59471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f59472b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f59473c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6798l f59474d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6798l f59475e;

    public /* synthetic */ c(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, C6798l lVar, C6798l lVar2) {
        this.f59471a = postPendingTransactionsHelper;
        this.f59472b = str;
        this.f59473c = z10;
        this.f59474d = lVar;
        this.f59475e = lVar2;
    }

    public final void run() {
        PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$0(this.f59471a, this.f59472b, this.f59473c, this.f59474d, this.f59475e);
    }
}

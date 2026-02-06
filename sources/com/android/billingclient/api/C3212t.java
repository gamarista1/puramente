package com.android.billingclient.api;

import J4.C3045k;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.t  reason: case insensitive filesystem */
final class C3212t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f38345a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C3045k f38346b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C3195b f38347c;

    C3212t(C3195b bVar, String str, C3045k kVar) {
        this.f38345a = str;
        this.f38346b = kVar;
        this.f38347c = bVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        B J02 = this.f38347c.v0(this.f38345a);
        this.f38346b.a(J02.a(), J02.b());
        return null;
    }
}

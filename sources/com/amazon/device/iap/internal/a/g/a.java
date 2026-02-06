package com.amazon.device.iap.internal.a.g;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

abstract class a extends h {

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37870b = "response_received";

    a(c cVar, String str) {
        super(cVar, f37870b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        b(false);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        return true;
    }
}

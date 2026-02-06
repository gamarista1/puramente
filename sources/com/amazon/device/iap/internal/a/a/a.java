package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import java.util.Set;

abstract class a extends h {

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37824b = "getItem_data";

    /* renamed from: c  reason: collision with root package name */
    protected final Set<String> f37825c;

    a(c cVar, String str, Set<String> set) {
        super(cVar, f37824b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f37825c = set;
        a(b.f37457O, set);
    }
}

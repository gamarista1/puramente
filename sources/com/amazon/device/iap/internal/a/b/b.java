package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.a;

abstract class b extends h {

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37829b = "purchase_updates";

    /* renamed from: c  reason: collision with root package name */
    protected final boolean f37830c;

    b(c cVar, String str, boolean z10) {
        super(cVar, f37829b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f37830c = z10;
    }

    /* access modifiers changed from: protected */
    public void e() {
        String str;
        super.e();
        String str2 = (String) ((c) j()).a().a("userId");
        if (this.f37830c) {
            str = null;
        } else {
            str = a.a(str2);
        }
        a(com.amazon.a.a.o.b.f37479b, str);
        a(com.amazon.a.a.o.b.f37472ac, Boolean.valueOf(d.f().d()));
    }
}

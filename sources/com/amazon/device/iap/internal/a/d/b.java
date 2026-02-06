package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.model.a;
import java.util.Set;

public final class b extends h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37850d = "purchase_fulfilled";

    /* renamed from: b  reason: collision with root package name */
    protected final Set<String> f37851b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f37852c;

    public b(c cVar, Set<String> set, String str) {
        super(cVar, f37850d, com.amazon.a.a.o.b.f37477ah, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f37851b = set;
        this.f37852c = str;
        b(false);
        a(com.amazon.a.a.o.b.f37448F, set);
        a(com.amazon.a.a.o.b.f37484g, str);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        return true;
    }

    public void l() {
        Object a10 = j().a().a(com.amazon.a.a.o.b.ao);
        if (a10 != null && Boolean.FALSE.equals(a10)) {
            a(com.amazon.a.a.o.b.f37484g, a.DELIVERY_ATTEMPTED.toString());
        }
        super.l();
    }
}

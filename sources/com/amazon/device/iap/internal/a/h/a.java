package com.amazon.device.iap.internal.a.h;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

public class a extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f37871b = "submit_metric";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37872c = "metricName";

    /* renamed from: d  reason: collision with root package name */
    private static final String f37873d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, f37871b, "1.0", cVar.d().toString(), PurchasingService.SDK_VERSION);
        a(f37872c, str);
        a(f37873d, str2);
        b(false);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        return true;
    }
}

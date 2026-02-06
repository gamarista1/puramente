package com.amazon.device.iap.internal.a.e;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.n.b;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.MetricsHelper;
import java.util.Map;

abstract class a extends h {

    /* renamed from: b  reason: collision with root package name */
    protected static final String f37856b = "purchase_item";
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f37857f = "a";
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    protected b f37858c;
    @com.amazon.a.a.k.a

    /* renamed from: d  reason: collision with root package name */
    protected com.amazon.a.a.a.a f37859d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f37860e;

    a(c cVar, String str, String str2) {
        super(cVar, f37856b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f37860e = str2;
        boolean d10 = d.f().d();
        a("sku", str2);
        a(com.amazon.a.a.o.b.f37472ac, Boolean.valueOf(d10));
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        String str = f37857f;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b10);
        if (!b10.containsKey(com.amazon.a.a.o.b.f37503z)) {
            com.amazon.device.iap.internal.util.b.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.b.a(str, "found intent");
        final Intent intent = (Intent) b10.remove(com.amazon.a.a.o.b.f37503z);
        this.f37858c.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                try {
                    Activity b10 = a.this.f37859d.b();
                    if (b10 == null) {
                        b10 = a.this.f37859d.a();
                    }
                    String o10 = a.f37857f;
                    com.amazon.device.iap.internal.util.b.a(o10, "About to fire intent with activity " + b10);
                    b10.startActivity(intent);
                } catch (Exception e10) {
                    String a10 = a.this.k();
                    MetricsHelper.submitExceptionMetrics(a10, a.f37857f + ".onResult().execute()", e10);
                    String o11 = a.f37857f;
                    com.amazon.device.iap.internal.util.b.b(o11, "Exception when attempting to fire intent: " + e10);
                }
            }
        });
        return true;
    }
}

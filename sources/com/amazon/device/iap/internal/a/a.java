package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.c;
import com.amazon.a.a.i.h;
import com.amazon.device.iap.internal.util.b;

public class a extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f37817b = "a";

    /* renamed from: e  reason: collision with root package name */
    private static final String f37818e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f  reason: collision with root package name */
    private static final String f37819f = "Amazon Appstore required";

    /* renamed from: g  reason: collision with root package name */
    private static final String f37820g = "Amazon Appstore Update Required";

    /* renamed from: j  reason: collision with root package name */
    private static final long f37821j = 31536000;
    @com.amazon.a.a.k.a

    /* renamed from: h  reason: collision with root package name */
    private com.amazon.a.a.a.a f37822h;

    /* renamed from: i  reason: collision with root package name */
    private final c f37823i;

    public a(c cVar) {
        super(cVar);
        this.f37823i = cVar;
    }

    /* access modifiers changed from: protected */
    public long h() {
        return 31536000;
    }

    /* access modifiers changed from: protected */
    public void i() {
        b.a(f37817b, "doAction");
        if (f37819f.equalsIgnoreCase(this.f37823i.e()) || f37820g.equalsIgnoreCase(this.f37823i.e())) {
            try {
                Activity b10 = this.f37822h.b();
                if (b10 == null) {
                    b10 = this.f37822h.a();
                }
                b10.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f37818e)));
            } catch (Exception e10) {
                String str = f37817b;
                b.b(str, "Exception in PurchaseItemCommandTask.OnSuccess: " + e10);
            }
        }
    }

    public String toString() {
        return f37817b;
    }
}

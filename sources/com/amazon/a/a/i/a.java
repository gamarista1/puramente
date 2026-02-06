package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class a extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f37189b = "a";

    /* renamed from: e  reason: collision with root package name */
    private static final String f37190e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f  reason: collision with root package name */
    private static final String f37191f = "Amazon Appstore required";

    /* renamed from: g  reason: collision with root package name */
    private static final String f37192g = "Amazon Appstore Update Required";

    /* renamed from: j  reason: collision with root package name */
    private static final long f37193j = 31536000;
    @com.amazon.a.a.k.a

    /* renamed from: h  reason: collision with root package name */
    private com.amazon.a.a.a.a f37194h;

    /* renamed from: i  reason: collision with root package name */
    private final c f37195i;

    public a(c cVar) {
        super(cVar);
        this.f37195i = cVar;
    }

    /* access modifiers changed from: protected */
    public long h() {
        return 31536000;
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (f37191f.equalsIgnoreCase(this.f37195i.e()) || f37192g.equalsIgnoreCase(this.f37195i.e())) {
            try {
                Activity b10 = this.f37194h.b();
                if (b10 == null) {
                    b10 = this.f37194h.a();
                }
                b10.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f37190e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f37189b;
    }
}

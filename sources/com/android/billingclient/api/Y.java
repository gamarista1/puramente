package com.android.billingclient.api;

import J4.C3047m;
import J4.E;
import J4.p;
import J4.s;
import android.content.Context;
import android.content.IntentFilter;

final class Y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38185a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C3047m f38186b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final N f38187c;

    /* renamed from: d  reason: collision with root package name */
    private final X f38188d = new X(this, true);

    /* renamed from: e  reason: collision with root package name */
    private final X f38189e = new X(this, false);

    /* renamed from: f  reason: collision with root package name */
    private boolean f38190f;

    Y(Context context, C3047m mVar, E e10, s sVar, p pVar, N n10) {
        this.f38185a = context;
        this.f38186b = mVar;
        this.f38187c = n10;
    }

    /* access modifiers changed from: package-private */
    public final C3047m d() {
        return this.f38186b;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f38188d.c(this.f38185a);
        this.f38189e.c(this.f38185a);
    }

    /* access modifiers changed from: package-private */
    public final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f38190f = z10;
        this.f38189e.a(this.f38185a, intentFilter2);
        if (this.f38190f) {
            this.f38188d.b(this.f38185a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f38188d.a(this.f38185a, intentFilter);
        }
    }
}

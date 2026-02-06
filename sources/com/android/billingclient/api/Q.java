package com.android.billingclient.api;

import J4.D;
import W8.c;
import W8.d;
import W8.h;
import Y8.t;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;

final class Q {

    /* renamed from: a  reason: collision with root package name */
    private boolean f38176a;

    /* renamed from: b  reason: collision with root package name */
    private h f38177b;

    Q(Context context) {
        try {
            t.f(context);
            this.f38177b = t.c().g(a.f42760g).a("PLAY_BILLING_LIBRARY", zzlk.class, c.b("proto"), new D());
        } catch (Throwable unused) {
            this.f38176a = true;
        }
    }

    public final void a(zzlk zzlk) {
        if (this.f38176a) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f38177b.a(d.e(zzlk));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }
}

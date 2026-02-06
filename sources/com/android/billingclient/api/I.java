package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

final class I implements zzej {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Consumer f38113a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f38114b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ L f38115c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f38116d;

    I(L l10, int i10, Consumer consumer, Runnable runnable) {
        this.f38116d = i10;
        this.f38113a = consumer;
        this.f38114b = runnable;
        this.f38115c = l10;
    }

    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f38115c.o1(114, 28, O.f38132G);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f38115c.o1(107, 28, O.f38132G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f38114b.run();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        L l10 = this.f38115c;
        if (L.l1(intValue)) {
            this.f38113a.accept(l10.m1(this.f38116d, num.intValue()));
            return;
        }
        this.f38114b.run();
    }
}

package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

final class P implements N {

    /* renamed from: b  reason: collision with root package name */
    private zzku f38159b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f38160c;

    P(Context context, zzku zzku) {
        this.f38160c = new Q(context);
        this.f38159b = zzku;
    }

    public final void a(zzkl zzkl) {
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f38159b);
            zzc.zzn(zzkl);
            this.f38160c.a((zzlk) zzc.zzf());
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void b(zzlq zzlq) {
        try {
            Q q10 = this.f38160c;
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f38159b);
            zzc.zzp(zzlq);
            q10.a((zzlk) zzc.zzf());
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void c(zzjz zzjz, int i10) {
        try {
            zzks zzks = (zzks) this.f38159b.zzn();
            zzks.zza(i10);
            this.f38159b = (zzku) zzks.zzf();
            f(zzjz);
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void d(zzkd zzkd) {
        if (zzkd != null) {
            try {
                zzli zzc = zzlk.zzc();
                zzc.zzo(this.f38159b);
                zzc.zzm(zzkd);
                this.f38160c.a((zzlk) zzc.zzf());
            } catch (Throwable th2) {
                zze.zzm("BillingLogger", "Unable to log.", th2);
            }
        }
    }

    public final void e(zzlu zzlu) {
        if (zzlu != null) {
            try {
                zzli zzc = zzlk.zzc();
                zzc.zzo(this.f38159b);
                zzc.zzq(zzlu);
                this.f38160c.a((zzlk) zzc.zzf());
            } catch (Throwable th2) {
                zze.zzm("BillingLogger", "Unable to log.", th2);
            }
        }
    }

    public final void f(zzjz zzjz) {
        if (zzjz != null) {
            try {
                zzli zzc = zzlk.zzc();
                zzc.zzo(this.f38159b);
                zzc.zza(zzjz);
                this.f38160c.a((zzlk) zzc.zzf());
            } catch (Throwable th2) {
                zze.zzm("BillingLogger", "Unable to log.", th2);
            }
        }
    }

    public final void g(zzkd zzkd, int i10) {
        try {
            zzks zzks = (zzks) this.f38159b.zzn();
            zzks.zza(i10);
            this.f38159b = (zzku) zzks.zzf();
            d(zzkd);
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }
}
